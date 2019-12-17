package Task1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {



    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {


        Calculate calculate = new Calculate();



        try {
            final Class<?> cl = Calculate.class;
            Method sum =  cl.getMethod("sum", int.class, int.class);

            AnnotationForMathOperation ann = sum.getAnnotation(AnnotationForMathOperation.class);


            Method [] methods = cl.getMethods();


            for (Method met: methods) {

                if (met.isAnnotationPresent(AnnotationForMathOperation.class)){
                    System.out.println( met.invoke(calculate,ann.num1(),ann.num2()));
                }
            }





        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }




      //  System.out.println(math.div(ann.num1(),ann.num2()));

       /* for (Method method: methods) {
            if(method.isAnnotationPresent(AnnotationForMathOperation.class)){
                System.out.println(method.invoke(math,ann.num1(),ann.num2()));
            }

        }
*/


    }
}
