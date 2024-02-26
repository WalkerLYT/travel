package dao.impl;

import dao.UserDao;
import domain.User;
import util.JDBCUtils;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class UserDaoImpl implements UserDao {

    private JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtils.getDataSource());

    @Override
    public User findByUsername(String username) {
        //1.定义sql
        String sql ="select * from tab_user where username= ?";
        //2.执行查询
        User user = null;
        try {
            user = jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<User>(User.class),username);
        } catch (DataAccessException e) {
//            e.printStackTrace();
        }
        return user;
    }

    @Override
    public void save(User user) {
    String sql ="insert into tab_user (username,password,name,birthday,sex,telephone,email) values (?,?,?,?,?,?,?)";

    jdbcTemplate.update(sql,
            user.getUsername(),
            user.getPassword(),
            user.getName(),
            user.getBirthday(),
            user.getSex(),
            user.getTelephone(),
            user.getEmail());
    }

    @Override
    public User findByUsernameAndPassword(String username, String password) {
        User user = null;

        try{
            String sql = "select * from tab_user where username = ? and password = ?";
            user = jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<User>(User.class),username,password);
        }catch (Exception e){

        }
        return user;
    }
}
