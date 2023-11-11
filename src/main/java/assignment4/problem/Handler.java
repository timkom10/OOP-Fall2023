package assignment4.problem;

public interface Handler {

    void setNextChain(Handler nextChain);

    String goNext(String km, String unit) throws Exception;

    Handler getChain();
}
