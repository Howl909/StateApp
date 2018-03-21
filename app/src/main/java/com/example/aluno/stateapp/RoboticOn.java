package com.example.aluno.stateapp;

import android.content.Context;
import android.widget.Toast;

public class RoboticOn implements RoboticState{

    private final Robot robot;

    public RoboticOn(Robot robot){
        this.robot = robot;
    }

    @Override
    public void walk() {
        Toast.makeText(robot.contexto, "Andando...", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void cook() {
        Toast.makeText(robot.contexto, "Cozinhando...", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void off() {
        robot.setState(robot.getRoboticOff());
        Toast.makeText(robot.contexto, "O robo esta desligado...", Toast.LENGTH_SHORT).show();

    }

}
