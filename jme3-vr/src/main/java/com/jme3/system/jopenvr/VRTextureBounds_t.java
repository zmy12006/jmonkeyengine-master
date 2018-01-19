package com.jme3.system.jopenvr;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : headers\openvr_capi.h:1007</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class VRTextureBounds_t extends Structure {
	public float uMin;
	public float vMin;
	public float uMax;
	public float vMax;
	public VRTextureBounds_t() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("uMin", "vMin", "uMax", "vMax");
	}
	public VRTextureBounds_t(float uMin, float vMin, float uMax, float vMax) {
		super();
		this.uMin = uMin;
		this.vMin = vMin;
		this.uMax = uMax;
		this.vMax = vMax;
	}
	public VRTextureBounds_t(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends VRTextureBounds_t implements Structure.ByReference {
		
	};
	public static class ByValue extends VRTextureBounds_t implements Structure.ByValue {
		
	};
}
