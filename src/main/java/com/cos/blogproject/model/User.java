package com.cos.blogproject.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.*;
import java.sql.Timestamp;

//@DynamicInsert 이건 insert 할 때 null인 필드를 제외시켜줌 그래서 columDefault 에서 지정한 값으로 들어가지만 잘 안쓰임
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
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

    //DB는 RoleType이라는 내가 만든 자바 오브젝트가 없으니 알아먹게 어노테이션을 붙여줘야함

    @Enumerated(EnumType.STRING)
    private RoleType role;
    @CreationTimestamp // 이 어노테이션으로 시간이 자동으로 입력된다.
    private Timestamp createDate;
}
