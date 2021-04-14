package homework_solution.lesson8.task4.entities;

import homework_solution.lesson8.task4.validator.ValidatorStub;

public abstract class Entity implements Validatable {
    protected String uuid;
    protected String name;

    public Entity(String name) {
        this.name = name;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Override
    public void validate() {
        ValidatorStub.validateEntity(this);
    }
}
