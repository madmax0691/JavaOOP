public class FileSystemRunner {
    public static void main(String[] args) {
        File​ file​ = new File​("hello.tx.", 10);
        SymLink symLink = new SymLink("my-doc.txt", file​);

        System.out.println(symLink.getName());

        Directory​ directory​ = new Directory​("Home");
        directory​.add(file​);

        System.out.println(file​.getSize());
        System.out.println(symLink.getSize());
        System.out.println(directory​);

        Directory​ dir = new Directory​("music");
        dir.add(new Directory​("classic"));
        Directory​ d1 = (Directory​) dir.getItems().get(0);
        d1.add(new File​("beethoven-symphony9.mp3", 4000));
        dir.add(new Directory​("rock"));
        Directory​ d2 = (Directory​) dir.getItems().get(1);
        d2.add(new File​("wind-of-change.mp3", 2000));
        d2.add(new File​("riders-on-the-storm.mp3", 2500));
        dir.add(new File​("unknown-music.mp3", 500));

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(dir);

        Directory​ d3 = new Directory​("d3");
        Directory​ d4 = new Directory​("d4");
        d4.add(d3);
        d3.add(d4);
    }
}
//my-doc.txt -> hello.tx.
//10
//1
//Directory​{items=[File​{size=10} NamedFSItem{name='hello.tx.'}]} NamedFSItem{name='Home'}
//Directory​{items=[File​{size=4000} NamedFSItem{name='beethoven-symphony9.mp3'}]} NamedFSItem{name='classic'}
//Directory​{items=[File​{size=2000} NamedFSItem{name='wind-of-change.mp3'}, File​{size=2500} NamedFSItem{name='riders-on-the-storm.mp3'}]} NamedFSItem{name='rock'}
//Directory​{items=[Directory​{items=[File​{size=4000} NamedFSItem{name='beethoven-symphony9.mp3'}]} NamedFSItem{name='classic'}, Directory​{items=[File​{size=2000} NamedFSItem{name='wind-of-change.mp3'}, File​{size=2500} NamedFSItem{name='riders-on-the-storm.mp3'}]} NamedFSItem{name='rock'}, File​{size=500} NamedFSItem{name='unknown-music.mp3'}]} NamedFSItem{name='music'}
//Exception in thread "main" java.lang.IllegalArgumentException
//	at JavaOOPHWLesson5.FileSystem.Directory.add(Directory​.java:16)
//	at JavaOOPHWLesson5.FileSystem.FileSystemRunner.main(FileSystemRunner.java:34)
//
//Process finished with exit code 1