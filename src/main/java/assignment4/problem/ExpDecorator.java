package assignment4.problem;

import java.text.DecimalFormat;
import java.text.NumberFormat;
public class ExpDecorator extends HandlerDecorator{
    HandlerDecorator nextDecorator;
    ExpDecorator(Handler handler) {
        super(handler);
        this.nextDecorator = new UnitDecorator(handler);
    }

    public String goNext(String km, String unit) throws Exception {
        NumberFormat numformat = new DecimalFormat("0.#####################E0");
        return this.nextDecorator.goNext(numformat.format(Double.valueOf(km)), unit);
    }
}
