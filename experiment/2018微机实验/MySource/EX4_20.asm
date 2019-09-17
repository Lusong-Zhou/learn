DSEG SEGMENT  ;Êý¾Ý¶Î
     MEM  DW 73,59,61,45,81,107,37,25,14,64
DSEG ENDS 
CSEG SEGMENT   ;´úÂë¶Î
        ASSUME CS: CSEG,DS: DSEG
        START:    MOV  AX , DSEG
                  MOV  DS , AX
                  
                  LEA  DI , MEM
                  MOV  BL , 9 
                   
        NEXT1:    MOV  SI , DI
                  MOV  CL , BL
                     
        NEXT2:    MOV AX ,[SI]
                  ADD SI ,2
                  CMP AX ,[SI]
                  JNC NEXT3
                  
                  MOV DX ,[SI]
                  MOV [SI-2],DX
                  MOV [SI] ,AX
                  
        NEXT3:    DEC CL
                  JNZ NEXT2  
                  
                  DEC BL
                  JNZ NEXT1
                     

 
                  MOV AH , 4CH
                  INT  21H
CSEG ENDS 
            END START
