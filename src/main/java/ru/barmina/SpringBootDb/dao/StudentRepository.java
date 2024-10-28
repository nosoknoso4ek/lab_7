package ru.barmina.SpringBootDb.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.barmina.SpringBootDb.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
