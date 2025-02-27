import java.io.Serializable;

public class Lieu implements Serializable {
    private String nom;
    private String description;
    private double latitude;
    private double longitude;

    public Lieu() {}

    public Lieu(String nom, String description, double latitude, double longitude) {
        this.nom = nom;
        this.description = description;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public double getLatitude() { return latitude; }
    public void setLatitude(double latitude) { this.latitude = latitude; }

    public double getLongitude() { return longitude; }
    public void setLongitude(double longitude) { this.longitude = longitude; }
}
