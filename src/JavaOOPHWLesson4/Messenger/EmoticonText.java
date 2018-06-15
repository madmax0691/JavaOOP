package JavaOOPHWLesson4.Messenger;

public class EmoticonText implements Text {
    private final String text;

    public EmoticonText(String text) {
        this.text = text;
    }

    @Override
    public String getText() {
        if (text.equals("winking-face")) {
            return "\uD83D\uDE09";
        } else {
            return "\uD83D\uDC7B";
        }
    }
}
