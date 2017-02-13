package capital;

/**
 * CapitalStrategy 资本策略
 * 
 * @author shiyu
 *
 */
public abstract class CapitalStrategy {

    public abstract double capital(Loan loan);

    /**
     * 风险因素
     */
    protected double riskFactorFor(Loan loan) {
        // TODO Auto-generated method stub
        return 0;
    }

    /**
     * 期限
     * 
     * @param loan
     * @return
     */
    protected double duration(Loan loan) {
        // TODO Auto-generated method stub
        return 0;
    }

}
