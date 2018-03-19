package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
import cronapi.CronapiByteHeaderSignature;


/**
 * Classe que representa a tabela PURCHASEORDER
 * @generated
 */
@Entity
@Table(name = "\"PURCHASEORDER\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.PurchaseOrder")
public class PurchaseOrder implements Serializable {

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
  @Column(name = "fiscalDocument", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.lang.String fiscalDocument;

  /**
  * @generated
  */
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "addedDate", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date addedDate;

  /**
  * @generated
  */
  @Column(name = "image", nullable = true, unique = false, insertable=true, updatable=true)
  
  private byte[] image;

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
  @JoinColumn(name="fk_purchaseOrderStatus", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private PurchaseOrderStatus purchaseOrderStatus;

  /**
   * Construtor
   * @generated
   */
  public PurchaseOrder(){
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
  public PurchaseOrder setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém fiscalDocument
   * return fiscalDocument
   * @generated
   */
  
  public java.lang.String getFiscalDocument(){
    return this.fiscalDocument;
  }

  /**
   * Define fiscalDocument
   * @param fiscalDocument fiscalDocument
   * @generated
   */
  public PurchaseOrder setFiscalDocument(java.lang.String fiscalDocument){
    this.fiscalDocument = fiscalDocument;
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
  public PurchaseOrder setAddedDate(java.util.Date addedDate){
    this.addedDate = addedDate;
    return this;
  }

  /**
   * Obtém image
   * return image
   * @generated
   */
  
  public byte[] getImage(){
    return this.image;
  }

  /**
   * Define image
   * @param image image
   * @generated
   */
  public PurchaseOrder setImage(byte[] image){
    this.image = image;
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
  public PurchaseOrder setAttachment(byte[] attachment){
    this.attachment = attachment;
    return this;
  }

  /**
   * Obtém purchaseOrderStatus
   * return purchaseOrderStatus
   * @generated
   */
  
  public PurchaseOrderStatus getPurchaseOrderStatus(){
    return this.purchaseOrderStatus;
  }

  /**
   * Define purchaseOrderStatus
   * @param purchaseOrderStatus purchaseOrderStatus
   * @generated
   */
  public PurchaseOrder setPurchaseOrderStatus(PurchaseOrderStatus purchaseOrderStatus){
    this.purchaseOrderStatus = purchaseOrderStatus;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    PurchaseOrder object = (PurchaseOrder)obj;
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
