package adapterPattern;

public class admin{

    public static void main(String[] args){

        attendanceSystem attendance = new attendanceSystem();
        schoolManagementApp attendanceSm = new attendanceSystemAdapter(attendance);

        gradingSystem grade = new gradingSystem();
        schoolManagementApp gradeSm = new gradeSystemAdapter(grade);

        librarySystem books = new librarySystem();
        schoolManagementApp booksSm = new librarySystemAdapter(books);

        System.out.println(attendanceSm.integrateSystem());
        System.out.println(gradeSm.integrateSystem());
        System.out.println(booksSm.integrateSystem());
    }
}