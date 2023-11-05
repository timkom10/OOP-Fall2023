package assignment4.problem;

public interface Handler {

    public void setNextChain(Handler nextChain);

    public void goNext();
}
