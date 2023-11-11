package assignment4.problem;

public class HandlerDecorator implements Handler{

    public Handler handler;
    HandlerDecorator(Handler handler){
        this.handler = handler;
    }
    @Override
    public void setNextChain(Handler nextChain) {
        this.handler.setNextChain(nextChain);
    }

    @Override
    public String goNext(String km, String unit) throws Exception {
        return this.handler.goNext(km, unit);
    }

    @Override
    public Handler getChain() {
        return this.handler.getChain();
    }
}
