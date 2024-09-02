import java.util.Scanner;

public class ATMClient {
    public static void main(String[] args) {
        ATM atm = new ATM();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o valor que deseja sacar: ");
        int valor = scanner.nextInt();

        atm.withdraw(valor);

        scanner.close();
    }
}