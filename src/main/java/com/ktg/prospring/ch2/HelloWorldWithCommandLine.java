package com.ktg.prospring.ch2;

public class HelloWorldWithCommandLine {

	public static void main1(String[] args) {
		if(args.length > 0) {
			System.out.println(args[0]);
		} else {
			System.out.println("Hello World!");
		}
	}

}
