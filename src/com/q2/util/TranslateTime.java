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

package com.q2.util;

import android.text.format.Time;

/**
 * Translate the system time to what characters should light on the grid
 * 
 * @author dhavalmotghare@gmail.com
 *
 */
public class TranslateTime {

	/**
	 * Set the boolean array according to the time so that proper characters light up
	 * 
	 * @param on_off
	 */
	public static void translateTime(boolean [][] on_off){
		Time now = getTime();
		int hour = now.hour;
		int minutes = now.minute;
		
		Util.switchEverythingOff(on_off);
		
		Util.switchOnIt(on_off);
		Util.switchOnIs(on_off);
		
		hour = (hour > 12)?hour - 12:hour;
		
		if(minutes >= 0 && minutes <= 4){
			setHour(hour,on_off);
			Util.switchOnOClock(on_off);
		}else { 
			if(minutes < 35){
				Util.switchOnPast(on_off);
				setHour(hour,on_off);
				translateLessThanThirtyMins(minutes, on_off);
			}else{
				Util.switchOnTo(on_off);
				setHour(((hour + 1) % 13), on_off);
				translateMoreThanThirtyMins(minutes,on_off);
			}
		}
		
	}
	
	/**
	 * Translate the minutes to appropriate characters. This is used when minutes are less than 35
	 * 
	 * @param minutes
	 * @param on_off
	 */
	private static void translateLessThanThirtyMins(final int minutes,boolean [][] on_off){
		
		if(minutes >= 5 && minutes <= 9){
			Util.switchOnUpperFive(on_off);
		}else if(minutes >= 10 && minutes <= 14){
			Util.switchOnUpperTen(on_off);
		}else if(minutes >= 15 && minutes <= 19){
			Util.switchOnA(on_off);
			Util.switchOnQuarter(on_off);
		}else if(minutes >= 20 && minutes <= 24){
			Util.switchOnTwenty(on_off);
		}else if(minutes >= 25 && minutes <= 29){
			Util.switchOnTwentyFive(on_off);
		}else if(minutes >= 30 && minutes <= 34){
			Util.switchOnHalf(on_off);
		}
		
	}
	
	/**
	 * Translate the minutes to appropriate characters. This is used when minutes are more than 35
	 *
	 * @param minutes
	 * @param on_off
	 */
	private static void translateMoreThanThirtyMins(final int minutes,boolean [][] on_off){
		
		if(minutes >= 35 && minutes <= 39){
			Util.switchOnTwentyFive(on_off);
		}else if(minutes >= 40 && minutes <= 44){
			Util.switchOnTwenty(on_off);
		}else if(minutes >= 45 && minutes <= 49){
			Util.switchOnA(on_off);
			Util.switchOnQuarter(on_off);
		}else if(minutes >= 50 && minutes <= 54){
			Util.switchOnUpperTen(on_off);
		}else if(minutes >= 55 && minutes <= 59){
			Util.switchOnUpperFive(on_off);
		}
		
	}


	/**
	 * Set the appropriate characters for the hour of the day
	 * 
	 * @param hour
	 * @param on_off
	 */
	private static void setHour(final int hour,boolean [][] on_off){
		switch(hour){
		case 1:
			Util.switchOnOne(on_off);
			break;
		case 2:
			Util.switchOnTwo(on_off);
			break;
		case 3:
			Util.switchOnThree(on_off);
			break;
		case 4:
			Util.switchOnFour(on_off);
			break;
		case 5:
			Util.switchOnFive(on_off);
			break;
		case 6:
			Util.switchOnSix(on_off);
			break;
		case 7:
			Util.switchOnSeven(on_off);
			break;
		case 8:
			Util.switchOnEight(on_off);
			break;
		case 9:
			Util.switchOnNine(on_off);
			break;
		case 10:
			Util.switchOnTen(on_off);
			break;
		case 11:
			Util.switchOnEleven(on_off);
			break;
		case 12:
			Util.switchOnTwelve(on_off);
			break;
		}
	}
	
	/**
	 * Get the current time
	 * 
	 * @return Time
	 */
	private static Time getTime(){
		Time now = new Time();
		now.setToNow();
		return now;
	}
}
