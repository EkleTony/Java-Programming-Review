
public class B8_StringClass {
	
	public static void main(String[] args) {
		
		//String
		
		String name = "Tony";
		
		boolean result = name.equals("Tony");
		int result2 = name.length();
		char result3 = name.charAt(2);
		int result4 = name.indexOf('n');
		boolean result5 = name.isEmpty();
		String result6 = name.toUpperCase();
		String result7 =  "Ekle Tony".toLowerCase();
		String result8 = "Ekle Tony".replace("Tony", "Anthony");
		
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		System.out.println(result6);
		System.out.println(result7);
		System.out.println(result8);
	}

}
