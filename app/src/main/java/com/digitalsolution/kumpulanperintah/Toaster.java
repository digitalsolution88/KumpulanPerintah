package com.digitalsolution.kumpulanperintah;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Lenovo on 07/01/2019.
 */

public class Toaster {
    public static void toastmsg(Context c, String message){

        Toast.makeText(c,message,Toast.LENGTH_SHORT).show();

    }
}
