package Factory;

/**
 * Created by yqq on 2017/9/9.
 */
public class CookFish implements Cook{

    @Override
    public void PreDeal() {
        System.out.println("洗鱼,杀鱼,切块");
    }

    @Override
    public void Cooking() {
        System.out.println("加油,翻炒,上色");
    }

    @Override
    public void GetOut() {
        System.out.println("加香菜,摆盘,上桌");

    }
}
