`timescale 1ns / 1ps
//////////////////////////////////////////////////////////////////////////////////
// Company: 
// Engineer: 
// 
// Create Date: 04.11.2024 07:08:36
// Design Name: 
// Module Name: Seq_Det_test
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


module Seq_Det_test();
    reg clk, rst, Din;
    wire Dout;

    Seq_Det uut (.clk(clk),.rst(rst),.Din(Din),.Dout(Dout));

    initial begin
        clk = 0;
        forever #5 clk = ~clk;
    end

    initial begin
        rst = 1;#5;
        rst = 0;#5;

        Din = 1; #10;
        Din = 0; #10;
        Din = 1; #10;
        Din = 1; #10;

        Din = 0; #10;
        Din = 0; #10;
        Din = 1; #10;
        Din = 0; #10;
        Din = 1; #10;
        rst = 1; #5
        rst = 0; #5

        Din = 1; #10;
        Din = 0; #10;
        Din = 1; #10; // Sequence "111" should be detected again
        Din = 1; #10
        $stop;
    end
endmodule
