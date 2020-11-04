package genericity;

/**
 * @Version 1.0
 * @Author: Hu
 * @DATE: 2020/11/3
 * Content:
 */

class Person <T>{
    public T name ;
    public T IdCard;

    public Person(T name, T idCard) {
        this.name = name;
        IdCard = idCard;
    }
}
class Student<T> extends Person{
    public T name;

    public Student(Object name, Object idCard) {
        super(name, idCard);
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", IdCard=" + IdCard + ", name=" + name + '}';
    }
}
public class TestDemo {
    public static void main(String[] args) {
        Person<String> p = new Person<>("Java","123123");
        System.out.println(p);
        //Student<> stu = new Student<>("Java SE","123456789");
        //前边的<>没有添加类型会导致报错
        Student<String> stu = new Student<>("Java SE","123456789");
    }
}
