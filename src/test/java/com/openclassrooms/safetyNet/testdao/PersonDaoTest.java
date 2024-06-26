package com.openclassrooms.safetyNet.testdao;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.openclassrooms.safetyNet.dao.PersonDao;
import com.openclassrooms.safetyNet.dao.impl.PersonDaoImpl;
import org.junit.jupiter.api.Test;
import org.springframework.util.CollectionUtils;

import java.io.IOException;

import static org.junit.Assert.assertTrue;

public class PersonDaoTest {

    private PersonDao personDao = new PersonDaoImpl("src/test/resources/data.json");

    @Test
    void testListPerson() throws ClassNotFoundException, JsonProcessingException, IOException {
        assertTrue(!CollectionUtils.isEmpty(personDao.list()));
    }
}
