`timescale 1ns / 1ps
//////////////////////////////////////////////////////////////////////////////////
// Company: 
// Engineer: 
// 
// Create Date: 03.11.2024 23:32:25
// Design Name: 
// Module Name: counter_mod_9_test
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


module counter_mod_9_test();
    reg clk, pre;
    wire QA, QB, QC, QD;
    
    counter_mod_9 counter(.clk(clk), .pre(pre), .QA(QA), .QB(QB), .QC(QC), .QD(QD));
    
    initial begin
        clk = 0;
        pre = 1; #10
        pre = 0;
        forever #10 clk = ~clk;
    end 
endmodule

