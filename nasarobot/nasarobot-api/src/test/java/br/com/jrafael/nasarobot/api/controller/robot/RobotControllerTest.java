package br.com.jrafael.nasarobot.api.controller.robot;

import br.com.jrafael.nasarobot.api.NasaRobotApiApplication;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = NasaRobotApiApplication.class)
@AutoConfigureMockMvc
public class RobotControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void sendPostCommandMMLToRobotTest() throws Exception {
        this.mockMvc.perform(post("/rest/mars/MML").content("")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string("(0, 2, W)"));
    }

    @Test
    public void sendPostCommandMMRToRobotTest() throws Exception {
        this.mockMvc.perform(post("/rest/mars/MMR").content("")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string("(0, 2, E)"));
    }

    @Test
    public void sendPostCommandMMRMMRMMToRobotTest() throws Exception {
        this.mockMvc.perform(post("/rest/mars/MMRMMRMM").content("")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string("(2, 0, S)"));
    }

    @Test
    public void sendPostInvalidCommandAAAToRobotTest() throws Exception {
        this.mockMvc.perform(post("/rest/mars/AAA").content("")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isBadRequest());
    }

    @Test
    public void sendPostCommandRRRRLLMMMMMToRobotTest() throws Exception {
        this.mockMvc.perform(post("/rest/mars/RRRRLLMMMMM").content("")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string("(0, -5, S)"));
    }

    @Test
    public void sendPostInvalidCommandMMMMMMMMMMMMMMMMMMMMMMMMToRobotTest() throws Exception {
        this.mockMvc.perform(post("/rest/mars/MMMMMMMMMMMMMMMMMMMMMMMM").content("")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isBadRequest());
    }

}
