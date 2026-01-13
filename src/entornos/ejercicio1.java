package entornos;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("El número es PAR");
        } else {
            System.out.println("El número es IMPAR");
        }
        
        System.out.println("Hola.");

        sc.close();
	}

}
