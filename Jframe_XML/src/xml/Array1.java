package xml;

public class Array1 {



	public static void random() {
		int[][] JGn = new int[4][5];

        
      	        for (int i = 0; i < 4; i ++) {
            
            for (int j = 0; j < 5; j ++) {
                JGn[i][j] = (int) (Math.random() * 10);
                System.out.print(JGn[i][j] + "\t");             
            }            
        System.out.println();
        }
	}
	}


