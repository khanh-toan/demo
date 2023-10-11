package com.khanhtoan.demo.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "attendance")
public class Attendance {
    @Id
    @ManyToOne
    @JoinColumn(name = "sessionid")
    private Session session;

    @Id
    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    private boolean present;
    private String description;

    @Temporal(TemporalType.TIMESTAMP)
    private Date record_time;
}
