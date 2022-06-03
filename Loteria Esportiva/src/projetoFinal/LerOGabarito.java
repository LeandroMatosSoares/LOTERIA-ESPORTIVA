package projetoFinal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LerOGabarito extends GerarResultado
{

	public LerOGabarito()
	{
	      //lista de Strings para armazenar
	      listGabarito = new ArrayList<>();
	}

	public void lerGabarito()
	{
		//esvaziando lista para evitar conflitos em uma futura leitura
		listGabarito.clear();

	    Scanner ler = new Scanner(System.in);

	    System.out.printf("Informe o nome do arquivo que contenha o gabarito: \n");
	    String nome = ler.nextLine();

	    System.out.printf("\n Gabarito da Loteria: \n");
	    try {


	      FileReader arq = new FileReader(nome);
	      BufferedReader lerArq = new BufferedReader(arq);

	      // lê a primeira linha
	      String linha = lerArq.readLine();

	      while (linha != null)
	      {
	        System.out.printf("%s\n", linha);

	        String[] palavrasDaLinha = linha.split("\n");

	        //armazena o array na lista
	        for(String palavra : palavrasDaLinha)
	        {
	            if( palavra.trim().length() > 1 && !"".equals(palavra.trim()))
	            {
	            	listGabarito.add(palavra);
	            }
	        }

	        	linha = lerArq.readLine();
	      }

	      arq.close();

	      //informa o tamanho da lista
	      System.out.println("\n\n");

	    } catch (IOException e)
	    {
	        System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
	    }

	    System.out.println();
	  }

	@Override
	public String toString() {
		return "LerOGabarito [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ getClass().toString() + "]";
	}

}
