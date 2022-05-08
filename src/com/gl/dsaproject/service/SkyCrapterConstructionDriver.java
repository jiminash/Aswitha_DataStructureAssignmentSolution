package com.gl.dsaproject.service;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

import com.gl.dsaproject.model.BuildSkyscraper;

public class SkyCrapterConstructionDriver {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		BuildSkyscraper build = new BuildSkyscraper();
		System.out.println("Enter the total number of floors in the building: ");
		int totalFloor = sc.nextInt();
		int count = 0;
		Queue<Integer> floorsPerDay = new ArrayDeque<Integer>();

		while(count < totalFloor) {

			System.out.println("Enter the floor size delivered on day "+ ++count);
			int floor = sc.nextInt();
			if(floor > totalFloor) {
				--count;
				continue;
			}
			floorsPerDay.add(floor);
		}

		build.buildSkyscraper(totalFloor, floorsPerDay);

	}

	}
