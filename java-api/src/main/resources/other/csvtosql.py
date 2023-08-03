import csv

# Open the CSV file
csv_file_path = 'C:\\Users\\jacki\\DB_Coding_Challenge\\java-api\\src\\main\\resources\\other\\db-bonds-data.csv'
csv_file = open(csv_file_path, 'r')

# # Populates Book table
# table_name = 'book'
# columns = ['book_name',]

# # Iterate over each row in the CSV file
# csv_reader = csv.DictReader(csv_file)

# book_list = [] need to finish creating list

# for row in csv_reader:
#     # Build the SQL INSERT statement
#     values = ', '.join([f"'{row[column]}'" for column in columns])
#     sql = f"INSERT INTO {table_name} (name) VALUES ({values});"

#     # Print the SQL statement
#     print(sql)

# Populates Book table
table_name = 'book'
columns = ['book_name',]

# Iterate over each row in the CSV file
csv_reader = csv.DictReader(csv_file)
for row in csv_reader:
    # Build the SQL INSERT statement
    values = ', '.join([f"'{row[column]}'" for column in columns])
    sql = f"INSERT INTO {table_name} (name) VALUES ({values});"

    # Print the SQL statement
    print(sql)    

# Close the CSV file
csv_file.close()






