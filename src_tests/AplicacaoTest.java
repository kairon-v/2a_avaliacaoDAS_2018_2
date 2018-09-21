import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AplicacaoTest {
	
	private int periodo = 60;
	private float capital_inicial = 1000.0f;
	private float taxa_juros = 8.5f;

	@Test
	void testRendimentoBruto() {
		Aplicacao aplicacao = new Aplicacao(periodo, capital_inicial, taxa_juros);
		assertEquals(aplicacao.getRendimentoBruto(), 13.97f, 0.1);
	}
	
	@Test
	void testRendimentoRenda() {
		Aplicacao aplicacao = new Aplicacao(periodo, capital_inicial, taxa_juros);
		assertEquals(3.14f, aplicacao.getImpostoRenda(), 0.1);
	}
	
	@Test
	void testRendimentoLiquido() {
		Aplicacao aplicacao = new Aplicacao(periodo, capital_inicial, taxa_juros);
		assertEquals(aplicacao.getRendimentoLiquido(), 1.0829f, 0.01);
	}

}
