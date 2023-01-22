package com.example.fin_tracker.ui

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import android.widget.Button
import android.widget.PopupMenu
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentContainer
import androidx.fragment.app.FragmentController
import com.example.fin_tracker.R

// TODO: Rename parameter arguments, choose names that match
class wallets : Fragment() {
    private lateinit var viewOfLayout: View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_wallets, container, false)

        val nextBtn : Button = view.findViewById(R.id.switch_account)

        return view
        //return inflater.inflate(R.layout.fragment_wallets, container, false)
    }

}