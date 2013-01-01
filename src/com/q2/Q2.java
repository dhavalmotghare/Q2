/*
 * Copyright (C) 2012 dhavalmotghare
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.q2;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.Menu;
import android.view.Window;

import com.q2.view.QlockView;

/**
 * Main and the only activity for this application. Q2 is basically a software implementation for the
 * hardware clock created by BIEGERT & FUNK - http://www.qlocktwo.com
 * 
 * @author dhavalmotghare@gmail.com
 *
 */
public class Q2 extends Activity {

	/** Reference to the clock view */
	private QlockView view = null;
	/** Time filter for listening to clock ticks */
	private static IntentFilter timefilter = new IntentFilter();
	
	static {
		timefilter.addAction(Intent.ACTION_TIME_TICK);
    }
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.main_layout);
        view = (QlockView)findViewById(R.id.clock_view);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_layout, menu);
        return true;
    }
    
    @Override
    protected void onStart() {
    	super.onStart();
        registerReceiver(timeChangedReceiver, timefilter);     
    }
    
    @Override
    protected void onDestroy() {
    	super.onDestroy();
    	unregisterReceiver(timeChangedReceiver);
    }
    
    /**
     * Broadcast receiver to listen for clock ticks
     */
    private final BroadcastReceiver timeChangedReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            final String action = intent.getAction();

            if (action.equals(Intent.ACTION_TIME_TICK)){
            	view.invalidate();
            }
        }
    };
}
