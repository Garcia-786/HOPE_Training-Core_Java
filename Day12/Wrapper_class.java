package Day12;
/*
wrapper class uses:
1. To convert primitive data types into objects (boxing) and vice versa (unboxing).
*/
public class Wrapper_class {
    public static void main(String[] args) {
        Integer b=Integer.valueOf("123456");
        Integer c=Integer.parseInt("0987");
        int a=b.intValue();//unboxing
        System.out.println(b);
        System.out.println(c);
        System.out.println(b.doubleValue());
        System.out.println(a);
    }
}
