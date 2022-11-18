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

public class Main {
	
	public static void main(String[] args) {
		
		//creo un conto test
		Conto newConto1 = new Conto(234,"poyo");
		System.out.println(newConto1);
		System.out.println("---------------------");
		
		//test per l'aggiunta di soldi
		newConto1.addMoney(100);
		System.out.println(newConto1);
		System.out.println("---------------------");
		
		//test prelievo
		
		System.out.println("Il prevelio è andato a buon fine ? " +newConto1.getMoney(50));
		System.out.println( "Saldo corrente : " + newConto1.getBankBalance() + "$");
		System.out.println("---------------------");
		
		//test cambio nome intestatario
		newConto1.setMeberName("franco");
		System.out.println(newConto1);
	}

}
