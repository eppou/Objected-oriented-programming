
public class HeartRates {

	private String nome;
	private String sobrenome;
	private float dia;
	private float mes;
	private float ano;
	
	public HeartRates(String nome,String sobrenome,float dia,float mes,float ano) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public String getSobrenome() {
		return this.sobrenome;
	}
	
	public void setDia(float dia) {
		this.dia = dia;
	}
	
	public float getDia() {
		return this.dia;
	}
	
	public void setMes(float mes) {
		this.mes = mes;
	}
	
	public float getMes() {
		return this.mes;
	}
	
	public void setAno(float ano) {
		this.ano = ano;
	}
	
	public float getAno() {
		return this.ano;
	}
	
	public float descubraIdade(float dia,float mes, float ano) {
		float dif1 = ano - this.ano ;
		float dif2 = mes - this.mes;
		float dif3 = dia - this.dia;
		
		if(dif2>0) {
			return dif1;
		}
		
		else if(dif2<0) {
			return dif1-1;
		}
		
		else if(dif2==0) {
			if(dif3>0) {
				return dif1;
			}
			else {
				return dif1-1;
			}
		}
		return dif1;
	}
	
	public float calculaFrequenciaMaxima(float dia,float mes,float ano) {
		return 220 - this.descubraIdade(dia, mes, ano);
	}
	
	public float calculaFrequenciaAlvoInferior(float dia,float mes,float ano) {
		return (float) (this.calculaFrequenciaMaxima(dia, mes, ano)*0.5);
	}
	
	public float calculaFrequenciaAlvoSuperior(float dia,float mes,float ano) {
		return (float) (this.calculaFrequenciaMaxima(dia, mes, ano)*0.85);
	}
}
