`timescale 1ns / 1ps
//////////////////////////////////////////////////////////////////////////////////
// Company: 
// Engineer: 
// 
// Create Date: 02.09.2024 23:48:12
// Design Name: 
// Module Name: func_y2
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


module func_y2(
    input a,
    input b,
    input c,
    input d,
    output y
    );
    
    assign y = (a|b|d) & (a|c|d) & (a|b|c);
    
endmodule
