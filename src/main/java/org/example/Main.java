package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        // initialize the GPRs
        int[] GPR = new int[4];

        int programCounter = 0;
        int cycleCounter = 0;

        // insert your instructions here
        int[] instructionMemory = new int[] {

        };

        // insert the data here
        int[] dataMemory = new int[] {

        };

        // flags
        boolean halt = false;
        boolean overflow = false;

        // pipeline
        Instruction instruction = new Instruction();
        Instruction execute     = new Instruction();
        Instruction writeBack   = new Instruction();


        //////////////////////////////// PUT YOUR FILE HERE !!!!!!! ////////////////////////////////////////////////
        Scanner scanner = new Scanner(new File("input.txt"));


        int lineNumber = 1;
        // program will run until halt
        while(!halt){

            if (instruction.name.equals("halt")){
                halt = true;
                continue;
            } else if (instruction.name.equals("add")){
                GPR[instruction.R0] += GPR[instruction.R1];
            } else if (instruction.name.equals("sub")){
                GPR[instruction.R0] -= GPR[instruction.R1];
            } else if (instruction.name.equals("load")) {

            }

            String currentLine = scanner.nextLine();

            currentLine = currentLine.trim(); // remove staring and ending whitespace
            if (currentLine.charAt(0) == '#' || currentLine.charAt(0) == '/'){
                // if the line does not do anything we can skip it early
                // there will be other checks later for comments, but this will speed up the parsing
                continue;
            }

            String[] tokens = currentLine.split("\\s+"); // split on any amount of whitespace

            switch (tokens[0]){
                case "add":

                    break;
                case "sub":

                    break;
                case "move":

                    break;
                case "jump":

                    break;
                case "jumpn":

                    break;
                case "ldi":

                    break;
                case "load":

                    break;
                case "store":

                    break;
                case "nop":

                    break;
                case "halt":

                    break;
                default:
                    System.out.println("Error on line " + lineNumber + ", each line must begin with a command.");
            }

            lineNumber++;
        }

    }


}