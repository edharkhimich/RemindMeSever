package com.kdevgroup.remindme.server.controller;

import com.kdevgroup.remindme.server.entity.Remind;
import com.kdevgroup.remindme.server.services.ReminderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ReminderController {

    @Autowired
    ReminderService service;

    @RequestMapping(value = "/reminders", method = RequestMethod.GET)
    @ResponseBody
    public List<Remind> getAllReminders() {
        return service.findAll();
    }

    @RequestMapping(value = "/reminders/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Optional<Remind> getReminder(@PathVariable("id") long remindId) {
        return service.findOne(remindId);
    }

    @RequestMapping(value = "/reminders}", method = RequestMethod.POST)
    @ResponseBody
    public Remind saveReminder(@RequestBody Remind remind) {
        return service.saveOne(remind);
    }

    @RequestMapping(value = "/reminders/{id}", method = RequestMethod.POST)
    @ResponseBody
    public void deleteReminder(@PathVariable long remindId) {
        service.deleteOne(remindId);
    }
}
