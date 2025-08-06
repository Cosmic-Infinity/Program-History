`timescale 1ns / 1ps
//////////////////////////////////////////////////////////////////////////////////
// Company: 
// Engineer: 
// 
// Create Date: 03.11.2024 23:14:55
// Design Name: 
// Module Name: t_ff
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


module t_ff(
    input t,
    input clk,
    input pre,
    output reg q,
    output reg qnot
    );
    
    always @(posedge clk or posedge pre) begin
        if(pre == 1)begin
            q<=1;
            qnot<=0;
        end
        else if(t==1) begin
            q <= ~q;
            qnot <= ~qnot;
        end
   end
endmodule
