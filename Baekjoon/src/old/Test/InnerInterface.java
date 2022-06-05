package old.Test;

public class InnerInterface {
    OnClickLisnter listner;

    public void setListner(OnClickLisnter listner) {
        this.listner = listner;
    }

    void touch() {
        listner.onClick();
    }
}