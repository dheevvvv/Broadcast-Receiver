package com.example.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class CustomReceiver extends BroadcastReceiver {
//    private String ACTION_CUSTOM_BROADCAST = "ACTION_CUSTOM_BROADCAST";
    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.


        String msg = "";
        switch (intent.getAction()){
            case Intent.ACTION_POWER_CONNECTED:
                msg = "the power is connected";
                break;
            case Intent.ACTION_POWER_DISCONNECTED:
                msg = "the power has disconnected";
                break;
            case "ACTION_CUSTOM_BROADCAST":
                msg = intent.getStringExtra("data");
                break;
            default:
                msg = "default message";
                break;
        }
        Toast.makeText(context, msg , Toast.LENGTH_SHORT).show();
    }
}