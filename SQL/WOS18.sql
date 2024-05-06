SELECT ROUND(
    (MAX(LAT_N) - MIN(LAT_N)) + (MAX(LONG_W) - MIN(LONG)), 4
) AS manhattan_distance
FROM STATION;