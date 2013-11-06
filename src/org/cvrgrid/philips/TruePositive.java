package org.cvrgrid.philips;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.cvrgrid.philips.codecs.Base64;


public class TruePositive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double gain = 4.88;
		double[] uncodedDataDouble = new double[2500];
		int i;
		for (i = 0; i < 100; i++) uncodedDataDouble[i] = 0/gain;
		for (i = 100; i < 300; i++) uncodedDataDouble[i] = 1000/gain;
		for (i = 300; i < 500; i++) uncodedDataDouble[i] = 0/gain;
		for (i = 500; i < 700; i++) uncodedDataDouble[i] = 1000/gain;
		for (i = 700; i < 900; i++) uncodedDataDouble[i] = 0/gain;
		for (i = 900; i < 1100; i++) uncodedDataDouble[i] = 1000/gain;
		for (i = 1100; i < 1300; i++) uncodedDataDouble[i] = 0/gain;
		for (i = 1300; i < 1500; i++) uncodedDataDouble[i] = 1000/gain;
		for (i = 1500; i < 1700; i++) uncodedDataDouble[i] = 0/gain;
		for (i = 1700; i < 1900; i++) uncodedDataDouble[i] = 1000/gain;
		for (i = 1900; i < 2100; i++) uncodedDataDouble[i] = 0/gain;
		for (i = 2100; i < 2300; i++) uncodedDataDouble[i] = 1000/gain;
		for (i = 2300; i < 2500; i++) uncodedDataDouble[i] = 0/gain;
		//String encoded = "+P/4//j/+P/4//j/+P/4//j/+P/4//j/+P/4//j/+P/4//j/+P/4//j/+P/4//j/+P/4//j/+P/4//j/+P/4//j/+P/4//j/+P/5//r/+v/8//3/AAABAAIAAgABAAEA/f/8//z/+v/6//n/+f/5//n/+P/4//j/+P/4//j/+P/3//f/9//3//f/+P/5//n/+f/5//n/+f/5//n/+f/5//n/+f/5//n/+f/0/wQAGgAyAEgAXgBZAEgAKQAWAAwABgADAAEA/v/+//3//P/7//r/+f/5//n/+P/4//j/+P/3//j/+f/5//n/+f/5//j/9//3//f/9//3//f/9//3//f/+P/5//n/+f/5//n/+f/5//n/+f/5//r//P/+/wEAAwAEAAcACgANABAAEwAVABUAFgAWABUAFAAUABQAEwATABIAEAAQAA4ADAAKAAkACAAGAAUABAADAAIAAQAAAP///v/+//7//v/8//z//P/8//v/+//7//v/+v/6//r/+v/5//n/+f/5//n/+f/4//j/+P/4//j/+P/4//j/+P/4//j/+P/4//j/+P/4//j/+P/4//j/+P/4//j/+f/5//n/+f/5//n/+f/5//n/+f/5//n/+f/5//n/+v/6//n/+f/4//f/+P/4//n/+f/5//n/+f/4//j/+P/4//j/+P/6//v//v8AAAIAAgABAAEA/f/8//z/+v/6//n/+f/5//n/+P/4//j/+P/4//j/+P/3//j/+f/5//n/+f/5//n/+f/5//n/+P/3//f/9//3//f/9//3//f/9//z/wQAGgAyAEgAXgBbAEwAKwAWAAsABAABAP///P/8//v/+v/5//j/+P/5//n/+P/4//j/+P/3//f/9//4//n/+f/5//n/+f/5//n/+f/5//j/9//3//f/9//3//f/9//4//n/+f/5//n/+f/5//r//P/+/wEAAwAFAAkADAAPABEAEwAVABUAFQAUABQAFAAUABQAEgARABAADgAOAAwACwAKAAkACAAGAAUABAADAAIAAQAAAP///v/+//7//v/8//z//P/8//v/+//7//v/+v/6//r/+v/5//n/+f/5//n/+f/4//j/+P/4//j/+P/4//j/+P/4//j/+P/4//j/+P/4//j/+P/4//j/+P/4//f/9//3//f/9//3//j/+f/5//n/+f/5//n/+f/4//f/+P/4//f/9//3//f/+P/4//j/9//3//f/+P/4//j/+P/4//j/+P/6//v//v8AAAIAAwADAAMA///9//z/+v/6//n/+f/5//n/+P/4//j/+P/4//j/+P/3//f/9//3//f/9//3//f/9//3//f/9//3//f/9//4//n/+f/5//j/9//x/wAAFgAuAEUAXABdAFIALwAYAA0ABgADAAEA/f/8//v/+v/5//j/+P/5//n/+P/4//j/+P/3//f/9//3//f/9//3//f/9//3//f/9//3//f/9//3//f/9//3//f/9//3//f/+P/5//n/+f/4//j/+v/8////AQADAAcACgANAA8AEQATABMAFQAWABYAFgAWABYAFAATABIAEAAQAA4ADAAKAAkACAAGAAUABAADAAMAAwACAAEAAAAAAAAAAAD+//7//v/+//3//f/8//v/+v/6//r/+v/5//n/+f/5//n/+f/5//r/+v/6//n/+P/4//j/+P/4//j/+P/4//j/+P/4//j/+P/4//j/+P/4//j/+f/5//n/+f/5//n/+f/5//n/+f/5//n/+f/5//n/+v/6//n/+f/4//f/+P/4//n/+f/5//n/+f/4//j/+P/4//j/+P/6//v//v8AAAIAAgABAAEA/f/8//z/+v/6//n/+f/5//n/+P/4//j/+P/4//j/+P/3//f/9//3//f/+P/5//n/+f/5//n/+f/5//j/9//3//f/+P/5//n/+f/z/wIAGAAwAEYAXABaAEwAKwAWAAsABAABAP///P/8//z//P/7//r/+f/5//n/+P/4//j/+P/3//f/9//3//f/9//3//f/9//3//f/9//3//f/9//3//f/9//3//j/+f/5//n/+f/5//n/+f/5//r//P/+/wEAAwAEAAcACgANAA8AEQAUABUAFgAWABYAFgAWABYAFAATABEADgAOAAwACwAKAAkACAAGAAUABAADAAMAAwACAAEA///+//7//v/8//z//P/8//v/+//7//v/+v/6//r/+v/5//n/+f/5//n/+f/5//r/+v/6//n/+P/4//j/+P/4//j/+P/4//j/+P/4//j/+P/4//j/+P/4//j/+f/5//n/+f/5//n/+f/5//n/+f/5//j/9//3//f/+P/4//f/9//3//f/+P/4//j/9//3//f/+P/4//j/+P/4//j/+P/6//v//v8AAAIAAgABAAEA/f/8//z/+v/6//n/+f/5//n/+P/4//j/+P/4//j/+P/3//f/9//3//f/9//3//j/+f/5//n/+P/3//f/9//4//n/+f/5//n/+f/z/wIAGAAwAEcAXgBbAEwAKwAWAAsABAABAP///P/8//v/+v/5//j/+P/5//n/+P/4//j/+P/3//f/9//3//f/9//3//f/9//3//f/9//3//f/9//3//f/9//3//f/9//3//f/9//3//f/9//3//j/+v/8////AQADAAcACgANAA8AEQATABMAFAAUABQAFAAUABQAEgARABAADgAOAAwACwAKAAkACAAGAAUABAADAAIAAQAAAP///v/+//7//v/8//z//P/8//v/+//7//v/+v/6//r/+v/5//n/+f/5//n/+f/4//j/+P/4//j/+P/4//j/+P/4//j/+P/4//j/+P/4//j/+P/4//j/+P/4//f/9//3//f/9//3//f/9//3//f/9//3//f/9//3//f/+P/4//f/9//3//f/+P/4//j/9//3//f/+P/4//j/+P/4//j/+P/6//v//v8AAAIAAwADAAMA///9//z/+v/6//n/+f/5//n/+P/4//j/+P/4//j/+P/3//f/9//3//f/9//3//f/9//3//f/9//3//f/9//3//f/9//3//f/9//w//7/FAAsAEQAXABdAFIALwAYAA0ABgADAAEA/v/+//3//P/7//r/+f/5//n/+P/4//j/+P/3//j/+f/5//n/+f/5//n/+f/5//n/+f/5//n/+f/5//n/+f/5//n/+f/5//n/+P/3//f/9//3//j/+v/8////AQADAAcACgANABAAEwAVABUAFgAWABYAFgAWABYAFAATABIAEAAQAA4ADQAMAAsACgAHAAUABAADAAMAAwACAAEAAAAAAAAAAAD+//7//v/+//z/+//7//v/+v/6//r/+v/5//n/+f/5//n/+f/4//j/+P/4//j/+P/4//j/+P/4//j/+P/4//j/+P/4//j/+P/4//j/+P/4//j/+f/5//n/+f/5//n/+f/5//n/+f/5//n/+f/5//n/+v/6//j/9//3//f/+P/4//j/9//3//f/+P/4//j/+P/4//j/+P/6//v//v8AAAIAAwADAAMA///9//z/+v/6//n/+f/5//n/+P/4//j/+P/4//j/+f/5//n/+f/5//n/+f/5//j/9//3//f/9//3//f/9//4//n/+f/5//n/+f/z/wIAGAAwAEcAXgBbAEwAKwAWAAsABAABAP///P/8//v/+v/5//j/+P/5//n/+P/4//j/+P/3//f/9//3//f/9//3//f/9//3//f/9//3//j/+f/5//n/+P/3//f/9//3//f/9//3//f/9//3//j/+v/8////AQADAAcACgANAA8AEQAUABUAFgAWABUAFAAUABQAEgARABAADgAOAAwACwAKAAkACAAGAAUABQAFAAQAAwACAAEAAAAAAAAAAAD+//7//f/8//v/+//7//v/+v/6//r/+v/5//n/+f/5//n/+f/4//j/+P/4//j/+P/5//r/+v/6//n/+P/4//j/+P/4//j/+P/4//j/+P/4//j/+f/5//n/+f/5//n/+f/4//f/9//3//f/9//3//f/+f/6//n/+f/4//f/+P/4//j/9//3//f/+P/4//j/+P/4//j/+P/6//v//v8AAAIAAwADAAMA///+//7//P/8//r/+f/5//n/+P/4//j/+P/4//j/+f/5//n/+f/5//n/+f/5//n/+f/5//n/+P/3//f/9//4//n/+f/5//n/+f/z/wIAGAAwAEcAXgBcAE4ALQAYAA0ABgADAAEA/v/+//3//P/7//r/+f/5//n/+P/4//j/+f/5//n/+f/5//n/+P/3//f/9//3//f/9//3//f/9//3//f/9//3//f/9//3//f/9//3//f/9//3//j/+//+/wEAAwAEAAcACgANAA8AEQAUABUAFgAWABUAFAAUABQAEwATABIAEAAPAAwACwAKAAkACAAGAAUABAADAAMAAwACAAEA///+//7//v/8//z//P/8//v/+//7//v/+v/6//r/+v/5//n/+f/5//r/+//6//r/+v/6//r/+v/5//j/+P/4//j/+P/4//j/+P/4//j/+P/4//j/+P/4//f/9//4//n/+f/5//n/+f/5//n/+f/5//n/+f/5//n/+v/6//n/+f/5//n/+f/4//j/9//3//f/+P/4//j/+P/4//j/+P/6//v//v8AAAIAAwADAAMA///+//7//P/8//r/+f/5//n/+P/4//j/+P/4//j/+P/3//j/+f/5//n/+f/5//n/+f/5//n/+P/3//f/9//3//f/9//3//f/9//w//7/FAAsAEQAXABdAFIALwAYAA0ABgADAAEA/v/+//3//P/7//r/+f/5//n/+P/4//j/+P/3//f/9//4//n/+f/5//n/+f/4//f/9//3//f/9//3//f/+P/5//n/+f/4//f/9//3//f/9//3//j/+v/8////AQADAAcACgANAA8AEQATABMAFAAUABQAFAAUABQAEwATABIAEAAQAA4ADAAKAAkACAAGAAUABAADAAIAAQAAAP///v/+//7//v/8//z//P/8//v/+//7//v/+v/6//r/+v/5//n/+f/5//n/+f/4//j/+P/4//j/+P/4//j/+P/4//j/+P/4//j/+P/4//j/+P/4//j/+P/4//j/+f/5//n/+f/5//n/+f/5//n/+f/5//n/+f/5//n/+v/6//n/+f/4//f/+P/4//n/+f/5//n/+f/4//j/+P/4//j/+f/7//z//f8AAAIAAwACAAEAAQD9//z//P/6//r/+f/5//n/+f/4//j/+P/4//j/+P/4//f/9//3//f/9//3//f/9//4//n/+f/5//n/+f/5//n/+P/3//f/9//8//v/DAAkADkATQBcAFIARAAjABEACQADAAEA///8//z/+//6//n/+P/4//n/+f/4//j/+P/4//f/9//3//f/9//3//f/9//3//f/9//3//f/9//4//n/+f/5//n/+f/5//n/+f/5//n/+f/5//n/+v/8//7/AQADAAUACQAMAA8AEQATABUAFQAWABUAFAAUABQAFAASABEAEAAOAA4ADAALAAoACQAIAAYABQAEAAMAAgABAAAA///+//7//v/+//z//P/8//z/+//7//v/+//6//r/+v/6//n/+f/5//n/+f/5//j/+P/4//n/+v/6//r/+f/4//j/+P/4//j/+P/4//j/+P/4//j/+f/6//r/+f/5//n/+f/5//n/+f/5//n/+f/5//n/+f/5//n/+f/6//r/+f/5//n/+P/4//j/+P/3//f/+P/4//j/+P/4//j/+P/6//v//v8AAAIAAwADAAMA///9//z/+v/6//n/+f/5//n/+P/4//j/+P/4//j/+P/3//f/9//3//f/9//3//j/+f/5//n/+f/5//n/+f/5//n/+f/5//n/+f/w//z/EgAqAEMAXABeAFQAMAAYAA0ABgACAP///P/8//v/+v/5//j/+P/5//n/+P/4//j/+P/3//j/+f/5//n/+f/5//n/+f/5//n/+f/5//n/+f/4//f/9//3//f/9//3//f/9//3//f/9//3//j/+v/8////AQADAAcACgANAA8AEQATABMAFAAUABQAFAAVABYAFAATABIAEAAQAA4ADQAMAAoACAAGAAUABQAFAAQAAwACAAEAAAAAAAAAAAD9//z//P/8//v/+//7//v/+v/6//r/+v/5//n/+f/5//n/+f/5//r/+v/6//r/+v/5//j/+P/4//j/+P/4//j/+P/4//j/+P/4//j/+P/4//f/9//3//f/9//3//f/9//4//n/+f/5//j/9//3//f/+P/4//f/9//3//f/+P/4//j/9//3//f/+P/4//j/+P/4//j/+P/6//v//v8AAAIAAwADAAMA///+//7//P/8//r/+f/5//n/+P/4//j/+P/4//j/+f/5//n/+f/5//n/+f/5//n/+f/5//n/+f/5//n/+f/5//n/+f/5//n/+f/v//r/EAAoAEEAWgBfAFgANAAcAA8ABgADAAEA/v/+//3//P/7//r/+v/7//v/+v/5//j/+P/3//j/+f/5//n/+f/5//n/+f/5//n/+f8=";			         
		byte[] uncodedDataByte = new byte[uncodedDataDouble.length*2];
		for (int t = 0, len = uncodedDataByte.length; t < len; t+=2) {
			short shortVal = (short) Math.round(uncodedDataDouble[t/2]);
			//System.out.print(shortVal + "\t");
			byte[] temp = shortToByteArray(shortVal);
			uncodedDataByte[t] = temp[0];
			uncodedDataByte[t+1] = temp[1];
			//System.out.println(readShort(temp,0));
		}
		String encoded;
		try {
			encoded = Base64.encodeBytes( uncodedDataByte, Base64.DO_BREAK_LINES );
			System.out.println(encoded);
			uncodedDataByte = Base64.decode( encoded );
			//System.out.println(uncodedDataByte.length);
			ByteBuffer bb = ByteBuffer.allocate(2);
			bb.order(ByteOrder.nativeOrder());
			for (int t = 0, len = uncodedDataByte.length; t < len; t+=2) {
				double doubleVal = (double)(readShort(uncodedDataByte,t));
				doubleVal = doubleVal * 4.88;
				//System.out.println(doubleVal);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static short readShort(byte[] data, int offset) {
		//System.out.print((data[offset + 1] << 8) + "\t" + (data[offset] & 0xff) + "\t" + (((data[offset + 1] << 8)) + ((data[offset] & 0xff))) + "\t");
		return (short) (((data[offset + 1] << 8)) + ((data[offset] & 0xff)));
	}

	public static byte[] shortToByteArray(short s) {
		return new byte[] { (byte) (s & 0x00FF), (byte) ((s & 0xFF00) >> 8) };
	}
}
