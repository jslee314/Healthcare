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
    }


//    private fun requestAlam(){
//        val alarmManager =
//            requireContext().getSystemService(Context.ALARM_SERVICE) as? AlarmManager
//        val pendingIntent =
//            PendingIntent.getService(context, requestId, intent,
//                PendingIntent.FLAG_NO_CREATE)
//        if (pendingIntent != null && alarmManager != null) {
//            alarmManager.cancel(pendingIntent)
//        }
//    }

    override fun getViewBinding(): ViewBinding {
        return FragmentFastingBinding.inflate(layoutInflater)
    }
}