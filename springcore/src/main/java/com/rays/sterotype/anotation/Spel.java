package com.rays.sterotype.anotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("spl")
public class Spel {

	private int x;
	private int y;
	private int z;
	private double w;

	
	public double getW() {
		return w;
	}

	@Value("#{T(java.lang.Math).PI}") /* class ki variable use krne ke liya */
	public void setW(double w) {
		this.w = w;
	}

	public int getZ() {
		return z;
	}

	@Value("#{T(java.lang.Math).sqrt(10)}") /* class ki method ko use krne ka liya */
	public void setZ(int z) {
		this.z = z;
	}

	public int getX() {
		return x;
	}

	@Value("#{10+20}")
	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	@Value("#{11+10 }")
	public void setY(int y) {
		this.y = y;
	}
	
	@Value("#{new java.lang.String('lucky')}")
	private String name;

	@Value("#{8<3}") /* boolean ki tarah use kr skte h */
	private boolean thisActive;


	@Override
	public String toString() {
		return "Spel [x=" + x + ", y=" + y + ", z=" + z + ",name=" + name + ", thisActive=" + thisActive + "]";
	}
}
