package assignment4.problem;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class RoundDecorator extends HandlerDecorator {
    ExpDecorator expDecorator;
    RoundDecorator(Handler handler) {
        super(handler);
        this.expDecorator = new ExpDecorator(handler);

    }
    @Override
    public String goNext(String km, String unit) throws Exception {
        BigDecimal answer = new BigDecimal(this.handler.goNext(km, unit));
        answer = answer.setScale(2, RoundingMode.HALF_UP);
        return expDecorator.goNext(String.valueOf(answer), unit);
    }
}
