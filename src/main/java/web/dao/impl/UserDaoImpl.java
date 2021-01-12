package web.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDao;
import web.model.Role;
import web.model.User;

import java.util.List;

@Repository
@Transactional
public class UserDaoImpl implements UserDao {

    private SessionFactory sessionFactory;

    public UserDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addUser(User user) {
        sessionFactory.getCurrentSession().save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return sessionFactory.getCurrentSession().createQuery("from User u order by u.id ASC").list();
    }

    @Override
    public void deleteUser(User user) {
        sessionFactory.getCurrentSession().delete(user);
    }

    @Override
    public void updateUser(User user) {
        sessionFactory.getCurrentSession().saveOrUpdate(user);
    }

    @Override
    public User getUserById(Long id) {
        return sessionFactory.getCurrentSession().get(User.class, id);
    }

    @Override
    public User getUserByName(String name) {
        return sessionFactory.getCurrentSession().createQuery("from User where username = '" + name + "'", User.class).getSingleResult();
    }

    @Override
    public Role getRoleByName(String role) {
        return sessionFactory.getCurrentSession().createQuery("from Role where name = '" + role + "'", Role.class).getSingleResult();
    }

    @Override
    public void addRole(Role role) {
        sessionFactory.getCurrentSession().saveOrUpdate(role);
    }
}
