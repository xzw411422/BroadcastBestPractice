package iphone.com.broadcastbestpractice;

import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.WindowManager;

/**
 * Created by xzw12 on  0023.
 */
public class ForceOfflineReceiver extends BroadcastReceiver {


    @Override
    public void onReceive(final Context context, Intent intent) {
        final AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(context);
        dialogBuilder.setTitle("Warning");
        dialogBuilder.setMessage("你被强制下线，请重新登录");
        dialogBuilder.setCancelable(false);
        dialogBuilder.setPositiveButton("确认", new DialogInterface.OnClickListener() {
            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                ActivityCollector.finshAll();
//                Intent intent = new Intent(MyApplication.getContext(),LoginActivity.class);
////                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                MyApplication.getContext().startActivity(intent);
//            }
            //     });
//        AlertDialog alertDialog = dialogBuilder.create();
//        alertDialog.getWindow().setType(WindowManager.LayoutParams.TYPE_SYSTEM_ALERT);
//        alertDialog.show();
            //      dialogBuilder.show();
            // }


            public void onClick(DialogInterface dialog, int which) {
                ActivityCollector.finshAll();
                Intent intent1 = new Intent(context, LoginActivity.class);
                intent1.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent1);

            }
        });
        AlertDialog alertDialog=dialogBuilder.create();
        alertDialog.getWindow().setType(WindowManager.LayoutParams.TYPE_SYSTEM_ALERT);
        alertDialog.show();
    }
}
