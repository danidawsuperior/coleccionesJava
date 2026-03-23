package ejeArrayList.eje03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Ej_Ar_03 {
	public static void main(String[] args) {
		Random rd = new Random();
		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		int tamaño = rd.nextInt(10, 21);
		
		for (int i = 0; i < tamaño; i++) {
			lista.add(rd.nextInt(101));
		}
		
		//Apartado a)
		System.out.println("Lista original " + lista);
		
		//Apartado b)
		int suma = 0;
		for(int numero : lista) {
			suma += numero;
		}
		System.out.println("La suma total es " + suma);
		
		//Apartado c)
		lista.removeIf(valor -> valor % 2 == 0);

		System.out.println("Lisa de números impares " + lista);
		
		//Apartado d.1)
		for (int i = 0; i < lista.size(); i++) {
			if(lista.get(i) % 3 == 0) {
				lista.set(i, 0);
			}
		}
		//Tambien se puede usar este metodo
		//lista.replaceAll(x -> (x % 3 == 0) ? 0:x);
		System.out.println("Lista con numeros divisibles por 3 sustituidos por 0 " + lista);
		
		//Apartado d.2)
		for (int i = 0; i < lista.size(); i++) {
			if(lista.get(i) != 0 && lista.get(i) % 5 == 0) {
				lista.add(i	, 555);
				i++;
			}
		}
		System.out.println("Lista con numeros divisibles por 5 posicion anterior 555 " + lista);

	}
}
