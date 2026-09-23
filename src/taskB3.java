public class taskB3 {

    private taskB1 student;
    private taskB2 course;
    private Double grade;
    public taskB3(taskB1 student, taskB2 course) {
        this.student = student;
        this.course = course;
        this.grade = null;
    }
    public void assignGrade(double grade) {

        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        } else {
            throw new IllegalArgumentException(
                    "Ошибка: Оценка должна быть в диапазоне от 0 до 100!"
            );
        }
    }
    public void printSummary() {

        System.out.println(
                "Студент: " + student.getName() +
                        " | Курс: " + course.getTitle() +
                        " | Оценка: " +
                        (grade != null ? grade : "Не выставлена")
        );
    }
    public static void main(String[] args) {

        taskB1 student = new taskB1(
                "Абыл",
                "01",
                2.71
        );

        taskB2 course = new taskB2(
                "Java Programming",
                "CS01",
                5
        );

        taskB3 enrollment = new taskB3(
                student,
                course
        );

        enrollment.printSummary();
        enrollment.assignGrade(96);

        System.out.println();
        enrollment.printSummary();
    }
}

