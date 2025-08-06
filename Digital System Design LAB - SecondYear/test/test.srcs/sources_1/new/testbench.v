`timescale 1ns / 1ps
//////////////////////////////////////////////////////////////////////////////////
// Company: 
// Engineer: 
// 
// Create Date: 10.11.2024 03:42:42
// Design Name: 
// Module Name: testbench
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


module testbench();
    reg clk;
    reg rst;
    wire [2:0] count;
    C4D uut (count,d1,d2,d3,rst,clk);
    initial begin
        clk = 0;
        forever #5 clk = ~clk;
    end
    initial begin
        rst = 1; 
        #10;   
        rst = 0;  
        #200;     
        rst = 1; 
        #10;     
        rst = 0; 
        #100;     
        $stop;   
    end
endmodule
