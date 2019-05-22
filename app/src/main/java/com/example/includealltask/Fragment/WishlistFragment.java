package com.example.includealltask.Fragment;

import android.content.Context;
import android.net.Uri;
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
import com.example.includealltask.Adapter.WishlistAdapter;
import com.example.includealltask.Bean.WishlistBean;
import com.example.includealltask.Common;
import com.example.includealltask.R;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class WishlistFragment extends Fragment {
    RecyclerView recyclerView;
    WishlistAdapter wishlistAdapter;
    String TAG;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_wishlist, container, false);

        recyclerView = view.findViewById(R.id.recyclerView);

        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);

        WishlistDataLoad();

        return view;
    }

    private void WishlistDataLoad() {
        final Call<WishlistBean> wishlist = APIClient
                .getapiClient()
                .getapiInterface()
                .getwishlistResponce("Bearer " + Common.header);

        wishlist.enqueue(new Callback<WishlistBean>() {
            @Override
            public void onResponse(Call<WishlistBean> call, Response<WishlistBean> response) {

                if (response.body() == null) {
                    Toast.makeText(getActivity(), "Data Was Not Found", Toast.LENGTH_SHORT).show();

                } else {

                    WishlistBean wishlistBean = response.body();

                    wishlistAdapter = new WishlistAdapter(getActivity(), wishlistBean.getData());

                    recyclerView.setAdapter(wishlistAdapter);
                    Toast.makeText(getActivity(), "" + response.body().getData().size(), Toast.LENGTH_SHORT).show();

                }


            }

            @Override
            public void onFailure(Call<WishlistBean> call, Throwable t) {
                Log.d(TAG, "onFailure: " + t.getMessage());
                Toast.makeText(getActivity(), t.getMessage(), Toast.LENGTH_SHORT).show();

            }
        });
    }


}
