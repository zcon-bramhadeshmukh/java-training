public class StaticKeyword {

    static int a = 10;//static var
    int b = 20;//instance var

    static{
        System.out.println("static block, auto executes when class is loaded");
    }

    public static int cube(int x) {
        return x * x * x;
    }

    public void display() {
        System.out.println("value of a: " + a);
        a+=1;//non-static method can access/modify static var directly
    }

    public static void main(String[] args) {
        System.out.println("cube of 3: " + StaticKeyword.cube(3));
        StaticKeyword obj1 = new StaticKeyword();
        obj1.display();
        // System.out.println(StaticKeyword.b); //static method can't access/modify instance var directly
    }
}

/*
outut:
static block, auto executes when class is loaded
cube of 3: 27
value of a: 10
 */