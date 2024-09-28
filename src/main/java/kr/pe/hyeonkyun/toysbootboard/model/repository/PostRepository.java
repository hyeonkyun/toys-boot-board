package kr.pe.hyeonkyun.toysbootboard.model.repository;

import kr.pe.hyeonkyun.toysbootboard.model.dao.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}