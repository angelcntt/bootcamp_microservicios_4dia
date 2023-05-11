package com.nttdata.bootcamp.webfluxdemo.controller;

public class Subscriber {
	public static void print(Integer n) throws InterruptedException {
		
		Thread.sleep(1000);
		System.out.println("Subscriber 1: "+n);
	}
}
