package org.springframework.samples.petclinic.web;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.samples.petclinic.model.Vet;
import org.springframework.samples.petclinic.model.Vets;
import org.springframework.samples.petclinic.service.ClinicService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * We should have in our test only one object that we assert against it.
 * Test it. This is a Mock object. In our case it’s a LogWriter.
 * In this case EmailSender helps us to run the test.
 * That is called a Stub. Everything else that helps us to run a test is a Stub.
 * You can have multiple stubs to help test running. This is a basic simple idea!
 * Everything is fake unless you use as a Mock.
 */
@ExtendWith(MockitoExtension.class)
class VetControllerTest {

    /**
     * Mock object is under the tes
     */
    @Mock
    ClinicService clinicService;

    /**
     * Stub object that helps to run the test.
     */
    @Mock
    Map<String, Object> model;

    @InjectMocks
    VetController controller;

    List<Vet> vetsList = new ArrayList<>();

    @BeforeEach
    void setUp() {
        Vet vet = new Vet();
        vetsList.add(vet);

        given(clinicService.findVets()).willReturn(vetsList);
    }

    @Test
    void showVetList() {

        // when => Call the method in VetController
        String view = controller.showVetList(model);

        // then => validate that clinicService.findVets is called once
        then(clinicService).should().findVets();
        then(model).should().put(anyString(), any());

        // only one object that we assert against it
        // in this test is VetController
        assertThat("vets/vetList").isEqualToIgnoringCase(view);
    }

    @Test
    void showResourcesVetList() {

        // when
        Vets vets = controller.showResourcesVetList();

        // then
        then(clinicService).should().findVets();

        // in this test is VetController
        assertThat(vets.getVetList()).hasSize(1);
    }
}