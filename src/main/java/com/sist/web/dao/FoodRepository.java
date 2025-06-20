package com.sist.web.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.*;
import com.sist.web.entity.*;
import com.sist.web.vo.*;
@Repository
public interface FoodRepository extends JpaRepository<FoodEntity, Integer>{
	@Query(value = "SELECT fno,name,poster,num "
			+ "FROM (SELECT fno,name,poster,rownum as num "
			+ "FROM (SELECT fno,name,poster "
			+ "FROM project_food ORDER BY fno ASC)) "
			+ "WHERE num BETWEEN :start AND :end",nativeQuery = true)
	public List<FoodListVO> foodListData(@Param("start") Integer start,@Param("end") Integer end);
	
	public FoodEntity findByFno(int fno);
}
