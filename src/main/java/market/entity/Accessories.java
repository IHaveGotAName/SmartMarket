package market.entity;

import javax.persistence.*;

/**
 * Created by ivegotaname on 06.11.16.
 */
@Entity
public class Accessories {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String sertificate;
    @Column
    private String accessoryType;
    @Column
    private int price;
    @Column
    private String model;
    @Column
    private int count;
    @Column
    private String description;
    @ManyToOne
    @JoinColumn (name = "manufacturer_id")
    private Manufacturer manufacturer;



    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSertificate() {
        return sertificate;
    }

    public void setSertificate(String sertificate) {
        this.sertificate = sertificate;
    }

    public String getAccessoryType() {
        return accessoryType;
    }

    public void setAccessoryType(String accessoryType) {
        this.accessoryType = accessoryType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
