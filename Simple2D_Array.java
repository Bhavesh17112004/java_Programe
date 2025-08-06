package com.bhavesh;

public class Simple2D_Array {
	
	public static void main(String[] args) {
		String[][] chocolateBox= {
				{"Ball1","Ball 2","Ball 3"}, //row 0
				{"Ball4","Ball 5","Ball 6"}, //row 1
				{"Ball7","Ball 7","Ball 8"}, //row 2
		};
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(chocolateBox[i][j]);
			}
			System.out.println();
			//that code use for all 2d array write in single time.
		}
		System.out.println(chocolateBox[1][2]);
		//that line use for particular line and number you want print that time used
		

	}

}
