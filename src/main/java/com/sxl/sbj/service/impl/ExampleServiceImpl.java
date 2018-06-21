package com.sxl.sbj.service.impl;

import com.sxl.sbj.dao.ExampleDao;
import com.sxl.sbj.entity.User;
import com.sxl.sbj.exception.ExampleOperatorException;
import com.sxl.sbj.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * @author SxL
 * Created on 6/6/2018 18:55.
 */
@Service
public class ExampleServiceImpl implements ExampleService {
    @Autowired
    private ExampleDao exampleDao;

    @Override
    @Transactional(rollbackFor = ExampleOperatorException.class)
    public void saveExample(User user) throws ExampleOperatorException {
        exampleDao.save(user);
    }

    @Override
    @Transactional(rollbackFor = ExampleOperatorException.class)
    public void updateExample(User user) throws ExampleOperatorException {
        if (user.getId() < 0) {
            throw new ExampleOperatorException("待更新实体必须含有主键");
        }

        exampleDao.save(user);
    }

    @Override
    public Optional<User> getExampleById(int exampleId) {
        return exampleDao.findById(exampleId);
    }


    @Override
    public List<User> listExample() {
        return exampleDao.findAll();
    }
}
