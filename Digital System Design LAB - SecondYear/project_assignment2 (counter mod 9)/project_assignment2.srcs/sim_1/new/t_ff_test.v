`timescale 1ns / 1ps
//////////////////////////////////////////////////////////////////////////////////
// Company: 
// Engineer: 
// 
// Create Date: 03.11.2024 23:18:38
// Design Name: 
// Module Name: t_ff_test
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



module t_ff_test();
    reg t, clk, pre;
    wire q, qnot;
    t_ff ff1(t, clk, pre, q, qnot);
    
    initial begin
        clk = 0;
        forever #10 clk = ~clk;
    end
        
    initial begin
        pre <= 1; #20
        pre <= 0;
        t = 0; #20
        t = 1; #20 
    $finish;
    end
    
endmodule
