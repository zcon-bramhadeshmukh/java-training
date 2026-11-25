import java.util.Comparator;

public class EmpSalaryComparator implements Comparator{
	//here anonymous class is used to implement the Comparator interface to sort the objects of Employee class based on salary.
	@Override
	public int compare(Object o1, Object o2) {
		//as here we using raw type, we need to perform downcasting
		Employee e1 = (Employee)o1;
		Employee e2 = (Employee)o2;
		
		return Double.compare(e1.salary, e2.salary);
		
	}

}