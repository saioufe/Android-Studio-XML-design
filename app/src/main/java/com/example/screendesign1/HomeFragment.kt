package com.example.screendesign1

import android.widget.GridView
import com.example.screendesign1.data.Items
import android.os.Bundle
import com.example.screendesign1.HomeFragment
import com.example.screendesign1.R
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.screendesign1.adaptors.CustomGridAdaptor
import java.util.ArrayList

/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment() {
    lateinit var gridView: GridView
    var itemsList: MutableList<Items> = ArrayList()

    // TODO: Rename and change types of parameters
    private var mParam1: String? = null
    private var mParam2: String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (arguments != null) {
            mParam1 = requireArguments().getString(ARG_PARAM1)
            mParam2 = requireArguments().getString(ARG_PARAM2)
        }
        itemsList.clear()
        itemsList.add(Items(R.drawable.ic_shopping_cart_foreground, "Buying"))
        itemsList.add(Items(R.drawable.ic_shop_foreground, "Selling"))
        itemsList.add(Items(R.drawable.ic_case_foreground, "Trades"))
        itemsList.add(Items(R.drawable.ic_video_button_foreground, "Videos"))
        itemsList.add(Items(R.drawable.ic_deals_foreground, "Deals"))
        itemsList.add(Items(R.drawable.ic_book_foreground, "Case Study"))
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v = inflater.inflate(R.layout.fragment_home, container, false)
        gridView = v.findViewById(R.id.main_grid_view)
        val customAdapter = CustomGridAdaptor(requireActivity(), R.layout.home_grid_element, itemsList)
        gridView.setAdapter(customAdapter)
        return v
    }

    companion object {
        // TODO: Rename parameter arguments, choose names that match
        // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
        private const val ARG_PARAM1 = "param1"
        private const val ARG_PARAM2 = "param2"

        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment HomeFragment.
         */
        // TODO: Rename and change types and number of parameters
        fun newInstance(param1: String?, param2: String?): HomeFragment {
            val fragment = HomeFragment()
            val args = Bundle()
            args.putString(ARG_PARAM1, param1)
            args.putString(ARG_PARAM2, param2)
            fragment.arguments = args
            return fragment
        }
    }
}