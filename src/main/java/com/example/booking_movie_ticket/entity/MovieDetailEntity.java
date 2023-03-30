package com.example.booking_movie_ticket.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "movie_detail")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MovieDetailEntity {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String movieName;
    @Column(name = "title")
    private String title;

    @ManyToOne
    @JoinColumn(name = "genre_ids")
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private GenreEntity genreIds;
    @Column(name = "description")
    private String movieDescription;
    @Column(name = "createdDate")
    private String createdDate;

}
