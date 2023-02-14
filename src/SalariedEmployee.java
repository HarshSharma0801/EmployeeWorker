public class SalariedEmployee extends Employee {
    double annualSalary;
    boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String hireDate,
                            double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }
    @Override
    public double collectPay(){
        double paycheck = (int)annualSalary/26;
        double adjustedPay= (isRetired)? paycheck*0.9 : paycheck ;
        return (int)adjustedPay;

    }
    public void retire(){
        terminate("12/12/2025");
        isRetired=true;
    }
}