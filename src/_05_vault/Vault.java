package _05_vault;

public class Vault {
	int code = 0;
	public Vault(int code) {
		this.code = code;
	}
	public boolean tryCode(int code) {
		return code == this.code;
	}
}

