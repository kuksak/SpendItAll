package com.infy.saksh.controller;

import java.util.List;

/**
 * Created by Sakshi Kukreti on 01-05-2017.
 */
public interface DefaultController<T> {

    default T findById(Integer id) {
        return null;
    }

    List<T> findAll();

    Iterable<T> save(Iterable<T> objects);


}
