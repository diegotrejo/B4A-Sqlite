package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class productos_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private sql As SQL";
productos._sql = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL");__ref.setField("_sql",productos._sql);
 //BA.debugLineNum = 3;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _create(RemoteObject __ref,RemoteObject _id,RemoteObject _nombre,RemoteObject _preciounitario,RemoteObject _stock,RemoteObject _iva) throws Exception{
try {
		Debug.PushSubsStack("Create (productos) ","productos",3,__ref.getField(false, "ba"),__ref,11);
if (RapidSub.canDelegate("create")) { return __ref.runUserSub(false, "productos","create", __ref, _id, _nombre, _preciounitario, _stock, _iva);}
RemoteObject _producto = RemoteObject.declareNull("b4a.example.producto");
Debug.locals.put("id", _id);
Debug.locals.put("nombre", _nombre);
Debug.locals.put("precioUnitario", _preciounitario);
Debug.locals.put("stock", _stock);
Debug.locals.put("iva", _iva);
 BA.debugLineNum = 11;BA.debugLine="Public Sub Create(id As Int, nombre As String, pre";
Debug.ShouldStop(1024);
 BA.debugLineNum = 12;BA.debugLine="Try";
Debug.ShouldStop(2048);
try { BA.debugLineNum = 13;BA.debugLine="sql.ExecNonQuery2(\"INSERT INTO productos VALUES";
Debug.ShouldStop(4096);
__ref.getField(false,"_sql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("INSERT INTO productos VALUES (?, ?, ?, ?, ?)")),(Object)(productos.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {5},new Object[] {(_id),(_nombre),(_preciounitario),(_stock),(_iva)})))));
 BA.debugLineNum = 15;BA.debugLine="Dim producto As Producto : producto.Initialize";
Debug.ShouldStop(16384);
_producto = RemoteObject.createNew ("b4a.example.producto");Debug.locals.put("producto", _producto);
 BA.debugLineNum = 15;BA.debugLine="Dim producto As Producto : producto.Initialize";
Debug.ShouldStop(16384);
_producto.runClassMethod (b4a.example.producto.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 17;BA.debugLine="producto.Id = id";
Debug.ShouldStop(65536);
_producto.setField ("_id" /*RemoteObject*/ ,_id);
 BA.debugLineNum = 18;BA.debugLine="producto.Nombre = nombre";
Debug.ShouldStop(131072);
_producto.setField ("_nombre" /*RemoteObject*/ ,_nombre);
 BA.debugLineNum = 19;BA.debugLine="producto.PrecioUnitario = precioUnitario";
Debug.ShouldStop(262144);
_producto.setField ("_preciounitario" /*RemoteObject*/ ,_preciounitario);
 BA.debugLineNum = 20;BA.debugLine="producto.Stock = stock";
Debug.ShouldStop(524288);
_producto.setField ("_stock" /*RemoteObject*/ ,_stock);
 BA.debugLineNum = 21;BA.debugLine="producto.iva = iva";
Debug.ShouldStop(1048576);
_producto.setField ("_iva" /*RemoteObject*/ ,_iva);
 BA.debugLineNum = 22;BA.debugLine="Return producto";
Debug.ShouldStop(2097152);
Debug.CheckDeviceExceptions();if (true) return _producto;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e12) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e12.toString()); BA.debugLineNum = 25;BA.debugLine="Log(LastException)";
Debug.ShouldStop(16777216);
productos.__c.runVoidMethod ("LogImpl","11441806",BA.ObjectToString(productos.__c.runMethod(false,"LastException",__ref.runMethod(false,"getActivityBA"))),0);
 BA.debugLineNum = 26;BA.debugLine="Return Null";
Debug.ShouldStop(33554432);
if (true) return (productos.__c.getField(false,"Null"));
 };
 BA.debugLineNum = 28;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _delete(RemoteObject __ref,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("Delete (productos) ","productos",3,__ref.getField(false, "ba"),__ref,93);
if (RapidSub.canDelegate("delete")) { return __ref.runUserSub(false, "productos","delete", __ref, _id);}
Debug.locals.put("id", _id);
 BA.debugLineNum = 93;BA.debugLine="Public Sub Delete( id As Int) As Boolean";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 94;BA.debugLine="Try";
Debug.ShouldStop(536870912);
try { BA.debugLineNum = 95;BA.debugLine="sql.ExecNonQuery2(\"DELETE FROM productos WHERE i";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_sql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("DELETE FROM productos WHERE id = ?")),(Object)(productos.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_id)})))));
 BA.debugLineNum = 96;BA.debugLine="Return True";
Debug.ShouldStop(-2147483648);
Debug.CheckDeviceExceptions();if (true) return productos.__c.getField(true,"True");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e5) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e5.toString()); BA.debugLineNum = 98;BA.debugLine="Log(LastException)";
Debug.ShouldStop(2);
productos.__c.runVoidMethod ("LogImpl","13145733",BA.ObjectToString(productos.__c.runMethod(false,"LastException",__ref.runMethod(false,"getActivityBA"))),0);
 BA.debugLineNum = 99;BA.debugLine="Return False";
Debug.ShouldStop(4);
if (true) return productos.__c.getField(true,"False");
 };
 BA.debugLineNum = 101;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (productos) ","productos",3,__ref.getField(false, "ba"),__ref,6);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "productos","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 6;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(32);
 BA.debugLineNum = 7;BA.debugLine="sql.Initialize(File.DirInternal, \"tienda.db\", Tru";
Debug.ShouldStop(64);
__ref.getField(false,"_sql" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(productos.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("tienda.db")),(Object)(productos.__c.getField(true,"True")));
 BA.debugLineNum = 8;BA.debugLine="sql.ExecNonQuery(\"CREATE TABLE IF NOT EXISTS prod";
Debug.ShouldStop(128);
__ref.getField(false,"_sql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("CREATE TABLE IF NOT EXISTS productos( id int primary key, nombre text(50), precioUnitario number(10,3), stock number(10,3), iva number(7,3))")));
 BA.debugLineNum = 9;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _read_all(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Read_All (productos) ","productos",3,__ref.getField(false, "ba"),__ref,30);
if (RapidSub.canDelegate("read_all")) { return __ref.runUserSub(false, "productos","read_all", __ref);}
RemoteObject _res = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _cursor = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
RemoteObject _prod = RemoteObject.declareNull("b4a.example.producto");
 BA.debugLineNum = 30;BA.debugLine="Public Sub Read_All() As List";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 31;BA.debugLine="Dim res As List : res.initialize";
Debug.ShouldStop(1073741824);
_res = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("res", _res);
 BA.debugLineNum = 31;BA.debugLine="Dim res As List : res.initialize";
Debug.ShouldStop(1073741824);
_res.runVoidMethod ("Initialize");
 BA.debugLineNum = 32;BA.debugLine="Try";
Debug.ShouldStop(-2147483648);
try { BA.debugLineNum = 34;BA.debugLine="Dim cursor As Cursor";
Debug.ShouldStop(2);
_cursor = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("cursor", _cursor);
 BA.debugLineNum = 35;BA.debugLine="cursor = sql.ExecQuery(\"SELECT * FROM productos";
Debug.ShouldStop(4);
_cursor = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), __ref.getField(false,"_sql" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT * FROM productos ORDER BY nombre"))));Debug.locals.put("cursor", _cursor);
 BA.debugLineNum = 36;BA.debugLine="For i = 0 To cursor.RowCount -1";
Debug.ShouldStop(8);
{
final int step6 = 1;
final int limit6 = RemoteObject.solve(new RemoteObject[] {_cursor.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6) ;_i = ((int)(0 + _i + step6))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 37;BA.debugLine="cursor.Position = i";
Debug.ShouldStop(16);
_cursor.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 38;BA.debugLine="Dim prod As Producto : prod.initialize";
Debug.ShouldStop(32);
_prod = RemoteObject.createNew ("b4a.example.producto");Debug.locals.put("prod", _prod);
 BA.debugLineNum = 38;BA.debugLine="Dim prod As Producto : prod.initialize";
Debug.ShouldStop(32);
_prod.runClassMethod (b4a.example.producto.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 39;BA.debugLine="prod.Id = cursor.GetInt(\"id\")";
Debug.ShouldStop(64);
_prod.setField ("_id" /*RemoteObject*/ ,_cursor.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("id"))));
 BA.debugLineNum = 40;BA.debugLine="prod.Nombre = cursor.GetString(\"nombre\")";
Debug.ShouldStop(128);
_prod.setField ("_nombre" /*RemoteObject*/ ,_cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("nombre"))));
 BA.debugLineNum = 41;BA.debugLine="prod.PrecioUnitario = cursor.GetDouble(\"precioU";
Debug.ShouldStop(256);
_prod.setField ("_preciounitario" /*RemoteObject*/ ,_cursor.runMethod(true,"GetDouble",(Object)(RemoteObject.createImmutable("precioUnitario"))));
 BA.debugLineNum = 42;BA.debugLine="prod.Stock = cursor.GetDouble(\"stock\")";
Debug.ShouldStop(512);
_prod.setField ("_stock" /*RemoteObject*/ ,_cursor.runMethod(true,"GetDouble",(Object)(RemoteObject.createImmutable("stock"))));
 BA.debugLineNum = 43;BA.debugLine="prod.IVA = cursor.GetDouble(\"iva\")";
Debug.ShouldStop(1024);
_prod.setField ("_iva" /*RemoteObject*/ ,_cursor.runMethod(true,"GetDouble",(Object)(RemoteObject.createImmutable("iva"))));
 BA.debugLineNum = 44;BA.debugLine="res.Add(prod)";
Debug.ShouldStop(2048);
_res.runVoidMethod ("Add",(Object)((_prod)));
 }
}Debug.locals.put("i", _i);
;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e18) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e18.toString()); BA.debugLineNum = 48;BA.debugLine="Log(LastException)";
Debug.ShouldStop(32768);
productos.__c.runVoidMethod ("LogImpl","11966098",BA.ObjectToString(productos.__c.runMethod(false,"LastException",__ref.runMethod(false,"getActivityBA"))),0);
 };
 BA.debugLineNum = 51;BA.debugLine="Return res";
Debug.ShouldStop(262144);
if (true) return _res;
 BA.debugLineNum = 52;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _read_byid(RemoteObject __ref,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("Read_ById (productos) ","productos",3,__ref.getField(false, "ba"),__ref,54);
if (RapidSub.canDelegate("read_byid")) { return __ref.runUserSub(false, "productos","read_byid", __ref, _id);}
RemoteObject _cursor = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _prod = RemoteObject.declareNull("b4a.example.producto");
Debug.locals.put("id", _id);
 BA.debugLineNum = 54;BA.debugLine="Public Sub Read_ById(id As Int) As Producto";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 55;BA.debugLine="Try";
Debug.ShouldStop(4194304);
try { BA.debugLineNum = 56;BA.debugLine="Dim cursor As Cursor";
Debug.ShouldStop(8388608);
_cursor = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("cursor", _cursor);
 BA.debugLineNum = 57;BA.debugLine="cursor = sql.ExecQuery2(\"SELECT * FROM productos";
Debug.ShouldStop(16777216);
_cursor = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), __ref.getField(false,"_sql" /*RemoteObject*/ ).runMethod(false,"ExecQuery2",(Object)(BA.ObjectToString("SELECT * FROM productos WHERE id = ?")),(Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {BA.NumberToString(_id)}))));Debug.locals.put("cursor", _cursor);
 BA.debugLineNum = 58;BA.debugLine="If cursor.RowCount > 0 Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean(">",_cursor.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 59;BA.debugLine="cursor.Position = 0";
Debug.ShouldStop(67108864);
_cursor.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 60;BA.debugLine="Dim prod As Producto : prod.initialize";
Debug.ShouldStop(134217728);
_prod = RemoteObject.createNew ("b4a.example.producto");Debug.locals.put("prod", _prod);
 BA.debugLineNum = 60;BA.debugLine="Dim prod As Producto : prod.initialize";
Debug.ShouldStop(134217728);
_prod.runClassMethod (b4a.example.producto.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 61;BA.debugLine="prod.Id = cursor.GetInt(\"id\")";
Debug.ShouldStop(268435456);
_prod.setField ("_id" /*RemoteObject*/ ,_cursor.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("id"))));
 BA.debugLineNum = 62;BA.debugLine="prod.Nombre = cursor.GetString(\"nombre\")";
Debug.ShouldStop(536870912);
_prod.setField ("_nombre" /*RemoteObject*/ ,_cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("nombre"))));
 BA.debugLineNum = 63;BA.debugLine="prod.PrecioUnitario = cursor.GetDouble(\"precioU";
Debug.ShouldStop(1073741824);
_prod.setField ("_preciounitario" /*RemoteObject*/ ,_cursor.runMethod(true,"GetDouble",(Object)(RemoteObject.createImmutable("precioUnitario"))));
 BA.debugLineNum = 64;BA.debugLine="prod.Stock = cursor.GetDouble(\"stock\")";
Debug.ShouldStop(-2147483648);
_prod.setField ("_stock" /*RemoteObject*/ ,_cursor.runMethod(true,"GetDouble",(Object)(RemoteObject.createImmutable("stock"))));
 BA.debugLineNum = 65;BA.debugLine="prod.IVA = cursor.GetDouble(\"iva\")";
Debug.ShouldStop(1);
_prod.setField ("_iva" /*RemoteObject*/ ,_cursor.runMethod(true,"GetDouble",(Object)(RemoteObject.createImmutable("iva"))));
 BA.debugLineNum = 66;BA.debugLine="Return prod";
Debug.ShouldStop(2);
Debug.CheckDeviceExceptions();if (true) return _prod;
 }else {
 BA.debugLineNum = 68;BA.debugLine="Return Null";
Debug.ShouldStop(8);
Debug.CheckDeviceExceptions();if (true) return (productos.__c.getField(false,"Null"));
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e18) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e18.toString()); BA.debugLineNum = 72;BA.debugLine="Log(LastException)";
Debug.ShouldStop(128);
productos.__c.runVoidMethod ("LogImpl","12228242",BA.ObjectToString(productos.__c.runMethod(false,"LastException",__ref.runMethod(false,"getActivityBA"))),0);
 BA.debugLineNum = 73;BA.debugLine="Return Null";
Debug.ShouldStop(256);
if (true) return (productos.__c.getField(false,"Null"));
 };
 BA.debugLineNum = 75;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _update(RemoteObject __ref,RemoteObject _id,RemoteObject _nombre,RemoteObject _preciounitario,RemoteObject _stock,RemoteObject _iva) throws Exception{
try {
		Debug.PushSubsStack("Update (productos) ","productos",3,__ref.getField(false, "ba"),__ref,77);
if (RapidSub.canDelegate("update")) { return __ref.runUserSub(false, "productos","update", __ref, _id, _nombre, _preciounitario, _stock, _iva);}
RemoteObject _prod = RemoteObject.declareNull("b4a.example.producto");
Debug.locals.put("id", _id);
Debug.locals.put("nombre", _nombre);
Debug.locals.put("precioUnitario", _preciounitario);
Debug.locals.put("stock", _stock);
Debug.locals.put("iva", _iva);
 BA.debugLineNum = 77;BA.debugLine="Public Sub Update(id As Int, nombre As String, pre";
Debug.ShouldStop(4096);
 BA.debugLineNum = 78;BA.debugLine="Try";
Debug.ShouldStop(8192);
try { BA.debugLineNum = 79;BA.debugLine="sql.ExecNonQuery2(\"UPDATE productos SET nombre =";
Debug.ShouldStop(16384);
__ref.getField(false,"_sql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("UPDATE productos SET nombre = ?, precioUnitario = ?, stock = ?, iva = ? WHERE id = ?")),(Object)(productos.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {5},new Object[] {(_nombre),(_preciounitario),(_stock),(_iva),(_id)})))));
 BA.debugLineNum = 80;BA.debugLine="Dim prod As Producto : prod.initialize";
Debug.ShouldStop(32768);
_prod = RemoteObject.createNew ("b4a.example.producto");Debug.locals.put("prod", _prod);
 BA.debugLineNum = 80;BA.debugLine="Dim prod As Producto : prod.initialize";
Debug.ShouldStop(32768);
_prod.runClassMethod (b4a.example.producto.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 81;BA.debugLine="prod.Id = id";
Debug.ShouldStop(65536);
_prod.setField ("_id" /*RemoteObject*/ ,_id);
 BA.debugLineNum = 82;BA.debugLine="prod.Nombre =  nombre";
Debug.ShouldStop(131072);
_prod.setField ("_nombre" /*RemoteObject*/ ,_nombre);
 BA.debugLineNum = 83;BA.debugLine="prod.PrecioUnitario = precioUnitario";
Debug.ShouldStop(262144);
_prod.setField ("_preciounitario" /*RemoteObject*/ ,_preciounitario);
 BA.debugLineNum = 84;BA.debugLine="prod.Stock = stock";
Debug.ShouldStop(524288);
_prod.setField ("_stock" /*RemoteObject*/ ,_stock);
 BA.debugLineNum = 85;BA.debugLine="prod.IVA = iva";
Debug.ShouldStop(1048576);
_prod.setField ("_iva" /*RemoteObject*/ ,_iva);
 BA.debugLineNum = 86;BA.debugLine="Return prod";
Debug.ShouldStop(2097152);
Debug.CheckDeviceExceptions();if (true) return _prod;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e12) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e12.toString()); BA.debugLineNum = 88;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8388608);
productos.__c.runVoidMethod ("LogImpl","12752523",BA.ObjectToString(productos.__c.runMethod(false,"LastException",__ref.runMethod(false,"getActivityBA"))),0);
 BA.debugLineNum = 89;BA.debugLine="Return Null";
Debug.ShouldStop(16777216);
if (true) return (productos.__c.getField(false,"Null"));
 };
 BA.debugLineNum = 91;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}