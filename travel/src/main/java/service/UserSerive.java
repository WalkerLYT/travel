package service;

import domain.User;

public interface UserSerive {
    boolean regist(User user);
    public User login(User user);

}
