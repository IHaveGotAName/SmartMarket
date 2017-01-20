package market.dto;

import market.entity.Phone;

import java.util.Set;

/**
 * Created by ivegotaname on 28.11.16.
 */
public class ManufacturerDTO {
    private int id;
    private String country;
    private String nameMan;
    private String deliveryTpe;
    private int deliveryDays;


    public ManufacturerDTO(){
    }

    public ManufacturerDTO(int id, String country, String nameMan, String deliveryTpe, int deliveryDays, Set<Phone> ph) {
        this.id = id;
        this.country = country;
        this.nameMan = nameMan;
        this.deliveryTpe = deliveryTpe;
        this.deliveryDays = deliveryDays;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getNameMan() {
        return nameMan;
    }

    public void setNameMan(String nameMan) {
        this.nameMan = nameMan;
    }

    public String getDeliveryTpe() {
        return deliveryTpe;
    }

    public void setDeliveryTpe(String deliveryTpe) {
        this.deliveryTpe = deliveryTpe;
    }

    public int getDeliveryDays() {
        return deliveryDays;
    }

    public void setDeliveryDays(int deliveryDays) {
        this.deliveryDays = deliveryDays;
    }

}
