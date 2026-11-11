@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.graphics.printing

import io.github.kotlinmania.windowssys.COpaquePointer
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
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hdc
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_addMonitorA
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_addMonitorW
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_addPortA
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_addPortW
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_addPrintProcessorA
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_addPrintProcessorW
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_addPrintProvidorA
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_addPrintProvidorW
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_addPrinterA
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_addPrinterConnection2A
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_addPrinterConnection2W
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_addPrinterConnectionA
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_addPrinterConnectionW
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_addPrinterDriverA
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_addPrinterDriverExA
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_addPrinterDriverExW
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_addPrinterDriverW
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_addPrinterW
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_appendPrinterNotifyInfoData
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_callRouterFindFirstPrinterChangeNotification
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_commonPropertySheetUIA
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_commonPropertySheetUIW
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_configurePortA
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_configurePortW
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_connectToPrinterDlg
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_createPrintAsyncNotifyChannel
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_deleteMonitorA
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_deleteMonitorW
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_deletePortA
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_deletePortW
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_deletePrintProcessorA
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_deletePrintProcessorW
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_deletePrintProvidorA
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_deletePrintProvidorW
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_deletePrinterConnectionA
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_deletePrinterConnectionW
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_deletePrinterDriverA
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_deletePrinterDriverExA
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_deletePrinterDriverExW
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_deletePrinterDriverPackageA
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_deletePrinterDriverPackageW
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_deletePrinterDriverW
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_deletePrinterIC
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_devQueryPrintEx
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_enumMonitorsA
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_enumMonitorsW
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_enumPortsA
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_enumPortsW
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_enumPrintProcessorDatatypesA
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_enumPrintProcessorDatatypesW
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_enumPrintProcessorsA
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_enumPrintProcessorsW
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_enumPrinterDriversA
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_enumPrinterDriversW
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_enumPrintersA
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_enumPrintersW
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_extDeviceMode
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_findClosePrinterChangeNotification
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_findNextPrinterChangeNotification
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_freePrintNamedPropertyArray
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_freePrintPropertyValue
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_freePrinterNotifyInfo
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_gdiDeleteSpoolFileHandle
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_gdiEndDocEMF
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_gdiEndPageEMF
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_gdiGetDC
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_gdiGetDevmodeForPage
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_gdiGetPageCount
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_gdiGetPageHandle
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_gdiGetSpoolFileHandle
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_gdiPlayPageEMF
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_gdiResetDCEMF
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_gdiStartDocEMF
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_gdiStartPageEMF
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_generateCopyFilePaths
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_getCPSUIUserData
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_getCorePrinterDriversA
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_getCorePrinterDriversW
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_getDefaultPrinterA
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_getDefaultPrinterW
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_getJobAttributes
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_getJobAttributesEx
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_getPrintExecutionData
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_getPrintOutputInfo
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_getPrintProcessorDirectoryA
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_getPrintProcessorDirectoryW
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_getPrinterDriverDirectoryA
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_getPrinterDriverDirectoryW
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_getPrinterDriverPackagePathA
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_getPrinterDriverPackagePathW
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_impersonatePrinterClient
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_installPrinterDriverFromPackageA
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_installPrinterDriverFromPackageW
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_isValidDevmodeA
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_isValidDevmodeW
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_openPrinter2A
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_openPrinter2W
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_openPrinterA
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_openPrinterW
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_playGdiScriptOnPrinterIC
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_registerForPrintAsyncNotifications
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_removePrintDeviceObject
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_replyPrinterChangeNotificationEx
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_reportJobProcessingProgress
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_revertToPrinterSelf
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_routerAllocBidiMem
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_routerAllocBidiResponseContainer
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_routerAllocPrinterNotifyInfo
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_routerFreeBidiMem
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_routerFreeBidiResponseContainer
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_routerFreePrinterNotifyInfo
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_setCPSUIUserData
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_setDefaultPrinterA
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_setDefaultPrinterW
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_setPortA
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_setPortW
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_spoolerCopyFileEvent
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_spoolerFreePrinterNotifyInfo
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_unRegisterForPrintAsyncNotifications
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_uploadPrinterDriverPackageA
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_uploadPrinterDriverPackageW
import io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_xcvDataW
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun abortPrinter(hprinter: PrinterHandle): Bool =
    0

public actual fun addFormA(hprinter: PrinterHandle, level: UInt, pform: COpaquePointer?): Bool =
    0

public actual fun addFormW(hprinter: PrinterHandle, level: UInt, pform: COpaquePointer?): Bool =
    0

public actual fun addJobA(hprinter: PrinterHandle, level: UInt, pdata: COpaquePointer?, cbbuf: UInt, pcbneeded: COpaquePointer?): Bool =
    0

public actual fun addJobW(hprinter: PrinterHandle, level: UInt, pdata: COpaquePointer?, cbbuf: UInt, pcbneeded: COpaquePointer?): Bool =
    0

public actual fun addMonitorA(pname: Pcstr, level: UInt, pmonitors: COpaquePointer?): Bool =
    windowssys_windows_win32_graphics_printing_addMonitorA(pname?.value?.toCPointer<ByteVar>(), level, pmonitors?.value?.toCPointer<ByteVar>())

public actual fun addMonitorW(pname: Pcwstr, level: UInt, pmonitors: COpaquePointer?): Bool =
    windowssys_windows_win32_graphics_printing_addMonitorW(pname?.value?.toCPointer<ByteVar>(), level, pmonitors?.value?.toCPointer<ByteVar>())

public actual fun addPortA(pname: Pcstr, hwnd: Hwnd, pmonitorname: Pcstr): Bool =
    windowssys_windows_win32_graphics_printing_addPortA(pname?.value?.toCPointer<ByteVar>(), hwnd?.value?.toCPointer<ByteVar>(), pmonitorname?.value?.toCPointer<ByteVar>())

public actual fun addPortW(pname: Pcwstr, hwnd: Hwnd, pmonitorname: Pcwstr): Bool =
    windowssys_windows_win32_graphics_printing_addPortW(pname?.value?.toCPointer<ByteVar>(), hwnd?.value?.toCPointer<ByteVar>(), pmonitorname?.value?.toCPointer<ByteVar>())

public actual fun addPrintDeviceObject(hprinter: PrinterHandle, phdeviceobject: COpaquePointer?): Hresult =
    0

public actual fun addPrintProcessorA(pname: Pcstr, penvironment: Pcstr, ppathname: Pcstr, pprintprocessorname: Pcstr): Bool =
    windowssys_windows_win32_graphics_printing_addPrintProcessorA(pname?.value?.toCPointer<ByteVar>(), penvironment?.value?.toCPointer<ByteVar>(), ppathname?.value?.toCPointer<ByteVar>(), pprintprocessorname?.value?.toCPointer<ByteVar>())

public actual fun addPrintProcessorW(pname: Pcwstr, penvironment: Pcwstr, ppathname: Pcwstr, pprintprocessorname: Pcwstr): Bool =
    windowssys_windows_win32_graphics_printing_addPrintProcessorW(pname?.value?.toCPointer<ByteVar>(), penvironment?.value?.toCPointer<ByteVar>(), ppathname?.value?.toCPointer<ByteVar>(), pprintprocessorname?.value?.toCPointer<ByteVar>())

public actual fun addPrintProvidorA(pname: Pcstr, level: UInt, pprovidorinfo: COpaquePointer?): Bool =
    windowssys_windows_win32_graphics_printing_addPrintProvidorA(pname?.value?.toCPointer<ByteVar>(), level, pprovidorinfo?.value?.toCPointer<ByteVar>())

public actual fun addPrintProvidorW(pname: Pcwstr, level: UInt, pprovidorinfo: COpaquePointer?): Bool =
    windowssys_windows_win32_graphics_printing_addPrintProvidorW(pname?.value?.toCPointer<ByteVar>(), level, pprovidorinfo?.value?.toCPointer<ByteVar>())

public actual fun addPrinterA(pname: Pcstr, level: UInt, pprinter: COpaquePointer?): Handle =
    windowssys_windows_win32_graphics_printing_addPrinterA(pname?.value?.toCPointer<ByteVar>(), level, pprinter?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun addPrinterConnection2A(hwnd: Hwnd, pszname: Pcstr, dwlevel: UInt, pconnectioninfo: COpaquePointer?): Bool =
    windowssys_windows_win32_graphics_printing_addPrinterConnection2A(hwnd?.value?.toCPointer<ByteVar>(), pszname?.value?.toCPointer<ByteVar>(), dwlevel, pconnectioninfo?.value?.toCPointer<ByteVar>())

public actual fun addPrinterConnection2W(hwnd: Hwnd, pszname: Pcwstr, dwlevel: UInt, pconnectioninfo: COpaquePointer?): Bool =
    windowssys_windows_win32_graphics_printing_addPrinterConnection2W(hwnd?.value?.toCPointer<ByteVar>(), pszname?.value?.toCPointer<ByteVar>(), dwlevel, pconnectioninfo?.value?.toCPointer<ByteVar>())

public actual fun addPrinterConnectionA(pname: Pcstr): Bool =
    windowssys_windows_win32_graphics_printing_addPrinterConnectionA(pname?.value?.toCPointer<ByteVar>())

public actual fun addPrinterConnectionW(pname: Pcwstr): Bool =
    windowssys_windows_win32_graphics_printing_addPrinterConnectionW(pname?.value?.toCPointer<ByteVar>())

public actual fun addPrinterDriverA(pname: Pcstr, level: UInt, pdriverinfo: COpaquePointer?): Bool =
    windowssys_windows_win32_graphics_printing_addPrinterDriverA(pname?.value?.toCPointer<ByteVar>(), level, pdriverinfo?.value?.toCPointer<ByteVar>())

public actual fun addPrinterDriverExA(pname: Pcstr, level: UInt, lpbdriverinfo: COpaquePointer?, dwfilecopyflags: UInt): Bool =
    windowssys_windows_win32_graphics_printing_addPrinterDriverExA(pname?.value?.toCPointer<ByteVar>(), level, lpbdriverinfo?.value?.toCPointer<ByteVar>(), dwfilecopyflags)

public actual fun addPrinterDriverExW(pname: Pcwstr, level: UInt, lpbdriverinfo: COpaquePointer?, dwfilecopyflags: UInt): Bool =
    windowssys_windows_win32_graphics_printing_addPrinterDriverExW(pname?.value?.toCPointer<ByteVar>(), level, lpbdriverinfo?.value?.toCPointer<ByteVar>(), dwfilecopyflags)

public actual fun addPrinterDriverW(pname: Pcwstr, level: UInt, pdriverinfo: COpaquePointer?): Bool =
    windowssys_windows_win32_graphics_printing_addPrinterDriverW(pname?.value?.toCPointer<ByteVar>(), level, pdriverinfo?.value?.toCPointer<ByteVar>())

public actual fun addPrinterW(pname: Pcwstr, level: UInt, pprinter: COpaquePointer?): Handle =
    windowssys_windows_win32_graphics_printing_addPrinterW(pname?.value?.toCPointer<ByteVar>(), level, pprinter?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun advancedDocumentPropertiesA(hwnd: Hwnd, hprinter: PrinterHandle, pdevicename: Pcstr, pdevmodeoutput: COpaquePointer?, pdevmodeinput: COpaquePointer?): Int =
    0

public actual fun advancedDocumentPropertiesW(hwnd: Hwnd, hprinter: PrinterHandle, pdevicename: Pcwstr, pdevmodeoutput: COpaquePointer?, pdevmodeinput: COpaquePointer?): Int =
    0

public actual fun appendPrinterNotifyInfoData(pinfodest: COpaquePointer?, pdatasrc: COpaquePointer?, fdwflags: UInt): Bool =
    windowssys_windows_win32_graphics_printing_appendPrinterNotifyInfoData(pinfodest?.value?.toCPointer<ByteVar>(), pdatasrc?.value?.toCPointer<ByteVar>(), fdwflags)

public actual fun callRouterFindFirstPrinterChangeNotification(hprinterrpc: Handle, fdwfilterflags: UInt, fdwoptions: UInt, hnotify: Handle, pprinternotifyoptions: COpaquePointer?): UInt =
    windowssys_windows_win32_graphics_printing_callRouterFindFirstPrinterChangeNotification(hprinterrpc?.value?.toCPointer<ByteVar>(), fdwfilterflags, fdwoptions, hnotify?.value?.toCPointer<ByteVar>(), pprinternotifyoptions?.value?.toCPointer<ByteVar>())

public actual fun closePrinter(hprinter: PrinterHandle): Bool =
    0

public actual fun closeSpoolFileHandle(hprinter: PrinterHandle, hspoolfile: Handle): Bool =
    0

public actual fun commitSpoolData(hprinter: PrinterHandle, hspoolfile: Handle, cbcommit: UInt): Handle =
    null

public actual fun commonPropertySheetUIA(hwndowner: Hwnd, pfnpropsheetui: Pfnpropsheetui, lparam: Lparam, presult: COpaquePointer?): Int =
    windowssys_windows_win32_graphics_printing_commonPropertySheetUIA(hwndowner?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lparam, presult?.value?.toCPointer<ByteVar>())

public actual fun commonPropertySheetUIW(hwndowner: Hwnd, pfnpropsheetui: Pfnpropsheetui, lparam: Lparam, presult: COpaquePointer?): Int =
    windowssys_windows_win32_graphics_printing_commonPropertySheetUIW(hwndowner?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lparam, presult?.value?.toCPointer<ByteVar>())

public actual fun configurePortA(pname: Pcstr, hwnd: Hwnd, pportname: Pcstr): Bool =
    windowssys_windows_win32_graphics_printing_configurePortA(pname?.value?.toCPointer<ByteVar>(), hwnd?.value?.toCPointer<ByteVar>(), pportname?.value?.toCPointer<ByteVar>())

public actual fun configurePortW(pname: Pcwstr, hwnd: Hwnd, pportname: Pcwstr): Bool =
    windowssys_windows_win32_graphics_printing_configurePortW(pname?.value?.toCPointer<ByteVar>(), hwnd?.value?.toCPointer<ByteVar>(), pportname?.value?.toCPointer<ByteVar>())

public actual fun connectToPrinterDlg(hwnd: Hwnd, flags: UInt): Handle =
    windowssys_windows_win32_graphics_printing_connectToPrinterDlg(hwnd?.value?.toCPointer<ByteVar>(), flags)?.let { COpaquePointer(it.toLong()) }

public actual fun corePrinterDriverInstalledA(pszserver: Pcstr, pszenvironment: Pcstr, coredriverguid: Guid, ftdriverdate: Filetime, dwldriverversion: ULong, pbdriverinstalled: COpaquePointer?): Hresult =
    0

public actual fun corePrinterDriverInstalledW(pszserver: Pcwstr, pszenvironment: Pcwstr, coredriverguid: Guid, ftdriverdate: Filetime, dwldriverversion: ULong, pbdriverinstalled: COpaquePointer?): Hresult =
    0

public actual fun createPrintAsyncNotifyChannel(pszname: Pcwstr, pnotificationtype: COpaquePointer?, euserfilter: PrintAsyncNotifyUserFilter, econversationstyle: PrintAsyncNotifyConversationStyle, pcallback: COpaquePointer?, ppiasynchnotification: COpaquePointer?): Hresult =
    windowssys_windows_win32_graphics_printing_createPrintAsyncNotifyChannel(pszname?.value?.toCPointer<ByteVar>(), pnotificationtype?.value?.toCPointer<ByteVar>(), euserfilter, econversationstyle, pcallback?.value?.toCPointer<ByteVar>(), ppiasynchnotification?.value?.toCPointer<ByteVar>())

public actual fun createPrinterIC(hprinter: PrinterHandle, pdevmode: COpaquePointer?): Handle =
    null

public actual fun deleteFormA(hprinter: PrinterHandle, pformname: Pcstr): Bool =
    0

public actual fun deleteFormW(hprinter: PrinterHandle, pformname: Pcwstr): Bool =
    0

public actual fun deleteJobNamedProperty(hprinter: PrinterHandle, jobid: UInt, pszname: Pcwstr): UInt =
    0u

public actual fun deleteMonitorA(pname: Pcstr, penvironment: Pcstr, pmonitorname: Pcstr): Bool =
    windowssys_windows_win32_graphics_printing_deleteMonitorA(pname?.value?.toCPointer<ByteVar>(), penvironment?.value?.toCPointer<ByteVar>(), pmonitorname?.value?.toCPointer<ByteVar>())

public actual fun deleteMonitorW(pname: Pcwstr, penvironment: Pcwstr, pmonitorname: Pcwstr): Bool =
    windowssys_windows_win32_graphics_printing_deleteMonitorW(pname?.value?.toCPointer<ByteVar>(), penvironment?.value?.toCPointer<ByteVar>(), pmonitorname?.value?.toCPointer<ByteVar>())

public actual fun deletePortA(pname: Pcstr, hwnd: Hwnd, pportname: Pcstr): Bool =
    windowssys_windows_win32_graphics_printing_deletePortA(pname?.value?.toCPointer<ByteVar>(), hwnd?.value?.toCPointer<ByteVar>(), pportname?.value?.toCPointer<ByteVar>())

public actual fun deletePortW(pname: Pcwstr, hwnd: Hwnd, pportname: Pcwstr): Bool =
    windowssys_windows_win32_graphics_printing_deletePortW(pname?.value?.toCPointer<ByteVar>(), hwnd?.value?.toCPointer<ByteVar>(), pportname?.value?.toCPointer<ByteVar>())

public actual fun deletePrintProcessorA(pname: Pcstr, penvironment: Pcstr, pprintprocessorname: Pcstr): Bool =
    windowssys_windows_win32_graphics_printing_deletePrintProcessorA(pname?.value?.toCPointer<ByteVar>(), penvironment?.value?.toCPointer<ByteVar>(), pprintprocessorname?.value?.toCPointer<ByteVar>())

public actual fun deletePrintProcessorW(pname: Pcwstr, penvironment: Pcwstr, pprintprocessorname: Pcwstr): Bool =
    windowssys_windows_win32_graphics_printing_deletePrintProcessorW(pname?.value?.toCPointer<ByteVar>(), penvironment?.value?.toCPointer<ByteVar>(), pprintprocessorname?.value?.toCPointer<ByteVar>())

public actual fun deletePrintProvidorA(pname: Pcstr, penvironment: Pcstr, pprintprovidorname: Pcstr): Bool =
    windowssys_windows_win32_graphics_printing_deletePrintProvidorA(pname?.value?.toCPointer<ByteVar>(), penvironment?.value?.toCPointer<ByteVar>(), pprintprovidorname?.value?.toCPointer<ByteVar>())

public actual fun deletePrintProvidorW(pname: Pcwstr, penvironment: Pcwstr, pprintprovidorname: Pcwstr): Bool =
    windowssys_windows_win32_graphics_printing_deletePrintProvidorW(pname?.value?.toCPointer<ByteVar>(), penvironment?.value?.toCPointer<ByteVar>(), pprintprovidorname?.value?.toCPointer<ByteVar>())

public actual fun deletePrinter(hprinter: PrinterHandle): Bool =
    0

public actual fun deletePrinterConnectionA(pname: Pcstr): Bool =
    windowssys_windows_win32_graphics_printing_deletePrinterConnectionA(pname?.value?.toCPointer<ByteVar>())

public actual fun deletePrinterConnectionW(pname: Pcwstr): Bool =
    windowssys_windows_win32_graphics_printing_deletePrinterConnectionW(pname?.value?.toCPointer<ByteVar>())

public actual fun deletePrinterDataA(hprinter: PrinterHandle, pvaluename: Pcstr): UInt =
    0u

public actual fun deletePrinterDataExA(hprinter: PrinterHandle, pkeyname: Pcstr, pvaluename: Pcstr): UInt =
    0u

public actual fun deletePrinterDataExW(hprinter: PrinterHandle, pkeyname: Pcwstr, pvaluename: Pcwstr): UInt =
    0u

public actual fun deletePrinterDataW(hprinter: PrinterHandle, pvaluename: Pcwstr): UInt =
    0u

public actual fun deletePrinterDriverA(pname: Pcstr, penvironment: Pcstr, pdrivername: Pcstr): Bool =
    windowssys_windows_win32_graphics_printing_deletePrinterDriverA(pname?.value?.toCPointer<ByteVar>(), penvironment?.value?.toCPointer<ByteVar>(), pdrivername?.value?.toCPointer<ByteVar>())

public actual fun deletePrinterDriverExA(pname: Pcstr, penvironment: Pcstr, pdrivername: Pcstr, dwdeleteflag: UInt, dwversionflag: UInt): Bool =
    windowssys_windows_win32_graphics_printing_deletePrinterDriverExA(pname?.value?.toCPointer<ByteVar>(), penvironment?.value?.toCPointer<ByteVar>(), pdrivername?.value?.toCPointer<ByteVar>(), dwdeleteflag, dwversionflag)

public actual fun deletePrinterDriverExW(pname: Pcwstr, penvironment: Pcwstr, pdrivername: Pcwstr, dwdeleteflag: UInt, dwversionflag: UInt): Bool =
    windowssys_windows_win32_graphics_printing_deletePrinterDriverExW(pname?.value?.toCPointer<ByteVar>(), penvironment?.value?.toCPointer<ByteVar>(), pdrivername?.value?.toCPointer<ByteVar>(), dwdeleteflag, dwversionflag)

public actual fun deletePrinterDriverPackageA(pszserver: Pcstr, pszinfpath: Pcstr, pszenvironment: Pcstr): Hresult =
    windowssys_windows_win32_graphics_printing_deletePrinterDriverPackageA(pszserver?.value?.toCPointer<ByteVar>(), pszinfpath?.value?.toCPointer<ByteVar>(), pszenvironment?.value?.toCPointer<ByteVar>())

public actual fun deletePrinterDriverPackageW(pszserver: Pcwstr, pszinfpath: Pcwstr, pszenvironment: Pcwstr): Hresult =
    windowssys_windows_win32_graphics_printing_deletePrinterDriverPackageW(pszserver?.value?.toCPointer<ByteVar>(), pszinfpath?.value?.toCPointer<ByteVar>(), pszenvironment?.value?.toCPointer<ByteVar>())

public actual fun deletePrinterDriverW(pname: Pcwstr, penvironment: Pcwstr, pdrivername: Pcwstr): Bool =
    windowssys_windows_win32_graphics_printing_deletePrinterDriverW(pname?.value?.toCPointer<ByteVar>(), penvironment?.value?.toCPointer<ByteVar>(), pdrivername?.value?.toCPointer<ByteVar>())

public actual fun deletePrinterIC(hprinteric: Handle): Bool =
    windowssys_windows_win32_graphics_printing_deletePrinterIC(hprinteric?.value?.toCPointer<ByteVar>())

public actual fun deletePrinterKeyA(hprinter: PrinterHandle, pkeyname: Pcstr): UInt =
    0u

public actual fun deletePrinterKeyW(hprinter: PrinterHandle, pkeyname: Pcwstr): UInt =
    0u

public actual fun devQueryPrint(hprinter: PrinterHandle, pdevmode: COpaquePointer?, presid: COpaquePointer?): Bool =
    0

public actual fun devQueryPrintEx(pdqpinfo: COpaquePointer?): Bool =
    windowssys_windows_win32_graphics_printing_devQueryPrintEx(pdqpinfo?.value?.toCPointer<ByteVar>())

public actual fun documentPropertiesA(hwnd: Hwnd, hprinter: PrinterHandle, pdevicename: Pcstr, pdevmodeoutput: COpaquePointer?, pdevmodeinput: COpaquePointer?, fmode: UInt): Int =
    0

public actual fun documentPropertiesW(hwnd: Hwnd, hprinter: PrinterHandle, pdevicename: Pcwstr, pdevmodeoutput: COpaquePointer?, pdevmodeinput: COpaquePointer?, fmode: UInt): Int =
    0

public actual fun endDocPrinter(hprinter: PrinterHandle): Bool =
    0

public actual fun endPagePrinter(hprinter: PrinterHandle): Bool =
    0

public actual fun enumFormsA(hprinter: PrinterHandle, level: UInt, pform: COpaquePointer?, cbbuf: UInt, pcbneeded: COpaquePointer?, pcreturned: COpaquePointer?): Bool =
    0

public actual fun enumFormsW(hprinter: PrinterHandle, level: UInt, pform: COpaquePointer?, cbbuf: UInt, pcbneeded: COpaquePointer?, pcreturned: COpaquePointer?): Bool =
    0

public actual fun enumJobNamedProperties(hprinter: PrinterHandle, jobid: UInt, pcproperties: COpaquePointer?, ppproperties: COpaquePointer?): UInt =
    0u

public actual fun enumJobsA(hprinter: PrinterHandle, firstjob: UInt, nojobs: UInt, level: UInt, pjob: COpaquePointer?, cbbuf: UInt, pcbneeded: COpaquePointer?, pcreturned: COpaquePointer?): Bool =
    0

public actual fun enumJobsW(hprinter: PrinterHandle, firstjob: UInt, nojobs: UInt, level: UInt, pjob: COpaquePointer?, cbbuf: UInt, pcbneeded: COpaquePointer?, pcreturned: COpaquePointer?): Bool =
    0

public actual fun enumMonitorsA(pname: Pcstr, level: UInt, pmonitor: COpaquePointer?, cbbuf: UInt, pcbneeded: COpaquePointer?, pcreturned: COpaquePointer?): Bool =
    windowssys_windows_win32_graphics_printing_enumMonitorsA(pname?.value?.toCPointer<ByteVar>(), level, pmonitor?.value?.toCPointer<ByteVar>(), cbbuf, pcbneeded?.value?.toCPointer<ByteVar>(), pcreturned?.value?.toCPointer<ByteVar>())

public actual fun enumMonitorsW(pname: Pcwstr, level: UInt, pmonitor: COpaquePointer?, cbbuf: UInt, pcbneeded: COpaquePointer?, pcreturned: COpaquePointer?): Bool =
    windowssys_windows_win32_graphics_printing_enumMonitorsW(pname?.value?.toCPointer<ByteVar>(), level, pmonitor?.value?.toCPointer<ByteVar>(), cbbuf, pcbneeded?.value?.toCPointer<ByteVar>(), pcreturned?.value?.toCPointer<ByteVar>())

public actual fun enumPortsA(pname: Pcstr, level: UInt, pport: COpaquePointer?, cbbuf: UInt, pcbneeded: COpaquePointer?, pcreturned: COpaquePointer?): Bool =
    windowssys_windows_win32_graphics_printing_enumPortsA(pname?.value?.toCPointer<ByteVar>(), level, pport?.value?.toCPointer<ByteVar>(), cbbuf, pcbneeded?.value?.toCPointer<ByteVar>(), pcreturned?.value?.toCPointer<ByteVar>())

public actual fun enumPortsW(pname: Pcwstr, level: UInt, pport: COpaquePointer?, cbbuf: UInt, pcbneeded: COpaquePointer?, pcreturned: COpaquePointer?): Bool =
    windowssys_windows_win32_graphics_printing_enumPortsW(pname?.value?.toCPointer<ByteVar>(), level, pport?.value?.toCPointer<ByteVar>(), cbbuf, pcbneeded?.value?.toCPointer<ByteVar>(), pcreturned?.value?.toCPointer<ByteVar>())

public actual fun enumPrintProcessorDatatypesA(pname: Pcstr, pprintprocessorname: Pcstr, level: UInt, pdatatypes: COpaquePointer?, cbbuf: UInt, pcbneeded: COpaquePointer?, pcreturned: COpaquePointer?): Bool =
    windowssys_windows_win32_graphics_printing_enumPrintProcessorDatatypesA(pname?.value?.toCPointer<ByteVar>(), pprintprocessorname?.value?.toCPointer<ByteVar>(), level, pdatatypes?.value?.toCPointer<ByteVar>(), cbbuf, pcbneeded?.value?.toCPointer<ByteVar>(), pcreturned?.value?.toCPointer<ByteVar>())

public actual fun enumPrintProcessorDatatypesW(pname: Pcwstr, pprintprocessorname: Pcwstr, level: UInt, pdatatypes: COpaquePointer?, cbbuf: UInt, pcbneeded: COpaquePointer?, pcreturned: COpaquePointer?): Bool =
    windowssys_windows_win32_graphics_printing_enumPrintProcessorDatatypesW(pname?.value?.toCPointer<ByteVar>(), pprintprocessorname?.value?.toCPointer<ByteVar>(), level, pdatatypes?.value?.toCPointer<ByteVar>(), cbbuf, pcbneeded?.value?.toCPointer<ByteVar>(), pcreturned?.value?.toCPointer<ByteVar>())

public actual fun enumPrintProcessorsA(pname: Pcstr, penvironment: Pcstr, level: UInt, pprintprocessorinfo: COpaquePointer?, cbbuf: UInt, pcbneeded: COpaquePointer?, pcreturned: COpaquePointer?): Bool =
    windowssys_windows_win32_graphics_printing_enumPrintProcessorsA(pname?.value?.toCPointer<ByteVar>(), penvironment?.value?.toCPointer<ByteVar>(), level, pprintprocessorinfo?.value?.toCPointer<ByteVar>(), cbbuf, pcbneeded?.value?.toCPointer<ByteVar>(), pcreturned?.value?.toCPointer<ByteVar>())

public actual fun enumPrintProcessorsW(pname: Pcwstr, penvironment: Pcwstr, level: UInt, pprintprocessorinfo: COpaquePointer?, cbbuf: UInt, pcbneeded: COpaquePointer?, pcreturned: COpaquePointer?): Bool =
    windowssys_windows_win32_graphics_printing_enumPrintProcessorsW(pname?.value?.toCPointer<ByteVar>(), penvironment?.value?.toCPointer<ByteVar>(), level, pprintprocessorinfo?.value?.toCPointer<ByteVar>(), cbbuf, pcbneeded?.value?.toCPointer<ByteVar>(), pcreturned?.value?.toCPointer<ByteVar>())

public actual fun enumPrinterDataA(hprinter: PrinterHandle, dwindex: UInt, pvaluename: Pstr, cbvaluename: UInt, pcbvaluename: COpaquePointer?, ptype: COpaquePointer?, pdata: COpaquePointer?, cbdata: UInt, pcbdata: COpaquePointer?): UInt =
    0u

public actual fun enumPrinterDataExA(hprinter: PrinterHandle, pkeyname: Pcstr, penumvalues: COpaquePointer?, cbenumvalues: UInt, pcbenumvalues: COpaquePointer?, pnenumvalues: COpaquePointer?): UInt =
    0u

public actual fun enumPrinterDataExW(hprinter: PrinterHandle, pkeyname: Pcwstr, penumvalues: COpaquePointer?, cbenumvalues: UInt, pcbenumvalues: COpaquePointer?, pnenumvalues: COpaquePointer?): UInt =
    0u

public actual fun enumPrinterDataW(hprinter: PrinterHandle, dwindex: UInt, pvaluename: Pwstr, cbvaluename: UInt, pcbvaluename: COpaquePointer?, ptype: COpaquePointer?, pdata: COpaquePointer?, cbdata: UInt, pcbdata: COpaquePointer?): UInt =
    0u

public actual fun enumPrinterDriversA(pname: Pcstr, penvironment: Pcstr, level: UInt, pdriverinfo: COpaquePointer?, cbbuf: UInt, pcbneeded: COpaquePointer?, pcreturned: COpaquePointer?): Bool =
    windowssys_windows_win32_graphics_printing_enumPrinterDriversA(pname?.value?.toCPointer<ByteVar>(), penvironment?.value?.toCPointer<ByteVar>(), level, pdriverinfo?.value?.toCPointer<ByteVar>(), cbbuf, pcbneeded?.value?.toCPointer<ByteVar>(), pcreturned?.value?.toCPointer<ByteVar>())

public actual fun enumPrinterDriversW(pname: Pcwstr, penvironment: Pcwstr, level: UInt, pdriverinfo: COpaquePointer?, cbbuf: UInt, pcbneeded: COpaquePointer?, pcreturned: COpaquePointer?): Bool =
    windowssys_windows_win32_graphics_printing_enumPrinterDriversW(pname?.value?.toCPointer<ByteVar>(), penvironment?.value?.toCPointer<ByteVar>(), level, pdriverinfo?.value?.toCPointer<ByteVar>(), cbbuf, pcbneeded?.value?.toCPointer<ByteVar>(), pcreturned?.value?.toCPointer<ByteVar>())

public actual fun enumPrinterKeyA(hprinter: PrinterHandle, pkeyname: Pcstr, psubkey: Pstr, cbsubkey: UInt, pcbsubkey: COpaquePointer?): UInt =
    0u

public actual fun enumPrinterKeyW(hprinter: PrinterHandle, pkeyname: Pcwstr, psubkey: Pwstr, cbsubkey: UInt, pcbsubkey: COpaquePointer?): UInt =
    0u

public actual fun enumPrintersA(flags: UInt, name: Pcstr, level: UInt, pprinterenum: COpaquePointer?, cbbuf: UInt, pcbneeded: COpaquePointer?, pcreturned: COpaquePointer?): Bool =
    windowssys_windows_win32_graphics_printing_enumPrintersA(flags, name?.value?.toCPointer<ByteVar>(), level, pprinterenum?.value?.toCPointer<ByteVar>(), cbbuf, pcbneeded?.value?.toCPointer<ByteVar>(), pcreturned?.value?.toCPointer<ByteVar>())

public actual fun enumPrintersW(flags: UInt, name: Pcwstr, level: UInt, pprinterenum: COpaquePointer?, cbbuf: UInt, pcbneeded: COpaquePointer?, pcreturned: COpaquePointer?): Bool =
    windowssys_windows_win32_graphics_printing_enumPrintersW(flags, name?.value?.toCPointer<ByteVar>(), level, pprinterenum?.value?.toCPointer<ByteVar>(), cbbuf, pcbneeded?.value?.toCPointer<ByteVar>(), pcreturned?.value?.toCPointer<ByteVar>())

public actual fun extDeviceMode(hwnd: Hwnd, hinst: Handle, pdevmodeoutput: COpaquePointer?, pdevicename: Pcstr, pport: Pcstr, pdevmodeinput: COpaquePointer?, pprofile: Pcstr, fmode: UInt): Int =
    windowssys_windows_win32_graphics_printing_extDeviceMode(hwnd?.value?.toCPointer<ByteVar>(), hinst?.value?.toCPointer<ByteVar>(), pdevmodeoutput?.value?.toCPointer<ByteVar>(), pdevicename?.value?.toCPointer<ByteVar>(), pport?.value?.toCPointer<ByteVar>(), pdevmodeinput?.value?.toCPointer<ByteVar>(), pprofile?.value?.toCPointer<ByteVar>(), fmode)

public actual fun findClosePrinterChangeNotification(hchange: Handle): Bool =
    windowssys_windows_win32_graphics_printing_findClosePrinterChangeNotification(hchange?.value?.toCPointer<ByteVar>())

public actual fun findFirstPrinterChangeNotification(hprinter: PrinterHandle, fdwfilter: UInt, fdwoptions: UInt, pprinternotifyoptions: COpaquePointer?): Handle =
    null

public actual fun findNextPrinterChangeNotification(hchange: Handle, pdwchange: COpaquePointer?, pvreserved: COpaquePointer?, ppprinternotifyinfo: COpaquePointer?): Bool =
    windowssys_windows_win32_graphics_printing_findNextPrinterChangeNotification(hchange?.value?.toCPointer<ByteVar>(), pdwchange?.value?.toCPointer<ByteVar>(), pvreserved?.value?.toCPointer<ByteVar>(), ppprinternotifyinfo?.value?.toCPointer<ByteVar>())

public actual fun flushPrinter(hprinter: PrinterHandle, pbuf: COpaquePointer?, cbbuf: UInt, pcwritten: COpaquePointer?, csleep: UInt): Bool =
    0

public actual fun freePrintNamedPropertyArray(cproperties: UInt, ppproperties: COpaquePointer?) {
    windowssys_windows_win32_graphics_printing_freePrintNamedPropertyArray(cproperties, ppproperties?.value?.toCPointer<ByteVar>())
}

public actual fun freePrintPropertyValue(pvalue: COpaquePointer?) {
    windowssys_windows_win32_graphics_printing_freePrintPropertyValue(pvalue?.value?.toCPointer<ByteVar>())
}

public actual fun freePrinterNotifyInfo(pprinternotifyinfo: COpaquePointer?): Bool =
    windowssys_windows_win32_graphics_printing_freePrinterNotifyInfo(pprinternotifyinfo?.value?.toCPointer<ByteVar>())

public actual fun gdiDeleteSpoolFileHandle(spoolfilehandle: Handle): Bool =
    windowssys_windows_win32_graphics_printing_gdiDeleteSpoolFileHandle(spoolfilehandle?.value?.toCPointer<ByteVar>())

public actual fun gdiEndDocEMF(spoolfilehandle: Handle): Bool =
    windowssys_windows_win32_graphics_printing_gdiEndDocEMF(spoolfilehandle?.value?.toCPointer<ByteVar>())

public actual fun gdiEndPageEMF(spoolfilehandle: Handle, dwoptimization: UInt): Bool =
    windowssys_windows_win32_graphics_printing_gdiEndPageEMF(spoolfilehandle?.value?.toCPointer<ByteVar>(), dwoptimization)

public actual fun gdiGetDC(spoolfilehandle: Handle): Hdc =
    windowssys_windows_win32_graphics_printing_gdiGetDC(spoolfilehandle?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun gdiGetDevmodeForPage(spoolfilehandle: Handle, dwpagenumber: UInt, pcurrdm: COpaquePointer?, plastdm: COpaquePointer?): Bool =
    windowssys_windows_win32_graphics_printing_gdiGetDevmodeForPage(spoolfilehandle?.value?.toCPointer<ByteVar>(), dwpagenumber, pcurrdm?.value?.toCPointer<ByteVar>(), plastdm?.value?.toCPointer<ByteVar>())

public actual fun gdiGetPageCount(spoolfilehandle: Handle): UInt =
    windowssys_windows_win32_graphics_printing_gdiGetPageCount(spoolfilehandle?.value?.toCPointer<ByteVar>())

public actual fun gdiGetPageHandle(spoolfilehandle: Handle, page: UInt, pdwpagetype: COpaquePointer?): Handle =
    windowssys_windows_win32_graphics_printing_gdiGetPageHandle(spoolfilehandle?.value?.toCPointer<ByteVar>(), page, pdwpagetype?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun gdiGetSpoolFileHandle(pwszprintername: Pcwstr, pdevmode: COpaquePointer?, pwszdocname: Pcwstr): Handle =
    windowssys_windows_win32_graphics_printing_gdiGetSpoolFileHandle(pwszprintername?.value?.toCPointer<ByteVar>(), pdevmode?.value?.toCPointer<ByteVar>(), pwszdocname?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun gdiPlayPageEMF(spoolfilehandle: Handle, hemf: Handle, prectdocument: COpaquePointer?, prectborder: COpaquePointer?, prectclip: COpaquePointer?): Bool =
    windowssys_windows_win32_graphics_printing_gdiPlayPageEMF(spoolfilehandle?.value?.toCPointer<ByteVar>(), hemf?.value?.toCPointer<ByteVar>(), prectdocument?.value?.toCPointer<ByteVar>(), prectborder?.value?.toCPointer<ByteVar>(), prectclip?.value?.toCPointer<ByteVar>())

public actual fun gdiResetDCEMF(spoolfilehandle: Handle, pcurrdm: COpaquePointer?): Bool =
    windowssys_windows_win32_graphics_printing_gdiResetDCEMF(spoolfilehandle?.value?.toCPointer<ByteVar>(), pcurrdm?.value?.toCPointer<ByteVar>())

public actual fun gdiStartDocEMF(spoolfilehandle: Handle, pdocinfo: COpaquePointer?): Bool =
    windowssys_windows_win32_graphics_printing_gdiStartDocEMF(spoolfilehandle?.value?.toCPointer<ByteVar>(), pdocinfo?.value?.toCPointer<ByteVar>())

public actual fun gdiStartPageEMF(spoolfilehandle: Handle): Bool =
    windowssys_windows_win32_graphics_printing_gdiStartPageEMF(spoolfilehandle?.value?.toCPointer<ByteVar>())

public actual fun generateCopyFilePaths(pszprintername: Pcwstr, pszdirectory: Pcwstr, psplclientinfo: COpaquePointer?, dwlevel: UInt, pszsourcedir: Pwstr, pcchsourcedirsize: COpaquePointer?, psztargetdir: Pwstr, pcchtargetdirsize: COpaquePointer?, dwflags: UInt): UInt =
    windowssys_windows_win32_graphics_printing_generateCopyFilePaths(pszprintername?.value?.toCPointer<ByteVar>(), pszdirectory?.value?.toCPointer<ByteVar>(), psplclientinfo?.value?.toCPointer<ByteVar>(), dwlevel, pszsourcedir?.value?.toCPointer<ByteVar>(), pcchsourcedirsize?.value?.toCPointer<ByteVar>(), psztargetdir?.value?.toCPointer<ByteVar>(), pcchtargetdirsize?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun getCPSUIUserData(hdlg: Hwnd): ULong =
    windowssys_windows_win32_graphics_printing_getCPSUIUserData(hdlg?.value?.toCPointer<ByteVar>())

public actual fun getCorePrinterDriversA(pszserver: Pcstr, pszenvironment: Pcstr, pszzcoredriverdependencies: Pcstr, ccoreprinterdrivers: UInt, pcoreprinterdrivers: COpaquePointer?): Hresult =
    windowssys_windows_win32_graphics_printing_getCorePrinterDriversA(pszserver?.value?.toCPointer<ByteVar>(), pszenvironment?.value?.toCPointer<ByteVar>(), pszzcoredriverdependencies?.value?.toCPointer<ByteVar>(), ccoreprinterdrivers, pcoreprinterdrivers?.value?.toCPointer<ByteVar>())

public actual fun getCorePrinterDriversW(pszserver: Pcwstr, pszenvironment: Pcwstr, pszzcoredriverdependencies: Pcwstr, ccoreprinterdrivers: UInt, pcoreprinterdrivers: COpaquePointer?): Hresult =
    windowssys_windows_win32_graphics_printing_getCorePrinterDriversW(pszserver?.value?.toCPointer<ByteVar>(), pszenvironment?.value?.toCPointer<ByteVar>(), pszzcoredriverdependencies?.value?.toCPointer<ByteVar>(), ccoreprinterdrivers, pcoreprinterdrivers?.value?.toCPointer<ByteVar>())

public actual fun getDefaultPrinterA(pszbuffer: Pstr, pcchbuffer: COpaquePointer?): Bool =
    windowssys_windows_win32_graphics_printing_getDefaultPrinterA(pszbuffer?.value?.toCPointer<ByteVar>(), pcchbuffer?.value?.toCPointer<ByteVar>())

public actual fun getDefaultPrinterW(pszbuffer: Pwstr, pcchbuffer: COpaquePointer?): Bool =
    windowssys_windows_win32_graphics_printing_getDefaultPrinterW(pszbuffer?.value?.toCPointer<ByteVar>(), pcchbuffer?.value?.toCPointer<ByteVar>())

public actual fun getFormA(hprinter: PrinterHandle, pformname: Pcstr, level: UInt, pform: COpaquePointer?, cbbuf: UInt, pcbneeded: COpaquePointer?): Bool =
    0

public actual fun getFormW(hprinter: PrinterHandle, pformname: Pcwstr, level: UInt, pform: COpaquePointer?, cbbuf: UInt, pcbneeded: COpaquePointer?): Bool =
    0

public actual fun getJobA(hprinter: PrinterHandle, jobid: UInt, level: UInt, pjob: COpaquePointer?, cbbuf: UInt, pcbneeded: COpaquePointer?): Bool =
    0

public actual fun getJobAttributes(pprintername: Pcwstr, pdevmode: COpaquePointer?, pattributeinfo: COpaquePointer?): Bool =
    windowssys_windows_win32_graphics_printing_getJobAttributes(pprintername?.value?.toCPointer<ByteVar>(), pdevmode?.value?.toCPointer<ByteVar>(), pattributeinfo?.value?.toCPointer<ByteVar>())

public actual fun getJobAttributesEx(pprintername: Pcwstr, pdevmode: COpaquePointer?, dwlevel: UInt, pattributeinfo: COpaquePointer?, nsize: UInt, dwflags: UInt): Bool =
    windowssys_windows_win32_graphics_printing_getJobAttributesEx(pprintername?.value?.toCPointer<ByteVar>(), pdevmode?.value?.toCPointer<ByteVar>(), dwlevel, pattributeinfo?.value?.toCPointer<ByteVar>(), nsize, dwflags)

public actual fun getJobNamedPropertyValue(hprinter: PrinterHandle, jobid: UInt, pszname: Pcwstr, pvalue: COpaquePointer?): UInt =
    0u

public actual fun getJobW(hprinter: PrinterHandle, jobid: UInt, level: UInt, pjob: COpaquePointer?, cbbuf: UInt, pcbneeded: COpaquePointer?): Bool =
    0

public actual fun getPrintExecutionData(pdata: COpaquePointer?): Bool =
    windowssys_windows_win32_graphics_printing_getPrintExecutionData(pdata?.value?.toCPointer<ByteVar>())

public actual fun getPrintOutputInfo(hwnd: Hwnd, pszprinter: Pcwstr, phfile: COpaquePointer?, ppszoutputfile: COpaquePointer?): Hresult =
    windowssys_windows_win32_graphics_printing_getPrintOutputInfo(hwnd?.value?.toCPointer<ByteVar>(), pszprinter?.value?.toCPointer<ByteVar>(), phfile?.value?.toCPointer<ByteVar>(), ppszoutputfile?.value?.toCPointer<ByteVar>())

public actual fun getPrintProcessorDirectoryA(pname: Pcstr, penvironment: Pcstr, level: UInt, pprintprocessorinfo: COpaquePointer?, cbbuf: UInt, pcbneeded: COpaquePointer?): Bool =
    windowssys_windows_win32_graphics_printing_getPrintProcessorDirectoryA(pname?.value?.toCPointer<ByteVar>(), penvironment?.value?.toCPointer<ByteVar>(), level, pprintprocessorinfo?.value?.toCPointer<ByteVar>(), cbbuf, pcbneeded?.value?.toCPointer<ByteVar>())

public actual fun getPrintProcessorDirectoryW(pname: Pcwstr, penvironment: Pcwstr, level: UInt, pprintprocessorinfo: COpaquePointer?, cbbuf: UInt, pcbneeded: COpaquePointer?): Bool =
    windowssys_windows_win32_graphics_printing_getPrintProcessorDirectoryW(pname?.value?.toCPointer<ByteVar>(), penvironment?.value?.toCPointer<ByteVar>(), level, pprintprocessorinfo?.value?.toCPointer<ByteVar>(), cbbuf, pcbneeded?.value?.toCPointer<ByteVar>())

public actual fun getPrinterA(hprinter: PrinterHandle, level: UInt, pprinter: COpaquePointer?, cbbuf: UInt, pcbneeded: COpaquePointer?): Bool =
    0

public actual fun getPrinterDataA(hprinter: PrinterHandle, pvaluename: Pcstr, ptype: COpaquePointer?, pdata: COpaquePointer?, nsize: UInt, pcbneeded: COpaquePointer?): UInt =
    0u

public actual fun getPrinterDataExA(hprinter: PrinterHandle, pkeyname: Pcstr, pvaluename: Pcstr, ptype: COpaquePointer?, pdata: COpaquePointer?, nsize: UInt, pcbneeded: COpaquePointer?): UInt =
    0u

public actual fun getPrinterDataExW(hprinter: PrinterHandle, pkeyname: Pcwstr, pvaluename: Pcwstr, ptype: COpaquePointer?, pdata: COpaquePointer?, nsize: UInt, pcbneeded: COpaquePointer?): UInt =
    0u

public actual fun getPrinterDataW(hprinter: PrinterHandle, pvaluename: Pcwstr, ptype: COpaquePointer?, pdata: COpaquePointer?, nsize: UInt, pcbneeded: COpaquePointer?): UInt =
    0u

public actual fun getPrinterDriver2A(hwnd: Hwnd, hprinter: PrinterHandle, penvironment: Pcstr, level: UInt, pdriverinfo: COpaquePointer?, cbbuf: UInt, pcbneeded: COpaquePointer?): Bool =
    0

public actual fun getPrinterDriver2W(hwnd: Hwnd, hprinter: PrinterHandle, penvironment: Pcwstr, level: UInt, pdriverinfo: COpaquePointer?, cbbuf: UInt, pcbneeded: COpaquePointer?): Bool =
    0

public actual fun getPrinterDriverA(hprinter: PrinterHandle, penvironment: Pcstr, level: UInt, pdriverinfo: COpaquePointer?, cbbuf: UInt, pcbneeded: COpaquePointer?): Bool =
    0

public actual fun getPrinterDriverDirectoryA(pname: Pcstr, penvironment: Pcstr, level: UInt, pdriverdirectory: COpaquePointer?, cbbuf: UInt, pcbneeded: COpaquePointer?): Bool =
    windowssys_windows_win32_graphics_printing_getPrinterDriverDirectoryA(pname?.value?.toCPointer<ByteVar>(), penvironment?.value?.toCPointer<ByteVar>(), level, pdriverdirectory?.value?.toCPointer<ByteVar>(), cbbuf, pcbneeded?.value?.toCPointer<ByteVar>())

public actual fun getPrinterDriverDirectoryW(pname: Pcwstr, penvironment: Pcwstr, level: UInt, pdriverdirectory: COpaquePointer?, cbbuf: UInt, pcbneeded: COpaquePointer?): Bool =
    windowssys_windows_win32_graphics_printing_getPrinterDriverDirectoryW(pname?.value?.toCPointer<ByteVar>(), penvironment?.value?.toCPointer<ByteVar>(), level, pdriverdirectory?.value?.toCPointer<ByteVar>(), cbbuf, pcbneeded?.value?.toCPointer<ByteVar>())

public actual fun getPrinterDriverPackagePathA(pszserver: Pcstr, pszenvironment: Pcstr, pszlanguage: Pcstr, pszpackageid: Pcstr, pszdriverpackagecab: Pstr, cchdriverpackagecab: UInt, pcchrequiredsize: COpaquePointer?): Hresult =
    windowssys_windows_win32_graphics_printing_getPrinterDriverPackagePathA(pszserver?.value?.toCPointer<ByteVar>(), pszenvironment?.value?.toCPointer<ByteVar>(), pszlanguage?.value?.toCPointer<ByteVar>(), pszpackageid?.value?.toCPointer<ByteVar>(), pszdriverpackagecab?.value?.toCPointer<ByteVar>(), cchdriverpackagecab, pcchrequiredsize?.value?.toCPointer<ByteVar>())

public actual fun getPrinterDriverPackagePathW(pszserver: Pcwstr, pszenvironment: Pcwstr, pszlanguage: Pcwstr, pszpackageid: Pcwstr, pszdriverpackagecab: Pwstr, cchdriverpackagecab: UInt, pcchrequiredsize: COpaquePointer?): Hresult =
    windowssys_windows_win32_graphics_printing_getPrinterDriverPackagePathW(pszserver?.value?.toCPointer<ByteVar>(), pszenvironment?.value?.toCPointer<ByteVar>(), pszlanguage?.value?.toCPointer<ByteVar>(), pszpackageid?.value?.toCPointer<ByteVar>(), pszdriverpackagecab?.value?.toCPointer<ByteVar>(), cchdriverpackagecab, pcchrequiredsize?.value?.toCPointer<ByteVar>())

public actual fun getPrinterDriverW(hprinter: PrinterHandle, penvironment: Pcwstr, level: UInt, pdriverinfo: COpaquePointer?, cbbuf: UInt, pcbneeded: COpaquePointer?): Bool =
    0

public actual fun getPrinterW(hprinter: PrinterHandle, level: UInt, pprinter: COpaquePointer?, cbbuf: UInt, pcbneeded: COpaquePointer?): Bool =
    0

public actual fun getSpoolFileHandle(hprinter: PrinterHandle): Handle =
    null

public actual fun impersonatePrinterClient(htoken: Handle): Bool =
    windowssys_windows_win32_graphics_printing_impersonatePrinterClient(htoken?.value?.toCPointer<ByteVar>())

public actual fun installPrinterDriverFromPackageA(pszserver: Pcstr, pszinfpath: Pcstr, pszdrivername: Pcstr, pszenvironment: Pcstr, dwflags: UInt): Hresult =
    windowssys_windows_win32_graphics_printing_installPrinterDriverFromPackageA(pszserver?.value?.toCPointer<ByteVar>(), pszinfpath?.value?.toCPointer<ByteVar>(), pszdrivername?.value?.toCPointer<ByteVar>(), pszenvironment?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun installPrinterDriverFromPackageW(pszserver: Pcwstr, pszinfpath: Pcwstr, pszdrivername: Pcwstr, pszenvironment: Pcwstr, dwflags: UInt): Hresult =
    windowssys_windows_win32_graphics_printing_installPrinterDriverFromPackageW(pszserver?.value?.toCPointer<ByteVar>(), pszinfpath?.value?.toCPointer<ByteVar>(), pszdrivername?.value?.toCPointer<ByteVar>(), pszenvironment?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun isValidDevmodeA(pdevmode: COpaquePointer?, devmodesize: ULong): Bool =
    windowssys_windows_win32_graphics_printing_isValidDevmodeA(pdevmode?.value?.toCPointer<ByteVar>(), devmodesize)

public actual fun isValidDevmodeW(pdevmode: COpaquePointer?, devmodesize: ULong): Bool =
    windowssys_windows_win32_graphics_printing_isValidDevmodeW(pdevmode?.value?.toCPointer<ByteVar>(), devmodesize)

public actual fun openPrinter2A(pprintername: Pcstr, phprinter: COpaquePointer?, pdefault: COpaquePointer?, poptions: COpaquePointer?): Bool =
    windowssys_windows_win32_graphics_printing_openPrinter2A(pprintername?.value?.toCPointer<ByteVar>(), phprinter?.value?.toCPointer<ByteVar>(), pdefault?.value?.toCPointer<ByteVar>(), poptions?.value?.toCPointer<ByteVar>())

public actual fun openPrinter2W(pprintername: Pcwstr, phprinter: COpaquePointer?, pdefault: COpaquePointer?, poptions: COpaquePointer?): Bool =
    windowssys_windows_win32_graphics_printing_openPrinter2W(pprintername?.value?.toCPointer<ByteVar>(), phprinter?.value?.toCPointer<ByteVar>(), pdefault?.value?.toCPointer<ByteVar>(), poptions?.value?.toCPointer<ByteVar>())

public actual fun openPrinterA(pprintername: Pcstr, phprinter: COpaquePointer?, pdefault: COpaquePointer?): Bool =
    windowssys_windows_win32_graphics_printing_openPrinterA(pprintername?.value?.toCPointer<ByteVar>(), phprinter?.value?.toCPointer<ByteVar>(), pdefault?.value?.toCPointer<ByteVar>())

public actual fun openPrinterW(pprintername: Pcwstr, phprinter: COpaquePointer?, pdefault: COpaquePointer?): Bool =
    windowssys_windows_win32_graphics_printing_openPrinterW(pprintername?.value?.toCPointer<ByteVar>(), phprinter?.value?.toCPointer<ByteVar>(), pdefault?.value?.toCPointer<ByteVar>())

public actual fun partialReplyPrinterChangeNotification(hprinter: PrinterHandle, pdatasrc: COpaquePointer?): Bool =
    0

public actual fun playGdiScriptOnPrinterIC(hprinteric: Handle, pin: COpaquePointer?, cin: UInt, pout: COpaquePointer?, cout: UInt, ul: UInt): Bool =
    windowssys_windows_win32_graphics_printing_playGdiScriptOnPrinterIC(hprinteric?.value?.toCPointer<ByteVar>(), pin?.value?.toCPointer<ByteVar>(), cin, pout?.value?.toCPointer<ByteVar>(), cout, ul)

public actual fun printerMessageBoxA(hprinter: PrinterHandle, error: UInt, hwnd: Hwnd, ptext: Pcstr, pcaption: Pcstr, dwtype: UInt): UInt =
    0u

public actual fun printerMessageBoxW(hprinter: PrinterHandle, error: UInt, hwnd: Hwnd, ptext: Pcwstr, pcaption: Pcwstr, dwtype: UInt): UInt =
    0u

public actual fun printerProperties(hwnd: Hwnd, hprinter: PrinterHandle): Bool =
    0

public actual fun providorFindClosePrinterChangeNotification(hprinter: PrinterHandle): Bool =
    0

public actual fun providorFindFirstPrinterChangeNotification(hprinter: PrinterHandle, fdwflags: UInt, fdwoptions: UInt, hnotify: Handle, pprinternotifyoptions: COpaquePointer?, pvreserved1: COpaquePointer?): Bool =
    0

public actual fun readPrinter(hprinter: PrinterHandle, pbuf: COpaquePointer?, cbbuf: UInt, pnobytesread: COpaquePointer?): Bool =
    0

public actual fun registerForPrintAsyncNotifications(pszname: Pcwstr, pnotificationtype: COpaquePointer?, euserfilter: PrintAsyncNotifyUserFilter, econversationstyle: PrintAsyncNotifyConversationStyle, pcallback: COpaquePointer?, phnotify: COpaquePointer?): Hresult =
    windowssys_windows_win32_graphics_printing_registerForPrintAsyncNotifications(pszname?.value?.toCPointer<ByteVar>(), pnotificationtype?.value?.toCPointer<ByteVar>(), euserfilter, econversationstyle, pcallback?.value?.toCPointer<ByteVar>(), phnotify?.value?.toCPointer<ByteVar>())

public actual fun removePrintDeviceObject(hdeviceobject: Handle): Hresult =
    windowssys_windows_win32_graphics_printing_removePrintDeviceObject(hdeviceobject?.value?.toCPointer<ByteVar>())

public actual fun replyPrinterChangeNotification(hprinter: PrinterHandle, fdwchangeflags: UInt, pdwresult: COpaquePointer?, pprinternotifyinfo: COpaquePointer?): Bool =
    0

public actual fun replyPrinterChangeNotificationEx(hnotify: Handle, dwcolor: UInt, fdwflags: UInt, pdwresult: COpaquePointer?, pprinternotifyinfo: COpaquePointer?): Bool =
    windowssys_windows_win32_graphics_printing_replyPrinterChangeNotificationEx(hnotify?.value?.toCPointer<ByteVar>(), dwcolor, fdwflags, pdwresult?.value?.toCPointer<ByteVar>(), pprinternotifyinfo?.value?.toCPointer<ByteVar>())

public actual fun reportJobProcessingProgress(printerhandle: Handle, jobid: UInt, joboperation: EPrintXPSJobOperation, jobprogress: EPrintXPSJobProgress): Hresult =
    windowssys_windows_win32_graphics_printing_reportJobProcessingProgress(printerhandle?.value?.toCPointer<ByteVar>(), jobid, joboperation, jobprogress)

public actual fun resetPrinterA(hprinter: PrinterHandle, pdefault: COpaquePointer?): Bool =
    0

public actual fun resetPrinterW(hprinter: PrinterHandle, pdefault: COpaquePointer?): Bool =
    0

public actual fun revertToPrinterSelf(): Handle =
    windowssys_windows_win32_graphics_printing_revertToPrinterSelf()?.let { COpaquePointer(it.toLong()) }

public actual fun routerAllocBidiMem(numbytes: ULong): COpaquePointer? =
    windowssys_windows_win32_graphics_printing_routerAllocBidiMem(numbytes)?.let { COpaquePointer(it.toLong()) }

public actual fun routerAllocBidiResponseContainer(count: UInt): COpaquePointer? =
    windowssys_windows_win32_graphics_printing_routerAllocBidiResponseContainer(count)?.let { COpaquePointer(it.toLong()) }

public actual fun routerAllocPrinterNotifyInfo(cprinternotifyinfodata: UInt): COpaquePointer? =
    windowssys_windows_win32_graphics_printing_routerAllocPrinterNotifyInfo(cprinternotifyinfodata)?.let { COpaquePointer(it.toLong()) }

public actual fun routerFreeBidiMem(pmempointer: COpaquePointer?) {
    windowssys_windows_win32_graphics_printing_routerFreeBidiMem(pmempointer?.value?.toCPointer<ByteVar>())
}

public actual fun routerFreeBidiResponseContainer(pdata: COpaquePointer?): UInt =
    windowssys_windows_win32_graphics_printing_routerFreeBidiResponseContainer(pdata?.value?.toCPointer<ByteVar>())

public actual fun routerFreePrinterNotifyInfo(pinfo: COpaquePointer?): Bool =
    windowssys_windows_win32_graphics_printing_routerFreePrinterNotifyInfo(pinfo?.value?.toCPointer<ByteVar>())

public actual fun scheduleJob(hprinter: PrinterHandle, jobid: UInt): Bool =
    0

public actual fun setCPSUIUserData(hdlg: Hwnd, cpsuiuserdata: ULong): Bool =
    windowssys_windows_win32_graphics_printing_setCPSUIUserData(hdlg?.value?.toCPointer<ByteVar>(), cpsuiuserdata)

public actual fun setDefaultPrinterA(pszprinter: Pcstr): Bool =
    windowssys_windows_win32_graphics_printing_setDefaultPrinterA(pszprinter?.value?.toCPointer<ByteVar>())

public actual fun setDefaultPrinterW(pszprinter: Pcwstr): Bool =
    windowssys_windows_win32_graphics_printing_setDefaultPrinterW(pszprinter?.value?.toCPointer<ByteVar>())

public actual fun setFormA(hprinter: PrinterHandle, pformname: Pcstr, level: UInt, pform: COpaquePointer?): Bool =
    0

public actual fun setFormW(hprinter: PrinterHandle, pformname: Pcwstr, level: UInt, pform: COpaquePointer?): Bool =
    0

public actual fun setJobA(hprinter: PrinterHandle, jobid: UInt, level: UInt, pjob: COpaquePointer?, command: UInt): Bool =
    0

public actual fun setJobNamedProperty(hprinter: PrinterHandle, jobid: UInt, pproperty: COpaquePointer?): UInt =
    0u

public actual fun setJobW(hprinter: PrinterHandle, jobid: UInt, level: UInt, pjob: COpaquePointer?, command: UInt): Bool =
    0

public actual fun setPortA(pname: Pcstr, pportname: Pcstr, dwlevel: UInt, pportinfo: COpaquePointer?): Bool =
    windowssys_windows_win32_graphics_printing_setPortA(pname?.value?.toCPointer<ByteVar>(), pportname?.value?.toCPointer<ByteVar>(), dwlevel, pportinfo?.value?.toCPointer<ByteVar>())

public actual fun setPortW(pname: Pcwstr, pportname: Pcwstr, dwlevel: UInt, pportinfo: COpaquePointer?): Bool =
    windowssys_windows_win32_graphics_printing_setPortW(pname?.value?.toCPointer<ByteVar>(), pportname?.value?.toCPointer<ByteVar>(), dwlevel, pportinfo?.value?.toCPointer<ByteVar>())

public actual fun setPrinterA(hprinter: PrinterHandle, level: UInt, pprinter: COpaquePointer?, command: UInt): Bool =
    0

public actual fun setPrinterDataA(hprinter: PrinterHandle, pvaluename: Pcstr, type: UInt, pdata: COpaquePointer?, cbdata: UInt): UInt =
    0u

public actual fun setPrinterDataExA(hprinter: PrinterHandle, pkeyname: Pcstr, pvaluename: Pcstr, type: UInt, pdata: COpaquePointer?, cbdata: UInt): UInt =
    0u

public actual fun setPrinterDataExW(hprinter: PrinterHandle, pkeyname: Pcwstr, pvaluename: Pcwstr, type: UInt, pdata: COpaquePointer?, cbdata: UInt): UInt =
    0u

public actual fun setPrinterDataW(hprinter: PrinterHandle, pvaluename: Pcwstr, type: UInt, pdata: COpaquePointer?, cbdata: UInt): UInt =
    0u

public actual fun setPrinterW(hprinter: PrinterHandle, level: UInt, pprinter: COpaquePointer?, command: UInt): Bool =
    0

public actual fun splIsSessionZero(hprinter: PrinterHandle, jobid: UInt, pissessionzero: COpaquePointer?): UInt =
    0u

public actual fun splPromptUIInUsersSession(hprinter: PrinterHandle, jobid: UInt, puiparams: COpaquePointer?, presponse: COpaquePointer?): Bool =
    0

public actual fun spoolerCopyFileEvent(pszprintername: Pcwstr, pszkey: Pcwstr, dwcopyfileevent: UInt): Bool =
    windowssys_windows_win32_graphics_printing_spoolerCopyFileEvent(pszprintername?.value?.toCPointer<ByteVar>(), pszkey?.value?.toCPointer<ByteVar>(), dwcopyfileevent)

public actual fun spoolerFindClosePrinterChangeNotification(hprinter: PrinterHandle): Bool =
    0

public actual fun spoolerFindFirstPrinterChangeNotification(hprinter: PrinterHandle, fdwfilterflags: UInt, fdwoptions: UInt, pprinternotifyoptions: COpaquePointer?, pvreserved: COpaquePointer?, pnotificationconfig: COpaquePointer?, phnotify: COpaquePointer?, phevent: COpaquePointer?): Bool =
    0

public actual fun spoolerFindNextPrinterChangeNotification(hprinter: PrinterHandle, pfdwchange: COpaquePointer?, pprinternotifyoptions: COpaquePointer?, ppprinternotifyinfo: COpaquePointer?): Bool =
    0

public actual fun spoolerFreePrinterNotifyInfo(pinfo: COpaquePointer?) {
    windowssys_windows_win32_graphics_printing_spoolerFreePrinterNotifyInfo(pinfo?.value?.toCPointer<ByteVar>())
}

public actual fun spoolerRefreshPrinterChangeNotification(hprinter: PrinterHandle, dwcolor: UInt, poptions: COpaquePointer?, ppinfo: COpaquePointer?): Bool =
    0

public actual fun startDocPrinterA(hprinter: PrinterHandle, level: UInt, pdocinfo: COpaquePointer?): UInt =
    0u

public actual fun startDocPrinterW(hprinter: PrinterHandle, level: UInt, pdocinfo: COpaquePointer?): UInt =
    0u

public actual fun startPagePrinter(hprinter: PrinterHandle): Bool =
    0

public actual fun unRegisterForPrintAsyncNotifications(param0: Handle): Hresult =
    windowssys_windows_win32_graphics_printing_unRegisterForPrintAsyncNotifications(param0?.value?.toCPointer<ByteVar>())

public actual fun updatePrintDeviceObject(hprinter: PrinterHandle, hdeviceobject: Handle): Hresult =
    0

public actual fun uploadPrinterDriverPackageA(pszserver: Pcstr, pszinfpath: Pcstr, pszenvironment: Pcstr, dwflags: UInt, hwnd: Hwnd, pszdestinfpath: Pstr, pcchdestinfpath: COpaquePointer?): Hresult =
    windowssys_windows_win32_graphics_printing_uploadPrinterDriverPackageA(pszserver?.value?.toCPointer<ByteVar>(), pszinfpath?.value?.toCPointer<ByteVar>(), pszenvironment?.value?.toCPointer<ByteVar>(), dwflags, hwnd?.value?.toCPointer<ByteVar>(), pszdestinfpath?.value?.toCPointer<ByteVar>(), pcchdestinfpath?.value?.toCPointer<ByteVar>())

public actual fun uploadPrinterDriverPackageW(pszserver: Pcwstr, pszinfpath: Pcwstr, pszenvironment: Pcwstr, dwflags: UInt, hwnd: Hwnd, pszdestinfpath: Pwstr, pcchdestinfpath: COpaquePointer?): Hresult =
    windowssys_windows_win32_graphics_printing_uploadPrinterDriverPackageW(pszserver?.value?.toCPointer<ByteVar>(), pszinfpath?.value?.toCPointer<ByteVar>(), pszenvironment?.value?.toCPointer<ByteVar>(), dwflags, hwnd?.value?.toCPointer<ByteVar>(), pszdestinfpath?.value?.toCPointer<ByteVar>(), pcchdestinfpath?.value?.toCPointer<ByteVar>())

public actual fun waitForPrinterChange(hprinter: PrinterHandle, flags: UInt): UInt =
    0u

public actual fun writePrinter(hprinter: PrinterHandle, pbuf: COpaquePointer?, cbbuf: UInt, pcwritten: COpaquePointer?): Bool =
    0

public actual fun xcvDataW(hxcv: Handle, pszdataname: Pcwstr, pinputdata: COpaquePointer?, cbinputdata: UInt, poutputdata: COpaquePointer?, cboutputdata: UInt, pcboutputneeded: COpaquePointer?, pdwstatus: COpaquePointer?): Bool =
    windowssys_windows_win32_graphics_printing_xcvDataW(hxcv?.value?.toCPointer<ByteVar>(), pszdataname?.value?.toCPointer<ByteVar>(), pinputdata?.value?.toCPointer<ByteVar>(), cbinputdata, poutputdata?.value?.toCPointer<ByteVar>(), cboutputdata, pcboutputneeded?.value?.toCPointer<ByteVar>(), pdwstatus?.value?.toCPointer<ByteVar>())
