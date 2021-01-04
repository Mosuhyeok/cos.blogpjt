package com.cos.blogproject.model;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // strategy에서 IDENTITY는 해당 연결된 DB (mysql or oracle ect...)의 전략을 따르겠다 라는 뜻
    int id;

    @Column(nullable = false, length = 30)
    private String username;

    @Column(nullable = false, length = 60)  // length를 긹하는 이유는 추후 해시 암호화를 할 것이라서 새악보다 널널하게주기
    private String password;



    @Column(nullable = false, length = 50)
    private String email;

    @ColumnDefault("'user'")    //defalut값 들어가는데 "'이름'" 이런 포멧
    private String role; //Eunum을 쓰는게 좋다
    @CreationTimestamp // 이 어노테이션으로 시간이 자동으로 입력된다.
    private Timestamp createDate;
}
