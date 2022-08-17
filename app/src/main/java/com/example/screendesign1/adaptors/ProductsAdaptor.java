package com.example.screendesign1.adaptors;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.screendesign1.R;
import com.example.screendesign1.data.Product;
import com.squareup.picasso.Picasso;

import java.util.List;

public class ProductsAdaptor extends RecyclerView.Adapter<ProductsAdaptor.ViewHolder> {
    private List<Product> products;

    public ProductsAdaptor(List<Product> prods) {
        products = prods;
        Picasso.get().setLoggingEnabled(true);
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout
        View productView = inflater.inflate(R.layout.item_product, parent, false);

        // Return a new holder instance
        ViewHolder viewHolder = new ViewHolder(productView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        // Get the data model based on position
        Product product = products.get(position);

        // Set item views based on your views and data model
        TextView textView = holder.nameTextView;
        textView.setText(product.getName());

        TextView textView2 = holder.priceTextView;
        textView2.setText("$" + product.getPrice());

        TextView textView3 = holder.recomTextView;
        textView3.setText(product.getNumOfRecommandations() + "recommendations");

        ImageView imageView = holder.imageImageView;


        Picasso.get().load(product.getImage()).placeholder(R.drawable.product1).into(imageView);
       // Glide.with(imageView).load(product.getImage()).into(imageView);
    }

    @Override
    public int getItemCount() {
        return products.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView nameTextView;
        public TextView priceTextView;
        public TextView recomTextView;
        public ImageView imageImageView;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            nameTextView = (TextView) itemView.findViewById(R.id.product_title);
            priceTextView = (TextView) itemView.findViewById(R.id.product_price);
            recomTextView = (TextView) itemView.findViewById(R.id.product_rec);
            imageImageView = (ImageView) itemView.findViewById(R.id.product_image);

        }
    }

}
