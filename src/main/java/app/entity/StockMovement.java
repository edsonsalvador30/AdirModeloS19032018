package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela STOCKMOVEMENT
 * @generated
 */
@Entity
@Table(name = "\"STOCKMOVEMENT\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.StockMovement")
public class StockMovement implements Serializable {

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
  @Column(name = "quantity", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.lang.Integer quantity;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_StockItem", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private StockItem stockItem;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_StockMovementType", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private StockMovementType stockMovementType;

  /**
  * @generated
  */
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "addeddate", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.util.Date addedDate;

  /**
  * @generated
  */
  @Column(name = "note", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String note;

  /**
   * Construtor
   * @generated
   */
  public StockMovement(){
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
  public StockMovement setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém quantity
   * return quantity
   * @generated
   */
  
  public java.lang.Integer getQuantity(){
    return this.quantity;
  }

  /**
   * Define quantity
   * @param quantity quantity
   * @generated
   */
  public StockMovement setQuantity(java.lang.Integer quantity){
    this.quantity = quantity;
    return this;
  }

  /**
   * Obtém stockItem
   * return stockItem
   * @generated
   */
  
  public StockItem getStockItem(){
    return this.stockItem;
  }

  /**
   * Define stockItem
   * @param stockItem stockItem
   * @generated
   */
  public StockMovement setStockItem(StockItem stockItem){
    this.stockItem = stockItem;
    return this;
  }

  /**
   * Obtém stockMovementType
   * return stockMovementType
   * @generated
   */
  
  public StockMovementType getStockMovementType(){
    return this.stockMovementType;
  }

  /**
   * Define stockMovementType
   * @param stockMovementType stockMovementType
   * @generated
   */
  public StockMovement setStockMovementType(StockMovementType stockMovementType){
    this.stockMovementType = stockMovementType;
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
  public StockMovement setAddedDate(java.util.Date addedDate){
    this.addedDate = addedDate;
    return this;
  }

  /**
   * Obtém note
   * return note
   * @generated
   */
  
  public java.lang.String getNote(){
    return this.note;
  }

  /**
   * Define note
   * @param note note
   * @generated
   */
  public StockMovement setNote(java.lang.String note){
    this.note = note;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    StockMovement object = (StockMovement)obj;
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
