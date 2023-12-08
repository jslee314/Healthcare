package com.example.healthcare.ui.fasting

import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.SystemClock
import android.util.Log
import androidx.core.content.ContentProviderCompat.requireContext
import java.util.Date

class CalibrationSchedule(val context: Context) {


    fun setCalibrationSchedule(){
        Log.d("jslee", "start : ${Date(SystemClock.elapsedRealtime())}")
        val currentTime = SystemClock.elapsedRealtime()
        for ((idx, calTime) in getCalTimeList().withIndex()) {
            Log.d("jslee", "calTime : ${calTime}")
            setAlarm(context, currentTime, calTime.cal, idx, calTime.delay)
        }
    }


    /**
     * 1개의 알람등록일때는 상관없지만 여러개의 알람을 등록해야 할때 requstCode를 똑같이 해버리면 가장 늦게 등록된 알람만이 발생하게 되니 주의하자.
     */
    fun setAlarm(context: Context, currentTime: Long, cal: Int, req: Int, delayTime: Long) {
        val alarmManager = context.getSystemService(Context.ALARM_SERVICE) as AlarmManager

        val alarmIntent = Intent(context, AlarmReceiver::class.java).let { intent ->
            intent.putExtra("KEY_REQ_CODE", req)
            intent.putExtra("KEY_CAL_CODE", cal)
            PendingIntent.getBroadcast(context, req, intent, PendingIntent.FLAG_MUTABLE)
        }

        alarmManager.setExactAndAllowWhileIdle(
            AlarmManager.ELAPSED_REALTIME_WAKEUP,
            currentTime + 1000 * delayTime,
            alarmIntent
        )
    }


    fun getCalTimeList(): List<CalTime> {

        val seqList = listOf<Schedule>(
            Schedule(23, 60, 10),
            Schedule(24, 60, 30),
            Schedule(25, 60, 720),

            Schedule(26, 180, 15),
            Schedule(27, 180, 60),
            Schedule(28, 180, 720),

            Schedule(29, 1160, 30),
            Schedule(30, 1160, 90),
            Schedule(31, 1160, 720)
        )

        val calTime = mutableListOf<CalTime>()
        var currentTime = 0L

        val totalTime = seqList[0].time + seqList[3].time + seqList[6].time

        for (time in 1..totalTime) {
            if (currentTime < seqList[0].time) {
                currentTime += seqList[0].cycleTime
                var cal = 1
                if ((currentTime % seqList[0].cycleTime) == 0L) {
                    cal = 1
                }
                if ((currentTime % seqList[1].cycleTime) == 0L) {
                    cal = 2
                }
                if ((currentTime % seqList[2].cycleTime) == 0L) {
                    cal = 3
                }
                calTime.add(CalTime(currentTime, 1, cal))
            } else if (currentTime < seqList[3].time) {
                currentTime += seqList[3].cycleTime
                var cal = 1
                if ((currentTime % seqList[3].cycleTime) == 0L) {
                    cal = 1
                }
                if ((currentTime % seqList[4].cycleTime) == 0L) {
                    cal = 2
                }
                if ((currentTime % seqList[5].cycleTime) == 0L) {
                    cal = 3
                }
                calTime.add(CalTime(currentTime, 2, cal))

            } else if (currentTime < seqList[6].time) {
                currentTime += seqList[6].cycleTime
                var cal = 1
                if ((currentTime % seqList[6].cycleTime) == 0L) {
                    cal = 1
                }
                if ((currentTime % seqList[7].cycleTime) == 0L) {
                    cal = 2
                }
                if ((currentTime % seqList[8].cycleTime) == 0L) {
                    cal = 3
                }
                calTime.add(CalTime(currentTime, 3, cal))

            }

        }
        return calTime

    }
}