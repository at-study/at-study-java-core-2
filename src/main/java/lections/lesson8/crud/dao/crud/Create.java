package lections.lesson8.crud.dao.crud;

import lections.lesson8.crud.model.Entity;

public interface Create<T extends Entity> {

    void create(T user);

}
