package structural.facade;

public interface Notification {

    void notifyUser();
}

class EmailNotification implements Notification {

    @Override
    public void notifyUser() {
        System.out.println("Send Email.....");
    }
}

class SmsNotification implements Notification {

    @Override
    public void notifyUser() {
        System.out.println("Send SMS....");
    }
}