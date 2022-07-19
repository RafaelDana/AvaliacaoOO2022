package rdc.aeroporto;

public class Cargo extends Payload {
  
  public Cargo(double w)
  {
    super(w);
    id = 400000000 + super.getID();
  }
}
