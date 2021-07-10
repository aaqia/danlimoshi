public class Computer {
    //2.在对象本身 new自己 ，而且是一个static修饰的
    private static Computer ourInstance = new Computer();
    //写出自身对象的返回值
    public static Computer getInstance() {
        return ourInstance;
    }
        //1.无参构造方法私有化
    private Computer() {
    }
}
