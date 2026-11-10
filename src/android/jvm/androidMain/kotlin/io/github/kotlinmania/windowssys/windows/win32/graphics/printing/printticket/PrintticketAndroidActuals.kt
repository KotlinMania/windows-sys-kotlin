@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.graphics.printing.printticket

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr

private object WindowsWin32GraphicsPrintingPrintticketJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_printticket_pTCloseProvider(hprovider: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_printticket_pTConvertDevModeToPrintTicket(hprovider: Long, cbdevmode: Int, pdevmode: Long, scope: Int, pprintticket: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_printticket_pTConvertPrintTicketToDevMode(hprovider: Long, pprintticket: Long, basedevmodetype: Int, scope: Int, pcbdevmode: Long, ppdevmode: Long, pbstrerrormessage: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_printticket_pTGetPrintCapabilities(hprovider: Long, pprintticket: Long, pcapabilities: Long, pbstrerrormessage: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_printticket_pTGetPrintDeviceCapabilities(hprovider: Long, pprintticket: Long, pdevicecapabilities: Long, pbstrerrormessage: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_printticket_pTGetPrintDeviceResources(hprovider: Long, pszlocalename: Long, pprintticket: Long, pdeviceresources: Long, pbstrerrormessage: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_printticket_pTMergeAndValidatePrintTicket(hprovider: Long, pbaseticket: Long, pdeltaticket: Long, scope: Int, presultticket: Long, pbstrerrormessage: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_printticket_pTOpenProvider(pszprintername: Long, dwversion: Int, phprovider: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_printticket_pTOpenProviderEx(pszprintername: Long, dwmaxversion: Int, dwprefversion: Int, phprovider: Long, pusedversion: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_printticket_pTQuerySchemaVersionSupport(pszprintername: Long, pmaxversion: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_printticket_pTReleaseMemory(pbuffer: Long): Int
}

public actual fun pTCloseProvider(hprovider: Hptprovider): Hresult =
    WindowsWin32GraphicsPrintingPrintticketJniBridge.windowssys_windows_win32_graphics_printing_printticket_pTCloseProvider((hprovider?.value ?: 0L))

public actual fun pTConvertDevModeToPrintTicket(hprovider: Hptprovider, cbdevmode: UInt, pdevmode: COpaquePointer?, scope: EPrintTicketScope, pprintticket: COpaquePointer?): Hresult =
    WindowsWin32GraphicsPrintingPrintticketJniBridge.windowssys_windows_win32_graphics_printing_printticket_pTConvertDevModeToPrintTicket((hprovider?.value ?: 0L), cbdevmode.toInt(), (pdevmode?.value ?: 0L), scope, (pprintticket?.value ?: 0L))

public actual fun pTConvertPrintTicketToDevMode(hprovider: Hptprovider, pprintticket: COpaquePointer?, basedevmodetype: EDefaultDevmodeType, scope: EPrintTicketScope, pcbdevmode: COpaquePointer?, ppdevmode: COpaquePointer?, pbstrerrormessage: COpaquePointer?): Hresult =
    WindowsWin32GraphicsPrintingPrintticketJniBridge.windowssys_windows_win32_graphics_printing_printticket_pTConvertPrintTicketToDevMode((hprovider?.value ?: 0L), (pprintticket?.value ?: 0L), basedevmodetype, scope, (pcbdevmode?.value ?: 0L), (ppdevmode?.value ?: 0L), (pbstrerrormessage?.value ?: 0L))

public actual fun pTGetPrintCapabilities(hprovider: Hptprovider, pprintticket: COpaquePointer?, pcapabilities: COpaquePointer?, pbstrerrormessage: COpaquePointer?): Hresult =
    WindowsWin32GraphicsPrintingPrintticketJniBridge.windowssys_windows_win32_graphics_printing_printticket_pTGetPrintCapabilities((hprovider?.value ?: 0L), (pprintticket?.value ?: 0L), (pcapabilities?.value ?: 0L), (pbstrerrormessage?.value ?: 0L))

public actual fun pTGetPrintDeviceCapabilities(hprovider: Hptprovider, pprintticket: COpaquePointer?, pdevicecapabilities: COpaquePointer?, pbstrerrormessage: COpaquePointer?): Hresult =
    WindowsWin32GraphicsPrintingPrintticketJniBridge.windowssys_windows_win32_graphics_printing_printticket_pTGetPrintDeviceCapabilities((hprovider?.value ?: 0L), (pprintticket?.value ?: 0L), (pdevicecapabilities?.value ?: 0L), (pbstrerrormessage?.value ?: 0L))

public actual fun pTGetPrintDeviceResources(hprovider: Hptprovider, pszlocalename: Pcwstr, pprintticket: COpaquePointer?, pdeviceresources: COpaquePointer?, pbstrerrormessage: COpaquePointer?): Hresult =
    WindowsWin32GraphicsPrintingPrintticketJniBridge.windowssys_windows_win32_graphics_printing_printticket_pTGetPrintDeviceResources((hprovider?.value ?: 0L), (pszlocalename?.value ?: 0L), (pprintticket?.value ?: 0L), (pdeviceresources?.value ?: 0L), (pbstrerrormessage?.value ?: 0L))

public actual fun pTMergeAndValidatePrintTicket(hprovider: Hptprovider, pbaseticket: COpaquePointer?, pdeltaticket: COpaquePointer?, scope: EPrintTicketScope, presultticket: COpaquePointer?, pbstrerrormessage: COpaquePointer?): Hresult =
    WindowsWin32GraphicsPrintingPrintticketJniBridge.windowssys_windows_win32_graphics_printing_printticket_pTMergeAndValidatePrintTicket((hprovider?.value ?: 0L), (pbaseticket?.value ?: 0L), (pdeltaticket?.value ?: 0L), scope, (presultticket?.value ?: 0L), (pbstrerrormessage?.value ?: 0L))

public actual fun pTOpenProvider(pszprintername: Pcwstr, dwversion: UInt, phprovider: COpaquePointer?): Hresult =
    WindowsWin32GraphicsPrintingPrintticketJniBridge.windowssys_windows_win32_graphics_printing_printticket_pTOpenProvider((pszprintername?.value ?: 0L), dwversion.toInt(), (phprovider?.value ?: 0L))

public actual fun pTOpenProviderEx(pszprintername: Pcwstr, dwmaxversion: UInt, dwprefversion: UInt, phprovider: COpaquePointer?, pusedversion: COpaquePointer?): Hresult =
    WindowsWin32GraphicsPrintingPrintticketJniBridge.windowssys_windows_win32_graphics_printing_printticket_pTOpenProviderEx((pszprintername?.value ?: 0L), dwmaxversion.toInt(), dwprefversion.toInt(), (phprovider?.value ?: 0L), (pusedversion?.value ?: 0L))

public actual fun pTQuerySchemaVersionSupport(pszprintername: Pcwstr, pmaxversion: COpaquePointer?): Hresult =
    WindowsWin32GraphicsPrintingPrintticketJniBridge.windowssys_windows_win32_graphics_printing_printticket_pTQuerySchemaVersionSupport((pszprintername?.value ?: 0L), (pmaxversion?.value ?: 0L))

public actual fun pTReleaseMemory(pbuffer: COpaquePointer?): Hresult =
    WindowsWin32GraphicsPrintingPrintticketJniBridge.windowssys_windows_win32_graphics_printing_printticket_pTReleaseMemory((pbuffer?.value ?: 0L))
