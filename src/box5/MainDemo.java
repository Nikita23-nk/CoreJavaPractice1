package box5;

	class Student {

	   
	    static String collegeName = "ABC College";

	    
	    int rollNo;
	    String name;

	    
	    static void displayCollege() {
	        System.out.println("College Name: " + collegeName);
	    }

	 
	    void displayStudent() {
	        System.out.println("Roll No: " + rollNo);
	        System.out.println("Name: " + name);
	    }
	}

	class Employee {

	   
	    static String companyName = "TCS";

	   
	    int empId;
	    String empName;

	 
	    static void displayCompany() {
	        System.out.println("Company Name: " + companyName);
	    }

	  
	    void displayEmployee() {
	        System.out.println("Employee ID: " + empId);
	        System.out.println("Employee Name: " + empName);
	    }
	}

	class Car {

	   
	    static String fuelType = "Petrol";

	    
	    String model;
	    int price;


	    static void displayFuelType() {
	        System.out.println("Fuel Type: " + fuelType);
	    }

	  
	    void displayCar() {
	        System.out.println("Car Model: " + model);
	        System.out.println("Car Price: " + price);
	    }
	}

	public class MainDemo {

	    public static void main(String[] args) {

	      
	        Student.displayCollege();
	        Employee.displayCompany();
	        Car.displayFuelType();

	        System.out.println();

	      
	       
	        new Student().rollNo = 101;
	        new Student().name = "Nikita";
	        new Student().displayStudent();

	        System.out.println();

	        Employee e = new Employee();
	        e.empId = 1;
	        e.empName = "Rahul";
	        e.displayEmployee();

	        System.out.println();

	        Car c = new Car();
	        c.model = "Swift";
	        c.price = 800000;
	        c.displayCar();
	    }
	}



