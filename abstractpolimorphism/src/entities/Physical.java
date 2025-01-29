package entities;

public final class Physical extends TaxPayer{

    private Double healthExpenses;

    public Physical() {
    }

    public Physical(String name, Double income, Double healthExpenses) {
        super(name, income);
        this.healthExpenses = healthExpenses;
    }

    public Double getHealthExpenses() {
        return healthExpenses;
    }

    public void setHealthExpenses(Double healthExpenses) {
        this.healthExpenses = healthExpenses;
    }

    @Override
    public double taxValue(){
        if(getIncome() < 20000)
            return getIncome() * 0.15 - healthExpenses / 2;
        else
            return getIncome() * 0.25 - healthExpenses / 2;
     }

}
