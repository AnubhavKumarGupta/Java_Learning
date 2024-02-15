class Person{
    String name;
    String gender;
    String age;
    public Person(String name,String gender,String age) {
                   this.name = name;
                   this.gender = gender;
                   this.age = age;
    }
    @Override
    public String toString() {
return " Name: " +name+ " Gender: " +gender+ " Age: " +age;
}
}
class Student extends Person {
    String rollno;
    public Student(String name,String gender,String age,String rollno) {
                   super(name,gender,age);
                   this.rollno = rollno;
    }
    @Override
    public String toString() {
return " Name: " +name+ " Gender: " +gender+ " Age: " +age+ " RollNo: "+rollno;
}
}
class Teacher extends Person {
    String idno;
    public Teacher(String name, String gender, String age,String idno) {
                   super(name, gender, age);
                   this.idno = idno;
    }
    @Override
    public String toString() {
return " Name: " +name+ " Gender: " +gender+ " Age: " +age+ " IdNo: "+idno;
}
}
class Qus2 {
    public static void main(String[] args) {
                   Person arr[] = new Person[10];
                   arr[0] = new Student("Rahul","Male","18","18700119065");
                   arr[1] = new Teacher("Mr.S.Roy","Male","48","16781");
                   arr[2] = new Student("Hrit","Male","21","18700112715");
                   arr[3] = new Teacher("Mr.D.Maji","Female","38","17370");
                   arr[4] = new Student("Tuhin","Male","19","18700116547");
                   for(int i=0; i<5; i++) {
                                 System.out.println(arr[i].toString());
                   }
    }
}
