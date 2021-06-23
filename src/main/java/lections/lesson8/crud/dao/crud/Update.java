package lections.lesson8.crud.dao.crud;

import lections.lesson8.crud.model.Entity;

public interface Update<T extends Entity> {

    void update(int id, T user);

}
