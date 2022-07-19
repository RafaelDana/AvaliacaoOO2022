package rdc.aeroporto;

import rdc.aeroporto.exceptions.InvalidBookingException;
import java.util.ArrayList;
public abstract class Flight extends Item
{
  ArrayList<Payload> payloads = new ArrayList<Payload>();
  private final int PESO_MAXIMO = 200;
  private final int PAYLOAD_MAXIMO = 100;
  private boolean takenOff;
  
  public Flight()
  {
    takenOff = false;
  }
  
  public void book(Payload payload) throws InvalidBookingException
  {
    if ((payload.getWeight() <= PESO_MAXIMO)&&(payloads.size()<PAYLOAD_MAXIMO))
    {
      payloads.add(payload);
    }
    else if (payloads.size()>=PAYLOAD_MAXIMO)
      throw new InvalidBookingException ("Esta lotado");
    else
      throw new InvalidBookingException ("Sobrepeso");
  }

  public String toString ()
  {
    return (id  + " tem um payload de " + payloads.size());
  }

 public boolean canTakeoff() 
  {
   if(!takenOff)
     return true;
   else
     return false;
  }
}

