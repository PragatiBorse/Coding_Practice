package com.arrays;
/* There are n gas stations along a circular route, where the amount of gas at the ith station is gas[i].You
have a car with an unlimited gas tank and it costs cost[i] of gas to travel from the ith station to its next
(i + 1)th station. You begin the journey with an empty tank at one of the gas stations. Given two integer arrays
gas and cost, return the starting gas station's index if you can travel around the circuit once in the
clockwise direction, otherwise return -1. If there exists a solution, it is guaranteed to be unique*/

public class Question_9 {
    public static int canCompleteCircuit(int[] gas, int[] cost) {
            int n = gas.length;
            int totalGas = 0;
            int currentGas = 0;
            int startStation = 0;

            for (int i = 0; i < n; i++) {
                int fuel = gas[i] - cost[i];
                totalGas += fuel;
                currentGas += fuel;

                if (currentGas < 0) {
                    currentGas = 0;
                    startStation = i + 1;
                }
            }
            if (totalGas < 0) {
                return -1;
            }

            return startStation;
        }

        public static void main(String[] args) {
            int[] gas = {1, 2, 3, 4, 5};
            int[] cost = {3, 4, 5, 1, 2};

            int startStation = canCompleteCircuit(gas, cost);
            System.out.println("Starting gas station index: " + startStation);
        }
    }
