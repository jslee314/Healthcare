package com.example.healthcare.ui.setting

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.viewbinding.ViewBinding
import com.example.healthcare.base.BaseFragment
import com.example.healthcare.databinding.FragmentSettingBinding

class SettingFragment : BaseFragment() {

    private val viewModel : SettingViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val textView: TextView = (binding as FragmentSettingBinding).textNotifications
        viewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }

        super.onViewCreated(view, savedInstanceState)
    }

    override fun getViewBinding(): ViewBinding {
        return FragmentSettingBinding.inflate(layoutInflater)
    }
}