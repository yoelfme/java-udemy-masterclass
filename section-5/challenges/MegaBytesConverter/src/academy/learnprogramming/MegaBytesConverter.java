package academy.learnprogramming;

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
            return;
        }

        int kiloBytesInMega = 1024;
        int megaBytes = kiloBytes / kiloBytesInMega;
        int remainingKiloBytes = kiloBytes % kiloBytesInMega;

        System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKiloBytes + " KB");
    }
}
