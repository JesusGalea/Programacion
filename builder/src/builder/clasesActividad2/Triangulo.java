package builder.clasesActividad2;



	class DosDimensiones{
	     private double base;
	     private double altura;

	     //Constructor por defecto
	    DosDimensiones(){
	        base=altura=0.0;
	    }

	    //Parametrizando constructor
	    DosDimensiones(double b, double h){
	        base= b;
	        altura= h;
	    }

	    //Construir objeto con misma base y altura
	    DosDimensiones(double x){
	        base=altura=x;
	    }

	    //Métodos de acceso para base y altura
	    double getBase(){return base;}
	    double getAltura(){return altura;}
	    void setBase(double b){base=b;}
	    void setAltura(double h){altura=h;}

	    void mostrarDimension(){
	        System.out.println("La base y la altura son: "+base+" y "+altura);
	    }
	}
	//Extendiendo de DosDimensiones
	//Triangulo.java
	class Triangulo extends DosDimensiones{
	    private String estilo;

	    //Constructor por defecto
	    Triangulo(){
	        super();
	        estilo="ninguno";
	    }

	    Triangulo(String s, double b, double h){
	        super(b,h);  //Llama al constuctor de la superclase
	        estilo=s;
	    }

	    //Constructor con un argumento
	    Triangulo(double x){
	        super(x); //Llama al constuctor de la superclase
	        estilo="Estilo 1";
	    }

	    double area(){
	        return getAltura()*getBase()/2;
	    }

	    void mostrarEstilo(){
	        System.out.println("El triángulo tiene: "+estilo);
	    }
	}

	

