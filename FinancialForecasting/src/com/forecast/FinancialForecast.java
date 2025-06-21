package com.forecast;

public class FinancialForecast {

    // Recursive method to calculate future value
    public static double calculateFutureValue(double presentValue, double rate, int years) {
        if (years == 0) {
            return presentValue; // base case
        }
        return (1 + rate) * calculateFutureValue(presentValue, rate, years - 1);
    }

    public static void main(String[] args) {
        double presentValue = 10000; 
        double rate = 0.10; // 10% annual growth
        int years = 5;

        double futureValue = calculateFutureValue(presentValue, rate, years);
        System.out.printf("Future Value after %d years = ₹%.2f%n", years, futureValue);
    }
}
