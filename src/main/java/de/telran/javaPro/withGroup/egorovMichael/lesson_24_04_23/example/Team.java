package de.telran.javaPro.withGroup.egorovMichael.lesson_24_04_23.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team<T extends Participant> {
    private  String teamName;
    private List<T> participantList =new ArrayList<>();

    public Team(String teamName) {
        this.teamName = teamName;
    }


    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public List<T> getParticipantList() {
        return participantList;
    }

    public void setParticipantList(List<T> participantList) {
        this.participantList = participantList;
    }

    public void  addNewPartiscipant(T  participant){
        participantList.add(participant);
    }

    public void play(Team<T> secondTeam){
        String winner;
        int randomDigit = new Random().nextInt(2);

        if (randomDigit == 0){
            winner = this.teamName;
        }else {
            winner = secondTeam.teamName;
        }
        System.out.println("WINNER: " + winner + "!!!");
    }
}
