package com.example.includealltask.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.includealltask.Bean.WishlistDataBean;
import com.example.includealltask.R;

import java.util.List;

public class WishlistAdapter extends RecyclerView.Adapter<WishlistAdapter.MyViewHolder> {

    private Context context;
    private List<WishlistDataBean> wishlistDataBeans;

    public WishlistAdapter(Context context, List<WishlistDataBean> wishlistDataBeans) {
        this.context = context;
        this.wishlistDataBeans = wishlistDataBeans;
    }

    @NonNull
    @Override
    public WishlistAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_wishlist_adapter, viewGroup, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull WishlistAdapter.MyViewHolder myViewHolder, int i) {
        myViewHolder.pt_name.setText(wishlistDataBeans.get(i).getProductName());
        myViewHolder.pt_dec.setText(wishlistDataBeans.get(i).getDescription());
        myViewHolder.pt_qaty.setText(String.valueOf(wishlistDataBeans.get(i).getQuantity()));
        myViewHolder.pt_uom.setText(wishlistDataBeans.get(i).getProductUom());
        myViewHolder.pt_price.setText(String.valueOf(wishlistDataBeans.get(i).getSellingPrice()));


        Glide
                .with(context)
                .load(wishlistDataBeans.get(i).getImageUrl())
                .into(myViewHolder.imageview);

    }

    @Override
    public int getItemCount() {
        return wishlistDataBeans.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView pt_name, pt_dec, pt_uom, pt_price, pt_qaty;
        public ImageView imageview;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);


            pt_name = itemView.findViewById(R.id.pt_name);
            pt_dec = itemView.findViewById(R.id.pt_dec);
            pt_uom = itemView.findViewById(R.id.pt_uom);
            pt_qaty = itemView.findViewById(R.id.pt_qaty);
            pt_price = itemView.findViewById(R.id.pt_price);
            imageview = itemView.findViewById(R.id.imageview);

        }

    }
}

