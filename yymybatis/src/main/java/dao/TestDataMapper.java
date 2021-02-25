package dao;

import pojo.TestData;


public interface TestDataMapper {

    TestData selectByPrimaryKey(Long id);

}