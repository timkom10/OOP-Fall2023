package Assignment3.Question1;

public class EagerSingletonAssignment3 {
    private static final EagerSingletonAssignment3[] instance = {new EagerSingletonAssignment3(), new EagerSingletonAssignment3(), new EagerSingletonAssignment3()};
    private EagerSingletonAssignment3(){
        new Assignment3();
    }

    public static EagerSingletonAssignment3 getInstance(int index){
        return instance[index-1];
    }

}
