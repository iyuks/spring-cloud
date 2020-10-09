package com.yu.mapper;

import com.yu.pojo.User;
import tk.mybatis.mapper.common.Mapper;

/**
 * 生成代理对象MapperProxy,注入到spring容器
 */
//@org.apache.ibatis.annotations.Mapper
public interface UserMapper extends Mapper<User> {
}
