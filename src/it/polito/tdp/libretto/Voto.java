package it.polito.tdp.libretto;

import java.time.LocalDate;

public class Voto {
	
	private String esame;
	private int voto;
//	private LocalDate data; // prende la data odierna
	
	
	
	public Voto(String esame, int voto) {
		super();
		this.esame = esame;
		this.voto = voto;
	}


	public String getEsame() {
		return esame;
	}


	public void setEsame(String esame) {
		this.esame = esame;
	}


	public int getVoto() {
		return voto;
	}


	public void setVoto(int voto) {
		if(voto<18 || voto>30)
			throw new IllegalArgumentException("Valore non ammesso");
		
		this.voto = voto;
	}


	@Override
	public String toString() {
		return "esame = " + esame + ", voto = " + voto;
	}
	
	
	
	
	
	
	
}
