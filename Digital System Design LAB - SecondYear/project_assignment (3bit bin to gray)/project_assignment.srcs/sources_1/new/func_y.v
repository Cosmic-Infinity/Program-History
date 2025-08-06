`timescale 1ns / 1ps
//////////////////////////////////////////////////////////////////////////////////
// Company: 
// Engineer: 
// 
// Create Date: 02.09.2024 23:34:40
// Design Name: 
// Module Name: func_y
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


module func_y(
    input a,
    input b,
    input c,
    output y
    );
    
    assign y= (a&b&c) | (a&b) | (a&c);
endmodule
