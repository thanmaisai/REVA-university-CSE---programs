# Employee DB
#### Show all the databases 
```show dbs```
#### Create and use a DB
 ```use employeeDB```
#### Create collections
```Db.createCollection("emp")```
#### Create Documents 
```doc1 = { eid:001, ename:"kiran", dept:"production", desig:"hr", salary:40000, yoj:2016, address:{dno:47, street:3, locality:"JPnagar", city:"banglore"}};```<br>
```doc2 = { eid:002, ename:"Hari", dept:"Research", desig:"developer", salary:40000, yoj:2017, address:{dno:49, street:2, locality:"Bugler", city:"banglore"}};```<br>
```doc3 = { eid:003, ename:"charan", dept:"IT", desig:"testing", salary:55000, yoj:2019, address:{dno:27, street:5, locality:"JPnagar", city:"Mumbai"}};```<br>
```doc4 = { eid:004, ename:"vishal", dept:"production", desig:"hr", salary:40000, yoj:2015, address:{dno:13, street:53, locality:"Lnagar", city:"Lucknow"}};```<br>
```doc5 = { eid:005, ename:"veer", dept:"Research", desig:"developer", salary:35000, yoj:2017, address:{dno:12, street:4, locality:"JPnagar", city:"banglore"}};```<br>
```doc6 = { eid:006, ename:"vishwas", dept:"production", desig:"hr", salary:55000, yoj:2020, address:{dno:47, street:3, locality:"JPnagar", city:"banglore"}};```<br>
```doc7 = { eid:007, ename:"siri", dept:"IT", desig:"testing", salary:60000, yoj:2012, address:{dno:47, street:3, locality:"JPnagar", city:"banglore"}};```<br>
```doc8 = { eid:008, ename:"arun", dept:"Research", desig:"developer", salary:40000, yoj:2015, address:{dno:6, street:7, locality:"Bugler", city:"banglore"}};```<br>
```doc9 = { eid:009, ename:"surya", dept:"IT", desig:"testing", salary:35000, yoj:2014, address:{dno:41, street:9, locality:"Herbal", city:"banglore"}};```<br>
```doc10 = { eid:010, ename:"ravi", dept:"Research", desig:"developer", salary:65000, yoj:2009, address:{dno:32, street:11, locality:"JPnagar", city:"Lucknow"}};```<br>

#### Insert Documents 
```db. emp.insertMany([doc1,doc2,doc3,doc4,doc5,doc6,doc7,doc8,doc9,doc10])```

## Queries
#### 1) Display all emp with designation as developer
```db.emp.find({desig:"developer"},{salary:1,ename:1,_id:0}).pretty()```

#### 2) Get a range of salary 
```db.emp.find({$and:[{salary:{$gt:50000}},{salary:{$lt:75000}}]},{ename:1,_id:0}).pretty()```

#### 3) Increment salary of developer by 5K
```db.emp.update({desig:"developer"},{$inc:{"salary":5000}})```
```db.emp.find({desig:"developer"},{salary:1,ename:1,_id:0}).pretty()```

#### 4) Add field age to emp to Ravi
```db.emp.update({ename:"ravi"},{$set:{age:22}})```

#### 5) Remove a field you from ravi
```db.emp.update({ename:"ravi"},{$unset:{yoj:1}})```

#### 6) Add an array field project to ravi and more projects(p2,p3)
```db.emp.update({ename:"ravi"},{$push:{project:"p1"}}) ```// creating a field
```db.emp.update({ename:"ravi"},{$push:{project:{$each:["p2","p3"]}}}) ```//adding more elements into the array
#### 7) Remove p3 form the array added in projects feild in ravi
```db.emp.update({ename:"ravi"},{$pull:{project:"p3"}}) ```

#### 8) Add a new embedded object "contacts" with "email" and "phone" as array objects to ravi
```db.emp.update({ename:"ravi"},{$push:{contact:{phone:"9949225297",email:"xyz@gmail.com"}}})```
#### 9) Add a 2 new phone number to "phone" as array objects to ravi
```db.emp.update({ename:"ravi"},{$addToSet:{"contact":{"phone":[9738751143,9880730784]}})```

