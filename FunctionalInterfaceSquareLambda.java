interface square{
    int calculate(int x);
}
public class FunctionalInterfaceSquareLambda {
    public static void main(String[]args){
        square x1=x -> x*x;
        System.out.println("Calculate Square: "+x1.calculate(6));

    }

}
