
public class Aplicacao {
	private int periodo;
	private float taxa_juros;
	private float capital_inicial;
	private float rendimento_bruto;
	private float rendimento_liquido;
	private float imposto_renda;
	private float aliquota;
	
	public Aplicacao(int periodo, float taxa_juros, float capital_inicial) {
		this.periodo = periodo;
		this.taxa_juros = taxa_juros / 100f;
		this.capital_inicial = capital_inicial;
		this.calcularAplicacao();
	}	
	
	private void calcularAplicacao() {
		this.calcularAliquota();
		
		this.calcularRendimentoBruto();
		this.calcularRendimentoLiquido();
		this.calcularImpostoRenda();
	}
	
	private float calcularPeriodoRelativo() {
		return this.periodo/365f;
	}
	

	private void calcularRendimentoBruto() {
		float periodo_relativo = this.calcularPeriodoRelativo();
		this.rendimento_bruto = (this.capital_inicial * this.taxa_juros * periodo_relativo);
	}
	
	private void calcularRendimentoLiquido() {
		
		System.out.println(this.rendimento_bruto - this.imposto_renda);
		this.rendimento_liquido = (((this.rendimento_bruto - this.imposto_renda) / this.capital_inicial) * 100f) - 100f;
		
	}
	
	private void calcularImpostoRenda() {
		this.imposto_renda = this.aliquota / 100f * this.rendimento_bruto;
	}
	
	private void calcularAliquota() {
		if (periodo < 181) {
			this.aliquota = 22.5f;
		} else if (periodo < 361) {
			this.aliquota = 20.0f;
		} else if (periodo < 721) {
			this.aliquota = 17.5f;
		} else {
			this.aliquota = 15f;
		}
	}
	
	public float getRendimentoBruto() {
		return rendimento_bruto;
	}
	
	public double getImpostoRenda() {
		return imposto_renda;
	}
	
	public float getRendimentoLiquido() { 
		return rendimento_liquido;
	}
	
	
}
