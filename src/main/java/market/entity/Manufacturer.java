package market.entity;

import javax.persistence.*;

/**
 * Created by ivegotaname on 06.11.16.
 */
@Entity
public class Manufacturer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String country;
    @Column
    private String nameMan;
    @Column
    private String deliveryTpe;
    @Column
    private int deliveryDays;


    public Manufacturer(String country, String nameMan, String deliveryTpe, int deliveryDays) {
        this.country = country;
        this.nameMan = nameMan;
        this.deliveryTpe = deliveryTpe;
        this.deliveryDays = deliveryDays;
    }

    public Manufacturer() {
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
