package paquete;

public class CharToString {

	public static void main(String[] args) {
	char[] data = {'a', 'b', 'c', 'd','e' ,'f' ,'g' ,'h' ,'i', 'j'};
	
	String text = String.valueOf(data);
	
	System.out.println(text);
	
	text = String.copyValueOf(data,3,5);
	System.out.println(text);

	}

}
