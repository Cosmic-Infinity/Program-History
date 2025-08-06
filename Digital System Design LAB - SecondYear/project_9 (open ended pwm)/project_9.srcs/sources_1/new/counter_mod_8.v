`timescale 1ns / 1ps
//////////////////////////////////////////////////////////////////////////////////
// Company: 
// Engineer: 
// 
// Create Date: 02.11.2024 04:58:10
// Design Name: 
// Module Name: counter_mod_8
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



module counter_mod_8(input clk, input pre, output QA,output QB,output QC);
    wire q1, q2, q3, qnot3;
    jk_ff ff_A(.j(1), .k(1), .clk(clk), .pre(pre), .q(q1), .qnot());
    jk_ff ff_B(.j(QA), .k(QA), .clk(clk), .pre(pre), .q(q2), .qnot());
    jk_ff ff_C(.j(QA & QB), .k(QA & QB), .clk(clk), .pre(pre), .q(q3), .qnot(qnot3));
    
    assign QA = q1;
    assign QB = q2;
    assign QC = q3; 
endmodule

