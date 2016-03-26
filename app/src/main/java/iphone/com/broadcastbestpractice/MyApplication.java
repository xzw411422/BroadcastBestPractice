package iphone.com.broadcastbestpractice;

import android.app.Application;
import android.content.Context;

/**
 * Created by xzw12 on  0024.
 */
public class MyApplication extends Application {
    private static Context context;
    public void onCreate(){
        context=getApplicationContext();
    }
    public static Context getContext(){
        return context;
    }
}
