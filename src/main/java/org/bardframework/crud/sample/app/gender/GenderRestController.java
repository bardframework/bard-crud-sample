package org.bardframework.crud.sample.app.gender;

import org.bardframework.crud.sample.common.controller.ReadRestControllerAbstract;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = GenderRestController.PATH, produces = APPLICATION_JSON_VALUE)
public class GenderRestController extends ReadRestControllerAbstract<GenderModel, GenderCriteria, GenderService> {

    public static final String PATH = "gender";
}
