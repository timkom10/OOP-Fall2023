package assignment4.problem;

public class MileHandler implements Handler{
    private Handler chain;
    @Override
    public void setNextChain(Handler nextChain) {
        this.chain=nextChain;
    }

    public Handler getChain(){
        return this.chain;
    }
    @Override
    public double goNext(double km, String unit) throws Exception {
        if (unit.equals("Mile")){
            return km/1.609;
        }
        else{
            return this.chain.goNext(km, unit);
        }
    }
}
