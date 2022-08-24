package com.kenzie.examples.week29.patterns.proxy;

class UserProxyHandler implements UserProxy{
    private boolean isLoggedIn;

    public UserProxyHandler(boolean isLoggedIn) {
        this.isLoggedIn = isLoggedIn;
    }

    @Override
    public User getUser() {
        User user;
        if (isLoggedIn) {
            user = new AuthorizedUser();
        } else {
            user = new GuestUser();
        }
        return user;
    }
}