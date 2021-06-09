package lections.lesson6.enums;

public enum TrafficLightColor {
    RED("Красный"),
    YELLOW("Желтый"),
    GREEN("Зеленый"),
    UNKNOWN();

    private String description;

    TrafficLightColor(String description) {
        this.description = description;
    }

    TrafficLightColor() {

    }

    public String getDescription() {
        return description;
    }

    public static TrafficLightColor of(String description) {
        TrafficLightColor[] objects = values();
        for (TrafficLightColor color : objects) {
            if (color.description.equals(description)) {
                return color;
            }
        }
        throw new IllegalArgumentException("Нет объекта, соответствующего описанию " + description);
    }
}
