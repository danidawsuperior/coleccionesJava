package ejeArrayList.eje04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.TreeSet;

public class Ej_Ar_04 {

	public static void main(String[] args) {
		Random rd = new Random();
		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		int tamaño = rd.nextInt(20);
		
		for (int i = 0; i < tamaño; i++) {
			lista.add(rd.nextInt(101));
		}
		
		//Apartado a)
		System.out.println("Lista original " + lista);

		Collections.sort(lista);
		System.out.println("Lista ordenada " + lista);
		
		//Apartado b)
		TreeSet<Integer> conjunto = new TreeSet<Integer>(lista);
		
		System.out.println("Contenido del TreeSet sin repetidos y ordenado " + conjunto);

		
	}

}
