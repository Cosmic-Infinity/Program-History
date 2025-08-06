`timescale 1ns / 1ps
//////////////////////////////////////////////////////////////////////////////////
// Company: 
// Engineer: 
// 
// Create Date: 01.11.2024 22:36:00
// Design Name: 
// Module Name: d_ff_test
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


module d_ff_test();
    reg d, clk, pre;
    wire q, qnot;
    d_ff ff1(d, clk, pre, q, qnot);
    
    initial begin
        clk = 0;
        forever #10 clk = ~clk;
    end
        
    initial begin
        pre <= 1; #20
        pre <= 0;
        d = 0; #20
        d = 1; #20 
    $finish;
    end
    
endmodule
