public class Time {
    private int hours;
    private int minutes;

    public Time(int hours, int minutes) {
        if (hours > 0 && hours < 24) {
            this.hours = hours;
        } else {
            //throw
        }
        if (minutes > 0 && minutes < 60) {
            this.minutes = minutes;
        } else {
            //throw
        }
    }

    @Override
    public boolean equals (Object obj) {
        if (!(obj instanceof Time)) {
            return false;
        }
        Time other = (Time) obj;
        return (other.hours == this.hours) && (other.minutes == this.minutes);
    }
}
