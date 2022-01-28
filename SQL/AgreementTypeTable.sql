USE [TestDB]
GO

/****** Object:  Table [dbo].[AgreementType]    Script Date: 2022/01/28 13:01:49 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[AgreementType](
	[AgreementTypeID] [int] NOT NULL,
	[AgreementType] [varchar](50) NOT NULL,
	[AgreementFormula] [varchar](50) NOT NULL,
 CONSTRAINT [PK_AgreementType] PRIMARY KEY CLUSTERED 
(
	[AgreementTypeID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO


