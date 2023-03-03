package singleton;

public class SingletonDeMo {
    public static void main(String[] args){
        SingleObject singleObject = SingleObject.getInstance();
        singleObject.show();
    }    
}
