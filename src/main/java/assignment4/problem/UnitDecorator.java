package assignment4.problem;

public class UnitDecorator extends HandlerDecorator{
    UnitDecorator(Handler handler) {
        super(handler);
    }
    @Override
    public String goNext(String km, String unit){
        if (unit.equals("Foot")){
            return km +" Feet";
        }
        return km +" " +  unit + "s";
    }
}
