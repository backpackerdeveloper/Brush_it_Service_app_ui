package com.shubhamtripz.brushit.UI

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.firebase.auth.FirebaseAuth
import com.shubhamtripz.brushit.LoginActivity
import com.shubhamtripz.brushit.R
import kotlinx.android.synthetic.main.fragment_profile.*


class ProfileFragment : Fragment() {

    lateinit var firebaseAuth: FirebaseAuth

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_profile, container, false)


        firebaseAuth = FirebaseAuth.getInstance()
        txtEmail?.text = firebaseAuth.currentUser?.email


        val btnout: Button = view.findViewById(R.id.btnlogout)

        btnout.setOnClickListener {
            FirebaseAuth.getInstance().signOut()
            val intent = Intent(requireContext(), LoginActivity::class.java)
            startActivity(intent)

        }

        val cowp: ConstraintLayout = view.findViewById(R.id.myorderbtn)

        cowp.setOnClickListener {
            val fragment = BookingsFragment()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.fragmentContainerView, fragment)?.commit()

        }

        val covoubtn: ConstraintLayout = view.findViewById(R.id.offerbtne)

        covoubtn.setOnClickListener {
            val fragment = CouponsFragment()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.fragmentContainerView, fragment)?.commit()

        }



        return view
    }


}