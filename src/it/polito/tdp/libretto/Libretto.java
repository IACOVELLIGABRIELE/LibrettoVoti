package it.polito.tdp.libretto;

import java.util.*;

public class Libretto {
	
	private List<Voto> voti ;

	public Libretto() {
		
		this.voti = new ArrayList<>();
	}
	
	public void add(Voto v) {
		//if(v >= 18 && v =< 30)
			this.voti.add(v);
	}
	
	public void stampa() {
	
		System.out.println("Ci sono "+ voti.size() +" voti \n");
		
		for(Voto v : voti) {
			System.out.println(v);
		}
	}
	
	public void stampa25() {
		for(Voto v : voti) {
			if(v.getVoto() == 25)
				System.out.println(v);
		}
		
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Ci sono" + voti.size()+ "voti \n ");
	    
		for(Voto v : voti) {
			sb.append(v.toString());
			sb.append("\n");
		}
		
		return sb.toString();
	}
	
	public int cercaVoto(String nomeCorso) {
		for(Voto v : voti) {
			if(v.getEsame().compareTo(nomeCorso) == 0)
				return v.getVoto();	
		}
		
		return 0;
	}
	
	public boolean esameGiaPresente(Voto valutazione) {
		for(Voto v : voti) {
			if(v.getEsame().compareTo(valutazione.getEsame()) == 0 && v.getVoto() == valutazione.getVoto())
				return true;	
		}
		
		return false;
	}
	
}
