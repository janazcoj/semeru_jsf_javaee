package edu.practica.model.dao;
import java.io.Serializable;
import java.util.List;
import org.hibernate.criterion.DetachedCriteria;

public interface InterfazDAO<T> {
    void save (T entity);
    void update (T entity);
    void remove(T entity);
    void merge (T entity);
    T getEntity(Serializable id);
    T getEntityByDechatedCriteria(DetachedCriteria  criteria);
    T getEntityByHQLQuery(String stringQuery);
    List<T> getEntities();
    List<T> getListByDatachedCriteria(DetachedCriteria  criteria);
}
