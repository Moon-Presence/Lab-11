package TalkShow2;
import TalkShow.Speaker;


public class Narrator {
    public void Interview(){
        Speaker a = new Speaker();
        for(int i=0;i<2;i++) {
            speak();
            // for(int j=0;j<2;j++){System.out.println(a.voice); }
        }
        System.out.println("Interview failed");
        }

    private  static void speak(){System.out.println("Can you told?");};

}
