package br.com.alura.screenmatch;

import br.com.alura.screenmatch.principal.Main;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		// Dados de Todas Temporadas
//		// Cria uma lista de temporada
//		List<DadosTemporada> temporadas = new ArrayList<>();
//
//		// Pega todas as temporadas e adiciona na lista
//		for (int i = 1; i <= dados.totalTemporadas(); i++) {
//			json = consumoApi.obterDados("https://www.omdbapi.com/?t=gilmore+girls&season=" + i + "&apikey=156a41fc");
//			DadosTemporada dadosTemporada = conversor.obterDados(json, DadosTemporada.class);
//			temporadas.add(dadosTemporada);
//		}
//
//		temporadas.forEach(System.out::println);

		Main main = new Main();
		main.exibeMenu();
	}
}
