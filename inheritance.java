
class Calc{
    public int add(int x, int y){
        return x + y;
    }
    public int sub(int x, int y){
        return x-y;
    }
}


class AdvCalc extends Calc{
    public int mul(int x, int y){
        return x*y;
    }
    public int div(int x, int y){
        return x/y;
    }
}


public class inheritance {
    public static void main(String[] args) {
        AdvCalc ac = new AdvCalc();
        int a = ac.add(4,2);
        int b = ac.sub(4,2);
        int c = ac.mul(4,2);
        int d = ac.div(4,2);

        System.out.println(a + ", " + b + ", " + c + ", " +d );

    }
}


// single inheritance B extends A

// multi level inheritance B extends A and C extends B

// Java does not support multiple inheritance

// there is an indirect way to implement multiple inheritance