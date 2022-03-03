package com.kenzie.examples.composition;

import java.util.List;

/**
 * Contains the information about the specific Chime user.
 */
public interface ChimeUser {
    long getUserId();
    String getName();
    String getSurname();

    /**
     * Returns the list of all contacts for
     * the current user.
     * @return list of user contacts.
     */
    List<ChimeUser> getContacts();
}