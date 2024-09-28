package kr.pe.hyeonkyun.toysbootboard.service;

import kr.pe.hyeonkyun.toysbootboard.model.dao.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PostService {

    Page<Post> findAll(Pageable pageable);

    Post findById(Long id);

    Post save(Post post);

    void deleteById(Long id);
}
