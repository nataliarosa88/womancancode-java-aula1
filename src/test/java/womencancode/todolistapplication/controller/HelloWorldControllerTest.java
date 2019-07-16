package womencancode.todolistapplication.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class HelloWorldControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void helloWorld() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/helloworld"))
                .andExpect(status().isOk());
    }

    @Test
    public void helloWorld1() throws Exception {
        String pathVariable = "test";
        String expectedContent = String.format("Hello %s", pathVariable);

        mvc.perform(MockMvcRequestBuilders.get("/helloworld/{path}", pathVariable))
                .andExpect(status().isOk())
                .andExpect(content().string(expectedContent));
    }

    @Test
    public void whichColor() throws Exception {
        String pathVariable = "blue";
        String pathVariable2 = null;
        String expectedContent = String.format("The color chosen is %s", pathVariable);

        mvc.perform(MockMvcRequestBuilders.get("/whichcolor/{path}", pathVariable))
                .andExpect(status().isOk())
                .andExpect(content().string(expectedContent));

        mvc.perform(MockMvcRequestBuilders.get("/whichcolor/{path}", pathVariable2))
                .andExpect(status().isNotFound());

    }





}
