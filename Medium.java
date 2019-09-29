/**
 * An abstract class initializing the medium.
 *
 * @author  Jeremy Gonzales
 * @version February 24, 2019
 */
import java.util.Objects;

public abstract class Medium {

    protected String title;
    protected String creator;
    protected int year;

    /**
     * Returns the Title.
     * @return title of the medium.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Changes the title to a given value.
     * @param title title of the medium.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Returns the creator.
     * @return the creator.
     */
    public String getCreator() {
        return creator;
    }

    /**
     * Changes the creator to a given value.
     * @param creator creator of the medium
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }

    /**
     * Returns the value of the year.
     * @return value of the year.
     */
    public int getYear() {
        return year;
    }

    /**
     * Changes the year to a given value.
     * @param year year published
     */
    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Title: " + title + "\nCreator: " + creator + "\nYear: " + year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Medium medium = (Medium) o;
        return year == medium.year &&
                title.equals(medium.title) &&
                creator.equals(medium.creator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, creator, year);
    }

    /**
     * Constructs and initializes the configurations.
     * @param title     title of the medium
     * @param creator   creator of the medium
     * @param year      year published
     */
    public Medium(String title, String creator, int year) {

        this.title = title;
        this.creator = creator;
        this.year = year;

    }

}
