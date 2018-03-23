package it.polito.tdp.libretto;

public class TestLibretto {

	public static void main(String[] args) {
		
		Libretto lib = new Libretto();
		
		lib.add(new Voto("Analisi", 30));
		lib.add(new Voto("Chimica", 28));
		lib.add(new Voto("Informatica", 28));
		
		lib.stampa();
	
		
		System.out.println("Voti uguali a 25 \n");
		lib.stampa25();
		System.out.println();
		System.out.println("cerca voto Analisi "+lib.cercaVoto("Analisi"));
		System.out.println();
		System.out.println("Voto esame di Informatica con valutazione = 28 è presente?");
		if(lib.esameGiaPresente(new Voto("Informatica",28)) == true) {
			System.out.println("esame presente");
		}else {
			System.out.println("esame non presente");
		}
	}

}
