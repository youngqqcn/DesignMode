package Factory;

/**
 * Created by yqq on 2017/9/9.
 */
public class CookChicken extends CookFish{

    @Override
    public void PreDeal() {
       // super.PreDeal();
        System.out.println("洗鸡肉,切鸡肉,腌制");
    }
}
