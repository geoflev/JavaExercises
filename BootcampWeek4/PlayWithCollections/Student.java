import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Student implements Comparable<Student> {

    private String name;
    private int age;
    private int grade;

    public Student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }


    public static List<Student> getLinkedListOfGeneralStudents(){
        LinkedList<Student> linkedListStudents = new LinkedList<>();
        linkedListStudents.add(new Student("Jack",15,80));
        linkedListStudents.add(new Student("Andy",18,85));
        linkedListStudents.add(new Student("Mary",17,95));
        return linkedListStudents;
    }
    public static List<Student> createStudent(){
        List<Student> ListOfStudents = new LinkedList<>();
        Student s1 = new Student("Nick", 15, 70);
        Student s2 = new Student("Nick", 15, 95);
        Student s3 = new Student("Mary", 18, 85);
        return ListOfStudents;
    }

    public static List<Student> getListOfJavaStudents(List<Student> list){
        LinkedList<Student> studentJava = new LinkedList(list);
        //studentJava.addAll(linkedListStudents);
        //h to ena h to allo
        //etsi ftiaxnw kainouria lista kai antigrafw ap tin palia se ayth
        //opote otan prosthetw stin java den to pairnei kai i arxiki

        studentJava.add(new Student("Johnathan",20,0));
        return studentJava;
    }

    public static void printListOfStudents(List<Student> list,String message){
        System.out.println(message);

        for(Student student : list){
            System.out.println(student);
        }
        //LinkedList<Student> studentJava = linkedListStudents;
        //studentJava kai linkedListStudents deixnoun stin idia lista
        //ara prosthetw sthn Java kai to pairnei kai i arxiki
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, grade);
    }
    //to hash tha paragetai oxi apo tis theseis mnimis alla apo ta name,age,grade an einai idia
    //prin to hashCode epeidi itan diaforetikes oi theseis mnimis stin main ektypwnontousan kai oi 3 mathites
    //kai as htan idioi oi nick me to equals.to metrouse me tis theseis mnimis
    //meta to hash toy les oti de thelw na to pigaineis me theseis mnimis alla me ta stoixeia

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                grade == student.grade &&
                name.equals(student.name);
    }
    //h equals chekarei an 2 objects einai idia
    //xwris tin equals s1 == s2 = false
    //me tin equals s1 == s2 = true

    @Override
    public int compareTo(Student o) {
        int result = -(this.grade - o.grade);       //an grade einai idia
        if(result == 0){
            result = this.age - o.age;
        }
        if(result == 0){                            //an exoun idia age diladi this.age - o.age == 0
            result = this.name.compareTo(o.name);   //taksinomise tous kata name
        }
        return result;
    }
    //sugkrinw to name autou pou me kalei me to name o
    //h compareTo bgazei apotelesma th diafora sto alfabito twn eisodwn tis
    //paradeigma b-b = 0, a-b = -1, z-a = 24
    //ara gia na sugkrinw me aage kanw ( int result = this.age - o.age;)
    //afou kanw implement thn compareTo gia na doulepsei to implement ths comparable
    //prepei na dwsw sto compareTo na katalabei me poio tropo thelw na kanei compare toys Students




}
