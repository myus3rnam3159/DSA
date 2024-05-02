SELECT 
    MAX(total_earnings) AS max_earnings,
    COUNT(*) AS num_employees
FROM 
    (SELECT salary * months AS total_earnings FROM Employee) AS subquery
WHERE 
    total_earnings = (SELECT MAX(salary * months) FROM Employee);