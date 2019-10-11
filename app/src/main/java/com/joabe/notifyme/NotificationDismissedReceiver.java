package com.joabe.notifyme;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import androidx.localbroadcastmanager.content.LocalBroadcastManager;

public class NotificationDismissedReceiver extends BroadcastReceiver {

    public NotificationDismissedReceiver() {}

    @Override
    public void onReceive(Context context, Intent intent) {
        Intent intent1 = new Intent(MainActivity.ACTION_CUSTOM_BROADCAST);
        intent1.putExtra("action", "DISABLE");
        LocalBroadcastManager.getInstance(context).sendBroadcast(intent1);
    }
}
