public class ExTreeMap {
    public static void main(String[] args) {
        EmpId id3 = new EmpId(3);
        EmployeeData e3 = new EmployeeData("Bramha", 50000);
        EmpId id2 = new EmpId(2);
        EmployeeData e2 = new EmployeeData("XYZ", 60000);
        EmpId id1 = new EmpId(1);
        EmployeeData e1 = new EmployeeData("ABC", 70000);
        java.util.TreeMap<EmpId, EmployeeData> map = new java.util.TreeMap<>();
        //we can use classes without importing them by using their fully qualified name as above

        //add
        map.put(id1, e1);
        map.put(id2, e2);
        map.put(id3, e3);

        //foreach
        for(EmpId id: map.keySet()) {
            System.out.println("Key: "+id+" Value: "+map.get(id));
        }
        
        //get
        System.out.println("Get: "+map.get(id1));

        //remove
        map.remove(id2);
        System.out.println("Map after removing id2: "+map);

        //update
        map.put(id1, new EmployeeData("PQR", 80000));
        System.out.println("Map after updating id1: "+map);

        //contains
        System.out.println("Contains key: "+map.containsKey(id1));
        System.out.println("Contains value: "+map.containsValue(new EmployeeData("Bramha", 50000)));

        //size
        System.out.println("Size: "+map.size());

        //isEmpty
        System.out.println("Is empty: "+map.isEmpty());

    }
}

/*
output:
Key: EmpId: 1 Value:  Name: ABC Salary: 70000.0
Key: EmpId: 2 Value:  Name: XYZ Salary: 60000.0
Key: EmpId: 3 Value:  Name: Bramha Salary: 50000.0
Get:  Name: ABC Salary: 70000.0
Map after removing id2: {EmpId: 1= Name: ABC Salary: 70000.0, EmpId: 3= Name: Bramha Salary: 50000.0}
Map after updating id1: {EmpId: 1= Name: PQR Salary: 80000.0, EmpId: 3= Name: Bramha Salary: 50000.0}
Contains key: true
Contains value: true
Size: 2
Is empty: false
*/