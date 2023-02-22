package com.example.jaffarShaikh.model;


import lombok.*;

import javax.persistence.*;

@Getter
@Setter
//insted of this 2 annotation we can use @Data also but it will provide extra things.
@AllArgsConstructor
@NoArgsConstructor
@Entity // we use this to create the table in database
@Table(name = "Student")

public class Student {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
@Column(name ="first_name")
    private String firstName;
    @Column(name ="last_name")
    private String lastName;
    @Column(name ="emil_id")
    private  String emailId;

}
