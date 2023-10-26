package Assignment3.Question1;

public class EagerSingletonAssignment3 {
    private static final EagerSingletonAssignment3 instance1 = new EagerSingletonAssignment3();
    private static final EagerSingletonAssignment3 instance2 = new EagerSingletonAssignment3();
    private static final EagerSingletonAssignment3 instance3 = new EagerSingletonAssignment3();
    private EagerSingletonAssignment3(){
        new Assignment3();
    }


}
