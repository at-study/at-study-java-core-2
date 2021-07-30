package lections.lesson12.widget;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class Image {

    @SerializedName("src")
    private String source;

    private String name;

    @SerializedName("hOffset")
    private List<Integer> horizontalOffset;

    @SerializedName("vOffset")
    private Integer verticalOffset;

    private String alignment;

    public Image(String source, String name, List<Integer> horizontalOffset, Integer verticalOffset, String alignment) {
        this.source = source;
        this.name = name;
        this.horizontalOffset = horizontalOffset;
        this.verticalOffset = verticalOffset;
        this.alignment = alignment;
    }

    public String getSource() {
        return source;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getHorizontalOffset() {
        return horizontalOffset;
    }

    public Integer getVerticalOffset() {
        return verticalOffset;
    }

    public String getAlignment() {
        return alignment;
    }
}
