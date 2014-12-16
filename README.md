# StatusBarNotification plugin for Cordova #
This project has been forked from https://github.com/phonegap/phonegap-plugins/blob/DEPRECATED/Android/StatusBarNotification.

This plugin allows you to display notifications in the status bar from your Cordova application. On Android you have to explicitly add things to the status bar (as opposed to iOS where push notifications automatically get displayed in the UI). The Android status bar is the UI component at the top of the screen that has a bunch of little icons. You can also drag the status bar down to view a list of notifications.

## Setup ##

1) Install the plugin:

    cordova plugin add https://github.com/SleepyTonic/cordova-notification-bar-plugin.git

2) Update the package import `import com.your.app.R` in StatusNotificationIntent.java to your android app package.

3) Copy notification icons from the plugin's resource/android folder to the android app res folder:

    resources/android/drawable-hdpi/
    resources/android/drawable-mdpi/
    resources/android/drawable-xhdpi/


## Using the plugin ##

The plugin creates the object `window.plugins.statusBarNotification`.

Sample use:

    window.plugins.statusBarNotification.notify("Put your title here", "Put your message here");
