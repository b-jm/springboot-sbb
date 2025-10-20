package com.example.sbb.question.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;    // 아이디

    @Column(length = 200, nullable = false)
    private String subject;     // 질문 제목
}
