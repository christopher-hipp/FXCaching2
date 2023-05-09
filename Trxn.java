import java.util.Random;

public class Trxn {
    private String[] currencies;
    private double[] rates;
    private String from;
    private String to;

    public Trxn() {
        this.currencies = new String[] {"USD", "GBP", "EUR", "CAD",};
        this.rates = new double[] {0.85, 0.91, 0.96, 1.04, 1.10, 1.13,};
        this.from = "";
        this.to = "";
    }

    public String getCurrency() {
        Random rand = new Random();
        int index = rand.nextInt(currencies.length);
        String currency = currencies[index];
        return currency;
    }

    public double getRate() {
        Random rand = new Random();
        int index = rand.nextInt(rates.length);
        double rate = rates[index];
        return rate;
    }

    public String getFrom() {
        this.from = getCurrency();
        return this.from;
    }

    public String getTo() {
        this.to = getCurrency();
        return this.to;
    }
}
