`timescale 1ns / 1ps
//////////////////////////////////////////////////////////////////////////////////
// Company: 
// Engineer: 
// 
// Create Date: 02.11.2024 00:25:20
// Design Name: 
// Module Name: d_to_jk_test
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


module d_to_jk_test();
    reg j, k, clk, pre;
    wire q, qnot;
    d_to_jk jk1(j, k, clk, pre, q, qnot);  
    initial begin
        clk = 0;
        forever #10 clk = ~clk;
    end
    
    
    initial begin
        pre <= 1; #20
        pre <= 0;
        j<=0; k<=0; #20
        j<=1; k<=0; #20
        j<=0; k<=1; #20
        j<=1; k<=1; #20
    $finish;
    end
endmodule
