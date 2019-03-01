import TalkShow2.*;
import TalkShow.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        TalkShow.Narrator a = new TalkShow.Narrator();
        TalkShow2.Narrator b = new TalkShow2.Narrator();
        System.out.println("9:00 am - Morning show, with narrator a, begins");
        a.Interview();
        System.out.println("9:00 pm - Evening show, with narrator b, begins");
        b.Interview();
        new Scanner(System.in).next();
    }
}








//свой пакет
// защита и доступ
// импрт через