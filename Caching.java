public class Caching {
    private String from;
    private String to;
    private double rate;

    public Caching() {
        this.from = "";
        this.to = "";
        this.rate = 0;
    }

    public void tenMinuteLoop() throws InterruptedException {
        Trxn trxn = new Trxn();
        int tenMin = 10;
        this.rate = trxn.getRate();

        int minutes = 0;
        while (minutes < 60) {
            if (minutes > 0) {
                if (minutes % tenMin == 0) {
                    System.out.println("\nTen minutes has passed.");
                    System.out.println("Total time that has passed: " + minutes + " minutes.\n");
                    this.rate = trxn.getRate();
                }
            }

            this.from = trxn.getFrom();
            this.to = trxn.getTo();

            System.out.println("Payment from " + this.from + " to " + this.to + " at a rate of " + this.rate);

            minutes++;
            Thread.sleep(500);
        }
    }
}
