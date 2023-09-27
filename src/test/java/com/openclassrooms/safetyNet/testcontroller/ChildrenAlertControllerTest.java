
package com.openclassrooms.safetyNet.testcontroller;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static java.nio.file.Paths.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class ChildrenAlertControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGetChildsAtAddress() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/childAlert?address=1509%20Culver%20St"))
                .andExpect(status().is2xxSuccessful());
    }
}