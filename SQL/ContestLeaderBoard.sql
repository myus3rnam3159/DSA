SELECT tmp.hacker_id, tmp.name, SUM(tmp.ms) AS sm
FROM
(
    SELECT h.hacker_id, s.challenge_id, h.name, MAX(s.score) AS ms
    FROM Hackers h
    INNER JOIN Submissions s
    ON h.hacker_id = s.hacker_id
    GROUP BY h.hacker_id, h.name, s.challenge_id
    HAVING ms > 0
) tmp
GROUP BY tmp.hacker_id, tmp.name
ORDER BY sm DESC, tmp.hacker_id ASC;