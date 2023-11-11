package assignment4.problem;



public class FootHandler implements Handler{
    private Handler chain;
    @Override
    public void setNextChain(Handler nextChain) {
        this.chain=nextChain;
    }

    @Override
    public String goNext(String km, String unit) throws Exception {
        if (unit.equals("Foot")){
            return String.valueOf(Double.parseDouble(km) * 3280.84);
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
