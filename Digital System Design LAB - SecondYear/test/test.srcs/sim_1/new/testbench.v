`timescale 1ns / 1ps
//////////////////////////////////////////////////////////////////////////////////
// Company: 
// Engineer: 
// 
// Create Date: 10.11.2024 03:46:02
// Design Name: 
// Module Name: testbench
// Project Name: 
// Target Devices: 
// Tool Versions: 
// Description: 
// 
// Dependencies: 
// 
// Revision:
// Revision 0.01 - File Created
// Additional Comments:
// 
//////////////////////////////////////////////////////////////////////////////////
module testbench;
    // Inputs
    reg clk;
    reg rst;

    // Outputs
    wire Q2, Q1, Q0;

    // Instantiate the Mod-5 Counter
    Mod5Counter uut (
        .clk(clk),
        .rst(rst),
        .Q2(Q2),
        .Q1(Q1),
        .Q0(Q0)
    );

    // Clock generation
    initial begin
        clk = 0;
        forever #5 clk = ~clk; // Toggle clock every 5 time units
    end

    // Test stimulus
    initial begin
        // Initialize inputs
        rst = 1;

        // Wait for global reset
        #10 rst = 0; // Release reset after 10 time units

        // Monitor output
        $monitor("Time: %0t, Q2: %b, Q1: %b, Q0: %b", $time, Q2, Q1, Q0);

        // Simulation run time
        #100 $finish; // End simulation after 100 time units
    end
endmodule
