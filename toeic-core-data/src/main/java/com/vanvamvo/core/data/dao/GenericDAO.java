package com.vanvamvo.core.data.dao;

import java.io.Serializable;
import java.util.List;

/**
 * Created by VanNguyen on 25/07/2017.
 */
public interface GenericDAO<ID extends Serializable,T> {
    List<T> findAll();
    T update(T entity);
    void save(T entity);
    T findById(ID id);
    Object[] findByProperty(String property, Object value, String sortExpression, String sortDirection, Integer offset, Integer limit);
    Integer delete(List<ID> ids);
}
