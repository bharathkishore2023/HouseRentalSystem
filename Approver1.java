package com.Inimai_Tamizhan;
import java.util.*;
public class Approver1 {
	static boolean status=false;
	static HashMap<Integer,Integer>Approved=new HashMap<>();
	static HashMap<Integer,Integer>declined=new HashMap<>();
	static int approvedcount=1;
	static int declinedcount=1;
	void Approve(Owner o){
		if((o.locality!="") && (o.city!="") && (o.squareFeet!=0)
			&& (o.type!="") &&(o.rent!=0)&&(o.ownerId>=1)) {
			Approved.put(approvedcount++,o.ownerId);
		}
		else {
			declined.put(declinedcount++,o.ownerId);
		}
	}
	boolean checkStatus(int id) {
		 boolean status=false;
		if(Approved.containsValue(id))status=true;
		return status;
	}
	void approvedList(Owner o) {
		for(int i=0;i<Approved.size();i++) {
		if(o.ownerId==Approved.get(i)) {
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
	void declinedList(Owner o) {
		for(int i=0;i<declined.size();i++) {
			if(o.ownerId==declined.get(i)) {
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
