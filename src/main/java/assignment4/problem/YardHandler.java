package assignment4.problem;

public class YardHandler implements Handler {

    private Handler chain;
    @Override
    public void setNextChain(Handler nextChain) {
        this.chain=nextChain;
    }

    @Override
    public double goNext(double km, String unit) throws Exception {
        if(unit.equals("Yard")){
            return km * 1093.61;
        }
        else{
            return this.chain.goNext(km, unit);
        }
    }
}
