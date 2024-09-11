import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter contract data: ");
        System.out.print("Contract number: ");
        int contractNumber = scanner.nextInt();
        System.out.print("Date (dd-MM-yyyy): ");
        LocalDate date = LocalDate.parse(scanner.next(), formatter);
        System.out.print("Contract value: ");
        double contractValue = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter the number of installments: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        Contract contract = new Contract(contractNumber, date, contractValue);
        ContractService service = new ContractService(new PaypalService());
        service.processContract(contract, n);
        System.out.println("Installments");
        for (Installment installment : contract.getInstallments()) {
            System.out.println(installment);

        }
        scanner.close();

    }
}
