package com.example.healthcare.ui.fasting

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.SystemClock
import android.util.Log
import android.widget.Toast
import java.util.Date

class AlarmReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {

        intent.extras?.let {
            val reqCode = intent.extras?.getInt("KEY_REQ_CODE")
            val cal = intent.extras?.getInt("KEY_CAL_CODE")

            Toast.makeText(context, "$reqCode : cal : $cal : ${Date(SystemClock.elapsedRealtime())}", Toast.LENGTH_SHORT).show()

            if (cal == 1) {
                Log.d("jslee", "$reqCode :cal 1 !! : ${Date(SystemClock.elapsedRealtime())}")

            }
            if (cal == 2) {
                Log.d("jslee", "$reqCode :cal 2 !! : ${Date(SystemClock.elapsedRealtime())}")
            }
            if (cal == 3) {
                Log.d("jslee", "$reqCode :cal 3 !! : ${Date(SystemClock.elapsedRealtime())}")
            }

        }

    }
}