public class Lasagna {
    
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven() {
        return 40;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(final int actualMinutesInOven){
        return expectedMinutesInOven() - actualMinutesInOven;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(final int numberOfLayers) {
        return 2 * numberOfLayers;
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(final int numberOfLayers, final int numberOfMinutes) {
        return preparationTimeInMinutes(numberOfLayers) + numberOfMinutes;
    }
}
