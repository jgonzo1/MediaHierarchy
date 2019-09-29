/**
 * An abstract subclass of Medium initializing the time.
 *
 * @author  Jeremy Gonzales
 * @version February 24, 2019
 */
public abstract class TimedMedium extends Medium {

    protected Time time;

    /**
     * Returns the time.
     * @return the time
     */
    public Time getTime() {
        return time;
    }

    /**
     * Returns the hours.
     * @return the hours
     */
    public int getHours() {
        return time.getHours();
    }

    /**
     * Returns the minutes.
     * @return the minutes
     */
    public int getMinutes() {
        return time.getMinutes();
    }

    /**
     * Returns the seconds.
     * @return the seconds
     */
    public int getSeconds() {
        return time.getSeconds();
    }

    /**
     * Returns the value of time in seconds.
     * @return the time in seconds
     */
    public int getTotalSeconds() {
        return time.getTotalSeconds();
    }

    /**
     * Changes the value of time to a given value.
     * @param t value of time
     */
    public void setTime(Time t) {
        this.time = t;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTime: " + time;
    }

    /**
     * Constructs and initializes the configurations.
     * @param title     title of the medium
     * @param creator   creator of the medium
     * @param year      year published
     * @param time      running time of the medium
     */
    public TimedMedium(String title, String creator, int year, Time time) {
        super(title, creator, year);
        this.time = time;
    }
}
