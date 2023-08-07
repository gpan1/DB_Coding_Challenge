import csv


# Open the CSV file
csv_file_path = 'C:\\Users\\jacki\\DB_Coding_Challenge\\java-api\\src\\main\\resources\\other\\db-bonds-data.csv'
csv_file = open(csv_file_path, 'r')
csv_reader = csv.DictReader(csv_file)


count = 1

for row in csv_reader:
    sql = "insert into security (id, isin, cusip, issuer_name, maturity_date, coupon, type, face_value, currency, status)"
    sql += f" values ({count},'{row['isin']}','{row['cusip']}','{row['issuer_name']}','{row['bond_maturity_date']}',{row['coupon_percent']},'{row['type']}',{row['face_value (mn)']},'{row['trade_currency']}','{row['trade_status']});"
    print(sql)
    count+=1

csv_file.close()






