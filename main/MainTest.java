package rdc.aeroporto.main;

import java.io.IOException;
import rdc.aeroporto.exceptions.AvaliacaoOO2022NaoInformadaException;
import rdc.aeroporto.exceptions.InvalidInputException;
import rdc.aeroporto.main.Main;

public class MainTest {
	public static void main(String [] args) throws AvaliacaoOO2022NaoInformadaException, IOException {
		
		Airline airline = new Airline();
		Main.readInputFile("C:\\Users\\Rafael Dana\\OneDrive\\Documentos\\NetBeansProjects\\Aeroporto\\src\\main\\java\\rdc\\aeroporto\\main\\TxtTest.txt", airline);
		Main.writeInputFile("C:\\Users\\Rafael Dana\\OneDrive\\Documentos\\NetBeansProjects\\Aeroporto\\src\\main\\java\\rdc\\aeroporto\\main\\TxtTest.txt", airline);
		
		Airline airline2 = new Airline();
		try {
			System.out.println("Voo Comercial 100000003 tem um payload de 0 = ");
			System.out.println(airline2.addFlight('C'));
			System.out.println("Voo Industrial 200000004 tem um payload de 0 = ");
			System.out.println(airline2.addFlight('I'));
		} catch (InvalidInputException e) {
			System.out.println("Não roda!");
		}
		
		System.out.println(airline2.getFlight(100000003));
		
		//nulo:
		System.out.println(airline2.getFlight(100000000));
		System.out.println("Voo Comercial 100000000 tem um payload de 0 = ");
		System.out.println(airline.getFlight(100000000));
		
	}

}
