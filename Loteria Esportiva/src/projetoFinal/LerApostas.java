package projetoFinal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class LerApostas extends GerarResultado
{

	public LerApostas()
	{
		listApostas = new ArrayList<>();
	}

	public void lerApostas()
	{
		//esvaziando lista para evitar conflitos em uma futura leitura
		listApostas.clear();

	    Scanner ler = new Scanner(System.in);

	    System.out.printf("Informe o nome de arquivo que contenha as apostas: \n");
	    String nome = ler.nextLine();

	    System.out.printf("\n Abaixo os jogadores e suas respectivas apostas: \n");
	    try {
			//cria a lista de nomes e apostas
			FileReader arq = new FileReader(nome);
			BufferedReader leituraArq = new BufferedReader(arq);

			//aqui se lê a primeira linha
			String linha = leituraArq.readLine();

			while (linha != null)
			{
				System.out.printf("%s\n", linha);

				//separar as linhas pelo "\n"
				String[] palavrasDaLinha = linha.split("\n");

				//armazena o array na lista
				for(String palavra : palavrasDaLinha)
				{

					if( palavra.trim().length() > 1 && !"".equals(palavra.trim()))
					{
						listApostas.add(palavra);
					}
				}
				// lê da segunda até a última linha
				linha = leituraArq.readLine();
			}

			//fecha o arquivo
			arq.close();

			//informa o tamanho da lista
			System.out.println("\n\n");
			System.out.printf("Total de jogadores e suas apostas: %s\n", listApostas.size());

	    } catch (IOException Erro)
	    {
	        System.err.printf("Erro na abertura do arquivo: %s.\n", Erro.getMessage());
	    }

	    System.out.println();

	  }

	@Override
	public String toString()
	{
		return "LerApostas [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ getClass().toString() + "]";
	}

}
