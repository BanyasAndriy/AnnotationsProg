package Task2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {

        TextContainer textContainer = new TextContainer("Hello,World!!!!");





//textContainer.save("C:\\Users\\User\\Desktop\\file.txt");

        final Class<?> cl = TextContainer.class;
        try {
            Method method =  cl.getMethod("save", String.class);

            SaveTo save = cl.getAnnotation(SaveTo.class);

            Method[] methods = cl.getMethods();

            for (Method met: methods) {
                if(met.isAnnotationPresent(Saver.class)){
                    met.invoke(textContainer,save.path());
                }
            }


        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }finally {
            System.out.println("Congratulation!");
        }





    }
}
