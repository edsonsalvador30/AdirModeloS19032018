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
@Repository("ProductCharacteristicDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface ProductCharacteristicDAO extends JpaRepository<ProductCharacteristic, java.lang.String> {

  /**
   * Obtém a instância de ProductCharacteristic utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM ProductCharacteristic entity WHERE entity.id = :id")
  public ProductCharacteristic findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de ProductCharacteristic utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM ProductCharacteristic entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM ProductCharacteristicValue entity WHERE entity.productCharacteristic.id = :id")
  public Page<ProductCharacteristicValue> findProductCharacteristicValue(@Param(value="id") java.lang.String id, Pageable pageable);
  
  /**
   * ManyToOne Relation - Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity.product FROM ProductCharacteristicValue entity WHERE entity.productCharacteristic.id = :id AND (entity.product.name like concat('%',coalesce(:search,''),'%'))")
  public Page<Product> listProductGeneralSearch(@Param(value="search") java.lang.String search, @Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * ManyToOne Relation - Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity.product FROM ProductCharacteristicValue entity WHERE entity.productCharacteristic.id = :id AND (:name is null OR entity.product.name like concat('%',:name,'%'))")
  public Page<Product> listProductSpecificSearch(@Param(value="id") java.lang.String id, @Param(value="name") java.lang.String name, Pageable pageable);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.product FROM ProductCharacteristicValue entity WHERE entity.productCharacteristic.id = :id")
  public Page<Product> listProduct(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  @Modifying
  @Query("DELETE FROM ProductCharacteristicValue entity WHERE entity.productCharacteristic.id = :instanceId AND entity.product.id = :relationId")
  public int deleteProduct(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

}
