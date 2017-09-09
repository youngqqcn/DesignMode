package SingleInstance;

/**
 * Created by yqq on 2017/9/9.
 */
public class Single {

    //单例三部曲

    //1.构造函数私有
    private Single(){
        System.out.println("SingleInstance.Single()....");
    }


    //2.静态单例对象
    private static Single single = new Single();


    //3.获取单例对象
    public static Single getSingle() {
        return single;
    }


    public static void main(String[] args) {

        Single single =  Single.getSingle();

    }



}
