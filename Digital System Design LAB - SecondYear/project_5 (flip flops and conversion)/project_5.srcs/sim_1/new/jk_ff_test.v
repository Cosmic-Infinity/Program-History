`timescale 1ns / 1ps
//////////////////////////////////////////////////////////////////////////////////
// Company: 
// Engineer: 
// 
// Create Date: 01.11.2024 20:31:07
// Design Name: 
// Module Name: jk_ff_test
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


module jk_ff_test();

    reg j, k, clk, pre;
    wire q, qnot;
    jk_ff jk1(j, k, clk, pre, q, qnot);  
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
