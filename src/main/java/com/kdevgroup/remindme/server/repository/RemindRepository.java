package com.kdevgroup.remindme.server.repository;

import com.kdevgroup.remindme.server.entity.Remind;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RemindRepository extends JpaRepository<Remind, Long> {

}
