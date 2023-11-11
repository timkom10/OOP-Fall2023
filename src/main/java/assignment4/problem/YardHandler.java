package assignment4.problem;

public class YardHandler implements Handler {

    private Handler chain;
    @Override
    public void setNextChain(Handler nextChain) {
        this.chain=nextChain;
    }

    @Override
    public String goNext(String km, String unit) throws Exception {
        if(unit.equals("Yard")){
            return String.valueOf(Double.parseDouble(km)* 1093.61);
        }
        else{
            return this.chain.goNext(km, unit);
        }
    }

    @Override
    public Handler getChain() {
        return this.chain;
    }
}
