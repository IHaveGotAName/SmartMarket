package market.entity;

import javax.persistence.*;
import javax.persistence.Entity;

/**
 * Created by ivegotaname on 06.11.16.
 */
@Entity
public class Phone {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private int code;
    @Column
    private String model;
    @Column
    private int price;
    @ManyToOne
    @JoinColumn (name = "manufacturer_id")
    private Manufacturer manufacturer;
    @Column
    private String pricePolicy;
    @Column
    private String sizes;
    @Column
    private int count;
    @Column
    private int garantyDays;
    @Column
    private String description;

    public Manufacturer getManufacturerID() {
        return manufacturer;
    }

    public void setManufacturerID(Manufacturer manufacturer) {
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

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPricePolicy() {
        return pricePolicy;
    }

    public void setPricePolicy(String pricePolicy) {
        this.pricePolicy = pricePolicy;
    }

    public String getSizes() {
        return sizes;
    }

    public void setSizes(String sizes) {
        this.sizes = sizes;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getGarantyDays() {
        return garantyDays;
    }

    public void setGarantyDays(int garantyDays) {
        this.garantyDays = garantyDays;
    }
}
