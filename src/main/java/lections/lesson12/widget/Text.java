package lections.lesson12.widget;

import com.google.gson.annotations.SerializedName;

public class Text {
    private String data;
    private Integer size;
    private String style;
    private String name;

    @SerializedName("hOffset")
    private Integer horizontalOffset;

    @SerializedName("vOffset")
    private Integer verticalOffset;

    private String alignment;
    private String onMouseUp;

    public Text(String data, Integer size, String style, String name, Integer horizontalOffset, Integer verticalOffset, String alignment, String onMouseUp) {
        this.data = data;
        this.size = size;
        this.style = style;
        this.name = name;
        this.horizontalOffset = horizontalOffset;
        this.verticalOffset = verticalOffset;
        this.alignment = alignment;
        this.onMouseUp = onMouseUp;
    }

    public String getData() {
        return data;
    }

    public Integer getSize() {
        return size;
    }

    public String getStyle() {
        return style;
    }

    public String getName() {
        return name;
    }

    public Integer getHorizontalOffset() {
        return horizontalOffset;
    }

    public Integer getVerticalOffset() {
        return verticalOffset;
    }

    public String getAlignment() {
        return alignment;
    }

    public String getOnMouseUp() {
        return onMouseUp;
    }
}
