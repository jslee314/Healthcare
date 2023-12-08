package com.example.healthcare.ui.myPage

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.viewbinding.ViewBinding
import com.example.healthcare.base.BaseFragment
import com.example.healthcare.databinding.FragmentMyPageBinding

class MyPageFragment : BaseFragment() {

    private val viewModel : MyPageViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        super.onViewCreated(view, savedInstanceState)
    }

    override fun getViewBinding(): ViewBinding {
        return FragmentMyPageBinding.inflate(layoutInflater)
    }
}