package com.kenzie.examples.week10_term2;

    // Class 1
    class Base {

        // Method
        public void display()
        {
            System.out.println("Base display()");
        }

    }
    public class AnnotationDemo extends Base {

        // Overriding method as already up in above class

        public void display(int x) {
            // Print statement when this method is called
            System.out.println("Derived display(int )");
        }

        // Method 2
        // Main driver method
        public static void main(String args[]) {
            // Creating object of this class inside main()
            AnnotationDemo obj = new AnnotationDemo();

            // Calling display() method inside main()
            obj.display();
        }
    }

