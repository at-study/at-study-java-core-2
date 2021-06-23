package lections.lesson8.crud.dao.crud;

import lections.lesson8.crud.model.Entity;

public interface Crud<T extends Entity> extends Create<T>, Read<T>, Update<T>, Delete {

}
