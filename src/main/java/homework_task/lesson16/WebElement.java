package homework_task.lesson16;

class WebElement implements Element {

    private static int count = 0;
    private int ordinal;

    public WebElement() {
        ordinal = ++count;
    }

    @Override
    public String getText() {
        return "Текст элемента под номером " + ordinal;
    }
}
