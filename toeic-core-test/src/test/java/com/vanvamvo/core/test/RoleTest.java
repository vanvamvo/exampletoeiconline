package com.vanvamvo.core.test;

import com.vanvamvo.core.dao.RoleDAO;
import com.vanvamvo.core.daoimpl.RoleDAOImpl;
import com.vanvamvo.core.persistence.entity.RoleEntity;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by VanNguyen on 25/07/2017.
 */
public class RoleTest {
    @Test
    public void checkFindAll() {
        RoleDAO roleDAO=new RoleDAOImpl();
        List<RoleEntity> list=roleDAO.findAll();
    }

    @Test
    public void checkUpdate(){
        RoleDAO roleDAO=new RoleDAOImpl();
        RoleEntity roleEntity = new RoleEntity();
        roleEntity.setRoleId(2);
        roleEntity.setName("USER");
        roleDAO.update(roleEntity);
    }

    @Test
    public void checkSave() {
        RoleDAO roleDAO = new RoleDAOImpl();
        RoleEntity roleEntity = new RoleEntity();
        roleEntity.setRoleId(3);
        roleEntity.setName("MANAGER");
        roleDAO.save(roleEntity);
    }

    @Test
    public void checkFindById() {
        RoleDAO roleDAO = new RoleDAOImpl();
        RoleEntity roleEntity = roleDAO.findById(1);
    }

    @Test
    public void checkFindByProperty() {
        RoleDAO roleDAO = new RoleDAOImpl();
        String property=null;
        Object value=null;
        String sortExpression=null;
        String sortDirection=null;
        Object[] objects=roleDAO.findByProperty(property,value,sortExpression,sortDirection,0,100);
    }

    @Test
    public void checkDelete()
    {
        List<Integer> listId=new ArrayList<Integer>();
        listId.add(3);
        listId.add(2);
        RoleDAO roleDAO=new RoleDAOImpl();
        Integer count=roleDAO.delete(listId);
    }
}
