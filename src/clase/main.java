package clase;

public class main {

	public static void main(String[] args) {
		IMyData di;
		java.util.List<IMyData> lstObjects = new ArrayList<IMyData>();
		
Product p = new Product();
p.setNombre("productoCualquiera");
p.setCodigo("miCodigo");
lstObjects.add(p);

Customer c = new Customer();
c.setNombre("nombreCualquiera");
c.setRut("17627389");
lstObjects.add(c);

Employer e = new Employer();
e.setNombre("nombreAleatorio");
e.setRut("125423");
lstObjects.add(e);

Car v = new Car();
v.setName("ajds");
v.setCodigo("6548");
lstObjects.add(v);

di=p;
System.out.println(p.getNombre());

di=c;
System.out.println(c.getNombre());

di=e;
System.out.println(e.getNombre());

di=v;
System.out.println(v.getName());

		for (IMyData cur : lstObjects) {
			System.out.println(cur.getName());
			}
		}

}
