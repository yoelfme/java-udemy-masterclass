package academy.learnprogramming;

public class Printer {
    private int tonerLevel = 100;
    private int pagesPrinted = 0;
    private boolean isDuplex;

    public Printer(int tonerLevel, boolean isDuplex) {
        this.isDuplex = isDuplex;

        if (tonerLevel > 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }
    }

    public void fillUp(int tonerLevel) {
        if (this.tonerLevel + tonerLevel > 100) {
            System.out.println("We can't fill more than the capacity");
        } else {
            this.tonerLevel += tonerLevel;
            System.out.println("Toner filled up, now has " + this.tonerLevel + " level");
        }
    }

    public int print(int pages) {
        int pagesPrinted = pages;
        if (this.tonerLevel <= 0) {
            System.out.println("Toner empty, please fill out");
            return -1;
        }

        this.tonerLevel -= 1;

        if (isDuplex) {
            pagesPrinted = (pages / 2) + (pages % 2);
        }

        this.pagesPrinted += pagesPrinted;
        System.out.println("Printing...");

        return pagesPrinted;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
