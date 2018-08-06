package com.kdevgroup.remindme.server.services;

import com.kdevgroup.remindme.server.entity.Remind;
import com.kdevgroup.remindme.server.repository.RemindRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReminderServiceImpl implements ReminderService {

    @Autowired
    RemindRepository remindRepository;

    @Override
    public List<Remind> findAll() {
        return remindRepository.findAll();
    }

    @Override
    public Optional<Remind> findOne(long id) {
        return remindRepository.findById(id);
    }

    @Override
    public Remind saveOne(Remind remind) {
        return remindRepository.saveAndFlush(remind);
    }

    @Override
    public void deleteOne(long id) {
        remindRepository.deleteById(id);
    }
}
