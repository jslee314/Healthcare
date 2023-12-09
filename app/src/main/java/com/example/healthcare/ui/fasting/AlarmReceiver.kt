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

        Toast.makeText(context, "${Date(SystemClock.elapsedRealtime())}", Toast.LENGTH_SHORT).show()

    }
}