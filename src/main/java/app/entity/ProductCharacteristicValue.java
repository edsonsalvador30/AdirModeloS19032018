package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
import cronapi.CronapiCloud;
import cronapi.CronapiByteHeaderSignature;


/**
 * Classe que representa a tabela PRODUCTCHARACTERISTICVALUE
 * @generated
 */
@Entity
@Table(name = "\"PRODUCTCHARACTERISTICVALUE\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.ProductCharacteristicValue")
public class ProductCharacteristicValue implements Serializable {

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
  @Column(name = "value", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double value;

  /**
  * @generated
  */
  @Column(name = "active", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.lang.Boolean active = true;

  /**
  * @generated
  */
  @Column(name = "description", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String description;

  /**
  * @generated
  */
  @Column(name = "attachment", nullable = true, unique = false, insertable=true, updatable=true)
  @CronapiByteHeaderSignature
  
  private byte[] attachment;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_product", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Product product;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_productCharacteristic", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private ProductCharacteristic productCharacteristic;

  /**
   * Construtor
   * @generated
   */
  public ProductCharacteristicValue(){
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
  public ProductCharacteristicValue setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém value
   * return value
   * @generated
   */
  
  public java.lang.Double getValue(){
    return this.value;
  }

  /**
   * Define value
   * @param value value
   * @generated
   */
  public ProductCharacteristicValue setValue(java.lang.Double value){
    this.value = value;
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
  public ProductCharacteristicValue setActive(java.lang.Boolean active){
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
  public ProductCharacteristicValue setDescription(java.lang.String description){
    this.description = description;
    return this;
  }

  /**
   * Obtém attachment
   * return attachment
   * @generated
   */
  
  public byte[] getAttachment(){
    return this.attachment;
  }

  /**
   * Define attachment
   * @param attachment attachment
   * @generated
   */
  public ProductCharacteristicValue setAttachment(byte[] attachment){
    this.attachment = attachment;
    return this;
  }

  /**
   * Obtém product
   * return product
   * @generated
   */
  
  public Product getProduct(){
    return this.product;
  }

  /**
   * Define product
   * @param product product
   * @generated
   */
  public ProductCharacteristicValue setProduct(Product product){
    this.product = product;
    return this;
  }

  /**
   * Obtém productCharacteristic
   * return productCharacteristic
   * @generated
   */
  
  public ProductCharacteristic getProductCharacteristic(){
    return this.productCharacteristic;
  }

  /**
   * Define productCharacteristic
   * @param productCharacteristic productCharacteristic
   * @generated
   */
  public ProductCharacteristicValue setProductCharacteristic(ProductCharacteristic productCharacteristic){
    this.productCharacteristic = productCharacteristic;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    ProductCharacteristicValue object = (ProductCharacteristicValue)obj;
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
