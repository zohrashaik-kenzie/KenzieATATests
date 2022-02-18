package com.kenzie.examples.generics;

import com.kenzie.examples.polymorphism.Rectangle;

// We use < > to specify Parameter type
    class Test<T> {
        // An object of type T is declared
        T obj;
        Test(T obj) {
            this.obj = obj;
        } // constructor
        public T getObject() {
            return this.obj; }
    }

    class Test2<T, U>
    {
        T obj1;  // An object of type T
        U obj2;  // An object of type U

        // constructor
        Test2(T obj1, U obj2)
        {
            this.obj1 = obj1;
            this.obj2 = obj2;
        }

        // To print objects of T and U
        public void print()
        {
            System.out.println(obj1);
            System.out.println(obj2);
        }
    }

// Driver class to test above
    class GenericDemo {
    public static void main(String[] args) {
        // instance of Integer type
        Test<Integer> iObj = new Test<Integer>(15);
        System.out.println(iObj.getObject());

        // instance of String type
       Test<String> sObj
                = new Test<String>("SEBD Adanced ATA");
        System.out.println(sObj.getObject());

        Test2<String, Integer> obj2 = new Test2<String, Integer>("Week", 3);
        obj2.print();

        Test<Rectangle> rectangle = new Test<Rectangle>(new Rectangle(4,5));
        System.out.println(rectangle.getObject());
    }
}


