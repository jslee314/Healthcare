package com.example.healthcare.ui.fasting

import android.annotation.SuppressLint
import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.SystemClock
import android.util.Log
import java.util.Date

class CalibrationSchedule(private val context: Context) {

    fun setCalibrationSchedule() {
        Log.d("jslee", "start : ${Date(SystemClock.elapsedRealtime())}")
        setAlarm(context, 10)
    }

    /**
     * 1개의 알람등록일때는 상관없지만 여러개의 알람을 등록해야 할때 requstCode를 똑같이 해버리면 가장 늦게 등록된 알람만이 발생하게 되니 주의하자.
     */
    @SuppressLint("ScheduleExactAlarm")
    fun setAlarm(context: Context, fastingTime: Long) {
        val alarmManager = context.getSystemService(Context.ALARM_SERVICE) as AlarmManager

        val alarmIntent = Intent(context, AlarmReceiver::class.java).let { intent ->
            PendingIntent.getBroadcast(context, 0, intent, PendingIntent.FLAG_MUTABLE)
        }

        alarmManager.setExactAndAllowWhileIdle(
            AlarmManager.ELAPSED_REALTIME_WAKEUP,
            SystemClock.elapsedRealtime() + 1000 * fastingTime,
            alarmIntent
        )
    }

}