
package practica4;

public class Practica4 {
    
        //para circulo
        double area (double radio){
            return Math.PI *radio*radio;
        }
        //para rectangulo
        double area(double base,double altura ){
            return base*altura;
        }
        //para triangulo rectangulo
        double area(double base, double altura,boolean h){
            return base*altura/2;
        }
        //para un trapecio
        double area(double baseMayor, double baseMenor, double altura,boolean h){
            return (baseMayor+baseMenor)*altura/2;
        }
        //para un pentagono
        double area(double lado, int numLados, double apotema) {
            double perimetro = numLados * lado; 
            return (perimetro * apotema) / 2;
        }

    public static void main(String[] args) {
       Practica4 f1=new Practica4();
       Practica4 f2=new Practica4();
       Practica4 f3=new Practica4();
       Practica4 f4=new Practica4();
       Practica4 f5=new Practica4();
       System.out.println("area del circulo= "+f1.area(5));
       System.out.println("area del rectangulo= "+f2.area(4,6));
       System.out.println("area del triangulo Rectangulo= "+f3.area(4,6,true));
       System.out.println("area del trapecio= "+f4.area(8,4,5,true));
       System.out.println("area del hexagono= "+f5.area(6,6,7,true));
    }
    
}
