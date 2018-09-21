
public class Aplicacao {
	private float periodo;
	private float taxa_juros;
	private float capital_inicial;
	private float rendimento_bruto;
	private float rendimento_liquido;
	private float imposto_renda;
	private float aliquota;
	
	public Aplicacao(float periodo, float taxa_juros, float capital_inicial) {
		super();
		this.periodo = periodo;
		this.taxa_juros = taxa_juros / 100f;
		this.capital_inicial = capital_inicial;
		this.calcularAplicacao();
	}	
	
	private void calcularAplicacao() {
		this.calcularAliquota();
		
		this.calcularRendimentoBruto();
	}
	
	private float calcularPeriodoRelativo() {
		return this.periodo/365f;
	}

	private void calcularRendimentoBruto() {
		this.rendimento_bruto = 0f;
	}
	
	private void calcularRendimentoLiquido() {
		this.rendimento_liquido = 0f;
		
	}
	
	private void calcularImpostoRenda() {
		this.imposto_renda = 0f;
	}
	
	private void calcularAliquota() {
		
	}
	
	public float getRendimentoBruto() {
		return rendimento_bruto;
	}
	
	public float getImpostoRenda() {
		return imposto_renda;
	}
	
	public float getRendimentoLiquido() { 
		return rendimento_liquido;
	}
	
	
}
