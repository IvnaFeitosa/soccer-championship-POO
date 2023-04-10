package campeonatoDeFutebol;
import java.util.ArrayList; 

public class Teste {
  public static void main(String[] args) {
	  
	  Clube clube1 = new Clube ("Vasco");
	  Clube clube2 = new Clube ("Corinthians");
	  Clube clube3 = new Clube ("Flamengo");
	  Clube clube4 = new Clube ("Palmeiras");
	  
	   // Criando um ArrayList de clubes
	    ArrayList<Clube> clubes = new ArrayList<Clube>();
	    clubes.add(clube1);
	    clubes.add(clube2);
	    clubes.add(clube3);
	    clubes.add(clube4);

	    // Criando um objeto Campeonato
	    Campeonato campeonato = new Campeonato(clubes);

	    // Jogando o campeonato
	    campeonato.jogarCampeonato();

	    // Obtendo a classificação e o campeão
	    String campeao = campeonato.getCampeao();
	    System.out.println("O campeão é: " + campeao);
	
  }
}