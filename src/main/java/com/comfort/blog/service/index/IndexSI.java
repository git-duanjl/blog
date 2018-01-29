package com.comfort.blog.service.index;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.comfort.blog.Entity.index.IndexE;
import com.comfort.blog.util.MD5Util;


@Service
public class IndexSI implements IndexS{

	private MongoTemplate mongoTemplate;
	
	@Autowired
	IndexSI(MongoTemplate mongoTemplate){
		this.mongoTemplate = mongoTemplate;
	}
	
	public boolean login(IndexE entity) {
		Query query = new Query();
		Criteria criteria = new Criteria();
		criteria.andOperator(Criteria.where("name").is(entity.getName()));
		criteria.and("pwd").is(entity.getPwd());
		query.addCriteria(criteria);
		List<IndexE> list =  mongoTemplate.find(query, IndexE.class);
		
		if(list == null || list.size() == 0) {
			return false;
		}
		return true;
	}
	
	public boolean register(IndexE entity) {
		entity.setId(UUID.randomUUID().toString());
		entity.setOperator("admin");
		entity.setOperatorId("1111111111");
		entity.setPwd(MD5Util.get32Md5(entity.getPwd()));
		entity.setUdt(new Date());
		mongoTemplate.save(entity);
		return true;
	}

}
