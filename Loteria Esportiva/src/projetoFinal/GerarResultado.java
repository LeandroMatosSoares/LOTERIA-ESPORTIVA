package projetoFinal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class GerarResultado
{
	protected ArrayList<String> listApostas;
	protected ArrayList<String> listGabarito;

	public GerarResultado()
	{
		listApostas = new ArrayList<>();
		listGabarito = new ArrayList<>();
	}

	public void gerar()
	{
	    listApostas.retainAll(listGabarito);

		System.out.println("---------- Ganhador!!! Parabéns! -----------");
	    System.out.println("Daniel Luis Notari");
	    System.out.println(listApostas.toString());

	}

	public ArrayList<String> getListApostas()
	{
		return listApostas;
	}

	public void setListApostas(ArrayList<String> listApostas)
	{
		this.listApostas = listApostas;
	}

	public ArrayList<String> getListGabarito()
	{
		return listGabarito;
	}

	public void setListGabarito(ArrayList<String> listGabarito)
	{
		this.listGabarito = listGabarito;
	}

	public String toString() {
		return "GerarResultado [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ getClass().toString() + "]";
	}
}