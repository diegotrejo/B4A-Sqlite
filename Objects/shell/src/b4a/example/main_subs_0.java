package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,26);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 26;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 27;BA.debugLine="Activity.LoadLayout(\"Layout\")";
Debug.ShouldStop(67108864);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Layout")),main.mostCurrent.activityBA);
 BA.debugLineNum = 28;BA.debugLine="prods.Initialize";
Debug.ShouldStop(134217728);
main._prods.runClassMethod (b4a.example.productos.class, "_initialize" /*RemoteObject*/ ,main.processBA);
 BA.debugLineNum = 29;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,35);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 35;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(4);
 BA.debugLineNum = 37;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,31);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_resume");}
 BA.debugLineNum = 31;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 33;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button1_click() throws Exception{
try {
		Debug.PushSubsStack("Button1_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,39);
if (RapidSub.canDelegate("button1_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","button1_click");}
RemoteObject _p = RemoteObject.declareNull("b4a.example.producto");
 BA.debugLineNum = 39;BA.debugLine="Sub Button1_Click";
Debug.ShouldStop(64);
 BA.debugLineNum = 41;BA.debugLine="Dim p As Producto = prods.Create(1, \"pan\", 0.12,";
Debug.ShouldStop(256);
_p = main._prods.runClassMethod (b4a.example.productos.class, "_create" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 1)),(Object)(BA.ObjectToString("pan")),(Object)(BA.numberCast(double.class, 0.12)),(Object)(BA.numberCast(double.class, 100)),(Object)(BA.numberCast(double.class, 0)));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 42;BA.debugLine="If p <> Null Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("N",_p)) { 
 BA.debugLineNum = 43;BA.debugLine="Log(\"--------------<  CREATE >-----------------\"";
Debug.ShouldStop(1024);
main.mostCurrent.__c.runVoidMethod ("LogImpl","1327684",RemoteObject.createImmutable("--------------<  CREATE >-----------------"),0);
 BA.debugLineNum = 44;BA.debugLine="Log( p.nombre )";
Debug.ShouldStop(2048);
main.mostCurrent.__c.runVoidMethod ("LogImpl","1327685",_p.getField(true,"_nombre" /*RemoteObject*/ ),0);
 BA.debugLineNum = 45;BA.debugLine="Log( p.PrecioUnitario )";
Debug.ShouldStop(4096);
main.mostCurrent.__c.runVoidMethod ("LogImpl","1327686",BA.NumberToString(_p.getField(true,"_preciounitario" /*RemoteObject*/ )),0);
 BA.debugLineNum = 46;BA.debugLine="Log( p.Stock )";
Debug.ShouldStop(8192);
main.mostCurrent.__c.runVoidMethod ("LogImpl","1327687",BA.NumberToString(_p.getField(true,"_stock" /*RemoteObject*/ )),0);
 };
 BA.debugLineNum = 49;BA.debugLine="p = prods.Read_ById(1)";
Debug.ShouldStop(65536);
_p = main._prods.runClassMethod (b4a.example.productos.class, "_read_byid" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("p", _p);
 BA.debugLineNum = 50;BA.debugLine="If p <> Null Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("N",_p)) { 
 BA.debugLineNum = 51;BA.debugLine="Log(\"---------------< READ BY ID 1 >------------";
Debug.ShouldStop(262144);
main.mostCurrent.__c.runVoidMethod ("LogImpl","1327692",RemoteObject.createImmutable("---------------< READ BY ID 1 >----------------"),0);
 BA.debugLineNum = 52;BA.debugLine="Log( p.nombre )";
Debug.ShouldStop(524288);
main.mostCurrent.__c.runVoidMethod ("LogImpl","1327693",_p.getField(true,"_nombre" /*RemoteObject*/ ),0);
 BA.debugLineNum = 53;BA.debugLine="Log( p.PrecioUnitario )";
Debug.ShouldStop(1048576);
main.mostCurrent.__c.runVoidMethod ("LogImpl","1327694",BA.NumberToString(_p.getField(true,"_preciounitario" /*RemoteObject*/ )),0);
 BA.debugLineNum = 54;BA.debugLine="Log( p.Stock )";
Debug.ShouldStop(2097152);
main.mostCurrent.__c.runVoidMethod ("LogImpl","1327695",BA.NumberToString(_p.getField(true,"_stock" /*RemoteObject*/ )),0);
 };
 BA.debugLineNum = 57;BA.debugLine="p.Nombre = \"pan centeno\"";
Debug.ShouldStop(16777216);
_p.setField ("_nombre" /*RemoteObject*/ ,BA.ObjectToString("pan centeno"));
 BA.debugLineNum = 58;BA.debugLine="p.PrecioUnitario = 0.22";
Debug.ShouldStop(33554432);
_p.setField ("_preciounitario" /*RemoteObject*/ ,BA.numberCast(double.class, 0.22));
 BA.debugLineNum = 59;BA.debugLine="p = prods.Update(p.Id, p.Nombre, p.PrecioUnitario";
Debug.ShouldStop(67108864);
_p = main._prods.runClassMethod (b4a.example.productos.class, "_update" /*RemoteObject*/ ,(Object)(_p.getField(true,"_id" /*RemoteObject*/ )),(Object)(_p.getField(true,"_nombre" /*RemoteObject*/ )),(Object)(_p.getField(true,"_preciounitario" /*RemoteObject*/ )),(Object)(_p.getField(true,"_stock" /*RemoteObject*/ )),(Object)(_p.getField(true,"_iva" /*RemoteObject*/ )));Debug.locals.put("p", _p);
 BA.debugLineNum = 60;BA.debugLine="If p <> Null Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("N",_p)) { 
 BA.debugLineNum = 61;BA.debugLine="Log(\"---------------< UPDATE >----------------\")";
Debug.ShouldStop(268435456);
main.mostCurrent.__c.runVoidMethod ("LogImpl","1327702",RemoteObject.createImmutable("---------------< UPDATE >----------------"),0);
 BA.debugLineNum = 62;BA.debugLine="Log( p.nombre )";
Debug.ShouldStop(536870912);
main.mostCurrent.__c.runVoidMethod ("LogImpl","1327703",_p.getField(true,"_nombre" /*RemoteObject*/ ),0);
 BA.debugLineNum = 63;BA.debugLine="Log( p.PrecioUnitario )";
Debug.ShouldStop(1073741824);
main.mostCurrent.__c.runVoidMethod ("LogImpl","1327704",BA.NumberToString(_p.getField(true,"_preciounitario" /*RemoteObject*/ )),0);
 BA.debugLineNum = 64;BA.debugLine="Log( p.Stock )";
Debug.ShouldStop(-2147483648);
main.mostCurrent.__c.runVoidMethod ("LogImpl","1327705",BA.NumberToString(_p.getField(true,"_stock" /*RemoteObject*/ )),0);
 };
 BA.debugLineNum = 67;BA.debugLine="If prods.Delete(1) Then";
Debug.ShouldStop(4);
if (main._prods.runClassMethod (b4a.example.productos.class, "_delete" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 1))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 68;BA.debugLine="Log(\"----- REGISTRO BORRADO OK -------\")";
Debug.ShouldStop(8);
main.mostCurrent.__c.runVoidMethod ("LogImpl","1327709",RemoteObject.createImmutable("----- REGISTRO BORRADO OK -------"),0);
 }else {
 BA.debugLineNum = 70;BA.debugLine="Log(\"----- REGISTRO NO BORRADO -------\")";
Debug.ShouldStop(32);
main.mostCurrent.__c.runVoidMethod ("LogImpl","1327711",RemoteObject.createImmutable("----- REGISTRO NO BORRADO -------"),0);
 };
 BA.debugLineNum = 73;BA.debugLine="xui.MsgboxAsync(\"Hello world!\", \"B4X\")";
Debug.ShouldStop(256);
main._xui.runVoidMethod ("MsgboxAsync",main.processBA,(Object)(BA.ObjectToCharSequence("Hello world!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("B4X"))));
 BA.debugLineNum = 74;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 22;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
starter_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4a.example.main");
starter.myClass = BA.getDeviceClass ("b4a.example.starter");
producto.myClass = BA.getDeviceClass ("b4a.example.producto");
productos.myClass = BA.getDeviceClass ("b4a.example.productos");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 18;BA.debugLine="Private xui As XUI";
main._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 19;BA.debugLine="Private prods As Productos   ' defino el objecto";
main._prods = RemoteObject.createNew ("b4a.example.productos");
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}