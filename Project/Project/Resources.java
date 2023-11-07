public class Resources {
    private int food;
    private int materials;
    private int energy;

    private int unitPriceFood ;
    private int unitPriceMaterials ;
    private int unitPriceEnergy ;
    public Resources(int food , int materials , int energy , int unitPriceEnergy , int unitPriceFood, int unitPriceMaterials)
    {
        this.food = food;
        this.materials = materials;
        this.energy = energy;
        this.unitPriceFood = unitPriceFood;
        this.unitPriceEnergy = unitPriceEnergy;
        this.unitPriceMaterials = unitPriceMaterials;
    }
}
