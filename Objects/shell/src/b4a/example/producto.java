
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class producto {
    public static RemoteObject myClass;
	public producto() {
	}
    public static PCBA staticBA = new PCBA(null, producto.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _id = RemoteObject.createImmutable(0);
public static RemoteObject _nombre = RemoteObject.createImmutable("");
public static RemoteObject _preciounitario = RemoteObject.createImmutable(0);
public static RemoteObject _stock = RemoteObject.createImmutable(0);
public static RemoteObject _iva = RemoteObject.createImmutable(0);
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"Id",_ref.getField(false, "_id"),"IVA",_ref.getField(false, "_iva"),"Nombre",_ref.getField(false, "_nombre"),"PrecioUnitario",_ref.getField(false, "_preciounitario"),"Stock",_ref.getField(false, "_stock")};
}
}