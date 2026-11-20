public class JavaObjectClass extends Object {
    public static void main(String[] args) {

        JavaObjectClass obj = new JavaObjectClass();
        //Each class in java is a "Object", i.e. it is an instance of the Object class. 
        //The Object class is the root class of the Java class hierarchy. 
        //Every class has Object as a superclass. All objects, including arrays, 
        //implement the methods of this class.
 
        //hashCode() method returns a hash code value for the object. 
        System.out.println("HashCode: " + obj.hashCode());
        //this hashcode is used in basic comaprison of objects and in hash tables like HashMap, HashSet, etc.
        //we can override this method to provide our own implementation of hashcode for our class.
        //so that it can be used in hash tables like HashMap, HashSet, etc. for custom filtering and comparison of objects.

        //getClass() method returns the runtime class of the object.
        System.out.println("Class Name: " + obj.getClass());

        //toString() method returns a string representation of the object.
        System.out.println("ToString: " + obj.toString());
        //this method can be overridden to have our own implementation 
        //which can be used to provide a meaningful string representation of the object
        //this method is by default attached to every class in java and can be used to print the object in a meaningful way
        //such as printing the values of the fields of the object

        //equals() method compares the specified object with this object for equality.
        System.out.println("Equals: " + obj.equals(new JavaObjectClass()));
        //this method can be overridden to have our own implementation
        //to define what it means for two objects of our class to be equal
        //internally this methods uses the hashcode of the objects to compare them for equality
        //with combination of hashcode and equals method we can define our own custom comparison of objects for equality
        //this is very useful in all collection which uses the equals method to compare objects for equality by default

        //clone() method creates and returns a copy of this object
        JavaObjectClass obj2 = new JavaObjectClass();
        try {
            JavaObjectClass obj3 = (JavaObjectClass) obj2.clone();
            System.out.println("Cloned Object: " + obj3);
        } catch (CloneNotSupportedException e) {
            System.out.println("CloneNotSupportedException: " + e.getMessage());
        }

        //other methods of Object class are:
        //finalize() method is called by the garbage collector on an object when garbage collection determines that there are no more references to the object
        //notify() method wakes up a single thread that is waiting on this object's monitor
        //notifyAll() method wakes up all threads that are waiting on this object's monitor
        //wait() method causes the current thread to wait until another thread calls the notify() or notifyAll() method on this object

    }


}

/**
output:
HashCode: 925858445
Class Name: class JavaObjectClass
ToString: JavaObjectClass@372f7a8d
Equals: false
CloneNotSupportedException: JavaObjectClass
 */
