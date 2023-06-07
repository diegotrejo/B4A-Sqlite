package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class productos extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.productos");
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

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.sql.SQL _sql = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public String  _initialize(b4a.example.productos __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="productos";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=983041;
 //BA.debugLineNum = 983041;BA.debugLine="sql.Initialize(File.DirInternal, \"tienda.db\", Tru";
__ref._sql /*anywheresoftware.b4a.sql.SQL*/ .Initialize(__c.File.getDirInternal(),"tienda.db",__c.True);
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="sql.ExecNonQuery(\"CREATE TABLE IF NOT EXISTS prod";
__ref._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("CREATE TABLE IF NOT EXISTS productos( id int primary key, nombre text(50), precioUnitario number(10,3), stock number(10,3), iva number(7,3))");
RDebugUtils.currentLine=983043;
 //BA.debugLineNum = 983043;BA.debugLine="End Sub";
return "";
}
public b4a.example.producto  _create(b4a.example.productos __ref,int _id,String _nombre,double _preciounitario,double _stock,double _iva) throws Exception{
__ref = this;
RDebugUtils.currentModule="productos";
if (Debug.shouldDelegate(ba, "create", false))
	 {return ((b4a.example.producto) Debug.delegate(ba, "create", new Object[] {_id,_nombre,_preciounitario,_stock,_iva}));}
b4a.example.producto _producto = null;
RDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Public Sub Create(id As Int, nombre As String, pre";
RDebugUtils.currentLine=1441793;
 //BA.debugLineNum = 1441793;BA.debugLine="Try";
try {RDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="sql.ExecNonQuery2(\"INSERT INTO productos VALUES";
__ref._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2("INSERT INTO productos VALUES (?, ?, ?, ?, ?)",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_id),(Object)(_nombre),(Object)(_preciounitario),(Object)(_stock),(Object)(_iva)}));
RDebugUtils.currentLine=1441796;
 //BA.debugLineNum = 1441796;BA.debugLine="Dim producto As Producto : producto.Initialize";
_producto = new b4a.example.producto();
RDebugUtils.currentLine=1441796;
 //BA.debugLineNum = 1441796;BA.debugLine="Dim producto As Producto : producto.Initialize";
_producto._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=1441798;
 //BA.debugLineNum = 1441798;BA.debugLine="producto.Id = id";
_producto._id /*int*/  = _id;
RDebugUtils.currentLine=1441799;
 //BA.debugLineNum = 1441799;BA.debugLine="producto.Nombre = nombre";
_producto._nombre /*String*/  = _nombre;
RDebugUtils.currentLine=1441800;
 //BA.debugLineNum = 1441800;BA.debugLine="producto.PrecioUnitario = precioUnitario";
_producto._preciounitario /*double*/  = _preciounitario;
RDebugUtils.currentLine=1441801;
 //BA.debugLineNum = 1441801;BA.debugLine="producto.Stock = stock";
_producto._stock /*double*/  = _stock;
RDebugUtils.currentLine=1441802;
 //BA.debugLineNum = 1441802;BA.debugLine="producto.iva = iva";
_producto._iva /*double*/  = _iva;
RDebugUtils.currentLine=1441803;
 //BA.debugLineNum = 1441803;BA.debugLine="Return producto";
if (true) return _producto;
 } 
       catch (Exception e12) {
			ba.setLastException(e12);RDebugUtils.currentLine=1441806;
 //BA.debugLineNum = 1441806;BA.debugLine="Log(LastException)";
__c.LogImpl("11441806",BA.ObjectToString(__c.LastException(getActivityBA())),0);
RDebugUtils.currentLine=1441807;
 //BA.debugLineNum = 1441807;BA.debugLine="Return Null";
if (true) return (b4a.example.producto)(__c.Null);
 };
RDebugUtils.currentLine=1441809;
 //BA.debugLineNum = 1441809;BA.debugLine="End Sub";
return null;
}
public b4a.example.producto  _read_byid(b4a.example.productos __ref,int _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="productos";
if (Debug.shouldDelegate(ba, "read_byid", false))
	 {return ((b4a.example.producto) Debug.delegate(ba, "read_byid", new Object[] {_id}));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cursor = null;
b4a.example.producto _prod = null;
RDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="Public Sub Read_ById(id As Int) As Producto";
RDebugUtils.currentLine=2228225;
 //BA.debugLineNum = 2228225;BA.debugLine="Try";
try {RDebugUtils.currentLine=2228226;
 //BA.debugLineNum = 2228226;BA.debugLine="Dim cursor As Cursor";
_cursor = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=2228227;
 //BA.debugLineNum = 2228227;BA.debugLine="cursor = sql.ExecQuery2(\"SELECT * FROM productos";
_cursor = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(__ref._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery2("SELECT * FROM productos WHERE id = ?",new String[]{BA.NumberToString(_id)})));
RDebugUtils.currentLine=2228228;
 //BA.debugLineNum = 2228228;BA.debugLine="If cursor.RowCount > 0 Then";
if (_cursor.getRowCount()>0) { 
RDebugUtils.currentLine=2228229;
 //BA.debugLineNum = 2228229;BA.debugLine="cursor.Position = 0";
_cursor.setPosition((int) (0));
RDebugUtils.currentLine=2228230;
 //BA.debugLineNum = 2228230;BA.debugLine="Dim prod As Producto : prod.initialize";
_prod = new b4a.example.producto();
RDebugUtils.currentLine=2228230;
 //BA.debugLineNum = 2228230;BA.debugLine="Dim prod As Producto : prod.initialize";
_prod._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=2228231;
 //BA.debugLineNum = 2228231;BA.debugLine="prod.Id = cursor.GetInt(\"id\")";
_prod._id /*int*/  = _cursor.GetInt("id");
RDebugUtils.currentLine=2228232;
 //BA.debugLineNum = 2228232;BA.debugLine="prod.Nombre = cursor.GetString(\"nombre\")";
_prod._nombre /*String*/  = _cursor.GetString("nombre");
RDebugUtils.currentLine=2228233;
 //BA.debugLineNum = 2228233;BA.debugLine="prod.PrecioUnitario = cursor.GetDouble(\"precioU";
_prod._preciounitario /*double*/  = _cursor.GetDouble("precioUnitario");
RDebugUtils.currentLine=2228234;
 //BA.debugLineNum = 2228234;BA.debugLine="prod.Stock = cursor.GetDouble(\"stock\")";
_prod._stock /*double*/  = _cursor.GetDouble("stock");
RDebugUtils.currentLine=2228235;
 //BA.debugLineNum = 2228235;BA.debugLine="prod.IVA = cursor.GetDouble(\"iva\")";
_prod._iva /*double*/  = _cursor.GetDouble("iva");
RDebugUtils.currentLine=2228236;
 //BA.debugLineNum = 2228236;BA.debugLine="Return prod";
if (true) return _prod;
 }else {
RDebugUtils.currentLine=2228238;
 //BA.debugLineNum = 2228238;BA.debugLine="Return Null";
if (true) return (b4a.example.producto)(__c.Null);
 };
 } 
       catch (Exception e18) {
			ba.setLastException(e18);RDebugUtils.currentLine=2228242;
 //BA.debugLineNum = 2228242;BA.debugLine="Log(LastException)";
__c.LogImpl("12228242",BA.ObjectToString(__c.LastException(getActivityBA())),0);
RDebugUtils.currentLine=2228243;
 //BA.debugLineNum = 2228243;BA.debugLine="Return Null";
if (true) return (b4a.example.producto)(__c.Null);
 };
RDebugUtils.currentLine=2228245;
 //BA.debugLineNum = 2228245;BA.debugLine="End Sub";
return null;
}
public b4a.example.producto  _update(b4a.example.productos __ref,int _id,String _nombre,double _preciounitario,double _stock,double _iva) throws Exception{
__ref = this;
RDebugUtils.currentModule="productos";
if (Debug.shouldDelegate(ba, "update", false))
	 {return ((b4a.example.producto) Debug.delegate(ba, "update", new Object[] {_id,_nombre,_preciounitario,_stock,_iva}));}
b4a.example.producto _prod = null;
RDebugUtils.currentLine=2752512;
 //BA.debugLineNum = 2752512;BA.debugLine="Public Sub Update(id As Int, nombre As String, pre";
RDebugUtils.currentLine=2752513;
 //BA.debugLineNum = 2752513;BA.debugLine="Try";
try {RDebugUtils.currentLine=2752514;
 //BA.debugLineNum = 2752514;BA.debugLine="sql.ExecNonQuery2(\"UPDATE productos SET nombre =";
__ref._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2("UPDATE productos SET nombre = ?, precioUnitario = ?, stock = ?, iva = ? WHERE id = ?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_nombre),(Object)(_preciounitario),(Object)(_stock),(Object)(_iva),(Object)(_id)}));
RDebugUtils.currentLine=2752515;
 //BA.debugLineNum = 2752515;BA.debugLine="Dim prod As Producto : prod.initialize";
_prod = new b4a.example.producto();
RDebugUtils.currentLine=2752515;
 //BA.debugLineNum = 2752515;BA.debugLine="Dim prod As Producto : prod.initialize";
_prod._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=2752516;
 //BA.debugLineNum = 2752516;BA.debugLine="prod.Id = id";
_prod._id /*int*/  = _id;
RDebugUtils.currentLine=2752517;
 //BA.debugLineNum = 2752517;BA.debugLine="prod.Nombre =  nombre";
_prod._nombre /*String*/  = _nombre;
RDebugUtils.currentLine=2752518;
 //BA.debugLineNum = 2752518;BA.debugLine="prod.PrecioUnitario = precioUnitario";
_prod._preciounitario /*double*/  = _preciounitario;
RDebugUtils.currentLine=2752519;
 //BA.debugLineNum = 2752519;BA.debugLine="prod.Stock = stock";
_prod._stock /*double*/  = _stock;
RDebugUtils.currentLine=2752520;
 //BA.debugLineNum = 2752520;BA.debugLine="prod.IVA = iva";
_prod._iva /*double*/  = _iva;
RDebugUtils.currentLine=2752521;
 //BA.debugLineNum = 2752521;BA.debugLine="Return prod";
if (true) return _prod;
 } 
       catch (Exception e12) {
			ba.setLastException(e12);RDebugUtils.currentLine=2752523;
 //BA.debugLineNum = 2752523;BA.debugLine="Log(LastException)";
__c.LogImpl("12752523",BA.ObjectToString(__c.LastException(getActivityBA())),0);
RDebugUtils.currentLine=2752524;
 //BA.debugLineNum = 2752524;BA.debugLine="Return Null";
if (true) return (b4a.example.producto)(__c.Null);
 };
RDebugUtils.currentLine=2752526;
 //BA.debugLineNum = 2752526;BA.debugLine="End Sub";
return null;
}
public boolean  _delete(b4a.example.productos __ref,int _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="productos";
if (Debug.shouldDelegate(ba, "delete", false))
	 {return ((Boolean) Debug.delegate(ba, "delete", new Object[] {_id}));}
RDebugUtils.currentLine=3145728;
 //BA.debugLineNum = 3145728;BA.debugLine="Public Sub Delete( id As Int) As Boolean";
RDebugUtils.currentLine=3145729;
 //BA.debugLineNum = 3145729;BA.debugLine="Try";
try {RDebugUtils.currentLine=3145730;
 //BA.debugLineNum = 3145730;BA.debugLine="sql.ExecNonQuery2(\"DELETE FROM productos WHERE i";
__ref._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2("DELETE FROM productos WHERE id = ?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_id)}));
RDebugUtils.currentLine=3145731;
 //BA.debugLineNum = 3145731;BA.debugLine="Return True";
if (true) return __c.True;
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=3145733;
 //BA.debugLineNum = 3145733;BA.debugLine="Log(LastException)";
__c.LogImpl("13145733",BA.ObjectToString(__c.LastException(getActivityBA())),0);
RDebugUtils.currentLine=3145734;
 //BA.debugLineNum = 3145734;BA.debugLine="Return False";
if (true) return __c.False;
 };
RDebugUtils.currentLine=3145736;
 //BA.debugLineNum = 3145736;BA.debugLine="End Sub";
return false;
}
public String  _class_globals(b4a.example.productos __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="productos";
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="Private sql As SQL";
_sql = new anywheresoftware.b4a.sql.SQL();
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _read_all(b4a.example.productos __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="productos";
if (Debug.shouldDelegate(ba, "read_all", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "read_all", null));}
anywheresoftware.b4a.objects.collections.List _res = null;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cursor = null;
int _i = 0;
b4a.example.producto _prod = null;
RDebugUtils.currentLine=1966080;
 //BA.debugLineNum = 1966080;BA.debugLine="Public Sub Read_All() As List";
RDebugUtils.currentLine=1966081;
 //BA.debugLineNum = 1966081;BA.debugLine="Dim res As List : res.initialize";
_res = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=1966081;
 //BA.debugLineNum = 1966081;BA.debugLine="Dim res As List : res.initialize";
_res.Initialize();
RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="Try";
try {RDebugUtils.currentLine=1966084;
 //BA.debugLineNum = 1966084;BA.debugLine="Dim cursor As Cursor";
_cursor = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=1966085;
 //BA.debugLineNum = 1966085;BA.debugLine="cursor = sql.ExecQuery(\"SELECT * FROM productos";
_cursor = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(__ref._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM productos ORDER BY nombre")));
RDebugUtils.currentLine=1966086;
 //BA.debugLineNum = 1966086;BA.debugLine="For i = 0 To cursor.RowCount -1";
{
final int step6 = 1;
final int limit6 = (int) (_cursor.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
RDebugUtils.currentLine=1966087;
 //BA.debugLineNum = 1966087;BA.debugLine="cursor.Position = i";
_cursor.setPosition(_i);
RDebugUtils.currentLine=1966088;
 //BA.debugLineNum = 1966088;BA.debugLine="Dim prod As Producto : prod.initialize";
_prod = new b4a.example.producto();
RDebugUtils.currentLine=1966088;
 //BA.debugLineNum = 1966088;BA.debugLine="Dim prod As Producto : prod.initialize";
_prod._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=1966089;
 //BA.debugLineNum = 1966089;BA.debugLine="prod.Id = cursor.GetInt(\"id\")";
_prod._id /*int*/  = _cursor.GetInt("id");
RDebugUtils.currentLine=1966090;
 //BA.debugLineNum = 1966090;BA.debugLine="prod.Nombre = cursor.GetString(\"nombre\")";
_prod._nombre /*String*/  = _cursor.GetString("nombre");
RDebugUtils.currentLine=1966091;
 //BA.debugLineNum = 1966091;BA.debugLine="prod.PrecioUnitario = cursor.GetDouble(\"precioU";
_prod._preciounitario /*double*/  = _cursor.GetDouble("precioUnitario");
RDebugUtils.currentLine=1966092;
 //BA.debugLineNum = 1966092;BA.debugLine="prod.Stock = cursor.GetDouble(\"stock\")";
_prod._stock /*double*/  = _cursor.GetDouble("stock");
RDebugUtils.currentLine=1966093;
 //BA.debugLineNum = 1966093;BA.debugLine="prod.IVA = cursor.GetDouble(\"iva\")";
_prod._iva /*double*/  = _cursor.GetDouble("iva");
RDebugUtils.currentLine=1966094;
 //BA.debugLineNum = 1966094;BA.debugLine="res.Add(prod)";
_res.Add((Object)(_prod));
 }
};
 } 
       catch (Exception e18) {
			ba.setLastException(e18);RDebugUtils.currentLine=1966098;
 //BA.debugLineNum = 1966098;BA.debugLine="Log(LastException)";
__c.LogImpl("11966098",BA.ObjectToString(__c.LastException(getActivityBA())),0);
 };
RDebugUtils.currentLine=1966101;
 //BA.debugLineNum = 1966101;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=1966102;
 //BA.debugLineNum = 1966102;BA.debugLine="End Sub";
return null;
}
}