package com.ticket;

import java.util.ArrayList;
import java.util.Scanner;

public class HomeHelper {
	  public static void createTicket(Scanner in, ArrayList<Jira> arraylist) {
	        System.out.println("Enter new jira ticket id: ");
	        int id = in.nextInt();

	        System.out.println("Enter the Assigned person name:");
	        String AssigneeName = in.next();

	        System.out.println("Enter the Reporter Name:");
	        String ReporterName = in.next();

	        System.out.println("Enter the heading of the jira:");
	        String Heading = in.next();

	        System.out.println("Enter the Ticket status:");
	        String status = in.next();

	        System.out.println("***Ticket create Successfully***");
	        Jira j1 = new Jira(id,AssigneeName,ReporterName,Heading,status);
	        arraylist.add(j1);



	    }

	    public static void viewTicket(Scanner in, ArrayList<Jira> arraylist) {
	        System.out.println("How to View the ticket:\n" +
	                "1.single ticket \n" +
	                "2.all ticket sorted by id\n" +
	                "3.all ticket sorted by assignee name\n"+"4.all ticket Heading \r\n"
	                +"5. all ticket Status \r\n");
	        int option = in.nextInt();
	        switch (option){
	            case 1:
	                in.next();
	                Module.singleTicket(in,arraylist);
	                break;
	            case 2:
	                in.next();
	                Module.allTicketSortedById(in,arraylist);
	                break;
	            case 3:
	                in.next();
	                Module.allTicketSortedByAssigneeName(in,arraylist);
	                break;
	            case 4:
	                Module.allHeading(in,arraylist);
	                break;
	            case 5:
	                Module.allStatus(in,arraylist);
	                break;
	        }

	    }

	    public static void updateTicket(Scanner in, ArrayList<Jira> arraylist) {
	        System.out.println("How to update ticket:\n" +
	                "1. change Assignee name\n" +
	                "2. change Heading \n" +
	                "3. change Status\n");
	        int option =  in.nextInt();
	        switch (option){
	            case 1:
	                Module.changeAssigneeName(in,arraylist);
	            break;
	            case 2:
	                Module.changeHeading(in,arraylist);
	                break;
	            case 3:
	                Module.changeStatus(in,arraylist);
	                break;

	        }

	    }

	    public static void deleteTicket(Scanner in, ArrayList<Jira> arraylist) {
	        System.out.println("How to delete ticket:\n"+
	                "1.Enter ticket number\n"+
	                "2.all ticket sorted by id\n"+
	                "3.all ticket sorted by assignee name\n");

	        int option = in.nextInt();
	        switch (option){
	            case 1:
	                Module. deleteSingleTicket(in,arraylist);
	                break;
	            case 2:
	                Module.deleteAllTicket(in,arraylist);
	                break;
	        }
	    }

	    public static void logout(Scanner in, ArrayList<Jira> arraylist) {

	        System.out.println("***Thank You for your visit***");
	    }
	}



