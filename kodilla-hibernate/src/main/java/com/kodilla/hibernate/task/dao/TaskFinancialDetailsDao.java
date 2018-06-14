package com.kodilla.hibernate.task.dao;

import com.kodilla.hibernate.task.TaskFinancialDetails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;
import java.util.List;


//kontroler re
// pozytorium
@Transactional
@Repository
public interface TaskFinancialDetailsDao extends CrudRepository<TaskFinancialDetails,
        Integer> {
    List<TaskFinancialDetails> findByPaid(boolean paid);
    //zwraca listę obiektów TaskFinancialDetails, dla których pole paid
    //ustawione jest na wartość określoną parametrem metody paid.
}
