package com.chenhaibo.dao;

import com.chenhaibo.model.User;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author chenhaibo
 * @since 2018-11-27
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
    User findByUserName(String name);
}
