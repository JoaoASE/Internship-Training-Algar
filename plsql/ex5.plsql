DECLARE
    v_product_id NUMBER := 100305.0;
    v_product_name SW_PROD_RELEASE.SWNAME%TYPE;
BEGIN
    SELECT SWNAME
    INTO v_product_name
    FROM SW_PROD_RELEASE
    WHERE SWPRODRELEASEID = v_product_id;

    DBMS_OUTPUT.PUT_LINE('O nome do produto com ID ' || v_product_id || ' é: ' || v_product_name);
EXCEPTION
    WHEN NO_DATA_FOUND THEN
        DBMS_OUTPUT.PUT_LINE('Erro: Produto com ID ' || v_product_id || ' não encontrado.');
    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE('Erro inesperado: ' || SQLERRM);
END;
