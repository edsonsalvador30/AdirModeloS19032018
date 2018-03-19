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
@Repository("ProductDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface ProductDAO extends JpaRepository<Product, java.lang.String> {

  /**
   * Obtém a instância de Product utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Product entity WHERE entity.id = :id")
  public Product findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Product utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Product entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM ProductPurchaseOrder entity WHERE entity.product.id = :id")
  public Page<ProductPurchaseOrder> findProductPurchaseOrder(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM StockItem entity WHERE entity.product.id = :id")
  public Page<StockItem> findStockItem(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM ProductCharacteristicValue entity WHERE entity.product.id = :id")
  public Page<ProductCharacteristicValue> findProductCharacteristicValue(@Param(value="id") java.lang.String id, Pageable pageable);
  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.productCharacteristic FROM ProductCharacteristicValue entity WHERE entity.product.id = :id")
  public Page<ProductCharacteristic> listProductCharacteristic(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  @Modifying
  @Query("DELETE FROM ProductCharacteristicValue entity WHERE entity.product.id = :instanceId AND entity.productCharacteristic.id = :relationId")
  public int deleteProductCharacteristic(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  
  /**
   * Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM Product entity WHERE entity.name like concat('%',coalesce(:search,''),'%')")
  public Page<Product> generalSearch(@Param(value="search") java.lang.String search, Pageable pageable);

  /**
   * Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM Product entity WHERE (:name is null OR entity.name like concat('%',:name,'%'))")
  public Page<Product> specificSearch(@Param(value="name") java.lang.String name, Pageable pageable);
  
  /**
   * Foreign Key productStatus
   * @generated
   */
  @Query("SELECT entity FROM Product entity WHERE entity.productStatus.id = :id")
  public Page<Product> findProductsByProductStatus(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * Foreign Key brand
   * @generated
   */
  @Query("SELECT entity FROM Product entity WHERE entity.brand.id = :id")
  public Page<Product> findProductsByBrand(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * Foreign Key productCategory
   * @generated
   */
  @Query("SELECT entity FROM Product entity WHERE entity.productCategory.id = :id")
  public Page<Product> findProductsByProductCategory(@Param(value="id") java.lang.String id, Pageable pageable);

}
