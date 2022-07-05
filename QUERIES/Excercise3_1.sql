Select make as brand,count(I.InvoiceID) as counter_of_sales, DD.QuarterAbbrAndYear from stock S 
Inner Join InvoiceLines IL ON S.StockID = IL.StockID
Inner Join Invoices I ON I.InvoiceID = IL.InvoiceID
Inner Join DateDimension DD ON I.InvoiceDate = DD.DateKey
where DD.QuarterAbbrAndYear = 'Q1 2014' or DD.QuarterAbbrAndYear = 'Q3 2014'
GROUP BY MAKE, dd.QuarterAbbrAndYear
ORDER BY counter_of_sales desc