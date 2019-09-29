/**
 * A subclass of TimedMedium initializing the audio.
 *
 * @author  Jeremy Gonzales
 * @version February 24, 2019
 */
import java.util.Objects;

public class Audio extends TimedMedium {

    private String album;

    /**
     * Returns the name of the album the audio was in.
     * @return the name of the album
     */
    public String getAlbum() {
        return album;
    }

    /**
     * Changes the album to a given name.
     * @param album name of the album
     */
    public void setAlbum(String album) {
        this.album = album;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Audio audio = (Audio) o;
        return album.equals(audio.album);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), album);
    }

    @Override
    public String toString() {
        return super.toString() + "\nAlbum: " + album + "\n";
    }

    /**
     * Constructs and initializes the configurations.
     * @param title     title of the medium
     * @param creator   creator of the medium
     * @param year      year published
     * @param album     name of the album
     */
    public Audio(String title, String creator, int year, Time t, String album) {
        super(title, creator, year, t);
        this.album = album;
    }

}
