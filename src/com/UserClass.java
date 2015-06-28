package com;

import user.ShowUser;


public class UserClass {
	public static void main(String[] args) {
		System.out.println(" Showing User version 5");

		ShowUser name  = new ShowUser();
		System.out.println(" Show my user: "+name.showUser());
	}
}
