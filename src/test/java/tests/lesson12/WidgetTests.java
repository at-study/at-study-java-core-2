package tests.lesson12;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import lections.lesson11.json.JsonUtils;
import lections.lesson12.FileUtils;
import lections.lesson12.widget.Pairs;
import lections.lesson12.widget.WidgetInfo;
import lections.lesson12.widget.Window;

public class WidgetTests {
    Window expectedWindow = new Window(
            "Sample Konfabulator Widget",
            "main_window",
            500,
            500,
            new Pairs("value1", "value2")
    );

    @Test
    public void testWidgetDeserialization() {
        String json = FileUtils.getFileContent("src/main/java/lections/lesson12/widget/widget.json");

        WidgetInfo widget = JsonUtils.deserialize(json, WidgetInfo.class);

        Assertions.assertEquals("on", widget.getWidget().getDebug());
        Assertions.assertEquals(expectedWindow, widget.getWidget().getWindow());

    }

}
