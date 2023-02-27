package iti.jets.repo.entities;
// default package
// Generated Feb 27, 2023, 5:09:25 PM by Hibernate Tools 6.0.0.Alpha3


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * Image generated by hbm2java
 */
@Entity
@Table(name="image"
    ,catalog="marketplacedb"
)
public class Image  implements java.io.Serializable {


     private int imageId;
     private Product product;
     private String imageUrl;
     private String imageDesc;

    public Image() {
    }

	
    public Image(int imageId, Product product) {
        this.imageId = imageId;
        this.product = product;
    }
    public Image(int imageId, Product product, String imageUrl, String imageDesc) {
       this.imageId = imageId;
       this.product = product;
       this.imageUrl = imageUrl;
       this.imageDesc = imageDesc;
    }
   
     @Id 

    
    @Column(name="imageId", unique=true, nullable=false)
    public int getImageId() {
        return this.imageId;
    }
    
    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="Product_idProduct", nullable=false)
    public Product getProduct() {
        return this.product;
    }
    
    public void setProduct(Product product) {
        this.product = product;
    }

    
    @Column(name="imageUrl", length=510)
    public String getImageUrl() {
        return this.imageUrl;
    }
    
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    
    @Column(name="imageDesc", length=45)
    public String getImageDesc() {
        return this.imageDesc;
    }
    
    public void setImageDesc(String imageDesc) {
        this.imageDesc = imageDesc;
    }




}

