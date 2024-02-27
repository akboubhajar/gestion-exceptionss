package metier;

public class CompteEpargne extends  CompteBancaire{
    float prixInteret;
    public CompteEpargne(String nbrCompte, float solde, String nomU) {
        super(nbrCompte, solde, nomU);
    }

    @Override
    public float depositIntoAccount(float depositMoney) {
        prixInteret=getSolde()*5/100;
        depositMoney=prixInteret;
        return super.depositIntoAccount(depositMoney);
    }
}
