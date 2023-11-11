package assignment4.problem;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class RoundDecorator extends HandlerDecorator {
    HandlerDecorator nextDecorator;
    RoundDecorator(Handler handler) {
        super(handler);
        this.nextDecorator = new ExpDecorator(handler);

    }
    @Override
    public String goNext(String km, String unit) throws Exception {
        BigDecimal answer = new BigDecimal(this.handler.goNext(km, unit));
        answer = answer.setScale(2, RoundingMode.HALF_UP);
        return nextDecorator.goNext(String.valueOf(answer), unit);
    }
}
