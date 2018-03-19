package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
import cronapi.CronapiCloud;


/**
 * Classe que representa a tabela PRODUCT
 * @generated
 */
@Entity
@Table(name = "\"PRODUCT\"" ,uniqueConstraints=@UniqueConstraint(columnNames={
"id" ,"name" }))
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Product")
public class Product implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

  /**
  * @generated
  */
  @Column(name = "name", nullable = false, unique = true, insertable=true, updatable=true)
  
  private java.lang.String name;

  /**
  * @generated
  */
  @Column(name = "active", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Boolean active = true;

  /**
  * @generated
  */
  @Column(name = "description", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.lang.String description;

  /**
  * @generated
  */
  @Column(name = "image", nullable = true, unique = false, insertable=true, updatable=true)
  @CronapiCloud(type = "dropbox", value="9AFYR7pXfpAAAAAAAAAABac1LcdWqqVP8RhSdokIVDIXAKbJ_Z5z6JepOLvr5794")
  
  private java.lang.String image;

  /**
  * @generated
  */
  @Column(name = "attachment", nullable = true, unique = false, insertable=true, updatable=true)
  @CronapiCloud(type = "dropbox", value="9AFYR7pXfpAAAAAAAAAABac1LcdWqqVP8RhSdokIVDIXAKbJ_Z5z6JepOLvr5794")
  
  private java.lang.String attachment;

  /**
  * @generated
  */
  @Column(name = "barcode", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String barcode;

  /**
  * @generated
  */
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "addeddate", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date addedDate;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_productStatus", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private ProductStatus productStatus;

  /**
  * @generated
  */
  @Column(name = "price", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double price;

  /**
  * @generated
  */
  @Column(name = "costPrice", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double costPrice;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_brand", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Brand brand;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_productCategory", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private ProductCategory productCategory;

  /**
   * Construtor
   * @generated
   */
  public Product(){
  }


  /**
   * Obtém id
   * return id
   * @generated
   */
  
  public java.lang.String getId(){
    return this.id;
  }

  /**
   * Define id
   * @param id id
   * @generated
   */
  public Product setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém name
   * return name
   * @generated
   */
  
  public java.lang.String getName(){
    return this.name;
  }

  /**
   * Define name
   * @param name name
   * @generated
   */
  public Product setName(java.lang.String name){
    this.name = name;
    return this;
  }

  /**
   * Obtém active
   * return active
   * @generated
   */
  
  public java.lang.Boolean getActive(){
    return this.active;
  }

  /**
   * Define active
   * @param active active
   * @generated
   */
  public Product setActive(java.lang.Boolean active){
    this.active = active;
    return this;
  }

  /**
   * Obtém description
   * return description
   * @generated
   */
  
  public java.lang.String getDescription(){
    return this.description;
  }

  /**
   * Define description
   * @param description description
   * @generated
   */
  public Product setDescription(java.lang.String description){
    this.description = description;
    return this;
  }

  /**
   * Obtém image
   * return image
   * @generated
   */
  
  public java.lang.String getImage(){
    return this.image;
  }

  /**
   * Define image
   * @param image image
   * @generated
   */
  public Product setImage(java.lang.String image){
    this.image = image;
    return this;
  }

  /**
   * Obtém attachment
   * return attachment
   * @generated
   */
  
  public java.lang.String getAttachment(){
    return this.attachment;
  }

  /**
   * Define attachment
   * @param attachment attachment
   * @generated
   */
  public Product setAttachment(java.lang.String attachment){
    this.attachment = attachment;
    return this;
  }

  /**
   * Obtém barcode
   * return barcode
   * @generated
   */
  
  public java.lang.String getBarcode(){
    return this.barcode;
  }

  /**
   * Define barcode
   * @param barcode barcode
   * @generated
   */
  public Product setBarcode(java.lang.String barcode){
    this.barcode = barcode;
    return this;
  }

  /**
   * Obtém addedDate
   * return addedDate
   * @generated
   */
  
  public java.util.Date getAddedDate(){
    return this.addedDate;
  }

  /**
   * Define addedDate
   * @param addedDate addedDate
   * @generated
   */
  public Product setAddedDate(java.util.Date addedDate){
    this.addedDate = addedDate;
    return this;
  }

  /**
   * Obtém productStatus
   * return productStatus
   * @generated
   */
  
  public ProductStatus getProductStatus(){
    return this.productStatus;
  }

  /**
   * Define productStatus
   * @param productStatus productStatus
   * @generated
   */
  public Product setProductStatus(ProductStatus productStatus){
    this.productStatus = productStatus;
    return this;
  }

  /**
   * Obtém price
   * return price
   * @generated
   */
  
  public java.lang.Double getPrice(){
    return this.price;
  }

  /**
   * Define price
   * @param price price
   * @generated
   */
  public Product setPrice(java.lang.Double price){
    this.price = price;
    return this;
  }

  /**
   * Obtém costPrice
   * return costPrice
   * @generated
   */
  
  public java.lang.Double getCostPrice(){
    return this.costPrice;
  }

  /**
   * Define costPrice
   * @param costPrice costPrice
   * @generated
   */
  public Product setCostPrice(java.lang.Double costPrice){
    this.costPrice = costPrice;
    return this;
  }

  /**
   * Obtém brand
   * return brand
   * @generated
   */
  
  public Brand getBrand(){
    return this.brand;
  }

  /**
   * Define brand
   * @param brand brand
   * @generated
   */
  public Product setBrand(Brand brand){
    this.brand = brand;
    return this;
  }

  /**
   * Obtém productCategory
   * return productCategory
   * @generated
   */
  
  public ProductCategory getProductCategory(){
    return this.productCategory;
  }

  /**
   * Define productCategory
   * @param productCategory productCategory
   * @generated
   */
  public Product setProductCategory(ProductCategory productCategory){
    this.productCategory = productCategory;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Product object = (Product)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

}
