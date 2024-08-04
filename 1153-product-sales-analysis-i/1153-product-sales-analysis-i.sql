# Write your MySQL query statement below
select Product.product_name, Sales.year, Sales.price from Sales,Product
where Product.Product_id=sales.product_id