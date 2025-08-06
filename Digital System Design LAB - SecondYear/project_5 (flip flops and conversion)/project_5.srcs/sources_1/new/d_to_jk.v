`timescale 1ns / 1ps
//////////////////////////////////////////////////////////////////////////////////
// Company: 
// Engineer: 
// 
// Create Date: 01.11.2024 23:25:29
// Design Name: 
// Module Name: d_to_jk
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

module d_to_jk (input j,input k, input clk,input pre,output q,output qnot);
    wire d, w1, w2;
    
    assign d = (~k & w1) | (j & w2);
    d_ff ff1 (.d(d), .clk(clk), .pre(pre), .q(w1), .qnot(w2));

    assign q = w1;
    assign qnot = w2;
endmodule