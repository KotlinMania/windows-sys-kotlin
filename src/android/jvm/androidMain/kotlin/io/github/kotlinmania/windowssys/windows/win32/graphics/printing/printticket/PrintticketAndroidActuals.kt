@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.graphics.printing.printticket

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR

private object WindowsWin32GraphicsPrintingPrintticketJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_printticket_PTCloseProvider(hprovider: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_printticket_PTConvertDevModeToPrintTicket(hprovider: Long, cbdevmode: Int, pdevmode: Long, scope: Int, pprintticket: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_printticket_PTConvertPrintTicketToDevMode(hprovider: Long, pprintticket: Long, basedevmodetype: Int, scope: Int, pcbdevmode: Long, ppdevmode: Long, pbstrerrormessage: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_printticket_PTGetPrintCapabilities(hprovider: Long, pprintticket: Long, pcapabilities: Long, pbstrerrormessage: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_printticket_PTGetPrintDeviceCapabilities(hprovider: Long, pprintticket: Long, pdevicecapabilities: Long, pbstrerrormessage: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_printticket_PTGetPrintDeviceResources(hprovider: Long, pszlocalename: Long, pprintticket: Long, pdeviceresources: Long, pbstrerrormessage: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_printticket_PTMergeAndValidatePrintTicket(hprovider: Long, pbaseticket: Long, pdeltaticket: Long, scope: Int, presultticket: Long, pbstrerrormessage: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_printticket_PTOpenProvider(pszprintername: Long, dwversion: Int, phprovider: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_printticket_PTOpenProviderEx(pszprintername: Long, dwmaxversion: Int, dwprefversion: Int, phprovider: Long, pusedversion: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_printticket_PTQuerySchemaVersionSupport(pszprintername: Long, pmaxversion: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_printticket_PTReleaseMemory(pbuffer: Long): Int
}

public actual fun PTCloseProvider(hprovider: HPTPROVIDER): HRESULT =
    WindowsWin32GraphicsPrintingPrintticketJniBridge.windowssys_windows_win32_graphics_printing_printticket_PTCloseProvider(hprovider)

public actual fun PTConvertDevModeToPrintTicket(hprovider: HPTPROVIDER, cbdevmode: UInt, pdevmode: Long, scope: EPrintTicketScope, pprintticket: Long): HRESULT =
    WindowsWin32GraphicsPrintingPrintticketJniBridge.windowssys_windows_win32_graphics_printing_printticket_PTConvertDevModeToPrintTicket(hprovider, cbdevmode.toInt(), pdevmode, scope, pprintticket)

public actual fun PTConvertPrintTicketToDevMode(hprovider: HPTPROVIDER, pprintticket: Long, basedevmodetype: EDefaultDevmodeType, scope: EPrintTicketScope, pcbdevmode: Long, ppdevmode: Long, pbstrerrormessage: Long): HRESULT =
    WindowsWin32GraphicsPrintingPrintticketJniBridge.windowssys_windows_win32_graphics_printing_printticket_PTConvertPrintTicketToDevMode(hprovider, pprintticket, basedevmodetype, scope, pcbdevmode, ppdevmode, pbstrerrormessage)

public actual fun PTGetPrintCapabilities(hprovider: HPTPROVIDER, pprintticket: Long, pcapabilities: Long, pbstrerrormessage: Long): HRESULT =
    WindowsWin32GraphicsPrintingPrintticketJniBridge.windowssys_windows_win32_graphics_printing_printticket_PTGetPrintCapabilities(hprovider, pprintticket, pcapabilities, pbstrerrormessage)

public actual fun PTGetPrintDeviceCapabilities(hprovider: HPTPROVIDER, pprintticket: Long, pdevicecapabilities: Long, pbstrerrormessage: Long): HRESULT =
    WindowsWin32GraphicsPrintingPrintticketJniBridge.windowssys_windows_win32_graphics_printing_printticket_PTGetPrintDeviceCapabilities(hprovider, pprintticket, pdevicecapabilities, pbstrerrormessage)

public actual fun PTGetPrintDeviceResources(hprovider: HPTPROVIDER, pszlocalename: PCWSTR, pprintticket: Long, pdeviceresources: Long, pbstrerrormessage: Long): HRESULT =
    WindowsWin32GraphicsPrintingPrintticketJniBridge.windowssys_windows_win32_graphics_printing_printticket_PTGetPrintDeviceResources(hprovider, pszlocalename, pprintticket, pdeviceresources, pbstrerrormessage)

public actual fun PTMergeAndValidatePrintTicket(hprovider: HPTPROVIDER, pbaseticket: Long, pdeltaticket: Long, scope: EPrintTicketScope, presultticket: Long, pbstrerrormessage: Long): HRESULT =
    WindowsWin32GraphicsPrintingPrintticketJniBridge.windowssys_windows_win32_graphics_printing_printticket_PTMergeAndValidatePrintTicket(hprovider, pbaseticket, pdeltaticket, scope, presultticket, pbstrerrormessage)

public actual fun PTOpenProvider(pszprintername: PCWSTR, dwversion: UInt, phprovider: Long): HRESULT =
    WindowsWin32GraphicsPrintingPrintticketJniBridge.windowssys_windows_win32_graphics_printing_printticket_PTOpenProvider(pszprintername, dwversion.toInt(), phprovider)

public actual fun PTOpenProviderEx(pszprintername: PCWSTR, dwmaxversion: UInt, dwprefversion: UInt, phprovider: Long, pusedversion: Long): HRESULT =
    WindowsWin32GraphicsPrintingPrintticketJniBridge.windowssys_windows_win32_graphics_printing_printticket_PTOpenProviderEx(pszprintername, dwmaxversion.toInt(), dwprefversion.toInt(), phprovider, pusedversion)

public actual fun PTQuerySchemaVersionSupport(pszprintername: PCWSTR, pmaxversion: Long): HRESULT =
    WindowsWin32GraphicsPrintingPrintticketJniBridge.windowssys_windows_win32_graphics_printing_printticket_PTQuerySchemaVersionSupport(pszprintername, pmaxversion)

public actual fun PTReleaseMemory(pbuffer: Long): HRESULT =
    WindowsWin32GraphicsPrintingPrintticketJniBridge.windowssys_windows_win32_graphics_printing_printticket_PTReleaseMemory(pbuffer)
