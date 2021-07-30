package lections.lesson12.widget;

import com.google.gson.annotations.SerializedName;

public class Window {
    private String title;
    private String name;
    private Integer width;
    private Integer height;

    @SerializedName("object")
    private Pairs pairs;

    public Window(String title, String name, Integer width, Integer height, Pairs pairs) {
        this.title = title;
        this.name = name;
        this.width = width;
        this.height = height;
        this.pairs = pairs;
    }

    public String getTitle() {
        return title;
    }

    public String getName() {
        return name;
    }

    public Integer getWidth() {
        return width;
    }

    public Integer getHeight() {
        return height;
    }

    public Pairs getPairs() {
        return pairs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Window window = (Window) o;

        if (title != null ? !title.equals(window.title) : window.title != null) {
            return false;
        }
        if (name != null ? !name.equals(window.name) : window.name != null) {
            return false;
        }
        if (width != null ? !width.equals(window.width) : window.width != null) {
            return false;
        }
        if (height != null ? !height.equals(window.height) : window.height != null) {
            return false;
        }
        return pairs != null ? pairs.equals(window.pairs) : window.pairs == null;
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (width != null ? width.hashCode() : 0);
        result = 31 * result + (height != null ? height.hashCode() : 0);
        result = 31 * result + (pairs != null ? pairs.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Window{" +
                "title='" + title + '\'' +
                ", name='" + name + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", pairs=" + pairs +
                '}';
    }
}
