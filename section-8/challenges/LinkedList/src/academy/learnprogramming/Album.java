package academy.learnprogramming;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public boolean addSong(String title, double duration) {
        if (findSong(title) == null) {
            this.songs.add(new Song(title, duration));
            return true;
        }

        return false;
    }

    private Song findSong(String title) {
        for (Song song: this.songs) {
            if (song.getTitle().equals(title)) {
                return song;
            }
        }

        return null;
    }

    public boolean addToPlayList(int trackNumber, List<Song> playlist) {
        int index = trackNumber - 1;

        if (index >= 0 && index <= this.songs.size()) {
            playlist.add(this.songs.get(index));

            return true;
        }

        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlayList(String title, List<Song> playlist) {
        Song song = findSong(title);

        if (song != null) {
            return playlist.add(song);
        }

        System.out.println("The song " + title + " is not in this album: " + this.name + " by " + this.artist);
        return false;
    }
}
