package com.example.toastexample;


import android.content.Context;
import android.widget.Toast;

public class toaster {

    public static void simpleToast(Context context, String msg){
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show(); // TOAST MESSAGE
    }
}
