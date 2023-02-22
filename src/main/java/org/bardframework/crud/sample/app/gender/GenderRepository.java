package org.bardframework.crud.sample.app.gender;

import org.bardframework.crud.api.base.ReadRepository;
import org.bardframework.crud.sample.common.SampleUser;

public interface GenderRepository extends ReadRepository<GenderModel, GenderCriteria, String, SampleUser> {
}
