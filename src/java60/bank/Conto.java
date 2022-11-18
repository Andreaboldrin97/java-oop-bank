package java60.bank;

/*
 * Todo
Creare la classe Conto, caratterizzate come segue:

Conto
Variabili d'ambiente:

numero conto - int
nome proprietario - String
saldo - int
Generare costruttore, proprieta' (getter/setter) e toString(). Definire propriamente i modificatori di visibilita'.

Definire inoltre la classe seguendo le seguenti logiche:

durante la fase di istanza il saldo del conto deve essere impostato a 0
codice del conto e il saldo devono essere accessibili solo in lettura (omettere le opportune proprieta')
nome proprietario accessibile sia in lettura che in scrittura
Definire inoltre i seguenti metodi:

addMoney utile per versare denaro sul conto
getMoney utile a prelevare denaro
getSaldo ritorna il saldo utile
DANGER: il saldo NON deve mai essere negativo

Main
Nella classe Main andare a definire alcune variabili di tipo Conto e testare la correttezza del codice.
 */

public class Conto {
	
// variabili d'istanza
	private int accountNumber;
	public String meberName;
	private int bankBalance;
	String bank = "Unicredit";

	
	// creiamo il costrutto
	public Conto(int accountNumber, String meberName ) {
		
		// assegnamo i dati alle variabili d'istanza
		this.accountNumber = accountNumber;
		this.meberName = meberName;
		this.bankBalance = 0;
		
	}
	
	// creo la funzione get e set per meberName
	
	public String getMeberName() {
		return meberName;
	}
	
	public void setMeberName(String meberName) {
		this.meberName = meberName;
	}
	
	// funzioni per la manipolazione del denaro
	
	// deposito sul conto
	public void addMoney(int money) {
		bankBalance += money;
	}
	
	// prelievo dal conto
	public boolean getMoney(int money){
		
		if (bankBalance < money ) { 
			return false;
		}
		bankBalance -= money;
		 return true;
	}
	
	
	// visione del conto
	public int getBankBalance() {
		return bankBalance;
	}
	
	
	
	
	// creiamo il metodo toString per vedere i dati
	@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Codice banca : " + accountNumber
					+ "\nNome : " + meberName
					+"\nSaldo : " + bankBalance
					+ "\nNome banca : " + bank;
		}
}
