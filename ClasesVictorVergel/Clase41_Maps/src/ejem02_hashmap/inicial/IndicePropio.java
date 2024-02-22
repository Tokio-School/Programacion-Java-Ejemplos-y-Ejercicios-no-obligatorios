package ejem02_hashmap.inicial;

import java.util.Objects;

public class IndicePropio implements Comparable{
	
	private String indice;

	public IndicePropio(String indice) {
		super();
		this.indice = indice;
	}

	@Override
	public String toString() {
		return "IndicePropio [indice=" + indice + "]";
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return indice.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		
		
		return indice.equals(obj.toString());
	}
	

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return indice.compareTo(o.toString());
	}
	
	
}
