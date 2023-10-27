package Assignment3.Question1;

public class LazySingletonAssignment3 {
    private static final LazySingletonAssignment3[]  instance =  new LazySingletonAssignment3[3];
    private LazySingletonAssignment3(){
        new Assignment3();
    }

    public static LazySingletonAssignment3 getInstance(int index){
        if (instance[index-1] == null){
            instance[index-1] = new LazySingletonAssignment3();
        }

        return instance[index-1];
    }
}
