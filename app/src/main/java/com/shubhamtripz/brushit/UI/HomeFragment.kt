package com.shubhamtripz.brushit.UI

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.constraintlayout.widget.ConstraintLayout
import com.shubhamtripz.brushit.R
import com.shubhamtripz.brushit.TshirtOrderActivity


class HomeFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        val rooted: LinearLayout = view.findViewById(R.id.refbtn)

        rooted.setOnClickListener {
            val fragment = ReferFragment()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.fragmentContainerView, fragment)?.commit()

        }

        val off: LinearLayout = view.findViewById(R.id.offbtn)

        off.setOnClickListener {
            val fragment = OffFragment()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.fragmentContainerView, fragment)?.commit()

        }

        val cop: LinearLayout = view.findViewById(R.id.couponbtn)

        cop.setOnClickListener {
            val fragment = CouponsFragment()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.fragmentContainerView, fragment)?.commit()

        }

        val shirt: ConstraintLayout = view.findViewById(R.id.tshirtbtn)

        shirt.setOnClickListener {
            val intent = Intent(requireContext(), TshirtOrderActivity::class.java)
            startActivity(intent)
        }

        return view
    }

}