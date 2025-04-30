import java.util.Random;

public class RandomGenerator {
    private Random random;

    public RandomGenerator() {
        random = new Random();
    }

    public int RandomNumber(int limite){
        return random.nextInt(limite);
    }
}
