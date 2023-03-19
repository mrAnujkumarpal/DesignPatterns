package structural.facade;
/*
 The main difference between factory and facade design pattern is that factory is a creational design pattern
 that defines an interface or an abstract class to create an object, while the facade is a structural design pattern
 that provides a simplified interface to represent a set of interfaces in a subsystem to hide its complexity from
 the client.


 */
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
