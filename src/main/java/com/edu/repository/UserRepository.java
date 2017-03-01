package com.edu.repository;

import com.edu.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by wuxiaolong on 2017/2/27.
 */
public interface UserRepository extends PagingAndSortingRepository<User,Integer> {

    public Page<User> queryByGender(Integer gender, Pageable pageable);
}
