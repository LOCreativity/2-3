class Conversion {
	
	private int num;
	private String bin;
	private String hex;
	
	/*
	public Conversion(int num) {
		this.num = num;
	}
	public Conversion(int num, String bin, String hex) {
		this.num = num;
		this.bin = bin;
		this.hex = hex;
	}
	*/
	public void setNum(int num) {
		this.num = num;
	}
	public void setBinary(String bin) {
		this.bin = bin;
	}
	public void setHex(String hex) {
		this.hex = hex;
	}
	public void toBinary(int num) {
		//10���� 2���� ��ȯ
		bin = Integer.toBinaryString(num);
	}
	public void toHex(int num) {
		//10���� 16���� ��ȯ
		hex = Integer.toHexString(num);
	}
	public void binaryToHex(String bin) {
		//2���� 16������ ��ȯ
		num = Integer.parseInt(bin, 2);
		hex = Integer.toHexString(num);
	}
	public void hexToBinary(String hex) {
		//16���� 2������ ��ȯ
		num = Integer.parseInt(hex, 16);
		bin = Integer.toBinaryString(num);
	}
	public void binaryToNum(String bin) {
		//2���� 10������ ��ȯ
		//Integer.parseInt(String s, int radix) => radix���� s ���ڿ��� 10������ �ٲ���   
		num = Integer.parseInt(bin, 2);
	}
	public void hexToNum(String hex) {
		//16���� 10������ ��ȯ
		num = Integer.parseInt(hex, 16);
	}
	public int printNum() {
		return num;
	}
	public String printBinary() {
		return bin;
	}
	public String printHex() {
		return hex;
	}
}
