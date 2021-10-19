package edu.kea.kinoxp.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Id;
import java.time.LocalDate;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Screening {

    public int getIdscreening() {
        return idscreening;
    }

    public void setIdscreening(int idscreening) {
        this.idscreening = idscreening;
    }

    public int getMovies_idmovies() {
        return movies_idmovies;
    }

    public void setMovies_idmovies(int movies_idmovies) {
        this.movies_idmovies = movies_idmovies;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getTimeslot() {
        return timeslot;
    }

    public void setTimeslot(String timeslot) {
        this.timeslot = timeslot;
    }

    public int getCinemas_idcinemahall() {
        return cinemas_idcinemahall;
    }

    public void setCinemas_idcinemahall(int cinemas_idcinemahall) {
        this.cinemas_idcinemahall = cinemas_idcinemahall;
    }

    @Id
    int idscreening;
    int movies_idmovies;        // 32 (this is shrek)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    LocalDate date;             // we only use the date part and not the time
    String timeslot;            // 1, 2, 3 or 4
    int cinemas_idcinemahall;   // 1 or 2

}
