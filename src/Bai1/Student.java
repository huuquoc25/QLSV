package Bai1;

public class Student implements Comparable<Student>{

    private String maSv;
    private String name;
    private String address;
    private int age;

    public Student() {
    }

    public Student(String maSv, String name, String address, int age) {
        this.maSv = maSv;
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public Student(String maSv) {
        this.maSv=maSv;
    }

    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "maSv='" + maSv + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.maSv.compareTo(o.maSv);
    }

}
