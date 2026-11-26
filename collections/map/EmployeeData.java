public class EmployeeData{
    String name;
	double salary;

	public EmployeeData(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

    @Override
	public String toString() {
        //override so whenever we print object all data will be shown instead of hashcode
		return " Name: " + this.name + " Salary: " + this.salary;
	}
    
	@Override
	public boolean equals(Object obj) {
        //override so that conainsValue method of HashMap can work properly 
        //it will check the equality of the object based on name and salary.
        if(obj instanceof EmployeeData e1) {
            return this.name.compareTo(e1.name)==0 && Double.compare(this.salary, e1.salary)==0;
        }
        return false;
	}
    
}