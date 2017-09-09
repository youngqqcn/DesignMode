package Factory;

/**
 * Created by yqq on 2017/9/9.
 */
public class CookPig implements Cook{
    @Override
    public void PreDeal() {
        System.out.println("洗猪肉,切猪肉,腌制");
    }

    @Override
    public void Cooking() {

        System.out.println("小炒,加配料,加水煮");

    }

    @Override
    public void GetOut() {

        System.out.println("加葱花,摆盘,上桌");
    }
}
