package com.kodilla.hibernate.task.dao;

import com.kodilla.hibernate.task.Task;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//Podsumowując - wskazujemy klasę do utrwalania (czyli klasę, której
// obiekty będziemy zapisywać w baziedanych) oraz typ danych użyty
// dla klucza głównego.

@Transactional
@Repository
public interface TaskDao extends CrudRepository<Task, Integer> {
    List<Task> findByDuration (int duration);
    @Query
    List<Task> retrieveLongTasks();
    @Query
    List<Task> retrieveShortTasks();
    @Query(nativeQuery = true)
    List<Task> retrieveTasksWithEnoughTime();
    @Query
    List<Task> retrieveTasksWithDurationLongerThen(@Param("DURATION") int duration);
}
