package com.liu.start.dao;


import com.liu.start.entity.ScsDeliveryTime;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * 
 * 订单配送时效表
 * 
 */
public interface ScsDeliveryTimeMapper {

	/**
	 *
	 * 批量添加数据，添加所有字段的数据
	 *
	 */
	Integer batchInsert(@Param("batchField") List<ScsDeliveryTime> record);

}