package sun;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Principal {

	public static void main(String[] args) throws Exception {
		Calculadora calc = new CalculadoraImpl();
		Calculadora skeleton = (Calculadora) UnicastRemoteObject.exportObject(calc, 0);
		Registry registry = LocateRegistry.createRegistry(1099);
		registry.bind("calc", skeleton);
	}

}
