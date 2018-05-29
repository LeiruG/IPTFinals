package com.example.demo.dao;

import com.example.demo.entity.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Lucem on 27/05/2018.
 */

@Repository
@Transactional
public class UserDaoImpl implements UserDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void saveUser(User user) {
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.saveOrUpdate(user);
    }

    @Override
    public List<User> getUsers() {
        Session currentSession = sessionFactory.getCurrentSession();
        Query query = currentSession.createQuery("from User");
        List <User> users = query.list();
        return users;
    }

    @Override
    public boolean loginUser(User user) {
        Session session = sessionFactory.getCurrentSession();
        Query q = session.createQuery("from User user where user.username =:name and user.password =:pass");
        q.setString("name",user.getUsername());
        q.setString("pass",user.getPassword());
        if(q.list().isEmpty()){
            return false;
        }
        return true;
    }
}
