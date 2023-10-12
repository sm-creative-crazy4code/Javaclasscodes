import java.util.Scanner;
import java.util.Date;
public class Lesson50{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    double interestRate = input.nextDouble();
    int years=input.nextInt();
    double loanAmount = input.nextDouble();

    Loan loan1=new Loan(interestRate,years,loanAmount);
    Loan loan2=new Loan();

    System.out.println("Loan 1: ");
    System.out.println("Created: "+loan1.getLoanDate().toString());
    System.out.println("Monthly Payment: "+loan1.getMonthlypayment());
    System.out.println("Annual Payment: "+loan1.getTotalPaymentAmount());

    System.out.println("Loan 1: ");
    System.out.println("Created: "+loan2.getLoanDate().toString());
    System.out.println("Monthly Payment: "+loan2.getMonthlypayment());
    System.out.println("Annual Payment: "+loan2.getTotalPaymentAmount());

    }



    
}

class Loan{

        private double annualInterestRate;
        private int numberOfYears;
        private double loanAmount;
        private Date loanDate;

        public Loan(){
            annualInterestRate = 2.5;
            numberOfYears =1;
            loanAmount = 1000;
            loanDate = new Date();
        }


        public Loan(double _interestRate, int _numberOfYears, double _loanAmount){
            annualInterestRate = _interestRate;
            numberOfYears=_numberOfYears;
            loanAmount = _loanAmount;
        }


        public double getAnnualInterestRate(){
            return annualInterestRate;
        }

        public int getNumberOfYears(){
            return numberOfYears;
        }

        public double getLoanAmount(){
            return loanAmount;
        }

        public Date getLoanDate(){
            return loanDate;
        }

        public void setAnnualInterestRate(double interestRate){
            annualInterestRate = interestRate;
        }

        public void setLoanAmount(double _loanAmount){
            loanAmount = _loanAmount;
        }

        public void setNoOfYears(int _numberOfYears){
            numberOfYears=_numberOfYears;
        }

        public double getMonthlypayment(){
            double amount=getTotalPaymentAmount();
            return amount/(12*numberOfYears);

        }

        public double getTotalPaymentAmount(){

        double principal=loanAmount;
        double interest =(loanAmount*numberOfYears*annualInterestRate)/100;
        return principal+interest;
        }

    }