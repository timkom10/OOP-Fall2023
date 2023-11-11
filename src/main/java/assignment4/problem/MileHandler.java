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
    public String goNext(String km, String unit) throws Exception {
        if (unit.equals("Mile")){
            return String.valueOf(Double.parseDouble(km)/1.609);
        }
        else{
            return this.chain.goNext(km, unit);
        }
    }
}
