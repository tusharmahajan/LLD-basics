package basics.singleResponsibiltyPrinciple;

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee employee = new Employee(23);
        SalaryCalculator salaryCalculator = new SalaryCalculator();
        salaryCalculator.getSalary(employee);
    }
}
