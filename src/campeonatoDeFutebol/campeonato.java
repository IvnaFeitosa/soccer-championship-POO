package campeonatoDeFutebol;
import java.util.Collections;
import java.util.ArrayList;

public class Campeonato {
	
	//criando uma lista de arrays na classe campeonato que armazenará a coleção de clubes
	private ArrayList<Clube> clubes;
	
	//criando um construtor para iniciar o array
	public Campeonato(ArrayList<Clube> clubes) {
		this.clubes = clubes; //Atribuindo valor ao atributo clube
		
	}
	
	public void jogarCampeonato() {
		for(int i = 0; i < clubes.size(); i++) {
			for(int v = 0; v < clubes.size(); v++) {
				jogarPartida(clubes.get(i),clubes.get(v)	);
				jogarPartida(clubes.get(v),clubes.get(i));
			}
		}
	}
	
	public void jogarPartida(Clube clube1, Clube clube2 ) {
		 int golsTime1 = (int) (Math.random() * 6);
		 int golsTime2 = (int) (Math.random() * 6);
		 int golsSofridos1 = golsTime2;
		 int golsSofridos2 = golsTime1;
		 
		 if (golsTime1 > golsSofridos1) {
			 clube1.ganhar(golsTime1, golsSofridos1);
			 clube2.perder(golsTime2, golsSofridos2);
		 }else if(golsTime1 < golsSofridos1) {
			 clube1.perder(golsTime1, golsSofridos1);
			 clube2.ganhar(golsTime1, golsSofridos2);
		 }else {
			 clube1.empatar();
			 clube2.empatar();
		 }
	}
	
	public void getClassificacao() {
		Collections.sort(clubes, (c1, c2) -> {
            if (c1.getPontos() != c2.getPontos()) {
                return c2.getPontos() - c1.getPontos();
            } else {
                return c2.getSaldoGols() - c1.getSaldoGols();
            }
        });
		
		System.out.println("Classificação:");
		
		for (int i = 0; i < clubes.size(); i++) {
			System.out.println((i+1) + 
			"." + clubes.get(i).getNome() + 
			" - Pontos: " + clubes.get(i).getPontos() + 
			", Saldo de Gols: " + clubes.get(i).getSaldoGols());
		}
		
	}
	
	public String getCampeao() {
		getClassificacao();
		return clubes.get(0).getNome();
		
	}
}
