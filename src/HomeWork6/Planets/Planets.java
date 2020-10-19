package HomeWork6.Planets;

public enum Planets {
    MARS(100, 50, 20),
    EARTH(200, 60, 70),
    MOON(140, 100, 40);

    private int planetWeight;
    private int planetRadius;
    private int orbitRadius;

    Planets(int planetWeight, int planetRadius, int orbitRadius) {
        this.planetWeight = planetWeight;
        this.planetRadius = planetRadius;
        this.orbitRadius = orbitRadius;
    }

    public int getPlanetWeight() {
        return planetWeight;
    }

    public int getPlanetRadius() {
        return planetRadius;
    }

    public int getOrbitRadius() {
        return orbitRadius;
    }

}
