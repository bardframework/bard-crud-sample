package org.bardframework.crud.sample.app.customer;

import lombok.Getter;
import org.bardframework.crud.api.base.ReadRestController;
import org.bardframework.crud.api.base.WriteRestController;
import org.bardframework.crud.sample.common.SampleUser;
import org.bardframework.crud.sample.common.base.SampleRestControllerAbstract;
import org.bardframework.table.TableModelRestController;
import org.bardframework.table.TableTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Getter
@RestController
@RequestMapping(value = "api/customer", produces = APPLICATION_JSON_VALUE)
public class CustomerRestController extends SampleRestControllerAbstract<CustomerService, String> implements
        ReadRestController<CustomerModel, CustomerCriteria, CustomerService, String, SampleUser>,
        WriteRestController<CustomerModel, CustomerDto, CustomerService, String, SampleUser>,
        TableModelRestController<CustomerModel, CustomerCriteria, CustomerService, SampleUser> {

    @Qualifier("CustomerPage")
    @Autowired
    private TableTemplate tableTemplate;

    protected CustomerRestController(CustomerService service) {
        super(service);
    }

    @Override
    public boolean isRtl(Locale locale, SampleUser user) {
        return false;
    }

    @Override
    public String getExportFileName(String contentType, Locale locale, SampleUser user) {
        return "customer-export.xlsx";
    }
}
