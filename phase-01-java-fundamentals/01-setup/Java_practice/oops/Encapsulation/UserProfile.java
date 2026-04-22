package oops.Encapsulation;

public final class  UserProfile{

    private String cardNumber;

    public void setCardNumber(String cardNumber){
        this.cardNumber = cardNumber;
    }
// instead of returning the card
    public final String getCardNumber(){
        if(cardNumber == null){
            return "please enter the card number";
        } else if (cardNumber.length() < 4) {
            return "invalid card number";
        }

        String maskCard = cardNumber.substring(cardNumber.length() - 4);
        return "**** **** **** " + maskCard;
    }

    public static void main(String[] args) {
        UserProfile up = new UserProfile();
        up.setCardNumber("1234 2345 3456 4567");
        System.out.println(up.getCardNumber());
    }
}
