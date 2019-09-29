/**
 * A class initializing the time.
 *
 * @author  Jeremy Gonzales
 * @version February 24, 2019
 */
import java.util.Objects;

public class Time {

    private int hours;
    private int minutes;
    private int seconds;

    /**
     * Returns the hours.
     * @return the hours
     */
    public int getHours() {
        return hours;
    }

    /**
     * Returns the minutes.
     * @return the minutes
     */
    public int getMinutes() {
        return minutes;
    }

    /**
     * Returns the seconds.
     * @return the seconds
     */
    public int getSeconds() {
        return seconds;
    }

    /**
     * Returns the value of time in seconds.
     * @return the time in seconds
     */
    public int getTotalSeconds() {
        return ((hours * 3600) + (minutes * 60) + seconds);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Time time = (Time) o;
        return hours == time.hours &&
                minutes == time.minutes &&
                seconds == time.seconds;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hours, minutes, seconds);
    }

    @Override
    public String toString() {
        if (hours == 0) {
            return minutes + "m : " + seconds + "s";
        } else {
            return hours + "h : " + minutes + "m : " + seconds + "s";
        }

    }

    /**
     * Constructs and initializes the configurations.
     * @param hours     total hours
     * @param minutes   total minutes
     * @param seconds   total seconds
     */
    public Time(int hours, int minutes, int seconds) {

        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;

    }

}
