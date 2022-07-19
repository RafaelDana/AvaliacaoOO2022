package rdc.aeroporto;

public class Person extends Payload {
 private String firstName;
  private String lastName;
  private int weight;
  
 public Person(double weight, String firstName, String LastName) 
 {
   super(weight);
   this.firstName = firstName;
   this.lastName = lastName;
    id = 300000000+getID();
 }

  public String toString()
 {
    return (super.toString() + " Name: " + firstName );
 } 
}
