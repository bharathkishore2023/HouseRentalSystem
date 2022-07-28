package com.Inimai_Tamizhan;
import java.util.*;
public class Owner {
String locality;
String city;
int squareFeet;
String type;
int rent;
int ownerId;
static HashMap<Integer,Tenant>ListOfTenants=new HashMap<>();
static HashMap<Integer,Integer>AllotedHouse=new HashMap<>();
	public Owner(String locality,String city,int squareFeet,String type,int rent,int ownerId) {
		this.locality=locality;
		this.city=city;
		this.squareFeet=squareFeet;
		this.type=type;
		this.rent=rent;
		this.ownerId=ownerId;
}
	void viewRequest() {
		
	}
	void ownerApproval(int Tenantid,int OwnerId,String location) {
		
	}
}
