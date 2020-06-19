package com.aws.book.springboot.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter // 클래스 내 모든 필드의 Getter 메소드 자동 생성
@NoArgsConstructor // 기본 생성자 자동 추가 === public Posts () {}
@Entity // @Entity = 테이블과 링크될 클래스
public class Posts {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY) // @Id = PK, GeneratedValue = PK 생성 규칙
    private Long id;

    // @Column = 테이블 컬럼 표시, 기본값 외 추가로 변경이 필요한 옵션 있으면 사용
    @Column(length = 500, nullable = false) 
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author; // @Column 없어도 컬럼으로 인식

    @Builder
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
