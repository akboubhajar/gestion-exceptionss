
<body>
    <h1>Java Application Documentation</h1>
    <h2>EntierNaturel Class</h2>
    <p>
        This class represents a natural number (positive or zero) in Java. It includes functionality to handle natural numbers and a custom exception, <code>NombreNegatifException</code>.
    </p>
    <h3>Attributes:</h3>
    <ul>
        <li><code>val</code>: Holds the value of the natural number.</li>
    </ul>
    <h3>Methods:</h3>
    <ul>
        <li><code>EntierNaturel(int val)</code>: Constructor to initialize the natural number. Throws <code>NombreNegatifException</code> if <code>val</code> is negative.</li>
        <li><code>getVal(): int</code>: Retrieves the value of the natural number.</li>
        <li><code>setVal(int newVal)</code>: Sets the value of the natural number. Throws <code>NombreNegatifException</code> if <code>newVal</code> is negative.</li>
        <li><code>decrementer()</code>: Decrements the value of the natural number by 1. May throw <code>NombreNegatifException</code>.</li>
    </ul>

    <h2>BankAccount Class</h2>
    <p>
        This class represents a bank account with functionalities such as deposit, withdrawal, balance display, and transfer between accounts. It includes custom exceptions <code>FondsInsuffisantsException</code> and <code>CompteInexistantException</code>.
    </p>
    <h3>Methods:</h3>
    <ul>
        <li>deposit(double amount): Deposits money into the account.</li>
        <li>withdraw(double amount): Withdraws money from the account. Throws FondsInsuffisantsException if there are insufficient funds.</li>
        <li>getBalance(): double: Retrieves the current balance of the account.</li>
        <li>transfer(BankAccount recipient, double amount): Transfers money to another account. Throws FondsInsuffisantsException if there are insufficient funds and CompteInexistantException if the recipient account does not exist.</li>
    </ul>
</body>

