`timescale 1ns / 1ps
//////////////////////////////////////////////////////////////////////////////////
// Company: 
// Engineer: 
// 
// Create Date: 10.11.2024 03:35:08
// Design Name: 
// Module Name: Dff
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
module DFF (
    input clk,
    input rst,
    input d,
    output reg q,
    output reg qnot
);
    always @(posedge clk or posedge rst) begin
        if (rst) begin
            q <= 1'b0;
            qnot <= 1'b0;
        end
        else begin
            q <= d;
            qnot <= ~d;
        end
    end
endmodule

