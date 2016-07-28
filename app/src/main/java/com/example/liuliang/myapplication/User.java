package com.example.liuliang.myapplication;

import android.content.Context;

/**
 * Created by liuliang on 2016/7/28.
 */
public class User {
    public static User mUser;
    private Context mC;

    public User(Context context){
        mC = context;
    }

    public static User getInstance(Context context){
        if(mUser==null){
            synchronized(User.class){
                if(mUser==null){
                    mUser = new User(context);//Here is a memory leak.It`s should content.getApplicationContext().
                }
            }
        }
        return mUser;
    }
}
