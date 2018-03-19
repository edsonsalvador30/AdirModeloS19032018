package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela STOCKITEM
 * @generated
 */
@Entity
@Table(name = "\"STOCKITEM\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.StockItem")
public class StockItem implements Serializable {

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
  @JoinColumn(name="fk_stock", nullable = false, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Stock stock;

  /**
  * @generated
  */
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "added_date", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.util.Date addedDate;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_itemStatus", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private ItemStatus itemStatus;

  /**
  * @generated
  */
  @Column(name = "quantity", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.lang.Long quantity;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_product", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Product product;

  /**
   * Construtor
   * @generated
   */
  public StockItem(){
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
  public StockItem setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém stock
   * return stock
   * @generated
   */
  
  public Stock getStock(){
    return this.stock;
  }

  /**
   * Define stock
   * @param stock stock
   * @generated
   */
  public StockItem setStock(Stock stock){
    this.stock = stock;
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
  public StockItem setAddedDate(java.util.Date addedDate){
    this.addedDate = addedDate;
    return this;
  }

  /**
   * Obtém itemStatus
   * return itemStatus
   * @generated
   */
  
  public ItemStatus getItemStatus(){
    return this.itemStatus;
  }

  /**
   * Define itemStatus
   * @param itemStatus itemStatus
   * @generated
   */
  public StockItem setItemStatus(ItemStatus itemStatus){
    this.itemStatus = itemStatus;
    return this;
  }

  /**
   * Obtém quantity
   * return quantity
   * @generated
   */
  
  public java.lang.Long getQuantity(){
    return this.quantity;
  }

  /**
   * Define quantity
   * @param quantity quantity
   * @generated
   */
  public StockItem setQuantity(java.lang.Long quantity){
    this.quantity = quantity;
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
  public StockItem setProduct(Product product){
    this.product = product;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    StockItem object = (StockItem)obj;
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
