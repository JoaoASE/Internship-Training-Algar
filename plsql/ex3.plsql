DECLARE 
  v_id_contrato NUMBER := 1.0;

BEGIN
  IF v_id_contrato = 1.0 THEN
    DBMS_OUT.PUT_LINE('TELEFONE FIXO');
  ELSIF v_id_contrato = 2.0 THEN
    DBMS_OUT.PUT_LINE('TELEFONE CELULAR');
  ELSIF v_id_contrato = 20.0 THEN
    DBMS_OUT.PUT_LINE('NETSUPER');
  ELSIF v_id_contrato = 12.0 THEN
    DBMS_OUT.PUT_LINE('TV A CABO');
  ELSE 
    DEBMS_OUT.PUT_LINE('OUTROS');
    
  END IF;
  

END;
