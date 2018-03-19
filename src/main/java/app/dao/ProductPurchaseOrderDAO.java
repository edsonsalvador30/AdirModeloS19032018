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
@Repository("ProductPurchaseOrderDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface ProductPurchaseOrderDAO extends JpaRepository<ProductPurchaseOrder, java.lang.String> {

  /**
   * Obtém a instância de ProductPurchaseOrder utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM ProductPurchaseOrder entity WHERE entity.id = :id")
  public ProductPurchaseOrder findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de ProductPurchaseOrder utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM ProductPurchaseOrder entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  /**
   * Foreign Key product
   * @generated
   */
  @Query("SELECT entity FROM ProductPurchaseOrder entity WHERE entity.product.id = :id")
  public Page<ProductPurchaseOrder> findProductPurchaseOrdersByProduct(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * Foreign Key purchaseOrder
   * @generated
   */
  @Query("SELECT entity FROM ProductPurchaseOrder entity WHERE entity.purchaseOrder.id = :id")
  public Page<ProductPurchaseOrder> findProductPurchaseOrdersByPurchaseOrder(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * Foreign Key purchaseProductStatus
   * @generated
   */
  @Query("SELECT entity FROM ProductPurchaseOrder entity WHERE entity.purchaseProductStatus.id = :id")
  public Page<ProductPurchaseOrder> findProductPurchaseOrdersByPurchaseProductStatus(@Param(value="id") java.lang.String id, Pageable pageable);

}
