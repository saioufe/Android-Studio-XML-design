package com.example.screendesign1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.example.screendesign1.adaptors.CustomGridAdaptor;
import com.example.screendesign1.data.Items;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    GridView gridView;
    List<Items> itemsList = new ArrayList<>();
    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public HomeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }


        itemsList.clear();
        itemsList.add(new Items(R.drawable.ic_shopping_cart_foreground, "Buying"));
        itemsList.add(new Items(R.drawable.ic_shop_foreground, "Selling"));
        itemsList.add(new Items(R.drawable.ic_case_foreground, "Trades"));
        itemsList.add(new Items(R.drawable.ic_video_button_foreground, "Videos"));
        itemsList.add(new Items(R.drawable.ic_deals_foreground, "Deals"));
        itemsList.add(new Items(R.drawable.ic_book_foreground, "Case Study"));

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_home, container, false);
        gridView= v.findViewById(R.id.main_grid_view);
        CustomGridAdaptor customAdapter = new CustomGridAdaptor(getActivity() , R.layout.home_grid_element, itemsList);

        gridView.setAdapter(customAdapter);




        return v;
    }
}