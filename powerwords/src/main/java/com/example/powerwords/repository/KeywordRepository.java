package com.example.powerwords.repository;

import java.util.List;
import java.util.Optional;

import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;
import org.seasar.doma.boot.ConfigAutowireable;
import org.springframework.transaction.annotation.Transactional;

import com.example.powerwords.entity.Keyword;

@ConfigAutowireable
@Dao
public interface KeywordRepository {
	
	@Select
	List<Keyword> findall();
	
	@Select
	Optional<Keyword> findById(Integer id);
	
	
	@Insert
	int insert(Keyword keyword);
	
	@Update
	int update(Keyword keyword);
	
	@Delete
	int delete(Keyword keyword);
	
}
