package com.ltts.project.model;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "booking")
public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int bookedSeats;
	private Date date;
	private Time time;
	private int total;
	@ManyToOne
	private Movie movie;
	@ManyToOne
	private Screen screen;
	@ManyToOne
	@JoinColumn(name="email")
	private Member user;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getBookedSeats() {
		return bookedSeats;
	}
	public void setBookedSeats(int bookedSeats) {
		this.bookedSeats = bookedSeats;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Time getTime() {
		return time;
	}
	public void setTime(Time time) {
		this.time = time;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	public Screen getScreen() {
		return screen;
	}
	public void setScreen(Screen screen) {
		this.screen = screen;
	}
	public Member getUser() {
		return user;
	}
	public void setUser(Member user) {
		this.user = user;
	}
	public Booking(int id, int bookedSeats, Date date, Time time, int total, Movie movie, Screen screen, Member user) {
		super();
		this.id = id;
		this.bookedSeats = bookedSeats;
		this.date = date;
		this.time = time;
		this.total = total;
		this.movie = movie;
		this.screen = screen;
		this.user = user;
	}
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
