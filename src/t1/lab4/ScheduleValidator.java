package t1.lab4;


public class ScheduleValidator {
    public static void main(String[] args) {
        Appointment a1 = new Appointment("1215", "2030");
        Appointment a2 = new Appointment("0820", "1345");
        Appointment.sort(a1, a2)[0].check(Appointment.sort(a1, a2)[1]);
    }
}

class Appointment {
    private String startTime, endTime;

    public Appointment(String startTime, String endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                '}';
    }

    public static Appointment[] sort(Appointment a1, Appointment a2) {
        if (Integer.parseInt(a1.getStartTime()) < Integer.parseInt(a2.getStartTime())) {
            return new Appointment[]{a1, a2};
        } else {
            return new Appointment[]{a2, a1};
        }
    }


    public void check(Appointment another) {
        if (Integer.parseInt(this.getEndTime()) > Integer.parseInt(another.getStartTime())) {
            System.out.println(this.toString()+"-"+another.toString());
        } else {
            System.out.println("Perfectly scheduled!");
        }
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
}
