package com.example.aluno.stateapp;

import android.widget.Toast;

public class RoboticCook implements RoboticState{

    private final Robot robot;

    public RoboticCook(Robot robot){
        this.robot = robot;
    }

    @Override
    public void walk() {
        Toast.makeText(robot.contexto, "Andando...", Toast.LENGTH_SHORT).show();
        robot.setRoboticState(robot.getRoboticOn());
    }

    @Override
    public void cook() {
        Toast.makeText(robot.contexto, "Cozinhando...", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void off() {
        Toast.makeText(robot.contexto, "Não pode ser desligado enquanto cozinha...", Toast.LENGTH_SHORT).show();
    }
}
