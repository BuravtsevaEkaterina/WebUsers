package web.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import web.dao.RoleDao;
import web.model.Role;

import javax.persistence.Query;

@Repository
public class RoleDaoImpl implements RoleDao {

    private SessionFactory sessionFactory;

    public RoleDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addRole(Role role) {
        sessionFactory.getCurrentSession().save(role);
    }

    @Override
    public Role getRoleByName(String role) {
        Query query = sessionFactory.getCurrentSession().createQuery("from Role where name = :role");
        query.setParameter("role", role);
        return (Role)query.getSingleResult();
    }
}
