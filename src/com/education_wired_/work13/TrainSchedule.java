package com.education_wired_.work13;

public class TrainSchedule {
    private Train[] trains;
    private  int countTrain;

    public TrainSchedule(int size) {
        trains = new Train[size];
    }
    public boolean addTrain (Train train){
        if (countTrain == trains.length){
            return  false;
        }
        trains[countTrain++]= train;
        return  true;
    }

    public void printTRains(){
        for (int i = 0; i < countTrain; i++){
            System.out.println(trains[i]);
        }
    }
}
