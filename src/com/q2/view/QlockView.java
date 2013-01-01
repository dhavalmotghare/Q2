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

package com.q2.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.util.AttributeSet;
import android.view.View;

import com.q2.util.Constants;
import com.q2.util.TranslateTime;

/**
 * Main view of the application draws the grid on the screen and sets the characters on or off
 * 
 * @author dhavalmotghare@gmail.com
 *
 */
public class QlockView extends View {

	private boolean [][] on_off = new boolean [10][11];
	private static Paint greyPaint = new Paint();
	private static Paint whitePaint = new Paint();
	private static int TEXT_SIZE = 30;
	private int spacing = 0;
	private int startX, startY;
	
	static{
		greyPaint.setColor(Color.DKGRAY);
		whitePaint.setColor(Color.WHITE);
		greyPaint.setTextSize(TEXT_SIZE);
		whitePaint.setTextSize(TEXT_SIZE);
		greyPaint.setTextAlign(Align.CENTER);
		whitePaint.setTextAlign(Align.CENTER);
	}

	public QlockView(Context context) {
		super(context);
	}
	
	public QlockView(Context context,AttributeSet a) {
		super(context, a);
	}
	
	
	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		
		TranslateTime.translateTime(on_off);
		
		int height = getHeight() - getPaddingTop() - getPaddingBottom();
		int width = getWidth() - getPaddingLeft() - getPaddingRight();


		if(width > 0 || height > 0){
			calculateSpacing(width,height);
			
			float y = startY;
			float x = startX;
			for(int i = 0; i < Constants.CHARACTERS.length;i++){
				x = startX;
				for(int j = 0; j < Constants.CHARACTERS[i].length;j++){
					if(on_off[i][j]){
						drawWhite(Constants.CHARACTERS[i][j], canvas, x, y);
					}else{
						drawGrey(Constants.CHARACTERS[i][j], canvas, x, y);
					}
					x = x + spacing;
				}
				y = y + spacing;
			}
		}
	}
	
	private void calculateSpacing(int width, int height){
		int shortestWidth = (width < height)?width:height;
		if(shortestWidth > 0){
			spacing = shortestWidth / ((width < height)?11:10);
			System.out.println(" spacing " + spacing);
		}
		if(width < height){
			startX = getPaddingLeft() + TEXT_SIZE;
			startY = (height/2) - ((TEXT_SIZE * 10)/2);
		}else{
			startY = getPaddingTop() + TEXT_SIZE;
			startX = (width/2) - ((TEXT_SIZE * 11)/2);
		}
	}
	
	
	private void drawGrey(char c,Canvas canvas,float x,float y){
		canvas.drawText(c + "", x, y, greyPaint);
	}
	
	private void drawWhite(char c,Canvas canvas,float x,float y){
		canvas.drawText(c + "", x, y, whitePaint);
	}

}
