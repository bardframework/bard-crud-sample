package org.bardframework.crud.sample.sample;

import org.bardframework.commons.utils.RandomStringUtils;
import org.springframework.stereotype.Component;

@Component
public class SampleDataProvider {

    public SampleDto getDtoValid() {
        SampleDto request = new SampleDto();
        request.setEmail(this.getEmailValid());
        request.setDisplayName(this.getNameValid());
        request.setDescription(this.getDescriptionValid());
        return request;
    }

    public String getEmailValid() {
        return RandomStringUtils.randomAlphabetic(1, 10);
    }

    public String getNameValid() {
        return RandomStringUtils.randomAlphabetic(1, 10);
    }

    public String getUsernameValid() {
        return RandomStringUtils.randomAlphanumeric(6, 50);
    }

    public String getDescriptionValid() {
        return RandomStringUtils.randomAlphanumeric(0, 100);
    }
}
