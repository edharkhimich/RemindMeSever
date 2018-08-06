package com.kdevgroup.remindme.server.services;

import com.kdevgroup.remindme.server.entity.Remind;

import java.util.List;
import java.util.Optional;

public interface ReminderService {

    List<Remind> findAll();

    Optional<Remind> findOne(long id);

    Remind saveOne(Remind remind);

    void deleteOne(long remind);

}
