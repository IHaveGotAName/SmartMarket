package market.dto;

import market.entity.Accessories;
import market.entity.Phone;
import market.entity.User;

import java.util.Date;

/**
 * Created by ivegotaname on 28.11.16.
 */
public class HistoryDTO {
    private Integer id;
    private Phone phone;
    private Accessories accessories;
    private Integer phoneCount;
    private Double phonePrice;
    private Integer accessoriesCount;
    private Double accessoriesPrice;
    private Date date;
    private User userID;

    public HistoryDTO() {
    }

    public HistoryDTO(Integer id, User userID, Phone phone, Accessories accessories, Integer phoneCount, Double phonePrice, Integer accessoriesCount, Double accessoriesPrice, Date date) {
        this.id = id;
        this.phone = phone;
        this.accessories = accessories;
        this.phoneCount = phoneCount;
        this.phonePrice = phonePrice;
        this.accessoriesCount = accessoriesCount;
        this.accessoriesPrice = accessoriesPrice;
        this.date = date;
        this.userID = userID;
    }

    public Integer getId() {
        return id;
    }

    public User getUserID() {
        return userID;
    }

    public void setUserID(User userID) {
        this.userID = userID;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public Accessories getAccessories() {
        return accessories;
    }

    public void setAccessories(Accessories accessories) {
        this.accessories = accessories;
    }

    public Integer getPhoneCount() {
        return phoneCount;
    }

    public void setPhoneCount(Integer phoneCount) {
        this.phoneCount = phoneCount;
    }

    public Double getPhonePrice() {
        return phonePrice;
    }

    public void setPhonePrice(Double phonePrice) {
        this.phonePrice = phonePrice;
    }

    public Integer getAccessoriesCount() {
        return accessoriesCount;
    }

    public void setAccessoriesCount(Integer accessoriesCount) {
        this.accessoriesCount = accessoriesCount;
    }

    public Double getAccessoriesPrice() {
        return accessoriesPrice;
    }

    public void setAccessoriesPrice(Double accessoriesPrice) {
        this.accessoriesPrice = accessoriesPrice;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
