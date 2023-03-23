import java.util.Scanner;
import java.util.Locale;

public class App {

    
    public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);

    Scanner sc = new Scanner(System.in);

    Triangulo x, y;

    x = new Triangulo();
    y = new Triangulo();

    x.a = sc.nextDouble();
    x.b = sc.nextDouble();
    x.c = sc.nextDouble();

    System.out.println("++++++++++++++++++++");

    y.a = sc.nextDouble();
    y.b = sc.nextDouble();
    y.c = sc.nextDouble();

    double p = (x.a + x.b + x.c) / 2.0;
    double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c) );

     p = (y.a + y.b + y.c) / 2.0;
    double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c) );

    System.out.println("areaX = " + areaX);
    System.out.println("areaY = " + areaY);
    


    }
}
