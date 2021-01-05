package com.cos.blogproject.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Reply {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, length = 200)
    private String Content;

    @JoinColumn(name = "BoardId")
    @ManyToOne
    private Board board;

    @JoinColumn(name = "UserId")
    @ManyToOne
    private User user;

    @CreationTimestamp
    Timestamp createdDate;


}
