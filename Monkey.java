public class Monkey extends RescueAnimal {
    // Monkey inherits RescueAnimal

    private String species;
    private String tailLength;
    private String height;
    private String bodyLength;

    public Monkey(String name, String gender, String age,
                  String weight, String acquisitionDate, String acquisitionCountry, String trainingStatus, boolean reserved, String inServiceCountry, String tailLength, String height, String bodyLength, String species) {
        setName(name);
        setMonkeySpecies(species); // This will be the type of monkey, i.e. "Capuchin"
        setMonkeyTailLength(tailLength);
        setMonkeyHeight(height);
        setMonkeyBodyLength(bodyLength);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);
    }

    public void setMonkeySpecies(String monkeySpecies) {
        this.species = monkeySpecies;
    }

    public String getMonkeySpecies() {
        return species;
    }

    public void setMonkeyTailLength(String tailLength) {
        this.tailLength = tailLength;
    }

    public String getMonkeyTailLength() {
        return this.tailLength;
    }

    public void setMonkeyHeight(String height) {
        this.height = height;
    }

    public String getMonkeyHeight() {
        return this.height;
    }

    public void setMonkeyBodyLength(String bodyLength) {
        this.bodyLength = bodyLength;
    }

    public String getMonkeyBodyLength() {
        return this.bodyLength;
    }

}
