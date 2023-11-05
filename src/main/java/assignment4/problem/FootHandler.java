package assignment4.problem;



public class FootHandler implements Handler{
    private Handler chain;
    @Override
    public void setNextChain(Handler nextChain) {
        this.chain=nextChain;
    }

    @Override
    public void goNext() {
        this.chain.goNext();
    }

}
