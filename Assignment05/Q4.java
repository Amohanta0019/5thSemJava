// Superclass
class SuperClass {
    void display() {
        System.out.println("This is the SuperClass method.");
    }
}

// Interface
interface MyInterface {
    void show();
}

public class Q4 {
    public static void main(String[] args) {
        // Anonymous Inner Class using Superclass
        SuperClass obj1 = new SuperClass() {
            @Override
            void display() {
                System.out.println("This is the overridden method of an Anonymous Inner Class using SuperClass.");
            }
        };
        obj1.display(); // Call the overridden method

        // Anonymous Inner Class using Interface
        MyInterface obj2 = new MyInterface() {
            @Override
            public void show() {
                System.out.println("This is the method of an Anonymous Inner Class using Interface.");
            }
        };
        obj2.show(); // Call the implemented method
    }
}

