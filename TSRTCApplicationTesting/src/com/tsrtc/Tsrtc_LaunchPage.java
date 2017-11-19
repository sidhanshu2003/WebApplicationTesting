package com.tsrtc;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Tsrtc_LaunchPage {

	public static void main(String[] args) {
		FirefoxDriver Driver = new FirefoxDriver();
		Driver.get("http://www.tsrtconline.in/oprs-web/");
		System.out.println(Driver.getCurrentUrl());
		System.out.println(Driver.getTitle());
	}

}
