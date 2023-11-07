package mathJulian;
import java.util.ArrayList;
import java.util.List;

import static mathJulian.Math.expresionValida;

public class Main {
    public static void main(String[] args) {

        List<String> expresionesList = new ArrayList<>();


        expresionesList.add("(2+2)*(4)");
        expresionesList.add("[5*(4-1)]");
        expresionesList.add("5+{2[8-(3+21]}");


        for (String expresion:expresionesList){
            if(expresionValida(expresion)){
                System.out.println("La expresion es valida.");
            }else{
                System.out.println("La expresion no es valida.");
            }
        }





    }


 }