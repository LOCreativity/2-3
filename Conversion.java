class Conversion {
	
	private int num;
	private String bin;
	private String hex;
	
	public Conversion(int num, int k) {
		this.num  = num;
	}
	public Conversion(String bin, int k) {
		this.bin = bin;
	}
	public Conversion(String hex, String k) {
		this.hex = hex;
	}
	
	public void toBinary(int num) {
		//10진수 2진법 변환
		this.bin = Integer.toBinaryString(num);
	}
	public void toHex(int num) {
		//10진수 16진법 변환
		this.hex = Integer.toHexString(num);
	}
	public void binaryToHex(String bin) {
		//2진수 16진수로 변환
		this.num = Integer.parseInt(bin, 2);
		this.hex = Integer.toHexString(this.num);
	}
	public void hexToBinary(String hex) {
		//16진수 2진수로 변환
		this.num = Integer.parseInt(hex, 16);
		this.bin = Integer.toBinaryString(this.num);
	}
	public void binaryToNum(String bin) {
		//2진수 10진수로 변환
		//Integer.parseInt(String s, int radix) => radix진법 s 문자열을 10진수로 바꿔줌   
		this.num = Integer.parseInt(bin, 2);
	}
	public void hexToNum(String hex) {
		//16진수 10진수로 변환
		this.num = Integer.parseInt(hex, 16);
	}
	public void printNum() {
		System.out.println("10진수 : " + this.num);
	}
	public void printBinary() {
		System.out.println("2진수 : " + this.bin);
	}
	public void printHex() {
		System.out.println("16진수 : " + this.hex);
	}
}

