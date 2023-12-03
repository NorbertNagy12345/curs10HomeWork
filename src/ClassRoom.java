import java.util.ArrayList;
import java.util.List;

class ClassRoom {
    private List<Student> student;

    public ClassRoom(List<Student> student) {
        this.student = student;
    }

    public List<Integer> getGradesForDiscipline(String discipline) {
        List<Integer> grades = new ArrayList<>();
        for (Student students : student) {
            if (students.getDiscipline().equals(discipline)) {
                grades.add(students.getGrade());
            }
        }
        return grades;
    }

    public List<Integer> getGradesForStudent(String studentName) {
        List<Integer> grades = new ArrayList<>();
        for (Student students : student) {
            if (students.getName().equals(studentName)) {
                grades.add(students.getGrade());
            }
        }
        return grades;
    }

    public Student getMaxGrade(String discipline) {
        Student maxGrade = null;
        int max = Integer.MIN_VALUE;
        for (Student students : student) {
            if (students.getDiscipline().equals(discipline) && students.getGrade() > max) {
                max = students.getGrade();
                maxGrade = students;
            }
        }
        return maxGrade;
    }

    public Student getMaxGrade() {
        Student maxGrade = null;
        int max = Integer.MIN_VALUE;
        for (Student students : student) {
            if (students.getGrade() > max) {
                max = students.getGrade();
                maxGrade = students;
            }
        }
        return maxGrade;
    }

    public int getAverageGrade(String discipline) {
        int sum = 0;
        int count = 0;
        for (Student students : student) {
            if (students.getDiscipline().equals(discipline)) {
                sum += students.getGrade();
                count++;
            }
        }
        return count == 0 ? 0 : sum / count;
    }

    public Student getWorstGrade(String discipline) {
        Student worstGrade = null;
        int min = Integer.MAX_VALUE;
        for (Student students : student) {
            if (students.getDiscipline().equals(discipline) && students.getGrade() < min) {
                min = students.getGrade();
                worstGrade = students;
            }
        }
        return worstGrade;
    }
}