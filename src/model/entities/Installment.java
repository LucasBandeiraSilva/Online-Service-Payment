package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Installment {

    private LocalDate instalmentDate;
    private double instalmentAmount;

    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Installment(LocalDate instalmentDate, double instalmentAmount) {
        this.instalmentDate = instalmentDate;
        this.instalmentAmount = instalmentAmount;
    }

    public LocalDate getInstalmentDate() {
        return instalmentDate;
    }

    public void setInstalmentDate(LocalDate instalmentDate) {
        this.instalmentDate = instalmentDate;
    }

    public double getInstalmentAmount() {
        return instalmentAmount;
    }

    public void setInstalmentAmount(double instalmentAmount) {
        this.instalmentAmount = instalmentAmount;
    }

    @Override
    public String toString() {
		return instalmentDate.format(formatter) + " - " + String.format("%.2f", instalmentAmount);
    }

}
