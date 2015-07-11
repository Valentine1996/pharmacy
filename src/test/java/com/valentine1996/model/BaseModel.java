package com.valentine1996.model;


import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by valentyn on 7/11/15.
 */
@ContextConfiguration(locations = {"classpath:hsql/test-db-context.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class BaseModel {
}
