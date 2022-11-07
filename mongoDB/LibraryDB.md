# Library DB
#### Show all the databases 
```show dbs```
#### Create and use a DB
 ```use libraryDB```
#### Create collections
```db.createCollection("book")```

#### Create Documents 
```doc1 = ({isbn:"e01",bname:"let us C",auther:["yeshwanth","kanaka"],year:2012,publisher:"pearson",price:100})```

```doc2 = ({isbn:"e02",bname:"python",auther:["Sanjay","manoj"],year:2013,publisher:"MC crawl",price:600})```

```doc3 = ({isbn:"e03",bname:"java",auther:["Akshay","Ananya"],year:2012,publisher:"pearson",price:900})```

```doc4 = ({isbn:"e04",bname:"machine learning",auther:["Arjun","Nikhitha"],year:2015,publisher:"pearson",price:300})```

```doc5 = ({isbn:"e05",bname:"cloud computing",auther:["Vignesh","Shailesh"],year:2017,publisher:"pearson",price:500})```

#### Insert Documents 
```db.book.insertMany([doc1,doc2,doc3,doc4,doc5])```

## Queries
#### 1Q) list all the fields except year and price
```db.book.find({},{year:0,price:0}).pretty()```

**output:**
{
	"_id" : ObjectId("6368990a0878303f67318080"),
	"isbn" : "e01",
	"bname" : "let us C",
	"auther" : [
		"yeshwanth",
		"kanaka"
	],
	"publisher" : "pearson"
}
{
	"_id" : ObjectId("6368990a0878303f67318081"),
	"isbn" : "e02",
	"bname" : "python",
	"auther" : [
		"Sanjay",
		"manoj"
	],
	"publisher" : "MC crawl"
}
{
	"_id" : ObjectId("6368990a0878303f67318082"),
	"isbn" : "e03",
	"bname" : "java",
	"auther" : [
		"Akshay",
		"Ananya"
	],
	"publisher" : "pearson"
}
{
	"_id" : ObjectId("6368990a0878303f67318083"),
	"isbn" : "e04",
	"bname" : "machine learning",
	"auther" : [
		"Arjun",
		"Nikhitha"
	],
	"publisher" : "pearson"
}
{
	"_id" : ObjectId("6368990a0878303f67318084"),
	"isbn" : "e05",
	"bname" : "cloud computing",
	"auther" : [
		"Vignesh",
		"Shailesh"
	],
	"publisher" : "pearson"
}

#### 2Q) Display all the records with author Shailesh 
```db.book.find({auther:"Shailesh"},{}).pretty()```

**output:**
{
	"_id" : ObjectId("6368990a0878303f67318084"),
	"isbn" : "e05",
	"bname" : "cloud computing",
	"auther" : [
		"Vignesh",
		"Shailesh"
	],
	"year" : 2017,
	"publisher" : "pearson",
	"price" : 500
}

#### 3Q) List all books with publisher Pearson 
```db.book.find({bname:"java"},{}).pretty()```

**output:**
{
	"_id" : ObjectId("6368990a0878303f67318080"),
	"isbn" : "e01",
	"bname" : "let us C",
	"auther" : [
		"yeshwanth",
		"kanaka"
	],
	"year" : 2012,
	"publisher" : "pearson",
	"price" : 100
}
{
	"_id" : ObjectId("6368990a0878303f67318082"),
	"isbn" : "e03",
	"bname" : "java",
	"auther" : [
		"Akshay",
		"Ananya"
	],
	"year" : 2012,
	"publisher" : "pearson",
	"price" : 900
}
{
	"_id" : ObjectId("6368990a0878303f67318083"),
	"isbn" : "e04",
	"bname" : "machine learning",
	"auther" : [
		"Arjun",
		"Nikhitha"
	],
	"year" : 2015,
	"publisher" : "pearson",
	"price" : 300
}
{
	"_id" : ObjectId("6368990a0878303f67318084"),
	"isbn" : "e05",
	"bname" : "cloud computing",
	"auther" : [
		"Vignesh",
		"Shailesh"
	],
	"year" : 2017,
	"publisher" : "pearson",
	"price" : 500
}


#### 4Q) List the publisher of book java.
```db.book.find({bname:"java"},{}).pretty()```

**output:**
{
	"_id" : ObjectId("6368990a0878303f67318082"),
	"isbn" : "e03",
	"bname" : "java",
	"auther" : [
		"Akshay",
		"Ananya"
	],
	"year" : 2012,
	"publisher" : "pearson",
	"price" : 900
}
#### 5Q) List the author, publisher and year of the book “Let us C”.
``` db.book.find({bname:"let us C"},{bname:1, publisher:1,author:1,year:1}).pretty() ```

**output:**
{
	"_id" : ObjectId("6368990a0878303f67318080"),
	"bname" : "let us C",
	"year" : 2012,
	"publisher" : "pearson"
}


#### 6Q) Display the price of “Let us C” except _id.
``` db.book.find({bname:"let us C"},{bname:1,price:1,_id:0}).pretty() ```

**output:**
{ "bname" : "let us C", "price" : 100 }

#### 7Q) Sort and display all books in ascending order of book names.
``` db.book.find({},{}).sort({bname:1}).pretty()```

**output:**
{
	"_id" : ObjectId("6368990a0878303f67318084"),
	"isbn" : "e05",
	"bname" : "cloud computing",
	"auther" : [
		"Vignesh",
		"Shailesh"
	],
	"year" : 2017,
	"publisher" : "pearson",
	"price" : 500
}
{
	"_id" : ObjectId("6368990a0878303f67318082"),
	"isbn" : "e03",
	"bname" : "java",
	"auther" : [
		"Akshay",
		"Ananya"
	],
	"year" : 2012,
	"publisher" : "pearson",
	"price" : 900
}
{
	"_id" : ObjectId("6368990a0878303f67318080"),
	"isbn" : "e01",
	"bname" : "let us C",
	"auther" : [
		"yeshwanth",
		"kanaka"
	],
	"year" : 2012,
	"publisher" : "pearson",
	"price" : 100
}
{
	"_id" : ObjectId("6368990a0878303f67318083"),
	"isbn" : "e04",
	"bname" : "machine learning",
	"auther" : [
		"Arjun",
		"Nikhitha"
	],
	"year" : 2015,
	"publisher" : "pearson",
	"price" : 300
}
{
	"_id" : ObjectId("6368990a0878303f67318081"),
	"isbn" : "e02",
	"bname" : "python",
	"auther" : [
		"Sanjay",
		"manoj"
	],
	"year" : 2013,
	"publisher" : "MC crawl",
	"price" : 600
}
#### 8Q) Sort and display only 3 books in descending order of price.
``` db.book.find({},{}).sort({price:-1}).pretty().limit(3)```

**output:**
{
	"_id" : ObjectId("6368990a0878303f67318082"),
	"isbn" : "e03",
	"bname" : "java",
	"auther" : [
		"Akshay",
		"Ananya"
	],
	"year" : 2012,
	"publisher" : "pearson",
	"price" : 900
}
{
	"_id" : ObjectId("6368990a0878303f67318081"),
	"isbn" : "e02",
	"bname" : "python",
	"auther" : [
		"Sanjay",
		"manoj"
	],
	"year" : 2013,
	"publisher" : "MC crawl",
	"price" : 600
}
{
	"_id" : ObjectId("6368990a0878303f67318084"),
	"isbn" : "e05",
	"bname" : "cloud computing",
	"auther" : [
		"Vignesh",
		"Shailesh"
	],
	"year" : 2017,
	"publisher" : "pearson",
	"price" : 500
}
#### 9Q) Display all the books written by nikhitha and arjun.
``` db.book.find({auther:{$all:["Arjun","Nikhitha"]}},{bname:1,auther:1,price:1}).pretty()```

**output:**
{
	"_id" : ObjectId("6368990a0878303f67318083"),
	"bname" : "machine learning",
	"auther" : [
		"Arjun",
		"Nikhitha"
	],
	"price" : 300
}

#### 10Q) Display all the books either written by nikhitha or arjun.
``` db.book.find({auther:{$in:["Arjun","Nikhitha"]}},{bname:1,auther:1,price:1}).pretty()```

**output:**
{
	"_id" : ObjectId("6368990a0878303f67318083"),
	"bname" : "machine learning",
	"auther" : [
		"Arjun",
		"Nikhitha"
	],
	"price" : 300
}

#### 10Q) Display all the books where Sanjay is the first author.
``` db.book.find({"auther.0":{$eq:"Sanjay"}}).pretty()```

**output:**
{
	"_id" : ObjectId("6368990a0878303f67318081"),
	"isbn" : "e02",
	"bname" : "python",
	"auther" : [
		"Sanjay",
		"manoj"
	],
	"year" : 2013,
	"publisher" : "MC crawl",
	"price" : 600
}


