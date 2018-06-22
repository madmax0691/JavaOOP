package JavaOOPHWLesson5.FileSystem;

class File extends NamedFSItem {
    private int size;


    public File(String name, int size) {
        super(name);
        this.size = size;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "File​{" +
                "size=" + size +
                "} " + super.toString();
    }
}