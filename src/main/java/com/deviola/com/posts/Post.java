package com.deviola.com.posts;

import com.deviola.com.users.User;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "posts")
@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NonNull
    @ManyToOne
    private User user;

    @NonNull
    private String body;

}
