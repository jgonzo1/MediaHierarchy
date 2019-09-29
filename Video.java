/**
 * A subclass of TimedMedium initializing the video.
 *
 * @author  Jeremy Gonzales
 * @version February 24, 2019
 */
import java.util.Objects;

public class Video extends TimedMedium {

    private String resolution;

    /**
     * Returns the resolution.
     * @return the resolution
     */
    public String getResolution() {
        return resolution;
    }

    /**
     * Changes the resolution to a given value.
     * @param resolution resolution of the video.
     */
    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Video video = (Video) o;
        return resolution.equals(video.resolution);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), resolution);
    }

    @Override
    public String toString() {
        return super.toString() + "\nResolution: " + resolution + "\n" ;
    }

    /**
     * Constructs and initializes the configurations.
     * @param title     title of the medium
     * @param creator   creator of the medium
     * @param year      year published
     * @param resolution resolution of the video
     */
    public Video(String title, String creator, int year, Time t, String resolution) {
        super(title, creator, year, t);
        this.resolution = resolution;
    }
}
