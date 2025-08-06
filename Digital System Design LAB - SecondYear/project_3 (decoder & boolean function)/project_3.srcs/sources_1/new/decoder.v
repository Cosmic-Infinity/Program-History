`timescale 1ns / 1ps
//////////////////////////////////////////////////////////////////////////////////
// Company: 
// Engineer: 
// 
// Create Date: 21.08.2024 13:38:40
// Design Name: 
// Module Name: decoder
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


module decoder(
    input i0,
    input i1,
    input i2,
    output d0,
    output d1,
    output d2,
    output d3,
    output d4,
    output d5,
    output d6,
    output d7
    );
    
    assign d0 = ~(~i0 & ~i1 & ~i2);
    assign d1 = ~(i0 & ~i1 & ~i2);
    assign d2 = ~(~i0 & i1 & ~i2);
    assign d3 = ~(i0 & i1 & ~i2);
    assign d4 = ~(~i0 & ~i1 & i2);
    assign d5 = ~(i0 & ~i1 & i2);
    assign d6 = ~(~i0 & i1 & i2);
    assign d7 = ~(i0 & i1 & i2);
endmodule
