

@FunctionalInterface
interface A{
    void show(int x);
}

// lamda expression
/*
 * lamda expression only works with functional interface.
 * lamda expression reduce the code by replacing new Name(){ public void method(){} } with ()->{}
 * if we have only one line in curly brackets we can omit {} 
 * if we the only line is the return we can also omit the return keyword like (x, y) -> x + y;
 * if we have parameters in the method we can write the same in (datatype var) -> {}
 * if we have only one parameter we can omit the datatype and the round brackets as well like: var -> {}
 *
 */
public class lamdaExpression {
    public static void main(String[] args) {
        // normal way until Java 7
        A obj = new A(){
            public void show(int i){
                System.out.println("in show" + i);
            }
        };
        obj.show(4);
        
        
        // lamda expression
        A obj1 = (j) -> {
            System.out.println("in lamda show"+ j);
        };
        obj1.show(5);
        // as there is only one line we can remove the curly brackets
        A obj2 = k->System.out.println("in updated lamda show"+ k);
        obj2.show(6);
    }
}
