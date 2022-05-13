package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoHibernateImpl;

public class Main {
    public static void main(String[] args) {
        UserDaoHibernateImpl userDaoHibernate = new UserDaoHibernateImpl();

        userDaoHibernate.createUsersTable();
        userDaoHibernate.saveUser( "Michael", "Jordan", ((byte) 55));
        userDaoHibernate.saveUser( "King", "Arthur", ((byte) 130));
        userDaoHibernate.saveUser( "Mark", "Antony", ((byte) 55));
        userDaoHibernate.saveUser( "Octavian", "Augustus", ((byte) 55));

        System.out.println(userDaoHibernate.getAllUsers().toString());
        userDaoHibernate.cleanUsersTable();
        userDaoHibernate.dropUsersTable();
        

    }
}
