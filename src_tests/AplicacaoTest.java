import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AplicacaoTest {
	
	private float periodo = 60f;
	private float capital_inicial = 1000.0f;
	private float taxa_juros = 8.5f;

	@Test
	void testRendimentoBruto() {
		Aplicacao aplicacao = new Aplicacao(periodo, capital_inicial, taxa_juros);
		assertEquals(aplicacao.getRendimentoBruto(), 13.97f);
	}
	
	@Test
	void testRendimentoRenda() {
		Aplicacao aplicacao = new Aplicacao(periodo, capital_inicial, taxa_juros);
		assertEquals(aplicacao.getImpostoRenda(), 3.14f);
	}
	
	@Test
	void testRendimentoLiquido() {
		Aplicacao aplicacao = new Aplicacao(periodo, capital_inicial, taxa_juros);
		assertEquals(aplicacao.getRendimentoLiquido(), 1.08f, 0.01);
	}

}
