package academy.learnprogramming;

import java.util.*;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<>();

    public static void main(String[] args) {
        Album album = new Album("The Academy", "The Avengers");

        album.addSong("Perreo en la luna", 4.25);
        album.addSong("Quizas", 3.30);

        albums.add(album);

        album = new Album("Oasis", "Bad Bunny & J Balvin");

        album.addSong("La Cancion", 3.30);
        album.addSong("Un peso", 4.30);
        album.addSong("Odio", 5.2);

        albums.add(album);

        LinkedList<Song> playList = new LinkedList<>();

        albums.get(0).addToPlayList("Quizas", playList);
        albums.get(1).addToPlayList("Odio", playList);
        albums.get(1).addToPlayList("Que pretendes", playList);
        albums.get(1).addToPlayList(1, playList);
        albums.get(1).addToPlayList(2, playList);
        albums.get(1).addToPlayList(10, playList);

        play(playList);

    }

    private static void play(LinkedList<Song> playList) {
        Scanner scanner = new Scanner(System.in);

        boolean quit = false;
        boolean forward = true;

        ListIterator<Song> listIterator = playList.listIterator();

        if (playList.isEmpty()) {
            System.out.println("No songs in playlist");
            scanner.close();
            return;
        }

        System.out.println("Now playing -> " + listIterator.next());

        printMenu();
        
        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            
            switch (action) {
                case 0:
                    System.out.println("Playlist complete.");
                    quit = true;
                    break;
                    
                case 1:
                    if (!forward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing -> " + listIterator.next());
                    } else {
                        System.out.println("We have reached the end of the playlist");
                        forward = false;
                    }
                    
                    break;
                    
                case 2:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }

                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing -> " + listIterator.previous());
                    } else {
                        System.out.println("We are at the start of the playlist");
                        forward = true;
                    }

                    break;

                case 3:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Now replaying -> " + listIterator.previous());
                            forward = false;
                        } else {
                            System.out.println("We are  the start of the list");
                        }
                    } else {
                        if (listIterator.hasNext()) {
                            System.out.println("Now replaying -> " + listIterator.next());
                            forward = true;
                        } else {
                            System.out.println("We have reached the end of the list");
                        }
                    }
                    break;
                    
                case 4:
                    printList(playList);
                    break;
                    
                case 5:
                    printMenu();
                    break;

                case 6:
                    if (!playList.isEmpty()) {
                        listIterator.remove();

                        if (listIterator.hasNext()) {
                            System.out.println("Now playing -> " + listIterator.next());
                            forward = true;
                        } else if (listIterator.hasPrevious()) {
                            System.out.println("Now playing -> " + listIterator.previous());
                            forward = false;
                        }
                    }
            }
        }
    }

    private static void printMenu() {
        System.out.println("Available actions:");
        System.out.println("0 - to quit");
        System.out.println("1 - to play next song");
        System.out.println("2 - to play previous song");
        System.out.println("3 - to replay the current song");
        System.out.println("4 - list songs in the playlist");
        System.out.println("5 - print available actions");
        System.out.println("6 - remove current song");
    }

    private static void printList(LinkedList<Song> playlist) {
//        Iterator<Song> iterator = playlist.iterator();

        System.out.println("======================");

        for (Song song : playlist) {
            System.out.println(song);
        }

        System.out.println("======================");
    }
}
