package assignment4.problem;

import java.text.DecimalFormat;
import java.text.NumberFormat;
public class ExpDecorator extends HandlerDecorator{
    UnitDecorator unitDecorator;
    ExpDecorator(Handler handler) {
        super(handler);
        this.unitDecorator = new UnitDecorator(handler);
    }

    public String goNext(String km, String unit) throws Exception {
        NumberFormat numformat = new DecimalFormat("0.#####################E0");
        return this.unitDecorator.goNext(numformat.format(Double.valueOf(km)), unit);
    }
}
