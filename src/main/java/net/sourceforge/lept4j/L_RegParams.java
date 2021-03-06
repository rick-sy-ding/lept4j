package net.sourceforge.lept4j;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.ptr.PointerByReference;
import java.util.Arrays;
import java.util.List;
/**
 * -------------------------------------------------------------------------*<br>
 *                     Regression test parameter packer                    *<br>
 * -------------------------------------------------------------------------<br>
 * <i>native declaration : regutils.h:14</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class L_RegParams extends Structure {
	/**
	 * stream to temporary output file for compare mode<br>
	 * C type : FILE*
	 */
	public PointerByReference fp;
	/**
	 * name of test, without '_reg'<br>
	 * C type : char*
	 */
	public Pointer testname;
	/**
	 * name of temp file for compare mode output<br>
	 * C type : char*
	 */
	public Pointer tempfile;
	/**
	 * generate, compare or display<br>
	 * C type : l_int32
	 */
	public int mode;
	/**
	 * index into saved files for this test; 0-based<br>
	 * C type : l_int32
	 */
	public int index;
	/**
	 * overall result of the test<br>
	 * C type : l_int32
	 */
	public int success;
	/**
	 * 1 if in display mode; 0 otherwise<br>
	 * C type : l_int32
	 */
	public int display;
	/**
	 * marks beginning of the reg test<br>
	 * C type : L_TIMER
	 */
	public Pointer tstart;
	public L_RegParams() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("fp", "testname", "tempfile", "mode", "index", "success", "display", "tstart");
	}
	/**
	 * @param fp stream to temporary output file for compare mode<br>
	 * C type : FILE*<br>
	 * @param testname name of test, without '_reg'<br>
	 * C type : char*<br>
	 * @param tempfile name of temp file for compare mode output<br>
	 * C type : char*<br>
	 * @param mode generate, compare or display<br>
	 * C type : l_int32<br>
	 * @param index index into saved files for this test; 0-based<br>
	 * C type : l_int32<br>
	 * @param success overall result of the test<br>
	 * C type : l_int32<br>
	 * @param display 1 if in display mode; 0 otherwise<br>
	 * C type : l_int32<br>
	 * @param tstart marks beginning of the reg test<br>
	 * C type : L_TIMER
	 */
	public L_RegParams(PointerByReference fp, Pointer testname, Pointer tempfile, int mode, int index, int success, int display, Pointer tstart) {
		super();
		this.fp = fp;
		this.testname = testname;
		this.tempfile = tempfile;
		this.mode = mode;
		this.index = index;
		this.success = success;
		this.display = display;
		this.tstart = tstart;
	}
	public L_RegParams(Pointer peer) {
		super(peer);
		read();
	}
	public static class ByReference extends L_RegParams implements Structure.ByReference {
		
	};
	public static class ByValue extends L_RegParams implements Structure.ByValue {
		
	};
}
