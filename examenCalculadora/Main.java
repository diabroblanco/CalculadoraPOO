package examenCalculadora;
import java.util.Scanner;

public class Main {
static	Scanner sc=new Scanner(System.in);
static double primero, segundo, elevado, numero;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menu();
		
	}
	
	static void menu() {
		
		System.out.println(" Seleccione operación ");
		System.out.println("----------------------");
		System.out.println("----------------------");
		System.out.println("1    Sumar            ");
		System.out.println("2    Restar           ");
		System.out.println("3	Multiplicar       ");
		System.out.println("4	 Dividir          ");
		System.out.println("5	 Resto            ");
		System.out.println("6	Exponencial       ");
		System.out.println("7     Salir           ");
		System.out.println("----------------------");
		System.out.println("----------------------");
		int opcion=sc.nextInt();
		
		
		Calculadora operacion=new Calculadora();
		
		switch (opcion) {
		
		case 1->{System.out.println("Indique primer numero");
		primero=sc.nextDouble();
		System.out.println("Indique segundo numero");
		segundo=sc.nextDouble();
		System.out.print("El resultado es "+operacion.Suma(primero, segundo));
		}
		case 2->{System.out.println("Indique primer numero");
		primero=sc.nextDouble();
		System.out.println("Indique segundo numero");
		segundo=sc.nextDouble();
		System.out.print("El resultado es "+operacion.Resta(primero, segundo));

		}
		case 3->{System.out.println("Indique primer numero");
		primero=sc.nextDouble();
		System.out.println("Indique segundo numero");
		segundo=sc.nextDouble();
		System.out.print("El resultado es "+operacion.Multiplicar(primero, segundo));
}
		case 4->{System.out.println("Indique primer numero");
		primero=sc.nextDouble();
		System.out.println("Indique segundo numero");
		segundo=sc.nextDouble();
		System.out.print("El resultado es "+operacion.Dividir(primero, segundo));
}
		case 5->{System.out.println("Indique primer numero");
		primero=sc.nextDouble();
		System.out.println("Indique segundo numero");
		segundo=sc.nextDouble();
		System.out.print("El resultado es "+operacion.Resto(primero, segundo));
}
		case 6->{System.out.println("Indique  numero");
		numero=sc.nextDouble();
		System.out.println("Indique numero a elevar");
		elevado=sc.nextDouble();
		System.out.print("El resultado es "+operacion.Exponencial(numero, elevado));

		}
		case 7->{
			System.out.print("Saliendo");
			menu();
		}
		
		
		default->System.err.print("ERROR");
		}
		
		

		
	}
	
	
	
}
