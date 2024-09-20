package adapterPattern;

public class admin{

    public static void main(String[] args){

        attendanceSystem attendance = new attendanceSystem();
        integrateSystem attendanceSm = new attendanceSystemAdapter(attendanceSystem);

        gradeSystem grade = new gradeSystem();
        integrateSystem gradeSm = new gradeSystemAdapter(gradeSystem);

        librarySystem books = new librarySystem();
        integrateSystem booksSm = new librarySystemAdapter(librarySystem);

        System.out.println(attendanceSm.markAttendance());
        System.out.println(gradeSm.recordGrade());
        System.out.println(booksSm.manageBooks());
    }
}