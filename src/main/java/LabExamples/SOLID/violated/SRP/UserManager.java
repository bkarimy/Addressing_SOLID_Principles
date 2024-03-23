package LabExamples.SOLID.violated.SRP;

/**
 * UserManager class violates the Single Responsibility Principle by handling
 * both user management and email notifications.
 */
public class UserManager {
    /**
     * Registers a new user with the provided username and email.
     * @param username the username of the user
     * @param email the email address of the user
     */
    public void registerUser(String username, String email) {
    }

    /**
     * Sends an email to the user with the given message.
     * @param email the email address of the user
     * @param message the message to send
     */
    public void sendEmail(String email, String message) 
    }
}

