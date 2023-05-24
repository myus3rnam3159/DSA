import java.util.List;

class GradingStudent {

    public static List<Integer> gradingStudents(List<Integer> grades) {

        for (int i = 0; i < grades.size(); i++) {

            int grade = grades.get(i);
            int diff = 5 - grade % 5;
                
            grade += diff;
            if (diff < 3 && grade >= 40) {

                grades.set(i, grade);
            }
        }

        return grades;
    }
}