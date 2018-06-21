package com.sxl.sbj.dao;

import com.sxl.sbj.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author SxL
 *         Created on 2018/6/6.
 */
public interface ExampleDao extends JpaRepository<User, Integer> {
   }
