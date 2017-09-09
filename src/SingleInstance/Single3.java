package SingleInstance;

/**
 * Created by yqq on 2017/9/9.
 */
public class Single3 {

    /**
     * 新懒汉式单例, 线程不安全....
     */

    private Single3(){
        System.out.println("SingleInstance.Single3()...");
    }

    private static Single3  single3 =  null;

    //public static SingleInstance.Single2 getSingle2(){      //线程不安全

    public static Single3 getSingle3(){ //线程安全

        if(null == single3){
            synchronized (Single3.class){ //少数几个
                if (single3 == null) {
                   single3 = new Single3();
                }
            }
        }
        return single3;
    }


}
