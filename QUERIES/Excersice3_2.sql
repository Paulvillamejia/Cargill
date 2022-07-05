Select   C.color as COLOR ,count(I.InvoiceID) as counter_of_sales ,DD.QuarterAbbrAndYear from stock S 
Inner Join InvoiceLines IL ON S.StockID = IL.StockID
Inner Join Invoices I ON I.InvoiceID = IL.InvoiceID
Inner Join DateDimension DD ON I.InvoiceDate = DD.DateKey
iNNER Join Colors C ON S.ColorID = C.colorID
GROUP BY Color, dd.QuarterAbbrAndYear
ORDER BY DD.QuarterAbbrAndYear ASC,counter_of_sales DESC 