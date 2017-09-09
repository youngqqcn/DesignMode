package Factory;

/**
 * Created by yqq on 2017/9/9.
 */
public interface Cook {

    //1.预处理食材
    void PreDeal();

    //2.煮
    void Cooking();

    //3.出锅
    void GetOut();
}
