package entities;

public abstract class TaxPayer {
    private String name;
    private Double income;

    public TaxPayer(){}

    public TaxPayer(String name, Double income) {
        this.name = name;
        this.income = income;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getIncome() {
        return income;
    }

    public void setIncome(Double income) {
        this.income = income;
    }

    public abstract double taxValue ();

    @Override
    public String toString() {
        return name + ": $ " + String.format("%.2f", taxValue());
    }
}
