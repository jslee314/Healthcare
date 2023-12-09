package com.example.healthcare.ui.fasting

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.viewbinding.ViewBinding
import com.example.healthcare.base.BaseFragment
import com.example.healthcare.databinding.FragmentFastingBinding

class FastingFragment : BaseFragment() {

    private val viewModel: FastingViewModel by viewModels()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        CalibrationSchedule(requireContext()).setCalibrationSchedule()

    }

    override fun getViewBinding(): ViewBinding {
        return FragmentFastingBinding.inflate(layoutInflater)
    }
}