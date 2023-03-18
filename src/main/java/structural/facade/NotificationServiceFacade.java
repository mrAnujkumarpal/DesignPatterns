package structural.facade;

public class NotificationServiceFacade {

    private SmsNotification smsNotification;
    private EmailNotification emailNotification;

    public NotificationServiceFacade() {
        this.smsNotification = new SmsNotification();
        this.emailNotification = new EmailNotification();
    }

    public void sendEmail(){
        emailNotification.notifyUser();
    }
    public void sendSMS(){
        smsNotification.notifyUser();
    }
}
