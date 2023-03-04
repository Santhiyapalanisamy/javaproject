package com.ticket;

import java.util.Comparator;

public class IdSort implements Comparator<Jira> {
    Jira j1;
    Jira j2;
    public IdSort(){

    }
    public IdSort(Jira j1,Jira j2){
        this.j1=j1;
        this.j2=j2;
    }

    @Override
    public int compare(Jira o1, Jira o2) {
        if(o1.getId()>o2.getId())
            return 1;
        else if(o1.getId()==o2.getId())
            return 0;
        else
            return -1;
    }
    public static void deleteById(int id){

    }
}
