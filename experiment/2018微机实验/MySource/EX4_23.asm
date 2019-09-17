DATA SEGMENT  ;Êý¾Ý¶Î
        MASC  DB  6,0,6 DUP(0)  
        ;MASC  DB  '2','6','A','1'
        MBIN  DB  2 DUP(0) 
DATA ENDS   

CODE SEGMENT   ;´úÂë¶Î
     ASSUME CS: CODE,DS: DATA 
  BEGIN:    MOV  AX ,DATA 
            MOV  DS ,AX
            
            MOV  CL ,4
            MOV  CH ,CL 
            
            MOV  DX,OFFSET MASC
            MOV  AH,10
            INT  21H   
            
            LEA  SI ,MASC+2
            CLD
            XOR  AX ,AX
            XOR  DX ,DX
 
            
  NEXT1:    LODSB
            AND  AL ,7FH
            CMP  AL ,'0'
            JB   ERROR
            CMP  AL ,'9'
            JA   NEXT2
            SUB  AL ,30H
            JMP  SHORT NEXT3
  NEXT2:    CMP  AL ,'A'
            JB   ERROR
            CMP  AL ,'F'
            JA   ERROR
            SUB  AL ,37H 
  NEXT3:    OR   DL ,AL
            ROR  DX ,CL
  ERROR:    DEC CH
            JNZ  NEXT1
            
            
            MOV  WORD PTR MBIN ,DX             
 
            
            MOV AH, 4CH
            INT  21H
CODE ENDS 
     END BEGIN
