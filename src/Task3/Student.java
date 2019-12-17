package Task3;

public class Student {
  @Save private  String name;
   @Save private int age;
    @Save  private String group;


    public Student(){}

    public Student(String name,int age , String group){
        this.name=name;
        this.age=age;
        this.group=group;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getGroup() {
        return group;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", group='" + group + '\'' +
                '}';
    }
}
