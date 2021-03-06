package net.sourceforge.lept4j;
import com.ochafik.lang.jnaerator.runtime.NativeSize;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * In use, either datacomp or data85 will be produced, depending<br>
 *  on whether the data needs to be ascii85 encoded.  PostScript<br>
 *  requires ascii85 encoding; pdf does not.<br>
 *  For the colormap (flate compression only), PostScript uses ascii85<br>
 *  encoding and pdf uses a bracketed array of space-separated<br>
 *  hex-encoded rgb triples.  Only tiff g4 (type == L_G4_ENCODE) uses<br>
 *  the minisblack field.<br>
 * <i>native declaration : imageio.h:79</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class L_Compressed_Data extends Structure {
	/**
	 * encoding type: L_JPEG_ENCODE, etc<br>
	 * C type : l_int32
	 */
	public int type;
	/**
	 * gzipped raster data<br>
	 * C type : l_uint8*
	 */
	public Pointer datacomp;
	/** number of compressed bytes */
	public NativeSize nbytescomp;
	/**
	 * ascii85-encoded gzipped raster data<br>
	 * C type : char*
	 */
	public Pointer data85;
	/** number of ascii85 encoded bytes */
	public NativeSize nbytes85;
	/**
	 * ascii85-encoded uncompressed cmap<br>
	 * C type : char*
	 */
	public Pointer cmapdata85;
	/**
	 * hex pdf array for the cmap<br>
	 * C type : char*
	 */
	public Pointer cmapdatahex;
	/**
	 * number of colors in cmap<br>
	 * C type : l_int32
	 */
	public int ncolors;
	/**
	 * image width<br>
	 * C type : l_int32
	 */
	public int w;
	/**
	 * image height<br>
	 * C type : l_int32
	 */
	public int h;
	/**
	 * bits/sample; typ. 1, 2, 4 or 8<br>
	 * C type : l_int32
	 */
	public int bps;
	/**
	 * samples/pixel; typ. 1 or 3<br>
	 * C type : l_int32
	 */
	public int spp;
	/**
	 * tiff g4 photometry<br>
	 * C type : l_int32
	 */
	public int minisblack;
	/**
	 * flate data has PNG predictors<br>
	 * C type : l_int32
	 */
	public int predictor;
	/** number of uncompressed raster bytes */
	public NativeSize nbytes;
	/**
	 * resolution (ppi)<br>
	 * C type : l_int32
	 */
	public int res;
	public L_Compressed_Data() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("type", "datacomp", "nbytescomp", "data85", "nbytes85", "cmapdata85", "cmapdatahex", "ncolors", "w", "h", "bps", "spp", "minisblack", "predictor", "nbytes", "res");
	}
	public L_Compressed_Data(Pointer peer) {
		super(peer);
		read();
	}
	public static class ByReference extends L_Compressed_Data implements Structure.ByReference {
		
	};
	public static class ByValue extends L_Compressed_Data implements Structure.ByValue {
		
	};
}
