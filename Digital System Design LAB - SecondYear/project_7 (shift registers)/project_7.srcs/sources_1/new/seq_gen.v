`timescale 1ns / 1ps
//////////////////////////////////////////////////////////////////////////////////
// Company: 
// Engineer: 
// 
// Create Date: 04.11.2024 06:52:52
// Design Name: 
// Module Name: seq_gen
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

module sequence_gen(op,clk);
    input clk;
    output [3:0]op;
    reg [3:0]op;
    initial begin
        op[3:0] = 4'b1100 ;
        end
    always @( posedge clk)
        op <= {op[3]^op[1], op[3:1]};
endmodule
