package com.rpm.web.carbook;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecordRepository extends CrudRepository<Record, Long> {
    public List<Record> findByMycarIdOrderByDate(Long id);

    @Query(value ="SELECT * FROM RECORD INNER JOIN MYCAR ON RECORD.MYCAR_ID = MYCAR.MYCARID WHERE MYCAR_ID =:mycar ORDER BY RDATE",
                nativeQuery = true)
    public List<Record> findbyMycarId(long mycar);


    public void deleteRecordByRecordId(long id);



}
