`timescale 1ns / 1ps
//////////////////////////////////////////////////////////////////////////////////
// Company: 
// Engineer: 
// 
// Create Date: 01.11.2024 21:34:16
// Design Name: 
// Module Name: d_ff
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


module d_ff(input d,input clk, input pre, output reg q,output reg qnot);
    
    always @ (posedge clk)begin
        if(pre == 1) begin
            q <= 1;
            qnot <= 0;
        end
        else begin
            q <= d;
            qnot <= ~d;
        end
    end

endmodule
