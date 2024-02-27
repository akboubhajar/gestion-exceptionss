<h3>une application Java contenant une classe EntierNaturel
permettant de gérer des entiers naturels (positifs ou nuls) et un nouveau type
d'exception personnalisé en écrivant une classe NombreNegatifException qui
spécialise la classe Exception. La classe EntierNaturel dispose :</h3>
<p>- d’un constructeur avec un argument de type int pour initialiser l’attribut
val; il générera une exception de type NombreNegatifException si la
valeur de son argument est négative ;</hr>
- un accesseur en lecture getVal() qui fournira sous forme d’un int la valeur
encapsulée dans un objet de type EntierNaturel;</hr>
- -un accesseur en écriture setVal() qui modifiera la valeur de l'entier
naturel grâce à un int passé en paramètre; cette méthode générera
une exception de type NombreNegatifException si la valeur passée
en paramètre est négative ;</hr>
- une méthode decrementer() qui décrémente de 1 l’attribut val de l’objet
EntierNaturel; cette méthode devra pouvoir lever une exception de
type NombreNegatifException;</p>
</hr>
<p>
• Dépôt d'argent sur le compte.</hr>
• Retrait d'argent du compte (gérez les exceptions pour les fonds
insuffisants).</hr>
• Affichage du solde du compte.</hr>
• Transfert d'argent entre deux comptes (gérez les exceptions pour les fonds
insuffisants et les comptes inexistants).</hr> 
</p>
</hr>
<p>les exceptions dans ces classes :</hr>
• Si un retrait est effectué sur un solde insuffisant, lancez une exception
personnalisée FondsInsuffisantsException.</hr>
• Si un transfert est effectué vers un compte inexistant, lancez une exception
personnalisée CompteInexistantException.</hr></p>
</hr>
<p></p>
</hr>
