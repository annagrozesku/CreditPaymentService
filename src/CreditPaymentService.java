public class CreditPaymentService {

    public double calculate(double sum, double term, double percent) {

        double percentMonth = percent / 12;
        long сredit = (long) (sum * ((percentMonth * Math.pow(1 + percentMonth, term)) / (Math.pow(1 + percentMonth, term) - 1)));

        return сredit;

    }
}
