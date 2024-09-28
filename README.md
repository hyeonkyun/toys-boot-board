# toys-boot-board

## Springboot board toy project with thymeleaf template.

---

http://localhost:8080/posts

```mariadb
CREATE DATABASE `toys` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci */ ;
CREATE USER 'toydbuser'@'%' IDENTIFIED BY '1q2w3e4r' ;
GRANT ALL PRIVILEGES ON toys.* TO 'toydbuser'@'%' ;
ALTER DATABASE toys CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ;
FLUSH PRIVILEGES ;

CREATE TABLE Post (
    id BIGINT NOT NULL AUTO_INCREMENT COMMENT '게시글 ID',
    title VARCHAR(255) NOT NULL COMMENT '게시글 제목',
    content TEXT NOT NULL COMMENT '게시글 내용',
    created_at DATETIME NOT NULL COMMENT '생성일시',
    updated_at DATETIME NOT NULL COMMENT '수정일시',
    PRIMARY KEY (id)
);
```
