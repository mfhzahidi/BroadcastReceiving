package au.com.nextdot.broadcastreceiving;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("here","here");
        Toast.makeText(context,"broadcasting",Toast.LENGTH_LONG).show();
    }
}
