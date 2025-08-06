`timescale 1ns / 1ps
//////////////////////////////////////////////////////////////////////////////////
// Company: 
// Engineer: 
// 
// Create Date: 08.08.2024 01:51:44
// Design Name: 
// Module Name: pos_circuit
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


module pos_circuit(
    output f,
    input a,
    input b,
    input c
    );
    wire w1, w2, w3;  
    nor n1(w1, c, a);
    nor n2(w2, a, a);
    nor n3(w3, w2, b);
    nor n4(f, w1, w3);
endmodule
