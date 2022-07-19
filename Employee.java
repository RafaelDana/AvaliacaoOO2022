package rdc.aeroporto;

public class Employee extends Person {
 
  private String firstName;
  private String lastName;
  private int empID; 
  private String job;
  private double weight;
  
 public Employee(double w, String firstName, String lastName, String job)
 {
   super(w ,firstName,lastName);
   empID = 500000000;
   this.job = job;
 }

 public boolean hasJob(String isItThisJob)
 {
   if (job == isItThisJob)
     return true;
   else
     return false;
 }
 
  public String toString()
 {
    return (super.toString() + " Trabalho: " + job);
 }
}
