package broCodeJavaBasics;

class A{
    public void sum(int a, int b){
        System.out.println( a + b );
    }
}

class B extends A{
    public void sum(int a, int b, int c){
        System.out.println(a + b + c);
    }
}

public class Sample {
    public static void main(String[] args) {
        Sample s1 = new Sample();
        s1.fibonacci(10);

//        A a = new A();
//        a.sum(2,3);

        B b = new B();
        b.sum(2,3);
        b.sum(2,3,4);

    }
    public void fibonacci(int range){
        int firstNum = 0;
        int sum = 0;
        int j = 0;
        for(int i = 0; i < range; i++){
            sum = firstNum + j;
            firstNum = sum;
            j++;

            System.out.println(sum);
        }
    }
}


