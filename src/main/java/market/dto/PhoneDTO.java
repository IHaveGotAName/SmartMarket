package market.dto;

import market.entity.Manufacturer;

/**
 * Created by ivegotaname on 28.11.16.
 */
public class PhoneDTO {
    private int id;
    private int code;
    private String  model;
    private int price;
    private String pricePolicy;
    private String sizes;
    private int count;
    private int garantyDays;
    private String description;
    private Manufacturer manufacturerID;

    public PhoneDTO() {
    }

    public PhoneDTO(int id, int code, Manufacturer manufacturerID, String model, int price, String pricePolicy, String sizes, int count, int garantyDays, String description) {
        this.id = id;
        this.code = code;
        this.model = model;
        this.price = price;
        this.pricePolicy = pricePolicy;
        this.sizes = sizes;
        this.count = count;
        this.garantyDays = garantyDays;
        this.description = description;
        this.manufacturerID = manufacturerID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Manufacturer getManufacturerID() {
        return manufacturerID;
    }

    public void setManufacturerID(Manufacturer manufacturerID) {
        this.manufacturerID = manufacturerID;
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

    public void setModel(String  model) {
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
