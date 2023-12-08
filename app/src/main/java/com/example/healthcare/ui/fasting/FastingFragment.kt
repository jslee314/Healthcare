package com.example.healthcare.ui.fasting

import android.os.Bundle
import android.os.SystemClock
import android.util.Log
import android.view.View
import androidx.fragment.app.viewModels
import androidx.viewbinding.ViewBinding
import com.example.healthcare.base.BaseFragment
import com.example.healthcare.databinding.FragmentFastingBinding
import java.util.Date

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

data class CalTime(val delay: Long, val analysis: Int, val cal: Int)
data class Schedule(val seq: Int, val time: Int, val cycleTime: Int)