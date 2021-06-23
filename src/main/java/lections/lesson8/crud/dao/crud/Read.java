package lections.lesson8.crud.dao.crud;

import java.util.List;

import lections.lesson8.crud.model.Entity;

public interface Read<T extends Entity> {

    List<T> get();

    T get(int id);

}
