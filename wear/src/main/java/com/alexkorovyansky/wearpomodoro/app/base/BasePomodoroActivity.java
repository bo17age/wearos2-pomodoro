/*
 * Copyright (C) 2014 Alex Korovyansky.
 */
package com.alexkorovyansky.wearpomodoro.app.base;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.alexkorovyansky.wearpomodoro.R;

import butterknife.ButterKnife;
import butterknife.Unbinder;
import hugo.weaving.DebugLog;

public class BasePomodoroActivity extends Activity {
    private Unbinder unbinder;

    @DebugLog
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
