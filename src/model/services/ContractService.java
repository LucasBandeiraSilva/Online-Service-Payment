package model.services;

import java.time.LocalDate;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {
    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, Integer monhts) {
        double basicQuota = contract.getTotalValue()/monhts;
        for (int i = 0; i <= monhts; i++) {
            LocalDate instalmenteDate = contract.getDate();
            LocalDate dueDate = instalmenteDate.plusMonths(i);
            double interest = onlinePaymentService.interest(basicQuota, i);
            double fee = onlinePaymentService.paymentFee(basicQuota);
            double quota = basicQuota + interest + fee;
            contract.getInstallments().add(new Installment(dueDate, quota));
        }
    }

    public OnlinePaymentService getOnlinePaymentService() {
        return onlinePaymentService;
    }


}
