@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.graphics.printing.printticket

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.printticket.cinterop.windowssys_windows_win32_graphics_printing_printticket_pTCloseProvider
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.printticket.cinterop.windowssys_windows_win32_graphics_printing_printticket_pTConvertDevModeToPrintTicket
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.printticket.cinterop.windowssys_windows_win32_graphics_printing_printticket_pTConvertPrintTicketToDevMode
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.printticket.cinterop.windowssys_windows_win32_graphics_printing_printticket_pTGetPrintCapabilities
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.printticket.cinterop.windowssys_windows_win32_graphics_printing_printticket_pTGetPrintDeviceCapabilities
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.printticket.cinterop.windowssys_windows_win32_graphics_printing_printticket_pTGetPrintDeviceResources
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.printticket.cinterop.windowssys_windows_win32_graphics_printing_printticket_pTMergeAndValidatePrintTicket
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.printticket.cinterop.windowssys_windows_win32_graphics_printing_printticket_pTOpenProvider
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.printticket.cinterop.windowssys_windows_win32_graphics_printing_printticket_pTOpenProviderEx
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.printticket.cinterop.windowssys_windows_win32_graphics_printing_printticket_pTQuerySchemaVersionSupport
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.printticket.cinterop.windowssys_windows_win32_graphics_printing_printticket_pTReleaseMemory
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun pTCloseProvider(hprovider: Hptprovider): Hresult =
    windowssys_windows_win32_graphics_printing_printticket_pTCloseProvider(hprovider?.value?.toCPointer<ByteVar>())

public actual fun pTConvertDevModeToPrintTicket(hprovider: Hptprovider, cbdevmode: UInt, pdevmode: COpaquePointer?, scope: EPrintTicketScope, pprintticket: COpaquePointer?): Hresult =
    windowssys_windows_win32_graphics_printing_printticket_pTConvertDevModeToPrintTicket(hprovider?.value?.toCPointer<ByteVar>(), cbdevmode, pdevmode?.value?.toCPointer<ByteVar>(), scope, pprintticket?.value?.toCPointer<ByteVar>())

public actual fun pTConvertPrintTicketToDevMode(hprovider: Hptprovider, pprintticket: COpaquePointer?, basedevmodetype: EDefaultDevmodeType, scope: EPrintTicketScope, pcbdevmode: COpaquePointer?, ppdevmode: COpaquePointer?, pbstrerrormessage: COpaquePointer?): Hresult =
    windowssys_windows_win32_graphics_printing_printticket_pTConvertPrintTicketToDevMode(hprovider?.value?.toCPointer<ByteVar>(), pprintticket?.value?.toCPointer<ByteVar>(), basedevmodetype, scope, pcbdevmode?.value?.toCPointer<ByteVar>(), ppdevmode?.value?.toCPointer<ByteVar>(), pbstrerrormessage?.value?.toCPointer<ByteVar>())

public actual fun pTGetPrintCapabilities(hprovider: Hptprovider, pprintticket: COpaquePointer?, pcapabilities: COpaquePointer?, pbstrerrormessage: COpaquePointer?): Hresult =
    windowssys_windows_win32_graphics_printing_printticket_pTGetPrintCapabilities(hprovider?.value?.toCPointer<ByteVar>(), pprintticket?.value?.toCPointer<ByteVar>(), pcapabilities?.value?.toCPointer<ByteVar>(), pbstrerrormessage?.value?.toCPointer<ByteVar>())

public actual fun pTGetPrintDeviceCapabilities(hprovider: Hptprovider, pprintticket: COpaquePointer?, pdevicecapabilities: COpaquePointer?, pbstrerrormessage: COpaquePointer?): Hresult =
    windowssys_windows_win32_graphics_printing_printticket_pTGetPrintDeviceCapabilities(hprovider?.value?.toCPointer<ByteVar>(), pprintticket?.value?.toCPointer<ByteVar>(), pdevicecapabilities?.value?.toCPointer<ByteVar>(), pbstrerrormessage?.value?.toCPointer<ByteVar>())

public actual fun pTGetPrintDeviceResources(hprovider: Hptprovider, pszlocalename: Pcwstr, pprintticket: COpaquePointer?, pdeviceresources: COpaquePointer?, pbstrerrormessage: COpaquePointer?): Hresult =
    windowssys_windows_win32_graphics_printing_printticket_pTGetPrintDeviceResources(hprovider?.value?.toCPointer<ByteVar>(), pszlocalename?.value?.toCPointer<ByteVar>(), pprintticket?.value?.toCPointer<ByteVar>(), pdeviceresources?.value?.toCPointer<ByteVar>(), pbstrerrormessage?.value?.toCPointer<ByteVar>())

public actual fun pTMergeAndValidatePrintTicket(hprovider: Hptprovider, pbaseticket: COpaquePointer?, pdeltaticket: COpaquePointer?, scope: EPrintTicketScope, presultticket: COpaquePointer?, pbstrerrormessage: COpaquePointer?): Hresult =
    windowssys_windows_win32_graphics_printing_printticket_pTMergeAndValidatePrintTicket(hprovider?.value?.toCPointer<ByteVar>(), pbaseticket?.value?.toCPointer<ByteVar>(), pdeltaticket?.value?.toCPointer<ByteVar>(), scope, presultticket?.value?.toCPointer<ByteVar>(), pbstrerrormessage?.value?.toCPointer<ByteVar>())

public actual fun pTOpenProvider(pszprintername: Pcwstr, dwversion: UInt, phprovider: COpaquePointer?): Hresult =
    windowssys_windows_win32_graphics_printing_printticket_pTOpenProvider(pszprintername?.value?.toCPointer<ByteVar>(), dwversion, phprovider?.value?.toCPointer<ByteVar>())

public actual fun pTOpenProviderEx(pszprintername: Pcwstr, dwmaxversion: UInt, dwprefversion: UInt, phprovider: COpaquePointer?, pusedversion: COpaquePointer?): Hresult =
    windowssys_windows_win32_graphics_printing_printticket_pTOpenProviderEx(pszprintername?.value?.toCPointer<ByteVar>(), dwmaxversion, dwprefversion, phprovider?.value?.toCPointer<ByteVar>(), pusedversion?.value?.toCPointer<ByteVar>())

public actual fun pTQuerySchemaVersionSupport(pszprintername: Pcwstr, pmaxversion: COpaquePointer?): Hresult =
    windowssys_windows_win32_graphics_printing_printticket_pTQuerySchemaVersionSupport(pszprintername?.value?.toCPointer<ByteVar>(), pmaxversion?.value?.toCPointer<ByteVar>())

public actual fun pTReleaseMemory(pbuffer: COpaquePointer?): Hresult =
    windowssys_windows_win32_graphics_printing_printticket_pTReleaseMemory(pbuffer?.value?.toCPointer<ByteVar>())
