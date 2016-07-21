create table CATEGORY
(
CategoryID int PRIMARY KEY IDENTITY(1,1),
CategoryTitle varchar(50) not null, 

)
create table SUBCATEGORY
(
SubCategoryID int PRIMARY KEY IDENTITY(1,1),
SubCategoryTitle varchar(50) not null, 
CategoryID int foreign key references CATEGORY(CategoryID),
)

create table PRODUCT
(
ProductID int PRIMARY KEY IDENTITY(1,1),
ProductTitle varchar(50) not null, 
ProductBrand varchar(50) not null,
SubCategoryID int foreign key references SUBCATEGORY(SubCategoryID),
)
create table SUPPLIER
(
SupplierID int PRIMARY KEY IDENTITY(1,1),
SupplierName varchar(50) not null, 
SupplierCompany varchar(50) not null,
SupplierAddress varchar(50) not null,
SupplierPhone varchar(50) not null,
)
create table MEMBER
(
MemberID int PRIMARY KEY IDENTITY(1,1),
MemberName varchar(50) not null, 
MemberAddress varchar(50) not null,
MemberPhone varchar(50) not null,
)

create table DEPARTMENT
(
DepartmentID int PRIMARY KEY not null,
DepartmentTitle varchar(50) not null, 
)

create table EMPLOYEE
(
EmployeeID int PRIMARY KEY IDENTITY(1,1),
EmployeeName varchar(50) not null,
EmployeeAddress varchar(50) not null,
DepartmentID int foreign key references DEPARTMENT(DepartmentID) , 
)

create table SELL
(
InvoiceNo varchar(50) not null,
ProductID int foreign key references PRODUCT(ProductID),
PRIMARY KEY (InvoiceNo,ProductID),
SellQuantity varchar(50) not null,
SellDate date not null,
SellTime datetime not null,
EmployeeID int foreign key references EMPLOYEE(EmployeeID),
MemberID int foreign key references MEMBER(MemberID),
)
create table STOCK
(
ProductID int foreign key references PRODUCT(ProductID),
LotNo int not null,
PRIMARY KEY(ProductID,LotNo),
Quantity varchar(50) not null,
SupplierID int foreign key references SUPPLIER(SupplierID),
BarcodeNo varchar(50) not null,
PurchaseNo varchar(50) not null,
SellPrice float not null,
ManufactureDate date not null,
ExpDate date not null,
EmployeeID int foreign key references EMPLOYEE(EmployeeID),
)

