from fastapi import FastAPI, HTTPException, Query
from pymongo import MongoClient
from typing import List
import os
import uvicorn

app = FastAPI()

# MongoDB connection
mongo_uri = os.getenv("MONGODB_URI", "mongodb+srv://kosisochukwuakaeze:kosimay_2001@cluster0.x2hb9sl.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0")
client = MongoClient(mongo_uri)
db = client.get_database("Movies-database")
collection = db.get_collection("movies")


@app.get("/")
def read_root():
    return {'message': 'Welcome to Serverless Movies API'}


@app.get("/movies", response_model=List[dict])
async def get_all_movies():
    movies = list(collection.find({}, {"_id": 0}))
    return movies


if __name__ == "__main__":
    uvicorn.run(app, host="0.0.0.0", port=8000)
