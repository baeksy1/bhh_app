package com.bhh.app.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.bhh.app.R
import com.bhh.app.databinding.FragmentHomeBinding
import com.bhh.app.databinding.FragmentMenuBinding
import com.crepass.crepassApp.application.BaseFragment

class MenuFragment:BaseFragment() {
    override var isBackAvailable: Boolean = false

    private lateinit var binding: FragmentMenuBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= DataBindingUtil.inflate(inflater, R.layout.fragment_menu,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.lifecycleOwner=this

    }



}