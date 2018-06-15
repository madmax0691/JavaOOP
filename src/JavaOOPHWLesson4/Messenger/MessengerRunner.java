package JavaOOPHWLesson4.Messenger;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class MessengerRunner {
    public static void main(String[] args) {
        Dialog dialog = new Dialog();
        Text textOne = new PlainText("Hello!");
        Text textTwo = new EmoticonText("winking-face");
        Text textThree = new PictureText("heart");
        Message messageOne = new Message("Max", LocalDateTime.now(), textOne);
        Message messageTwo = new Message("Max", LocalDateTime.now(), textTwo);
        Message messageThree = new Message("Kate", LocalDateTime.now(), textThree);
        dialog.addMessage(messageOne);
        dialog.addMessage(messageTwo);
        dialog.addMessage(messageThree);

        dialog.showDialog();
    }
}
//Test
//Max
//Hello!
//2018-06-15T22:46:08.427
//Max
//😉
//2018-06-15T22:46:08.556
//Kate
//________$$$$$$$$$$$___________$$$$$$$$$$$$_________
//______$$$$$$$$_____$$$$$___$$$$$$_____$$$$$$$______
//____$$$$$$$_____________$$$______________$$$$$_____
//___$$$$$$$_______________$_________________$$$$____
//__$$$$$$____________________________________$$$$___
//__$$$$$_____________________________________ $$$$__
//_$$$$$______________________________________$$$$$__
//_$$$$$_____________________________________$$$$$$__
//__$$$$$$_________________________________$$$$$$$___
//___$$$$$$$______________________________$$$$$$$____
//_____$$$$$$____________________________$$$$$$______
//_______$$$$$$________________________$$$$$$________
//__________$$$$$_____________________$$$$___________
//_____________$$$$_________________$$$$_____________
//_______________$$$$_____________$$$________________
//_________________$$$_________$$$___________________
//_________________ __$$$_____$$_____________________
//______________________$$__$$_______________________
//________________________$$_________________________
//2018-06-15T22:46:08.556
//
//Process finished with exit code 0