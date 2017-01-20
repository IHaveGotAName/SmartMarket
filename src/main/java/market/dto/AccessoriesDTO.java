package market.dto;

import market.entity.Manufacturer;

/**
 * Created by ivegotaname on 28.11.16.
 */
public class AccessoriesDTO {
    private int id;
    private String sertificate;
    private String accessoryType;
    private int price;
    private String model;
    private int count;
    private String description;
    private Manufacturer manufacturer;

    public AccessoriesDTO() {
    }

    public AccessoriesDTO(int id, String sertificate, Manufacturer manufacturer, String accessoryType, int price, String model, int count, String description) {
        this.id = id;
        this.sertificate = sertificate;
        this.accessoryType = accessoryType;
        this.price = price;
        this.model = model;
        this.count = count;
        this.description = description;
        this.manufacturer = manufacturer;
    }

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
