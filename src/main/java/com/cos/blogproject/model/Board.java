package com.cos.blogproject.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false,length = 100)
    private String title;

    @Lob    //Large of Data 255자 이상의 대용량 데이터를 할 때 쓰는것
    private String content;

    @CreationTimestamp
    private Timestamp createdDate;

    @ManyToOne
    @JoinColumn(name = "userId")   // DB에 들어갈 테이블 이름
    private User user;

    @OneToMany(mappedBy = "board", fetch = FetchType.EAGER)
    private List<Reply> replies;

    @ColumnDefault("0")
    private int count;      // 조회수

}
