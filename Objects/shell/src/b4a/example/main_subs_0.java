package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,31);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 31;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 32;BA.debugLine="Activity.LoadLayout(\"Layout\")";
Debug.ShouldStop(-2147483648);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Layout")),main.mostCurrent.activityBA);
 BA.debugLineNum = 33;BA.debugLine="prods.Initialize";
Debug.ShouldStop(1);
main._prods.runClassMethod (b4a.example.productos.class, "_initialize" /*RemoteObject*/ ,main.processBA);
 BA.debugLineNum = 34;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,40);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 40;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(128);
 BA.debugLineNum = 42;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,36);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_resume");}
 BA.debugLineNum = 36;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(8);
 BA.debugLineNum = 38;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
		Debug.PushSubsStack("Button1_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,44);
if (RapidSub.canDelegate("button1_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","button1_click");}
 BA.debugLineNum = 44;BA.debugLine="Sub Button1_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 78;BA.debugLine="xui.MsgboxAsync(\"Hello world!\", \"B4X\")";
Debug.ShouldStop(8192);
main._xui.runVoidMethod ("MsgboxAsync",main.processBA,(Object)(BA.ObjectToCharSequence("Hello world!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("B4X"))));
 BA.debugLineNum = 79;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cmdactualziar_click() throws Exception{
try {
		Debug.PushSubsStack("cmdActualziar_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,110);
if (RapidSub.canDelegate("cmdactualziar_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","cmdactualziar_click");}
RemoteObject _p = RemoteObject.declareNull("b4a.example.producto");
 BA.debugLineNum = 110;BA.debugLine="Private Sub cmdActualziar_Click";
Debug.ShouldStop(8192);
 BA.debugLineNum = 111;BA.debugLine="Dim p As Producto = prods.Update(txtId.Text, txtN";
Debug.ShouldStop(16384);
_p = main._prods.runClassMethod (b4a.example.productos.class, "_update" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, main.mostCurrent._txtid.runMethod(true,"getText"))),(Object)(main.mostCurrent._txtnombre.runMethod(true,"getText")),(Object)(BA.numberCast(double.class, main.mostCurrent._txtpreciounitario.runMethod(true,"getText"))),(Object)(BA.numberCast(double.class, main.mostCurrent._txtstock.runMethod(true,"getText"))),(Object)(BA.numberCast(double.class, main.mostCurrent._txtiva.runMethod(true,"getText"))));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 112;BA.debugLine="If p <> Null Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("N",_p)) { 
 BA.debugLineNum = 113;BA.debugLine="Msgbox(\"REGISTRO ACTUALZIADO OK\",\"\")";
Debug.ShouldStop(65536);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("REGISTRO ACTUALZIADO OK")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable(""))),main.mostCurrent.activityBA);
 }else {
 BA.debugLineNum = 115;BA.debugLine="Msgbox(\"ERROR EN ACTUALZIACION\",\"\")";
Debug.ShouldStop(262144);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("ERROR EN ACTUALZIACION")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable(""))),main.mostCurrent.activityBA);
 };
 BA.debugLineNum = 117;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cmdborrar_click() throws Exception{
try {
		Debug.PushSubsStack("cmdBorrar_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,81);
if (RapidSub.canDelegate("cmdborrar_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","cmdborrar_click");}
 BA.debugLineNum = 81;BA.debugLine="Private Sub cmdBorrar_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 82;BA.debugLine="If prods.Delete(txtId.Text) Then";
Debug.ShouldStop(131072);
if (main._prods.runClassMethod (b4a.example.productos.class, "_delete" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, main.mostCurrent._txtid.runMethod(true,"getText")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 83;BA.debugLine="Msgbox(\"REGISTRO BORRADO OK\",\"\")";
Debug.ShouldStop(262144);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("REGISTRO BORRADO OK")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable(""))),main.mostCurrent.activityBA);
 BA.debugLineNum = 84;BA.debugLine="txtNombre.Text = \"\"";
Debug.ShouldStop(524288);
main.mostCurrent._txtnombre.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 85;BA.debugLine="txtPrecioUnitario.Text = \"\"";
Debug.ShouldStop(1048576);
main.mostCurrent._txtpreciounitario.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 86;BA.debugLine="txtStock.Text = \"\"";
Debug.ShouldStop(2097152);
main.mostCurrent._txtstock.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 87;BA.debugLine="txtIVA.Text = \"\"";
Debug.ShouldStop(4194304);
main.mostCurrent._txtiva.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 }else {
 BA.debugLineNum = 89;BA.debugLine="Msgbox(\"ERROR AL BOORAR REGISTRO\",\"\")";
Debug.ShouldStop(16777216);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("ERROR AL BOORAR REGISTRO")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable(""))),main.mostCurrent.activityBA);
 };
 BA.debugLineNum = 91;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cmdcrear_click() throws Exception{
try {
		Debug.PushSubsStack("cmdCrear_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,119);
if (RapidSub.canDelegate("cmdcrear_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","cmdcrear_click");}
RemoteObject _p = RemoteObject.declareNull("b4a.example.producto");
 BA.debugLineNum = 119;BA.debugLine="Private Sub cmdCrear_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 120;BA.debugLine="Dim p As Producto = prods.Create( txtId.Text, txt";
Debug.ShouldStop(8388608);
_p = main._prods.runClassMethod (b4a.example.productos.class, "_create" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, main.mostCurrent._txtid.runMethod(true,"getText"))),(Object)(main.mostCurrent._txtnombre.runMethod(true,"getText")),(Object)(BA.numberCast(double.class, main.mostCurrent._txtpreciounitario.runMethod(true,"getText"))),(Object)(BA.numberCast(double.class, main.mostCurrent._txtstock.runMethod(true,"getText"))),(Object)(BA.numberCast(double.class, main.mostCurrent._txtiva.runMethod(true,"getText"))));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 121;BA.debugLine="If p <> Null Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("N",_p)) { 
 BA.debugLineNum = 122;BA.debugLine="Msgbox(\"REGISTRO CREADO OK\",\"\")";
Debug.ShouldStop(33554432);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("REGISTRO CREADO OK")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable(""))),main.mostCurrent.activityBA);
 }else {
 BA.debugLineNum = 124;BA.debugLine="Msgbox(\"ERROR EN CREACION\",\"\")";
Debug.ShouldStop(134217728);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("ERROR EN CREACION")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable(""))),main.mostCurrent.activityBA);
 };
 BA.debugLineNum = 126;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cmdleeruno_click() throws Exception{
try {
		Debug.PushSubsStack("cmdLeerUno_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,93);
if (RapidSub.canDelegate("cmdleeruno_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","cmdleeruno_click");}
RemoteObject _p = RemoteObject.declareNull("b4a.example.producto");
 BA.debugLineNum = 93;BA.debugLine="Private Sub cmdLeerUno_Click";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 94;BA.debugLine="Dim p As Producto = prods.Read_ById(txtId.Text)";
Debug.ShouldStop(536870912);
_p = main._prods.runClassMethod (b4a.example.productos.class, "_read_byid" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, main.mostCurrent._txtid.runMethod(true,"getText"))));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 95;BA.debugLine="If p <> Null Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("N",_p)) { 
 BA.debugLineNum = 96;BA.debugLine="txtId.Text = p.Id";
Debug.ShouldStop(-2147483648);
main.mostCurrent._txtid.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_p.getField(true,"_id" /*RemoteObject*/ )));
 BA.debugLineNum = 97;BA.debugLine="txtNombre.Text = p.Nombre";
Debug.ShouldStop(1);
main.mostCurrent._txtnombre.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_p.getField(true,"_nombre" /*RemoteObject*/ )));
 BA.debugLineNum = 98;BA.debugLine="txtPrecioUnitario.Text = p.PrecioUnitario";
Debug.ShouldStop(2);
main.mostCurrent._txtpreciounitario.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_p.getField(true,"_preciounitario" /*RemoteObject*/ )));
 BA.debugLineNum = 99;BA.debugLine="txtStock.Text = p.Stock";
Debug.ShouldStop(4);
main.mostCurrent._txtstock.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_p.getField(true,"_stock" /*RemoteObject*/ )));
 BA.debugLineNum = 100;BA.debugLine="txtIVA.Text = p.IVA";
Debug.ShouldStop(8);
main.mostCurrent._txtiva.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_p.getField(true,"_iva" /*RemoteObject*/ )));
 }else {
 BA.debugLineNum = 102;BA.debugLine="txtNombre.Text = \"\"";
Debug.ShouldStop(32);
main.mostCurrent._txtnombre.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 103;BA.debugLine="txtPrecioUnitario.Text = \"\"";
Debug.ShouldStop(64);
main.mostCurrent._txtpreciounitario.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 104;BA.debugLine="txtStock.Text = \"\"";
Debug.ShouldStop(128);
main.mostCurrent._txtstock.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 105;BA.debugLine="txtIVA.Text = \"\"";
Debug.ShouldStop(256);
main.mostCurrent._txtiva.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 106;BA.debugLine="Msgbox(\"REGISTRO NO ENCONTGRADO\",\"\")";
Debug.ShouldStop(512);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("REGISTRO NO ENCONTGRADO")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable(""))),main.mostCurrent.activityBA);
 };
 BA.debugLineNum = 108;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
 //BA.debugLineNum = 24;BA.debugLine="Private txtId As EditText";
main.mostCurrent._txtid = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private txtNombre As EditText";
main.mostCurrent._txtnombre = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private txtPrecioUnitario As EditText";
main.mostCurrent._txtpreciounitario = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private txtStock As EditText";
main.mostCurrent._txtstock = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private txtIVA As EditText";
main.mostCurrent._txtiva = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
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