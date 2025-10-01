package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.clear();
		StdDraw.setCanvasSize(2200/2,1600/2);
		 StdDraw.setXscale(0, 22);
   		StdDraw.setYscale(0, 16);
   	
	
   		StdDraw.setPenColor(0, 70, 100);
   		StdDraw.filledRectangle(11, 8, 11, 8);
		StdDraw.setPenColor(255, 126, 0);
   		 StdDraw.filledCircle(11, 8, 5	);
		 StdDraw.setPenColor(255, 166, 0);
   		 StdDraw.filledCircle(11, 8, 4);
		  StdDraw.setPenColor(255, 206, 0);
   		 StdDraw.filledCircle(11, 8, 3);
		  StdDraw.setPenColor(255, 255, 0);
   		 StdDraw.filledCircle(11, 8, 2);
    }
	}
