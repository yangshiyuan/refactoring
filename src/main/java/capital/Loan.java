package capital;

/**
 * Loan 贷款
 * 
 * @author shiyu
 *
 */
public class Loan {

    /**
     * 承诺
     */
    private double commitment;

    /**
     * 未使用的百分百
     */
    private double unusedPercentage;

    /**
     * 突出风险金额
     */
    private double outstandingRiskAmount;

    /**
     * 承诺额度
     */
    public double getCommitment() {
        return commitment;
    }

    /**
     * 未用额度
     */
    public double getUnusedPercentage() {
        return unusedPercentage;
    }

    /**
     * 突出风险金额
     * 
     * @return
     */
    public double outstandingRiskAmount() {
        // TODO Auto-generated method stub
        return outstandingRiskAmount;
    }

}
