B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=12.2
@EndOfDesignText@
Sub Class_Globals
	Private sql As SQL
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	sql.Initialize(File.DirInternal, "tienda.db", True)
	sql.ExecNonQuery("CREATE TABLE IF NOT EXISTS productos( id int primary key, nombre text(50), precioUnitario number(10,3), stock number(10,3), iva number(7,3))")
End Sub

Public Sub Create(id As Int, nombre As String, precioUnitario As Double, stock As Double, iva As Double) As Producto
	Try
		sql.ExecNonQuery2("INSERT INTO productos VALUES (?, ?, ?, ?, ?)", Array As Object( id, nombre, precioUnitario, stock, iva ))

		Dim producto As Producto : producto.Initialize
		
		producto.Id = id
		producto.Nombre = nombre
		producto.PrecioUnitario = precioUnitario
		producto.Stock = stock
		producto.iva = iva
		Return producto

	Catch
		Log(LastException)
		Return Null
	End Try
End Sub

Public Sub Read_All() As List
	Dim res As List : res.initialize
	Try
		
		Dim cursor As Cursor
		cursor = sql.ExecQuery("SELECT * FROM productos ORDER BY nombre")
		For i = 0 To cursor.RowCount -1
			cursor.Position = i
			Dim prod As Producto : prod.initialize
			prod.Id = cursor.GetInt("id")
			prod.Nombre = cursor.GetString("nombre")
			prod.PrecioUnitario = cursor.GetDouble("precioUnitario")
			prod.Stock = cursor.GetDouble("stock")
			prod.IVA = cursor.GetDouble("iva")
			res.Add(prod)
		Next
		
	Catch
		Log(LastException)
	End Try

	Return res
End Sub

Public Sub Read_ById(id As Int) As Producto
	Try
		Dim cursor As Cursor
		cursor = sql.ExecQuery2("SELECT * FROM productos WHERE id = ?", Array As String(id))
		If cursor.RowCount > 0 Then
			cursor.Position = 0
			Dim prod As Producto : prod.initialize
			prod.Id = cursor.GetInt("id")
			prod.Nombre = cursor.GetString("nombre")
			prod.PrecioUnitario = cursor.GetDouble("precioUnitario")
			prod.Stock = cursor.GetDouble("stock")
			prod.IVA = cursor.GetDouble("iva")
			Return prod
		Else
			Return Null
		End If
		
	Catch
		Log(LastException)
		Return Null
	End Try
End Sub

Public Sub Update(id As Int, nombre As String, precioUnitario As Double, stock As Double, iva As Double) As Producto
	Try
		sql.ExecNonQuery2("UPDATE productos SET nombre = ?, precioUnitario = ?, stock = ?, iva = ? WHERE id = ?", Array As Object (nombre, precioUnitario, stock, iva, id))
		Dim prod As Producto : prod.initialize
		prod.Id = id
		prod.Nombre =  nombre
		prod.PrecioUnitario = precioUnitario
		prod.Stock = stock
		prod.IVA = iva
		Return prod
	Catch
		Log(LastException)
		Return Null
	End Try
End Sub

Public Sub Delete( id As Int) As Boolean
	Try
		sql.ExecNonQuery2("DELETE FROM productos WHERE id = ?", Array As Object(id))
		Return True
	Catch
		Log(LastException)
		Return False
	End Try
End Sub