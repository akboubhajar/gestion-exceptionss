package App;
import java.util.ArrayList;
import java.util.List;
import metier.EntierNaturel;
import metier.NombreNegatifException;

public class AppEntier {
    public static void main(String[] args)throws NegativeArraySizeException {


        EntierNaturel e1=new EntierNaturel(1);
        EntierNaturel e2=new EntierNaturel(4);
        try {
            System.out.println(e1.decrementer(1));
            System.out.println(e2.decrementer(5));
        }catch ( NombreNegatifException nbE){
            System.out.println(nbE.getMessage());
            nbE.addValeursExceptions(e1);
            nbE.addValeursExceptions(e2);
            System.out.println("test"+nbE.addValeursExceptions(e1));
            System.out.println(nbE.getValeursExceptions(0)); ;

        }


    }
}
