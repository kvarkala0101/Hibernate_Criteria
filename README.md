Hibernate Criterias:
By using criterias we can make select operations using conditions. Criterias are only for select operations.
Criteria interface having two methods - > list() (to get multiple records), uniqueObject() for only one object.

First step: Create Criteria Object for the class
Second step: add Criterion to the Criteria Object using Restrictions. Restriction is class which have all static methods like eq, gt, lt, between, distinct, etc.

Projections: Projections are used to apply conditions on columns. We are going to add these projections to Criteria Object.
By using projections we can apply calculations on column values like avg, max, min, etc.






 
