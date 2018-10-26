package reflect;

/**
 * @Description:
 * @Author：feipeng
 * @Date: 2017/6/16 11:00
 */

public class Employee {
    // 定义一个员工类　　
    public Employee() {
        age = 0;
        name = null;
    }
    // 将要被调用的方法　　
    public void setAge(int a) {
        age = a;
    }
    // 将要被调用的方法　　
    public int getAge() {
        return age;
    }
    // 将要被调用的方法
    public void printName(String n) {
        name = n;
        System.out.println("The reflect.Employee Name is: " + name);
    }
    private int age;
    private String name;
}
