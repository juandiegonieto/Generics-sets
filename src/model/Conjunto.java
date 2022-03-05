package model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Conjunto <E>{
	Set<E> a;
	public Conjunto(ArrayList<E> array) {
		a = new HashSet<E>();
		for(E s : array)
		a.add(s);
	}
	
	public void union(Set<E> set1) {
		Set<E> union = new HashSet<E >(a); 
		union.addAll(set1);
		System.out.print("La union de ambos conjutos es la siguiente ");
		System.out.println(union+"\n");
	}
	
	public void interseccion(Set<E> set1) {
		Set<E> interseccion = new HashSet<E >(a); 
		set1.removeAll(set1);
		interseccion.removeAll(set1);
		if (interseccion.size()!=0) {
			System.out.print("La interseccion de ambos conjutos es la siguiente ");
			System.out.println(interseccion+"\n");
		}else{
			System.out.println("la interseccion es vacio");
		}
		
	}
	
	public void diferencia(Set<E> set1) {
		set1.removeAll(a);
		if (set1.size()!=0) {
			System.out.print("La diferencia c1-c2 es la siguiente ");
			System.out.println(set1+"\n");
		}else{
			System.out.println("la resta es vacia");
		}
	}
}
