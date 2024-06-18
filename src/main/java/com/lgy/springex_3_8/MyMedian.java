package com.lgy.springex_3_8;

public class MyMedian {
	int x,y,z;
	Median median;
	
	public void pc() {
		median.process(x, y, z);
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	public Median getMedian() {
		return median;
	}
	public void setMedian(Median median) {
		this.median = median;
	}
	
	
}
