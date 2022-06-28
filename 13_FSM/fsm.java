import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class fsm {
    static String cero = "00", uno = "01", dos = "10", tres = "11", op, o;
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        do {
            do {
            System.out.println("\t\tel punto de inicio es : goNorte");
                System.out.println("ingresa los valores para continuar\n1.-00/10 para repetir a go Norte\n2.- 01/11 para avanzar a  waitnorte ");
                System.out.print("que ruta vas a tomar?: ");
                op = sc.next();
                if (op.equals(cero) || op.equals(dos)) {
                    TimeUnit.SECONDS.sleep(3);
                    System.out.println("\t\tTe encuentras en goNorte");
                } else {
                    do {
                        TimeUnit.SECONDS.sleep(3);
                        System.out.println("\t\tTe encuentras en waitNorte");
                        System.out.println("ingresa los valores para continuar\n1.-00/01/10/11 para ir a goESTE");
                        System.out.print("que ruta vas a tomar?: ");
                        op = sc.next();
                    } while (op.equals(cero) && op.equals(uno) && op.equals(dos) && op.equals(tres) != true);
                    if (op.equals(uno) || op.equals(cero) || op.equals(dos) || op.equals(tres)) {
                        do {
                            TimeUnit.SECONDS.sleep(2);
                            System.out.println("\t\tTe encuentras en goEste");
                            System.out.println("ingresa los valores para continuar\n1.-00/01 para repetir a goEste\n2.- 10/11 para avanzar a  waitEste ");
                            System.out.print("que ruta vas a tomar?: ");
                            op = sc.next();
                            if (op.equals(dos) || op.equals(tres)) {
                                do {
                                    TimeUnit.SECONDS.sleep(3);
                                    System.out.println("\t\tTe encuentras en waitESTE");
                                    System.out.println("ingresa los valores para continuar\n1.-00/01/10/11 para ir a goNORTE");
                                    System.out.print("que ruta vas a tomar?: ");
                                    o = sc.next();
                                    if (o.equals(cero) || o.equals(uno) || o.equals(dos) || o.equals(tres) == true) {
                                        TimeUnit.SECONDS.sleep(2);
                                        System.out.println("\t\tTe encuentras en GONORTE");
                                    }
                                } while (o.equals(cero) || o.equals(uno) || o.equals(dos) || o.equals(tres) == false);
                            }
                        } while (op.equals(cero) || op.equals(uno) || op.equals(dos) || op.equals(tres) == false);
                    }
                }
            } while (op.equals(cero) || op.equals(uno) != true );
        } while (o.equals(cero) || o.equals(uno) || o.equals(dos) || o.equals(tres) == false);
    }
}