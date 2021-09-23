// Dando o nome ao arquivo /
public abstract class Funcionario {
    // Declaração de variaves //
	protected String nome;
	protected String departamento;
	protected double salario;
	protected String dataDeEntrada;
	protected String rg;
	protected boolean estaNaEmpresa;

	// Utilização das Variaveis locazadas nos Metodos /
	// Dando o nome a classe /                     
	public String getNome() {
		return nome;
	}
	 // Criando um metodo e dando um nome/
	public void setNome(String nome) {
		this.nome = nome;
	}
	// Dando o nome a classe /
	public String getDepartamento() {
		return departamento;
	}
	 // Criando um metodoe dando um nome /
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public double getSalario() {
		return salario;
	}
	 // Criando um metodo e dando um valor /
	public void setSalario(double salario) {
		this.salario = salario;
	}
	// Dando o nome a classe de retorno /
	public String getDataDeEntrada() {
		return dataDeEntrada;
	}
	public void setDataDeEntrada(String dataDeEntrada) {
		this.dataDeEntrada = dataDeEntrada;
	}
	// Dando o nome a classe de retorno /
	public String getRg() {
		return rg;
	}
	 // Criando um metodo /
	public void setRg(String rg) {
		this.rg = rg;
	}
	 // Criando uma classe true ou false /
	public boolean isEstaNaEmpresa() {
		return estaNaEmpresa;
	}
	 // Criando um metodo /
	public void setEstaNaEmpresa(boolean estaNaEmpresa) {
		this.estaNaEmpresa = estaNaEmpresa;
	}
    /* Adicionando a conta dentro da variavel calculasalario */
	 // Criando um metodo e dando o valor /
	public void calculaSalario(double valor) {
		this.salario = valor - (valor * 0.06);
	}
    // Criando um metodo e dando um valor /
	public void calculaSalario(double valor, double horaExtra) {
		double valorHorasExtra = (valor/30) / 8 * horaExtra;
		this.salario = valor - (valor*0.06) + valorHorasExtra;
	}
    // Dando um valor a classe /
	public double  calculaSalario() {
		return this.salario = this.salario - (this.salario * 0.06);
	}
    // Dando um valor a classe /
	public double bonifica(){
		return this.salario * 0.10;
	}
	 // Criando um metodo /
	public void demite() {
		estaNaEmpresa = false;
	}
    // Dando um valor a classe /
	public double calculaGanhoAnual() {
		return salario * 12;
	}
}