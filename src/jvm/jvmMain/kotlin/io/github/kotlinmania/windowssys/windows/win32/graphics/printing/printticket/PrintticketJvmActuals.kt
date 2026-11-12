@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.graphics.printing.printticket

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr

private object WindowsWin32GraphicsPrintingPrintticketJniBridge {
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
        val stream = WindowsWin32GraphicsPrintingPrintticketJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
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
    external fun windowssysWindowsWin32GraphicsPrintingPrintticketPTCloseProvider(hprovider: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingPrintticketPTConvertDevModeToPrintTicket(hprovider: Long, cbdevmode: Int, pdevmode: Long, scope: Int, pprintticket: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingPrintticketPTConvertPrintTicketToDevMode(hprovider: Long, pprintticket: Long, basedevmodetype: Int, scope: Int, pcbdevmode: Long, ppdevmode: Long, pbstrerrormessage: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingPrintticketPTGetPrintCapabilities(hprovider: Long, pprintticket: Long, pcapabilities: Long, pbstrerrormessage: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingPrintticketPTGetPrintDeviceCapabilities(hprovider: Long, pprintticket: Long, pdevicecapabilities: Long, pbstrerrormessage: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingPrintticketPTGetPrintDeviceResources(hprovider: Long, pszlocalename: Long, pprintticket: Long, pdeviceresources: Long, pbstrerrormessage: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingPrintticketPTMergeAndValidatePrintTicket(hprovider: Long, pbaseticket: Long, pdeltaticket: Long, scope: Int, presultticket: Long, pbstrerrormessage: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingPrintticketPTOpenProvider(pszprintername: Long, dwversion: Int, phprovider: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingPrintticketPTOpenProviderEx(pszprintername: Long, dwmaxversion: Int, dwprefversion: Int, phprovider: Long, pusedversion: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingPrintticketPTQuerySchemaVersionSupport(pszprintername: Long, pmaxversion: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingPrintticketPTReleaseMemory(pbuffer: Long): Int
}

public actual fun pTCloseProvider(hprovider: Hptprovider): Hresult =
    WindowsWin32GraphicsPrintingPrintticketJniBridge.windowssysWindowsWin32GraphicsPrintingPrintticketPTCloseProvider(hprovider.rawAddress)

public actual fun pTConvertDevModeToPrintTicket(hprovider: Hptprovider, cbdevmode: UInt, pdevmode: ConstPtr, scope: EPrintTicketScope, pprintticket: MutPtr): Hresult =
    WindowsWin32GraphicsPrintingPrintticketJniBridge.windowssysWindowsWin32GraphicsPrintingPrintticketPTConvertDevModeToPrintTicket(hprovider.rawAddress, cbdevmode.toInt(), pdevmode.rawAddress, scope, pprintticket.rawAddress)

public actual fun pTConvertPrintTicketToDevMode(hprovider: Hptprovider, pprintticket: MutPtr, basedevmodetype: EDefaultDevmodeType, scope: EPrintTicketScope, pcbdevmode: MutPtr, ppdevmode: MutPtr, pbstrerrormessage: MutPtr): Hresult =
    WindowsWin32GraphicsPrintingPrintticketJniBridge.windowssysWindowsWin32GraphicsPrintingPrintticketPTConvertPrintTicketToDevMode(hprovider.rawAddress, pprintticket.rawAddress, basedevmodetype, scope, pcbdevmode.rawAddress, ppdevmode.rawAddress, pbstrerrormessage.rawAddress)

public actual fun pTGetPrintCapabilities(hprovider: Hptprovider, pprintticket: MutPtr, pcapabilities: MutPtr, pbstrerrormessage: MutPtr): Hresult =
    WindowsWin32GraphicsPrintingPrintticketJniBridge.windowssysWindowsWin32GraphicsPrintingPrintticketPTGetPrintCapabilities(hprovider.rawAddress, pprintticket.rawAddress, pcapabilities.rawAddress, pbstrerrormessage.rawAddress)

public actual fun pTGetPrintDeviceCapabilities(hprovider: Hptprovider, pprintticket: MutPtr, pdevicecapabilities: MutPtr, pbstrerrormessage: MutPtr): Hresult =
    WindowsWin32GraphicsPrintingPrintticketJniBridge.windowssysWindowsWin32GraphicsPrintingPrintticketPTGetPrintDeviceCapabilities(hprovider.rawAddress, pprintticket.rawAddress, pdevicecapabilities.rawAddress, pbstrerrormessage.rawAddress)

public actual fun pTGetPrintDeviceResources(hprovider: Hptprovider, pszlocalename: Pcwstr, pprintticket: MutPtr, pdeviceresources: MutPtr, pbstrerrormessage: MutPtr): Hresult =
    WindowsWin32GraphicsPrintingPrintticketJniBridge.windowssysWindowsWin32GraphicsPrintingPrintticketPTGetPrintDeviceResources(hprovider.rawAddress, pszlocalename.rawAddress, pprintticket.rawAddress, pdeviceresources.rawAddress, pbstrerrormessage.rawAddress)

public actual fun pTMergeAndValidatePrintTicket(hprovider: Hptprovider, pbaseticket: MutPtr, pdeltaticket: MutPtr, scope: EPrintTicketScope, presultticket: MutPtr, pbstrerrormessage: MutPtr): Hresult =
    WindowsWin32GraphicsPrintingPrintticketJniBridge.windowssysWindowsWin32GraphicsPrintingPrintticketPTMergeAndValidatePrintTicket(hprovider.rawAddress, pbaseticket.rawAddress, pdeltaticket.rawAddress, scope, presultticket.rawAddress, pbstrerrormessage.rawAddress)

public actual fun pTOpenProvider(pszprintername: Pcwstr, dwversion: UInt, phprovider: MutPtr): Hresult =
    WindowsWin32GraphicsPrintingPrintticketJniBridge.windowssysWindowsWin32GraphicsPrintingPrintticketPTOpenProvider(pszprintername.rawAddress, dwversion.toInt(), phprovider.rawAddress)

public actual fun pTOpenProviderEx(pszprintername: Pcwstr, dwmaxversion: UInt, dwprefversion: UInt, phprovider: MutPtr, pusedversion: MutPtr): Hresult =
    WindowsWin32GraphicsPrintingPrintticketJniBridge.windowssysWindowsWin32GraphicsPrintingPrintticketPTOpenProviderEx(pszprintername.rawAddress, dwmaxversion.toInt(), dwprefversion.toInt(), phprovider.rawAddress, pusedversion.rawAddress)

public actual fun pTQuerySchemaVersionSupport(pszprintername: Pcwstr, pmaxversion: MutPtr): Hresult =
    WindowsWin32GraphicsPrintingPrintticketJniBridge.windowssysWindowsWin32GraphicsPrintingPrintticketPTQuerySchemaVersionSupport(pszprintername.rawAddress, pmaxversion.rawAddress)

public actual fun pTReleaseMemory(pbuffer: ConstPtr): Hresult =
    WindowsWin32GraphicsPrintingPrintticketJniBridge.windowssysWindowsWin32GraphicsPrintingPrintticketPTReleaseMemory(pbuffer.rawAddress)
