package projetoFinal;

import java.util.List;

public class Principal
{
	public static void main(String[] args)
	{
		LerApostas lerApostas = new LerApostas();
		LerOGabarito lerGabarito = new LerOGabarito();
		GerarResultado gerarResultado = new GerarResultado();

		lerApostas.lerApostas();
		lerGabarito.lerGabarito();

		gerarResultado.setListApostas(lerApostas.getListApostas());
		gerarResultado.setListGabarito(lerGabarito.getListGabarito());
		gerarResultado.gerar();

		// System.out.println(lerApostas);
		// System.out.println(lerGabarito);
		// System.out.println(gerarResultado);
	}
}
