package com.tc.train.main;

import java.util.Date;

import com.tc.train.bean.Depo;
import com.tc.train.bean.Month;
import com.tc.train.bean.Train;
import com.tc.train.logic.DepoLogic;
import com.tc.train.view.DepoView;

public class Main {

	public static void main(String[] args) {
		Date d1 = new Date(2022 - 1900, Month.JANUARY, 1, 15, 56);
		Date d2 = new Date(2022 - 1900, Month.FEBRYARY, 14, 15, 57);
		Date d3 = new Date(2022 - 1900, Month.APRIL, 10, 10, 01);
		Date d4 = new Date(2022 - 1900, Month.JULY, 21, 6, 14);

		Train tr1 = new Train(1, "Minsk", d1);
		Train tr2 = new Train(3, "Minsk", d2);
		Train tr3 = new Train(7, "Paris", d3);
		Train tr4 = new Train(5, "Warsaw", d4);

		Depo depo = new Depo();

		depo.addTrain(tr1);
		depo.addTrain(tr2);
		depo.addTrain(tr3);
		depo.addTrain(tr4);

		DepoLogic depoManager = new DepoLogic();

		depoManager.sortByNumber(depo.getTrains());

		DepoView view = new DepoView();

		view.print(depo.getTrains());

		depoManager.find(5, depo.getTrains());

		depoManager.sortByDepartureAndTime(depo.getTrains());
		view.print(depo.getTrains());

	}
}
