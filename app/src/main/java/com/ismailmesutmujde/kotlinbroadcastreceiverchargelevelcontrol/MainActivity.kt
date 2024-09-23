package com.ismailmesutmujde.kotlinbroadcastreceiverchargelevelcontrol

import android.content.IntentFilter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private lateinit var chargeLevelDetection : ChargeLevelDetection
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        chargeLevelDetection = ChargeLevelDetection()


    }

    override fun onResume() {
        super.onResume()
        val filter = IntentFilter()
        filter.addAction("android.intent.action.BATTERY_LOW")
        registerReceiver(chargeLevelDetection, filter)
    }

    override fun onStop() {
        super.onStop()
        unregisterReceiver(chargeLevelDetection)
    }
}