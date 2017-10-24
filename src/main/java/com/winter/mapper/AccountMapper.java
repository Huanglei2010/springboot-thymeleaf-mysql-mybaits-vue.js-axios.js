package com.winter.mapper;

import com.winter.model.Account;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface AccountMapper {
    int update(@Param("money") double money, @Param("id") int  id);
    void insertAccount( Account account);
}
