import java.util.Scanner;

public class number3 {
	public static void main(String[] args) {
		Scanner st = new Scanner(System.in);
		
		System.out.println("������ ������ �ش�Ǵ� ���� �����̽��ٷ� �����Ͽ� �Է��ϼ���.");
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
		System.out.println("10���� : " + ob.printNum());
		System.out.println("2���� : " + ob.printBinary());
		System.out.println("16���� : " + ob.printHex());
		
		st.close();
	}
}
