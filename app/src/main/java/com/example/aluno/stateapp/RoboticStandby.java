package com.example.aluno.stateapp;

import android.widget.Toast;

public class RoboticStandby implements RoboticState{

    private final Robot robot;

    public RoboticStandby(Robot robot){
        this.robot = robot;
    }

    @Override
    public void walk() {
        Toast.makeText(robot.contexto, "Em espera...", Toast.LENGTH_SHORT).show();
        robot.setState(robot.getRoboticOn());
        System.out.println("Walking...");
    }

    @Override
    public void cook() {
        Toast.makeText(robot.contexto, "Em espera...", Toast.LENGTH_SHORT).show();
        robot.setRoboticState(robot.getRoboticCook());
        Toast.makeText(robot.contexto, "Cozinhando...", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void off() {
        Toast.makeText(robot.contexto, "Em espera...", Toast.LENGTH_SHORT).show();
        robot.setState(robot.getRoboticOff());
        Toast.makeText(robot.contexto, "O robo foi desligado...", Toast.LENGTH_SHORT).show();

    }

}