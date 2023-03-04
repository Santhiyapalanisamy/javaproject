package com.ticket;

public class Jira {
	
        int Id;
        String AssigneeName;
        String ReporterName;
        String Heading;
        String Status;


  public Jira(int id, String assigneeName, String reporterName, String heading, String status) {
      super();
      Id = id;
      AssigneeName = assigneeName;
      ReporterName = reporterName;
      Heading = heading;
      Status = status;
  }
  public Jira(){

  }

  public int getId() {
      return Id;
  }
  public void setId(int id) {
     Id = id;
  }
  public  String getAssigneeName() {
      return AssigneeName;
  }

  public void setAssigneeName(String assigneeName) {
      AssigneeName = assigneeName;
  }
  public String getReporterName() {
      return ReporterName;
  }

  public void setReporterName(String reporterName) {
      ReporterName = reporterName;
  }

  public String getHeading() {
      return Heading;
  }

  public void setHeading(String heading) {
      Heading = heading;
  }

  public String getStatus() {
      return Status;
  }

  public void setStatus(String status) {
      Status = status;
  }

}



