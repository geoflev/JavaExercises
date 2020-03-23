import java.util.Comparator;

public class StudentComparatorName  implements Comparator<Student> {

    @Override
    public int compare(Student student, Student t1) {
        int result = student.getName().compareTo(t1.getName());
        if(result == 0){
            result = student.getAge() - t1.getAge();
        }
        if(result == 0){
            result = student.getGrade() - t1.getGrade();
        }
        return result;
    }
    //edw thelw na kanw taksinomisi se sxesi me to name
}
