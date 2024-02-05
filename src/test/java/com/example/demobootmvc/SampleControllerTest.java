package com.example.demobootmvc;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@ExtendWith(SpringExtension.class)
@WebMvcTest
class SampleControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    void hello() throws Exception {
        mockMvc.perform(get("/hello/daeho"))
                .andDo(print())
                .andExpect(content().string("hello daeho"));
    }

    @Test
    void helloV2() throws Exception {
        mockMvc.perform(get("/hello")
                        .param("name", "daeho"))
                .andDo(print())
                .andExpect(content().string("hello daeho"));
    }
}