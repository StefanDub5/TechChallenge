SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
-- =============================================
-- Author:		<Author,,Name>
-- Create date: <Create Date,,>
-- Description:	<Description,,>
-- =============================================
CREATE FUNCTION dbo.CalculateInterest
(
    @pStartAmount DECIMAL(18,2), 
    @pInterestRate DECIMAL(18,2),
    @pDuration DECIMAL(18,2)
)
RETURNS INT
AS
    BEGIN
 
          RETURN (@pStartAmount*@pInterestRate*@pDuration/100)
 
    END

