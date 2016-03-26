package iphone.com.broadcastbestpractice;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by xzw12 on  0023.
 */
public class BaseActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        ActivityCollector.addActivity(this);

    }
    protected void onDestory(){
        super.onDestroy();
        ActivityCollector.removeActivity(this);
    }

}
