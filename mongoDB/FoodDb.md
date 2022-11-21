
# Food Db
## Show all the databases
`show dbs`

## Create and use a DB 
`use FoodDb`

## Create collections
`db.createCollection("food")`
## Create Documents
```doc1= {foodid:1, foodcat:"fastfood", foodname:"burger", chefname:["naveen","rakesh"], price:500, ingredients:["chees","corn"], hotelname:"mcburger", address:{no:31, street:"belroad", locality:"yelahanka", city:"bangalore"}}```

```doc2= {foodid:2, foodcat:"fastfood", foodname:"pizza", chefname:["shailesh","sanjay"], price:600, ingredients:["onion","corn"], hotelname:"Dominos", address:{no:31, street:"gandhi road", locality:"RRNagar", city:"bangalore"}}```

```doc3= {foodid:3, foodcat:"healthy", foodname:"salad", chefname:["thanmai","manoj"], price:800, ingredients:["olive","carrot"], hotelname:"dailyFit", address:{no:21, street:"rmz road", locality:"yelenkha", city:"bangalore"}}```

```doc4= {foodid:4, foodcat:"fastfood", foodname:"panipuri", chefname:["shailesh","nikhitha"], price:200, ingredients:["potato","salt"], hotelname:"ApnaPaniPuri", address:{no:11, street:"bsf circle", locality:"Reva circle ", city:"bangalore"}}```

```doc5= {foodid:5, foodcat:"healthy", foodname:"FruitSalad", chefname:["akshay","surya"], price:300, ingredients:["apple","pineapple"], hotelname:"Day2Day", address:{no:52, street:"local market", locality:"Majestic", city:"bangalore"}}```

```doc6= {foodid:6, foodcat:"MainCourse", foodname:"biryani", chefname:["sanjay","thanmai"], price:700, ingredients:["basmathi rice","spices"], hotelname:"Hyderabadi Biryani", address:{no:21, street:"rmz circle", locality:"Reva circle ", city:"bangalore"}}```

```doc7= {foodid:7, foodcat:"fastfood", foodname:"waliSpecial", chefname:["Wali","Akshya"], price:100, ingredients:["potato","oil"], hotelname:"waliBoi", address:{no:13, street:"bsf circle", locality:"Reva circle ", city:"bangalore"}}```

```doc8= {foodid:8, foodcat:"fastfood", foodname:"bhelpuri", chefname:["shailesh","nikhitha"], price:200, ingredients:["potato","salt"], hotelname:"ApnaPaniPuri", address:{no:11, street:"bsf circle", locality:"Reva circle ", city:"bangalore"}}```

```doc9= {foodid:9, foodcat:"fastfood", foodname:"FrenchFries", chefname:["shailesh","Thanmai"], price:200, ingredients:["potato","salt"], hotelname:"MyFrenchFries", address:{no:10, street:"bsf circle", locality:"Reva circle ", city:"bangalore"}}```

```doc10= {foodid:10, foodcat:"fastfood", foodname:"rolls", chefname:["darsha","surya"], price:400, ingredients:["wheat Flour","salt"], hotelname:"Rollme", address:{no:32, street:"gandhi circle", locality:"Reva circle ", city:"bangalore"}}```

## Insert Documents
`db.food.insertMany([doc1,doc2,doc3,doc4,doc5,doc6,doc7,doc8,doc9,doc10])`

## Queries
### 1Q) List the price of pizza with ingredients.
```db.food.find({"foodname" : "pizza"},{foodname:1,price:1,ingredients:1,_id:0}).pretty()```

{
	"foodname" : "pizza",
	"price" : 600,
	"ingredients" : [
		"onion",
		"corn"
	]
}
### 2Q) Display the item in the price range(500,800).
``` db.food.find({$and:[{price:{$gt:500}},{price:{$lt:800}}]}).pretty()```
{ "_id" : ObjectId("637b116c90a5330e8878b4a0"), "foodid" : 2, "foodcat" : "fastfood", "foodname" : "pizza", "chefname" : [ "shailesh", "sanjay" ], "price" : 600, "ingredients" : [ "onion", "corn" ], "hotelname" : "Dominos", "address" : { "no" : 31, "street" : "gandhi road", "locality" : "RRNagar", "city" : "bangalore" } }
{ "_id" : ObjectId("637b116c90a5330e8878b4a4"), "foodid" : 6, "foodcat" : "MainCourse", "foodname" : "biryani", "chefname" : [ "sanjay", "thanmai" ], "price" : 700, "ingredients" : [ "basmathi rice", "spices" ], "hotelname" : "Hyderabadi Biryani", "address" : { "no" : 21, "street" : "rmz circle", "locality" : "Reva circle ", "city" : "bangalore" } }

### 3Q) Display the item prepared by x <u>*OR*</u> y.
```db.food.find({chefname:{$in:["shailesh","nikhitha"]}},{chefname:1,foodname:1,_id:0})```
{ "foodname" : "pizza", "chefname" : [ "shailesh", "sanjay" ] }
{ "foodname" : "panipuri", "chefname" : [ "shailesh", "nikhitha" ] }
{ "foodname" : "bhelpuri", "chefname" : [ "shailesh", "nikhitha" ] }
{ "foodname" : "FrenchFries", "chefname" : [ "shailesh", "Thanmai" ] }

### 4Q) Display the item prepared by x <u>*AND*</u> y.
``` db.food.find({chefname:{$all:["shailesh","nikhitha"]}},{chefname:1,foodname:1,_id:0})```
{ "foodname" : "panipuri", "chefname" : [ "shailesh", "nikhitha" ] }
{ "foodname" : "bhelpuri", "chefname" : [ "shailesh", "nikhitha" ] }

### 5Q) Add one chef to the food pizza.
```db.food.update({foodname:'pizza'},{$push:{chefname:"rocky Bhai"}})```

WriteResult({ "nMatched" : 1, "nUpserted" : 0, "nModified" : 1 })

```db.food.find({foodname:"pizza"},{foodname:1,chefname:1,_id:0})```

{ "foodname" : "pizza", "chefname" : [ "shailesh", "sanjay", **"rocky Bhai"** ] }

### 6Q) Add ingredients to the food pizza.
```db.food.update({foodname:"pizza"},{$addToSet:{ingredients:['capsicum','tomato']}})```

WriteResult({ "nMatched" : 1, "nUpserted" : 0, "nModified" : 1 })

```db.food.find({foodname:"pizza"}).pretty()```
{
	"_id" : ObjectId("637b116c90a5330e8878b4a0"),
	"foodid" : 2,
	"foodcat" : "fastfood",
	"foodname" : "pizza",
	"chefname" : [
		"shailesh",
		"sanjay",
		"rocky Bhai"
	],
	"price" : 600,
	"ingredients" : [
		"onion",
		"corn",
		**[
			"capsicum",
			"tomato"
		]**
	],
	"hotelname" : "Dominos",
	"address" : {
		"no" : 31,
		"street" : "gandhi road",
		"locality" : "RRNagar",
		"city" : "bangalore"
	}
}

### 7Q) Delete last ingredient added to the food pizza.
```db.food.update({foodname:"pizza"},{$pop:{ingredients:1}})```

```db.food.find({foodname:"pizza"}).pretty()```
{
	"_id" : ObjectId("637b116c90a5330e8878b4a0"),
	"foodid" : 2,
	"foodcat" : "fastfood",
	"foodname" : "pizza",
	"chefname" : [
		"shailesh",
		"sanjay",
		"rocky Bhai"
	],
	"price" : 600,
	"ingredients" : [
		**"onion",
		"corn"**
	],
	"hotelname" : "Dominos",
	"address" : {
		"no" : 31,
		"street" : "gandhi road",
		"locality" : "RRNagar",
		"city" : "bangalore"
	}
}
### 8Q) Delete all the ingredients from the food biryani.
```db.food.update({foodname:'biryani'},{$pullAll:{ingredients:['basmathi rice','spices']}})```
WriteResult({ "nMatched" : 1, "nUpserted" : 0, "nModified" : 1 })

```db.food.find({foodname:"biryani"}).pretty()```
{
	"_id" : ObjectId("637b116c90a5330e8878b4a4"),
	"foodid" : 6,
	"foodcat" : "MainCourse",
	"foodname" : "biryani",
	"chefname" : [
		"sanjay",
		"thanmai"
	],
	"price" : 700,
	**"ingredients" : [ ],**
	"hotelname" : "Hyderabadi Biryani",
	"address" : {
		"no" : 21,
		"street" : "rmz circle",
		"locality" : "Reva circle ",
		"city" : "bangalore"
	}
}
### 9Q) Remove the last ingredient from pizza.
```db.food.update({foodname:"pizza"},{$pop:{ingredients:1}})```
WriteResult({ "nMatched" : 1, "nUpserted" : 0, "nModified" : 1 })
```db.food.find({foodname:"pizza"}).pretty()```
{
	"_id" : ObjectId("637b116c90a5330e8878b4a0"),
	"foodid" : 2,
	"foodcat" : "fastfood",
	"foodname" : "pizza",
	"chefname" : [
		"shailesh",
		"sanjay",
		"rocky Bhai"
	],
	"price" : 600,
	"ingredients" : [
	**"onion"**
	],
	"hotelname" : "Dominos",
	"address" : {
		"no" : 31,
		"street" : "gandhi road",
		"locality" : "RRNagar",
		"city" : "bangalore"
	}
}
NOTE: using ```$pop``` will remove the last element, like removing elements from stack 
thus running the below command again will remove the ingredient onion and make the ingredients as null array.
> ``db.food.update({foodname:"pizza"},{$pop:{ingredients:1}})``
WriteResult({ "nMatched" : 1, "nUpserted" : 0, "nModified" : 1 })
```db.food.find({foodname:"pizza"}).pretty()```
{
	"_id" : ObjectId("637b116c90a5330e8878b4a0"),
	"foodid" : 2,
	"foodcat" : "fastfood",
	"foodname" : "pizza",
	"chefname" : [
		"shailesh",
		"sanjay",
		"rocky Bhai"
	],
	"price" : 600,
	**"ingredients" : [ ],**
	"hotelname" : "Dominos",
	"address" : {
		"no" : 31,
		"street" : "gandhi road",
		"locality" : "RRNagar",
		"city" : "bangalore"
	}
}

### 10Q) Modify the burger price by 200.
 ```db.food.update({foodname:"pizza"},{$set:{price:200}})```
WriteResult({ "nMatched" : 1, "nUpserted" : 0, "nModified" : 1 })
<br>
```db.food.find({foodname:"pizza"}).pretty()```
{
	"_id" : ObjectId("637b116c90a5330e8878b4a0"),
	"foodid" : 2,
	"foodcat" : "fastfood",
	"foodname" : "pizza",
	"chefname" : [
		"shailesh",
		"sanjay",
		"rocky Bhai"
	],
	**"price" : 200,** // has been updated from 600 to 200
	"ingredients" : [ ],
	"hotelname" : "Dominos",
	"address" : {
		"no" : 31,
		"street" : "gandhi road",
		"locality" : "RRNagar",
		"city" : "bangalore"
	}
}
### 11Q) Add or insert a new food item with the food Id "5" using upsert as True.
```db.food.update({foodid:"f08"},{foodid:"f08",foodcat:"chats",foodname:"burger", chefname:["dhanush","pruthvi"],price:200,ingredients:["onion","puri"], hotelname:"chat street", address:{no:16,street:"8th",locality:"hebbal",city:"bangalore"}},true)```
<br>
WriteResult({
	"nMatched" : 0,
	"nUpserted" : 1,
	"nModified" : 0,
	"_id" : ObjectId("637b212c97f4b4a449022f1c")
})
<br>
```db.food.find({foodid:"f08"}).pretty();```
<br>
{
	"_id" : ObjectId("637b212c97f4b4a449022f1c"),
	**"foodid" : "f08",**
	"foodcat" : "chats",
	"foodname" : "burger",
	"chefname" : [
		"dhanush",
		"pruthvi"
	],
	"price" : 200,
	"ingredients" : [
		"onion",
		"puri"
	],
	"hotelname" : "chat street",
	"address" : {
		"no" : 16,
		"street" : "8th",
		"locality" : "hebbal",
		"city" : "bangalore"
	}
}

### 12Q) Increment the price of all food item in food cat: fastfood by 120.
```db.food.update({foodcat:"fastfood"},{$inc:{price:120}},false, true)```
<br>
WriteResult({ "nMatched" : 6, "nUpserted" : 0, "nModified" : 6 })
<br>
```db.food.find({foodcat:"fastfood"}).pretty();```
{
	"_id" : ObjectId("637b116c90a5330e8878b4a0"),
	"foodid" : 2,
	"foodcat" : "fastfood",
	"foodname" : "pizza",
	"chefname" : [
		"shailesh",
		"sanjay",
		"rocky Bhai"
	],
	**"price" : 320,**
	"ingredients" : [ ],
	"hotelname" : "Dominos",
	"address" : {
		"no" : 31,
		"street" : "gandhi road",
		"locality" : "RRNagar",
		"city" : "bangalore"
	}
}
{
	"_id" : ObjectId("637b116c90a5330e8878b4a2"),
	"foodid" : 4,
	"foodcat" : "fastfood",
	"foodname" : "panipuri",
	"chefname" : [
		"shailesh",
		"nikhitha"
	],
	**"price" : 320,**
	"ingredients" : [
		"potato",
		"salt"
	],
	"hotelname" : "ApnaPaniPuri",
	"address" : {
		"no" : 11,
		"street" : "bsf circle",
		"locality" : "Reva circle ",
		"city" : "bangalore"
	}
}
{
	"_id" : ObjectId("637b116c90a5330e8878b4a5"),
	"foodid" : 7,
	"foodcat" : "fastfood",
	"foodname" : "waliSpecial",
	"chefname" : [
		"Wali",
		"Akshya"
	],
	**"price" : 220,**
	"ingredients" : [
		"potato",
		"oil"
	],
	"hotelname" : "waliBoi",
	"address" : {
		"no" : 13,
		"street" : "bsf circle",
		"locality" : "Reva circle ",
		"city" : "bangalore"
	}
}
{
	"_id" : ObjectId("637b116c90a5330e8878b4a6"),
	"foodid" : 8,
	"foodcat" : "fastfood",
	"foodname" : "bhelpuri",
	"chefname" : [
		"shailesh",
		"nikhitha"
	],
	**"price" : 320,**
	"ingredients" : [
		"potato",
		"salt"
	],
	"hotelname" : "ApnaPaniPuri",
	"address" : {
		"no" : 11,
		"street" : "bsf circle",
		"locality" : "Reva circle ",
		"city" : "bangalore"
	}
}
{
	"_id" : ObjectId("637b116c90a5330e8878b4a7"),
	"foodid" : 9,
	"foodcat" : "fastfood",
	"foodname" : "FrenchFries",
	"chefname" : [
		"shailesh",
		"Thanmai"
	],
	**"price" : 320,**
	"ingredients" : [
		"potato",
		"salt"
	],
	"hotelname" : "MyFrenchFries",
	"address" : {
		"no" : 10,
		"street" : "bsf circle",
		"locality" : "Reva circle ",
		"city" : "bangalore"
	}
}
{
	"_id" : ObjectId("637b116c90a5330e8878b4a8"),
	"foodid" : 10,
	"foodcat" : "fastfood",
	"foodname" : "rolls",
	"chefname" : [
		"darsha",
		"surya"
	],
	**"price" : 520,**
	"ingredients" : [
		"wheat Flour",
		"salt"
	],
	"hotelname" : "Rollme",
	"address" : {
		"no" : 32,
		"street" : "gandhi circle",
		"locality" : "Reva circle ",
		"city" : "bangalore"
	}
}





