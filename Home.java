package com.ticket;

import java.util.ArrayList;
import java.util.Scanner;

public class Home {
	    static String userName = "HelloJava";
	    static String password = "Ticket";
	    static Scanner in = new Scanner(System.in);
	    static ArrayList<Jira> arraylist = new ArrayList<Jira>();
	    
	    public static void main(String[] args) {
	       Jira j1 = new Jira(1,"magi","sandy","heading 1","todo");
	       Jira j2 = new Jira(2,"santhosh","sabi","heading 2","in progress");
	       Jira j3 = new Jira(3,"priya","Niffy","heading 3","done");

	       arraylist.add(j1);
	       arraylist.add(j2);
	       arraylist.add(j3);

	        System.out.println("***Welcome To Jira_Ticket***");
	        while (true){
	            System.out.println("Choose any operation from the below ops:\n" +
	                    "1. create ticket\n" +
	                    "2.view ticket\n" +
	                    "3.update ticket \n" +
	                    "4. delete ticket\n" +
	                    "" +
	                    "5.logout");
	            System.out.println("Enter the option to perform:");
	            int option = in.nextInt();
	            switch (option){
	                case 1:
	                     HomeHelper.createTicket(in,arraylist);
	                    break;
	                case 2:
	                    HomeHelper.viewTicket(in,arraylist);
	                    break;
	                case 3:
	                    HomeHelper.updateTicket(in,arraylist);
	                    break;
	                case 4:
	                    HomeHelper.deleteTicket(in,arraylist);
	                    break;
	                case 5:
	                    HomeHelper.logout(in,arraylist);
	                    System.exit(0);
	                    break;

	            }
	        }
	    }
}
