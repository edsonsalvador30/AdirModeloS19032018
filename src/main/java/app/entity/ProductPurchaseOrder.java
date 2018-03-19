package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela PRODUCTPURCHASEORDER
 * @generated
 */
@Entity
@Table(name = "\"PRODUCTPURCHASEORDER\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.ProductPurchaseOrder")
public class ProductPurchaseOrder implements Serializable {

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
  @ManyToOne
  @JoinColumn(name="fk_product", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Product product;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_purchaseOrder", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private PurchaseOrder purchaseOrder;

  /**
  * @generated
  */
  @Column(name = "price", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double price;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_purchaseProductStatus", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private PurchaseProductStatus purchaseProductStatus;

  /**
   * Construtor
   * @generated
   */
  public ProductPurchaseOrder(){
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
  public ProductPurchaseOrder setId(java.lang.String id){
    this.id = id;
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
  public ProductPurchaseOrder setProduct(Product product){
    this.product = product;
    return this;
  }

  /**
   * Obtém purchaseOrder
   * return purchaseOrder
   * @generated
   */
  
  public PurchaseOrder getPurchaseOrder(){
    return this.purchaseOrder;
  }

  /**
   * Define purchaseOrder
   * @param purchaseOrder purchaseOrder
   * @generated
   */
  public ProductPurchaseOrder setPurchaseOrder(PurchaseOrder purchaseOrder){
    this.purchaseOrder = purchaseOrder;
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
  public ProductPurchaseOrder setPrice(java.lang.Double price){
    this.price = price;
    return this;
  }

  /**
   * Obtém purchaseProductStatus
   * return purchaseProductStatus
   * @generated
   */
  
  public PurchaseProductStatus getPurchaseProductStatus(){
    return this.purchaseProductStatus;
  }

  /**
   * Define purchaseProductStatus
   * @param purchaseProductStatus purchaseProductStatus
   * @generated
   */
  public ProductPurchaseOrder setPurchaseProductStatus(PurchaseProductStatus purchaseProductStatus){
    this.purchaseProductStatus = purchaseProductStatus;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    ProductPurchaseOrder object = (ProductPurchaseOrder)obj;
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
