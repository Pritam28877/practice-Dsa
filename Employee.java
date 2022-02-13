//Defining an Employee class    
class Employee{    
    //Defining properties    
    String name;  
    int salary;  
    Boolean married;  
    //creating main() method of teh Employee class    
    public static void main(String args[]){    
        //Creating object of Employee class    
        Employee emp =new Employee();  
        emp.name = "Emma Watson";  
        emp.salary = 40000;  
        emp.married = false;  
        //Printing values of the object    
        System.out.println(emp.name);    
        System.out.println(emp.salary);  
        System.out.println(emp.married);  
    }    
}     