package service.impl;

import dao.UserDao;
import dao.impl.UserDaoImpl;
import domain.User;
import service.UserSerive;

public class UserServiceImpl implements UserSerive {

    private UserDao userDao = new UserDaoImpl();


    @Override
    public boolean regist(User user) {
        User byUsername = userDao.findByUsername(user.getUsername());
        if(byUsername != null){
            return false;
        }
        userDao.save(user);
        return true;
    }

    @Override
    public User login(User user) {
        return userDao.findByUsernameAndPassword(user.getUsername(),user.getPassword());
    }

}
