SELECT w1.id, st.age AS sa, st.coins_needed AS mc, st.power AS sp
FROM wands w1
INNER JOIN (
  SELECT w.code, MIN(w.coins_needed) AS coins_needed, wp.age, w.power
  FROM wands w
  INNER JOIN wands_property wp
  ON w.code = wp.code
  WHERE wp.is_evil = 0
  GROUP BY w.code, w.power, wp.age
) AS st
ON w1.code = st.code and w1.coins_needed = st.coins_needed AND w1.power = st.power
ORDER BY st.power DESC, st.age DESC;