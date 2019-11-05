package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    ITelephone timPhone = new DeskPhone(1234567);

	    timPhone.powerOn();
	    timPhone.callPhone(1234567);
	    timPhone.answer();

	    ITelephone yoelPhone = new MobilePhone(45455656);
	    yoelPhone.callPhone(45455656);
	    yoelPhone.answer();
    }
}
