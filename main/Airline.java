package rdc.aeroporto.main;

import rdc.aeroporto.exceptions.InvalidInputException;
import rdc.aeroporto.exceptions.InvalidInputException;
import java.util.ArrayList;
import rdc.aeroporto.Commercial;
import rdc.aeroporto.Flight;
import rdc.aeroporto.Industrial;
import rdc.aeroporto.Payload;
public class Airline {
  ArrayList<Payload> payloads = new ArrayList<Payload>();
  ArrayList<Flight> flights = new ArrayList<Flight>();
  public AvaliacaoOO2022 x;
  
  public Airline()
  {
        this.x = new AvaliacaoOO2022();
  }
  
  public void Avaliacao(String nome, String matricula, double nota) 
  {
    this.x.nome = nome;
    this.x.matricula = matricula;
    this.x.nota = nota;
    
  }
  public String getAvaliacaoNome(){return x.nome;}
  public String getAvaliacaoMatricula(){return x.matricula;}
  public double getAvaliacaoNota(){return x.nota;}
  
  public String addFlight(char type) throws InvalidInputException
  {
    if (type == 'I')
    {
      Flight flight = new Industrial();
      flights.add(flight);
      return (flight.toString());
    }
    else if (type == 'C')
    {
      Flight flight = new Commercial();
      flights.add(flight);
      return (flight.toString());
    }
    else
      throw new InvalidInputException ("Entrada Invalida"); 
  }
  
  public Flight getFlight(int id)
  {
    
    for (int i = 0; i< flights.size();i++)
    {
      if(flights.get(i).id == id)
      {
        return flights.get(i);
      }
    }
    return null;
  }
  
  public void addPayload (Payload thePayload)
  {
    payloads.add(thePayload);
  }
  
  public Payload getPayload(int id)
  {
    for (int i = 0;i<payloads.size();i++)
    {
      if(payloads.get(i).id == id)
        return payloads.get(i);
    }
    return null;
  }
}


