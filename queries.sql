-- Part 1: Job Table Columns and Data Types
-- id: INTEGER
-- name: VARCHAR(255)
-- employer_id: INTEGER
-- location: VARCHAR(255)
-- core_competency: VARCHAR(255)
-- position_type: VARCHAR(255)
-- skill_id: INTEGER
-- skill_id: INTEGER
-- position_type_id: INTEGER


-- Part 2: List the names of the employers in St. Louis City
SELECT name FROM employer WHERE location = "St. Louis City";

--Part 3

DROP TABLE job;

--Part 4

SELECT *
FROM skill
LEFT JOIN job_skills ON skill.id = job_skills.skills_id
WHERE job_skills.jobs_id IS NOT NULL
ORDER BY name ASC;

