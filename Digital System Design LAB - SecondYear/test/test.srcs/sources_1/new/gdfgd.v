`timescale 1ns / 1ps
//////////////////////////////////////////////////////////////////////////////////
// Company: 
// Engineer: 
// 
// Create Date: 10.11.2024 03:35:53
// Design Name: 
// Module Name: gdfgd
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

module C4D (
    input clk,
    input rst,
    output [2:0] count,
    output c
);

wire [2:0] ns;
wire [2:0] cs;

DFF dff0 (.clk(clk), .rst(rst), .d(ns[0]), .q(cs[0]));
DFF dff1 (.clk(cs[0]), .rst(rst), .d(ns[1]), .q(cs[1]));
DFF dff2 (.clk(cs[1]), .rst(rst), .d(ns[2]), .q(cs[2]));

assign ns[0] = ~cs[0];
assign ns[1] = (cs[1] & cs[0]) | (cs[2] ^ cs[0]);
assign ns[2] = (~cs[2] & cs[1] & ~cs[0]) | (cs[2] & cs[0]);

assign count = (cs == 3'b000) ? 3'b101 : cs; // resets to 5 after 0

assign c = cs[0]; // Assuming `c` is an additional output for some purpose

endmodule

