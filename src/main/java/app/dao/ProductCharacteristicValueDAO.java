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
@Repository("ProductCharacteristicValueDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface ProductCharacteristicValueDAO extends JpaRepository<ProductCharacteristicValue, java.lang.String> {

  /**
   * Obtém a instância de ProductCharacteristicValue utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM ProductCharacteristicValue entity WHERE entity.id = :id")
  public ProductCharacteristicValue findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de ProductCharacteristicValue utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM ProductCharacteristicValue entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  /**
   * Foreign Key product
   * @generated
   */
  @Query("SELECT entity FROM ProductCharacteristicValue entity WHERE entity.product.id = :id")
  public Page<ProductCharacteristicValue> findProductCharacteristicValuesByProduct(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * Foreign Key productCharacteristic
   * @generated
   */
  @Query("SELECT entity FROM ProductCharacteristicValue entity WHERE entity.productCharacteristic.id = :id")
  public Page<ProductCharacteristicValue> findProductCharacteristicValuesByProductCharacteristic(@Param(value="id") java.lang.String id, Pageable pageable);

}
