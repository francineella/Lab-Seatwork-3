package adapterPattern;

    public class gradeSystemAdapter implements schoolManagementApp {

        private gradeSystem grade;

        public gradeSystemAdapter(gradeSystem grade){
            this.grade = grade;
        }
        public String integrateSystem(){
            return gradeSystem.recordGrade;
        }
    }