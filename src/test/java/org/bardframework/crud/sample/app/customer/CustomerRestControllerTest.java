package org.bardframework.crud.sample.app.customer;

import com.fasterxml.jackson.databind.JavaType;
import org.bardframework.crud.api.base.ReadRestControllerTest;
import org.bardframework.crud.api.base.WriteRestControllerTest;
import org.bardframework.crud.sample.common.SampleUser;
import org.bardframework.crud.sample.common.base.SampleRestControllerTest;
import org.bardframework.table.TableModelRestControllerTest;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Locale;

class CustomerRestControllerTest extends SampleRestControllerTest<CustomerRestController, CustomerDataProvider, String> implements
        ReadRestControllerTest<CustomerModel, CustomerCriteria, CustomerDataProvider, String, SampleUser>,
        WriteRestControllerTest<CustomerModel, CustomerDto, CustomerDataProvider, String, SampleUser>,
        TableModelRestControllerTest<CustomerRestController, CustomerModel, CustomerCriteria, CustomerDataProvider, String, SampleUser> {

    @Override
    public Class<CustomerModel> getModelClass() {
        return CustomerModel.class;
    }

    @Override
    public JavaType getModelJavaType() {
        return ReadRestControllerTest.super.getModelJavaType();
    }

    @Override
    public String makeUrl(String url, CustomerCriteria criteria, Pageable pageable) throws ReflectiveOperationException {
        return ReadRestControllerTest.super.makeUrl(url, criteria, pageable);
    }

    @Override
    public List<Locale> getLocales() {
        return List.of(Locale.forLanguageTag("fa"), Locale.forLanguageTag("en"));
    }
}
