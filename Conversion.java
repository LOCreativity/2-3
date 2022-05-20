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
		//10진수 2진법 변환
		bin = Integer.toBinaryString(num);
	}
	public void toHex(int num) {
		//10진수 16진법 변환
		hex = Integer.toHexString(num);
	}
	public void binaryToHex(String bin) {
		//2진수 16진수로 변환
		num = Integer.parseInt(bin, 2);
		hex = Integer.toHexString(num);
	}
	public void hexToBinary(String hex) {
		//16진수 2진수로 변환
		num = Integer.parseInt(hex, 16);
		bin = Integer.toBinaryString(num);
	}
	public void binaryToNum(String bin) {
		//2진수 10진수로 변환
		//Integer.parseInt(String s, int radix) => radix진법 s 문자열을 10진수로 바꿔줌   
		num = Integer.parseInt(bin, 2);
	}
	public void hexToNum(String hex) {
		//16진수 10진수로 변환
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
