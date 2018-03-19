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
@Repository("StockMovementDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface StockMovementDAO extends JpaRepository<StockMovement, java.lang.String> {

  /**
   * Obtém a instância de StockMovement utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM StockMovement entity WHERE entity.id = :id")
  public StockMovement findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de StockMovement utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM StockMovement entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  /**
   * Foreign Key stockItem
   * @generated
   */
  @Query("SELECT entity FROM StockMovement entity WHERE entity.stockItem.id = :id")
  public Page<StockMovement> findStockMovementsByStockItem(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * Foreign Key stockMovementType
   * @generated
   */
  @Query("SELECT entity FROM StockMovement entity WHERE entity.stockMovementType.id = :id")
  public Page<StockMovement> findStockMovementsByStockMovementType(@Param(value="id") java.lang.String id, Pageable pageable);

}
