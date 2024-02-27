package metier;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class EntierNaturel  {
    private int val;
    List<Float> stockVal= new ArrayList<>();

    public EntierNaturel(int val) {
       this.val=val;


    }
   public int getVal(){
        return val;
   }
   public void setVal( int val) throws NombreNegatifException{

      if(val<=0)  throw new NombreNegatifException("Le nombre est negative,il doit modifier!!");
        this.val=val;
   }
   public int decrementer(int v) throws  NombreNegatifException{
       val=val-v;
          if ( val<0 ) throw new NombreNegatifException("valeur negative");



       return  val;


   }





}
