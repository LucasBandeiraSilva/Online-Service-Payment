## Contract Payment Processing System

This Java program automates the generation of payment installments for contracts, utilizing the PayPal payment service.

**Features:**

* **Contract Processing:** Takes contract details (contract number, date, total value) and the desired number of monthly installments as input.
* **Installment Calculation:** Calculates the payment schedule for the contract, factoring in:
    * **Monthly Due Dates:**  Starting one month after the contract date.
    * **Installment Amounts:**  Evenly distributes the contract value over the chosen number of months.
    * **PayPal Fees:**  Applies a 1% simple interest rate per installment plus a 2% payment processing fee.
* **Output:**  Displays a clear breakdown of each installment, including the due date and calculated payment amount.

**How It Works:**

1.  **Input:**  The user provides the necessary contract information and the desired installment duration.
2.  **Processing:** The program calculates the installment amounts, applying the PayPal fees.
3.  **Output:**  The program presents a schedule of installment due dates and their respective payment amounts.

**Purpose:**

This project serves as a practical example of implementing basic financial calculations and date manipulation in Java. It demonstrates a simplified approach to automating contract payment processing, incorporating real-world payment service fees.
