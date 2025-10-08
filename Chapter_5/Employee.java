public class Employee {
    private int employeeNumber;
    private double payRate;
    private final int MAX_EMPLOYEE_NUMBER = 9999;
    private final double MAX_RATE = 60.00;
    private final double OVERTIME_MULTIPLIER = 1.5;
    
    public Employee(int employeeNumber, double payRate) {
        this.employeeNumber = employeeNumber;
        this.payRate = payRate;
    }

    public double computeRegularPay(double hoursWorked) {
        double regularPay;

        if (hoursWorked <= 40) {
            regularPay = hoursWorked * payRate;
        } else {
            regularPay = 40 * payRate;
        }

        return regularPay;
    }

    public double computeOvertimePay(double hoursWorked) {
        double overtimePay = 0.0;

        if (hoursWorked > 40) {
            double overtimeHours = hoursWorked - 40;
            overtimePay = overtimeHours * payRate * OVERTIME_MULTIPLIER;
        }

        return overtimePay;
    }
}
