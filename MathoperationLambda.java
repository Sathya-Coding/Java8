interface mathoperation{
    int operation(int x, int y);
}
public class MathoperationLambda {
    public static void main(String[]args){
        mathoperation a=(x, y) -> x+y;
        mathoperation b=(x, y) -> x-y;
        mathoperation c=(x,y)-> x*y;
        System.out.println("Addition: "+ a.operation(5,10));
        System.out.println("Subtraction: "+b.operation(10,2));
        System.out.println("Multiplication: "+c.operation(3,3));
    }

}
