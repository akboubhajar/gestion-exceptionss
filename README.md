<body>
    <h1>Java Application Documentation</h1>
    <h2>EntierNaturel Class</h2>
    <p>
@@ -22,11 +23,10 @@
    </p>
    <h3>Methods:</h3>
    <ul>
        <li>
        <h3>deposit(double amount)</h3>: Deposits money into the account.</li>
        <li><h3>withdraw(double amount)</h3>: Withdraws money from the account. Throws <code>FondsInsuffisantsException</code> if there are insufficient funds.</li>
        <li><h3>getBalance(): double</h3>: Retrieves the current balance of the account.</li>
        <li><h3>transfer(BankAccount recipient, double amount)</h3>: Transfers money to another account. Throws <code>FondsInsuffisantsException</code> if there are insufficient funds and <h3>CompteInexistantException</code> if the recipient account does not exist.</li>

        <li>deposit(double amount): Deposits money into the account.</li>
        <li>withdraw(double amount): Withdraws money from the account. Throws FondsInsuffisantsException if there are insufficient funds.</li>
        <li>getBalance(): double: Retrieves the current balance of the account.</li>
        <li>transfer(BankAccount recipient, double amount): Transfers money to another account. Throws FondsInsuffisantsException if there are insufficient funds and CompteInexistantException if the recipient account does not exist.</li>
    </ul>
</body>
