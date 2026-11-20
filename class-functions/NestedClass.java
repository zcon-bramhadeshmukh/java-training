public class NestedClass {

    String str = "Outer field";

    class InnerClass {
        String str = "Inner Field";

        public void display() {
            System.out.println("Accessing outer class: " + str);
            System.out.println("Accessing inner class: " + NestedClass.this.str);
        }
    }

    public static void main(String[] args) {
        NestedClass outer = new NestedClass();
        NestedClass.InnerClass inner = outer.new InnerClass();
        inner.display();
    }
}   

/*
output:
Accessing outer class: Inner Field
Accessing inner class: Outer field
 */