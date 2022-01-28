DROP TABLE IF EXISTS dbo.InterestCalc;

CREATE TABLE InterestCalc (
    Id INT PRIMARY KEY NOT NULL IDENTITY(1,1),
    StartAmount decimal(2) NOT NULL,
	InterestType int NOT NULL,
    StartDate DATE,
	EndDate DATE,
	RepoRate int,
)
GO

