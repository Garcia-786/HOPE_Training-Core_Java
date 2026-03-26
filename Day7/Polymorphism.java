package Day7;

/* poly means many morph means form
polymophism means many forms(one thing existing in diff forms)
in coding it means one method can have many forms(1 method name but diff parameters)

two types:
1. compile time polymorphism/ method overloading
    -> method name is same but parameters are different
2. runtime polymorphism/ method overriding
    -> method name and parameters are same but body(class) is different

runtime means the method to be called is decided at runtime based on the object type
complie time means the method to be called is decided at compile time based on the reference type

overriding:
    @Override -> annotation to check if method is overriding or not
    simple example: parent class has method and child class has same method but diff body
    memory: parent class reference can point to child class object but child class reference cannot point to parent class object
        -> static: * parent class reference can point to parent class object but cannot point to child class object
                   * reference type is decided at compile time and object type is decided at runtime
        -> dynamic: * parent class reference can point to child class object but cannot point to parent class object
                    * reference type is decided at compile time and object type is decided at runtime
    complie time errors(in simple words):
        -> method name is different
        -> parameters are different
        -> return type is different   
    typecasting(in simple):
        -> upcasting: parent class reference can point to child class object but cannot point to parent class object
        -> downcasting: child class reference can point to parent class object but cannot point to child class object


    */

class Calculator{
    int add(int n1, int n2){
        return n1+n2;
    }
    int add(int n1, int n2, int n3){
        return n1+n2+n3;
    }
    double add(double n1, double n2){
        return n1+n2;
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Calculator c=new Calculator();
        System.out.println(c.add(7,8));
        System.out.println(c.add(3.7, 50));
        System.out.println(c.add(3, 50, 100));
    }
}
