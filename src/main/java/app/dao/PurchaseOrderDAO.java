package app.dao;

import app.entity.*;
import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.domain.*;
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.*; 


/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * Os métodos de create, edit, delete e outros estão abstraídos no JpaRepository
 * 
 * @see org.springframework.data.jpa.repository.JpaRepository
 * 
 * @generated
 */
@Repository("PurchaseOrderDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface PurchaseOrderDAO extends JpaRepository<PurchaseOrder, java.lang.String> {

  /**
   * Obtém a instância de PurchaseOrder utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM PurchaseOrder entity WHERE entity.id = :id")
  public PurchaseOrder findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de PurchaseOrder utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM PurchaseOrder entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM ProductPurchaseOrder entity WHERE entity.purchaseOrder.id = :id")
  public Page<ProductPurchaseOrder> findProductPurchaseOrder(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * Foreign Key purchaseOrderStatus
   * @generated
   */
  @Query("SELECT entity FROM PurchaseOrder entity WHERE entity.purchaseOrderStatus.id = :id")
  public Page<PurchaseOrder> findPurchaseOrdersByPurchaseOrderStatus(@Param(value="id") java.lang.String id, Pageable pageable);

}
