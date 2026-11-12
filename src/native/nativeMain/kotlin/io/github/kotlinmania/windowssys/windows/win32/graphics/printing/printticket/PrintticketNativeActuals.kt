@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.graphics.printing.printticket

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bstr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Devmodea
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.printticket.cinterop.windowssysWindowsWin32GraphicsPrintingPrintticketPTCloseProvider
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.printticket.cinterop.windowssysWindowsWin32GraphicsPrintingPrintticketPTConvertDevModeToPrintTicket
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.printticket.cinterop.windowssysWindowsWin32GraphicsPrintingPrintticketPTConvertPrintTicketToDevMode
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.printticket.cinterop.windowssysWindowsWin32GraphicsPrintingPrintticketPTGetPrintCapabilities
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.printticket.cinterop.windowssysWindowsWin32GraphicsPrintingPrintticketPTGetPrintDeviceCapabilities
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.printticket.cinterop.windowssysWindowsWin32GraphicsPrintingPrintticketPTGetPrintDeviceResources
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.printticket.cinterop.windowssysWindowsWin32GraphicsPrintingPrintticketPTMergeAndValidatePrintTicket
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.printticket.cinterop.windowssysWindowsWin32GraphicsPrintingPrintticketPTOpenProvider
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.printticket.cinterop.windowssysWindowsWin32GraphicsPrintingPrintticketPTOpenProviderEx
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.printticket.cinterop.windowssysWindowsWin32GraphicsPrintingPrintticketPTQuerySchemaVersionSupport
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.printticket.cinterop.windowssysWindowsWin32GraphicsPrintingPrintticketPTReleaseMemory
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun pTCloseProvider(hprovider: Hptprovider): Hresult =
    windowssysWindowsWin32GraphicsPrintingPrintticketPTCloseProvider(hprovider.rawAddress.toCPointer<ByteVar>())

public actual fun pTConvertDevModeToPrintTicket(hprovider: Hptprovider, cbdevmode: UInt, pdevmode: ConstPtr<Devmodea>, scope: EPrintTicketScope, pprintticket: MutPtr<CVoid>): Hresult =
    windowssysWindowsWin32GraphicsPrintingPrintticketPTConvertDevModeToPrintTicket(hprovider.rawAddress.toCPointer<ByteVar>(), cbdevmode, pdevmode.rawAddress.toCPointer<ByteVar>(), scope, pprintticket.rawAddress.toCPointer<ByteVar>())

public actual fun pTConvertPrintTicketToDevMode(hprovider: Hptprovider, pprintticket: MutPtr<CVoid>, basedevmodetype: EDefaultDevmodeType, scope: EPrintTicketScope, pcbdevmode: MutPtr<UInt>, ppdevmode: MutPtr<MutPtr<Devmodea>>, pbstrerrormessage: MutPtr<Bstr>): Hresult =
    windowssysWindowsWin32GraphicsPrintingPrintticketPTConvertPrintTicketToDevMode(hprovider.rawAddress.toCPointer<ByteVar>(), pprintticket.rawAddress.toCPointer<ByteVar>(), basedevmodetype, scope, pcbdevmode.rawAddress.toCPointer<ByteVar>(), ppdevmode.rawAddress.toCPointer<ByteVar>(), pbstrerrormessage.rawAddress.toCPointer<ByteVar>())

public actual fun pTGetPrintCapabilities(hprovider: Hptprovider, pprintticket: MutPtr<CVoid>, pcapabilities: MutPtr<CVoid>, pbstrerrormessage: MutPtr<Bstr>): Hresult =
    windowssysWindowsWin32GraphicsPrintingPrintticketPTGetPrintCapabilities(hprovider.rawAddress.toCPointer<ByteVar>(), pprintticket.rawAddress.toCPointer<ByteVar>(), pcapabilities.rawAddress.toCPointer<ByteVar>(), pbstrerrormessage.rawAddress.toCPointer<ByteVar>())

public actual fun pTGetPrintDeviceCapabilities(hprovider: Hptprovider, pprintticket: MutPtr<CVoid>, pdevicecapabilities: MutPtr<CVoid>, pbstrerrormessage: MutPtr<Bstr>): Hresult =
    windowssysWindowsWin32GraphicsPrintingPrintticketPTGetPrintDeviceCapabilities(hprovider.rawAddress.toCPointer<ByteVar>(), pprintticket.rawAddress.toCPointer<ByteVar>(), pdevicecapabilities.rawAddress.toCPointer<ByteVar>(), pbstrerrormessage.rawAddress.toCPointer<ByteVar>())

public actual fun pTGetPrintDeviceResources(hprovider: Hptprovider, pszlocalename: Pcwstr, pprintticket: MutPtr<CVoid>, pdeviceresources: MutPtr<CVoid>, pbstrerrormessage: MutPtr<Bstr>): Hresult =
    windowssysWindowsWin32GraphicsPrintingPrintticketPTGetPrintDeviceResources(hprovider.rawAddress.toCPointer<ByteVar>(), pszlocalename.rawAddress.toCPointer<ByteVar>(), pprintticket.rawAddress.toCPointer<ByteVar>(), pdeviceresources.rawAddress.toCPointer<ByteVar>(), pbstrerrormessage.rawAddress.toCPointer<ByteVar>())

public actual fun pTMergeAndValidatePrintTicket(hprovider: Hptprovider, pbaseticket: MutPtr<CVoid>, pdeltaticket: MutPtr<CVoid>, scope: EPrintTicketScope, presultticket: MutPtr<CVoid>, pbstrerrormessage: MutPtr<Bstr>): Hresult =
    windowssysWindowsWin32GraphicsPrintingPrintticketPTMergeAndValidatePrintTicket(hprovider.rawAddress.toCPointer<ByteVar>(), pbaseticket.rawAddress.toCPointer<ByteVar>(), pdeltaticket.rawAddress.toCPointer<ByteVar>(), scope, presultticket.rawAddress.toCPointer<ByteVar>(), pbstrerrormessage.rawAddress.toCPointer<ByteVar>())

public actual fun pTOpenProvider(pszprintername: Pcwstr, dwversion: UInt, phprovider: MutPtr<Hptprovider>): Hresult =
    windowssysWindowsWin32GraphicsPrintingPrintticketPTOpenProvider(pszprintername.rawAddress.toCPointer<ByteVar>(), dwversion, phprovider.rawAddress.toCPointer<ByteVar>())

public actual fun pTOpenProviderEx(pszprintername: Pcwstr, dwmaxversion: UInt, dwprefversion: UInt, phprovider: MutPtr<Hptprovider>, pusedversion: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32GraphicsPrintingPrintticketPTOpenProviderEx(pszprintername.rawAddress.toCPointer<ByteVar>(), dwmaxversion, dwprefversion, phprovider.rawAddress.toCPointer<ByteVar>(), pusedversion.rawAddress.toCPointer<ByteVar>())

public actual fun pTQuerySchemaVersionSupport(pszprintername: Pcwstr, pmaxversion: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32GraphicsPrintingPrintticketPTQuerySchemaVersionSupport(pszprintername.rawAddress.toCPointer<ByteVar>(), pmaxversion.rawAddress.toCPointer<ByteVar>())

public actual fun pTReleaseMemory(pbuffer: ConstPtr<CVoid>): Hresult =
    windowssysWindowsWin32GraphicsPrintingPrintticketPTReleaseMemory(pbuffer.rawAddress.toCPointer<ByteVar>())
