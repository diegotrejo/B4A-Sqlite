package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class producto_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Public Id As Int";
producto._id = RemoteObject.createImmutable(0);__ref.setField("_id",producto._id);
 //BA.debugLineNum = 3;BA.debugLine="Public Nombre As String";
producto._nombre = RemoteObject.createImmutable("");__ref.setField("_nombre",producto._nombre);
 //BA.debugLineNum = 4;BA.debugLine="Public PrecioUnitario As Double";
producto._preciounitario = RemoteObject.createImmutable(0);__ref.setField("_preciounitario",producto._preciounitario);
 //BA.debugLineNum = 5;BA.debugLine="Public Stock As Double";
producto._stock = RemoteObject.createImmutable(0);__ref.setField("_stock",producto._stock);
 //BA.debugLineNum = 6;BA.debugLine="Public IVA as Double";
producto._iva = RemoteObject.createImmutable(0);__ref.setField("_iva",producto._iva);
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (producto) ","producto",2,__ref.getField(false, "ba"),__ref,10);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "producto","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(512);
 BA.debugLineNum = 12;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}