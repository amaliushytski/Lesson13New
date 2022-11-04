package com.tc.train.bean;

import java.util.Date;
import java.util.Objects;

public class Train {
	private int number;
	private String depaturePlace;
	private Date depatureTime;

	public Train(int number, String depaturePlace, Date depatureTime) {
		super();
		this.number = number;
		this.depaturePlace = depaturePlace;
		this.depatureTime = depatureTime;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getDepaturePlace() {
		return depaturePlace;
	}

	public void setDepaturePlace(String depaturePlace) {
		this.depaturePlace = depaturePlace;
	}

	public Date getDepatureTime() {
		return depatureTime;
	}

	public void setDepatureTime(Date depatureTime) {
		this.depatureTime = depatureTime;
	}

	@Override
	public int hashCode() {
		return Objects.hash(depaturePlace, depatureTime, number);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		return Objects.equals(depaturePlace, other.depaturePlace) && Objects.equals(depatureTime, other.depatureTime)
				&& number == other.number;
	}

	@Override
	public String toString() {
		return "Train [number=" + number + ", depaturePlace=" + depaturePlace + ", depatureTime=" + depatureTime + "]";
	}

}
