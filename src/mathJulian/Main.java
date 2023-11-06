package mathJulian;
import static mathJulian.math.expresionValida;

public class Main {
    public static void main(String[] args) {

        String expresion1 = "(2+2)*(4)";
        String expresion2 = "[5*(4-1)]";
        String expresion3 = "5+{2[8-(3+21]}";

        if(expresionValida(expresion1)){
            System.out.println("La expresion es valida.");

        }else{
            System.out.println("La expresion no es valida");
        }

        if(expresionValida(expresion2)){
            System.out.println("La expresion es valida.");

        }else{
            System.out.println("La expresion no es valida");
        }

        if(expresionValida(expresion3)){
            System.out.println("La expresion es valida.");

        }else{
            System.out.println("La expresion no es valida");
        }




    }


 }