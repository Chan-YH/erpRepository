package com.yla.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.yla.entity.WarehouseInListGoods;

public interface WarehouseInListGoodsRepository extends JpaRepository<WarehouseInListGoods, Integer>,JpaSpecificationExecutor<WarehouseInListGoods>{

	/**
	 * 根据进货单id查询所有进货单商品
	 * @param warehouseInListId
	 * @return
	 */
	@Query(value="select * from t_warehouse_in_list_goods where warehouse_in_list_id=?1",nativeQuery=true)
	public List<WarehouseInListGoods> listByWarehouseInListId(Integer warehouseInListId);
	
	/**
	 * 删除指定进货单的所有商品
	 * @param warehouseInListId
	 */
	@Query(value="delete from t_warehouse_in_list_goods where warehouse_in_list_id=?1",nativeQuery=true)
	@Modifying
	public void deleteByWarehouseInListId(Integer warehouseInListId);
}
