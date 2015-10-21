package org.cvrgrid.philips;
/*
Copyright 2015 Johns Hopkins University Institute for Computational Medicine

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
/**
* @author Stephen Granite
*/
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.cvrgrid.philips.codecs.Base64;

public class TruePositive {

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
		byte[] uncodedDataByte = new byte[uncodedDataDouble.length*2];
		for (int t = 0, len = uncodedDataByte.length; t < len; t+=2) {
			short shortVal = (short) Math.round(uncodedDataDouble[t/2]);
			byte[] temp = shortToByteArray(shortVal);
			uncodedDataByte[t] = temp[0];
			uncodedDataByte[t+1] = temp[1];
		}
		String encoded;
		try {
			encoded = Base64.encodeBytes( uncodedDataByte, Base64.DO_BREAK_LINES );
			uncodedDataByte = Base64.decode( encoded );
			ByteBuffer bb = ByteBuffer.allocate(2);
			bb.order(ByteOrder.nativeOrder());
			for (int t = 0, len = uncodedDataByte.length; t < len; t+=2) {
				double doubleVal = (double)(readShort(uncodedDataByte,t));
				doubleVal = doubleVal * 4.88;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static short readShort(byte[] data, int offset) {
		return (short) (((data[offset + 1] << 8)) + ((data[offset] & 0xff)));
	}

	public static byte[] shortToByteArray(short s) {
		return new byte[] { (byte) (s & 0x00FF), (byte) ((s & 0xFF00) >> 8) };
	}
}