import java.util.Random;

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

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Time)) {
            return false;
        }
        Time other = (Time) obj;
        return (other.hours == this.hours) && (other.minutes == this.minutes);
    }

    @Override
    public String toString() {
        return String.format("%d : %d", hours, minutes);

    }

    public static Time Random() {
        Random rand = new Random();
        int randomHour = rand.nextInt(25);
        int randomMinutes = rand.nextInt(61);
        Object randomTime = new Time(randomHour, randomMinutes);
        return randomTime;
    }
}
