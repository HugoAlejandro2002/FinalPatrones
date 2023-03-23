package templates.adapter.strcuture;

public class Adaptee {
    private String attribute1;
    private String attribute2;
    private String attribute3;

    public Adaptee(){};

    public String getAttribute1() {
        return attribute1;
    }

    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1;
    }

    public String getAttribute2() {
        return attribute2;
    }

    public void setAttribute2(String attribute2) {
        this.attribute2 = attribute2;
    }

    public String getAttribute3() {
        return attribute3;
    }

    public void setAttribute3(String attribute3) {
        this.attribute3 = attribute3;
    }

    public void method1Action1(){
        System.out.println("Adaptee>method1Action1");
    }

    public void method2Action2(String value1){
        System.out.println("Adaptee>method2Action2: "+value1);
    }

    public void method4Action3(String valie2){
        System.out.println("Adaptee>method4Action3: "+valie2);
    }

}
