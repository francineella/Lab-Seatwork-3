package adapterPattern;

    public class attendanceSystemAdapter implements schoolManagementApp{

        private attendanceSystem attendance;

        public attendanceSystemAdapter(attendanceSystem attendance){
            this.attendance = attendance;
        }
        public String integrateSystem(){
            return attendance.markAttendance();
        }
    }