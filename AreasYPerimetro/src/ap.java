
public class ap {

	public static void main(String[] args) {
		
		System.out.println("�REA Y PERIMETRO CUADRADO");
        System.out.println("�REA CUADRADO 120cm");
        //A=L^2
        int ar=120;
        System.out.println("PERIMETRO CUADRADO 180cm");
        //P*L^4
        int per =180;
        System.out.println("EL �REA DEL CUADRADO ES: ");
        System.out.println(Math.pow(ar, 2));
        System.out.println("EL PER�METRO DEL CUADRADO ES: ");
        System.out.println(Math.pow(per, 4));
        /////////////////////////////////////////////////////
        //AREA Y PER�METRO RECT�NGULO
        //AREA RECTANGULO 38cm de largo por 21 cm de ancho
        //A=b*h
        int b=38;
        int h=21;
        int arectang=b*h;
        System.out.println("EL �REA DEL RECTANGULO ES: "+arectang);
        //PERIMETRO RECTANGULO 38cm de largo por 21 cm de ancho
        //P=2b+2h)
        int bb=(38);
        int hh=(21);
        int prectang=2*(bb+hh);
        System.out.println("EL PER�METRO DEL RECTPANGULO ES:"+prectang+"cm");
	}

}
