package com.tc.train.view;

import java.util.List;

import com.tc.train.bean.Train;

public class DepoView {

	public void print(List<Train> trains) {
		for (Train tr : trains) {
			System.out.print("\nDestination: " + tr.getDepaturePlace() + "\nTrain Number: " + tr.getNumber()
					+ "\nDeparture Time = " + tr.getDepatureTime());
			System.out.println();
		}
	}
}
