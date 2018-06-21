package com.sxl.sbj.service;

import com.sxl.sbj.entity.User;
import com.sxl.sbj.exception.ExampleOperatorException;

import java.util.List;
import java.util.Optional;

/**
 * @author SxL
 * Created on 6/6/2018 18:43.
 */
public interface ExampleService {
    /**
     *  新增
     * @param user 实体
     * @return 执行状态
     * @throws ExampleOperatorException 异常
     */
    void saveExample(User user) throws ExampleOperatorException;

    /**
     * 修改，删除（假删除）
     * @param user 实体
     * @return 执行状态
     * @throws ExampleOperatorException 异常
     */
    void updateExample(User user) throws ExampleOperatorException;

    /**
     * 主键查询
     * @param exampleId 主键
     * @return 实体
     */
    Optional<User> getExampleById(int exampleId);

    /**
     * 列表查询
     * @return 实体列表
     */
    List<User> listExample();
}
