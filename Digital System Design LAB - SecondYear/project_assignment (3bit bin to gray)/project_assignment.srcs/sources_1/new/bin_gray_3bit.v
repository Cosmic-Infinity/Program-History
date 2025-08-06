`timescale 1ns / 1ps
//////////////////////////////////////////////////////////////////////////////////
// Company: 
// Engineer: 
// 
// Create Date: 02.09.2024 23:23:09
// Design Name: 
// Module Name: bin_gray_3bit
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


module bin_gray_3bit(
    input b3,
    input b2,
    input b1,
    output g3,
    output g2,
    output g1
    );
    
    assign g3 = b3;
    assign g2 = b3 ^ b2;
    assign g1 = b2 ^ b1;
    
    
endmodule
