@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.media.dxmediaobjects

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr

private object WindowsWin32MediaDxmediaobjectsJniBridge {
    init {
        loadNativeLibrary()
    }

    private fun loadNativeLibrary() {
        val osRaw = System.getProperty("os.name", "").lowercase()
        val archRaw = System.getProperty("os.arch", "").lowercase()
        val hostPlatform =
            when {
                osRaw.contains("win") -> "windows"
                osRaw.contains("mac") || osRaw.contains("darwin") -> "macos"
                else -> "linux"
            }
        val hostArch =
            when {
                archRaw == "aarch64" || archRaw == "arm64" -> "aarch64"
                archRaw == "amd64" || archRaw == "x86_64" -> "x86_64"
                else -> archRaw
            }
        val libFileName =
            when (hostPlatform) {
                "windows" -> "windowssys_jni.dll"
                "macos" -> "libwindowssys_jni.dylib"
                else -> "libwindowssys_jni.so"
            }
        val pathSep = System.getProperty("path.separator", ":")
        val libPathProp = System.getProperty("java.library.path", "")
        for (dirEntry in libPathProp.split(pathSep)) {
            if (dirEntry.isEmpty()) continue
            val candidate = java.io.File(dirEntry, libFileName)
            if (candidate.isFile) {
                System.load(candidate.absolutePath)
                return
            }
        }
        val resourcePath = "io/github/kotlinmania/windowssys/native/$hostPlatform-$hostArch/$libFileName"
        val stream = WindowsWin32MediaDxmediaobjectsJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
        if (stream != null) {
            val suffix = "." + libFileName.substringAfterLast('.')
            val extracted =
                java.nio.file.Files
                    .createTempFile("windowssys_jni-", suffix)
                    .toFile()
            extracted.deleteOnExit()
            stream.use { input ->
                extracted.outputStream().use { output ->
                    input.copyTo(output)
                }
            }
            System.load(extracted.absolutePath)
            return
        }
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32MediaDxmediaobjectsDMOEnum(guidcategory: Long, dwflags: Int, cintypes: Int, pintypes: Long, couttypes: Int, pouttypes: Long, ppenum: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaDxmediaobjectsDMOGetName(clsiddmo: Long, szname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaDxmediaobjectsDMOGetTypes(clsiddmo: Long, ulinputtypesrequested: Int, pulinputtypessupplied: Long, pinputtypes: Long, uloutputtypesrequested: Int, puloutputtypessupplied: Long, poutputtypes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaDxmediaobjectsDMORegister(szname: Long, clsiddmo: Long, guidcategory: Long, dwflags: Int, cintypes: Int, pintypes: Long, couttypes: Int, pouttypes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaDxmediaobjectsDMOUnregister(clsiddmo: Long, guidcategory: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaDxmediaobjectsMoCopyMediaType(pmtdest: Long, pmtsrc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaDxmediaobjectsMoCreateMediaType(ppmt: Long, cbformat: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaDxmediaobjectsMoDeleteMediaType(pmt: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaDxmediaobjectsMoDuplicateMediaType(ppmtdest: Long, pmtsrc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaDxmediaobjectsMoFreeMediaType(pmt: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaDxmediaobjectsMoInitMediaType(pmt: Long, cbformat: Int): Int
}

public actual fun dMOEnum(guidcategory: ConstPtr<Guid>, dwflags: UInt, cintypes: UInt, pintypes: ConstPtr<DmoPartialMediatype>, couttypes: UInt, pouttypes: ConstPtr<DmoPartialMediatype>, ppenum: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32MediaDxmediaobjectsJniBridge.windowssysWindowsWin32MediaDxmediaobjectsDMOEnum(guidcategory.rawAddress, dwflags.toInt(), cintypes.toInt(), pintypes.rawAddress, couttypes.toInt(), pouttypes.rawAddress, ppenum.rawAddress)

public actual fun dMOGetName(clsiddmo: ConstPtr<Guid>, szname: Pwstr): Hresult =
    WindowsWin32MediaDxmediaobjectsJniBridge.windowssysWindowsWin32MediaDxmediaobjectsDMOGetName(clsiddmo.rawAddress, szname.rawAddress)

public actual fun dMOGetTypes(clsiddmo: ConstPtr<Guid>, ulinputtypesrequested: UInt, pulinputtypessupplied: MutPtr<UInt>, pinputtypes: MutPtr<DmoPartialMediatype>, uloutputtypesrequested: UInt, puloutputtypessupplied: MutPtr<UInt>, poutputtypes: MutPtr<DmoPartialMediatype>): Hresult =
    WindowsWin32MediaDxmediaobjectsJniBridge.windowssysWindowsWin32MediaDxmediaobjectsDMOGetTypes(clsiddmo.rawAddress, ulinputtypesrequested.toInt(), pulinputtypessupplied.rawAddress, pinputtypes.rawAddress, uloutputtypesrequested.toInt(), puloutputtypessupplied.rawAddress, poutputtypes.rawAddress)

public actual fun dMORegister(szname: Pcwstr, clsiddmo: ConstPtr<Guid>, guidcategory: ConstPtr<Guid>, dwflags: UInt, cintypes: UInt, pintypes: ConstPtr<DmoPartialMediatype>, couttypes: UInt, pouttypes: ConstPtr<DmoPartialMediatype>): Hresult =
    WindowsWin32MediaDxmediaobjectsJniBridge.windowssysWindowsWin32MediaDxmediaobjectsDMORegister(szname.rawAddress, clsiddmo.rawAddress, guidcategory.rawAddress, dwflags.toInt(), cintypes.toInt(), pintypes.rawAddress, couttypes.toInt(), pouttypes.rawAddress)

public actual fun dMOUnregister(clsiddmo: ConstPtr<Guid>, guidcategory: ConstPtr<Guid>): Hresult =
    WindowsWin32MediaDxmediaobjectsJniBridge.windowssysWindowsWin32MediaDxmediaobjectsDMOUnregister(clsiddmo.rawAddress, guidcategory.rawAddress)

public actual fun moCopyMediaType(pmtdest: MutPtr<DmoMediaType>, pmtsrc: ConstPtr<DmoMediaType>): Hresult =
    WindowsWin32MediaDxmediaobjectsJniBridge.windowssysWindowsWin32MediaDxmediaobjectsMoCopyMediaType(pmtdest.rawAddress, pmtsrc.rawAddress)

public actual fun moCreateMediaType(ppmt: MutPtr<MutPtr<DmoMediaType>>, cbformat: UInt): Hresult =
    WindowsWin32MediaDxmediaobjectsJniBridge.windowssysWindowsWin32MediaDxmediaobjectsMoCreateMediaType(ppmt.rawAddress, cbformat.toInt())

public actual fun moDeleteMediaType(pmt: MutPtr<DmoMediaType>): Hresult =
    WindowsWin32MediaDxmediaobjectsJniBridge.windowssysWindowsWin32MediaDxmediaobjectsMoDeleteMediaType(pmt.rawAddress)

public actual fun moDuplicateMediaType(ppmtdest: MutPtr<MutPtr<DmoMediaType>>, pmtsrc: ConstPtr<DmoMediaType>): Hresult =
    WindowsWin32MediaDxmediaobjectsJniBridge.windowssysWindowsWin32MediaDxmediaobjectsMoDuplicateMediaType(ppmtdest.rawAddress, pmtsrc.rawAddress)

public actual fun moFreeMediaType(pmt: MutPtr<DmoMediaType>): Hresult =
    WindowsWin32MediaDxmediaobjectsJniBridge.windowssysWindowsWin32MediaDxmediaobjectsMoFreeMediaType(pmt.rawAddress)

public actual fun moInitMediaType(pmt: MutPtr<DmoMediaType>, cbformat: UInt): Hresult =
    WindowsWin32MediaDxmediaobjectsJniBridge.windowssysWindowsWin32MediaDxmediaobjectsMoInitMediaType(pmt.rawAddress, cbformat.toInt())
