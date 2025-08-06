`timescale 1ns / 1ps
//////////////////////////////////////////////////////////////////////////////////
// Company: 
// Engineer: 
// 
// Create Date: 02.11.2024 04:43:04
// Design Name: 
// Module Name: mux
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


`timescale 1ns / 1ps
//////////////////////////////////////////////////////////////////////////////////
// Company: 
// Engineer: 
// 
// Create Date: 28.08.2024 12:44:02
// Design Name: 
// Module Name: mux
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


module mux(
    input s0,
    input s1,
    input s2,
    input i0,
    input i1,
    input i2,
    input i3,
    input i4,
    input i5,
    input i6,
    input i7,
    output f
    );
    
    wire w0,w1,w2,w3,w4,w5,w6,w7,w8,w9,w10;
    
    assign w0 = ~s0;
    assign w1 = ~s1;
    assign w2 = ~s2;
    assign w3 = i0 & w0 & w1 & w2;
    assign w4 = i1 & s0 & w1 & w2;
    assign w5 = i2 & w0 & s1 & w2;
    assign w6 = i3 & s0 & s1 & w2;
    assign w7 = i4 & w0 & w1 & s2;
    assign w8 = i5 & s0 & w1 & s2;
    assign w9 = i6 & w0 & s1 & s2;
    assign w10 = i7 & s0 & s1 & s2;
    assign f = (w3 | w4 | w5 | w6 | w7 | w8 | w9 | w10);
endmodule

