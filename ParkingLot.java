package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class ParkingLot {

	static int minParkingSpaces(int[][] parkingStartEndTimes) {

		ArrayList<ArrayList<Integer>> parkingSpace = new ArrayList<ArrayList<Integer>>();

		System.out.println(parkingStartEndTimes.length);

		for(int i=0;i<parkingStartEndTimes.length;i++) {

			System.out.println(" ");

			for(int j=0;j<2;j++) {
				System.out.print(" "+parkingStartEndTimes[i][j]);
			}
		}


		return 0;
	}

	// DO NOT MODIFY ANYTHING BELOW THIS LINE!!

	public static void main(String[] args) throws Exception {

		int arr[][]= {{1,2},
				{3,4},
				{3,4}

		};
		minParkingSpaces(arr);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter wr = new PrintWriter(System.out);
		int n = Integer.parseInt(br.readLine().trim());
		int[][] parkingStartEndTimeList = new int[n][2];
		String[] parkingStartEndTimes = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			String[] parkingStartEndTime = parkingStartEndTimes[i].split(",");
			for (int j = 0; j < parkingStartEndTime.length; j++) {
				parkingStartEndTimeList[i][j] = Integer.parseInt(parkingStartEndTime[j]);
			}
		}

		int out = minParkingSpaces(parkingStartEndTimeList);
		System.out.println(out);

		wr.close();
		br.close();

	}		 
}



