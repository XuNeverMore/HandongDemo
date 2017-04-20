package com.handongkeji.impactlib.util;


import android.content.Context;
import android.os.Handler;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.handongkeji.impactlib.R;

public class ToastUtils {

    public static void show(Context context, String info) {

        View view = getTextView(context, info);
        Toast toast = new Toast(context);
        toast.setView(view);
        toast.show();
    }


    /**
     * 无网提示
     * @param context
     */
    public static void showNoNetToast(Context context){
        Toast toast = new Toast(context);
        toast.setView(LayoutInflater.from(context).inflate(R.layout.pop_net_error,null));
        toast.setGravity(Gravity.CENTER,0,0);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.show();
    }

    private static View getTextView(Context context, String info){
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.tv_toast, null);
        TextView tv = (TextView) view.findViewById(R.id.tv_toast);
        tv.setText(info);
        return view;
    }

    public static void show(Context context, String info, final long duration) {
        final Toast toast = Toast.makeText(context, info, Toast.LENGTH_SHORT);
        toast.show();
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                toast.cancel();
            }
        }, duration);
    }

}
