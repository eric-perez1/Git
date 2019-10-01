import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
	
	int opcion;
	Scanner teclado = new Scanner(System.in);
	
	Criatura criatura;
	
	List<Criatura> listaCriaturasCopia;
	
	
	public void miMain() {
		
		listaCuentasCopia = new ArrayList<Libro>();
		banco = new Banco();
		
		listaCuentasCopia = banco.getListaCuentas();
		
		do {		
			 opcion = menu();
			switch (opcion) {
			case 1:
				
				ingresoCuenta();
				
				break;
				
			case 2:
				banco.agregarCuenta("nombre", "dni", 13.00);
				banco.agregarCuenta("nombre", "dni2", 10.00);
				listaCuentasCopia = banco.getListaCuentas();
				
				break;
				
			case 3:
				
				break;
				
			case 4:
				
				break;
				
			case 5:
				
				break;
				
			case 6:
				visualiza();
				break;	
				
			case 7:
				
				break;	

			default:
				break;
			}
			
			
			
			
			
		}while(opcion != 0);
		
		
		
		
	}
	
	public int menu() {
		
		int opcion = 0;
		
		{
		System.out.println("Menu \n1. Ingresar una cantidad\r\n" + 
				"2.	Sacar una cantidad (siempre que se tenga saldo suficiente)\r\n" + 
				"3.	Ver el saldo de la cuenta\r\n" + 
				"4.	Transferir una cantidad a otra cuenta (siempre que tenga saldo suficiente)\r\n" + 
				"");
		System.out.println("5.Crear una cuenta con un saldo inicial\r\n" + 
				"6.	Ver el estado de todas las cuentas\r\n" + 
				"7.	Hacer una operación sobre una cuenta (mostrará el menú de operaciones anterior\r\n" + 
				"");
		
		opcion = teclado.nextInt();teclado.nextLine();
		}while(opcion < 0 && opcion > 8);
		return opcion;
		
		
	}
	
	public void ingresoCuenta() {
		
		int i = 0;
		teclado  = new Scanner(System.in);
		
		System.out.println("\nNombre de la cuenta ");
		String nombre = teclado.nextLine();
		 for (Libro cuenta : listaCuentasCopia) {
			 
	            if (true == banco.comprobar(nombre,  i)) {
	            	
	                 System.out.println("Este perfil existe: " + nombre); 
		
	            }
	            else {
	            	i++;
	            }
		 }
		 
		 System.out.println("\nSaldo de la cuenta " +banco.getSaldo(i, nombre));
		 System.out.println("\nNuevo saldo de la cuenta ");
		 double s = teclado.nextDouble();
		 banco.setSaldo(s,i);
		 System.out.println("\nNuevo saldo de la cuenta "+banco.getSaldo(i, nombre));
		 
	}
	
	public void visualiza() {
		
		for (Libro cuenta : listaCuentasCopia) {
			 
             {
            	
                 System.out.println(cuenta); 
	
            
            }
	 }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Principal programa = new Principal();
		programa.miMain();

	}
	
	
}
