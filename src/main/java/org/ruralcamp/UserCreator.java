package org.ruralcamp;

public class UserCreator {
    private PasswordCreator passwordCreator;

    public UserCreator(PasswordCreator passwordCreator) {
        this.passwordCreator = passwordCreator;
    }
    
    public User createUser(Long id, String name) {
        String password = passwordCreator.generatePassword();
        return new User(id, name, password);
    }
}