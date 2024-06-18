package com.lgy.springex_3_8;

public class Median {
	public void process(int x, int y, int z) {
		if (x>y && x<z || x>z&& x<z) {
			System.out.println("입력된 정수가"+x+"와"+y+"와"+z+"의 중간값은"+x);
		} else if (y>x && y<z || y>z&& y<x){
			System.out.println("입력된 정수가"+x+"와"+y+"와"+z+"의 중간값은"+y);
		} else {
			System.out.println("입력된 정수가"+x+"와"+y+"와"+z+"의 중간값은"+z);
			
		}
	}
}
