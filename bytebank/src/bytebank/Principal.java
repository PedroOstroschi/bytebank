package bytebank;

public class Principal {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.extrato();
		conta.desposita(100);
		conta.extrato();
		conta.saca(1000);
	}
}
