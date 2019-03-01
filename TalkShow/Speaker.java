package TalkShow;

public class Speaker {
    protected String voice="Speak";
    public void talk(){
        for(int i =0; i<3;i++){
        speak();}
    }
    private void speak(){System.out.println(voice);};
}
