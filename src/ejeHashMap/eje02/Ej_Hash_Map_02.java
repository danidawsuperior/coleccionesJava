package ejeHashMap.eje02;

import java.util.HashMap;
import java.util.Scanner;

public class Ej_Hash_Map_02 {
	public static void main(String[] args) {
		//También se puede poner: HasHMap<String, String> datuser = new HashMap<String, String>();
		var datuser = new HashMap<String, String>();
		
		// Clave login, valor password
		datuser.put("root","root");
		datuser.put("alumno", "alumno1");
		datuser.put("admin", "12345");
		datuser.put("master", "12345");
		
		int num_intentos = 0;
		boolean accesoConcedido=false;
		
		String login;
		String passwd;
		String passwd_store;
		Scanner sc = new Scanner(System.in);
		while (num_intentos < 3  && !accesoConcedido) {
			System.out.print("Login: ");
			login = sc.nextLine();
			System.out.print("Password: ");
			passwd = sc.nextLine();
		
			// Recupera la clave almacenada
			passwd_store = datuser.get(login);
		
			if (passwd_store != null && passwd_store.equals(passwd)) {
				accesoConcedido = true;
			} else {
					System.out.println("Usuario y clave incorrectos");
					num_intentos ++;
			}
		}
		if (accesoConcedido) {
			System.out.println("Ha accedido al área restringida");
		} else {
			System.out.println("Lo siento, no tiene acceso al área restringida");
			System.out.println("Lo siento, no tiene mas intentos");
		}
	}
}
