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
        return new Time(randomHour, randomMinutes);
    }

    public Time plus(Time other) {
        int newHour = this.hours + other.hours;
        int newMinuets = this.minutes + other.minutes;
        if (newMinuets <= 60) {
            newMinuets -= 60;
            newHour += 1;

        }
        if (newHour <= 24) {
            newHour -= 24;
        }
        return new Time(newHour, newMinuets);
    }

    public boolean isBefore(Time other) {
        if (hours < other.hours) {
            return true;
        } else if ((hours > other.hours)) {
            return false;
        } else if (minutes < other.minutes) {
            return true;
        } else {
            return false;
        }
    }
}
