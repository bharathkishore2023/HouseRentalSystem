package com.Inimai_Tamizhan;
import java.util.*;
public class HouseRentSystem {
	public static void main(String[] args) {
		Owner o=new Owner("Kodambakkam","chennai",798,"2BHK",6000,1);
		Approver1 ap=new Approver1();
		ap.Approve(o);
		Owner own=new Owner("Goripalayam","Madurai",560,"1BHK",5500,1);
		ap.Approve(o);
		Owner own1=new Owner("AnnaNagar","chennai",1200,"3BHK",15000,1);
		ap.Approve(o);
		Scanner sc=new Scanner(System.in);
		Admin ad=new Admin();
		boolean overallexit=true;
		while(overallexit) {
		System.out.println("1.Owner \n 2.Admin \n 3.Approver \n 4.Tenant \n");
		int userType=sc.nextInt();
		switch(userType) {
		case 1:
		{
			boolean flag=true;
			while(flag) {
			System.out.println("1.add \n 2.view \n 3.remove \n 4.exit from userType \n");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:{
				System.out.print("Enter the locality: ");
				String locality=sc.next();
				System.out.print("Enter the city: ");
				String city=sc.next();
				System.out.print("Enter the squareFeet: ");
				int squareFeet=sc.nextInt();
				System.out.print("Enter the type: ");
				String type=sc.next();
				System.out.print("Enter the rent: ");
				int rent=sc.nextInt();
				System.out.print("Enter the ownerId: ");
				int ownerId=sc.nextInt();
				Owner o=new Owner(locality,city,squareFeet,type,rent,ownerId);
				ap.Approve(o);
			}
			break;
			case 2:{
				o.view();
			}
				break;
			case 3:
			{
				ad.removeDetails();
				
			}
			break;
			case 4:
			{
				flag=false;
			}
				break;
			}
			}
		}
		break;
		case 2:{
			//owner
			
		}
		break;
		case 3:
		{
			//Tenant
		}
		break;
		case 4:{
			boolean exitTenant=true;
			while(exitTenant) {
			System.out.println("1.enter Details \n 2.send Request \n 3.Exit");
			int choice=sc.nextInt();
			switch(choice) {
			case 1 :{
				System.out.println("Enter your name: ");
				String userName=sc.next();
				System.out.println("Enter your email: ");
				String email=sc.next();
				System.out.println("enter your mobile number: ");
				String mobile=sc.next();
				System.out.println("enter your Aadhaar number: ");
				String Aadhar=sc.next();
				Tenant t=new Tenant(userName,email,mobile,Aadhar);
			}
			break;
			case 2:
			{
				
			}
			}
		}
		}
		break;
		case 5:
		{
			//overAll exit
			overallexit=false;
		}
		break;
		}//switch end
		
	}//loop end
	}
}
