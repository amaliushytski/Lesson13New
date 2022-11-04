package com.tc.train.logic;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.tc.train.bean.Depo;
import com.tc.train.bean.Train;

public class DepoLogic {

	public List<Train> sortByNumber(List<Train> trains) {

		trains.sort((train1, train2) -> train1.getNumber() - train2.getNumber());
		return trains;
	}

	public void sortByDepartureAndTime(List<Train> trains) {

		Collections.sort(trains, new Comparator<Train>() {
			@Override
			public int compare(Train tr1, Train tr2) {
				if (tr1.getDepaturePlace() == tr2.getDepaturePlace()) {
					return tr1.getDepatureTime().compareTo(tr2.getDepatureTime());
				} else {
					return tr1.getDepaturePlace().compareTo(tr2.getDepaturePlace());
				}
			}
		});
	}

	public void find(int number, List<Train> trains) {
		for (Train tr : trains) {
			if (tr.getNumber() == number) {
				System.out.print("\nDestination: " + tr.getDepaturePlace() + "\nTrain Number: " + tr.getNumber()
						+ "\nDeparture Time = " + tr.getDepatureTime());
				System.out.println();
			}
		}
	}

}
