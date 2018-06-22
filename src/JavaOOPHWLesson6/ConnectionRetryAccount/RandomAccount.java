package JavaOOPHWLesson6.ConnectionRetryAccount;

public class RandomAccount implements Account {
    private final double notEnoughFundsProbability;
    private final double accountExpiredProbability;
    private final double lostConnectionProbability;

    public RandomAccount(double notEnoughFundsProbability, double accountExpiredProbability,
                         double lostConnectionProbability) {
        this.notEnoughFundsProbability = notEnoughFundsProbability;
        this.accountExpiredProbability = accountExpiredProbability;
        this.lostConnectionProbability = lostConnectionProbability;
    }

    @Override
    public void withdraw(long money) throws AccountException {
        double number = Math.random();
        System.out.println(number);//Needs for testing
        if (0 <= number && number < notEnoughFundsProbability) {
            throw new NotEnoughFundsException("Not enough funds!");
        }
        if (notEnoughFundsProbability <= number && number < notEnoughFundsProbability + accountExpiredProbability) {
            throw new AccountExpiredException("Account expired");
        }
        if (notEnoughFundsProbability + accountExpiredProbability <= number && number < notEnoughFundsProbability
                + accountExpiredProbability + lostConnectionProbability) {
            throw new AccountConnectionException("Connection lost");
        }
        System.out.println("Money was withdrawn successfully");
    }
}
