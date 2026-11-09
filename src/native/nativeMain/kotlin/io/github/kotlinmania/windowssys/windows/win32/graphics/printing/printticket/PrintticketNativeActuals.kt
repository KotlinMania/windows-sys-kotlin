@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.graphics.printing.printticket

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun PTCloseProvider(hprovider: HPTPROVIDER): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.printticket.cinterop.windowssys_windows_win32_graphics_printing_printticket_PTCloseProvider(hprovider.toCPointer<ByteVar>())

public actual fun PTConvertDevModeToPrintTicket(hprovider: HPTPROVIDER, cbdevmode: UInt, pdevmode: Long, scope: EPrintTicketScope, pprintticket: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.printticket.cinterop.windowssys_windows_win32_graphics_printing_printticket_PTConvertDevModeToPrintTicket(hprovider.toCPointer<ByteVar>(), cbdevmode, pdevmode.toCPointer<ByteVar>(), scope, pprintticket.toCPointer<ByteVar>())

public actual fun PTConvertPrintTicketToDevMode(hprovider: HPTPROVIDER, pprintticket: Long, basedevmodetype: EDefaultDevmodeType, scope: EPrintTicketScope, pcbdevmode: Long, ppdevmode: Long, pbstrerrormessage: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.printticket.cinterop.windowssys_windows_win32_graphics_printing_printticket_PTConvertPrintTicketToDevMode(hprovider.toCPointer<ByteVar>(), pprintticket.toCPointer<ByteVar>(), basedevmodetype, scope, pcbdevmode.toCPointer<ByteVar>(), ppdevmode.toCPointer<ByteVar>(), pbstrerrormessage.toCPointer<ByteVar>())

public actual fun PTGetPrintCapabilities(hprovider: HPTPROVIDER, pprintticket: Long, pcapabilities: Long, pbstrerrormessage: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.printticket.cinterop.windowssys_windows_win32_graphics_printing_printticket_PTGetPrintCapabilities(hprovider.toCPointer<ByteVar>(), pprintticket.toCPointer<ByteVar>(), pcapabilities.toCPointer<ByteVar>(), pbstrerrormessage.toCPointer<ByteVar>())

public actual fun PTGetPrintDeviceCapabilities(hprovider: HPTPROVIDER, pprintticket: Long, pdevicecapabilities: Long, pbstrerrormessage: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.printticket.cinterop.windowssys_windows_win32_graphics_printing_printticket_PTGetPrintDeviceCapabilities(hprovider.toCPointer<ByteVar>(), pprintticket.toCPointer<ByteVar>(), pdevicecapabilities.toCPointer<ByteVar>(), pbstrerrormessage.toCPointer<ByteVar>())

public actual fun PTGetPrintDeviceResources(hprovider: HPTPROVIDER, pszlocalename: PCWSTR, pprintticket: Long, pdeviceresources: Long, pbstrerrormessage: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.printticket.cinterop.windowssys_windows_win32_graphics_printing_printticket_PTGetPrintDeviceResources(hprovider.toCPointer<ByteVar>(), pszlocalename.toCPointer<ByteVar>(), pprintticket.toCPointer<ByteVar>(), pdeviceresources.toCPointer<ByteVar>(), pbstrerrormessage.toCPointer<ByteVar>())

public actual fun PTMergeAndValidatePrintTicket(hprovider: HPTPROVIDER, pbaseticket: Long, pdeltaticket: Long, scope: EPrintTicketScope, presultticket: Long, pbstrerrormessage: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.printticket.cinterop.windowssys_windows_win32_graphics_printing_printticket_PTMergeAndValidatePrintTicket(hprovider.toCPointer<ByteVar>(), pbaseticket.toCPointer<ByteVar>(), pdeltaticket.toCPointer<ByteVar>(), scope, presultticket.toCPointer<ByteVar>(), pbstrerrormessage.toCPointer<ByteVar>())

public actual fun PTOpenProvider(pszprintername: PCWSTR, dwversion: UInt, phprovider: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.printticket.cinterop.windowssys_windows_win32_graphics_printing_printticket_PTOpenProvider(pszprintername.toCPointer<ByteVar>(), dwversion, phprovider.toCPointer<ByteVar>())

public actual fun PTOpenProviderEx(pszprintername: PCWSTR, dwmaxversion: UInt, dwprefversion: UInt, phprovider: Long, pusedversion: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.printticket.cinterop.windowssys_windows_win32_graphics_printing_printticket_PTOpenProviderEx(pszprintername.toCPointer<ByteVar>(), dwmaxversion, dwprefversion, phprovider.toCPointer<ByteVar>(), pusedversion.toCPointer<ByteVar>())

public actual fun PTQuerySchemaVersionSupport(pszprintername: PCWSTR, pmaxversion: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.printticket.cinterop.windowssys_windows_win32_graphics_printing_printticket_PTQuerySchemaVersionSupport(pszprintername.toCPointer<ByteVar>(), pmaxversion.toCPointer<ByteVar>())

public actual fun PTReleaseMemory(pbuffer: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.printticket.cinterop.windowssys_windows_win32_graphics_printing_printticket_PTReleaseMemory(pbuffer.toCPointer<ByteVar>())
