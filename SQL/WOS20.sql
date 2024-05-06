SELECT ROUND(AVG(LAT_N), 4) AS median
FROM (
    SELECT LAT_N
    FROM(
        SELECT LAT_N. ROW_NUMBER() OVER(ORDER BY LAT_N) AS rn, COUNT(*) AS cnt
        FROM STATION
    ) AS subquery
    WHERE rn IN ((cnt + 1) / 2, (cnt + 2) /2)
) AS median_subquery;