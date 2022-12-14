package com.example.screendesign1

import com.example.screendesign1.data.Product.Companion.createProductsList
import com.example.screendesign1.data.Product
import android.os.Bundle
import android.util.Log
import com.example.screendesign1.FeedFragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.screendesign1.R
import androidx.recyclerview.widget.RecyclerView
import com.example.screendesign1.adaptors.ProductsAdaptor
import androidx.recyclerview.widget.LinearLayoutManager
import java.util.ArrayList

/**
 * A simple [Fragment] subclass.
 * Use the [FeedFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class FeedFragment : Fragment() {
    var products: ArrayList<Product>? = null

    // TODO: Rename and change types of parameters
    private var mParam1: String? = null
    private var mParam2: String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (arguments != null) {
            mParam1 = arguments!!.getString(ARG_PARAM1)
            mParam2 = arguments!!.getString(ARG_PARAM2)
        }
        products = createProductsList(10)
        Log.d("saioufe", "num of items in onCreate() : " + products!!.size)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v = inflater.inflate(R.layout.fragment_feed, container, false)
        // Lookup the recyclerview in activity layout
        val rvProducts = v.findViewById<View>(R.id.feed_recycler) as RecyclerView

        // Create adapter passing in the sample user data
        val adapter = ProductsAdaptor(products!!)
        // Attach the adapter to the recyclerview to populate items
        rvProducts.adapter = adapter
        // Set layout manager to position the items
        rvProducts.layoutManager = LinearLayoutManager(container!!.context)
        // That's all!
        Log.d("saioufe", "num of items in onCreateView() : " + products!!.size)
        // Inflate the layout for this fragment
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
         * @return A new instance of fragment FeedFragment.
         */
        // TODO: Rename and change types and number of parameters
        fun newInstance(param1: String?, param2: String?): FeedFragment {
            val fragment = FeedFragment()
            val args = Bundle()
            args.putString(ARG_PARAM1, param1)
            args.putString(ARG_PARAM2, param2)
            fragment.arguments = args
            return fragment
        }
    }
}