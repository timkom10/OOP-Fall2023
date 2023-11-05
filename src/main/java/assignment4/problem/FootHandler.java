package assignment4.problem;



public class FootHandler implements Handler{
    private Handler chain;
    @Override
    public void setNextChain(Handler nextChain) {
        this.chain=nextChain;
    }

    @Override
    public double goNext(double km, String unit) throws Exception {
        if (unit.equals("Foot")){
            return km * 3280.84;
        }
        else{
            return this.chain.goNext(km, unit);
        }
    }

}
