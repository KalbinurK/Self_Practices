package replitQ;

public class Calc {
    private int x;
    private int y;
    private int result;

    public void setX(int x){
        this.x=x;
    }
    public void setY(int y) {
        this.y=y;
    }
    public void plus(){
        result=x+y;

    }
    private void minus(){
        result=x-y;

    }
    public int getResult(){
        return result;
    }


}
