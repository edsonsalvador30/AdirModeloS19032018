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
@Repository("ProductStatusDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface ProductStatusDAO extends JpaRepository<ProductStatus, java.lang.String> {

  /**
   * Obtém a instância de ProductStatus utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM ProductStatus entity WHERE entity.id = :id")
  public ProductStatus findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de ProductStatus utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM ProductStatus entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);


    
  /**
   * OneToMany Relation - Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM Product entity WHERE entity.productStatus.id = :id AND (entity.name like concat('%',coalesce(:search,''),'%'))")
  public Page<Product> findProductGeneralSearch(@Param(value="search") java.lang.String search, @Param(value="id") java.lang.String id, Pageable pageable);

  /** 
   * OneToMany Relation - Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM Product entity WHERE entity.productStatus.id = :id AND (:name is null OR entity.name like concat('%',:name,'%'))")
  public Page<Product> findProductSpecificSearch(@Param(value="id") java.lang.String id, @Param(value="name") java.lang.String name, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Product entity WHERE entity.productStatus.id = :id")
  public Page<Product> findProduct(@Param(value="id") java.lang.String id, Pageable pageable);

}
