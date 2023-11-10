package assignment4.problem;

public interface Handler {

    public void setNextChain(Handler nextChain);

    public double goNext(double km, String unit) throws Exception;

    public Handler getChain();
}
