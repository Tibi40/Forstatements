public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        //System.out.println("The amount is: " + calculateInterest(20, 30));

        for (double rate = 0.75; rate <= 10.00; rate += 0.25) { //se mareste suma cu 0.25
            double enteredAmount = calculateInterest(1000, rate);
            if (enteredAmount >= 8.5) {
                break;
            }
            System.out.println("The amount is: " + enteredAmount);
        }
    }

    public static double calculateInterest(double amount, double interestRate) {

        return(amount * (interestRate / 100)); //prin return "ceva", calculul reprezentat de acest "ceva"
                                                //se va regasi in acest system.out.println de mai sus
    }
}