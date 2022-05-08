package com.gl.dsaproject.model;

import java.util.ArrayDeque;
import java.util.Queue;


public class BuildSkyscraper {
	
	static Queue<Integer> stack = new ArrayDeque<Integer>();
	static int count = 1;
	static int total ;

	static void calculateFloorPerDay(int totalFloor, Queue<Integer> floorsPerDay) {
		int floor = floorsPerDay.poll();
		if(floor == total) {
			System.out.print(total+" ");
			--total;
			while(!stack.isEmpty() && stack.contains(total)) {
				calculateFloorPerDay(total, stack);
			}
		} else {
			stack.add(floor);
		}
	}



	public void buildSkyscraper(int totalFloor, Queue<Integer> floorsPerDay) {
		total = totalFloor;
		while(count <= totalFloor) {
			System.out.println("DAY: "+count++);
			calculateFloorPerDay(totalFloor, floorsPerDay);
			System.out.println();
		}
	}






	

}
