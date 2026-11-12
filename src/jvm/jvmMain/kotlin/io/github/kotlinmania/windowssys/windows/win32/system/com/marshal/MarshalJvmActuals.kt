@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.com.marshal

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bstr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hglobal
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hbitmap
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hdc
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hpalette
import io.github.kotlinmania.windowssys.windows.win32.system.com.Safearray
import io.github.kotlinmania.windowssys.windows.win32.system.com.Stgmedium
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Haccel
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Hicon
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Hmenu

private object WindowsWin32SystemComMarshalJniBridge {
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
        val stream = WindowsWin32SystemComMarshalJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
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
    external fun windowssysWindowsWin32SystemComMarshalBstrUserFree(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalBstrUserFree64(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalBstrUserMarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalBstrUserMarshal64(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalBstrUserSize(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalBstrUserSize64(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalBstrUserUnmarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalBstrUserUnmarshal64(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalClipformatUserFree(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalClipformatUserFree64(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalClipformatUserMarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalClipformatUserMarshal64(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalClipformatUserSize(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalClipformatUserSize64(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalClipformatUserUnmarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalClipformatUserUnmarshal64(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalCoGetMarshalSizeMax(pulsize: Long, riid: Long, punk: Long, dwdestcontext: Int, pvdestcontext: Long, mshlflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalCoGetStandardMarshal(riid: Long, punk: Long, dwdestcontext: Int, pvdestcontext: Long, mshlflags: Int, ppmarshal: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalCoGetStdMarshalEx(punkouter: Long, smexflags: Int, ppunkinner: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalCoMarshalHresult(pstm: Long, hresult: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalCoMarshalInterThreadInterfaceInStream(riid: Long, punk: Long, ppstm: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalCoMarshalInterface(pstm: Long, riid: Long, punk: Long, dwdestcontext: Int, pvdestcontext: Long, mshlflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalCoReleaseMarshalData(pstm: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalCoUnmarshalHresult(pstm: Long, phresult: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalCoUnmarshalInterface(pstm: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalHaccelUserFree(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalHaccelUserFree64(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalHaccelUserMarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalHaccelUserMarshal64(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalHaccelUserSize(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalHaccelUserSize64(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalHaccelUserUnmarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalHaccelUserUnmarshal64(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalHbitmapUserFree(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalHbitmapUserFree64(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalHbitmapUserMarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalHbitmapUserMarshal64(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalHbitmapUserSize(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalHbitmapUserSize64(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalHbitmapUserUnmarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalHbitmapUserUnmarshal64(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalHdcUserFree(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalHdcUserFree64(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalHdcUserMarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalHdcUserMarshal64(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalHdcUserSize(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalHdcUserSize64(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalHdcUserUnmarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalHdcUserUnmarshal64(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalHglobalUserFree(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalHglobalUserFree64(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalHglobalUserMarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalHglobalUserMarshal64(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalHglobalUserSize(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalHglobalUserSize64(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalHglobalUserUnmarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalHglobalUserUnmarshal64(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalHiconUserFree(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalHiconUserFree64(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalHiconUserMarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalHiconUserMarshal64(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalHiconUserSize(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalHiconUserSize64(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalHiconUserUnmarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalHiconUserUnmarshal64(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalHmenuUserFree(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalHmenuUserFree64(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalHmenuUserMarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalHmenuUserMarshal64(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalHmenuUserSize(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalHmenuUserSize64(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalHmenuUserUnmarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalHmenuUserUnmarshal64(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalHpaletteUserFree(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalHpaletteUserFree64(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalHpaletteUserMarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalHpaletteUserMarshal64(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalHpaletteUserSize(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalHpaletteUserSize64(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalHpaletteUserUnmarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalHpaletteUserUnmarshal64(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalHwndUserFree(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalHwndUserFree64(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalHwndUserMarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalHwndUserMarshal64(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalHwndUserSize(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalHwndUserSize64(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalHwndUserUnmarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalHwndUserUnmarshal64(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalLpsafearrayUserFree(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalLpsafearrayUserFree64(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalLpsafearrayUserMarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalLpsafearrayUserMarshal64(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalLpsafearrayUserSize(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalLpsafearrayUserSize64(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalLpsafearrayUserUnmarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalLpsafearrayUserUnmarshal64(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalSnbUserFree(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalSnbUserFree64(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalSnbUserMarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalSnbUserMarshal64(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalSnbUserSize(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalSnbUserSize64(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalSnbUserUnmarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalSnbUserUnmarshal64(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalStgmediumUserFree(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalStgmediumUserFree64(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalStgmediumUserMarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalStgmediumUserMarshal64(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalStgmediumUserSize(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalStgmediumUserSize64(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalStgmediumUserUnmarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMarshalStgmediumUserUnmarshal64(param0: Long, param1: Long, param2: Long): Long
}

public actual fun bstrUserFree(param0: ConstPtr<UInt>, param1: ConstPtr<Bstr>) {
    WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalBstrUserFree(param0.rawAddress, param1.rawAddress)
}

public actual fun bstrUserFree64(param0: ConstPtr<UInt>, param1: ConstPtr<Bstr>) {
    WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalBstrUserFree64(param0.rawAddress, param1.rawAddress)
}

public actual fun bstrUserMarshal(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Bstr>): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalBstrUserMarshal(param0.rawAddress, param1.rawAddress, param2.rawAddress))

public actual fun bstrUserMarshal64(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Bstr>): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalBstrUserMarshal64(param0.rawAddress, param1.rawAddress, param2.rawAddress))

public actual fun bstrUserSize(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Bstr>): UInt =
    WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalBstrUserSize(param0.rawAddress, param1.toInt(), param2.rawAddress).toUInt()

public actual fun bstrUserSize64(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Bstr>): UInt =
    WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalBstrUserSize64(param0.rawAddress, param1.toInt(), param2.rawAddress).toUInt()

public actual fun bstrUserUnmarshal(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Bstr>): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalBstrUserUnmarshal(param0.rawAddress, param1.rawAddress, param2.rawAddress))

public actual fun bstrUserUnmarshal64(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Bstr>): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalBstrUserUnmarshal64(param0.rawAddress, param1.rawAddress, param2.rawAddress))

public actual fun clipformatUserFree(param0: ConstPtr<UInt>, param1: ConstPtr<UShort>) {
    WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalClipformatUserFree(param0.rawAddress, param1.rawAddress)
}

public actual fun clipformatUserFree64(param0: ConstPtr<UInt>, param1: ConstPtr<UShort>) {
    WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalClipformatUserFree64(param0.rawAddress, param1.rawAddress)
}

public actual fun clipformatUserMarshal(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<UShort>): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalClipformatUserMarshal(param0.rawAddress, param1.rawAddress, param2.rawAddress))

public actual fun clipformatUserMarshal64(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<UShort>): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalClipformatUserMarshal64(param0.rawAddress, param1.rawAddress, param2.rawAddress))

public actual fun clipformatUserSize(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<UShort>): UInt =
    WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalClipformatUserSize(param0.rawAddress, param1.toInt(), param2.rawAddress).toUInt()

public actual fun clipformatUserSize64(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<UShort>): UInt =
    WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalClipformatUserSize64(param0.rawAddress, param1.toInt(), param2.rawAddress).toUInt()

public actual fun clipformatUserUnmarshal(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<UShort>): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalClipformatUserUnmarshal(param0.rawAddress, param1.rawAddress, param2.rawAddress))

public actual fun clipformatUserUnmarshal64(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<UShort>): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalClipformatUserUnmarshal64(param0.rawAddress, param1.rawAddress, param2.rawAddress))

public actual fun coGetMarshalSizeMax(pulsize: MutPtr<UInt>, riid: ConstPtr<Guid>, punk: MutPtr<CVoid>, dwdestcontext: UInt, pvdestcontext: ConstPtr<CVoid>, mshlflags: UInt): Hresult =
    WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalCoGetMarshalSizeMax(pulsize.rawAddress, riid.rawAddress, punk.rawAddress, dwdestcontext.toInt(), pvdestcontext.rawAddress, mshlflags.toInt())

public actual fun coGetStandardMarshal(riid: ConstPtr<Guid>, punk: MutPtr<CVoid>, dwdestcontext: UInt, pvdestcontext: ConstPtr<CVoid>, mshlflags: UInt, ppmarshal: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalCoGetStandardMarshal(riid.rawAddress, punk.rawAddress, dwdestcontext.toInt(), pvdestcontext.rawAddress, mshlflags.toInt(), ppmarshal.rawAddress)

public actual fun coGetStdMarshalEx(punkouter: MutPtr<CVoid>, smexflags: UInt, ppunkinner: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalCoGetStdMarshalEx(punkouter.rawAddress, smexflags.toInt(), ppunkinner.rawAddress)

public actual fun coMarshalHresult(pstm: MutPtr<CVoid>, hresult: Hresult): Hresult =
    WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalCoMarshalHresult(pstm.rawAddress, hresult)

public actual fun coMarshalInterThreadInterfaceInStream(riid: ConstPtr<Guid>, punk: MutPtr<CVoid>, ppstm: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalCoMarshalInterThreadInterfaceInStream(riid.rawAddress, punk.rawAddress, ppstm.rawAddress)

public actual fun coMarshalInterface(pstm: MutPtr<CVoid>, riid: ConstPtr<Guid>, punk: MutPtr<CVoid>, dwdestcontext: UInt, pvdestcontext: ConstPtr<CVoid>, mshlflags: UInt): Hresult =
    WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalCoMarshalInterface(pstm.rawAddress, riid.rawAddress, punk.rawAddress, dwdestcontext.toInt(), pvdestcontext.rawAddress, mshlflags.toInt())

public actual fun coReleaseMarshalData(pstm: MutPtr<CVoid>): Hresult =
    WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalCoReleaseMarshalData(pstm.rawAddress)

public actual fun coUnmarshalHresult(pstm: MutPtr<CVoid>, phresult: MutPtr<Hresult>): Hresult =
    WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalCoUnmarshalHresult(pstm.rawAddress, phresult.rawAddress)

public actual fun coUnmarshalInterface(pstm: MutPtr<CVoid>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalCoUnmarshalInterface(pstm.rawAddress, riid.rawAddress, ppv.rawAddress)

public actual fun haccelUserFree(param0: ConstPtr<UInt>, param1: ConstPtr<Haccel>) {
    WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalHaccelUserFree(param0.rawAddress, param1.rawAddress)
}

public actual fun haccelUserFree64(param0: ConstPtr<UInt>, param1: ConstPtr<Haccel>) {
    WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalHaccelUserFree64(param0.rawAddress, param1.rawAddress)
}

public actual fun haccelUserMarshal(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Haccel>): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalHaccelUserMarshal(param0.rawAddress, param1.rawAddress, param2.rawAddress))

public actual fun haccelUserMarshal64(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Haccel>): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalHaccelUserMarshal64(param0.rawAddress, param1.rawAddress, param2.rawAddress))

public actual fun haccelUserSize(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Haccel>): UInt =
    WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalHaccelUserSize(param0.rawAddress, param1.toInt(), param2.rawAddress).toUInt()

public actual fun haccelUserSize64(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Haccel>): UInt =
    WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalHaccelUserSize64(param0.rawAddress, param1.toInt(), param2.rawAddress).toUInt()

public actual fun haccelUserUnmarshal(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Haccel>): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalHaccelUserUnmarshal(param0.rawAddress, param1.rawAddress, param2.rawAddress))

public actual fun haccelUserUnmarshal64(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Haccel>): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalHaccelUserUnmarshal64(param0.rawAddress, param1.rawAddress, param2.rawAddress))

public actual fun hbitmapUserFree(param0: ConstPtr<UInt>, param1: ConstPtr<Hbitmap>) {
    WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalHbitmapUserFree(param0.rawAddress, param1.rawAddress)
}

public actual fun hbitmapUserFree64(param0: ConstPtr<UInt>, param1: ConstPtr<Hbitmap>) {
    WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalHbitmapUserFree64(param0.rawAddress, param1.rawAddress)
}

public actual fun hbitmapUserMarshal(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Hbitmap>): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalHbitmapUserMarshal(param0.rawAddress, param1.rawAddress, param2.rawAddress))

public actual fun hbitmapUserMarshal64(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Hbitmap>): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalHbitmapUserMarshal64(param0.rawAddress, param1.rawAddress, param2.rawAddress))

public actual fun hbitmapUserSize(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Hbitmap>): UInt =
    WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalHbitmapUserSize(param0.rawAddress, param1.toInt(), param2.rawAddress).toUInt()

public actual fun hbitmapUserSize64(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Hbitmap>): UInt =
    WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalHbitmapUserSize64(param0.rawAddress, param1.toInt(), param2.rawAddress).toUInt()

public actual fun hbitmapUserUnmarshal(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Hbitmap>): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalHbitmapUserUnmarshal(param0.rawAddress, param1.rawAddress, param2.rawAddress))

public actual fun hbitmapUserUnmarshal64(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Hbitmap>): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalHbitmapUserUnmarshal64(param0.rawAddress, param1.rawAddress, param2.rawAddress))

public actual fun hdcUserFree(param0: ConstPtr<UInt>, param1: ConstPtr<Hdc>) {
    WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalHdcUserFree(param0.rawAddress, param1.rawAddress)
}

public actual fun hdcUserFree64(param0: ConstPtr<UInt>, param1: ConstPtr<Hdc>) {
    WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalHdcUserFree64(param0.rawAddress, param1.rawAddress)
}

public actual fun hdcUserMarshal(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Hdc>): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalHdcUserMarshal(param0.rawAddress, param1.rawAddress, param2.rawAddress))

public actual fun hdcUserMarshal64(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Hdc>): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalHdcUserMarshal64(param0.rawAddress, param1.rawAddress, param2.rawAddress))

public actual fun hdcUserSize(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Hdc>): UInt =
    WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalHdcUserSize(param0.rawAddress, param1.toInt(), param2.rawAddress).toUInt()

public actual fun hdcUserSize64(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Hdc>): UInt =
    WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalHdcUserSize64(param0.rawAddress, param1.toInt(), param2.rawAddress).toUInt()

public actual fun hdcUserUnmarshal(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Hdc>): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalHdcUserUnmarshal(param0.rawAddress, param1.rawAddress, param2.rawAddress))

public actual fun hdcUserUnmarshal64(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Hdc>): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalHdcUserUnmarshal64(param0.rawAddress, param1.rawAddress, param2.rawAddress))

public actual fun hglobalUserFree(param0: ConstPtr<UInt>, param1: ConstPtr<Hglobal>) {
    WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalHglobalUserFree(param0.rawAddress, param1.rawAddress)
}

public actual fun hglobalUserFree64(param0: ConstPtr<UInt>, param1: ConstPtr<Hglobal>) {
    WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalHglobalUserFree64(param0.rawAddress, param1.rawAddress)
}

public actual fun hglobalUserMarshal(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Hglobal>): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalHglobalUserMarshal(param0.rawAddress, param1.rawAddress, param2.rawAddress))

public actual fun hglobalUserMarshal64(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Hglobal>): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalHglobalUserMarshal64(param0.rawAddress, param1.rawAddress, param2.rawAddress))

public actual fun hglobalUserSize(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Hglobal>): UInt =
    WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalHglobalUserSize(param0.rawAddress, param1.toInt(), param2.rawAddress).toUInt()

public actual fun hglobalUserSize64(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Hglobal>): UInt =
    WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalHglobalUserSize64(param0.rawAddress, param1.toInt(), param2.rawAddress).toUInt()

public actual fun hglobalUserUnmarshal(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Hglobal>): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalHglobalUserUnmarshal(param0.rawAddress, param1.rawAddress, param2.rawAddress))

public actual fun hglobalUserUnmarshal64(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Hglobal>): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalHglobalUserUnmarshal64(param0.rawAddress, param1.rawAddress, param2.rawAddress))

public actual fun hiconUserFree(param0: ConstPtr<UInt>, param1: ConstPtr<Hicon>) {
    WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalHiconUserFree(param0.rawAddress, param1.rawAddress)
}

public actual fun hiconUserFree64(param0: ConstPtr<UInt>, param1: ConstPtr<Hicon>) {
    WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalHiconUserFree64(param0.rawAddress, param1.rawAddress)
}

public actual fun hiconUserMarshal(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Hicon>): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalHiconUserMarshal(param0.rawAddress, param1.rawAddress, param2.rawAddress))

public actual fun hiconUserMarshal64(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Hicon>): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalHiconUserMarshal64(param0.rawAddress, param1.rawAddress, param2.rawAddress))

public actual fun hiconUserSize(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Hicon>): UInt =
    WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalHiconUserSize(param0.rawAddress, param1.toInt(), param2.rawAddress).toUInt()

public actual fun hiconUserSize64(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Hicon>): UInt =
    WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalHiconUserSize64(param0.rawAddress, param1.toInt(), param2.rawAddress).toUInt()

public actual fun hiconUserUnmarshal(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Hicon>): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalHiconUserUnmarshal(param0.rawAddress, param1.rawAddress, param2.rawAddress))

public actual fun hiconUserUnmarshal64(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Hicon>): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalHiconUserUnmarshal64(param0.rawAddress, param1.rawAddress, param2.rawAddress))

public actual fun hmenuUserFree(param0: ConstPtr<UInt>, param1: ConstPtr<Hmenu>) {
    WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalHmenuUserFree(param0.rawAddress, param1.rawAddress)
}

public actual fun hmenuUserFree64(param0: ConstPtr<UInt>, param1: ConstPtr<Hmenu>) {
    WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalHmenuUserFree64(param0.rawAddress, param1.rawAddress)
}

public actual fun hmenuUserMarshal(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Hmenu>): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalHmenuUserMarshal(param0.rawAddress, param1.rawAddress, param2.rawAddress))

public actual fun hmenuUserMarshal64(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Hmenu>): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalHmenuUserMarshal64(param0.rawAddress, param1.rawAddress, param2.rawAddress))

public actual fun hmenuUserSize(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Hmenu>): UInt =
    WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalHmenuUserSize(param0.rawAddress, param1.toInt(), param2.rawAddress).toUInt()

public actual fun hmenuUserSize64(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Hmenu>): UInt =
    WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalHmenuUserSize64(param0.rawAddress, param1.toInt(), param2.rawAddress).toUInt()

public actual fun hmenuUserUnmarshal(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Hmenu>): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalHmenuUserUnmarshal(param0.rawAddress, param1.rawAddress, param2.rawAddress))

public actual fun hmenuUserUnmarshal64(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Hmenu>): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalHmenuUserUnmarshal64(param0.rawAddress, param1.rawAddress, param2.rawAddress))

public actual fun hpaletteUserFree(param0: ConstPtr<UInt>, param1: ConstPtr<Hpalette>) {
    WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalHpaletteUserFree(param0.rawAddress, param1.rawAddress)
}

public actual fun hpaletteUserFree64(param0: ConstPtr<UInt>, param1: ConstPtr<Hpalette>) {
    WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalHpaletteUserFree64(param0.rawAddress, param1.rawAddress)
}

public actual fun hpaletteUserMarshal(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Hpalette>): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalHpaletteUserMarshal(param0.rawAddress, param1.rawAddress, param2.rawAddress))

public actual fun hpaletteUserMarshal64(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Hpalette>): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalHpaletteUserMarshal64(param0.rawAddress, param1.rawAddress, param2.rawAddress))

public actual fun hpaletteUserSize(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Hpalette>): UInt =
    WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalHpaletteUserSize(param0.rawAddress, param1.toInt(), param2.rawAddress).toUInt()

public actual fun hpaletteUserSize64(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Hpalette>): UInt =
    WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalHpaletteUserSize64(param0.rawAddress, param1.toInt(), param2.rawAddress).toUInt()

public actual fun hpaletteUserUnmarshal(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Hpalette>): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalHpaletteUserUnmarshal(param0.rawAddress, param1.rawAddress, param2.rawAddress))

public actual fun hpaletteUserUnmarshal64(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Hpalette>): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalHpaletteUserUnmarshal64(param0.rawAddress, param1.rawAddress, param2.rawAddress))

public actual fun hwndUserFree(param0: ConstPtr<UInt>, param1: ConstPtr<Hwnd>) {
    WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalHwndUserFree(param0.rawAddress, param1.rawAddress)
}

public actual fun hwndUserFree64(param0: ConstPtr<UInt>, param1: ConstPtr<Hwnd>) {
    WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalHwndUserFree64(param0.rawAddress, param1.rawAddress)
}

public actual fun hwndUserMarshal(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Hwnd>): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalHwndUserMarshal(param0.rawAddress, param1.rawAddress, param2.rawAddress))

public actual fun hwndUserMarshal64(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Hwnd>): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalHwndUserMarshal64(param0.rawAddress, param1.rawAddress, param2.rawAddress))

public actual fun hwndUserSize(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Hwnd>): UInt =
    WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalHwndUserSize(param0.rawAddress, param1.toInt(), param2.rawAddress).toUInt()

public actual fun hwndUserSize64(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Hwnd>): UInt =
    WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalHwndUserSize64(param0.rawAddress, param1.toInt(), param2.rawAddress).toUInt()

public actual fun hwndUserUnmarshal(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Hwnd>): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalHwndUserUnmarshal(param0.rawAddress, param1.rawAddress, param2.rawAddress))

public actual fun hwndUserUnmarshal64(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Hwnd>): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalHwndUserUnmarshal64(param0.rawAddress, param1.rawAddress, param2.rawAddress))

public actual fun lpsafearrayUserFree(param0: ConstPtr<UInt>, param1: ConstPtr<ConstPtr<Safearray>>) {
    WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalLpsafearrayUserFree(param0.rawAddress, param1.rawAddress)
}

public actual fun lpsafearrayUserFree64(param0: ConstPtr<UInt>, param1: ConstPtr<ConstPtr<Safearray>>) {
    WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalLpsafearrayUserFree64(param0.rawAddress, param1.rawAddress)
}

public actual fun lpsafearrayUserMarshal(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<ConstPtr<Safearray>>): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalLpsafearrayUserMarshal(param0.rawAddress, param1.rawAddress, param2.rawAddress))

public actual fun lpsafearrayUserMarshal64(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<ConstPtr<Safearray>>): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalLpsafearrayUserMarshal64(param0.rawAddress, param1.rawAddress, param2.rawAddress))

public actual fun lpsafearrayUserSize(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<ConstPtr<Safearray>>): UInt =
    WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalLpsafearrayUserSize(param0.rawAddress, param1.toInt(), param2.rawAddress).toUInt()

public actual fun lpsafearrayUserSize64(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<ConstPtr<Safearray>>): UInt =
    WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalLpsafearrayUserSize64(param0.rawAddress, param1.toInt(), param2.rawAddress).toUInt()

public actual fun lpsafearrayUserUnmarshal(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<MutPtr<Safearray>>): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalLpsafearrayUserUnmarshal(param0.rawAddress, param1.rawAddress, param2.rawAddress))

public actual fun lpsafearrayUserUnmarshal64(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<MutPtr<Safearray>>): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalLpsafearrayUserUnmarshal64(param0.rawAddress, param1.rawAddress, param2.rawAddress))

public actual fun snbUserFree(param0: ConstPtr<UInt>, param1: ConstPtr<ConstPtr<ConstPtr<UShort>>>) {
    WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalSnbUserFree(param0.rawAddress, param1.rawAddress)
}

public actual fun snbUserFree64(param0: ConstPtr<UInt>, param1: ConstPtr<ConstPtr<ConstPtr<UShort>>>) {
    WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalSnbUserFree64(param0.rawAddress, param1.rawAddress)
}

public actual fun snbUserMarshal(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<ConstPtr<ConstPtr<UShort>>>): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalSnbUserMarshal(param0.rawAddress, param1.rawAddress, param2.rawAddress))

public actual fun snbUserMarshal64(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<ConstPtr<ConstPtr<UShort>>>): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalSnbUserMarshal64(param0.rawAddress, param1.rawAddress, param2.rawAddress))

public actual fun snbUserSize(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<ConstPtr<ConstPtr<UShort>>>): UInt =
    WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalSnbUserSize(param0.rawAddress, param1.toInt(), param2.rawAddress).toUInt()

public actual fun snbUserSize64(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<ConstPtr<ConstPtr<UShort>>>): UInt =
    WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalSnbUserSize64(param0.rawAddress, param1.toInt(), param2.rawAddress).toUInt()

public actual fun snbUserUnmarshal(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<MutPtr<MutPtr<UShort>>>): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalSnbUserUnmarshal(param0.rawAddress, param1.rawAddress, param2.rawAddress))

public actual fun snbUserUnmarshal64(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<MutPtr<MutPtr<UShort>>>): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalSnbUserUnmarshal64(param0.rawAddress, param1.rawAddress, param2.rawAddress))

public actual fun stgmediumUserFree(param0: ConstPtr<UInt>, param1: ConstPtr<Stgmedium>) {
    WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalStgmediumUserFree(param0.rawAddress, param1.rawAddress)
}

public actual fun stgmediumUserFree64(param0: ConstPtr<UInt>, param1: ConstPtr<Stgmedium>) {
    WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalStgmediumUserFree64(param0.rawAddress, param1.rawAddress)
}

public actual fun stgmediumUserMarshal(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Stgmedium>): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalStgmediumUserMarshal(param0.rawAddress, param1.rawAddress, param2.rawAddress))

public actual fun stgmediumUserMarshal64(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Stgmedium>): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalStgmediumUserMarshal64(param0.rawAddress, param1.rawAddress, param2.rawAddress))

public actual fun stgmediumUserSize(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Stgmedium>): UInt =
    WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalStgmediumUserSize(param0.rawAddress, param1.toInt(), param2.rawAddress).toUInt()

public actual fun stgmediumUserSize64(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Stgmedium>): UInt =
    WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalStgmediumUserSize64(param0.rawAddress, param1.toInt(), param2.rawAddress).toUInt()

public actual fun stgmediumUserUnmarshal(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Stgmedium>): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalStgmediumUserUnmarshal(param0.rawAddress, param1.rawAddress, param2.rawAddress))

public actual fun stgmediumUserUnmarshal64(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Stgmedium>): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemComMarshalJniBridge.windowssysWindowsWin32SystemComMarshalStgmediumUserUnmarshal64(param0.rawAddress, param1.rawAddress, param2.rawAddress))
