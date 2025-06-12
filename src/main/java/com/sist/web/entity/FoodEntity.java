package com.sist.web.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

/*
FNO        NUMBER(38)     
NAME       VARCHAR2(4000) 
TYPE       VARCHAR2(4000) 
PHONE      VARCHAR2(26)   
ADDRESS    VARCHAR2(4000) 
SCORE      NUMBER(38,1)   
THEME      VARCHAR2(4000) 
POSTER     VARCHAR2(4000) 
IMAGES     VARCHAR2(4000) 
TIME       VARCHAR2(128)  
PARKING    VARCHAR2(4000) 
CONTENT    VARCHAR2(4000) 
PRICE      VARCHAR2(26)   
 */
@Entity(name = "project_food")
@Data
public class FoodEntity {
	@Id
	private int fno;
	private double score;
	private String name,type,phone,address,theme,poster,images,time,parking,content,price;
}
