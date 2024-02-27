package metier;

public class CompteCourant extends  CompteBancaire{
    float découvert;

    public CompteCourant(String nbrCompte, float solde, String nomU) {
        super(nbrCompte, solde, nomU);
    }
  public float getDécouvert(float découvert) throws ComptesInexistantsException{
        if(découvert<=10)throw new ComptesInexistantsException("Le compte  n'existe pas");

        return découvert+getSolde();
  }

    @Override
    public float WithdrawingMoney(float montant) throws FondsInsuffisantsException {

        if(montant>=getSolde())throw new FondsInsuffisantsException("le solde est unssufisant pour cette operation(retirer)");


            return super.WithdrawingMoney(montant);

    }

    @Override
    public double transferBetweenAccounts(CompteBancaire cb1, CompteBancaire cb2, float mt) throws FondsInsuffisantsException, ComptesInexistantsException {
        return super.transferBetweenAccounts(cb1, cb2, mt);
    }
}
