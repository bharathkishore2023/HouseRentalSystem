package com.Inimai_Tamizhan;

import java.util.HashMap;
import java.util.Scanner;
public class Admin {
	static HashMap<Integer,Owner>rentDetails=new HashMap<Integer,Owner>();
	static HashMap<Integer,Integer>advertiseDetails=new HashMap<>();
	static int id=1;
	static int advertiseCount=1;
public void addToList(Owner o) {
	rentDetails.put(id++,o);
}
public void viewDetails() {
	for(Owner o:rentDetails.values()) {
		System.out.println("OwnerId: "+o.ownerId);
		System.out.println("Locality: "+o.locality);
		System.out.println("city: "+o.city);
		System.out.println("squareFeet: "+o.squareFeet);
		System.out.println("Type: "+o.type);
		System.out.println("rent: "+o.rent+" /month");
		System.out.println("=======================================================");
	}}
	public void addAdvertisement(int advId) {
		Approver1 ap=new Approver1();
		if(ap.checkStatus(id))advertiseDetails.put(advertiseCount++,advId);
	}
		void showAdvertiseMent() {
		for(int i=0;i<advertiseDetails.size();i++) {
		for(Owner o:rentDetails.values()) {
			if(advertiseDetails.containsValue(o.ownerId)) {
			System.out.println("OwnerId: "+o.ownerId);
			System.out.println("Locality: "+o.locality);
			System.out.println("city: "+o.city);
			System.out.println("squareFeet: "+o.squareFeet);
			System.out.println("Type: "+o.type);
			System.out.println("rent: "+o.rent+" /month");
			System.out.println("=======================================================");
		}
		}
		}
	}
	void removeAdvertisement() {
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		advertiseDetails.remove(id);
		System.out.println("the requested details removed from advertisement successfully");

	}
	
}
