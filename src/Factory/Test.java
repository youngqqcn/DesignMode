package Factory;

/**
 * Created by yqq on 2017/9/9.
 */
public class Test {

    public static void main(String[] args) {

        //Cook cook = Restaurant.Book("Fish");
        //Cook cook = Restaurant.Book("Pig");
        Cook cook = Restaurant.Book("Chicken");

        cook.PreDeal();
        cook.Cooking();
        cook.GetOut();

    }
}
