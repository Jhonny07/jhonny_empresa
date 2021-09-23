public class Gerente extends Funcionario{
	private String login;
	private String senha;
    /* Retornando as variaveis do arquivp Funcionario*/
	// Dando o nome a classe / 
	public String getLogin() {
		return login;
	}
	// Criando um metodo e dando um nome de login /
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	// Criando um metodo e dando uma senha /
	public void setSenha(String senha) {
		this.senha = senha;
	}
	 // Dando um valor a classe /
	public double bonifica(){
		return this.salario * 0.15;
	}
	
    // Criando um metodo e dando um login e uma senha /
	//Imprimindo as variavel /
	public void autentica(String login, String senha) {
		if((this.login == login) && (this.senha == senha)) {
			System.out.println("Acesso Permitido!");
		}else{
			System.out.println("Acesso Negado!");
		}
	}
}
