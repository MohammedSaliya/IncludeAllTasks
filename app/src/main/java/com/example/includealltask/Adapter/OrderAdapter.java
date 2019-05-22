package com.example.includealltask.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.includealltask.Bean.OrderDataBean;
import com.example.includealltask.R;

import java.util.List;

public class OrderAdapter extends RecyclerView.Adapter<OrderAdapter.GetViewHolder> {

    private Context context;
    private List<OrderDataBean> basketData;


    public OrderAdapter(Context context, List<OrderDataBean> basketData) {
        this.context = context;
        this.basketData = basketData;
    }

    @NonNull
    @Override
    public OrderAdapter.GetViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.view_adapter, viewGroup, false);
        return new GetViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull OrderAdapter.GetViewHolder getViewHolder, int i) {
        getViewHolder.pt_name.setText(basketData.get(i).getProductName());
        getViewHolder.pt_payment_mode.setText(basketData.get(i).getPaymentMode());
        getViewHolder.pt_uom.setText(basketData.get(i).getProductUom());
        getViewHolder.pt_qaty.setText(String.valueOf(basketData.get(i).getQuantity()));
        getViewHolder.pt_price.setText(String.valueOf(basketData.get(i).getSellingPrice()));

        Glide
                .with(context)
                .load(basketData.get(i).getProductUrl())
                .into(getViewHolder.imageview);


    }

    @Override
    public int getItemCount() {
        return basketData.size();
    }

    public class GetViewHolder extends RecyclerView.ViewHolder {
        public TextView pt_name, pt_payment_mode, pt_uom, pt_price, pt_qaty;
        public ImageView imageview;


        public GetViewHolder(@NonNull View itemView) {
            super(itemView);


            pt_name = itemView.findViewById(R.id.pt_name);
            pt_payment_mode = itemView.findViewById(R.id.pt_payment_mode);
            pt_uom = itemView.findViewById(R.id.pt_uom);
            pt_qaty=itemView.findViewById(R.id.pt_qaty);
            pt_price = itemView.findViewById(R.id.pt_price);
            imageview = itemView.findViewById(R.id.imageview);

        }
    }
}
