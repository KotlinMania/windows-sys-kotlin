@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.distributedtransactioncoordinator

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr

private object WindowsWin32SystemDistributedtransactioncoordinatorJniBridge {
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
        val stream = WindowsWin32SystemDistributedtransactioncoordinatorJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
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
    external fun windowssysWindowsWin32SystemDistributedtransactioncoordinatorDtcGetTransactionManager(iPszhost: Long, iPsztmname: Long, iRiid: Long, iDwreserved1: Int, iWcbreserved2: Short, iPvreserved2: Long, oPpvobject: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDistributedtransactioncoordinatorDtcGetTransactionManagerC(iPszhost: Long, iPsztmname: Long, iRiid: Long, iDwreserved1: Int, iWcbreserved2: Short, iPvreserved2: Long, oPpvobject: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDistributedtransactioncoordinatorDtcGetTransactionManagerExA(iPszhost: Long, iPsztmname: Long, iRiid: Long, iGrfoptions: Int, iPvconfigparams: Long, oPpvobject: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDistributedtransactioncoordinatorDtcGetTransactionManagerExW(iPwszhost: Long, iPwsztmname: Long, iRiid: Long, iGrfoptions: Int, iPvconfigparams: Long, oPpvobject: Long): Int
}

public actual fun dtcGetTransactionManager(iPszhost: Pcstr, iPsztmname: Pcstr, iRiid: ConstPtr, iDwreserved1: UInt, iWcbreserved2: UShort, iPvreserved2: ConstPtr, oPpvobject: MutPtr): Hresult =
    WindowsWin32SystemDistributedtransactioncoordinatorJniBridge.windowssysWindowsWin32SystemDistributedtransactioncoordinatorDtcGetTransactionManager(iPszhost.rawAddress, iPsztmname.rawAddress, iRiid.rawAddress, iDwreserved1.toInt(), iWcbreserved2.toShort(), iPvreserved2.rawAddress, oPpvobject.rawAddress)

public actual fun dtcGetTransactionManagerC(iPszhost: Pcstr, iPsztmname: Pcstr, iRiid: ConstPtr, iDwreserved1: UInt, iWcbreserved2: UShort, iPvreserved2: ConstPtr, oPpvobject: MutPtr): Hresult =
    WindowsWin32SystemDistributedtransactioncoordinatorJniBridge.windowssysWindowsWin32SystemDistributedtransactioncoordinatorDtcGetTransactionManagerC(iPszhost.rawAddress, iPsztmname.rawAddress, iRiid.rawAddress, iDwreserved1.toInt(), iWcbreserved2.toShort(), iPvreserved2.rawAddress, oPpvobject.rawAddress)

public actual fun dtcGetTransactionManagerExA(iPszhost: Pcstr, iPsztmname: Pcstr, iRiid: ConstPtr, iGrfoptions: UInt, iPvconfigparams: MutPtr, oPpvobject: MutPtr): Hresult =
    WindowsWin32SystemDistributedtransactioncoordinatorJniBridge.windowssysWindowsWin32SystemDistributedtransactioncoordinatorDtcGetTransactionManagerExA(iPszhost.rawAddress, iPsztmname.rawAddress, iRiid.rawAddress, iGrfoptions.toInt(), iPvconfigparams.rawAddress, oPpvobject.rawAddress)

public actual fun dtcGetTransactionManagerExW(iPwszhost: Pcwstr, iPwsztmname: Pcwstr, iRiid: ConstPtr, iGrfoptions: UInt, iPvconfigparams: MutPtr, oPpvobject: MutPtr): Hresult =
    WindowsWin32SystemDistributedtransactioncoordinatorJniBridge.windowssysWindowsWin32SystemDistributedtransactioncoordinatorDtcGetTransactionManagerExW(iPwszhost.rawAddress, iPwsztmname.rawAddress, iRiid.rawAddress, iGrfoptions.toInt(), iPvconfigparams.rawAddress, oPpvobject.rawAddress)
