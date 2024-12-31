
class Calculator{
    int a;
    int b;
    public int add(int num1, int num2){
        int r = num1 + num2;
        return r;
    }
}

public class objects {
    public static void main(String[] args) {
        int x = 5; 
        int y =4;
        Calculator calc = new Calculator();
        int result = calc.add(x, y);
        System.out.println(result);

    }
}
