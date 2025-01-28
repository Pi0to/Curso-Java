package entities;

public final class OutsourcedEmployee extends Employee{

    private Double charge;

    public OutsourcedEmployee() {
    }

    public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double charge) {
        super(name, hours, valuePerHour);
        this.charge = charge;
    }

    @Override
    public final Double payment(){
        return super.payment() + (1.1 * charge);
    }
}
