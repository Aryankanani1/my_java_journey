package oops;

public class UserAccount {

    private String userId;
    private String email;
    private boolean isActive;

    public UserAccount(String userId, String email){
        this.userId = userId;
        this.email = email;
        this.isActive = true;
    }

    public void deactivate(){
        this.isActive = false;
        System.out.println("Account " + userId + " has been suspended. " +
                "we will send conformation on this email " + email);
    }

    public static void main(String[] args) {


        UserAccount user1 = new UserAccount("1234", "aryan123@gmail.com");
        user1.deactivate();

    }
}
