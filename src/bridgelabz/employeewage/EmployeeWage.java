package bridgelabz.employeewage;

public class EmployeeWage {

    //constants
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;

    //instance variables
    public int empWagePerHour;
    public int maxWokringDays;
    public int maxWorkingHrs;
    public String companyName;

    //constructor
    public EmployeeWage(String companyName,int empWagePerHour,int maxWorkingDays,int maxWorkingHrs)
    {
        this.companyName = companyName;
        this.empWagePerHour = empWagePerHour;
        this.maxWokringDays = maxWorkingDays;
        this.maxWorkingHrs = maxWorkingHrs;
    }

    public void calculateEmployeeWage()
    {
        //variables
        int monthlyEmpWage=0;
        int totalWorkingDays=0;
        int totalEmpHrs=0;
        System.out.println("Welcome to Employee Computation Program");

        while (totalWorkingDays<maxWokringDays && totalEmpHrs<maxWorkingHrs)
        {
            int empHrs=0;
            int dailyEmpWage=0;
            totalWorkingDays++;
            double empCheck = Math.floor(Math.random() * 10) % 3;
            switch ((int)empCheck) {
                case IS_FULL_TIME:
                    System.out.println("Employee is full time present");
                    empHrs=8;
                    break;
                case IS_PART_TIME:
                    System.out.println("Employee is part time present");
                    empHrs=4;
                default:
                    System.out.println("Employee is absent");
            }
            dailyEmpWage = empWagePerHour *empHrs;
            totalEmpHrs  += empHrs;
            monthlyEmpWage += dailyEmpWage;
        }
        System.out.println("Employee Wage for a month in "+companyName+ " is "+monthlyEmpWage);
    }
    public static void main(String args[]) {
        EmployeeWage Tata = new EmployeeWage("Tata",20,20,100);
        Tata.calculateEmployeeWage();
        EmployeeWage Wipro = new EmployeeWage("Wipro",15,25,150);
        Wipro.calculateEmployeeWage();
        EmployeeWage TCS= new EmployeeWage("TCS",20,30,200);
        TCS.calculateEmployeeWage();
    }
}
