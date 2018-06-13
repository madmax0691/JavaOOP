package JavaOOPHWLesson3;

//На основании UML диаграммы написать классы SongContent, Song, Playlist, User, реализовать методы.
//Создать тестовый класс MusicRunner, демонстрирующий работу предыдущих классов.

public class MusicRunner {
    public static void main(String[] args) {
        User user = new User("Max");

        //any content for songs
        byte contentOne[] = {1, 0, 1};
        byte contentTwo[] = {1, 1, 1};
        byte contentThree[] = {0, 0, 1};
        byte contentFour[] = {0, 1, 1};
        byte contentFive[] = {1, 1, 0};
        byte contentSix[] = {0, 0, 0};
        //check User's methods
        user.createPlaylist("PlaylistOne");
        user.addSongToPlaylist("PlaylistOne",
                new Song("Faith", "Calvin Harris", "Pop", 339, new AudioContent(contentOne)));
        user.addSongToPlaylist("PlaylistOne",
                new Song("Under Control", "Calvin Harris", "Pop", 304, new AudioContent(contentTwo)));
        user.addSongToPlaylist("PlaylistOne",
                new Song("Blame", "Calvin Harris", "Pop", 333, new AudioContent(contentThree)));

        user.createPlaylist("PlaylistTwo");
        user.addSongToPlaylist("PlaylistTwo",
                new Song("S&M", "Rihanna", "Pop", 403, new AudioContent(contentFour)));
        user.addSongToPlaylist("PlaylistTwo",
                new Song("What's My Name?", "Rihanna", "Pop", 423, new AudioContent(contentFive)));
        user.addSongToPlaylist("PlaylistTwo",
                new Song("Only Girl?", "Rihanna", "Pop", 355, new AudioContent(contentSix)));
        user.addSongToPlaylist("PlaylistTwo",
                new Song("Blame", "Calvin Harris", "Pop", 333, new AudioContent(contentThree)));

        System.out.println("User name is: " + user.getName());
        System.out.println(user.findByTitle("PlaylistOne"));
        System.out.println(user);
        //check Playlist's methods
        System.out.println(user.findByTitle("PlaylistOne").getTotalLength()); //976
        System.out.println(user.findByTitle("PlaylistTwo").findByAuthor("Calvin Harris"));//Blame
        System.out.println(user.findByTitle("PlaylistTwo").findByTitlePart("What's My Name?"));//Rihanna

        Song newSong = new Song("What's My Name?", "Rihanna", "Pop", 423, new AudioContent(contentFive));

        user.findByTitle("PlaylistOne").addSong(newSong);
        System.out.println(user.findByTitle("PlaylistOne"));
        //check Song's methods
        System.out.println(newSong.getAuthor());//Rihanna
        System.out.println(newSong.getTitle());//What's My Name?
        System.out.println(newSong.getLength());//423
        System.out.println(newSong.getContent());//1, 1, 0
    }
}
//Tests
//User name is: Max
//Playlist{title='PlaylistOne', songs=[Song{title='Faith', author='Calvin Harris', genre='Pop', length=339, content=[1, 0, 1]}, Song{title='Under Control', author='Calvin Harris', genre='Pop', length=304, content=[1, 1, 1]}, Song{title='Blame', author='Calvin Harris', genre='Pop', length=333, content=[0, 0, 1]}]}
//User{name='Max', playlists=[Playlist{title='PlaylistOne', songs=[Song{title='Faith', author='Calvin Harris', genre='Pop', length=339, content=[1, 0, 1]}, Song{title='Under Control', author='Calvin Harris', genre='Pop', length=304, content=[1, 1, 1]}, Song{title='Blame', author='Calvin Harris', genre='Pop', length=333, content=[0, 0, 1]}]}, Playlist{title='PlaylistTwo', songs=[Song{title='S&M', author='Rihanna', genre='Pop', length=403, content=[0, 1, 1]}, Song{title='What's My Name?', author='Rihanna', genre='Pop', length=423, content=[1, 1, 0]}, Song{title='Only Girl?', author='Rihanna', genre='Pop', length=355, content=[0, 0, 0]}, Song{title='Blame', author='Calvin Harris', genre='Pop', length=333, content=[0, 0, 1]}]}]}
//976
//[Song{title='Blame', author='Calvin Harris', genre='Pop', length=333, content=[0, 0, 1]}]
//[Song{title='What's My Name?', author='Rihanna', genre='Pop', length=423, content=[1, 1, 0]}]
//Playlist{title='PlaylistOne', songs=[Song{title='Faith', author='Calvin Harris', genre='Pop', length=339, content=[1, 0, 1]}, Song{title='Under Control', author='Calvin Harris', genre='Pop', length=304, content=[1, 1, 1]}, Song{title='Blame', author='Calvin Harris', genre='Pop', length=333, content=[0, 0, 1]}, Song{title='What's My Name?', author='Rihanna', genre='Pop', length=423, content=[1, 1, 0]}]}
//Rihanna
//What's My Name?
//423
//[1, 1, 0]
//
//Process finished with exit code 0