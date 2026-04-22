package oops.inheritance;

public class Phone {

    public void makeCall(){
        System.out.println("Connecting via cellular network... ");
    }
}

class SmartPhone extends Phone{
    @Override
    public void makeCall(){
        System.out.println("Connecting with wi-fi");
    }

    public void browseInternet()
    {
        System.out.println("Opening Chrome...");
    }

    public static void main(String[] args) {
        SmartPhone ph = new SmartPhone();
        ph.makeCall();
        ph.browseInternet();
    }
}




