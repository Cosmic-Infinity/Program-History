`timescale 1ns / 1ps
//////////////////////////////////////////////////////////////////////////////////
// Company: 
// Engineer: 
// 
// Create Date: 02.11.2024 04:57:10
// Design Name: 
// Module Name: jk_ff
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


module jk_ff(input j,input k,input clk, input pre, output reg q,output reg qnot);
     
     always @ (posedge clk or posedge pre) begin
        if(pre == 1) begin
            q = 1;
            qnot = 0;
        end
        else begin
            if(j==0 && k==0) begin
                q = q;
                qnot = qnot;
            end 
            else if(j==0 && k==1) begin
                q = 0;
                qnot = 1;
            end
            else if(j==1 && k==0) begin
                q = 1;
                qnot = 0;
            end
            else if(j==1 && k==1) begin
                q = ~q;
                qnot = ~qnot;
            end
        end
   end
endmodule
