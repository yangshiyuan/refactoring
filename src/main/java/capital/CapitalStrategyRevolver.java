package capital;

/**
 * 循环贷款
 * 
 * @author shiyu
 *
 */
public class CapitalStrategyRevolver extends CapitalStrategy {

    @Override
    public double capital(Loan loan) {
        return (loan.outstandingRiskAmount() * duration(loan) * riskFactorFor(loan))
                + (loan.getUnusedPercentage() * duration(loan) * unusedRiskFactor(loan));
    }

    /**
     * 未使用的风险因素
     */
    private double unusedRiskFactor(Loan loan) {
        // TODO Auto-generated method stub
        return 0;
    }

}
