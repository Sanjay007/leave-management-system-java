create database MLS

go

use MLS

go

create table MessengerType(
	MtId int primary key,
	MtName nvarchar(25)
);

go

create table Level(
	LvName nvarchar(25),
	LvLevel int primary key,
	LvComment nvarchar(25),
	LvPosition nvarchar(15)
);

go


create table Employee(
	EmId int primary key,
	EmNameLogin nvarchar(25),
	EmPassLogin	nvarchar(8),
	EmName nvarchar(25),
	EmAge int,
	EmLevel int constraint fk_Em foreign key references Level(LvLevel),
	EmEmail nvarchar(25),
	EmPhone nvarchar(14),
	EmJoinDay datetime,
	EmDayOfLeave int
);


go

create table Reply(
	ReId int,
	MrId int,
	EmId int constraint fk_Re foreign key references Employee(EmId),
	ReStatus int,
	ReDayReply datetime
);

go

create table SystemMessenger(
	SmId int primary key,
	MtId int constraint fk_SM1 foreign key references MessengerType(MtId),
	EmId int constraint fk_SM2 foreign key references Employee(EmId),
	SmTitle nvarchar(25),
	SmContent nvarchar(25),
	SmDay datetime
);



go

create table MessengerRequest(
	MrId int primary key,
	EmId int constraint fk_MR foreign key references Employee(EmId),
	MrStatus int,	
	MrDayStart datetime,
	MrDayEnd datetime,
	MrAddress nvarchar(60),
	MrResoin nvarchar(60),
	MrDayRequest datetime
);


insert into table