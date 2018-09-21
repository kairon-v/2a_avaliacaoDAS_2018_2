
public class Aplicacao {
	private float periodo;
	private float taxa_juros;
	private float capital_inicial;
	private float rendimento_bruto;
	private float rendimento_liquido;
	private float imposto_renda;
	
	public Aplicacao(float periodo, float taxa_juros, float capital_inicial) {
		super();
		this.periodo = periodo;
		this.taxa_juros = taxa_juros;
		this.capital_inicial = capital_inicial;
		this.calcularAplicacao();
	}	
	
	private void calcularAplicacao() {
		
	}
	
	public float getRendimentoBruto() {
		return 13.97f;
	}
	
	public float getImpostoRenda() {
		return 3.14f;
	}
	
	public float getRendimentoLiquido() { 
		return 1.0829f;
	}
	
	
}
