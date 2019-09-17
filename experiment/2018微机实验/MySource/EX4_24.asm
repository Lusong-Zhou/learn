DATA SEGMENT  ;Êý¾Ý¶Î
        BUFF  DW  4FB6H
        ASCC  DB  6 DUP(0) ;ASCC  DB  5 DUP(?)
DATA ENDS   

CODE SEGMENT   ;´úÂë¶Î
     ASSUME CS: CODE,DS: DATA 
  START:    MOV  AX ,DATA 
            MOV  DS ,AX
            
            MOV  CX ,5
            LEA  DI ,ASCC
            XOR  DX ,DX
            MOV  AX ,BUFF
            MOV  BX ,0AH 
            
  AGAIN:    DIV  BX
            ADD  DL ,30H 
            MOV  [DI],DL
            INC  DI
            AND  AX ,AX
            JZ   STO
            MOV  DL ,0
            LOOP AGAIN

  STO:      MOV  [DI], '$'
            MOV  DX,OFFSET ASCC
            MOV  AH, 09H
            INT  21H 
            
            MOV AH, 4CH
            INT  21H
CODE ENDS 
     END START
