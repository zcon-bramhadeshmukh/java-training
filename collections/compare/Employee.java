public class Employee implements Comparable<Employee>{
    //Comparable interface is implemented to sort the objects of this class based on id.
    //we specify the type of object to be compared in the generic type parameter of Comparable interface
    //so that there will no need for downcasting the object to Employee class in compareTo method
	int id;
	String name;
	double salary;

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

    @Override
	public String toString() {
        //override so whenever we print object all data will be shown instead of hashcode
		return "\nID: " + this.id + " Name: " + this.name + " Salary: " + this.salary;
	}

	@Override
	public int compareTo(Employee o) {
		return this.id - o.id;
	}
    
	
	@Override
	public boolean equals(Object obj) {
        if(obj instanceof Employee e1) {
            return this.id==e1.id;
        }
        return false;
	}
    //useful when we want to have Hash Table based ds for this class
	@Override
	public int hashCode() {
		return this.id;
	}

    //all the ds related to HashTable internally hashCode() to check for bucket and equals to check for 
    //absolute equality of object incase of collosion, so we need to override both in the class
    //if we want to have our own sorting and comparison, if we don't override hashCode and equals,
    //the default implementation of Object class will be used 
    
    //TreeSet and TreeMap internally use compareTo method to check for equality of object, 
    //so we need implment Comparable and override compareTo method in the class 
    //if we want to have our own sorting and comparison as shwown in above class
    
    //if there is a scenario where we want to have different sorting and comparison for different ds,
    //we can use Comparator interface and implement it in a separate class while creating the ds object
    //and pass the comparator object to the constructor of the ds, so that the ds will use the compare
    //method of the comparator class to sort and compare the objects as shown in the comparator file in this folder
    
}