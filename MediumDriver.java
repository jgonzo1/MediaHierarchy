/**
 * A main class initializing and testing the methods.
 *
 * @author  Jeremy Gonzales
 * @version February 24, 2019
 */
import java.util.ArrayList;
import java.util.List;

public class MediumDriver {

    public static void main(String [] args) {
        Print got = new Print("A Game of Thrones", "George R.R. Martin", 1996, 694);
        Audio twop = new Audio("Two Princes", "Spin Doctors", 1991,
                new Time(0, 4, 16), "Pocket Full Of Kryptonite");
        Video monty = new Video("Monty Python and the Holy Grail", "Monty Python", 1975,
                new Time(1, 56, 16), "1920 x 1080");

        Time t = new Time(12, 16, 80);
        Time tcopy = new Time(12, 16, 80);

        //Copies
        Print gotcopy = new Print("A Game of Thrones", "George R.R. Martin", 1996, 694);
        Audio twopcopy = new Audio("Two Princes", "Spin Doctors", 1991,
                new Time(0, 4, 16), "Pocket Full Of Kryptonite");
        Video montycopy = new Video("Monty Python and the Holy Grail", "Monty Python", 1975,
                new Time(1, 56, 16), "1920 x 1080");

        List<Medium> list = new ArrayList<>();

        list.add(got);
        list.add(twop);
        list.add(monty);
        list.add(gotcopy);
        list.add(twopcopy);
        list.add(montycopy);

        for (Medium a: list) {
            System.out.println(a);
        }

        //Hashcode and equals testing
        System.out.println("Game of Thrones hash: " + got.hashCode());
        System.out.println("Two Princes hash: " + twop.hashCode());
        System.out.println("Monty Python hash: " + monty.hashCode());
        System.out.println("Game of Thrones copy hash: " + gotcopy.hashCode());
        System.out.println("Two Princes copy hash: " + twopcopy.hashCode());
        System.out.println("Monty Python copy hash: " + montycopy.hashCode());
        System.out.println("Game of Thrones copy equals: " + got.equals(gotcopy));
        System.out.println("Two Princes copy equals: " + twop.equals(twopcopy));
        System.out.println("Monty Python copy equals: " + monty.equals(montycopy));
        System.out.println("Game of Thrones copy not equals: " + got.equals(twop));
        System.out.println("Two Princes copy not equals: " + twop.equals(got));
        System.out.println("Monty Python copy not equals: " + monty.equals(twop));
        System.out.println("Time hash: " + t.hashCode());
        System.out.println("Time copy hash: " + tcopy.hashCode());
        System.out.println("Time copy equals: " + tcopy.equals(t));
        System.out.println("Time copy not equals: " + tcopy.equals(got));
        System.out.println();

        //Print Testing
        System.out.println(got.getTitle() + " " + got.getCreator() + " " + got.getYear() +  " " + got.getPages());
        got.setTitle("A Banana of Thrones");
        got.setCreator("John Martin");
        got.setYear(1998);
        got.setPages(800);
        System.out.println("Changed configs: " + got + "\n");

        //Audio Testing
        System.out.println(twop.getTitle() + " " + twop.getCreator() + " "
                + twop.getYear() +  " " + twop.getAlbum() + " " + twop.getTime());
        System.out.println("Total seconds: " + twop.getTotalSeconds());
        twop.setTitle("One Princess");
        twop.setCreator("Snake Doctors");
        twop.setAlbum("Yellow Jacket");
        twop.setYear(1996);
        System.out.println("hours: " + twop.getHours());
        System.out.println("minutes: " + twop.getMinutes());
        System.out.println("seconds: " + twop.getSeconds());
        twop.setTime(new Time(0,5,0));
        System.out.println("Changed configs: " + twop + "\n");


        //Video Testing
        System.out.println(monty.getTitle() + " " + monty.getCreator() + " "
                + monty.getYear() +  " " + monty.getResolution() + " " + monty.getTime());
        System.out.println("Total seconds: " + monty.getTotalSeconds());
        monty.setTitle("Lego Movie");
        monty.setCreator("me");
        monty.setYear(2019);
        monty.setTime(new Time(200, 69,5));
        System.out.println("Changed Time in seconds: " + monty.getTotalSeconds());
        System.out.println("hours: " + monty.getHours());
        System.out.println("minutes: " + monty.getMinutes());
        System.out.println("seconds: " + monty.getSeconds());
        monty.setResolution("4k");
        System.out.println("Changed configs: " + monty + "\n");

        //Time Testing
        System.out.println(t.getHours() + " " + t.getMinutes() + " " + t.getSeconds());
        System.out.println(t.getTotalSeconds());





    }

}
