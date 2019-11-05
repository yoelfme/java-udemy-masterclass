package academy.learnprogramming;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Album {
    private String name;
    private String artist;
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }

    public boolean addSong(String title, double duration) {
        return this.songs.add(new Song(title, duration));
    }

    public boolean addToPlayList(int trackNumber, List<Song> playlist) {
        Song checkedSong = this.songs.findSong(trackNumber);

        if (checkedSong != null) {
            playlist.add(checkedSong);
            return true;
        }

        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlayList(String title, List<Song> playlist) {
        Song checkedSong = this.songs.findSong(title);

        if (checkedSong != null) {
            return playlist.add(checkedSong);
        }

        System.out.println("The song " + title + " is not in this album: " + this.name + " by " + this.artist);
        return false;
    }

    private class SongList {
        private ArrayList<Song> songs;

        public SongList() {
            this.songs = new ArrayList<>();
        }

        public boolean add(Song song) {
            if (this.songs.contains(song)) {
                return false;
            }

            return this.songs.add(song);
        }

        private Song findSong(String title) {
            for (Song song: this.songs) {
                if (song.getTitle().equals(title)) {
                    return song;
                }
            }

            return null;
        }

        public Song findSong(int trackNumber) {
            int index = trackNumber - 1;

            if (index >= 0 && index < this.songs.size()) {
                return songs.get(index);
            }

            return null;
        }
    }
}
