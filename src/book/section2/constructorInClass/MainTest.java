package book.section2.constructorInClass;

/**
 * Created by zx on 15-11-10.
 */
public class MainTest {

    public static void main(String[] args){
        NutritionFacts.Builder cocaCola_builder = new NutritionFacts.Builder(240, 8).calories(100);
        NutritionFacts cocaCola_1 = cocaCola_builder.fat(120).sodium(30).build();
        NutritionFacts cocaCola_2 = cocaCola_builder.fat(100).carbohydrate(27).build();

        System.out.println("cocaCola_1: " + cocaCola_1.toString());
        System.out.println("cocaCola_2: " + cocaCola_2.toString());
    }
}
