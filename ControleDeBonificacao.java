public class ControleDeBonificacao {
    // Decalração das variaveis privadas //
	private double totalDebonus;
	// Dando um valor a classe / 
	public double getTotalDeBonus() {
		return this.totalDebonus;
	}
	// Dando um valor total a classe / 
	public double calculaTotalDeBonus(Funcionario f) {
		return this.totalDebonus = this.totalDebonus + f.bonifica();
	}
}
