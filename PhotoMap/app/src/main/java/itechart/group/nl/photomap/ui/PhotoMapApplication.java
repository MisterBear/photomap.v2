package itechart.group.nl.photomap.ui;

import android.app.Application;
import android.content.Context;

public class PhotoMapApplication extends Application {
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }

    public static Context getContext() {
        return context;
    }
}
