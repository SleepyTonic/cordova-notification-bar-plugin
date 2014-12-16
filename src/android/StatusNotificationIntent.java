// This class is used on all Androids below Honeycomb
package org.sleepytonic.cordova.plugins.notification;


import android.app.Notification;
import android.app.Notification.Builder;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;

//change this to your application's Java package 
import com.your.app.R;

public class StatusNotificationIntent {
    public static Notification buildNotification( Context context, CharSequence tag, CharSequence contentTitle, CharSequence contentText, int flag ) {
        int icon = R.drawable.notification;
        long when = System.currentTimeMillis();

        //Notification noti = new Notification(icon, contentTitle, when);
        //noti.flags |= flag;
        //http://developer.android.com/reference/android/app/Notification.Builder.html
        //http://stackoverflow.com/questions/18918336/android-notification-remoteserviceexception
        Notification noti = new Notification.Builder(context)
         .setContentTitle(contentTitle)
         .setContentText(contentText)
         .setSmallIcon(R.drawable.notification)
         .build();

         //.setLargeIcon(aBitmap)


        PackageManager pm = context.getPackageManager();
        Intent notificationIntent = pm.getLaunchIntentForPackage(context.getPackageName());
        notificationIntent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        notificationIntent.putExtra("notificationTag", tag);

        PendingIntent contentIntent = PendingIntent.getActivity(context, 0, notificationIntent, 0);
        noti.setLatestEventInfo(context, contentTitle, contentText, contentIntent);
        return noti;
    }
}
