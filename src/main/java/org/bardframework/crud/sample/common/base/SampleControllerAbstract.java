package org.bardframework.crud.sample.common.base;

import org.bardframework.crud.sample.common.SampleUser;

public abstract class SampleControllerAbstract {

    public SampleUser getUser() {
        /*
            fetch user from security context
         */
        return null;
    }
}
