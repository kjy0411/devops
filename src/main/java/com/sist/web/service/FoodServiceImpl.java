package com.sist.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
import com.sist.web.dao.*;
import com.sist.web.entity.*;
import com.sist.web.vo.*;
@Service
public class FoodServiceImpl implements FoodService{
	// DAO 객체 주소 요청
	@Autowired
	private FoodRepository fDao;

	@Override
	public List<FoodListVO> foodListData(int start, int end) {
		return fDao.foodListData(start, end);
	}

	@Override
	public FoodEntity foodDetailData(int fno) {
		return fDao.findByFno(fno);
	}

	@Override
	public int foodTotalPage() {
		int count=(int)fDao.count();
		int totalpage=(int)(Math.ceil(count/12.0));
		return totalpage;
	}
	
}
