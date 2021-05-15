package _05_vault;

public class VaultRunner {
	public static void main(String[] args) {
		Vault vault = new Vault(2934873);
		JamesBond James = new JamesBond();
		System.out.println(James.findCode(vault));
	}
}
