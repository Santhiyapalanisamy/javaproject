package com.ticket;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Module {
	public static void singleTicket(Scanner in, ArrayList<Jira> arrayList) {

        System.out.println("Enter ticket id:");
        int id = in.nextInt();
        Iterator<Jira> itr = arrayList.iterator();
        Jira j = null;
        while (itr.hasNext()) {
            j = itr.next();
            if (j.getId() == id) {
                System.out.println("Ticket ID =" + j.getId()+" " + "Ticket Assignee= " + j.getAssigneeName()+
                        " "+"Reporter_name="+j.getReporterName()+" "+"Heading="+j.getHeading()+" "+
                        "Status="+j.getStatus());
                break;
            }
        }


    }

    public static void allTicketSortedById(Scanner in, ArrayList<Jira> arrayList) {
        Iterator<Jira> itr = arrayList.iterator();
        Jira j = null;
        while (itr.hasNext()) {
            j = itr.next();
            System.out.println("Ticket ID =" + j.getId() );

        }
    }

    public static  void allTicketSortedByAssigneeName(Scanner in, ArrayList<Jira> arraylist) {
        Iterator<Jira> itr=arraylist.iterator();
        Jira j=null;
        while(itr.hasNext()) {
            j=itr.next();

            System.out.println("Assignee name="+j.getAssigneeName());
    }
    }
    public static void allHeading(Scanner in,ArrayList<Jira> arraylist) {
        Iterator<Jira> itr=arraylist.iterator();
        Jira j=null;
        while(itr.hasNext()) {
            j=itr.next();
            System.out.println("Assignee Heading="+j.getHeading());
        }
    }


    public static void allStatus(Scanner in,ArrayList<Jira> arraylist) {
        Iterator<Jira> itr=arraylist.iterator();
        Jira j=null;
        while(itr.hasNext()) {
            j=itr.next();
            System.out.println("Assignee Status="+j.getStatus());
        }
    }
    public static void changeAssigneeName(Scanner in,ArrayList<Jira> arraylist) {
        System.out.println("Enter Id_no;");
        int i= in.nextInt();

        System.out.println("Enter new Assignee name:");
        String s=in.next();

        Iterator<Jira> itr=arraylist.iterator();
        Jira j=null;
        while(itr.hasNext()) {
            j=itr.next();
            if(j.getId()==i) {
                j.setAssigneeName(s);

                System.out.println("Assignee_name="+j.getAssigneeName());
                break;
            }
        }
    }


    public static void changeHeading(Scanner in,ArrayList<Jira> arraylist) {
        System.out.println("Enter Id_no;");
        int i=in.nextInt();

        System.out.println("Enter new Heading:");
        String s=in.next();

        Iterator<Jira> itr=arraylist.iterator();
       Jira j=null;
        while(itr.hasNext()) {
            j=itr.next();
            if(j.getId()==i) {
                j.setHeading(s);
                System.out.println("Heading="+j.getHeading());
                break;
            }
        }
    }

    public static void changeStatus(Scanner in,ArrayList<Jira> arraylist) {

        System.out.println("Enter Id_no;");
        int k=in.nextInt();

        System.out.println("Enter new Status:");
        String s=in.next();

        Iterator<Jira> itr=arraylist.iterator();
        Jira j=null;
        while(itr.hasNext()) {
            j=itr.next();
            if(j.getId()==k)
                j.setStatus(s);
            System.out.println("Status="+j.getStatus());
            break;
        }
    }


    public static void  deleteSingleTicket(Scanner in,ArrayList<Jira> arraylist) {
        System.out.println("enter the Id_no to Delete:");
        int d=in.nextInt();
        Iterator<Jira> d1=arraylist.iterator();
        Jira j=null;
        while(d1.hasNext()) {
            j=d1.next();
            if(j.getId()==d){
                d1.remove();
                System.out.println("Deleted Successfully");
                break;
            }
        }
    }

    public static void deleteAllTicket(Scanner in,ArrayList<Jira> arraylist) {
        Iterator<Jira> itr=arraylist.iterator();
        Jira j=null;
        while(itr.hasNext()) {
            j=itr.next();
            itr.remove();
            System.out.println("All Ticket Deleted Successfully");
        }
    }
}






