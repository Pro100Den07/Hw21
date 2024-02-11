import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentManager {
    private Map<Student, List<Grade>> studentGrades;

    public StudentManager() {
        this.studentGrades = new HashMap<>();
    }

    public void addStudent(Student student) {
        this.studentGrades.put(student, new ArrayList<>());
    }

    public void addGrade(Student student, String subject, double value) {
        List<Grade> grades = this.studentGrades.get(student);
        if (grades != null) {
            grades.add(new Grade(subject, value));
        }
    }

    public double getAverageGrade(Student student) {
        List<Grade> grades = this.studentGrades.get(student);
        if (grades == null || grades.isEmpty()) {
            return 0;
        }
        double sum = 0;
        for (Grade grade : grades) {
            sum += grade.getValue();
        }
        return sum / grades.size();
    }
}