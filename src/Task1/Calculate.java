package Task1;

public class Calculate {


@AnnotationForMathOperation(num1 = 5,num2=10)
    public int  sum(int n1,int n2){
        return n1+n2;
    }

    @AnnotationForMathOperation(num1 = 5 , num2 = 10)
    public int  div(int n1, int n2){
        return n2-n1;
    }





}
