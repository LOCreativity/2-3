import java.util.Scanner;

public class number3 {
	public static void main(String[] args) {
		Scanner st = new Scanner(System.in);
		
		System.out.println("진법과 진법에 해당되는 값을 스페이스바로 구분하여 입력하세요.");
		String []NumArr = new String[2];
		for(int i = 0; i < 2; i++) {
			NumArr[i] = st.next();
		}
		//임의의 객체 생성
		Conversion ob = new Conversion(Integer.parseInt(NumArr[0]), NumArr[1]);
		
		//처음 입력된 문자열에 따라 진수 변환 달라짐
		if(NumArr[0].equals("10")) {
			ob.toBinary(Integer.parseInt(NumArr[1]));
			ob.toHex(Integer.parseInt(NumArr[1]));
		}
		else if(NumArr[0].equals("2")) {
			ob.binaryToNum(NumArr[1]);
			ob.binaryToHex(NumArr[1]);
		}
		else if(NumArr[0].equals("16")) {
			ob.hexToNum(NumArr[1]);
			ob.hexToBinary(NumArr[1]);
		}
		
		ob.printNum();
		ob.printBinary();
		ob.printHex();
		st.close();
	}
}

