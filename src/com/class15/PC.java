package com.class15;

public class PC {

	String os, brand;
	boolean keyboard, mouse;
	int ram, screen;
	
	void watchMovie() {
		System.out.println("We can watch a movie on a computer");
	}
	void doJavaCoding() {
		System.out.println("We can do Java coding on our computer");
	}
	void playMusic() {
		System.out.println("We can play music on our computer");
	}
	
	public static void main(String[] args) {
		PC pc1=new PC();
		
		pc1.keyboard=true;
		pc1.mouse=true;
		pc1.os="windows";
		pc1.ram=8;
		pc1.screen=2;
		pc1.brand="HP";
		System.out.println("\tThis is for my windows PC. \n\tThese are the things i can do:");
		
		pc1.playMusic();
		pc1.watchMovie();
		pc1.doJavaCoding();
		
		PC pc2=new PC();
		pc2.keyboard=false;
		pc2.mouse=false;
		pc2.os="MAC";
		pc2.ram=16;
		pc2.screen=2;
		pc2.brand="Apple";
		
	}

}

