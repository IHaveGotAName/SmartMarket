package market.service.api;

import java.util.List;

/**
 * Created by ivegotaname on 04.12.16.
 */
public interface CrudService<T> {
    T findById(int id);

    List<T> findAll();

    void create(T t);

    void update(T t);

    void delete(T t);
}
