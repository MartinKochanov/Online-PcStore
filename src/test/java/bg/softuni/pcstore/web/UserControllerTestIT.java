package bg.softuni.pcstore.web;

import bg.softuni.pcstore.Utils.UserTestDataUtil;
import bg.softuni.pcstore.model.entity.UserEntity;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.csrf;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;


@SpringBootTest
@AutoConfigureMockMvc
class UserControllerTestIT {
    private static final String TEST_USER1 = "Pesho";
    private static final String TEST_USER2 = "Pesho2";
    private static final String TEST_ADMIN = "PeshoAdmin";


    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private UserTestDataUtil userTestDataUtil;


    @Test
    void testGetRegistration() throws Exception {
        mockMvc.perform(
                        MockMvcRequestBuilders.get("/register"))
                .andExpect(status().is2xxSuccessful());

    }

    @Test
    void testGetSuccessReg() throws Exception {

        mockMvc.perform(
                        MockMvcRequestBuilders.get("/success-registration"))
                .andExpect(status().is2xxSuccessful()).andExpect(view().name("success-registration"));

    }

    @Test
    void testGetActivation() throws Exception {

        mockMvc.perform(
                        MockMvcRequestBuilders.get("/activation")
                                .param("token", ""))
                .andExpect(status().is4xxClientError());

    }
}

