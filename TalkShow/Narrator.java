package TalkShow;

public class Narrator {
    public void Interview(){
        Speaker a = new Speaker();
        for(int i=0;i<2;i++){
        speak();
        a.talk();}
    }

    private  static void speak(){System.out.println("Can you told?");};

}
