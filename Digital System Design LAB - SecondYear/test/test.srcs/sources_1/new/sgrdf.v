`timescale 1ns / 1ps
//////////////////////////////////////////////////////////////////////////////////
// Company: 
// Engineer: 
// 
// Create Date: 10.11.2024 03:45:05
// Design Name: 
// Module Name: sgrdf
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
module Mod5Counter (
    input clk,
    input rst,
    output Q2, Q1, Q0
);

wire D0, D1, D2;
wire Q0_int, Q1_int, Q2_int;

// D flip-flops for the counter states
DFF dff0 (.clk(clk), .rst(rst | (Q2_int & ~Q1_int & Q0_int)), .d(D0), .q(), .qnot(Q0_int));
DFF dff1 (.clk(Q0_int), .rst(rst | (Q2_int & ~Q1_int & Q0_int)), .d(D1), .q(), .qnot(Q1_int));
DFF dff2 (.clk(Q1_int), .rst(rst | (Q2_int & ~Q1_int & Q0_int)), .d(D2), .q(), .qnot(Q2_int));

// Next state logic for D flip-flops
assign D0 = ~Q0_int;
assign D1 = Q0_int ^ Q1_int;
assign D2 = Q1_int & Q0_int;

// Counter output
assign Q0 = D0;
assign Q1 = D1;
assign Q2 = D2;

endmodule

// D Flip-Flop module definition
