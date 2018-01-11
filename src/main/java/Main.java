import java.io.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            Scanner scanner = new Scanner(new FileReader("src/main/resources/songs.txt"));
            ArrayList<Song> listOfSongs = new ArrayList();
            while (scanner.hasNext()) {
                String str = scanner.nextLine();
                Song song = Song.parseSong(str);
                listOfSongs.add(song);
            }

                //Sorting of a list by the name of a song
                Collections.sort(listOfSongs, new Comparator<Song>() {

                    public int compare(Song song, Song song2) {
                        String s1 = song.getNameOfTheSong();
                        String s2 = song2.getNameOfTheSong();
                        return s1.compareToIgnoreCase(s2);
                    }
                });

                //Print sorted list of the songs
                for (Song currentSong : listOfSongs) {
                    System.out.println(currentSong.getSinger());
                    System.out.println(currentSong.getNameOfTheSong());
                    System.out.println(currentSong.getTime());
                }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
