package capital;

/**
 * 期限贷款
 * 
 * @author shiyu
 *
 */
public class CapitalStrategyTermLoan extends CapitalStrategy {

    @Override
    public double capital(Loan loan) {
        return loan.getCommitment() * duration(loan) * riskFactorFor(loan);
    }

    @Override
    protected double duration(Loan loan) {
        return weightedAverageDuration(loan);
    }

    private double weightedAverageDuration(Loan loan) {
        // TODO Auto-generated method stub
        return 0;
    }

}
