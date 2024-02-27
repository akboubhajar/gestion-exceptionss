package metier;

import java.util.ArrayList;
import java.util.List;

public class NombreNegatifException extends  Exception{

    List<Float> valeursExceptions = new ArrayList<>();
    public  NombreNegatifException(String msg){
       super(msg);
    }

    public List<Float> addValeursExceptions(EntierNaturel v){
        float negativeVal= v.getVal();
        valeursExceptions.add(negativeVal);
        return valeursExceptions;
    }

    public Float getValeursExceptions(int index){
        return valeursExceptions.get(index);
    }
}
