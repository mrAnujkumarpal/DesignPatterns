package structural.facade;

/*
A Facade Pattern says that just "just provide a unified and simplified interface to a set of interfaces in a subsystem,
therefore it hides the complexities of the subsystem from the client".

In other words, Facade Pattern describes a higher-level interface that makes the sub-system easier to use.


 Removes the need for client classes to manage a subsystem on their own, resulting in less coupling between the subsystem and the client classes.
Handles instantiation and redirection tasks to the appropriate class within the subsystem.
Provides client classes with a simplified interface for the subsystem.
Acts as a point of entry to a subsystem and does not add more functionality to the subsystem.
 */
public class FacadeClient {

    public static void main(String[] args) {

        NotificationServiceFacade facade=new NotificationServiceFacade();
        facade.sendEmail();
        facade.sendSMS();
    }

}
