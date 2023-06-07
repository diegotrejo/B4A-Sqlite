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
public b4a.example.producto  _update(b4a.example.productos __ref,int _id,String _nombre,double _preciounitario,double _stock,double _iva) throws Exception{
__ref = this;
RDebugUtils.currentModule="productos";
if (Debug.shouldDelegate(ba, "update", false))
	 {return ((b4a.example.producto) Debug.delegate(ba, "update", new Object[] {_id,_nombre,_preciounitario,_stock,_iva}));}
b4a.example.producto _prod = null;
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Public Sub Update(id As Int, nombre As String, pre";
RDebugUtils.currentLine=1245185;
 //BA.debugLineNum = 1245185;BA.debugLine="Try";
try {RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="sql.ExecNonQuery2(\"UPDATE productos SET nombre =";
__ref._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2("UPDATE productos SET nombre = ?, precioUnitario = ?, stock = ?, iva = ? WHERE id = ?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_nombre),(Object)(_preciounitario),(Object)(_stock),(Object)(_iva),(Object)(_id)}));
RDebugUtils.currentLine=1245187;
 //BA.debugLineNum = 1245187;BA.debugLine="Dim prod As Producto : prod.initialize";
_prod = new b4a.example.producto();
RDebugUtils.currentLine=1245187;
 //BA.debugLineNum = 1245187;BA.debugLine="Dim prod As Producto : prod.initialize";
_prod._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=1245188;
 //BA.debugLineNum = 1245188;BA.debugLine="prod.Id = id";
_prod._id /*int*/  = _id;
RDebugUtils.currentLine=1245189;
 //BA.debugLineNum = 1245189;BA.debugLine="prod.Nombre =  nombre";
_prod._nombre /*String*/  = _nombre;
RDebugUtils.currentLine=1245190;
 //BA.debugLineNum = 1245190;BA.debugLine="prod.PrecioUnitario = precioUnitario";
_prod._preciounitario /*double*/  = _preciounitario;
RDebugUtils.currentLine=1245191;
 //BA.debugLineNum = 1245191;BA.debugLine="prod.Stock = stock";
_prod._stock /*double*/  = _stock;
RDebugUtils.currentLine=1245192;
 //BA.debugLineNum = 1245192;BA.debugLine="prod.IVA = iva";
_prod._iva /*double*/  = _iva;
RDebugUtils.currentLine=1245193;
 //BA.debugLineNum = 1245193;BA.debugLine="Return prod";
if (true) return _prod;
 } 
       catch (Exception e12) {
			ba.setLastException(e12);RDebugUtils.currentLine=1245195;
 //BA.debugLineNum = 1245195;BA.debugLine="Log(LastException)";
__c.LogImpl("71245195",BA.ObjectToString(__c.LastException(getActivityBA())),0);
RDebugUtils.currentLine=1245196;
 //BA.debugLineNum = 1245196;BA.debugLine="Return Null";
if (true) return (b4a.example.producto)(__c.Null);
 };
RDebugUtils.currentLine=1245198;
 //BA.debugLineNum = 1245198;BA.debugLine="End Sub";
return null;
}
public boolean  _delete(b4a.example.productos __ref,int _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="productos";
if (Debug.shouldDelegate(ba, "delete", false))
	 {return ((Boolean) Debug.delegate(ba, "delete", new Object[] {_id}));}
RDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Public Sub Delete( id As Int) As Boolean";
RDebugUtils.currentLine=1310721;
 //BA.debugLineNum = 1310721;BA.debugLine="Try";
try {RDebugUtils.currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="sql.ExecNonQuery2(\"DELETE FROM productos WHERE i";
__ref._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2("DELETE FROM productos WHERE id = ?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_id)}));
RDebugUtils.currentLine=1310723;
 //BA.debugLineNum = 1310723;BA.debugLine="Return True";
if (true) return __c.True;
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=1310725;
 //BA.debugLineNum = 1310725;BA.debugLine="Log(LastException)";
__c.LogImpl("71310725",BA.ObjectToString(__c.LastException(getActivityBA())),0);
RDebugUtils.currentLine=1310726;
 //BA.debugLineNum = 1310726;BA.debugLine="Return False";
if (true) return __c.False;
 };
RDebugUtils.currentLine=1310728;
 //BA.debugLineNum = 1310728;BA.debugLine="End Sub";
return false;
}
public b4a.example.producto  _create(b4a.example.productos __ref,int _id,String _nombre,double _preciounitario,double _stock,double _iva) throws Exception{
__ref = this;
RDebugUtils.currentModule="productos";
if (Debug.shouldDelegate(ba, "create", false))
	 {return ((b4a.example.producto) Debug.delegate(ba, "create", new Object[] {_id,_nombre,_preciounitario,_stock,_iva}));}
b4a.example.producto _producto = null;
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Public Sub Create(id As Int, nombre As String, pre";
RDebugUtils.currentLine=1048577;
 //BA.debugLineNum = 1048577;BA.debugLine="Try";
try {RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="sql.ExecNonQuery2(\"INSERT INTO productos VALUES";
__ref._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2("INSERT INTO productos VALUES (?, ?, ?, ?, ?)",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_id),(Object)(_nombre),(Object)(_preciounitario),(Object)(_stock),(Object)(_iva)}));
RDebugUtils.currentLine=1048580;
 //BA.debugLineNum = 1048580;BA.debugLine="Dim producto As Producto : producto.Initialize";
_producto = new b4a.example.producto();
RDebugUtils.currentLine=1048580;
 //BA.debugLineNum = 1048580;BA.debugLine="Dim producto As Producto : producto.Initialize";
_producto._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=1048582;
 //BA.debugLineNum = 1048582;BA.debugLine="producto.Id = id";
_producto._id /*int*/  = _id;
RDebugUtils.currentLine=1048583;
 //BA.debugLineNum = 1048583;BA.debugLine="producto.Nombre = nombre";
_producto._nombre /*String*/  = _nombre;
RDebugUtils.currentLine=1048584;
 //BA.debugLineNum = 1048584;BA.debugLine="producto.PrecioUnitario = precioUnitario";
_producto._preciounitario /*double*/  = _preciounitario;
RDebugUtils.currentLine=1048585;
 //BA.debugLineNum = 1048585;BA.debugLine="producto.Stock = stock";
_producto._stock /*double*/  = _stock;
RDebugUtils.currentLine=1048586;
 //BA.debugLineNum = 1048586;BA.debugLine="producto.iva = iva";
_producto._iva /*double*/  = _iva;
RDebugUtils.currentLine=1048587;
 //BA.debugLineNum = 1048587;BA.debugLine="Return producto";
if (true) return _producto;
 } 
       catch (Exception e12) {
			ba.setLastException(e12);RDebugUtils.currentLine=1048590;
 //BA.debugLineNum = 1048590;BA.debugLine="Log(LastException)";
__c.LogImpl("71048590",BA.ObjectToString(__c.LastException(getActivityBA())),0);
RDebugUtils.currentLine=1048591;
 //BA.debugLineNum = 1048591;BA.debugLine="Return Null";
if (true) return (b4a.example.producto)(__c.Null);
 };
RDebugUtils.currentLine=1048593;
 //BA.debugLineNum = 1048593;BA.debugLine="End Sub";
return null;
}
public b4a.example.producto  _read_byid(b4a.example.productos __ref,int _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="productos";
if (Debug.shouldDelegate(ba, "read_byid", false))
	 {return ((b4a.example.producto) Debug.delegate(ba, "read_byid", new Object[] {_id}));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cursor = null;
b4a.example.producto _prod = null;
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Public Sub Read_ById(id As Int) As Producto";
RDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="Try";
try {RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="Dim cursor As Cursor";
_cursor = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=1179651;
 //BA.debugLineNum = 1179651;BA.debugLine="cursor = sql.ExecQuery2(\"SELECT * FROM productos";
_cursor = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(__ref._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery2("SELECT * FROM productos WHERE id = ?",new String[]{BA.NumberToString(_id)})));
RDebugUtils.currentLine=1179652;
 //BA.debugLineNum = 1179652;BA.debugLine="If cursor.RowCount > 0 Then";
if (_cursor.getRowCount()>0) { 
RDebugUtils.currentLine=1179653;
 //BA.debugLineNum = 1179653;BA.debugLine="cursor.Position = 0";
_cursor.setPosition((int) (0));
RDebugUtils.currentLine=1179654;
 //BA.debugLineNum = 1179654;BA.debugLine="Dim prod As Producto : prod.initialize";
_prod = new b4a.example.producto();
RDebugUtils.currentLine=1179654;
 //BA.debugLineNum = 1179654;BA.debugLine="Dim prod As Producto : prod.initialize";
_prod._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=1179655;
 //BA.debugLineNum = 1179655;BA.debugLine="prod.Id = cursor.GetInt(\"id\")";
_prod._id /*int*/  = _cursor.GetInt("id");
RDebugUtils.currentLine=1179656;
 //BA.debugLineNum = 1179656;BA.debugLine="prod.Nombre = cursor.GetString(\"nombre\")";
_prod._nombre /*String*/  = _cursor.GetString("nombre");
RDebugUtils.currentLine=1179657;
 //BA.debugLineNum = 1179657;BA.debugLine="prod.PrecioUnitario = cursor.GetDouble(\"precioU";
_prod._preciounitario /*double*/  = _cursor.GetDouble("precioUnitario");
RDebugUtils.currentLine=1179658;
 //BA.debugLineNum = 1179658;BA.debugLine="prod.Stock = cursor.GetDouble(\"stock\")";
_prod._stock /*double*/  = _cursor.GetDouble("stock");
RDebugUtils.currentLine=1179659;
 //BA.debugLineNum = 1179659;BA.debugLine="prod.IVA = cursor.GetDouble(\"iva\")";
_prod._iva /*double*/  = _cursor.GetDouble("iva");
RDebugUtils.currentLine=1179660;
 //BA.debugLineNum = 1179660;BA.debugLine="Return prod";
if (true) return _prod;
 }else {
RDebugUtils.currentLine=1179662;
 //BA.debugLineNum = 1179662;BA.debugLine="Return Null";
if (true) return (b4a.example.producto)(__c.Null);
 };
 } 
       catch (Exception e18) {
			ba.setLastException(e18);RDebugUtils.currentLine=1179666;
 //BA.debugLineNum = 1179666;BA.debugLine="Log(LastException)";
__c.LogImpl("71179666",BA.ObjectToString(__c.LastException(getActivityBA())),0);
RDebugUtils.currentLine=1179667;
 //BA.debugLineNum = 1179667;BA.debugLine="Return Null";
if (true) return (b4a.example.producto)(__c.Null);
 };
RDebugUtils.currentLine=1179669;
 //BA.debugLineNum = 1179669;BA.debugLine="End Sub";
return null;
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
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Public Sub Read_All() As List";
RDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="Dim res As List : res.initialize";
_res = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="Dim res As List : res.initialize";
_res.Initialize();
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="Try";
try {RDebugUtils.currentLine=1114116;
 //BA.debugLineNum = 1114116;BA.debugLine="Dim cursor As Cursor";
_cursor = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=1114117;
 //BA.debugLineNum = 1114117;BA.debugLine="cursor = sql.ExecQuery(\"SELECT * FROM productos";
_cursor = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(__ref._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM productos ORDER BY nombre")));
RDebugUtils.currentLine=1114118;
 //BA.debugLineNum = 1114118;BA.debugLine="For i = 0 To cursor.RowCount -1";
{
final int step6 = 1;
final int limit6 = (int) (_cursor.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
RDebugUtils.currentLine=1114119;
 //BA.debugLineNum = 1114119;BA.debugLine="cursor.Position = i";
_cursor.setPosition(_i);
RDebugUtils.currentLine=1114120;
 //BA.debugLineNum = 1114120;BA.debugLine="Dim prod As Producto : prod.initialize";
_prod = new b4a.example.producto();
RDebugUtils.currentLine=1114120;
 //BA.debugLineNum = 1114120;BA.debugLine="Dim prod As Producto : prod.initialize";
_prod._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=1114121;
 //BA.debugLineNum = 1114121;BA.debugLine="prod.Id = cursor.GetInt(\"id\")";
_prod._id /*int*/  = _cursor.GetInt("id");
RDebugUtils.currentLine=1114122;
 //BA.debugLineNum = 1114122;BA.debugLine="prod.Nombre = cursor.GetString(\"nombre\")";
_prod._nombre /*String*/  = _cursor.GetString("nombre");
RDebugUtils.currentLine=1114123;
 //BA.debugLineNum = 1114123;BA.debugLine="prod.PrecioUnitario = cursor.GetDouble(\"precioU";
_prod._preciounitario /*double*/  = _cursor.GetDouble("precioUnitario");
RDebugUtils.currentLine=1114124;
 //BA.debugLineNum = 1114124;BA.debugLine="prod.Stock = cursor.GetDouble(\"stock\")";
_prod._stock /*double*/  = _cursor.GetDouble("stock");
RDebugUtils.currentLine=1114125;
 //BA.debugLineNum = 1114125;BA.debugLine="prod.IVA = cursor.GetDouble(\"iva\")";
_prod._iva /*double*/  = _cursor.GetDouble("iva");
RDebugUtils.currentLine=1114126;
 //BA.debugLineNum = 1114126;BA.debugLine="res.Add(prod)";
_res.Add((Object)(_prod));
 }
};
 } 
       catch (Exception e18) {
			ba.setLastException(e18);RDebugUtils.currentLine=1114130;
 //BA.debugLineNum = 1114130;BA.debugLine="Log(LastException)";
__c.LogImpl("71114130",BA.ObjectToString(__c.LastException(getActivityBA())),0);
 };
RDebugUtils.currentLine=1114133;
 //BA.debugLineNum = 1114133;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=1114134;
 //BA.debugLineNum = 1114134;BA.debugLine="End Sub";
return null;
}
}