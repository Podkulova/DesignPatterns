package src.behavioral.p23_observer;

public class UserObserver extends BaseObserver {
    private final String userName;

    public UserObserver(ChatChannel chatChannel, String userName) {
        super(chatChannel);
        this.userName = userName;
        System.out.println(userName + " is joining the " + chatChannel.getName());
    }

    public String getUserName() {
        return userName;
    }

    @Override
    public void handleMessage(String message, String userType) {
        if(!userType.equals("ADMIN")) {
            System.out.println(userName + " sees message: '" + message + "'");
        }
    }

    @Override
    public String getObserverType() {
        return "USER";
    }
}
