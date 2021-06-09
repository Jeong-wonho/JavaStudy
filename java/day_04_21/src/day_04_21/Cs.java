package day_04_21;

import java.util.ArrayList;

public class Cs implements I {
	C c = null;
	String title;
	String director;
	String genre;
	String count;
	String actor;
	String actress;
	String time;
	
	public Cs(String title, String director, String genre, String count, String actor, String actress, String time) {
		
		this.title = title;
		this.director = director;
		this.genre = genre;
		this.count = count;
		this.actor = actor;
		this.actress = actress;
		this.time = time;
	}

	public Cs() {
		
		// TODO Auto-generated constructor stub
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getCount() {
		return count;
	}

	public void setCount(String count) {
		this.count = count;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public String getActress() {
		return actress;
	}

	public void setActress(String actress) {
		this.actress = actress;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	@Override
	public ArrayList<String> getList() {
		ArrayList<String> list = new ArrayList<String>();
		list.add(title + director + genre + count + actor + actress + time);
		return list;
	}
	
}
