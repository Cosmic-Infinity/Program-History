`timescale 1ns / 1ps
//////////////////////////////////////////////////////////////////////////////////
// Company: 
// Engineer: 
// 
// Create Date: 08.08.2024 01:32:56
// Design Name: 
// Module Name: sop_circuit
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


module sop_circuit(
    output f,
    input a,
    input b,
    input c
    );
    wire w1, w2, w3;
    nand n1(w1, b, a);
    nand n2(w2, a, a);
    nand n3(w3, w2, c);
    nand n4(f, w1, w3);
endmodule
