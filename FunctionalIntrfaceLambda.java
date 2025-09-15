interface StringLength{
    int getLength(String s);
}
public class FunctionalIntrfaceLambda {
    public static void main(String[]args){
        StringLength length=s->s.length();
        System.out.println("Length"+length.getLength("Hello World"));
    }

}
