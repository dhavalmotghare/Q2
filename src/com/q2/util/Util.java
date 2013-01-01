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

/**
 * Utility class for the application, for now it contains only methods to set the characters on or off
 * 
 * @author dhavalmotghare@gmail.com
 *
 */
public class Util {
	
	public static void switchOnOne(boolean [][] on_off){
		on_off[5][0] = on_off[5][1] = on_off[5][2] = true;
	}
	
	public static void switchOnTwo(boolean [][] on_off){
		on_off[6][8] = on_off[6][9] = on_off[6][10] = true;
	}
	
	public static void switchOnThree(boolean [][] on_off){
		on_off[5][6] = on_off[5][7] = on_off[5][8] = on_off[5][9] = on_off[5][10] = true;
	}
	
	public static void switchOnFour(boolean [][] on_off){
		on_off[6][0] = on_off[6][1] = on_off[6][2] = on_off[6][3] = true;
	}
	
	public static void switchOnFive(boolean [][] on_off){
		on_off[6][4] = on_off[6][5] = on_off[6][6] = on_off[6][7] = true;
	}
	
	public static void switchOnUpperFive(boolean [][] on_off){
		on_off[2][6] = on_off[2][7] = on_off[2][8] = on_off[2][9] = true;
	}
	
	public static void switchOnSix(boolean [][] on_off){
		on_off[5][3] = on_off[5][4] = on_off[5][5] = true;
	}
	
	public static void switchOnSeven(boolean [][] on_off){
		on_off[8][0] = on_off[8][1] = on_off[8][2] = on_off[8][3] = on_off[8][4] = true;
	}

	public static void switchOnEight(boolean [][] on_off){
		on_off[7][0] = on_off[7][1] = on_off[7][2] = on_off[7][3] = on_off[7][4] = true;
	}
	
	public static void switchOnNine(boolean [][] on_off){
		on_off[4][7] = on_off[4][8] = on_off[4][9] = on_off[4][10] = true;
	}
	
	public static void switchOnTen(boolean [][] on_off){
		on_off[9][0] = on_off[9][1] = on_off[9][2] = true;
	}
	
	public static void switchOnUpperTen(boolean [][] on_off){
		on_off[3][5] = on_off[3][6] = on_off[3][7] = true;
	}
	
	public static void switchOnEleven(boolean [][] on_off){
		on_off[7][5] = on_off[7][6] = on_off[7][7] = on_off[7][8] = on_off[7][9] = on_off[7][10] =  true;
	}
	
	public static void switchOnTwelve(boolean [][] on_off){
		on_off[8][5] = on_off[8][6] = on_off[8][7] = on_off[8][8] = on_off[8][9] = on_off[8][10] = true;
	}
	
	public static void switchOnOClock(boolean [][] on_off){
		on_off[9][5] = on_off[9][6] = on_off[9][7]  = on_off[9][8] = on_off[9][9] = on_off[9][10] = true;
	}
	
	public static void switchOnPast(boolean [][] on_off){
		on_off[4][0] = on_off[4][1] = on_off[4][2] = on_off[4][3] = true;
	}
	
	public static void switchOnTo(boolean [][] on_off){
		on_off[3][9] = on_off[3][10] = true;
	}
	
	public static void switchOnHalf(boolean [][] on_off){
		on_off[3][0] = on_off[3][1] = on_off[3][2] = on_off[3][3] = true;
	}
	
	public static void switchOnTwenty(boolean [][] on_off){
		on_off[2][0] = on_off[2][1] = on_off[2][2] = on_off[2][3] = on_off[2][4] = on_off[2][5]  = true;
	}
	
	public static void switchOnTwentyFive(boolean [][] on_off){
		on_off[2][0] = on_off[2][1] = on_off[2][2] = on_off[2][3] = on_off[2][4] = on_off[2][5] = on_off[2][6] = on_off[2][7] = on_off[2][8] = on_off[2][9] = true;
	}
	
	public static void switchOnQuarter(boolean [][] on_off){
		on_off[1][2] = on_off[1][3] = on_off[1][4] = on_off[1][5] = on_off[1][6] = on_off[1][7] = on_off[1][8] = true;
	}
	
	public static void switchOnIt(boolean [][] on_off){
		on_off[0][0] = on_off[0][1] = true;
	}
	
	public static void switchOnA(boolean [][] on_off){
		on_off[1][0] = true;
	}
	
	public static void switchOnIs(boolean [][] on_off){
		on_off[0][3] = on_off[0][4] = true;
	}
	
	public static void switchOnTime(boolean [][] on_off){
		on_off[0][7] = on_off[0][8] = on_off[0][8] =  on_off[0][10] = true;
	}
	
	public static void switchEverythingOff(boolean [][] on_off){
		for(int i = 0; i < on_off.length;i++){
			for(int j = 0; j < on_off[i].length;j++){
				on_off[i][j] = false;
			}
		}
	}
}
