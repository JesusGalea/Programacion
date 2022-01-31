package ifarray;

public class If1 {

	public static void main(String[] args) {
		int i = 8, j = 5, k;
	
		float x = 0.005f, y = 0.01f, z;
		
		char a, b = 'p', c = 'q';
		
	
		
		System.out.println("a) k= " + (k = (j ==5 )? i:j ));
		
		System.out.println("b) k= " + (k = (j ==5 )? i:j ));
		
		System.out.println("c) z= " + (z = (x>=0 )? x:0 ));
		
		System.out.println("d) z= " + (z = (y > 0 )? y:0 ));
		
		System.out.println("e) a= " + (a = (b < c )? b:c ));
		
		System.out.println("f) k= " + (k = (j > 0 )? j:0 ));
		
		System.out.println("g) k= " + (k = (i > 0 && j > 0 )? 0:1 ));
		
		System.out.println("h) k= " + (k = (y>0 || x > 0 )? i:j ));
		
		System.out.println("i) a= " + (a = (b < 'c' )? b:c ));
		
		System.out.println("j) a= " + (a = (b >= c )? b:'r' ));
	}

}
