package Inheritance;


    class A{
        void display(){System.out.println("I am method from class A");}
    }
    class B extends A{
        void print(){System.out.println("I am method from class B");}
    }
    class C extends B{
        void react(){System.out.println("I am method from class C");}
    }
    class TestInheritance{
        public static void main(String args[]){

            C objC = new C();
            objC.display();
            objC.print();
            objC.react();
        }
    }
}
