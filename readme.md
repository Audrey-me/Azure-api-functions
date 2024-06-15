# Azure Functions
This Project covers creating the FastAPI application, connecting it to Azure Cosmos DB, creating an Azure Function to host the FastAPI app, and deploying it to Azure.

## Tools Used
- Azure
- MongoDB
- python 3.7 and above
- 

## Setup Instructions

1. Set Up MongoDB
    - Create a MongoDB Atlas Account(https://www.mongodb.com/products/platform/atlas-database)
    - Sign up for a free account at MongoDB Atlas.
    - Create a new cluster.
    - Within your MongoDB Atlas account, create a new database.
    - Create a new collection within this database (e.g., "movies").
    - save your connection string, it should look something like this
    (mongodb+srv://<username>:<password>@cluster0.x2hb9sl.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0)

2. Download Python 3.7 or above

3. Clone this repository
```bash
git clone https://github.com/Audrey-me/Azure-api-functions.git
```

4. cd into the cloned repository
```bash
cd Azure-api-functions
```

5. Create  and activate a virtual environment by running these commands
    ```bash
        python3 -m venv myapi
        source myapi/bin/activate  # On Windows, use `venv\Scripts\activate`
    ```

6. Run this command to set up the tools
    ```bash
        python3 -m pip install -r requirements.txt
    ```

7. install Mongodb for Vscode extension and connect

8. Download mongodb compass and connect to your database using the connection string, then import the data.json file

9. Run the main.py file to be sure the api runs locally
```bash
    python3 main.py
```

9. Download Azure core tools by running this command
    ```bash
    npm i -g azure-functions-core-tools@4 --unsafe-perm true
    ```
10. download the azure functions extension on vscode


