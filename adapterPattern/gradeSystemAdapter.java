package adapterPattern;

    public class gradeSystemAdapter implements schoolManagementApp {

        private gradingSystem grade;

        public gradeSystemAdapter(gradingSystem grade){
            this.grade = grade;
        }
        
        public String integrateSystem(){
            return grade.recordGrades();
        }
    }