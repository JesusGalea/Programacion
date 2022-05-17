package xd;

public class LogisticaAlmacen {
 private byte Capacidad;
 private byte NumeroDeHuecos;

 LogisticaAlmacen(byte Capacidad) {
 this.Capacidad = Capacidad;
 NumeroDeHuecos = Capacidad;
 }

 public byte DimeNumeroDeHuecos() {
 return (NumeroDeHuecos);
 }

 public byte DimeCapacidad() {
 return (Capacidad);
 }
 public boolean HayHueco() {
 return (NumeroDeHuecos != 0);
 }

 public boolean HayContenedor() {
 return (NumeroDeHuecos != Capacidad);
 }

 public void MeteContenedor() {
 NumeroDeHuecos--;
 }

 public void SacaContenedor() {
 NumeroDeHuecos++;
 }

 } // LogisticaAlmacen