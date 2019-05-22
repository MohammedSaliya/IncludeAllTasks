package com.example.includealltask.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.includealltask.APIClasss.APIClient;
import com.example.includealltask.Adapter.OrderAdapter;
import com.example.includealltask.Bean.OrderBean;
import com.example.includealltask.Common;
import com.example.includealltask.R;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class OrderFragment extends Fragment {

    RecyclerView recyclerview;
    OrderAdapter orderAdapter;
    String TAG = "fd";


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_order, container, false);

        recyclerview = view.findViewById(R.id.recyclerview);

        recyclerview.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerview.setLayoutManager(layoutManager);

        LoadData();

        return view;
    }

    private void LoadData() {
        Log.d(TAG, "LoadData: ");

        Call<OrderBean> listCall = APIClient
                .getapiClient()
                .getapiInterface()
                .getOrderResponce("Bearer " + Common.header);

        listCall.enqueue(new Callback<OrderBean>() {
            @Override
            public void onResponse(Call<OrderBean> call, Response<OrderBean> response) {
                int i = 0;
                if (response.body() == null) {
                    Toast.makeText(getActivity(), "Data was not Found", Toast.LENGTH_SHORT).show();

                } else {
                    OrderBean orderBean = response.body();

                    orderAdapter = new OrderAdapter(getActivity(), orderBean.getData());

                    recyclerview.setAdapter(orderAdapter);
                    Toast.makeText(getActivity(), "" + response.body().getData().size(), Toast.LENGTH_SHORT).show();
                }

            }

            @Override
            public void onFailure(Call<OrderBean> call, Throwable t) {
                Log.d(TAG, "onFailure: " + t.getMessage());
                Toast.makeText(getActivity(), t.getMessage(), Toast.LENGTH_SHORT).show();

            }
        });

    }


}
