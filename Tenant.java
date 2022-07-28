package com.Inimai_Tamizhan;

import java.util.Scanner;

public class Tenant {
	 String rendorName;
	 String email;
	 String mobile;
	 String Aadhar; 
	int tenantId;
	static int id=1;
	public Tenant(String rendorName,String email,String mobile,String Aadhar) {
		this.rendorName=rendorName;
		this.email=email;
		this.mobile=mobile;
		this.Aadhar=Aadhar;
		 this.tenantId=id++;
	}
	void viewAdvertisement(){
		Admin ad=new Admin();
		ad.showAdvertiseMent();
	}
	void requestHouse(Owner o){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter User Name: ");
		int TenantId=sc.nextInt();
		System.out.println("Enter the Id of the owner of house you need");
		int OwnerId=sc.nextInt();
		System.out.println("Enter the house location");
		String location =sc.next();
		o.ownerApproval(TenantId,OwnerId, location);
	}
}
