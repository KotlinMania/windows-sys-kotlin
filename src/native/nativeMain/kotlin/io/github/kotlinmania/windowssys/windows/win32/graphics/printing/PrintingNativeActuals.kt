@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.graphics.printing

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.foundation.Rect
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Devmodea
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Devmodew
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hdc
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingAddMonitorA
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingAddMonitorW
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingAddPortA
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingAddPortW
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingAddPrintProcessorA
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingAddPrintProcessorW
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingAddPrintProvidorA
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingAddPrintProvidorW
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingAddPrinterA
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingAddPrinterConnection2A
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingAddPrinterConnection2W
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingAddPrinterConnectionA
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingAddPrinterConnectionW
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingAddPrinterDriverA
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingAddPrinterDriverExA
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingAddPrinterDriverExW
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingAddPrinterDriverW
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingAddPrinterW
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingAppendPrinterNotifyInfoData
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingCallRouterFindFirstPrinterChangeNotification
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingCommonPropertySheetUIA
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingCommonPropertySheetUIW
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingConfigurePortA
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingConfigurePortW
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingConnectToPrinterDlg
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingCreatePrintAsyncNotifyChannel
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingDeleteMonitorA
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingDeleteMonitorW
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingDeletePortA
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingDeletePortW
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingDeletePrintProcessorA
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingDeletePrintProcessorW
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingDeletePrintProvidorA
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingDeletePrintProvidorW
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingDeletePrinterConnectionA
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingDeletePrinterConnectionW
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingDeletePrinterDriverA
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingDeletePrinterDriverExA
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingDeletePrinterDriverExW
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingDeletePrinterDriverPackageA
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingDeletePrinterDriverPackageW
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingDeletePrinterDriverW
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingDeletePrinterIC
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingDevQueryPrintEx
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingEnumMonitorsA
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingEnumMonitorsW
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingEnumPortsA
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingEnumPortsW
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingEnumPrintProcessorDatatypesA
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingEnumPrintProcessorDatatypesW
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingEnumPrintProcessorsA
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingEnumPrintProcessorsW
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingEnumPrinterDriversA
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingEnumPrinterDriversW
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingEnumPrintersA
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingEnumPrintersW
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingExtDeviceMode
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingFindClosePrinterChangeNotification
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingFindNextPrinterChangeNotification
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingFreePrintNamedPropertyArray
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingFreePrintPropertyValue
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingFreePrinterNotifyInfo
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingGdiDeleteSpoolFileHandle
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingGdiEndDocEMF
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingGdiEndPageEMF
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingGdiGetDC
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingGdiGetDevmodeForPage
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingGdiGetPageCount
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingGdiGetPageHandle
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingGdiGetSpoolFileHandle
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingGdiPlayPageEMF
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingGdiResetDCEMF
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingGdiStartDocEMF
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingGdiStartPageEMF
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingGenerateCopyFilePaths
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingGetCPSUIUserData
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingGetCorePrinterDriversA
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingGetCorePrinterDriversW
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingGetDefaultPrinterA
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingGetDefaultPrinterW
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingGetJobAttributes
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingGetJobAttributesEx
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingGetPrintExecutionData
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingGetPrintOutputInfo
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingGetPrintProcessorDirectoryA
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingGetPrintProcessorDirectoryW
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingGetPrinterDriverDirectoryA
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingGetPrinterDriverDirectoryW
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingGetPrinterDriverPackagePathA
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingGetPrinterDriverPackagePathW
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingImpersonatePrinterClient
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingInstallPrinterDriverFromPackageA
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingInstallPrinterDriverFromPackageW
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingIsValidDevmodeA
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingIsValidDevmodeW
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingOpenPrinter2A
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingOpenPrinter2W
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingOpenPrinterA
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingOpenPrinterW
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingPlayGdiScriptOnPrinterIC
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingRegisterForPrintAsyncNotifications
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingRemovePrintDeviceObject
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingReplyPrinterChangeNotificationEx
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingReportJobProcessingProgress
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingRevertToPrinterSelf
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingRouterAllocBidiMem
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingRouterAllocBidiResponseContainer
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingRouterAllocPrinterNotifyInfo
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingRouterFreeBidiMem
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingRouterFreeBidiResponseContainer
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingRouterFreePrinterNotifyInfo
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingSetCPSUIUserData
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingSetDefaultPrinterA
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingSetDefaultPrinterW
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingSetPortA
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingSetPortW
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingSpoolerCopyFileEvent
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingSpoolerFreePrinterNotifyInfo
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingUnRegisterForPrintAsyncNotifications
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingUploadPrinterDriverPackageA
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingUploadPrinterDriverPackageW
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssysWindowsWin32GraphicsPrintingXcvDataW
import io.github.kotlinmania.windowssys.windows.win32.storage.xps.Docinfow
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun abortPrinter(hprinter: PrinterHandle): Bool =
    0

public actual fun addFormA(hprinter: PrinterHandle, level: UInt, pform: ConstPtr<UByte>): Bool =
    0

public actual fun addFormW(hprinter: PrinterHandle, level: UInt, pform: ConstPtr<UByte>): Bool =
    0

public actual fun addJobA(hprinter: PrinterHandle, level: UInt, pdata: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>): Bool =
    0

public actual fun addJobW(hprinter: PrinterHandle, level: UInt, pdata: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>): Bool =
    0

public actual fun addMonitorA(pname: Pcstr, level: UInt, pmonitors: ConstPtr<UByte>): Bool =
    windowssysWindowsWin32GraphicsPrintingAddMonitorA(pname.rawAddress.toCPointer<ByteVar>(), level, pmonitors.rawAddress.toCPointer<ByteVar>())

public actual fun addMonitorW(pname: Pcwstr, level: UInt, pmonitors: ConstPtr<UByte>): Bool =
    windowssysWindowsWin32GraphicsPrintingAddMonitorW(pname.rawAddress.toCPointer<ByteVar>(), level, pmonitors.rawAddress.toCPointer<ByteVar>())

public actual fun addPortA(pname: Pcstr, hwnd: Hwnd, pmonitorname: Pcstr): Bool =
    windowssysWindowsWin32GraphicsPrintingAddPortA(pname.rawAddress.toCPointer<ByteVar>(), hwnd.rawAddress.toCPointer<ByteVar>(), pmonitorname.rawAddress.toCPointer<ByteVar>())

public actual fun addPortW(pname: Pcwstr, hwnd: Hwnd, pmonitorname: Pcwstr): Bool =
    windowssysWindowsWin32GraphicsPrintingAddPortW(pname.rawAddress.toCPointer<ByteVar>(), hwnd.rawAddress.toCPointer<ByteVar>(), pmonitorname.rawAddress.toCPointer<ByteVar>())

public actual fun addPrintDeviceObject(hprinter: PrinterHandle, phdeviceobject: MutPtr<Handle>): Hresult =
    0

public actual fun addPrintProcessorA(pname: Pcstr, penvironment: Pcstr, ppathname: Pcstr, pprintprocessorname: Pcstr): Bool =
    windowssysWindowsWin32GraphicsPrintingAddPrintProcessorA(pname.rawAddress.toCPointer<ByteVar>(), penvironment.rawAddress.toCPointer<ByteVar>(), ppathname.rawAddress.toCPointer<ByteVar>(), pprintprocessorname.rawAddress.toCPointer<ByteVar>())

public actual fun addPrintProcessorW(pname: Pcwstr, penvironment: Pcwstr, ppathname: Pcwstr, pprintprocessorname: Pcwstr): Bool =
    windowssysWindowsWin32GraphicsPrintingAddPrintProcessorW(pname.rawAddress.toCPointer<ByteVar>(), penvironment.rawAddress.toCPointer<ByteVar>(), ppathname.rawAddress.toCPointer<ByteVar>(), pprintprocessorname.rawAddress.toCPointer<ByteVar>())

public actual fun addPrintProvidorA(pname: Pcstr, level: UInt, pprovidorinfo: ConstPtr<UByte>): Bool =
    windowssysWindowsWin32GraphicsPrintingAddPrintProvidorA(pname.rawAddress.toCPointer<ByteVar>(), level, pprovidorinfo.rawAddress.toCPointer<ByteVar>())

public actual fun addPrintProvidorW(pname: Pcwstr, level: UInt, pprovidorinfo: ConstPtr<UByte>): Bool =
    windowssysWindowsWin32GraphicsPrintingAddPrintProvidorW(pname.rawAddress.toCPointer<ByteVar>(), level, pprovidorinfo.rawAddress.toCPointer<ByteVar>())

public actual fun addPrinterA(pname: Pcstr, level: UInt, pprinter: ConstPtr<UByte>): Handle =
    MutPtr(windowssysWindowsWin32GraphicsPrintingAddPrinterA(pname.rawAddress.toCPointer<ByteVar>(), level, pprinter.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun addPrinterConnection2A(hwnd: Hwnd, pszname: Pcstr, dwlevel: UInt, pconnectioninfo: ConstPtr<CVoid>): Bool =
    windowssysWindowsWin32GraphicsPrintingAddPrinterConnection2A(hwnd.rawAddress.toCPointer<ByteVar>(), pszname.rawAddress.toCPointer<ByteVar>(), dwlevel, pconnectioninfo.rawAddress.toCPointer<ByteVar>())

public actual fun addPrinterConnection2W(hwnd: Hwnd, pszname: Pcwstr, dwlevel: UInt, pconnectioninfo: ConstPtr<CVoid>): Bool =
    windowssysWindowsWin32GraphicsPrintingAddPrinterConnection2W(hwnd.rawAddress.toCPointer<ByteVar>(), pszname.rawAddress.toCPointer<ByteVar>(), dwlevel, pconnectioninfo.rawAddress.toCPointer<ByteVar>())

public actual fun addPrinterConnectionA(pname: Pcstr): Bool =
    windowssysWindowsWin32GraphicsPrintingAddPrinterConnectionA(pname.rawAddress.toCPointer<ByteVar>())

public actual fun addPrinterConnectionW(pname: Pcwstr): Bool =
    windowssysWindowsWin32GraphicsPrintingAddPrinterConnectionW(pname.rawAddress.toCPointer<ByteVar>())

public actual fun addPrinterDriverA(pname: Pcstr, level: UInt, pdriverinfo: ConstPtr<UByte>): Bool =
    windowssysWindowsWin32GraphicsPrintingAddPrinterDriverA(pname.rawAddress.toCPointer<ByteVar>(), level, pdriverinfo.rawAddress.toCPointer<ByteVar>())

public actual fun addPrinterDriverExA(pname: Pcstr, level: UInt, lpbdriverinfo: ConstPtr<UByte>, dwfilecopyflags: UInt): Bool =
    windowssysWindowsWin32GraphicsPrintingAddPrinterDriverExA(pname.rawAddress.toCPointer<ByteVar>(), level, lpbdriverinfo.rawAddress.toCPointer<ByteVar>(), dwfilecopyflags)

public actual fun addPrinterDriverExW(pname: Pcwstr, level: UInt, lpbdriverinfo: ConstPtr<UByte>, dwfilecopyflags: UInt): Bool =
    windowssysWindowsWin32GraphicsPrintingAddPrinterDriverExW(pname.rawAddress.toCPointer<ByteVar>(), level, lpbdriverinfo.rawAddress.toCPointer<ByteVar>(), dwfilecopyflags)

public actual fun addPrinterDriverW(pname: Pcwstr, level: UInt, pdriverinfo: ConstPtr<UByte>): Bool =
    windowssysWindowsWin32GraphicsPrintingAddPrinterDriverW(pname.rawAddress.toCPointer<ByteVar>(), level, pdriverinfo.rawAddress.toCPointer<ByteVar>())

public actual fun addPrinterW(pname: Pcwstr, level: UInt, pprinter: ConstPtr<UByte>): Handle =
    MutPtr(windowssysWindowsWin32GraphicsPrintingAddPrinterW(pname.rawAddress.toCPointer<ByteVar>(), level, pprinter.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun advancedDocumentPropertiesA(hwnd: Hwnd, hprinter: PrinterHandle, pdevicename: Pcstr, pdevmodeoutput: MutPtr<Devmodea>, pdevmodeinput: ConstPtr<Devmodea>): Int =
    0

public actual fun advancedDocumentPropertiesW(hwnd: Hwnd, hprinter: PrinterHandle, pdevicename: Pcwstr, pdevmodeoutput: MutPtr<Devmodew>, pdevmodeinput: ConstPtr<Devmodew>): Int =
    0

public actual fun appendPrinterNotifyInfoData(pinfodest: ConstPtr<PrinterNotifyInfo>, pdatasrc: ConstPtr<PrinterNotifyInfoData>, fdwflags: UInt): Bool =
    windowssysWindowsWin32GraphicsPrintingAppendPrinterNotifyInfoData(pinfodest.rawAddress.toCPointer<ByteVar>(), pdatasrc.rawAddress.toCPointer<ByteVar>(), fdwflags)

public actual fun callRouterFindFirstPrinterChangeNotification(hprinterrpc: Handle, fdwfilterflags: UInt, fdwoptions: UInt, hnotify: Handle, pprinternotifyoptions: ConstPtr<PrinterNotifyOptions>): UInt =
    windowssysWindowsWin32GraphicsPrintingCallRouterFindFirstPrinterChangeNotification(hprinterrpc.rawAddress.toCPointer<ByteVar>(), fdwfilterflags, fdwoptions, hnotify.rawAddress.toCPointer<ByteVar>(), pprinternotifyoptions.rawAddress.toCPointer<ByteVar>())

public actual fun closePrinter(hprinter: PrinterHandle): Bool =
    0

public actual fun closeSpoolFileHandle(hprinter: PrinterHandle, hspoolfile: Handle): Bool =
    0

public actual fun commitSpoolData(hprinter: PrinterHandle, hspoolfile: Handle, cbcommit: UInt): Handle =
    MutPtr(0L)

public actual fun commonPropertySheetUIA(hwndowner: Hwnd, pfnpropsheetui: Pfnpropsheetui, lparam: Lparam, presult: MutPtr<UInt>): Int =
    windowssysWindowsWin32GraphicsPrintingCommonPropertySheetUIA(hwndowner.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lparam, presult.rawAddress.toCPointer<ByteVar>())

public actual fun commonPropertySheetUIW(hwndowner: Hwnd, pfnpropsheetui: Pfnpropsheetui, lparam: Lparam, presult: MutPtr<UInt>): Int =
    windowssysWindowsWin32GraphicsPrintingCommonPropertySheetUIW(hwndowner.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lparam, presult.rawAddress.toCPointer<ByteVar>())

public actual fun configurePortA(pname: Pcstr, hwnd: Hwnd, pportname: Pcstr): Bool =
    windowssysWindowsWin32GraphicsPrintingConfigurePortA(pname.rawAddress.toCPointer<ByteVar>(), hwnd.rawAddress.toCPointer<ByteVar>(), pportname.rawAddress.toCPointer<ByteVar>())

public actual fun configurePortW(pname: Pcwstr, hwnd: Hwnd, pportname: Pcwstr): Bool =
    windowssysWindowsWin32GraphicsPrintingConfigurePortW(pname.rawAddress.toCPointer<ByteVar>(), hwnd.rawAddress.toCPointer<ByteVar>(), pportname.rawAddress.toCPointer<ByteVar>())

public actual fun connectToPrinterDlg(hwnd: Hwnd, flags: UInt): Handle =
    MutPtr(windowssysWindowsWin32GraphicsPrintingConnectToPrinterDlg(hwnd.rawAddress.toCPointer<ByteVar>(), flags)?.toLong() ?: 0L)

public actual fun corePrinterDriverInstalledA(pszserver: Pcstr, pszenvironment: Pcstr, coredriverguid: Guid, ftdriverdate: Filetime, dwldriverversion: ULong, pbdriverinstalled: MutPtr<Bool>): Hresult =
    0

public actual fun corePrinterDriverInstalledW(pszserver: Pcwstr, pszenvironment: Pcwstr, coredriverguid: Guid, ftdriverdate: Filetime, dwldriverversion: ULong, pbdriverinstalled: MutPtr<Bool>): Hresult =
    0

public actual fun createPrintAsyncNotifyChannel(pszname: Pcwstr, pnotificationtype: ConstPtr<Guid>, euserfilter: PrintAsyncNotifyUserFilter, econversationstyle: PrintAsyncNotifyConversationStyle, pcallback: MutPtr<CVoid>, ppiasynchnotification: MutPtr<MutPtr<CVoid>>): Hresult =
    windowssysWindowsWin32GraphicsPrintingCreatePrintAsyncNotifyChannel(pszname.rawAddress.toCPointer<ByteVar>(), pnotificationtype.rawAddress.toCPointer<ByteVar>(), euserfilter, econversationstyle, pcallback.rawAddress.toCPointer<ByteVar>(), ppiasynchnotification.rawAddress.toCPointer<ByteVar>())

public actual fun createPrinterIC(hprinter: PrinterHandle, pdevmode: ConstPtr<Devmodew>): Handle =
    MutPtr(0L)

public actual fun deleteFormA(hprinter: PrinterHandle, pformname: Pcstr): Bool =
    0

public actual fun deleteFormW(hprinter: PrinterHandle, pformname: Pcwstr): Bool =
    0

public actual fun deleteJobNamedProperty(hprinter: PrinterHandle, jobid: UInt, pszname: Pcwstr): UInt =
    0u

public actual fun deleteMonitorA(pname: Pcstr, penvironment: Pcstr, pmonitorname: Pcstr): Bool =
    windowssysWindowsWin32GraphicsPrintingDeleteMonitorA(pname.rawAddress.toCPointer<ByteVar>(), penvironment.rawAddress.toCPointer<ByteVar>(), pmonitorname.rawAddress.toCPointer<ByteVar>())

public actual fun deleteMonitorW(pname: Pcwstr, penvironment: Pcwstr, pmonitorname: Pcwstr): Bool =
    windowssysWindowsWin32GraphicsPrintingDeleteMonitorW(pname.rawAddress.toCPointer<ByteVar>(), penvironment.rawAddress.toCPointer<ByteVar>(), pmonitorname.rawAddress.toCPointer<ByteVar>())

public actual fun deletePortA(pname: Pcstr, hwnd: Hwnd, pportname: Pcstr): Bool =
    windowssysWindowsWin32GraphicsPrintingDeletePortA(pname.rawAddress.toCPointer<ByteVar>(), hwnd.rawAddress.toCPointer<ByteVar>(), pportname.rawAddress.toCPointer<ByteVar>())

public actual fun deletePortW(pname: Pcwstr, hwnd: Hwnd, pportname: Pcwstr): Bool =
    windowssysWindowsWin32GraphicsPrintingDeletePortW(pname.rawAddress.toCPointer<ByteVar>(), hwnd.rawAddress.toCPointer<ByteVar>(), pportname.rawAddress.toCPointer<ByteVar>())

public actual fun deletePrintProcessorA(pname: Pcstr, penvironment: Pcstr, pprintprocessorname: Pcstr): Bool =
    windowssysWindowsWin32GraphicsPrintingDeletePrintProcessorA(pname.rawAddress.toCPointer<ByteVar>(), penvironment.rawAddress.toCPointer<ByteVar>(), pprintprocessorname.rawAddress.toCPointer<ByteVar>())

public actual fun deletePrintProcessorW(pname: Pcwstr, penvironment: Pcwstr, pprintprocessorname: Pcwstr): Bool =
    windowssysWindowsWin32GraphicsPrintingDeletePrintProcessorW(pname.rawAddress.toCPointer<ByteVar>(), penvironment.rawAddress.toCPointer<ByteVar>(), pprintprocessorname.rawAddress.toCPointer<ByteVar>())

public actual fun deletePrintProvidorA(pname: Pcstr, penvironment: Pcstr, pprintprovidorname: Pcstr): Bool =
    windowssysWindowsWin32GraphicsPrintingDeletePrintProvidorA(pname.rawAddress.toCPointer<ByteVar>(), penvironment.rawAddress.toCPointer<ByteVar>(), pprintprovidorname.rawAddress.toCPointer<ByteVar>())

public actual fun deletePrintProvidorW(pname: Pcwstr, penvironment: Pcwstr, pprintprovidorname: Pcwstr): Bool =
    windowssysWindowsWin32GraphicsPrintingDeletePrintProvidorW(pname.rawAddress.toCPointer<ByteVar>(), penvironment.rawAddress.toCPointer<ByteVar>(), pprintprovidorname.rawAddress.toCPointer<ByteVar>())

public actual fun deletePrinter(hprinter: PrinterHandle): Bool =
    0

public actual fun deletePrinterConnectionA(pname: Pcstr): Bool =
    windowssysWindowsWin32GraphicsPrintingDeletePrinterConnectionA(pname.rawAddress.toCPointer<ByteVar>())

public actual fun deletePrinterConnectionW(pname: Pcwstr): Bool =
    windowssysWindowsWin32GraphicsPrintingDeletePrinterConnectionW(pname.rawAddress.toCPointer<ByteVar>())

public actual fun deletePrinterDataA(hprinter: PrinterHandle, pvaluename: Pcstr): UInt =
    0u

public actual fun deletePrinterDataExA(hprinter: PrinterHandle, pkeyname: Pcstr, pvaluename: Pcstr): UInt =
    0u

public actual fun deletePrinterDataExW(hprinter: PrinterHandle, pkeyname: Pcwstr, pvaluename: Pcwstr): UInt =
    0u

public actual fun deletePrinterDataW(hprinter: PrinterHandle, pvaluename: Pcwstr): UInt =
    0u

public actual fun deletePrinterDriverA(pname: Pcstr, penvironment: Pcstr, pdrivername: Pcstr): Bool =
    windowssysWindowsWin32GraphicsPrintingDeletePrinterDriverA(pname.rawAddress.toCPointer<ByteVar>(), penvironment.rawAddress.toCPointer<ByteVar>(), pdrivername.rawAddress.toCPointer<ByteVar>())

public actual fun deletePrinterDriverExA(pname: Pcstr, penvironment: Pcstr, pdrivername: Pcstr, dwdeleteflag: UInt, dwversionflag: UInt): Bool =
    windowssysWindowsWin32GraphicsPrintingDeletePrinterDriverExA(pname.rawAddress.toCPointer<ByteVar>(), penvironment.rawAddress.toCPointer<ByteVar>(), pdrivername.rawAddress.toCPointer<ByteVar>(), dwdeleteflag, dwversionflag)

public actual fun deletePrinterDriverExW(pname: Pcwstr, penvironment: Pcwstr, pdrivername: Pcwstr, dwdeleteflag: UInt, dwversionflag: UInt): Bool =
    windowssysWindowsWin32GraphicsPrintingDeletePrinterDriverExW(pname.rawAddress.toCPointer<ByteVar>(), penvironment.rawAddress.toCPointer<ByteVar>(), pdrivername.rawAddress.toCPointer<ByteVar>(), dwdeleteflag, dwversionflag)

public actual fun deletePrinterDriverPackageA(pszserver: Pcstr, pszinfpath: Pcstr, pszenvironment: Pcstr): Hresult =
    windowssysWindowsWin32GraphicsPrintingDeletePrinterDriverPackageA(pszserver.rawAddress.toCPointer<ByteVar>(), pszinfpath.rawAddress.toCPointer<ByteVar>(), pszenvironment.rawAddress.toCPointer<ByteVar>())

public actual fun deletePrinterDriverPackageW(pszserver: Pcwstr, pszinfpath: Pcwstr, pszenvironment: Pcwstr): Hresult =
    windowssysWindowsWin32GraphicsPrintingDeletePrinterDriverPackageW(pszserver.rawAddress.toCPointer<ByteVar>(), pszinfpath.rawAddress.toCPointer<ByteVar>(), pszenvironment.rawAddress.toCPointer<ByteVar>())

public actual fun deletePrinterDriverW(pname: Pcwstr, penvironment: Pcwstr, pdrivername: Pcwstr): Bool =
    windowssysWindowsWin32GraphicsPrintingDeletePrinterDriverW(pname.rawAddress.toCPointer<ByteVar>(), penvironment.rawAddress.toCPointer<ByteVar>(), pdrivername.rawAddress.toCPointer<ByteVar>())

public actual fun deletePrinterIC(hprinteric: Handle): Bool =
    windowssysWindowsWin32GraphicsPrintingDeletePrinterIC(hprinteric.rawAddress.toCPointer<ByteVar>())

public actual fun deletePrinterKeyA(hprinter: PrinterHandle, pkeyname: Pcstr): UInt =
    0u

public actual fun deletePrinterKeyW(hprinter: PrinterHandle, pkeyname: Pcwstr): UInt =
    0u

public actual fun devQueryPrint(hprinter: PrinterHandle, pdevmode: ConstPtr<Devmodea>, presid: MutPtr<UInt>): Bool =
    0

public actual fun devQueryPrintEx(pdqpinfo: MutPtr<DevqueryprintInfo>): Bool =
    windowssysWindowsWin32GraphicsPrintingDevQueryPrintEx(pdqpinfo.rawAddress.toCPointer<ByteVar>())

public actual fun documentPropertiesA(hwnd: Hwnd, hprinter: PrinterHandle, pdevicename: Pcstr, pdevmodeoutput: MutPtr<Devmodea>, pdevmodeinput: ConstPtr<Devmodea>, fmode: UInt): Int =
    0

public actual fun documentPropertiesW(hwnd: Hwnd, hprinter: PrinterHandle, pdevicename: Pcwstr, pdevmodeoutput: MutPtr<Devmodew>, pdevmodeinput: ConstPtr<Devmodew>, fmode: UInt): Int =
    0

public actual fun endDocPrinter(hprinter: PrinterHandle): Bool =
    0

public actual fun endPagePrinter(hprinter: PrinterHandle): Bool =
    0

public actual fun enumFormsA(hprinter: PrinterHandle, level: UInt, pform: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>, pcreturned: MutPtr<UInt>): Bool =
    0

public actual fun enumFormsW(hprinter: PrinterHandle, level: UInt, pform: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>, pcreturned: MutPtr<UInt>): Bool =
    0

public actual fun enumJobNamedProperties(hprinter: PrinterHandle, jobid: UInt, pcproperties: MutPtr<UInt>, ppproperties: MutPtr<MutPtr<PrintNamedProperty>>): UInt =
    0u

public actual fun enumJobsA(hprinter: PrinterHandle, firstjob: UInt, nojobs: UInt, level: UInt, pjob: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>, pcreturned: MutPtr<UInt>): Bool =
    0

public actual fun enumJobsW(hprinter: PrinterHandle, firstjob: UInt, nojobs: UInt, level: UInt, pjob: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>, pcreturned: MutPtr<UInt>): Bool =
    0

public actual fun enumMonitorsA(pname: Pcstr, level: UInt, pmonitor: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>, pcreturned: MutPtr<UInt>): Bool =
    windowssysWindowsWin32GraphicsPrintingEnumMonitorsA(pname.rawAddress.toCPointer<ByteVar>(), level, pmonitor.rawAddress.toCPointer<ByteVar>(), cbbuf, pcbneeded.rawAddress.toCPointer<ByteVar>(), pcreturned.rawAddress.toCPointer<ByteVar>())

public actual fun enumMonitorsW(pname: Pcwstr, level: UInt, pmonitor: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>, pcreturned: MutPtr<UInt>): Bool =
    windowssysWindowsWin32GraphicsPrintingEnumMonitorsW(pname.rawAddress.toCPointer<ByteVar>(), level, pmonitor.rawAddress.toCPointer<ByteVar>(), cbbuf, pcbneeded.rawAddress.toCPointer<ByteVar>(), pcreturned.rawAddress.toCPointer<ByteVar>())

public actual fun enumPortsA(pname: Pcstr, level: UInt, pport: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>, pcreturned: MutPtr<UInt>): Bool =
    windowssysWindowsWin32GraphicsPrintingEnumPortsA(pname.rawAddress.toCPointer<ByteVar>(), level, pport.rawAddress.toCPointer<ByteVar>(), cbbuf, pcbneeded.rawAddress.toCPointer<ByteVar>(), pcreturned.rawAddress.toCPointer<ByteVar>())

public actual fun enumPortsW(pname: Pcwstr, level: UInt, pport: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>, pcreturned: MutPtr<UInt>): Bool =
    windowssysWindowsWin32GraphicsPrintingEnumPortsW(pname.rawAddress.toCPointer<ByteVar>(), level, pport.rawAddress.toCPointer<ByteVar>(), cbbuf, pcbneeded.rawAddress.toCPointer<ByteVar>(), pcreturned.rawAddress.toCPointer<ByteVar>())

public actual fun enumPrintProcessorDatatypesA(pname: Pcstr, pprintprocessorname: Pcstr, level: UInt, pdatatypes: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>, pcreturned: MutPtr<UInt>): Bool =
    windowssysWindowsWin32GraphicsPrintingEnumPrintProcessorDatatypesA(pname.rawAddress.toCPointer<ByteVar>(), pprintprocessorname.rawAddress.toCPointer<ByteVar>(), level, pdatatypes.rawAddress.toCPointer<ByteVar>(), cbbuf, pcbneeded.rawAddress.toCPointer<ByteVar>(), pcreturned.rawAddress.toCPointer<ByteVar>())

public actual fun enumPrintProcessorDatatypesW(pname: Pcwstr, pprintprocessorname: Pcwstr, level: UInt, pdatatypes: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>, pcreturned: MutPtr<UInt>): Bool =
    windowssysWindowsWin32GraphicsPrintingEnumPrintProcessorDatatypesW(pname.rawAddress.toCPointer<ByteVar>(), pprintprocessorname.rawAddress.toCPointer<ByteVar>(), level, pdatatypes.rawAddress.toCPointer<ByteVar>(), cbbuf, pcbneeded.rawAddress.toCPointer<ByteVar>(), pcreturned.rawAddress.toCPointer<ByteVar>())

public actual fun enumPrintProcessorsA(pname: Pcstr, penvironment: Pcstr, level: UInt, pprintprocessorinfo: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>, pcreturned: MutPtr<UInt>): Bool =
    windowssysWindowsWin32GraphicsPrintingEnumPrintProcessorsA(pname.rawAddress.toCPointer<ByteVar>(), penvironment.rawAddress.toCPointer<ByteVar>(), level, pprintprocessorinfo.rawAddress.toCPointer<ByteVar>(), cbbuf, pcbneeded.rawAddress.toCPointer<ByteVar>(), pcreturned.rawAddress.toCPointer<ByteVar>())

public actual fun enumPrintProcessorsW(pname: Pcwstr, penvironment: Pcwstr, level: UInt, pprintprocessorinfo: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>, pcreturned: MutPtr<UInt>): Bool =
    windowssysWindowsWin32GraphicsPrintingEnumPrintProcessorsW(pname.rawAddress.toCPointer<ByteVar>(), penvironment.rawAddress.toCPointer<ByteVar>(), level, pprintprocessorinfo.rawAddress.toCPointer<ByteVar>(), cbbuf, pcbneeded.rawAddress.toCPointer<ByteVar>(), pcreturned.rawAddress.toCPointer<ByteVar>())

public actual fun enumPrinterDataA(hprinter: PrinterHandle, dwindex: UInt, pvaluename: Pstr, cbvaluename: UInt, pcbvaluename: MutPtr<UInt>, ptype: MutPtr<UInt>, pdata: MutPtr<UByte>, cbdata: UInt, pcbdata: MutPtr<UInt>): UInt =
    0u

public actual fun enumPrinterDataExA(hprinter: PrinterHandle, pkeyname: Pcstr, penumvalues: MutPtr<UByte>, cbenumvalues: UInt, pcbenumvalues: MutPtr<UInt>, pnenumvalues: MutPtr<UInt>): UInt =
    0u

public actual fun enumPrinterDataExW(hprinter: PrinterHandle, pkeyname: Pcwstr, penumvalues: MutPtr<UByte>, cbenumvalues: UInt, pcbenumvalues: MutPtr<UInt>, pnenumvalues: MutPtr<UInt>): UInt =
    0u

public actual fun enumPrinterDataW(hprinter: PrinterHandle, dwindex: UInt, pvaluename: Pwstr, cbvaluename: UInt, pcbvaluename: MutPtr<UInt>, ptype: MutPtr<UInt>, pdata: MutPtr<UByte>, cbdata: UInt, pcbdata: MutPtr<UInt>): UInt =
    0u

public actual fun enumPrinterDriversA(pname: Pcstr, penvironment: Pcstr, level: UInt, pdriverinfo: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>, pcreturned: MutPtr<UInt>): Bool =
    windowssysWindowsWin32GraphicsPrintingEnumPrinterDriversA(pname.rawAddress.toCPointer<ByteVar>(), penvironment.rawAddress.toCPointer<ByteVar>(), level, pdriverinfo.rawAddress.toCPointer<ByteVar>(), cbbuf, pcbneeded.rawAddress.toCPointer<ByteVar>(), pcreturned.rawAddress.toCPointer<ByteVar>())

public actual fun enumPrinterDriversW(pname: Pcwstr, penvironment: Pcwstr, level: UInt, pdriverinfo: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>, pcreturned: MutPtr<UInt>): Bool =
    windowssysWindowsWin32GraphicsPrintingEnumPrinterDriversW(pname.rawAddress.toCPointer<ByteVar>(), penvironment.rawAddress.toCPointer<ByteVar>(), level, pdriverinfo.rawAddress.toCPointer<ByteVar>(), cbbuf, pcbneeded.rawAddress.toCPointer<ByteVar>(), pcreturned.rawAddress.toCPointer<ByteVar>())

public actual fun enumPrinterKeyA(hprinter: PrinterHandle, pkeyname: Pcstr, psubkey: Pstr, cbsubkey: UInt, pcbsubkey: MutPtr<UInt>): UInt =
    0u

public actual fun enumPrinterKeyW(hprinter: PrinterHandle, pkeyname: Pcwstr, psubkey: Pwstr, cbsubkey: UInt, pcbsubkey: MutPtr<UInt>): UInt =
    0u

public actual fun enumPrintersA(flags: UInt, name: Pcstr, level: UInt, pprinterenum: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>, pcreturned: MutPtr<UInt>): Bool =
    windowssysWindowsWin32GraphicsPrintingEnumPrintersA(flags, name.rawAddress.toCPointer<ByteVar>(), level, pprinterenum.rawAddress.toCPointer<ByteVar>(), cbbuf, pcbneeded.rawAddress.toCPointer<ByteVar>(), pcreturned.rawAddress.toCPointer<ByteVar>())

public actual fun enumPrintersW(flags: UInt, name: Pcwstr, level: UInt, pprinterenum: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>, pcreturned: MutPtr<UInt>): Bool =
    windowssysWindowsWin32GraphicsPrintingEnumPrintersW(flags, name.rawAddress.toCPointer<ByteVar>(), level, pprinterenum.rawAddress.toCPointer<ByteVar>(), cbbuf, pcbneeded.rawAddress.toCPointer<ByteVar>(), pcreturned.rawAddress.toCPointer<ByteVar>())

public actual fun extDeviceMode(hwnd: Hwnd, hinst: Handle, pdevmodeoutput: MutPtr<Devmodea>, pdevicename: Pcstr, pport: Pcstr, pdevmodeinput: ConstPtr<Devmodea>, pprofile: Pcstr, fmode: UInt): Int =
    windowssysWindowsWin32GraphicsPrintingExtDeviceMode(hwnd.rawAddress.toCPointer<ByteVar>(), hinst.rawAddress.toCPointer<ByteVar>(), pdevmodeoutput.rawAddress.toCPointer<ByteVar>(), pdevicename.rawAddress.toCPointer<ByteVar>(), pport.rawAddress.toCPointer<ByteVar>(), pdevmodeinput.rawAddress.toCPointer<ByteVar>(), pprofile.rawAddress.toCPointer<ByteVar>(), fmode)

public actual fun findClosePrinterChangeNotification(hchange: Handle): Bool =
    windowssysWindowsWin32GraphicsPrintingFindClosePrinterChangeNotification(hchange.rawAddress.toCPointer<ByteVar>())

public actual fun findFirstPrinterChangeNotification(hprinter: PrinterHandle, fdwfilter: UInt, fdwoptions: UInt, pprinternotifyoptions: ConstPtr<CVoid>): Handle =
    MutPtr(0L)

public actual fun findNextPrinterChangeNotification(hchange: Handle, pdwchange: MutPtr<UInt>, pvreserved: ConstPtr<CVoid>, ppprinternotifyinfo: MutPtr<MutPtr<CVoid>>): Bool =
    windowssysWindowsWin32GraphicsPrintingFindNextPrinterChangeNotification(hchange.rawAddress.toCPointer<ByteVar>(), pdwchange.rawAddress.toCPointer<ByteVar>(), pvreserved.rawAddress.toCPointer<ByteVar>(), ppprinternotifyinfo.rawAddress.toCPointer<ByteVar>())

public actual fun flushPrinter(hprinter: PrinterHandle, pbuf: ConstPtr<CVoid>, cbbuf: UInt, pcwritten: MutPtr<UInt>, csleep: UInt): Bool =
    0

public actual fun freePrintNamedPropertyArray(cproperties: UInt, ppproperties: MutPtr<MutPtr<PrintNamedProperty>>) {
    windowssysWindowsWin32GraphicsPrintingFreePrintNamedPropertyArray(cproperties, ppproperties.rawAddress.toCPointer<ByteVar>())
}

public actual fun freePrintPropertyValue(pvalue: MutPtr<PrintPropertyValue>) {
    windowssysWindowsWin32GraphicsPrintingFreePrintPropertyValue(pvalue.rawAddress.toCPointer<ByteVar>())
}

public actual fun freePrinterNotifyInfo(pprinternotifyinfo: ConstPtr<PrinterNotifyInfo>): Bool =
    windowssysWindowsWin32GraphicsPrintingFreePrinterNotifyInfo(pprinternotifyinfo.rawAddress.toCPointer<ByteVar>())

public actual fun gdiDeleteSpoolFileHandle(spoolfilehandle: Handle): Bool =
    windowssysWindowsWin32GraphicsPrintingGdiDeleteSpoolFileHandle(spoolfilehandle.rawAddress.toCPointer<ByteVar>())

public actual fun gdiEndDocEMF(spoolfilehandle: Handle): Bool =
    windowssysWindowsWin32GraphicsPrintingGdiEndDocEMF(spoolfilehandle.rawAddress.toCPointer<ByteVar>())

public actual fun gdiEndPageEMF(spoolfilehandle: Handle, dwoptimization: UInt): Bool =
    windowssysWindowsWin32GraphicsPrintingGdiEndPageEMF(spoolfilehandle.rawAddress.toCPointer<ByteVar>(), dwoptimization)

public actual fun gdiGetDC(spoolfilehandle: Handle): Hdc =
    MutPtr(windowssysWindowsWin32GraphicsPrintingGdiGetDC(spoolfilehandle.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun gdiGetDevmodeForPage(spoolfilehandle: Handle, dwpagenumber: UInt, pcurrdm: MutPtr<MutPtr<Devmodew>>, plastdm: MutPtr<MutPtr<Devmodew>>): Bool =
    windowssysWindowsWin32GraphicsPrintingGdiGetDevmodeForPage(spoolfilehandle.rawAddress.toCPointer<ByteVar>(), dwpagenumber, pcurrdm.rawAddress.toCPointer<ByteVar>(), plastdm.rawAddress.toCPointer<ByteVar>())

public actual fun gdiGetPageCount(spoolfilehandle: Handle): UInt =
    windowssysWindowsWin32GraphicsPrintingGdiGetPageCount(spoolfilehandle.rawAddress.toCPointer<ByteVar>())

public actual fun gdiGetPageHandle(spoolfilehandle: Handle, page: UInt, pdwpagetype: MutPtr<UInt>): Handle =
    MutPtr(windowssysWindowsWin32GraphicsPrintingGdiGetPageHandle(spoolfilehandle.rawAddress.toCPointer<ByteVar>(), page, pdwpagetype.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun gdiGetSpoolFileHandle(pwszprintername: Pcwstr, pdevmode: MutPtr<Devmodew>, pwszdocname: Pcwstr): Handle =
    MutPtr(windowssysWindowsWin32GraphicsPrintingGdiGetSpoolFileHandle(pwszprintername.rawAddress.toCPointer<ByteVar>(), pdevmode.rawAddress.toCPointer<ByteVar>(), pwszdocname.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun gdiPlayPageEMF(spoolfilehandle: Handle, hemf: Handle, prectdocument: MutPtr<Rect>, prectborder: MutPtr<Rect>, prectclip: MutPtr<Rect>): Bool =
    windowssysWindowsWin32GraphicsPrintingGdiPlayPageEMF(spoolfilehandle.rawAddress.toCPointer<ByteVar>(), hemf.rawAddress.toCPointer<ByteVar>(), prectdocument.rawAddress.toCPointer<ByteVar>(), prectborder.rawAddress.toCPointer<ByteVar>(), prectclip.rawAddress.toCPointer<ByteVar>())

public actual fun gdiResetDCEMF(spoolfilehandle: Handle, pcurrdm: MutPtr<Devmodew>): Bool =
    windowssysWindowsWin32GraphicsPrintingGdiResetDCEMF(spoolfilehandle.rawAddress.toCPointer<ByteVar>(), pcurrdm.rawAddress.toCPointer<ByteVar>())

public actual fun gdiStartDocEMF(spoolfilehandle: Handle, pdocinfo: MutPtr<Docinfow>): Bool =
    windowssysWindowsWin32GraphicsPrintingGdiStartDocEMF(spoolfilehandle.rawAddress.toCPointer<ByteVar>(), pdocinfo.rawAddress.toCPointer<ByteVar>())

public actual fun gdiStartPageEMF(spoolfilehandle: Handle): Bool =
    windowssysWindowsWin32GraphicsPrintingGdiStartPageEMF(spoolfilehandle.rawAddress.toCPointer<ByteVar>())

public actual fun generateCopyFilePaths(pszprintername: Pcwstr, pszdirectory: Pcwstr, psplclientinfo: ConstPtr<UByte>, dwlevel: UInt, pszsourcedir: Pwstr, pcchsourcedirsize: MutPtr<UInt>, psztargetdir: Pwstr, pcchtargetdirsize: MutPtr<UInt>, dwflags: UInt): UInt =
    windowssysWindowsWin32GraphicsPrintingGenerateCopyFilePaths(pszprintername.rawAddress.toCPointer<ByteVar>(), pszdirectory.rawAddress.toCPointer<ByteVar>(), psplclientinfo.rawAddress.toCPointer<ByteVar>(), dwlevel, pszsourcedir.rawAddress.toCPointer<ByteVar>(), pcchsourcedirsize.rawAddress.toCPointer<ByteVar>(), psztargetdir.rawAddress.toCPointer<ByteVar>(), pcchtargetdirsize.rawAddress.toCPointer<ByteVar>(), dwflags)

public actual fun getCPSUIUserData(hdlg: Hwnd): ULong =
    windowssysWindowsWin32GraphicsPrintingGetCPSUIUserData(hdlg.rawAddress.toCPointer<ByteVar>())

public actual fun getCorePrinterDriversA(pszserver: Pcstr, pszenvironment: Pcstr, pszzcoredriverdependencies: Pcstr, ccoreprinterdrivers: UInt, pcoreprinterdrivers: MutPtr<CorePrinterDrivera>): Hresult =
    windowssysWindowsWin32GraphicsPrintingGetCorePrinterDriversA(pszserver.rawAddress.toCPointer<ByteVar>(), pszenvironment.rawAddress.toCPointer<ByteVar>(), pszzcoredriverdependencies.rawAddress.toCPointer<ByteVar>(), ccoreprinterdrivers, pcoreprinterdrivers.rawAddress.toCPointer<ByteVar>())

public actual fun getCorePrinterDriversW(pszserver: Pcwstr, pszenvironment: Pcwstr, pszzcoredriverdependencies: Pcwstr, ccoreprinterdrivers: UInt, pcoreprinterdrivers: MutPtr<CorePrinterDriverw>): Hresult =
    windowssysWindowsWin32GraphicsPrintingGetCorePrinterDriversW(pszserver.rawAddress.toCPointer<ByteVar>(), pszenvironment.rawAddress.toCPointer<ByteVar>(), pszzcoredriverdependencies.rawAddress.toCPointer<ByteVar>(), ccoreprinterdrivers, pcoreprinterdrivers.rawAddress.toCPointer<ByteVar>())

public actual fun getDefaultPrinterA(pszbuffer: Pstr, pcchbuffer: MutPtr<UInt>): Bool =
    windowssysWindowsWin32GraphicsPrintingGetDefaultPrinterA(pszbuffer.rawAddress.toCPointer<ByteVar>(), pcchbuffer.rawAddress.toCPointer<ByteVar>())

public actual fun getDefaultPrinterW(pszbuffer: Pwstr, pcchbuffer: MutPtr<UInt>): Bool =
    windowssysWindowsWin32GraphicsPrintingGetDefaultPrinterW(pszbuffer.rawAddress.toCPointer<ByteVar>(), pcchbuffer.rawAddress.toCPointer<ByteVar>())

public actual fun getFormA(hprinter: PrinterHandle, pformname: Pcstr, level: UInt, pform: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>): Bool =
    0

public actual fun getFormW(hprinter: PrinterHandle, pformname: Pcwstr, level: UInt, pform: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>): Bool =
    0

public actual fun getJobA(hprinter: PrinterHandle, jobid: UInt, level: UInt, pjob: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>): Bool =
    0

public actual fun getJobAttributes(pprintername: Pcwstr, pdevmode: ConstPtr<Devmodew>, pattributeinfo: MutPtr<AttributeInfo3>): Bool =
    windowssysWindowsWin32GraphicsPrintingGetJobAttributes(pprintername.rawAddress.toCPointer<ByteVar>(), pdevmode.rawAddress.toCPointer<ByteVar>(), pattributeinfo.rawAddress.toCPointer<ByteVar>())

public actual fun getJobAttributesEx(pprintername: Pcwstr, pdevmode: ConstPtr<Devmodew>, dwlevel: UInt, pattributeinfo: MutPtr<UByte>, nsize: UInt, dwflags: UInt): Bool =
    windowssysWindowsWin32GraphicsPrintingGetJobAttributesEx(pprintername.rawAddress.toCPointer<ByteVar>(), pdevmode.rawAddress.toCPointer<ByteVar>(), dwlevel, pattributeinfo.rawAddress.toCPointer<ByteVar>(), nsize, dwflags)

public actual fun getJobNamedPropertyValue(hprinter: PrinterHandle, jobid: UInt, pszname: Pcwstr, pvalue: MutPtr<PrintPropertyValue>): UInt =
    0u

public actual fun getJobW(hprinter: PrinterHandle, jobid: UInt, level: UInt, pjob: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>): Bool =
    0

public actual fun getPrintExecutionData(pdata: MutPtr<PrintExecutionData>): Bool =
    windowssysWindowsWin32GraphicsPrintingGetPrintExecutionData(pdata.rawAddress.toCPointer<ByteVar>())

public actual fun getPrintOutputInfo(hwnd: Hwnd, pszprinter: Pcwstr, phfile: MutPtr<Handle>, ppszoutputfile: MutPtr<Pwstr>): Hresult =
    windowssysWindowsWin32GraphicsPrintingGetPrintOutputInfo(hwnd.rawAddress.toCPointer<ByteVar>(), pszprinter.rawAddress.toCPointer<ByteVar>(), phfile.rawAddress.toCPointer<ByteVar>(), ppszoutputfile.rawAddress.toCPointer<ByteVar>())

public actual fun getPrintProcessorDirectoryA(pname: Pcstr, penvironment: Pcstr, level: UInt, pprintprocessorinfo: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>): Bool =
    windowssysWindowsWin32GraphicsPrintingGetPrintProcessorDirectoryA(pname.rawAddress.toCPointer<ByteVar>(), penvironment.rawAddress.toCPointer<ByteVar>(), level, pprintprocessorinfo.rawAddress.toCPointer<ByteVar>(), cbbuf, pcbneeded.rawAddress.toCPointer<ByteVar>())

public actual fun getPrintProcessorDirectoryW(pname: Pcwstr, penvironment: Pcwstr, level: UInt, pprintprocessorinfo: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>): Bool =
    windowssysWindowsWin32GraphicsPrintingGetPrintProcessorDirectoryW(pname.rawAddress.toCPointer<ByteVar>(), penvironment.rawAddress.toCPointer<ByteVar>(), level, pprintprocessorinfo.rawAddress.toCPointer<ByteVar>(), cbbuf, pcbneeded.rawAddress.toCPointer<ByteVar>())

public actual fun getPrinterA(hprinter: PrinterHandle, level: UInt, pprinter: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>): Bool =
    0

public actual fun getPrinterDataA(hprinter: PrinterHandle, pvaluename: Pcstr, ptype: MutPtr<UInt>, pdata: MutPtr<UByte>, nsize: UInt, pcbneeded: MutPtr<UInt>): UInt =
    0u

public actual fun getPrinterDataExA(hprinter: PrinterHandle, pkeyname: Pcstr, pvaluename: Pcstr, ptype: MutPtr<UInt>, pdata: MutPtr<UByte>, nsize: UInt, pcbneeded: MutPtr<UInt>): UInt =
    0u

public actual fun getPrinterDataExW(hprinter: PrinterHandle, pkeyname: Pcwstr, pvaluename: Pcwstr, ptype: MutPtr<UInt>, pdata: MutPtr<UByte>, nsize: UInt, pcbneeded: MutPtr<UInt>): UInt =
    0u

public actual fun getPrinterDataW(hprinter: PrinterHandle, pvaluename: Pcwstr, ptype: MutPtr<UInt>, pdata: MutPtr<UByte>, nsize: UInt, pcbneeded: MutPtr<UInt>): UInt =
    0u

public actual fun getPrinterDriver2A(hwnd: Hwnd, hprinter: PrinterHandle, penvironment: Pcstr, level: UInt, pdriverinfo: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>): Bool =
    0

public actual fun getPrinterDriver2W(hwnd: Hwnd, hprinter: PrinterHandle, penvironment: Pcwstr, level: UInt, pdriverinfo: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>): Bool =
    0

public actual fun getPrinterDriverA(hprinter: PrinterHandle, penvironment: Pcstr, level: UInt, pdriverinfo: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>): Bool =
    0

public actual fun getPrinterDriverDirectoryA(pname: Pcstr, penvironment: Pcstr, level: UInt, pdriverdirectory: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>): Bool =
    windowssysWindowsWin32GraphicsPrintingGetPrinterDriverDirectoryA(pname.rawAddress.toCPointer<ByteVar>(), penvironment.rawAddress.toCPointer<ByteVar>(), level, pdriverdirectory.rawAddress.toCPointer<ByteVar>(), cbbuf, pcbneeded.rawAddress.toCPointer<ByteVar>())

public actual fun getPrinterDriverDirectoryW(pname: Pcwstr, penvironment: Pcwstr, level: UInt, pdriverdirectory: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>): Bool =
    windowssysWindowsWin32GraphicsPrintingGetPrinterDriverDirectoryW(pname.rawAddress.toCPointer<ByteVar>(), penvironment.rawAddress.toCPointer<ByteVar>(), level, pdriverdirectory.rawAddress.toCPointer<ByteVar>(), cbbuf, pcbneeded.rawAddress.toCPointer<ByteVar>())

public actual fun getPrinterDriverPackagePathA(pszserver: Pcstr, pszenvironment: Pcstr, pszlanguage: Pcstr, pszpackageid: Pcstr, pszdriverpackagecab: Pstr, cchdriverpackagecab: UInt, pcchrequiredsize: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32GraphicsPrintingGetPrinterDriverPackagePathA(pszserver.rawAddress.toCPointer<ByteVar>(), pszenvironment.rawAddress.toCPointer<ByteVar>(), pszlanguage.rawAddress.toCPointer<ByteVar>(), pszpackageid.rawAddress.toCPointer<ByteVar>(), pszdriverpackagecab.rawAddress.toCPointer<ByteVar>(), cchdriverpackagecab, pcchrequiredsize.rawAddress.toCPointer<ByteVar>())

public actual fun getPrinterDriverPackagePathW(pszserver: Pcwstr, pszenvironment: Pcwstr, pszlanguage: Pcwstr, pszpackageid: Pcwstr, pszdriverpackagecab: Pwstr, cchdriverpackagecab: UInt, pcchrequiredsize: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32GraphicsPrintingGetPrinterDriverPackagePathW(pszserver.rawAddress.toCPointer<ByteVar>(), pszenvironment.rawAddress.toCPointer<ByteVar>(), pszlanguage.rawAddress.toCPointer<ByteVar>(), pszpackageid.rawAddress.toCPointer<ByteVar>(), pszdriverpackagecab.rawAddress.toCPointer<ByteVar>(), cchdriverpackagecab, pcchrequiredsize.rawAddress.toCPointer<ByteVar>())

public actual fun getPrinterDriverW(hprinter: PrinterHandle, penvironment: Pcwstr, level: UInt, pdriverinfo: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>): Bool =
    0

public actual fun getPrinterW(hprinter: PrinterHandle, level: UInt, pprinter: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>): Bool =
    0

public actual fun getSpoolFileHandle(hprinter: PrinterHandle): Handle =
    MutPtr(0L)

public actual fun impersonatePrinterClient(htoken: Handle): Bool =
    windowssysWindowsWin32GraphicsPrintingImpersonatePrinterClient(htoken.rawAddress.toCPointer<ByteVar>())

public actual fun installPrinterDriverFromPackageA(pszserver: Pcstr, pszinfpath: Pcstr, pszdrivername: Pcstr, pszenvironment: Pcstr, dwflags: UInt): Hresult =
    windowssysWindowsWin32GraphicsPrintingInstallPrinterDriverFromPackageA(pszserver.rawAddress.toCPointer<ByteVar>(), pszinfpath.rawAddress.toCPointer<ByteVar>(), pszdrivername.rawAddress.toCPointer<ByteVar>(), pszenvironment.rawAddress.toCPointer<ByteVar>(), dwflags)

public actual fun installPrinterDriverFromPackageW(pszserver: Pcwstr, pszinfpath: Pcwstr, pszdrivername: Pcwstr, pszenvironment: Pcwstr, dwflags: UInt): Hresult =
    windowssysWindowsWin32GraphicsPrintingInstallPrinterDriverFromPackageW(pszserver.rawAddress.toCPointer<ByteVar>(), pszinfpath.rawAddress.toCPointer<ByteVar>(), pszdrivername.rawAddress.toCPointer<ByteVar>(), pszenvironment.rawAddress.toCPointer<ByteVar>(), dwflags)

public actual fun isValidDevmodeA(pdevmode: ConstPtr<Devmodea>, devmodesize: ULong): Bool =
    windowssysWindowsWin32GraphicsPrintingIsValidDevmodeA(pdevmode.rawAddress.toCPointer<ByteVar>(), devmodesize)

public actual fun isValidDevmodeW(pdevmode: ConstPtr<Devmodew>, devmodesize: ULong): Bool =
    windowssysWindowsWin32GraphicsPrintingIsValidDevmodeW(pdevmode.rawAddress.toCPointer<ByteVar>(), devmodesize)

public actual fun openPrinter2A(pprintername: Pcstr, phprinter: MutPtr<PrinterHandle>, pdefault: ConstPtr<PrinterDefaultsa>, poptions: ConstPtr<PrinterOptionsa>): Bool =
    windowssysWindowsWin32GraphicsPrintingOpenPrinter2A(pprintername.rawAddress.toCPointer<ByteVar>(), phprinter.rawAddress.toCPointer<ByteVar>(), pdefault.rawAddress.toCPointer<ByteVar>(), poptions.rawAddress.toCPointer<ByteVar>())

public actual fun openPrinter2W(pprintername: Pcwstr, phprinter: MutPtr<PrinterHandle>, pdefault: ConstPtr<PrinterDefaultsw>, poptions: ConstPtr<PrinterOptionsw>): Bool =
    windowssysWindowsWin32GraphicsPrintingOpenPrinter2W(pprintername.rawAddress.toCPointer<ByteVar>(), phprinter.rawAddress.toCPointer<ByteVar>(), pdefault.rawAddress.toCPointer<ByteVar>(), poptions.rawAddress.toCPointer<ByteVar>())

public actual fun openPrinterA(pprintername: Pcstr, phprinter: MutPtr<PrinterHandle>, pdefault: ConstPtr<PrinterDefaultsa>): Bool =
    windowssysWindowsWin32GraphicsPrintingOpenPrinterA(pprintername.rawAddress.toCPointer<ByteVar>(), phprinter.rawAddress.toCPointer<ByteVar>(), pdefault.rawAddress.toCPointer<ByteVar>())

public actual fun openPrinterW(pprintername: Pcwstr, phprinter: MutPtr<PrinterHandle>, pdefault: ConstPtr<PrinterDefaultsw>): Bool =
    windowssysWindowsWin32GraphicsPrintingOpenPrinterW(pprintername.rawAddress.toCPointer<ByteVar>(), phprinter.rawAddress.toCPointer<ByteVar>(), pdefault.rawAddress.toCPointer<ByteVar>())

public actual fun partialReplyPrinterChangeNotification(hprinter: PrinterHandle, pdatasrc: ConstPtr<PrinterNotifyInfoData>): Bool =
    0

public actual fun playGdiScriptOnPrinterIC(hprinteric: Handle, pin: ConstPtr<UByte>, cin: UInt, pout: MutPtr<UByte>, cout: UInt, ul: UInt): Bool =
    windowssysWindowsWin32GraphicsPrintingPlayGdiScriptOnPrinterIC(hprinteric.rawAddress.toCPointer<ByteVar>(), pin.rawAddress.toCPointer<ByteVar>(), cin, pout.rawAddress.toCPointer<ByteVar>(), cout, ul)

public actual fun printerMessageBoxA(hprinter: PrinterHandle, error: UInt, hwnd: Hwnd, ptext: Pcstr, pcaption: Pcstr, dwtype: UInt): UInt =
    0u

public actual fun printerMessageBoxW(hprinter: PrinterHandle, error: UInt, hwnd: Hwnd, ptext: Pcwstr, pcaption: Pcwstr, dwtype: UInt): UInt =
    0u

public actual fun printerProperties(hwnd: Hwnd, hprinter: PrinterHandle): Bool =
    0

public actual fun providorFindClosePrinterChangeNotification(hprinter: PrinterHandle): Bool =
    0

public actual fun providorFindFirstPrinterChangeNotification(hprinter: PrinterHandle, fdwflags: UInt, fdwoptions: UInt, hnotify: Handle, pprinternotifyoptions: ConstPtr<CVoid>, pvreserved1: MutPtr<CVoid>): Bool =
    0

public actual fun readPrinter(hprinter: PrinterHandle, pbuf: MutPtr<CVoid>, cbbuf: UInt, pnobytesread: MutPtr<UInt>): Bool =
    0

public actual fun registerForPrintAsyncNotifications(pszname: Pcwstr, pnotificationtype: ConstPtr<Guid>, euserfilter: PrintAsyncNotifyUserFilter, econversationstyle: PrintAsyncNotifyConversationStyle, pcallback: MutPtr<CVoid>, phnotify: MutPtr<Handle>): Hresult =
    windowssysWindowsWin32GraphicsPrintingRegisterForPrintAsyncNotifications(pszname.rawAddress.toCPointer<ByteVar>(), pnotificationtype.rawAddress.toCPointer<ByteVar>(), euserfilter, econversationstyle, pcallback.rawAddress.toCPointer<ByteVar>(), phnotify.rawAddress.toCPointer<ByteVar>())

public actual fun removePrintDeviceObject(hdeviceobject: Handle): Hresult =
    windowssysWindowsWin32GraphicsPrintingRemovePrintDeviceObject(hdeviceobject.rawAddress.toCPointer<ByteVar>())

public actual fun replyPrinterChangeNotification(hprinter: PrinterHandle, fdwchangeflags: UInt, pdwresult: MutPtr<UInt>, pprinternotifyinfo: ConstPtr<CVoid>): Bool =
    0

public actual fun replyPrinterChangeNotificationEx(hnotify: Handle, dwcolor: UInt, fdwflags: UInt, pdwresult: MutPtr<UInt>, pprinternotifyinfo: ConstPtr<CVoid>): Bool =
    windowssysWindowsWin32GraphicsPrintingReplyPrinterChangeNotificationEx(hnotify.rawAddress.toCPointer<ByteVar>(), dwcolor, fdwflags, pdwresult.rawAddress.toCPointer<ByteVar>(), pprinternotifyinfo.rawAddress.toCPointer<ByteVar>())

public actual fun reportJobProcessingProgress(printerhandle: Handle, jobid: UInt, joboperation: EPrintXPSJobOperation, jobprogress: EPrintXPSJobProgress): Hresult =
    windowssysWindowsWin32GraphicsPrintingReportJobProcessingProgress(printerhandle.rawAddress.toCPointer<ByteVar>(), jobid, joboperation, jobprogress)

public actual fun resetPrinterA(hprinter: PrinterHandle, pdefault: ConstPtr<PrinterDefaultsa>): Bool =
    0

public actual fun resetPrinterW(hprinter: PrinterHandle, pdefault: ConstPtr<PrinterDefaultsw>): Bool =
    0

public actual fun revertToPrinterSelf(): Handle =
    MutPtr(windowssysWindowsWin32GraphicsPrintingRevertToPrinterSelf()?.toLong() ?: 0L)

public actual fun routerAllocBidiMem(numbytes: ULong): MutPtr<CVoid> =
    MutPtr(windowssysWindowsWin32GraphicsPrintingRouterAllocBidiMem(numbytes)?.toLong() ?: 0L)

public actual fun routerAllocBidiResponseContainer(count: UInt): MutPtr<BidiResponseContainer> =
    MutPtr(windowssysWindowsWin32GraphicsPrintingRouterAllocBidiResponseContainer(count)?.toLong() ?: 0L)

public actual fun routerAllocPrinterNotifyInfo(cprinternotifyinfodata: UInt): MutPtr<PrinterNotifyInfo> =
    MutPtr(windowssysWindowsWin32GraphicsPrintingRouterAllocPrinterNotifyInfo(cprinternotifyinfodata)?.toLong() ?: 0L)

public actual fun routerFreeBidiMem(pmempointer: ConstPtr<CVoid>) {
    windowssysWindowsWin32GraphicsPrintingRouterFreeBidiMem(pmempointer.rawAddress.toCPointer<ByteVar>())
}

public actual fun routerFreeBidiResponseContainer(pdata: ConstPtr<BidiResponseContainer>): UInt =
    windowssysWindowsWin32GraphicsPrintingRouterFreeBidiResponseContainer(pdata.rawAddress.toCPointer<ByteVar>())

public actual fun routerFreePrinterNotifyInfo(pinfo: ConstPtr<PrinterNotifyInfo>): Bool =
    windowssysWindowsWin32GraphicsPrintingRouterFreePrinterNotifyInfo(pinfo.rawAddress.toCPointer<ByteVar>())

public actual fun scheduleJob(hprinter: PrinterHandle, jobid: UInt): Bool =
    0

public actual fun setCPSUIUserData(hdlg: Hwnd, cpsuiuserdata: ULong): Bool =
    windowssysWindowsWin32GraphicsPrintingSetCPSUIUserData(hdlg.rawAddress.toCPointer<ByteVar>(), cpsuiuserdata)

public actual fun setDefaultPrinterA(pszprinter: Pcstr): Bool =
    windowssysWindowsWin32GraphicsPrintingSetDefaultPrinterA(pszprinter.rawAddress.toCPointer<ByteVar>())

public actual fun setDefaultPrinterW(pszprinter: Pcwstr): Bool =
    windowssysWindowsWin32GraphicsPrintingSetDefaultPrinterW(pszprinter.rawAddress.toCPointer<ByteVar>())

public actual fun setFormA(hprinter: PrinterHandle, pformname: Pcstr, level: UInt, pform: ConstPtr<UByte>): Bool =
    0

public actual fun setFormW(hprinter: PrinterHandle, pformname: Pcwstr, level: UInt, pform: ConstPtr<UByte>): Bool =
    0

public actual fun setJobA(hprinter: PrinterHandle, jobid: UInt, level: UInt, pjob: ConstPtr<UByte>, command: UInt): Bool =
    0

public actual fun setJobNamedProperty(hprinter: PrinterHandle, jobid: UInt, pproperty: ConstPtr<PrintNamedProperty>): UInt =
    0u

public actual fun setJobW(hprinter: PrinterHandle, jobid: UInt, level: UInt, pjob: ConstPtr<UByte>, command: UInt): Bool =
    0

public actual fun setPortA(pname: Pcstr, pportname: Pcstr, dwlevel: UInt, pportinfo: ConstPtr<UByte>): Bool =
    windowssysWindowsWin32GraphicsPrintingSetPortA(pname.rawAddress.toCPointer<ByteVar>(), pportname.rawAddress.toCPointer<ByteVar>(), dwlevel, pportinfo.rawAddress.toCPointer<ByteVar>())

public actual fun setPortW(pname: Pcwstr, pportname: Pcwstr, dwlevel: UInt, pportinfo: ConstPtr<UByte>): Bool =
    windowssysWindowsWin32GraphicsPrintingSetPortW(pname.rawAddress.toCPointer<ByteVar>(), pportname.rawAddress.toCPointer<ByteVar>(), dwlevel, pportinfo.rawAddress.toCPointer<ByteVar>())

public actual fun setPrinterA(hprinter: PrinterHandle, level: UInt, pprinter: ConstPtr<UByte>, command: UInt): Bool =
    0

public actual fun setPrinterDataA(hprinter: PrinterHandle, pvaluename: Pcstr, type: UInt, pdata: ConstPtr<UByte>, cbdata: UInt): UInt =
    0u

public actual fun setPrinterDataExA(hprinter: PrinterHandle, pkeyname: Pcstr, pvaluename: Pcstr, type: UInt, pdata: ConstPtr<UByte>, cbdata: UInt): UInt =
    0u

public actual fun setPrinterDataExW(hprinter: PrinterHandle, pkeyname: Pcwstr, pvaluename: Pcwstr, type: UInt, pdata: ConstPtr<UByte>, cbdata: UInt): UInt =
    0u

public actual fun setPrinterDataW(hprinter: PrinterHandle, pvaluename: Pcwstr, type: UInt, pdata: ConstPtr<UByte>, cbdata: UInt): UInt =
    0u

public actual fun setPrinterW(hprinter: PrinterHandle, level: UInt, pprinter: ConstPtr<UByte>, command: UInt): Bool =
    0

public actual fun splIsSessionZero(hprinter: PrinterHandle, jobid: UInt, pissessionzero: MutPtr<Bool>): UInt =
    0u

public actual fun splPromptUIInUsersSession(hprinter: PrinterHandle, jobid: UInt, puiparams: ConstPtr<Showuiparams>, presponse: MutPtr<UInt>): Bool =
    0

public actual fun spoolerCopyFileEvent(pszprintername: Pcwstr, pszkey: Pcwstr, dwcopyfileevent: UInt): Bool =
    windowssysWindowsWin32GraphicsPrintingSpoolerCopyFileEvent(pszprintername.rawAddress.toCPointer<ByteVar>(), pszkey.rawAddress.toCPointer<ByteVar>(), dwcopyfileevent)

public actual fun spoolerFindClosePrinterChangeNotification(hprinter: PrinterHandle): Bool =
    0

public actual fun spoolerFindFirstPrinterChangeNotification(hprinter: PrinterHandle, fdwfilterflags: UInt, fdwoptions: UInt, pprinternotifyoptions: ConstPtr<CVoid>, pvreserved: ConstPtr<CVoid>, pnotificationconfig: ConstPtr<CVoid>, phnotify: MutPtr<Handle>, phevent: MutPtr<Handle>): Bool =
    0

public actual fun spoolerFindNextPrinterChangeNotification(hprinter: PrinterHandle, pfdwchange: MutPtr<UInt>, pprinternotifyoptions: ConstPtr<CVoid>, ppprinternotifyinfo: MutPtr<MutPtr<CVoid>>): Bool =
    0

public actual fun spoolerFreePrinterNotifyInfo(pinfo: ConstPtr<PrinterNotifyInfo>) {
    windowssysWindowsWin32GraphicsPrintingSpoolerFreePrinterNotifyInfo(pinfo.rawAddress.toCPointer<ByteVar>())
}

public actual fun spoolerRefreshPrinterChangeNotification(hprinter: PrinterHandle, dwcolor: UInt, poptions: ConstPtr<PrinterNotifyOptions>, ppinfo: MutPtr<MutPtr<PrinterNotifyInfo>>): Bool =
    0

public actual fun startDocPrinterA(hprinter: PrinterHandle, level: UInt, pdocinfo: ConstPtr<DocInfo1a>): UInt =
    0u

public actual fun startDocPrinterW(hprinter: PrinterHandle, level: UInt, pdocinfo: ConstPtr<DocInfo1w>): UInt =
    0u

public actual fun startPagePrinter(hprinter: PrinterHandle): Bool =
    0

public actual fun unRegisterForPrintAsyncNotifications(param0: Handle): Hresult =
    windowssysWindowsWin32GraphicsPrintingUnRegisterForPrintAsyncNotifications(param0.rawAddress.toCPointer<ByteVar>())

public actual fun updatePrintDeviceObject(hprinter: PrinterHandle, hdeviceobject: Handle): Hresult =
    0

public actual fun uploadPrinterDriverPackageA(pszserver: Pcstr, pszinfpath: Pcstr, pszenvironment: Pcstr, dwflags: UInt, hwnd: Hwnd, pszdestinfpath: Pstr, pcchdestinfpath: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32GraphicsPrintingUploadPrinterDriverPackageA(pszserver.rawAddress.toCPointer<ByteVar>(), pszinfpath.rawAddress.toCPointer<ByteVar>(), pszenvironment.rawAddress.toCPointer<ByteVar>(), dwflags, hwnd.rawAddress.toCPointer<ByteVar>(), pszdestinfpath.rawAddress.toCPointer<ByteVar>(), pcchdestinfpath.rawAddress.toCPointer<ByteVar>())

public actual fun uploadPrinterDriverPackageW(pszserver: Pcwstr, pszinfpath: Pcwstr, pszenvironment: Pcwstr, dwflags: UInt, hwnd: Hwnd, pszdestinfpath: Pwstr, pcchdestinfpath: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32GraphicsPrintingUploadPrinterDriverPackageW(pszserver.rawAddress.toCPointer<ByteVar>(), pszinfpath.rawAddress.toCPointer<ByteVar>(), pszenvironment.rawAddress.toCPointer<ByteVar>(), dwflags, hwnd.rawAddress.toCPointer<ByteVar>(), pszdestinfpath.rawAddress.toCPointer<ByteVar>(), pcchdestinfpath.rawAddress.toCPointer<ByteVar>())

public actual fun waitForPrinterChange(hprinter: PrinterHandle, flags: UInt): UInt =
    0u

public actual fun writePrinter(hprinter: PrinterHandle, pbuf: ConstPtr<CVoid>, cbbuf: UInt, pcwritten: MutPtr<UInt>): Bool =
    0

public actual fun xcvDataW(hxcv: Handle, pszdataname: Pcwstr, pinputdata: ConstPtr<UByte>, cbinputdata: UInt, poutputdata: MutPtr<UByte>, cboutputdata: UInt, pcboutputneeded: MutPtr<UInt>, pdwstatus: MutPtr<UInt>): Bool =
    windowssysWindowsWin32GraphicsPrintingXcvDataW(hxcv.rawAddress.toCPointer<ByteVar>(), pszdataname.rawAddress.toCPointer<ByteVar>(), pinputdata.rawAddress.toCPointer<ByteVar>(), cbinputdata, poutputdata.rawAddress.toCPointer<ByteVar>(), cboutputdata, pcboutputneeded.rawAddress.toCPointer<ByteVar>(), pdwstatus.rawAddress.toCPointer<ByteVar>())
