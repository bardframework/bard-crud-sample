package org.bardframework.crud.sample.app.gender;

import org.bardframework.crud.api.base.ReadRestController;
import org.bardframework.crud.sample.common.SampleUser;
import org.bardframework.crud.sample.common.base.SampleRestControllerAbstract;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "api/gender", produces = APPLICATION_JSON_VALUE)
public class GenderRestController extends SampleRestControllerAbstract<GenderService, String>
        implements ReadRestController<GenderModel, GenderCriteria, GenderService, String, SampleUser> {

    protected GenderRestController(GenderService service) {
        super(service);
    }
}
