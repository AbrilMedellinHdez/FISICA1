import java.util.Scanner;

public class Vectores1 {
    public static void main(String[] args) {
    Scanner lectura = new Scanner(System.in);
    String U1, V1, U2, V2, X1, Y1, Z1, X2, Y2, Z2, R1, R2, R3, R4, R5, R6;
    int opcion;
    System.out.println("Seleccione una operación:");
     System.out.println("1. Suma");
     System.out.println("2. Resta");
     opcion = lectura.nextInt();
     if(opcion == 1)
     {
      System.out.println("Introduce el valor de X1:");
      X1=lectura.nextString();
      System.out.println("Introduce el valor de Y1:");
      Y1=lectura.nextString();
      System.out.println("Introduce el valor de Z1:");
      Z1=lectura.nextString();
      System.out.println("Introduce el valor de X2:");
      X2=lectura.nextString();
      System.out.println("Introduce el valor de Y2:");
      Y2=lectura.nextString();
      System.out.println("Introduce el valor de Z2:");
      Z2=lectura.nextString();
      R1=(X1 + X2);
      R2=(Y1 + Y2);
      R3=(Z1 + Z2);
      System.out.println("Las coordenadas de tu vector son: (" +R1 + "," + R2 + "," + R3 + ")");
     }
     else
     {
      System.out.println("Introduce el valor de X1:");
      X1=lectura.nextString();
      System.out.println("Introduce el valor de Y1:");
      Y1=lectura.nextString();
      System.out.println("Introduce el valor de Z1:");
      Z1=lectura.nextString();
      System.out.println("Introduce el valor de X2:");
      X2=lectura.nextString();
      System.out.println("Introduce el valor de Y2:");
      Y2=lectura.nextString();
      System.out.println("Introduce el valor de Z2:");
      Z2=lectura.nextString();
      R4=(X1 - X2);
      R5=(Y1 - Y2);
      R6=(Z1 - Z2);
      System.out.println("Las coordenadas de tu vector son:(" +R4 + "," + R5 + "," + R6 + ")");
     }
   }
 }
