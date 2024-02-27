package metier;

public class CompteBancaire {
 private String nbrCompte;
 private float solde;
 private String nomU;



 public CompteBancaire(String nbrCompte,float solde,String nomU){
     this.nbrCompte=nbrCompte;
     this.solde=solde;
     this.nomU=nomU;
 }

    public void setNbrCompte(String nbrCompte) {
        this.nbrCompte = nbrCompte;
    }

    public void setSolde(float solde) {
        this.solde = solde;
    }

    public void setNomU(String nomU) {
        this.nomU = nomU;
    }

    public float depositIntoAccount(float depositMoney){
     solde=solde+depositMoney;

     return solde;
    }


    public float WithdrawingMoney(float montant)throws FondsInsuffisantsException{

     if(montant>=solde)throw new FondsInsuffisantsException("solde insuffisant!!");


        float prixRetirer=solde-montant;


     return prixRetirer;
 }
 public float getSolde(){
     return solde;
 }
 public void  Afficher(){
     System.out.println("le solde de ce compte :"+getSolde());
 }

    public boolean hasAccountNumber(String accountNumberToCheck) {
        return this.nbrCompte.equals(accountNumberToCheck);
    }


    public  double transferBetweenAccounts(CompteBancaire cb1,CompteBancaire cb2, float mt) throws FondsInsuffisantsException ,ComptesInexistantsException{
      if (cb1.solde<=mt)throw new FondsInsuffisantsException("le solde qui tu veut tranfer est insuffisnat!! ");
      if (!cb2.hasAccountNumber(nbrCompte))throw  new ComptesInexistantsException("Le compte destinataire n'existe pas!");
          cb1.WithdrawingMoney(mt);
          cb2.depositIntoAccount(mt);
          return cb1.getSolde()+cb2.getSolde();


    }

 public double tranfer(CompteBancaire cb) {
     double soldeTrafer = getSolde() ;
     return  soldeTrafer;


 }
    public float retirer(float prixRetirer)throws FondsInsuffisantsException{
        float test=solde-prixRetirer;

        return test;

    }





}
