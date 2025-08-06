`timescale 1ns / 1ps
//////////////////////////////////////////////////////////////////////////////////
// Company: 
// Engineer: 
// 
// Create Date: 04.11.2024 06:54:20
// Design Name: 
// Module Name: test_sequence_gen
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


module test_sequence_gen();
    reg clk;
    wire [3:0] op;
    sequence_gen SG1 (op,clk);
    initial begin
        clk=0;
        forever #10 clk = ~clk;
    end
    initial begin
        #200
        $finish;
    end
endmodule
