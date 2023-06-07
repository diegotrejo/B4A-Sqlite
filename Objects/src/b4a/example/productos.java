package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class productos extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.productos");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.productos.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.sql.SQL _sql = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private sql As SQL";
_sql = new anywheresoftware.b4a.sql.SQL();
 //BA.debugLineNum = 3;BA.debugLine="End Sub";
return "";
}
public b4a.example.producto  _create(int _id,String _nombre,double _preciounitario,double _stock,double _iva) throws Exception{
b4a.example.producto _producto = null;
 //BA.debugLineNum = 11;BA.debugLine="Public Sub Create(id As Int, nombre As String, pre";
 //BA.debugLineNum = 12;BA.debugLine="Try";
try { //BA.debugLineNum = 13;BA.debugLine="sql.ExecNonQuery2(\"INSERT INTO productos VALUES";
_sql.ExecNonQuery2("INSERT INTO productos VALUES (?, ?, ?, ?, ?)",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_id),(Object)(_nombre),(Object)(_preciounitario),(Object)(_stock),(Object)(_iva)}));
 //BA.debugLineNum = 15;BA.debugLine="Dim producto As Producto : producto.Initialize";
_producto = new b4a.example.producto();
 //BA.debugLineNum = 15;BA.debugLine="Dim producto As Producto : producto.Initialize";
_producto._initialize /*String*/ (ba);
 //BA.debugLineNum = 17;BA.debugLine="producto.Id = id";
_producto._id /*int*/  = _id;
 //BA.debugLineNum = 18;BA.debugLine="producto.Nombre = nombre";
_producto._nombre /*String*/  = _nombre;
 //BA.debugLineNum = 19;BA.debugLine="producto.PrecioUnitario = precioUnitario";
_producto._preciounitario /*double*/  = _preciounitario;
 //BA.debugLineNum = 20;BA.debugLine="producto.Stock = stock";
_producto._stock /*double*/  = _stock;
 //BA.debugLineNum = 21;BA.debugLine="producto.iva = iva";
_producto._iva /*double*/  = _iva;
 //BA.debugLineNum = 22;BA.debugLine="Return producto";
if (true) return _producto;
 } 
       catch (Exception e12) {
			ba.setLastException(e12); //BA.debugLineNum = 25;BA.debugLine="Log(LastException)";
__c.LogImpl("81048590",BA.ObjectToString(__c.LastException(getActivityBA())),0);
 //BA.debugLineNum = 26;BA.debugLine="Return Null";
if (true) return (b4a.example.producto)(__c.Null);
 };
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return null;
}
public boolean  _delete(int _id) throws Exception{
 //BA.debugLineNum = 93;BA.debugLine="Public Sub Delete( id As Int) As Boolean";
 //BA.debugLineNum = 94;BA.debugLine="Try";
try { //BA.debugLineNum = 95;BA.debugLine="sql.ExecNonQuery2(\"DELETE FROM productos WHERE i";
_sql.ExecNonQuery2("DELETE FROM productos WHERE id = ?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_id)}));
 //BA.debugLineNum = 96;BA.debugLine="Return True";
if (true) return __c.True;
 } 
       catch (Exception e5) {
			ba.setLastException(e5); //BA.debugLineNum = 98;BA.debugLine="Log(LastException)";
__c.LogImpl("81310725",BA.ObjectToString(__c.LastException(getActivityBA())),0);
 //BA.debugLineNum = 99;BA.debugLine="Return False";
if (true) return __c.False;
 };
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return false;
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 6;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 7;BA.debugLine="sql.Initialize(File.DirInternal, \"tienda.db\", Tru";
_sql.Initialize(__c.File.getDirInternal(),"tienda.db",__c.True);
 //BA.debugLineNum = 8;BA.debugLine="sql.ExecNonQuery(\"CREATE TABLE IF NOT EXISTS prod";
_sql.ExecNonQuery("CREATE TABLE IF NOT EXISTS productos( id int primary key, nombre text(50), precioUnitario number(10,3), stock number(10,3), iva number(7,3))");
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _read_all() throws Exception{
anywheresoftware.b4a.objects.collections.List _res = null;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cursor = null;
int _i = 0;
b4a.example.producto _prod = null;
 //BA.debugLineNum = 30;BA.debugLine="Public Sub Read_All() As List";
 //BA.debugLineNum = 31;BA.debugLine="Dim res As List : res.initialize";
_res = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 31;BA.debugLine="Dim res As List : res.initialize";
_res.Initialize();
 //BA.debugLineNum = 32;BA.debugLine="Try";
try { //BA.debugLineNum = 34;BA.debugLine="Dim cursor As Cursor";
_cursor = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
 //BA.debugLineNum = 35;BA.debugLine="cursor = sql.ExecQuery(\"SELECT * FROM productos";
_cursor = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(_sql.ExecQuery("SELECT * FROM productos ORDER BY nombre")));
 //BA.debugLineNum = 36;BA.debugLine="For i = 0 To cursor.RowCount -1";
{
final int step6 = 1;
final int limit6 = (int) (_cursor.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
 //BA.debugLineNum = 37;BA.debugLine="cursor.Position = i";
_cursor.setPosition(_i);
 //BA.debugLineNum = 38;BA.debugLine="Dim prod As Producto : prod.initialize";
_prod = new b4a.example.producto();
 //BA.debugLineNum = 38;BA.debugLine="Dim prod As Producto : prod.initialize";
_prod._initialize /*String*/ (ba);
 //BA.debugLineNum = 39;BA.debugLine="prod.Id = cursor.GetInt(\"id\")";
_prod._id /*int*/  = _cursor.GetInt("id");
 //BA.debugLineNum = 40;BA.debugLine="prod.Nombre = cursor.GetString(\"nombre\")";
_prod._nombre /*String*/  = _cursor.GetString("nombre");
 //BA.debugLineNum = 41;BA.debugLine="prod.PrecioUnitario = cursor.GetDouble(\"precioU";
_prod._preciounitario /*double*/  = _cursor.GetDouble("precioUnitario");
 //BA.debugLineNum = 42;BA.debugLine="prod.Stock = cursor.GetDouble(\"stock\")";
_prod._stock /*double*/  = _cursor.GetDouble("stock");
 //BA.debugLineNum = 43;BA.debugLine="prod.IVA = cursor.GetDouble(\"iva\")";
_prod._iva /*double*/  = _cursor.GetDouble("iva");
 //BA.debugLineNum = 44;BA.debugLine="res.Add(prod)";
_res.Add((Object)(_prod));
 }
};
 } 
       catch (Exception e18) {
			ba.setLastException(e18); //BA.debugLineNum = 48;BA.debugLine="Log(LastException)";
__c.LogImpl("81114130",BA.ObjectToString(__c.LastException(getActivityBA())),0);
 };
 //BA.debugLineNum = 51;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return null;
}
public b4a.example.producto  _read_byid(int _id) throws Exception{
anywheresoftware.b4a.sql.SQL.CursorWrapper _cursor = null;
b4a.example.producto _prod = null;
 //BA.debugLineNum = 54;BA.debugLine="Public Sub Read_ById(id As Int) As Producto";
 //BA.debugLineNum = 55;BA.debugLine="Try";
try { //BA.debugLineNum = 56;BA.debugLine="Dim cursor As Cursor";
_cursor = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
 //BA.debugLineNum = 57;BA.debugLine="cursor = sql.ExecQuery2(\"SELECT * FROM productos";
_cursor = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(_sql.ExecQuery2("SELECT * FROM productos WHERE id = ?",new String[]{BA.NumberToString(_id)})));
 //BA.debugLineNum = 58;BA.debugLine="If cursor.RowCount > 0 Then";
if (_cursor.getRowCount()>0) { 
 //BA.debugLineNum = 59;BA.debugLine="cursor.Position = 0";
_cursor.setPosition((int) (0));
 //BA.debugLineNum = 60;BA.debugLine="Dim prod As Producto : prod.initialize";
_prod = new b4a.example.producto();
 //BA.debugLineNum = 60;BA.debugLine="Dim prod As Producto : prod.initialize";
_prod._initialize /*String*/ (ba);
 //BA.debugLineNum = 61;BA.debugLine="prod.Id = cursor.GetInt(\"id\")";
_prod._id /*int*/  = _cursor.GetInt("id");
 //BA.debugLineNum = 62;BA.debugLine="prod.Nombre = cursor.GetString(\"nombre\")";
_prod._nombre /*String*/  = _cursor.GetString("nombre");
 //BA.debugLineNum = 63;BA.debugLine="prod.PrecioUnitario = cursor.GetDouble(\"precioU";
_prod._preciounitario /*double*/  = _cursor.GetDouble("precioUnitario");
 //BA.debugLineNum = 64;BA.debugLine="prod.Stock = cursor.GetDouble(\"stock\")";
_prod._stock /*double*/  = _cursor.GetDouble("stock");
 //BA.debugLineNum = 65;BA.debugLine="prod.IVA = cursor.GetDouble(\"iva\")";
_prod._iva /*double*/  = _cursor.GetDouble("iva");
 //BA.debugLineNum = 66;BA.debugLine="Return prod";
if (true) return _prod;
 }else {
 //BA.debugLineNum = 68;BA.debugLine="Return Null";
if (true) return (b4a.example.producto)(__c.Null);
 };
 } 
       catch (Exception e18) {
			ba.setLastException(e18); //BA.debugLineNum = 72;BA.debugLine="Log(LastException)";
__c.LogImpl("81179666",BA.ObjectToString(__c.LastException(getActivityBA())),0);
 //BA.debugLineNum = 73;BA.debugLine="Return Null";
if (true) return (b4a.example.producto)(__c.Null);
 };
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return null;
}
public b4a.example.producto  _update(int _id,String _nombre,double _preciounitario,double _stock,double _iva) throws Exception{
b4a.example.producto _prod = null;
 //BA.debugLineNum = 77;BA.debugLine="Public Sub Update(id As Int, nombre As String, pre";
 //BA.debugLineNum = 78;BA.debugLine="Try";
try { //BA.debugLineNum = 79;BA.debugLine="sql.ExecNonQuery2(\"UPDATE productos SET nombre =";
_sql.ExecNonQuery2("UPDATE productos SET nombre = ?, precioUnitario = ?, stock = ?, iva = ? WHERE id = ?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_nombre),(Object)(_preciounitario),(Object)(_stock),(Object)(_iva),(Object)(_id)}));
 //BA.debugLineNum = 80;BA.debugLine="Dim prod As Producto : prod.initialize";
_prod = new b4a.example.producto();
 //BA.debugLineNum = 80;BA.debugLine="Dim prod As Producto : prod.initialize";
_prod._initialize /*String*/ (ba);
 //BA.debugLineNum = 81;BA.debugLine="prod.Id = id";
_prod._id /*int*/  = _id;
 //BA.debugLineNum = 82;BA.debugLine="prod.Nombre =  nombre";
_prod._nombre /*String*/  = _nombre;
 //BA.debugLineNum = 83;BA.debugLine="prod.PrecioUnitario = precioUnitario";
_prod._preciounitario /*double*/  = _preciounitario;
 //BA.debugLineNum = 84;BA.debugLine="prod.Stock = stock";
_prod._stock /*double*/  = _stock;
 //BA.debugLineNum = 85;BA.debugLine="prod.IVA = iva";
_prod._iva /*double*/  = _iva;
 //BA.debugLineNum = 86;BA.debugLine="Return prod";
if (true) return _prod;
 } 
       catch (Exception e12) {
			ba.setLastException(e12); //BA.debugLineNum = 88;BA.debugLine="Log(LastException)";
__c.LogImpl("81245195",BA.ObjectToString(__c.LastException(getActivityBA())),0);
 //BA.debugLineNum = 89;BA.debugLine="Return Null";
if (true) return (b4a.example.producto)(__c.Null);
 };
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
