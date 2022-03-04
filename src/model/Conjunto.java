package model;

import java.util.HashSet;
import java.util.Set;

class Conjunto <E>{
	public Conjunto(E[] set) {
		Set<E> a = new HashSet<E>();
		for(E s : set)
		a.add(s);
	}
	
}
