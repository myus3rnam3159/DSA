SELECT 
    C.COMPANY_CODE, 
    C.FOUNDER,
    COUNT(DISTINCT LM.LEAD_MANAGER_CODE),
    COUNT(DISTINCT SM.SENIOR_MANAGER_CODE),
    COUNT(DISTINCT M.MANAGER_CODE),
    COUNT(DISTINCT E.EMPLOYEE_CODE)
FROM 
    COMPANY C
LEFT JOIN 
    LEAD_MANAGER LM ON C.COMPANY_CODE = LM.COMPANY_CODE
LEFT JOIN 
    SENIOR_MANAGER SM ON C.COMPANY_CODE = SM.COMPANY_CODE
LEFT JOIN 
    MANAGER M ON C.COMPANY_CODE = M.COMPANY_CODE
LEFT JOIN 
    EMPLOYEE E ON C.COMPANY_CODE = E.COMPANY_CODE
GROUP BY 
    C.COMPANY_CODE, C.FOUNDER
ORDER BY 
    C.COMPANY_CODE;