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
@Repository("StockMovementTypeDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface StockMovementTypeDAO extends JpaRepository<StockMovementType, java.lang.String> {

  /**
   * Obtém a instância de StockMovementType utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM StockMovementType entity WHERE entity.id = :id")
  public StockMovementType findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de StockMovementType utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM StockMovementType entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM StockMovement entity WHERE entity.stockMovementType.id = :id")
  public Page<StockMovement> findStockMovement(@Param(value="id") java.lang.String id, Pageable pageable);
  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.stockItem FROM StockMovement entity WHERE entity.stockMovementType.id = :id")
  public Page<StockItem> listStockItem(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  @Modifying
  @Query("DELETE FROM StockMovement entity WHERE entity.stockMovementType.id = :instanceId AND entity.stockItem.id = :relationId")
  public int deleteStockItem(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

}
