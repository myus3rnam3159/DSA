SELECT
    MAX(CASE WHEN OCCUPATION='Doctor' THEN NAME END) AS Doctor,
    MAX(CASE WHEN OCCUPATION='Professor' THEN NAME END) AS Professor,
    MAX(CASE WHEN OCCUPATION='Singer' THEN NAME END) AS Singer,
    MAX(CASE WHEN OCCUPATION='Actor' THEN NAME END) AS Actor
FROM (
    SELECT *, ROW_NUMBER()
    OVER (
        PARTITION BY OCCUPATION ORDER BY NAME ASC) AS row_num
    FROM OCCUPATIONS
) AS TEMP
GROUP BY row_num
ORDER BY row_num;

/* How to read SQL - each content inside () is a small table inside*/

