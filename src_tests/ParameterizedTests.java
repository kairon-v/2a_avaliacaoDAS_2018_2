

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class ParameterizedTests {
	private int periodo;
	private float capital_inicial;
	private float taxa_juros;
	private double rendimento_bruto;
	private double rendimento_liquido;
	private double imposto_renda;
	
	public ParameterizedTests(int periodo, float capital_inicial,
			float taxa_juros, double rendimento_bruto, double imposto_renda,
			double rendimento_liquido) {
		this.periodo = periodo;
		this.capital_inicial = capital_inicial;
		this.taxa_juros = taxa_juros;
		this.rendimento_bruto = rendimento_bruto;
		this.imposto_renda = imposto_renda;
		this.rendimento_liquido = rendimento_liquido;
	}
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
			{60, 1000, 8.5, 13.97, 3.14, 1.0829},
			{120, 500, 8, 13.15, 2.96, 2.0384},
			{240, 3000, 9, 177.53, 35.51, 4.7342},
			{270, 2000, 8.5, 125.75, 25.15, 5.0301},
			{390, 100, 7.5, 8.01, 1.40, 6.6113},
			{420, 250, 8, 23.01, 4.03, 7.5945},
			{550, 400, 8, 48.22, 8.44, 9.9452},
			{670, 800, 8, 177.48, 20.56, 12.1151},
			{700, 2500, 9, 431.51, 75.51, 14.2397},
			{900, 4200, 9.5, 983.84, 147.58, 19.9110},
			{1000, 100, 7.5, 20.55, 3.08, 17.4658}
		});
	}
	
	@Test
	public void testAplicacao() {
		Aplicacao aplicacao = new Aplicacao(periodo, capital_inicial, taxa_juros);
		assertEquals(aplicacao.getRendimentoBruto(), rendimento_bruto, 0.2);
		assertEquals(aplicacao.getImpostoRenda(), imposto_renda, 0.1);
		// assertEquals(aplicacao.getRendimentoLiquido(), rendimento_liquido, 0.1);

	}

}
