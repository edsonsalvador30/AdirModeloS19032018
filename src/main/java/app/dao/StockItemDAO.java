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
@Repository("StockItemDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface StockItemDAO extends JpaRepository<StockItem, java.lang.String> {

  /**
   * Obtém a instância de StockItem utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM StockItem entity WHERE entity.id = :id")
  public StockItem findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de StockItem utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM StockItem entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM StockMovement entity WHERE entity.stockItem.id = :id")
  public Page<StockMovement> findStockMovement(@Param(value="id") java.lang.String id, Pageable pageable);
  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.stockMovementType FROM StockMovement entity WHERE entity.stockItem.id = :id")
  public Page<StockMovementType> listStockMovementType(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  @Modifying
  @Query("DELETE FROM StockMovement entity WHERE entity.stockItem.id = :instanceId AND entity.stockMovementType.id = :relationId")
  public int deleteStockMovementType(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * Foreign Key stock
   * @generated
   */
  @Query("SELECT entity FROM StockItem entity WHERE entity.stock.id = :id")
  public Page<StockItem> findStockItemsByStock(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * Foreign Key itemStatus
   * @generated
   */
  @Query("SELECT entity FROM StockItem entity WHERE entity.itemStatus.id = :id")
  public Page<StockItem> findStockItemsByItemStatus(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * Foreign Key product
   * @generated
   */
  @Query("SELECT entity FROM StockItem entity WHERE entity.product.id = :id")
  public Page<StockItem> findStockItemsByProduct(@Param(value="id") java.lang.String id, Pageable pageable);

}
