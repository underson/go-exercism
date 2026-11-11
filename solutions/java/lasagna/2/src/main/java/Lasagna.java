public class Lasagna {
    
    public int expectedMinutesInOven() {
        return 40;
    }

    public int remainingMinutesInOven(final int actualMinutesInOven){
        return expectedMinutesInOven() - actualMinutesInOven;
    }

    public int preparationTimeInMinutes(final int numberOfLayers) {
        return 2 * numberOfLayers;
    }

    public int totalTimeInMinutes(final int numberOfLayers, final int numberOfMinutes) {
        return preparationTimeInMinutes(numberOfLayers) + numberOfMinutes;
    }
}
