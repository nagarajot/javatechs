delimiter //
create procedure DoubleNumber(inout n int(3))
begin
     set n = n * 2;
end //
delimiter ;

drop procedure DoubleNumber;


MariaDB [institute]> source DoubleNumber.sql
Query OK, 0 rows affected (0.38 sec)

MariaDB [institute]> set @n = 3;
Query OK, 0 rows affected (0.00 sec)

MariaDB [institute]> call DoubleNumber(@n);
Query OK, 0 rows affected (0.03 sec)

MariaDB [institute]> select @n;
+------+
| @n   |
+------+
| 6    |
+------+




