package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class NumeroParImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int[] arreglo = new int[8];	
		
		for (int i = 0; i < arreglo.length; i++){
			
			System.out.println("Ingrese un numero entero: ");
			arreglo[i] = sc.nextInt();
		}
		
		for (int j = 0; j < arreglo.length; j++) {
			if (arreglo[j]%2==0) {
				System.out.println(arreglo[j]+"| par");
			}else {
				System.out.println(arreglo[j]+"| impar");
			}
		}
		
	}

}
