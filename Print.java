/**
 * A subclass of Medium initializing the print.
 *
 * @author  Jeremy Gonzales
 * @version February 24, 2019
 */
import java.util.Objects;

public class Print extends Medium {

    protected int pages;

    /**
     * Returns the pages.
     * @return the pages
     */
    public int getPages() {
        return pages;
    }

    /**
     * Changes the pages to the given value.
     * @param pages number of pages
     */
    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Print print = (Print) o;
        return pages == print.pages;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), pages);
    }

    @Override
    public String toString() {
        return super.toString() + "\nPages: " + pages + "\n";
    }

    /**
     * Constructs and initializes the configurations.
     * @param title     title of the medium
     * @param creator   creator of the medium
     * @param year      year published
     * @param pages     number of pages
     */
    public Print(String title, String creator, int year, int pages) {
        super(title, creator, year);
        this.pages = pages;
    }
}
