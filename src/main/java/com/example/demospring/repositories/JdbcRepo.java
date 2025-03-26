package com.example.demospring.repositories;

import com.example.demospring.models.User;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Repository
public class JdbcRepo {
    JdbcTemplate jt;
    public JdbcRepo(JdbcTemplate jt) {
        this.jt = jt;
    }
    public List<User> getUsers(){
        return jt.query("SELECT * FROM users", BeanPropertyRowMapper.newInstance(User.class));
    }

    public User getUserById(long id){
        return jt.queryForObject("SELECT * FROM users WHERE id = ?", BeanPropertyRowMapper.newInstance(User.class), id);
    }

    public User getUserByEmail(String email){
        return jt.queryForObject("SELECT * FROM users WHERE email = ?", BeanPropertyRowMapper.newInstance(User.class), email);
    }

    public boolean checkIfExistsByEmail(String email){

        return jt.query("SELECT * FROM users WHERE email = ?", BeanPropertyRowMapper.newInstance(User.class), email).size() > 0;
    }

    public List<User> last5(){
        return jt.query("SELECT * FROM users ORDER BY id DESC LIMIT 5", BeanPropertyRowMapper.newInstance(User.class));
    }

    public int countByName(String name){
        return jt.query("SELECT COUNT(*) FROM users WHERE name = ?", Integer.class, name);
    }

    public ArrayList<User> getUsersByCharacters(String characters){
        return jt.query("SELECT * FROM users WHERE name LIKE '%?%'", BeanPropertyRowMapper.newInstance(User.class), characters);
    }
}
