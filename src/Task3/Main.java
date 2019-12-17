package Task3;

public class Main {

    public static void main(String[] args) {
        Student stud = new Student("Andr" , 5 , "KN-3-3");

        Serialize serialize = new Serialize(stud);
Deserialize deserialize = new Deserialize("C:\\Users\\User\\Desktop\\ser.txt");

        try {
            serialize.serialize();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }


        try {
         Student student =   deserialize.deserial(Student.class);
            System.out.println("\nРезультат десереалізації : " + student);

        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }


    }

}
