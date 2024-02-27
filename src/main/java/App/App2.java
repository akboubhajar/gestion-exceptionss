package App;

import metier.*;

import java.util.ArrayList;
import java.util.concurrent.Callable;

public class App2 {
    public static void main(String[] args) throws FondsInsuffisantsException, ComptesInexistantsException {
        ArrayList<CompteBancaire> ListComptes=new ArrayList<>();
         CompteBancaire  Compte1=new CompteBancaire("A123",1000,"compte1");
        CompteBancaire  Compte2=new CompteBancaire("h435h6",45000,"compte2");
        CompteBancaire  Compte3=new CompteBancaire("b432",500,"compte3");
        CompteCourant Compte4=new CompteCourant("c1334",2000,"Compte4");
        CompteEpargne Compte5=new CompteEpargne("d434",1000,"Compte5");


        ListComptes.add(Compte1);
        ListComptes.add(Compte2);
        ListComptes.add(Compte3);
        ListComptes.add(Compte4);
        ListComptes.add(Compte5);

        Compte1.depositIntoAccount(5000);
        System.out.println("le solde  actuel :"+Compte1.getSolde());


        try {

            System.out.println("le solde  de deuxieme compte retire et le solde actuel :"+Compte2.WithdrawingMoney(50));

        }catch (FondsInsuffisantsException e1){
            System.out.println("Le transfert a échoué "+e1.getMessage());
        }
        try {
            double verification=Compte3.transferBetweenAccounts(Compte1,Compte3, 2000);
            System.out.println("le tranfer est ok , her solde will be :"+Compte3.getSolde());
        } catch (FondsInsuffisantsException e2){
            System.out.println(" le solde que tu veut transfer est plus que votre solde ==> "+e2.getMessage());
        }catch (ComptesInexistantsException e3){
            System.out.println("le compte est in "+e3.getMessage());

        }

        try{
            System.out.println("vous ganier votre decouvert de cette annee , votre solde est :"+Compte4.getDécouvert(20));
        }catch (ComptesInexistantsException e5){
            System.out.println(e5.getMessage());
        }


        try {
            System.out.println(Compte4.WithdrawingMoney(10));
        }catch (FondsInsuffisantsException e4){
            System.out.println(e4.getMessage());
        }
        System.out.println(Compte5.depositIntoAccount(10));


    }
}
