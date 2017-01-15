package BuilderPattern;

/**
 * Created by dingyaning on 2017/1/14.
 */
public class NutritionFacts {
    private int servingSize;
    private int servings;
    private int calories;
    private int fat;
    private int sodium;
    private int carbohydrate;


    public static class Bulider {
        private int servingSize;
        private int servings;

        private int calories = 0;
        private int fat = 0;
        private int sodium = 0;
        private int carbohydrate = 0;

        //默认参数值，单独放在一起
        public Bulider(int servingSize, int servings){
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Bulider calories(int val){
            calories = val;
            return this;
        }

        public Bulider fat(int val){
            fat = val;
            return this;
        }

        public Bulider sodium(int val){
            sodium = val;
            return this;
        }

        public Bulider carbohydrate(int val){
            carbohydrate = val;
            return this;
        }

        public NutritionFacts bulid() {
            return new NutritionFacts(this);
        }
    }

    private NutritionFacts(Bulider bulider){
        servingSize = bulider.servingSize;
        servings = bulider.servings;
        calories = bulider.calories;
        fat = bulider.fat;
        sodium = bulider.sodium;
        carbohydrate = bulider.carbohydrate;
    }

    @Override
    public String toString() {
        return "NutritionFacts{" +
                "servingSize=" + servingSize +
                ", servings=" + servings +
                ", calories=" + calories +
                ", fat=" + fat +
                ", sodium=" + sodium +
                ", carbohydrate=" + carbohydrate +
                '}';
    }
}
