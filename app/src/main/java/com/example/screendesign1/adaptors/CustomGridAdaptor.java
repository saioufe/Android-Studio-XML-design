package com.example.screendesign1.adaptors;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.screendesign1.data.Items;
import com.example.screendesign1.R;

import java.util.ArrayList;
import java.util.List;

public class CustomGridAdaptor extends ArrayAdapter<Items> {

        List<Items> items_list = new ArrayList<>();
        int custom_layout_id;

        public CustomGridAdaptor(@NonNull Context context, int resource, @NonNull List<Items> objects) {
            super(context, resource, objects);
            items_list = objects;
            custom_layout_id = resource;


        }



        @Override
        public int getCount() {
            return items_list.size();
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

            View v = convertView;
            if (v == null) {
                // getting reference to the main layout and
                // initializing
                LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                v = inflater.inflate(custom_layout_id, null);
            }

            // initializing the imageview and textview and
            // setting data
            ImageView imageView = v.findViewById(R.id.grid_image);
            TextView textView = v.findViewById(R.id.grid_text);

            // get the item using the position param
            Items item = items_list.get(position);


            imageView.setImageResource(item.getImage_id());
            textView.setText(item.getText());
            return v;
        }
}
