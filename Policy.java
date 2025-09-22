public class Policy {
    // Fields
    private int policyNumber;
    private String providerName;
    private String policyholderFirstName;
    private String policyholderLastName;
    private int policyholderAge;
    private String policyholderSmokingStatus;
    private double policyholderHeight;
    private double policyholderWeight;

    // No-arg constructor
    public Policy() {
        policyNumber = 0;
        providerName = "";
        policyholderFirstName = "";
        policyholderLastName = "";
        policyholderAge = 0;
        policyholderSmokingStatus = "non-smoker";
        policyholderHeight = 0.0;
        policyholderWeight = 0.0;
    }

    // Constructor with parameters
    public Policy(int pNumber, String pName, String first, String last,
                  int age, String smoking, double height, double weight) {
        policyNumber = pNumber;
        providerName = pName;
        policyholderFirstName = first;
        policyholderLastName = last;
        policyholderAge = age;
        policyholderSmokingStatus = smoking;
        policyholderHeight = height;
        policyholderWeight = weight;
    }

    // Getters and setters
    public int getPolicyNumber() { return policyNumber; }
    public void setPolicyNumber(int pNumber) { policyNumber = pNumber; }

    public String getProviderName() { return providerName; }
    public void setProviderName(String pName) { providerName = pName; }

    public String getPolicyholderFirstName() { return policyholderFirstName; }
    public void setPolicyholderFirstName(String first) { policyholderFirstName = first; }

    public String getPolicyholderLastName() { return policyholderLastName; }
    public void setPolicyholderLastName(String last) { policyholderLastName = last; }

    public int getPolicyholderAge() { return policyholderAge; }
    public void setPolicyholderAge(int age) { policyholderAge = age; }

    public String getPolicyholderSmokingStatus() { return policyholderSmokingStatus; }
    public void setPolicyholderSmokingStatus(String smoking) { policyholderSmokingStatus = smoking; }

    public double getPolicyholderHeight() { return policyholderHeight; }
    public void setPolicyholderHeight(double height) { policyholderHeight = height; }

    public double getPolicyholderWeight() { return policyholderWeight; }
    public void setPolicyholderWeight(double weight) { policyholderWeight = weight; }

    // Calculate BMI
    public double calculateBMI() {
        if (policyholderHeight == 0) return 0;
        return (policyholderWeight * 703) / (policyholderHeight * policyholderHeight);
    }

    // Calculate Policy Price
    public double calculatePolicyPrice() {
        double price = 600.0;

        if (policyholderAge > 50) {
            price += 75.0;
        }
        if (policyholderSmokingStatus.equalsIgnoreCase("smoker")) {
            price += 100.0;
        }
        double bmi = calculateBMI();
        if (bmi > 35) {
            price += (bmi - 35) * 20;
        }

        return price;
    }
}
