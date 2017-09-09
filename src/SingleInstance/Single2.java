package SingleInstance;

/**
 * Created by yqq on 2017/9/9.
 */
public class Single2 {


    /**
     * 懒汉式单例, 线程不安全....
     */

    private Single2(){
        System.out.println("SingleInstance.Single2()...");
    }

    private static Single2  single2 =  null;

    //public static SingleInstance.Single2 getSingle2(){      //线程不安全

    public static synchronized Single2 getSingle2(){ //线程安全

        if(null == single2){
            single2 = new Single2();
        }
        return single2;
    }



}
