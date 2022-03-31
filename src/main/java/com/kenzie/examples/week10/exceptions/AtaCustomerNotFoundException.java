package com.kenzie.examples.week10.exceptions;

public class AtaCustomerNotFoundException extends AtaUserException {
    private static final long serialVersionUID = 1952705374572855798L;
    private String username;
    /**
     * Constructs exception with username.
     * @param username - username representing customer ID
     */
    public AtaCustomerNotFoundException(String username) {
        super("User with " + username + " cannot be found.");
        this.username = username;
    }
    /**
     * Constructs exception with username, message and cause.
     * @param username - username representing customer ID
     * @param message - Description of the error encountered, in this case the requested customer could not be found.
     * @param cause - The Exception that caused this exception to be thrown. Used in Exception chaining.
     */
    public AtaCustomerNotFoundException(String username, String message, Throwable cause) {
        super("Username " + username + " cannot be found. " + message, cause);
        this.username = username;
    }
    /**
     * Constructs exception with username and message.
     * @param username - username representing customer ID
     * @param message - Description of the error encountered, in this case the requested customer could not be found.
     */
    public AtaCustomerNotFoundException(String username, String message) {
        super("Username " + username + " cannot be found. " + message);
        this.username = username;
    }
    /**
     * Constructs exception with username and cause.
     * @param username - username representing customer ID
     * @param cause - The Exception that caused this exception to be thrown. Used in Exception chaining.
     */
    public AtaCustomerNotFoundException(String username, Throwable cause) {
        super("User with " + username + " cannot be found.", cause);
        this.username = username;
    }
    public String getUsername() {
        return username;
    }

    public static void main(String[] args) throws AtaCustomerNotFoundException {
        throw new AtaCustomerNotFoundException("badusername", "The customer was not found.");
    }
}
