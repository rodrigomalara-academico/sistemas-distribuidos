package sun;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import javax.swing.JOptionPane;

public class Cliente {

	public static void main(String[] args) throws Exception {
		String host = "127.0.0.1";
		
		Registry registry = LocateRegistry.getRegistry(host, 1099);
		Calculadora calcProxy = (Calculadora) registry.lookup("calc");

		float a = Float.parseFloat(JOptionPane.showInputDialog("Digite a"));
		float b = Float.parseFloat(JOptionPane.showInputDialog("Digite b"));
		
		System.out.println("Soma = " + calcProxy.soma(a, b));

	}

}
