package JavaOOPHWLesson5.FileSystem;

public class SymLink implements FSItem {
    private String symLinkName;
    private final FSItem item;

    public SymLink(String symLinkName, FSItem item) {
        this.symLinkName = symLinkName;
        this.item = item;
    }

    @Override
    public String getName() {
        return symLinkName + " -> " + item.getName();
    }

    @Override
    public int getSize() {
        return 1;
    }
}
