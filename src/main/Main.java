package main;

import model.Conjunto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Set;

public class Main <E>{
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));;
	public static <E> void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			start();
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	public static <E> void start ( ) throws NumberFormatException, IOException {
		ArrayList<E>array = new ArrayList<>();
		System.out.println("Write the size of the set");
		int size = Integer.parseInt(br.readLine());
		System.out.print("Write the elemtns of the set");
		int i = 0;
		while(size>i) {
		array.add((E) br.readLine());
		i++;}
		Conjunto<E> c = new Conjunto<E>(array);
		System.out.println("Elige una de las siguientes opciones:");
		int operation = showMenu();
		Set<E> a = askSet();
		calculate(operation,c,a);
	}
	
	public static int showMenu() throws NumberFormatException, IOException {
		System.out.println("1)Union."+"\n"+"2)Interseccion"+"\n"+"3)Diferencia simetrica");
		int op = 0;
		try {
			op = Integer.parseInt(br.readLine());
			while(op>3 || op<1) {
				System.out.print("No es una opcion valida, pruba de nuevo");
				op =Integer.parseInt(br.readLine());
			}
		}catch(InputMismatchException ex) {
			System.out.println("No has digitado numero, pruba de nuevo");
			showMenu();
			
		}
		return op;
	}
	
	public static<E> void calculate(int op,Conjunto<E> c,Set<E>set1) {
		
		
		
		switch (op) {
		case 1:
			c.union(set1);
			break;
		case 2:
			c.interseccion(set1);
			break;
		case 3:
			c.diferencia(set1);
			break;
		}
		
	}
	
	public static<E> Set<E> askSet() throws NumberFormatException, IOException {
		int quantity = 0;
		try {
			System.out.println("Digita la cantidad de objetos que tendra el conjunto con el que se realizara la operacion");
			quantity = Integer.parseInt(br.readLine());
			while(quantity<0) {
				System.out.print("No es una opcion valida, pruba de nuevo");
				quantity = Integer.parseInt(br.readLine());
			}
		}catch(InputMismatchException ex) {
				System.out.println("No has digitado numero, pruba de nuevo");
				askSet();
		}
		String element;
		Set<E> s = new HashSet<E>(); 
		
		for (int i = 0; i<quantity;i++) {
			System.out.println("Digita el "+(i+1)+" elemento del conjunto");
			element = br.readLine();
			s.add((E) element);
		}
		return s;
		
	}
}
