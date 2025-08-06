`timescale 1ns / 1ps
//////////////////////////////////////////////////////////////////////////////////
// Company: 
// Engineer: 
// 
// Create Date: 21.08.2024 13:44:42
// Design Name: 
// Module Name: decoder_sim
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


module decoder_sim();
 reg i0, i1, i2;
 wire d0, d1, d2, d3, d4, d5, d6, d7;
 decoder d(i0, i1, i2, d0, d1, d2, d3, d4, d5, d6, d7);
 
 initial begin
 #10
 i0=0; i1=0; i2=0;
 #10
 i0=1; i1=0; i2=0;
 #10
 i0=0; i1=1; i2=0;
 #10
 i0=1; i1=1; i2=0;
 #10
 i0=0; i1=0; i2=1;
 #10
 i0=1; i1=0; i2=1;
 #10
 i0=0; i1=1; i2=1;
 #10
 i0=1; i1=1; i2=1;
 #10
 $finish;
 end

endmodule
