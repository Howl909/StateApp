package com.example.aluno.stateapp;

import android.widget.Toast;

public class RoboticOff implements RoboticState{

    private final Robot robot;

    public RoboticOff(Robot robot){
        this.robot = robot;
    }

    @Override
    public void walk() {
        Toast.makeText(robot.contexto, "Andando...", Toast.LENGTH_SHORT).show();
        robot.setRoboticState(robot.getRoboticOn());
    }

    @Override
    public void cook() {
        Toast.makeText(robot.contexto, "Não pode desligar...", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void off() {
        Toast.makeText(robot.contexto, "Já esta desligado...", Toast.LENGTH_SHORT).show();
    }
}
