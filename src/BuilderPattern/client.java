package BuilderPattern;


public class client {

    public static void main(String[] args) {
        NutritionFacts nutritionFacts = new NutritionFacts.Bulider(100,10)
                .fat(11).calories(14).sodium(18).carbohydrate(20).bulid();

        System.out.println(nutritionFacts.toString());
    }
}
