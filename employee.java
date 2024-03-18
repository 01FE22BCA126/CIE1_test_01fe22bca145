
class employee extends DevOpsEngineer{
    private String name;
    private int employeeId;
    private double salary;
    public  employee(String name,int employeeId,double salary){
            this.name=name;
            this.employeeId=employeeId;
            this.salary=salary;
        }
        
    public String getName(){
        return name;
    }
    public int getEmployeeId(){
        return employeeId;
    }
    public double getSalary(){
        return salary;
    }
    public void displayDetails(){
        System.out.println("Name:"+name);
        System.out.println("Employee Id:"+employeeId);
        System.out.println("Salary:"+salary);
    }
}

    public static void main(String[] args){
        employee emp=new  employee("sam",23,12300.00);
        System.out.println("Employee Details");
        emp.getName();
        emp.getSalary();
        emp.getEmployeeId();

        emp.displayDetails();
        System.out.println();
    }



// Class DevOpsEngineer(String name,int employeeId,double salary,double bonus){
//     super(name,employeeId,salary,bonus);
//     this.bonus=bonus;
//  }
//  public void displayDetails(){
//     super.displayDetails();
//     System.out.println("Bonus:"+bonus);
//     System.out.println("Total Salary:"+getTotalSalary());
//  }
//  public class Main{
//     public static void main(String[] args){
//         Employee emp=new Employee("john doe",1001,50000);
//         System.out.println("Employee Details");
//         emp.displayDetails();
//         System.out.println();

//         DevOpsEngineer devops=new DevOpsEngineer(Jane Smith,1002,60000,5000);
//         System.out.println("Devops Engineer Deatils");
//         devops.displayDetails();
//         System.out.println();

//     }

//  }
// public  employee(String name,int employeeId,double salary){
//     this.name=name;
//     this.employeeId=employeeId;
//     this.salary=salary;
// }



    


    

