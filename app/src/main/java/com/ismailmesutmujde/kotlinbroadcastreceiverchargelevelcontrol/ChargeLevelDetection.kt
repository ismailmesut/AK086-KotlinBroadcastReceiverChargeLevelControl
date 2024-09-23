package com.ismailmesutmujde.kotlinbroadcastreceiverchargelevelcontrol

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class ChargeLevelDetection : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        Toast.makeText(context,"Your battery is almost running out :(", Toast.LENGTH_SHORT).show()
    }
}