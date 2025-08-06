`timescale 1ns / 1ps
//////////////////////////////////////////////////////////////////////////////////
// Company: 
// Engineer: 
// 
// Create Date: 03.11.2024 23:25:24
// Design Name: 
// Module Name: counter_mod_9
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


module counter_mod_9(input clk, input pre, output QA,output QB,output QC, output QD);
    wire q1, q2, q3, q4, q1not;
    t_ff ff_A(.t(q1not), .clk(clk), .pre(pre), .q(q4), .qnot());
    t_ff ff_B(.t(q4), .clk(clk), .pre(pre), .q(q3), .qnot());
    t_ff ff_C(.t( q3 & q4 ), .clk(clk), .pre(pre), .q(q2), .qnot());
    t_ff ff_D(.t( q1 | (q2 & q3 & q4) ), .clk(clk), .pre(pre), .q(q1), .qnot(q1not));
    
    assign QA = q1;
    assign QB = q2;
    assign QC = q3;
    assign QD = q4;
endmodule
