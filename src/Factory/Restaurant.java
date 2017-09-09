package Factory;

/**
 * Created by yqq on 2017/9/9.
 */
public class Restaurant {

    public static Cook Book(String name){

        switch (name){
            case "Fish": return new CookFish();
            case "Pig" : return new CookPig();
            case "Chicken" : return new CookChicken();
            default: return null;
        }

    }

}
