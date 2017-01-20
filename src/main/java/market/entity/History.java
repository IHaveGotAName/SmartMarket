package market.entity;


import javax.persistence.*;
import java.util.Date;

/**
 * Created by ivegotaname on 10/10/16.
 */
@Entity
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = {"phone_id","accessories_id","user_id"})})
public class History {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn (name = "phone_id")
    private Phone phone;
    @ManyToOne
    @JoinColumn (name = "accessories_id")
    private Accessories accessories;
    @Column
    private Integer phoneCount;
    @Column
    private Double phonePrice;
    @Column
    private Integer accessoriesCount;
    @Column
    private Double accessoriesPrice;
    @Column
    private Date date;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn (name = "user_id")
    private User userID;

    public User getUserID() {
        return userID;
    }

    public void setUserID(User userID) {
        this.userID = userID;
    }

    public Integer getId() {
        return id;
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


