package singleton;

public class SingleObject {
    private static SingleObject singleObject;
    public static SingleObject getInstance(){
        if(singleObject == null){
            singleObject = new SingleObject();
        }
        return singleObject;
    }    
    private SingleObject(){

    }
    void show(){
        System.out.println("Show");
    }
}
