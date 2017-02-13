package capital;

/**
 * 信用额度贷款
 * 
 * @author shiyu
 *
 */
public class CapitalStrategyAdvisedLine extends CapitalStrategy {

    @Override
    public double capital(Loan loan) {
        // loan.getCommitment() * loan.getUnusedPercentage() 风险金额
        return loan.getCommitment() * loan.getUnusedPercentage() * duration(loan) * riskFactorFor(loan);
    }

}
