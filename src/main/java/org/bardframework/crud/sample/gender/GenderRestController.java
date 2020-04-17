package org.bardframework.crud.sample.gender;

import org.bardframework.crud.sample.common.controller.SampleReadRestControllerAbstract;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = GenderRestController.PATH, produces = APPLICATION_JSON_VALUE)
public class GenderRestController extends SampleReadRestControllerAbstract<GenderModel, GenderCriteria, GenderService> {

    public static final String PATH = "gender";
}
