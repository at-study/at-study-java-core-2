package lections.lesson12.widget;

public class Widget {
    private String debug;
    private Window window;
    private Image image;
    private Text text;
    private Object metadata;

    public Widget(String debug, Window window, Image image, Text text, Object metadata) {
        this.debug = debug;
        this.window = window;
        this.image = image;
        this.text = text;
        this.metadata = metadata;
    }

    public String getDebug() {
        return debug;
    }

    public Window getWindow() {
        return window;
    }

    public Image getImage() {
        return image;
    }

    public Text getText() {
        return text;
    }

    public Object getMetadata() {
        return metadata;
    }

    @Override
    public String toString() {
        return "Widget{" +
                "debug='" + debug + '\'' +
                ", window=" + window +
                ", image=" + image +
                ", text=" + text +
                ", metadata=" + metadata +
                '}';
    }
}
