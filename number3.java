import java.util.Scanner;

public class number3 {
	public static void main(String[] args) {
		Scanner st = new Scanner(System.in);
		
		System.out.println("진법과 진법에 해당되는 값을 스페이스바로 구분하여 입력하세요.");
		String []NumArr = new String[2];
		
		for(int i = 0; i < 2; i++) {
			NumArr[i] = st.next();
		}
	
		//Conversion ob = new Conversion(n, Integer.toBinaryString(n), Integer.toHexString(n));
		Conversion ob = new Conversion();
		if(NumArr[0].equals("10")) {
			
			ob.setNum(Integer.parseInt(NumArr[1]));
			ob.toBinary(Integer.parseInt(NumArr[1]));
			ob.toHex(Integer.parseInt(NumArr[1]));
		}
		else if(NumArr[0].equals("2")) {

			ob.binaryToNum(NumArr[1]);
			ob.setBinary(NumArr[1]);
			ob.binaryToHex(NumArr[1]);
		}
		else if(NumArr[0].equals("16")) {
			
			ob.hexToNum(NumArr[1]);
			ob.hexToBinary(NumArr[1]);
			ob.setHex(NumArr[1]);
		}
		System.out.println("10진수 : " + ob.printNum());
		System.out.println("2진수 : " + ob.printBinary());
		System.out.println("16진수 : " + ob.printHex());
		
		st.close();
	}
}
