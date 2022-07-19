package rdc.aeroporto;

import rdc.aeroporto.exceptions.InvalidInputException;

public abstract class Payload extends Item {
  
  private double weight;
  
  public Payload(double wgt) {
    super();
    weight = wgt;
    
  }
  
  public double getWeight(){
    
  return weight;
 }
 
 public String toString()
 {
   return ("ID: " + id+ ", Peso: " + weight + " kg ");
 }
 
 public static Payload payloadFactory(String payloadType, String weight, String firstname, String lastname, String job) throws InvalidInputException
 {
   if(payloadType == "P")
   {
  
     return new Person(Integer.parseInt(weight),firstname,lastname);
   }
   else if(payloadType == "E")
   {
     
       return new Employee(Double.parseDouble(weight),firstname,lastname,job);
   }
   else if(payloadType == "C")
   {
    
       return new Cargo(Double.parseDouble(weight));
   }
   return null;
 }
}
