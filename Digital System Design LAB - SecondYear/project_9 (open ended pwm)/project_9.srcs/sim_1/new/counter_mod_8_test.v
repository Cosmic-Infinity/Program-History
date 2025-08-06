`timescale 1ns / 1ps
//////////////////////////////////////////////////////////////////////////////////
// Company: 
// Engineer: 
// 
// Create Date: 02.11.2024 04:59:39
// Design Name: 
// Module Name: counter_mod_8_test
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


module counter_mod_8_test();

    integer duty_cycle = 32;
    //7, 19 ,32, 44, 57, 69, 82, 94
       
    reg clk, pre;
    wire QA, QB, QC;
    reg [7:0] seg;
    wire f;
    
    counter_mod_8 counter(.clk(clk), .pre(pre), .QA(QA), .QB(QB), .QC(QC));
    mux m(.s0(QA), .s1(QB), .s2(QC), .i0(seg[0]), .i1(seg[1]), .i2(seg[2]), .i3(seg[3]), .i4(seg[4]), .i5(seg[5]), .i6(seg[6]), .i7(seg[7]), .f(f));
       
    
    initial begin
        clk = 0;
        pre = 1; #10
        pre = 0;
        forever #10 clk = ~clk;
    end 
    initial begin
        seg = (1 << ((duty_cycle * 8 + 50) / 100)) - 1;
    end
    
    

endmodule

