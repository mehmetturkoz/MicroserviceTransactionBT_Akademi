package com.bt_akademi.transaction_management.model.service;

import java.util.List;

public interface EntityService<E, I> {

    List<E> getAll();

    //id ye göre bul
    E findByID(I id);

    E save(E entity);

    void delete(I id);

}
