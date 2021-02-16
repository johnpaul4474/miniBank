package com.test.dao;

import org.springframework.data.repository.CrudRepository;

import com.test.model.MiniBankModel;

public interface MiniBankDao extends CrudRepository<MiniBankModel,Integer>{

}
