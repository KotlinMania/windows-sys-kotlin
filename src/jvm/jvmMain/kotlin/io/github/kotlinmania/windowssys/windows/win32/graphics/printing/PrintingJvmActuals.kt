@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private object WindowsWin32GraphicsPrintingJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_addMonitorA(pname: Long, level: Int, pmonitors: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_addMonitorW(pname: Long, level: Int, pmonitors: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_addPortA(pname: Long, hwnd: Long, pmonitorname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_addPortW(pname: Long, hwnd: Long, pmonitorname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_addPrintProcessorA(pname: Long, penvironment: Long, ppathname: Long, pprintprocessorname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_addPrintProcessorW(pname: Long, penvironment: Long, ppathname: Long, pprintprocessorname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_addPrintProvidorA(pname: Long, level: Int, pprovidorinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_addPrintProvidorW(pname: Long, level: Int, pprovidorinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_addPrinterA(pname: Long, level: Int, pprinter: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_addPrinterConnection2A(hwnd: Long, pszname: Long, dwlevel: Int, pconnectioninfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_addPrinterConnection2W(hwnd: Long, pszname: Long, dwlevel: Int, pconnectioninfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_addPrinterConnectionA(pname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_addPrinterConnectionW(pname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_addPrinterDriverA(pname: Long, level: Int, pdriverinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_addPrinterDriverExA(pname: Long, level: Int, lpbdriverinfo: Long, dwfilecopyflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_addPrinterDriverExW(pname: Long, level: Int, lpbdriverinfo: Long, dwfilecopyflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_addPrinterDriverW(pname: Long, level: Int, pdriverinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_addPrinterW(pname: Long, level: Int, pprinter: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_appendPrinterNotifyInfoData(pinfodest: Long, pdatasrc: Long, fdwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_callRouterFindFirstPrinterChangeNotification(hprinterrpc: Long, fdwfilterflags: Int, fdwoptions: Int, hnotify: Long, pprinternotifyoptions: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_commonPropertySheetUIA(hwndowner: Long, pfnpropsheetui: Long, lparam: Long, presult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_commonPropertySheetUIW(hwndowner: Long, pfnpropsheetui: Long, lparam: Long, presult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_configurePortA(pname: Long, hwnd: Long, pportname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_configurePortW(pname: Long, hwnd: Long, pportname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_connectToPrinterDlg(hwnd: Long, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_createPrintAsyncNotifyChannel(pszname: Long, pnotificationtype: Long, euserfilter: Int, econversationstyle: Int, pcallback: Long, ppiasynchnotification: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_deleteMonitorA(pname: Long, penvironment: Long, pmonitorname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_deleteMonitorW(pname: Long, penvironment: Long, pmonitorname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_deletePortA(pname: Long, hwnd: Long, pportname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_deletePortW(pname: Long, hwnd: Long, pportname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_deletePrintProcessorA(pname: Long, penvironment: Long, pprintprocessorname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_deletePrintProcessorW(pname: Long, penvironment: Long, pprintprocessorname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_deletePrintProvidorA(pname: Long, penvironment: Long, pprintprovidorname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_deletePrintProvidorW(pname: Long, penvironment: Long, pprintprovidorname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_deletePrinterConnectionA(pname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_deletePrinterConnectionW(pname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_deletePrinterDriverA(pname: Long, penvironment: Long, pdrivername: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_deletePrinterDriverExA(pname: Long, penvironment: Long, pdrivername: Long, dwdeleteflag: Int, dwversionflag: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_deletePrinterDriverExW(pname: Long, penvironment: Long, pdrivername: Long, dwdeleteflag: Int, dwversionflag: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_deletePrinterDriverPackageA(pszserver: Long, pszinfpath: Long, pszenvironment: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_deletePrinterDriverPackageW(pszserver: Long, pszinfpath: Long, pszenvironment: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_deletePrinterDriverW(pname: Long, penvironment: Long, pdrivername: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_deletePrinterIC(hprinteric: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_devQueryPrintEx(pdqpinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_enumMonitorsA(pname: Long, level: Int, pmonitor: Long, cbbuf: Int, pcbneeded: Long, pcreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_enumMonitorsW(pname: Long, level: Int, pmonitor: Long, cbbuf: Int, pcbneeded: Long, pcreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_enumPortsA(pname: Long, level: Int, pport: Long, cbbuf: Int, pcbneeded: Long, pcreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_enumPortsW(pname: Long, level: Int, pport: Long, cbbuf: Int, pcbneeded: Long, pcreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_enumPrintProcessorDatatypesA(pname: Long, pprintprocessorname: Long, level: Int, pdatatypes: Long, cbbuf: Int, pcbneeded: Long, pcreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_enumPrintProcessorDatatypesW(pname: Long, pprintprocessorname: Long, level: Int, pdatatypes: Long, cbbuf: Int, pcbneeded: Long, pcreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_enumPrintProcessorsA(pname: Long, penvironment: Long, level: Int, pprintprocessorinfo: Long, cbbuf: Int, pcbneeded: Long, pcreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_enumPrintProcessorsW(pname: Long, penvironment: Long, level: Int, pprintprocessorinfo: Long, cbbuf: Int, pcbneeded: Long, pcreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_enumPrinterDriversA(pname: Long, penvironment: Long, level: Int, pdriverinfo: Long, cbbuf: Int, pcbneeded: Long, pcreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_enumPrinterDriversW(pname: Long, penvironment: Long, level: Int, pdriverinfo: Long, cbbuf: Int, pcbneeded: Long, pcreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_enumPrintersA(flags: Int, name: Long, level: Int, pprinterenum: Long, cbbuf: Int, pcbneeded: Long, pcreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_enumPrintersW(flags: Int, name: Long, level: Int, pprinterenum: Long, cbbuf: Int, pcbneeded: Long, pcreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_extDeviceMode(hwnd: Long, hinst: Long, pdevmodeoutput: Long, pdevicename: Long, pport: Long, pdevmodeinput: Long, pprofile: Long, fmode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_findClosePrinterChangeNotification(hchange: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_findNextPrinterChangeNotification(hchange: Long, pdwchange: Long, pvreserved: Long, ppprinternotifyinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_freePrintNamedPropertyArray(cproperties: Int, ppproperties: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_freePrintPropertyValue(pvalue: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_freePrinterNotifyInfo(pprinternotifyinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_gdiDeleteSpoolFileHandle(spoolfilehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_gdiEndDocEMF(spoolfilehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_gdiEndPageEMF(spoolfilehandle: Long, dwoptimization: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_gdiGetDC(spoolfilehandle: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_gdiGetDevmodeForPage(spoolfilehandle: Long, dwpagenumber: Int, pcurrdm: Long, plastdm: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_gdiGetPageCount(spoolfilehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_gdiGetPageHandle(spoolfilehandle: Long, page: Int, pdwpagetype: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_gdiGetSpoolFileHandle(pwszprintername: Long, pdevmode: Long, pwszdocname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_gdiPlayPageEMF(spoolfilehandle: Long, hemf: Long, prectdocument: Long, prectborder: Long, prectclip: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_gdiResetDCEMF(spoolfilehandle: Long, pcurrdm: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_gdiStartDocEMF(spoolfilehandle: Long, pdocinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_gdiStartPageEMF(spoolfilehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_generateCopyFilePaths(pszprintername: Long, pszdirectory: Long, psplclientinfo: Long, dwlevel: Int, pszsourcedir: Long, pcchsourcedirsize: Long, psztargetdir: Long, pcchtargetdirsize: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_getCPSUIUserData(hdlg: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_getCorePrinterDriversA(pszserver: Long, pszenvironment: Long, pszzcoredriverdependencies: Long, ccoreprinterdrivers: Int, pcoreprinterdrivers: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_getCorePrinterDriversW(pszserver: Long, pszenvironment: Long, pszzcoredriverdependencies: Long, ccoreprinterdrivers: Int, pcoreprinterdrivers: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_getDefaultPrinterA(pszbuffer: Long, pcchbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_getDefaultPrinterW(pszbuffer: Long, pcchbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_getJobAttributes(pprintername: Long, pdevmode: Long, pattributeinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_getJobAttributesEx(pprintername: Long, pdevmode: Long, dwlevel: Int, pattributeinfo: Long, nsize: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_getPrintExecutionData(pdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_getPrintOutputInfo(hwnd: Long, pszprinter: Long, phfile: Long, ppszoutputfile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_getPrintProcessorDirectoryA(pname: Long, penvironment: Long, level: Int, pprintprocessorinfo: Long, cbbuf: Int, pcbneeded: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_getPrintProcessorDirectoryW(pname: Long, penvironment: Long, level: Int, pprintprocessorinfo: Long, cbbuf: Int, pcbneeded: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_getPrinterDriverDirectoryA(pname: Long, penvironment: Long, level: Int, pdriverdirectory: Long, cbbuf: Int, pcbneeded: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_getPrinterDriverDirectoryW(pname: Long, penvironment: Long, level: Int, pdriverdirectory: Long, cbbuf: Int, pcbneeded: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_getPrinterDriverPackagePathA(pszserver: Long, pszenvironment: Long, pszlanguage: Long, pszpackageid: Long, pszdriverpackagecab: Long, cchdriverpackagecab: Int, pcchrequiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_getPrinterDriverPackagePathW(pszserver: Long, pszenvironment: Long, pszlanguage: Long, pszpackageid: Long, pszdriverpackagecab: Long, cchdriverpackagecab: Int, pcchrequiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_impersonatePrinterClient(htoken: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_installPrinterDriverFromPackageA(pszserver: Long, pszinfpath: Long, pszdrivername: Long, pszenvironment: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_installPrinterDriverFromPackageW(pszserver: Long, pszinfpath: Long, pszdrivername: Long, pszenvironment: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_isValidDevmodeA(pdevmode: Long, devmodesize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_isValidDevmodeW(pdevmode: Long, devmodesize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_openPrinter2A(pprintername: Long, phprinter: Long, pdefault: Long, poptions: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_openPrinter2W(pprintername: Long, phprinter: Long, pdefault: Long, poptions: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_openPrinterA(pprintername: Long, phprinter: Long, pdefault: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_openPrinterW(pprintername: Long, phprinter: Long, pdefault: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_playGdiScriptOnPrinterIC(hprinteric: Long, pin: Long, cin: Int, pout: Long, cout: Int, ul: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_registerForPrintAsyncNotifications(pszname: Long, pnotificationtype: Long, euserfilter: Int, econversationstyle: Int, pcallback: Long, phnotify: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_removePrintDeviceObject(hdeviceobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_replyPrinterChangeNotificationEx(hnotify: Long, dwcolor: Int, fdwflags: Int, pdwresult: Long, pprinternotifyinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_reportJobProcessingProgress(printerhandle: Long, jobid: Int, joboperation: Int, jobprogress: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_revertToPrinterSelf(): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_routerAllocBidiMem(numbytes: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_routerAllocBidiResponseContainer(count: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_routerAllocPrinterNotifyInfo(cprinternotifyinfodata: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_routerFreeBidiMem(pmempointer: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_routerFreeBidiResponseContainer(pdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_routerFreePrinterNotifyInfo(pinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_setCPSUIUserData(hdlg: Long, cpsuiuserdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_setDefaultPrinterA(pszprinter: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_setDefaultPrinterW(pszprinter: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_setPortA(pname: Long, pportname: Long, dwlevel: Int, pportinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_setPortW(pname: Long, pportname: Long, dwlevel: Int, pportinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_spoolerCopyFileEvent(pszprintername: Long, pszkey: Long, dwcopyfileevent: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_spoolerFreePrinterNotifyInfo(pinfo: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_unRegisterForPrintAsyncNotifications(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_uploadPrinterDriverPackageA(pszserver: Long, pszinfpath: Long, pszenvironment: Long, dwflags: Int, hwnd: Long, pszdestinfpath: Long, pcchdestinfpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_uploadPrinterDriverPackageW(pszserver: Long, pszinfpath: Long, pszenvironment: Long, dwflags: Int, hwnd: Long, pszdestinfpath: Long, pcchdestinfpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_xcvDataW(hxcv: Long, pszdataname: Long, pinputdata: Long, cbinputdata: Int, poutputdata: Long, cboutputdata: Int, pcboutputneeded: Long, pdwstatus: Long): Int
}

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
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_addMonitorA((pname?.value ?: 0L), level.toInt(), (pmonitors?.value ?: 0L))

public actual fun addMonitorW(pname: Pcwstr, level: UInt, pmonitors: COpaquePointer?): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_addMonitorW((pname?.value ?: 0L), level.toInt(), (pmonitors?.value ?: 0L))

public actual fun addPortA(pname: Pcstr, hwnd: Hwnd, pmonitorname: Pcstr): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_addPortA((pname?.value ?: 0L), (hwnd?.value ?: 0L), (pmonitorname?.value ?: 0L))

public actual fun addPortW(pname: Pcwstr, hwnd: Hwnd, pmonitorname: Pcwstr): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_addPortW((pname?.value ?: 0L), (hwnd?.value ?: 0L), (pmonitorname?.value ?: 0L))

public actual fun addPrintDeviceObject(hprinter: PrinterHandle, phdeviceobject: COpaquePointer?): Hresult =
    0

public actual fun addPrintProcessorA(pname: Pcstr, penvironment: Pcstr, ppathname: Pcstr, pprintprocessorname: Pcstr): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_addPrintProcessorA((pname?.value ?: 0L), (penvironment?.value ?: 0L), (ppathname?.value ?: 0L), (pprintprocessorname?.value ?: 0L))

public actual fun addPrintProcessorW(pname: Pcwstr, penvironment: Pcwstr, ppathname: Pcwstr, pprintprocessorname: Pcwstr): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_addPrintProcessorW((pname?.value ?: 0L), (penvironment?.value ?: 0L), (ppathname?.value ?: 0L), (pprintprocessorname?.value ?: 0L))

public actual fun addPrintProvidorA(pname: Pcstr, level: UInt, pprovidorinfo: COpaquePointer?): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_addPrintProvidorA((pname?.value ?: 0L), level.toInt(), (pprovidorinfo?.value ?: 0L))

public actual fun addPrintProvidorW(pname: Pcwstr, level: UInt, pprovidorinfo: COpaquePointer?): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_addPrintProvidorW((pname?.value ?: 0L), level.toInt(), (pprovidorinfo?.value ?: 0L))

public actual fun addPrinterA(pname: Pcstr, level: UInt, pprinter: COpaquePointer?): Handle =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_addPrinterA((pname?.value ?: 0L), level.toInt(), (pprinter?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun addPrinterConnection2A(hwnd: Hwnd, pszname: Pcstr, dwlevel: UInt, pconnectioninfo: COpaquePointer?): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_addPrinterConnection2A((hwnd?.value ?: 0L), (pszname?.value ?: 0L), dwlevel.toInt(), (pconnectioninfo?.value ?: 0L))

public actual fun addPrinterConnection2W(hwnd: Hwnd, pszname: Pcwstr, dwlevel: UInt, pconnectioninfo: COpaquePointer?): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_addPrinterConnection2W((hwnd?.value ?: 0L), (pszname?.value ?: 0L), dwlevel.toInt(), (pconnectioninfo?.value ?: 0L))

public actual fun addPrinterConnectionA(pname: Pcstr): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_addPrinterConnectionA((pname?.value ?: 0L))

public actual fun addPrinterConnectionW(pname: Pcwstr): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_addPrinterConnectionW((pname?.value ?: 0L))

public actual fun addPrinterDriverA(pname: Pcstr, level: UInt, pdriverinfo: COpaquePointer?): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_addPrinterDriverA((pname?.value ?: 0L), level.toInt(), (pdriverinfo?.value ?: 0L))

public actual fun addPrinterDriverExA(pname: Pcstr, level: UInt, lpbdriverinfo: COpaquePointer?, dwfilecopyflags: UInt): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_addPrinterDriverExA((pname?.value ?: 0L), level.toInt(), (lpbdriverinfo?.value ?: 0L), dwfilecopyflags.toInt())

public actual fun addPrinterDriverExW(pname: Pcwstr, level: UInt, lpbdriverinfo: COpaquePointer?, dwfilecopyflags: UInt): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_addPrinterDriverExW((pname?.value ?: 0L), level.toInt(), (lpbdriverinfo?.value ?: 0L), dwfilecopyflags.toInt())

public actual fun addPrinterDriverW(pname: Pcwstr, level: UInt, pdriverinfo: COpaquePointer?): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_addPrinterDriverW((pname?.value ?: 0L), level.toInt(), (pdriverinfo?.value ?: 0L))

public actual fun addPrinterW(pname: Pcwstr, level: UInt, pprinter: COpaquePointer?): Handle =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_addPrinterW((pname?.value ?: 0L), level.toInt(), (pprinter?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun advancedDocumentPropertiesA(hwnd: Hwnd, hprinter: PrinterHandle, pdevicename: Pcstr, pdevmodeoutput: COpaquePointer?, pdevmodeinput: COpaquePointer?): Int =
    0

public actual fun advancedDocumentPropertiesW(hwnd: Hwnd, hprinter: PrinterHandle, pdevicename: Pcwstr, pdevmodeoutput: COpaquePointer?, pdevmodeinput: COpaquePointer?): Int =
    0

public actual fun appendPrinterNotifyInfoData(pinfodest: COpaquePointer?, pdatasrc: COpaquePointer?, fdwflags: UInt): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_appendPrinterNotifyInfoData((pinfodest?.value ?: 0L), (pdatasrc?.value ?: 0L), fdwflags.toInt())

public actual fun callRouterFindFirstPrinterChangeNotification(hprinterrpc: Handle, fdwfilterflags: UInt, fdwoptions: UInt, hnotify: Handle, pprinternotifyoptions: COpaquePointer?): UInt =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_callRouterFindFirstPrinterChangeNotification((hprinterrpc?.value ?: 0L), fdwfilterflags.toInt(), fdwoptions.toInt(), (hnotify?.value ?: 0L), (pprinternotifyoptions?.value ?: 0L)).toUInt()

public actual fun closePrinter(hprinter: PrinterHandle): Bool =
    0

public actual fun closeSpoolFileHandle(hprinter: PrinterHandle, hspoolfile: Handle): Bool =
    0

public actual fun commitSpoolData(hprinter: PrinterHandle, hspoolfile: Handle, cbcommit: UInt): Handle =
    null

public actual fun commonPropertySheetUIA(hwndowner: Hwnd, pfnpropsheetui: Pfnpropsheetui, lparam: Lparam, presult: COpaquePointer?): Int =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_commonPropertySheetUIA((hwndowner?.value ?: 0L), 0L, lparam, (presult?.value ?: 0L))

public actual fun commonPropertySheetUIW(hwndowner: Hwnd, pfnpropsheetui: Pfnpropsheetui, lparam: Lparam, presult: COpaquePointer?): Int =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_commonPropertySheetUIW((hwndowner?.value ?: 0L), 0L, lparam, (presult?.value ?: 0L))

public actual fun configurePortA(pname: Pcstr, hwnd: Hwnd, pportname: Pcstr): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_configurePortA((pname?.value ?: 0L), (hwnd?.value ?: 0L), (pportname?.value ?: 0L))

public actual fun configurePortW(pname: Pcwstr, hwnd: Hwnd, pportname: Pcwstr): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_configurePortW((pname?.value ?: 0L), (hwnd?.value ?: 0L), (pportname?.value ?: 0L))

public actual fun connectToPrinterDlg(hwnd: Hwnd, flags: UInt): Handle =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_connectToPrinterDlg((hwnd?.value ?: 0L), flags.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun corePrinterDriverInstalledA(pszserver: Pcstr, pszenvironment: Pcstr, coredriverguid: Guid, ftdriverdate: Filetime, dwldriverversion: ULong, pbdriverinstalled: COpaquePointer?): Hresult =
    0

public actual fun corePrinterDriverInstalledW(pszserver: Pcwstr, pszenvironment: Pcwstr, coredriverguid: Guid, ftdriverdate: Filetime, dwldriverversion: ULong, pbdriverinstalled: COpaquePointer?): Hresult =
    0

public actual fun createPrintAsyncNotifyChannel(pszname: Pcwstr, pnotificationtype: COpaquePointer?, euserfilter: PrintAsyncNotifyUserFilter, econversationstyle: PrintAsyncNotifyConversationStyle, pcallback: COpaquePointer?, ppiasynchnotification: COpaquePointer?): Hresult =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_createPrintAsyncNotifyChannel((pszname?.value ?: 0L), (pnotificationtype?.value ?: 0L), euserfilter, econversationstyle, (pcallback?.value ?: 0L), (ppiasynchnotification?.value ?: 0L))

public actual fun createPrinterIC(hprinter: PrinterHandle, pdevmode: COpaquePointer?): Handle =
    null

public actual fun deleteFormA(hprinter: PrinterHandle, pformname: Pcstr): Bool =
    0

public actual fun deleteFormW(hprinter: PrinterHandle, pformname: Pcwstr): Bool =
    0

public actual fun deleteJobNamedProperty(hprinter: PrinterHandle, jobid: UInt, pszname: Pcwstr): UInt =
    0u

public actual fun deleteMonitorA(pname: Pcstr, penvironment: Pcstr, pmonitorname: Pcstr): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_deleteMonitorA((pname?.value ?: 0L), (penvironment?.value ?: 0L), (pmonitorname?.value ?: 0L))

public actual fun deleteMonitorW(pname: Pcwstr, penvironment: Pcwstr, pmonitorname: Pcwstr): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_deleteMonitorW((pname?.value ?: 0L), (penvironment?.value ?: 0L), (pmonitorname?.value ?: 0L))

public actual fun deletePortA(pname: Pcstr, hwnd: Hwnd, pportname: Pcstr): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_deletePortA((pname?.value ?: 0L), (hwnd?.value ?: 0L), (pportname?.value ?: 0L))

public actual fun deletePortW(pname: Pcwstr, hwnd: Hwnd, pportname: Pcwstr): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_deletePortW((pname?.value ?: 0L), (hwnd?.value ?: 0L), (pportname?.value ?: 0L))

public actual fun deletePrintProcessorA(pname: Pcstr, penvironment: Pcstr, pprintprocessorname: Pcstr): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_deletePrintProcessorA((pname?.value ?: 0L), (penvironment?.value ?: 0L), (pprintprocessorname?.value ?: 0L))

public actual fun deletePrintProcessorW(pname: Pcwstr, penvironment: Pcwstr, pprintprocessorname: Pcwstr): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_deletePrintProcessorW((pname?.value ?: 0L), (penvironment?.value ?: 0L), (pprintprocessorname?.value ?: 0L))

public actual fun deletePrintProvidorA(pname: Pcstr, penvironment: Pcstr, pprintprovidorname: Pcstr): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_deletePrintProvidorA((pname?.value ?: 0L), (penvironment?.value ?: 0L), (pprintprovidorname?.value ?: 0L))

public actual fun deletePrintProvidorW(pname: Pcwstr, penvironment: Pcwstr, pprintprovidorname: Pcwstr): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_deletePrintProvidorW((pname?.value ?: 0L), (penvironment?.value ?: 0L), (pprintprovidorname?.value ?: 0L))

public actual fun deletePrinter(hprinter: PrinterHandle): Bool =
    0

public actual fun deletePrinterConnectionA(pname: Pcstr): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_deletePrinterConnectionA((pname?.value ?: 0L))

public actual fun deletePrinterConnectionW(pname: Pcwstr): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_deletePrinterConnectionW((pname?.value ?: 0L))

public actual fun deletePrinterDataA(hprinter: PrinterHandle, pvaluename: Pcstr): UInt =
    0u

public actual fun deletePrinterDataExA(hprinter: PrinterHandle, pkeyname: Pcstr, pvaluename: Pcstr): UInt =
    0u

public actual fun deletePrinterDataExW(hprinter: PrinterHandle, pkeyname: Pcwstr, pvaluename: Pcwstr): UInt =
    0u

public actual fun deletePrinterDataW(hprinter: PrinterHandle, pvaluename: Pcwstr): UInt =
    0u

public actual fun deletePrinterDriverA(pname: Pcstr, penvironment: Pcstr, pdrivername: Pcstr): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_deletePrinterDriverA((pname?.value ?: 0L), (penvironment?.value ?: 0L), (pdrivername?.value ?: 0L))

public actual fun deletePrinterDriverExA(pname: Pcstr, penvironment: Pcstr, pdrivername: Pcstr, dwdeleteflag: UInt, dwversionflag: UInt): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_deletePrinterDriverExA((pname?.value ?: 0L), (penvironment?.value ?: 0L), (pdrivername?.value ?: 0L), dwdeleteflag.toInt(), dwversionflag.toInt())

public actual fun deletePrinterDriverExW(pname: Pcwstr, penvironment: Pcwstr, pdrivername: Pcwstr, dwdeleteflag: UInt, dwversionflag: UInt): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_deletePrinterDriverExW((pname?.value ?: 0L), (penvironment?.value ?: 0L), (pdrivername?.value ?: 0L), dwdeleteflag.toInt(), dwversionflag.toInt())

public actual fun deletePrinterDriverPackageA(pszserver: Pcstr, pszinfpath: Pcstr, pszenvironment: Pcstr): Hresult =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_deletePrinterDriverPackageA((pszserver?.value ?: 0L), (pszinfpath?.value ?: 0L), (pszenvironment?.value ?: 0L))

public actual fun deletePrinterDriverPackageW(pszserver: Pcwstr, pszinfpath: Pcwstr, pszenvironment: Pcwstr): Hresult =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_deletePrinterDriverPackageW((pszserver?.value ?: 0L), (pszinfpath?.value ?: 0L), (pszenvironment?.value ?: 0L))

public actual fun deletePrinterDriverW(pname: Pcwstr, penvironment: Pcwstr, pdrivername: Pcwstr): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_deletePrinterDriverW((pname?.value ?: 0L), (penvironment?.value ?: 0L), (pdrivername?.value ?: 0L))

public actual fun deletePrinterIC(hprinteric: Handle): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_deletePrinterIC((hprinteric?.value ?: 0L))

public actual fun deletePrinterKeyA(hprinter: PrinterHandle, pkeyname: Pcstr): UInt =
    0u

public actual fun deletePrinterKeyW(hprinter: PrinterHandle, pkeyname: Pcwstr): UInt =
    0u

public actual fun devQueryPrint(hprinter: PrinterHandle, pdevmode: COpaquePointer?, presid: COpaquePointer?): Bool =
    0

public actual fun devQueryPrintEx(pdqpinfo: COpaquePointer?): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_devQueryPrintEx((pdqpinfo?.value ?: 0L))

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
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_enumMonitorsA((pname?.value ?: 0L), level.toInt(), (pmonitor?.value ?: 0L), cbbuf.toInt(), (pcbneeded?.value ?: 0L), (pcreturned?.value ?: 0L))

public actual fun enumMonitorsW(pname: Pcwstr, level: UInt, pmonitor: COpaquePointer?, cbbuf: UInt, pcbneeded: COpaquePointer?, pcreturned: COpaquePointer?): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_enumMonitorsW((pname?.value ?: 0L), level.toInt(), (pmonitor?.value ?: 0L), cbbuf.toInt(), (pcbneeded?.value ?: 0L), (pcreturned?.value ?: 0L))

public actual fun enumPortsA(pname: Pcstr, level: UInt, pport: COpaquePointer?, cbbuf: UInt, pcbneeded: COpaquePointer?, pcreturned: COpaquePointer?): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_enumPortsA((pname?.value ?: 0L), level.toInt(), (pport?.value ?: 0L), cbbuf.toInt(), (pcbneeded?.value ?: 0L), (pcreturned?.value ?: 0L))

public actual fun enumPortsW(pname: Pcwstr, level: UInt, pport: COpaquePointer?, cbbuf: UInt, pcbneeded: COpaquePointer?, pcreturned: COpaquePointer?): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_enumPortsW((pname?.value ?: 0L), level.toInt(), (pport?.value ?: 0L), cbbuf.toInt(), (pcbneeded?.value ?: 0L), (pcreturned?.value ?: 0L))

public actual fun enumPrintProcessorDatatypesA(pname: Pcstr, pprintprocessorname: Pcstr, level: UInt, pdatatypes: COpaquePointer?, cbbuf: UInt, pcbneeded: COpaquePointer?, pcreturned: COpaquePointer?): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_enumPrintProcessorDatatypesA((pname?.value ?: 0L), (pprintprocessorname?.value ?: 0L), level.toInt(), (pdatatypes?.value ?: 0L), cbbuf.toInt(), (pcbneeded?.value ?: 0L), (pcreturned?.value ?: 0L))

public actual fun enumPrintProcessorDatatypesW(pname: Pcwstr, pprintprocessorname: Pcwstr, level: UInt, pdatatypes: COpaquePointer?, cbbuf: UInt, pcbneeded: COpaquePointer?, pcreturned: COpaquePointer?): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_enumPrintProcessorDatatypesW((pname?.value ?: 0L), (pprintprocessorname?.value ?: 0L), level.toInt(), (pdatatypes?.value ?: 0L), cbbuf.toInt(), (pcbneeded?.value ?: 0L), (pcreturned?.value ?: 0L))

public actual fun enumPrintProcessorsA(pname: Pcstr, penvironment: Pcstr, level: UInt, pprintprocessorinfo: COpaquePointer?, cbbuf: UInt, pcbneeded: COpaquePointer?, pcreturned: COpaquePointer?): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_enumPrintProcessorsA((pname?.value ?: 0L), (penvironment?.value ?: 0L), level.toInt(), (pprintprocessorinfo?.value ?: 0L), cbbuf.toInt(), (pcbneeded?.value ?: 0L), (pcreturned?.value ?: 0L))

public actual fun enumPrintProcessorsW(pname: Pcwstr, penvironment: Pcwstr, level: UInt, pprintprocessorinfo: COpaquePointer?, cbbuf: UInt, pcbneeded: COpaquePointer?, pcreturned: COpaquePointer?): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_enumPrintProcessorsW((pname?.value ?: 0L), (penvironment?.value ?: 0L), level.toInt(), (pprintprocessorinfo?.value ?: 0L), cbbuf.toInt(), (pcbneeded?.value ?: 0L), (pcreturned?.value ?: 0L))

public actual fun enumPrinterDataA(hprinter: PrinterHandle, dwindex: UInt, pvaluename: Pstr, cbvaluename: UInt, pcbvaluename: COpaquePointer?, ptype: COpaquePointer?, pdata: COpaquePointer?, cbdata: UInt, pcbdata: COpaquePointer?): UInt =
    0u

public actual fun enumPrinterDataExA(hprinter: PrinterHandle, pkeyname: Pcstr, penumvalues: COpaquePointer?, cbenumvalues: UInt, pcbenumvalues: COpaquePointer?, pnenumvalues: COpaquePointer?): UInt =
    0u

public actual fun enumPrinterDataExW(hprinter: PrinterHandle, pkeyname: Pcwstr, penumvalues: COpaquePointer?, cbenumvalues: UInt, pcbenumvalues: COpaquePointer?, pnenumvalues: COpaquePointer?): UInt =
    0u

public actual fun enumPrinterDataW(hprinter: PrinterHandle, dwindex: UInt, pvaluename: Pwstr, cbvaluename: UInt, pcbvaluename: COpaquePointer?, ptype: COpaquePointer?, pdata: COpaquePointer?, cbdata: UInt, pcbdata: COpaquePointer?): UInt =
    0u

public actual fun enumPrinterDriversA(pname: Pcstr, penvironment: Pcstr, level: UInt, pdriverinfo: COpaquePointer?, cbbuf: UInt, pcbneeded: COpaquePointer?, pcreturned: COpaquePointer?): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_enumPrinterDriversA((pname?.value ?: 0L), (penvironment?.value ?: 0L), level.toInt(), (pdriverinfo?.value ?: 0L), cbbuf.toInt(), (pcbneeded?.value ?: 0L), (pcreturned?.value ?: 0L))

public actual fun enumPrinterDriversW(pname: Pcwstr, penvironment: Pcwstr, level: UInt, pdriverinfo: COpaquePointer?, cbbuf: UInt, pcbneeded: COpaquePointer?, pcreturned: COpaquePointer?): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_enumPrinterDriversW((pname?.value ?: 0L), (penvironment?.value ?: 0L), level.toInt(), (pdriverinfo?.value ?: 0L), cbbuf.toInt(), (pcbneeded?.value ?: 0L), (pcreturned?.value ?: 0L))

public actual fun enumPrinterKeyA(hprinter: PrinterHandle, pkeyname: Pcstr, psubkey: Pstr, cbsubkey: UInt, pcbsubkey: COpaquePointer?): UInt =
    0u

public actual fun enumPrinterKeyW(hprinter: PrinterHandle, pkeyname: Pcwstr, psubkey: Pwstr, cbsubkey: UInt, pcbsubkey: COpaquePointer?): UInt =
    0u

public actual fun enumPrintersA(flags: UInt, name: Pcstr, level: UInt, pprinterenum: COpaquePointer?, cbbuf: UInt, pcbneeded: COpaquePointer?, pcreturned: COpaquePointer?): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_enumPrintersA(flags.toInt(), (name?.value ?: 0L), level.toInt(), (pprinterenum?.value ?: 0L), cbbuf.toInt(), (pcbneeded?.value ?: 0L), (pcreturned?.value ?: 0L))

public actual fun enumPrintersW(flags: UInt, name: Pcwstr, level: UInt, pprinterenum: COpaquePointer?, cbbuf: UInt, pcbneeded: COpaquePointer?, pcreturned: COpaquePointer?): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_enumPrintersW(flags.toInt(), (name?.value ?: 0L), level.toInt(), (pprinterenum?.value ?: 0L), cbbuf.toInt(), (pcbneeded?.value ?: 0L), (pcreturned?.value ?: 0L))

public actual fun extDeviceMode(hwnd: Hwnd, hinst: Handle, pdevmodeoutput: COpaquePointer?, pdevicename: Pcstr, pport: Pcstr, pdevmodeinput: COpaquePointer?, pprofile: Pcstr, fmode: UInt): Int =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_extDeviceMode((hwnd?.value ?: 0L), (hinst?.value ?: 0L), (pdevmodeoutput?.value ?: 0L), (pdevicename?.value ?: 0L), (pport?.value ?: 0L), (pdevmodeinput?.value ?: 0L), (pprofile?.value ?: 0L), fmode.toInt())

public actual fun findClosePrinterChangeNotification(hchange: Handle): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_findClosePrinterChangeNotification((hchange?.value ?: 0L))

public actual fun findFirstPrinterChangeNotification(hprinter: PrinterHandle, fdwfilter: UInt, fdwoptions: UInt, pprinternotifyoptions: COpaquePointer?): Handle =
    null

public actual fun findNextPrinterChangeNotification(hchange: Handle, pdwchange: COpaquePointer?, pvreserved: COpaquePointer?, ppprinternotifyinfo: COpaquePointer?): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_findNextPrinterChangeNotification((hchange?.value ?: 0L), (pdwchange?.value ?: 0L), (pvreserved?.value ?: 0L), (ppprinternotifyinfo?.value ?: 0L))

public actual fun flushPrinter(hprinter: PrinterHandle, pbuf: COpaquePointer?, cbbuf: UInt, pcwritten: COpaquePointer?, csleep: UInt): Bool =
    0

public actual fun freePrintNamedPropertyArray(cproperties: UInt, ppproperties: COpaquePointer?) {
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_freePrintNamedPropertyArray(cproperties.toInt(), (ppproperties?.value ?: 0L))
}

public actual fun freePrintPropertyValue(pvalue: COpaquePointer?) {
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_freePrintPropertyValue((pvalue?.value ?: 0L))
}

public actual fun freePrinterNotifyInfo(pprinternotifyinfo: COpaquePointer?): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_freePrinterNotifyInfo((pprinternotifyinfo?.value ?: 0L))

public actual fun gdiDeleteSpoolFileHandle(spoolfilehandle: Handle): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_gdiDeleteSpoolFileHandle((spoolfilehandle?.value ?: 0L))

public actual fun gdiEndDocEMF(spoolfilehandle: Handle): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_gdiEndDocEMF((spoolfilehandle?.value ?: 0L))

public actual fun gdiEndPageEMF(spoolfilehandle: Handle, dwoptimization: UInt): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_gdiEndPageEMF((spoolfilehandle?.value ?: 0L), dwoptimization.toInt())

public actual fun gdiGetDC(spoolfilehandle: Handle): Hdc =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_gdiGetDC((spoolfilehandle?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun gdiGetDevmodeForPage(spoolfilehandle: Handle, dwpagenumber: UInt, pcurrdm: COpaquePointer?, plastdm: COpaquePointer?): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_gdiGetDevmodeForPage((spoolfilehandle?.value ?: 0L), dwpagenumber.toInt(), (pcurrdm?.value ?: 0L), (plastdm?.value ?: 0L))

public actual fun gdiGetPageCount(spoolfilehandle: Handle): UInt =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_gdiGetPageCount((spoolfilehandle?.value ?: 0L)).toUInt()

public actual fun gdiGetPageHandle(spoolfilehandle: Handle, page: UInt, pdwpagetype: COpaquePointer?): Handle =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_gdiGetPageHandle((spoolfilehandle?.value ?: 0L), page.toInt(), (pdwpagetype?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun gdiGetSpoolFileHandle(pwszprintername: Pcwstr, pdevmode: COpaquePointer?, pwszdocname: Pcwstr): Handle =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_gdiGetSpoolFileHandle((pwszprintername?.value ?: 0L), (pdevmode?.value ?: 0L), (pwszdocname?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun gdiPlayPageEMF(spoolfilehandle: Handle, hemf: Handle, prectdocument: COpaquePointer?, prectborder: COpaquePointer?, prectclip: COpaquePointer?): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_gdiPlayPageEMF((spoolfilehandle?.value ?: 0L), (hemf?.value ?: 0L), (prectdocument?.value ?: 0L), (prectborder?.value ?: 0L), (prectclip?.value ?: 0L))

public actual fun gdiResetDCEMF(spoolfilehandle: Handle, pcurrdm: COpaquePointer?): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_gdiResetDCEMF((spoolfilehandle?.value ?: 0L), (pcurrdm?.value ?: 0L))

public actual fun gdiStartDocEMF(spoolfilehandle: Handle, pdocinfo: COpaquePointer?): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_gdiStartDocEMF((spoolfilehandle?.value ?: 0L), (pdocinfo?.value ?: 0L))

public actual fun gdiStartPageEMF(spoolfilehandle: Handle): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_gdiStartPageEMF((spoolfilehandle?.value ?: 0L))

public actual fun generateCopyFilePaths(pszprintername: Pcwstr, pszdirectory: Pcwstr, psplclientinfo: COpaquePointer?, dwlevel: UInt, pszsourcedir: Pwstr, pcchsourcedirsize: COpaquePointer?, psztargetdir: Pwstr, pcchtargetdirsize: COpaquePointer?, dwflags: UInt): UInt =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_generateCopyFilePaths((pszprintername?.value ?: 0L), (pszdirectory?.value ?: 0L), (psplclientinfo?.value ?: 0L), dwlevel.toInt(), (pszsourcedir?.value ?: 0L), (pcchsourcedirsize?.value ?: 0L), (psztargetdir?.value ?: 0L), (pcchtargetdirsize?.value ?: 0L), dwflags.toInt()).toUInt()

public actual fun getCPSUIUserData(hdlg: Hwnd): ULong =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_getCPSUIUserData((hdlg?.value ?: 0L)).toULong()

public actual fun getCorePrinterDriversA(pszserver: Pcstr, pszenvironment: Pcstr, pszzcoredriverdependencies: Pcstr, ccoreprinterdrivers: UInt, pcoreprinterdrivers: COpaquePointer?): Hresult =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_getCorePrinterDriversA((pszserver?.value ?: 0L), (pszenvironment?.value ?: 0L), (pszzcoredriverdependencies?.value ?: 0L), ccoreprinterdrivers.toInt(), (pcoreprinterdrivers?.value ?: 0L))

public actual fun getCorePrinterDriversW(pszserver: Pcwstr, pszenvironment: Pcwstr, pszzcoredriverdependencies: Pcwstr, ccoreprinterdrivers: UInt, pcoreprinterdrivers: COpaquePointer?): Hresult =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_getCorePrinterDriversW((pszserver?.value ?: 0L), (pszenvironment?.value ?: 0L), (pszzcoredriverdependencies?.value ?: 0L), ccoreprinterdrivers.toInt(), (pcoreprinterdrivers?.value ?: 0L))

public actual fun getDefaultPrinterA(pszbuffer: Pstr, pcchbuffer: COpaquePointer?): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_getDefaultPrinterA((pszbuffer?.value ?: 0L), (pcchbuffer?.value ?: 0L))

public actual fun getDefaultPrinterW(pszbuffer: Pwstr, pcchbuffer: COpaquePointer?): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_getDefaultPrinterW((pszbuffer?.value ?: 0L), (pcchbuffer?.value ?: 0L))

public actual fun getFormA(hprinter: PrinterHandle, pformname: Pcstr, level: UInt, pform: COpaquePointer?, cbbuf: UInt, pcbneeded: COpaquePointer?): Bool =
    0

public actual fun getFormW(hprinter: PrinterHandle, pformname: Pcwstr, level: UInt, pform: COpaquePointer?, cbbuf: UInt, pcbneeded: COpaquePointer?): Bool =
    0

public actual fun getJobA(hprinter: PrinterHandle, jobid: UInt, level: UInt, pjob: COpaquePointer?, cbbuf: UInt, pcbneeded: COpaquePointer?): Bool =
    0

public actual fun getJobAttributes(pprintername: Pcwstr, pdevmode: COpaquePointer?, pattributeinfo: COpaquePointer?): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_getJobAttributes((pprintername?.value ?: 0L), (pdevmode?.value ?: 0L), (pattributeinfo?.value ?: 0L))

public actual fun getJobAttributesEx(pprintername: Pcwstr, pdevmode: COpaquePointer?, dwlevel: UInt, pattributeinfo: COpaquePointer?, nsize: UInt, dwflags: UInt): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_getJobAttributesEx((pprintername?.value ?: 0L), (pdevmode?.value ?: 0L), dwlevel.toInt(), (pattributeinfo?.value ?: 0L), nsize.toInt(), dwflags.toInt())

public actual fun getJobNamedPropertyValue(hprinter: PrinterHandle, jobid: UInt, pszname: Pcwstr, pvalue: COpaquePointer?): UInt =
    0u

public actual fun getJobW(hprinter: PrinterHandle, jobid: UInt, level: UInt, pjob: COpaquePointer?, cbbuf: UInt, pcbneeded: COpaquePointer?): Bool =
    0

public actual fun getPrintExecutionData(pdata: COpaquePointer?): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_getPrintExecutionData((pdata?.value ?: 0L))

public actual fun getPrintOutputInfo(hwnd: Hwnd, pszprinter: Pcwstr, phfile: COpaquePointer?, ppszoutputfile: COpaquePointer?): Hresult =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_getPrintOutputInfo((hwnd?.value ?: 0L), (pszprinter?.value ?: 0L), (phfile?.value ?: 0L), (ppszoutputfile?.value ?: 0L))

public actual fun getPrintProcessorDirectoryA(pname: Pcstr, penvironment: Pcstr, level: UInt, pprintprocessorinfo: COpaquePointer?, cbbuf: UInt, pcbneeded: COpaquePointer?): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_getPrintProcessorDirectoryA((pname?.value ?: 0L), (penvironment?.value ?: 0L), level.toInt(), (pprintprocessorinfo?.value ?: 0L), cbbuf.toInt(), (pcbneeded?.value ?: 0L))

public actual fun getPrintProcessorDirectoryW(pname: Pcwstr, penvironment: Pcwstr, level: UInt, pprintprocessorinfo: COpaquePointer?, cbbuf: UInt, pcbneeded: COpaquePointer?): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_getPrintProcessorDirectoryW((pname?.value ?: 0L), (penvironment?.value ?: 0L), level.toInt(), (pprintprocessorinfo?.value ?: 0L), cbbuf.toInt(), (pcbneeded?.value ?: 0L))

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
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_getPrinterDriverDirectoryA((pname?.value ?: 0L), (penvironment?.value ?: 0L), level.toInt(), (pdriverdirectory?.value ?: 0L), cbbuf.toInt(), (pcbneeded?.value ?: 0L))

public actual fun getPrinterDriverDirectoryW(pname: Pcwstr, penvironment: Pcwstr, level: UInt, pdriverdirectory: COpaquePointer?, cbbuf: UInt, pcbneeded: COpaquePointer?): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_getPrinterDriverDirectoryW((pname?.value ?: 0L), (penvironment?.value ?: 0L), level.toInt(), (pdriverdirectory?.value ?: 0L), cbbuf.toInt(), (pcbneeded?.value ?: 0L))

public actual fun getPrinterDriverPackagePathA(pszserver: Pcstr, pszenvironment: Pcstr, pszlanguage: Pcstr, pszpackageid: Pcstr, pszdriverpackagecab: Pstr, cchdriverpackagecab: UInt, pcchrequiredsize: COpaquePointer?): Hresult =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_getPrinterDriverPackagePathA((pszserver?.value ?: 0L), (pszenvironment?.value ?: 0L), (pszlanguage?.value ?: 0L), (pszpackageid?.value ?: 0L), (pszdriverpackagecab?.value ?: 0L), cchdriverpackagecab.toInt(), (pcchrequiredsize?.value ?: 0L))

public actual fun getPrinterDriverPackagePathW(pszserver: Pcwstr, pszenvironment: Pcwstr, pszlanguage: Pcwstr, pszpackageid: Pcwstr, pszdriverpackagecab: Pwstr, cchdriverpackagecab: UInt, pcchrequiredsize: COpaquePointer?): Hresult =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_getPrinterDriverPackagePathW((pszserver?.value ?: 0L), (pszenvironment?.value ?: 0L), (pszlanguage?.value ?: 0L), (pszpackageid?.value ?: 0L), (pszdriverpackagecab?.value ?: 0L), cchdriverpackagecab.toInt(), (pcchrequiredsize?.value ?: 0L))

public actual fun getPrinterDriverW(hprinter: PrinterHandle, penvironment: Pcwstr, level: UInt, pdriverinfo: COpaquePointer?, cbbuf: UInt, pcbneeded: COpaquePointer?): Bool =
    0

public actual fun getPrinterW(hprinter: PrinterHandle, level: UInt, pprinter: COpaquePointer?, cbbuf: UInt, pcbneeded: COpaquePointer?): Bool =
    0

public actual fun getSpoolFileHandle(hprinter: PrinterHandle): Handle =
    null

public actual fun impersonatePrinterClient(htoken: Handle): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_impersonatePrinterClient((htoken?.value ?: 0L))

public actual fun installPrinterDriverFromPackageA(pszserver: Pcstr, pszinfpath: Pcstr, pszdrivername: Pcstr, pszenvironment: Pcstr, dwflags: UInt): Hresult =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_installPrinterDriverFromPackageA((pszserver?.value ?: 0L), (pszinfpath?.value ?: 0L), (pszdrivername?.value ?: 0L), (pszenvironment?.value ?: 0L), dwflags.toInt())

public actual fun installPrinterDriverFromPackageW(pszserver: Pcwstr, pszinfpath: Pcwstr, pszdrivername: Pcwstr, pszenvironment: Pcwstr, dwflags: UInt): Hresult =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_installPrinterDriverFromPackageW((pszserver?.value ?: 0L), (pszinfpath?.value ?: 0L), (pszdrivername?.value ?: 0L), (pszenvironment?.value ?: 0L), dwflags.toInt())

public actual fun isValidDevmodeA(pdevmode: COpaquePointer?, devmodesize: ULong): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_isValidDevmodeA((pdevmode?.value ?: 0L), devmodesize.toLong())

public actual fun isValidDevmodeW(pdevmode: COpaquePointer?, devmodesize: ULong): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_isValidDevmodeW((pdevmode?.value ?: 0L), devmodesize.toLong())

public actual fun openPrinter2A(pprintername: Pcstr, phprinter: COpaquePointer?, pdefault: COpaquePointer?, poptions: COpaquePointer?): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_openPrinter2A((pprintername?.value ?: 0L), (phprinter?.value ?: 0L), (pdefault?.value ?: 0L), (poptions?.value ?: 0L))

public actual fun openPrinter2W(pprintername: Pcwstr, phprinter: COpaquePointer?, pdefault: COpaquePointer?, poptions: COpaquePointer?): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_openPrinter2W((pprintername?.value ?: 0L), (phprinter?.value ?: 0L), (pdefault?.value ?: 0L), (poptions?.value ?: 0L))

public actual fun openPrinterA(pprintername: Pcstr, phprinter: COpaquePointer?, pdefault: COpaquePointer?): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_openPrinterA((pprintername?.value ?: 0L), (phprinter?.value ?: 0L), (pdefault?.value ?: 0L))

public actual fun openPrinterW(pprintername: Pcwstr, phprinter: COpaquePointer?, pdefault: COpaquePointer?): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_openPrinterW((pprintername?.value ?: 0L), (phprinter?.value ?: 0L), (pdefault?.value ?: 0L))

public actual fun partialReplyPrinterChangeNotification(hprinter: PrinterHandle, pdatasrc: COpaquePointer?): Bool =
    0

public actual fun playGdiScriptOnPrinterIC(hprinteric: Handle, pin: COpaquePointer?, cin: UInt, pout: COpaquePointer?, cout: UInt, ul: UInt): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_playGdiScriptOnPrinterIC((hprinteric?.value ?: 0L), (pin?.value ?: 0L), cin.toInt(), (pout?.value ?: 0L), cout.toInt(), ul.toInt())

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
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_registerForPrintAsyncNotifications((pszname?.value ?: 0L), (pnotificationtype?.value ?: 0L), euserfilter, econversationstyle, (pcallback?.value ?: 0L), (phnotify?.value ?: 0L))

public actual fun removePrintDeviceObject(hdeviceobject: Handle): Hresult =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_removePrintDeviceObject((hdeviceobject?.value ?: 0L))

public actual fun replyPrinterChangeNotification(hprinter: PrinterHandle, fdwchangeflags: UInt, pdwresult: COpaquePointer?, pprinternotifyinfo: COpaquePointer?): Bool =
    0

public actual fun replyPrinterChangeNotificationEx(hnotify: Handle, dwcolor: UInt, fdwflags: UInt, pdwresult: COpaquePointer?, pprinternotifyinfo: COpaquePointer?): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_replyPrinterChangeNotificationEx((hnotify?.value ?: 0L), dwcolor.toInt(), fdwflags.toInt(), (pdwresult?.value ?: 0L), (pprinternotifyinfo?.value ?: 0L))

public actual fun reportJobProcessingProgress(printerhandle: Handle, jobid: UInt, joboperation: EPrintXPSJobOperation, jobprogress: EPrintXPSJobProgress): Hresult =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_reportJobProcessingProgress((printerhandle?.value ?: 0L), jobid.toInt(), joboperation, jobprogress)

public actual fun resetPrinterA(hprinter: PrinterHandle, pdefault: COpaquePointer?): Bool =
    0

public actual fun resetPrinterW(hprinter: PrinterHandle, pdefault: COpaquePointer?): Bool =
    0

public actual fun revertToPrinterSelf(): Handle =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_revertToPrinterSelf().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun routerAllocBidiMem(numbytes: ULong): COpaquePointer? =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_routerAllocBidiMem(numbytes.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun routerAllocBidiResponseContainer(count: UInt): COpaquePointer? =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_routerAllocBidiResponseContainer(count.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun routerAllocPrinterNotifyInfo(cprinternotifyinfodata: UInt): COpaquePointer? =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_routerAllocPrinterNotifyInfo(cprinternotifyinfodata.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun routerFreeBidiMem(pmempointer: COpaquePointer?) {
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_routerFreeBidiMem((pmempointer?.value ?: 0L))
}

public actual fun routerFreeBidiResponseContainer(pdata: COpaquePointer?): UInt =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_routerFreeBidiResponseContainer((pdata?.value ?: 0L)).toUInt()

public actual fun routerFreePrinterNotifyInfo(pinfo: COpaquePointer?): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_routerFreePrinterNotifyInfo((pinfo?.value ?: 0L))

public actual fun scheduleJob(hprinter: PrinterHandle, jobid: UInt): Bool =
    0

public actual fun setCPSUIUserData(hdlg: Hwnd, cpsuiuserdata: ULong): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_setCPSUIUserData((hdlg?.value ?: 0L), cpsuiuserdata.toLong())

public actual fun setDefaultPrinterA(pszprinter: Pcstr): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_setDefaultPrinterA((pszprinter?.value ?: 0L))

public actual fun setDefaultPrinterW(pszprinter: Pcwstr): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_setDefaultPrinterW((pszprinter?.value ?: 0L))

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
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_setPortA((pname?.value ?: 0L), (pportname?.value ?: 0L), dwlevel.toInt(), (pportinfo?.value ?: 0L))

public actual fun setPortW(pname: Pcwstr, pportname: Pcwstr, dwlevel: UInt, pportinfo: COpaquePointer?): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_setPortW((pname?.value ?: 0L), (pportname?.value ?: 0L), dwlevel.toInt(), (pportinfo?.value ?: 0L))

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
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_spoolerCopyFileEvent((pszprintername?.value ?: 0L), (pszkey?.value ?: 0L), dwcopyfileevent.toInt())

public actual fun spoolerFindClosePrinterChangeNotification(hprinter: PrinterHandle): Bool =
    0

public actual fun spoolerFindFirstPrinterChangeNotification(hprinter: PrinterHandle, fdwfilterflags: UInt, fdwoptions: UInt, pprinternotifyoptions: COpaquePointer?, pvreserved: COpaquePointer?, pnotificationconfig: COpaquePointer?, phnotify: COpaquePointer?, phevent: COpaquePointer?): Bool =
    0

public actual fun spoolerFindNextPrinterChangeNotification(hprinter: PrinterHandle, pfdwchange: COpaquePointer?, pprinternotifyoptions: COpaquePointer?, ppprinternotifyinfo: COpaquePointer?): Bool =
    0

public actual fun spoolerFreePrinterNotifyInfo(pinfo: COpaquePointer?) {
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_spoolerFreePrinterNotifyInfo((pinfo?.value ?: 0L))
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
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_unRegisterForPrintAsyncNotifications((param0?.value ?: 0L))

public actual fun updatePrintDeviceObject(hprinter: PrinterHandle, hdeviceobject: Handle): Hresult =
    0

public actual fun uploadPrinterDriverPackageA(pszserver: Pcstr, pszinfpath: Pcstr, pszenvironment: Pcstr, dwflags: UInt, hwnd: Hwnd, pszdestinfpath: Pstr, pcchdestinfpath: COpaquePointer?): Hresult =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_uploadPrinterDriverPackageA((pszserver?.value ?: 0L), (pszinfpath?.value ?: 0L), (pszenvironment?.value ?: 0L), dwflags.toInt(), (hwnd?.value ?: 0L), (pszdestinfpath?.value ?: 0L), (pcchdestinfpath?.value ?: 0L))

public actual fun uploadPrinterDriverPackageW(pszserver: Pcwstr, pszinfpath: Pcwstr, pszenvironment: Pcwstr, dwflags: UInt, hwnd: Hwnd, pszdestinfpath: Pwstr, pcchdestinfpath: COpaquePointer?): Hresult =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_uploadPrinterDriverPackageW((pszserver?.value ?: 0L), (pszinfpath?.value ?: 0L), (pszenvironment?.value ?: 0L), dwflags.toInt(), (hwnd?.value ?: 0L), (pszdestinfpath?.value ?: 0L), (pcchdestinfpath?.value ?: 0L))

public actual fun waitForPrinterChange(hprinter: PrinterHandle, flags: UInt): UInt =
    0u

public actual fun writePrinter(hprinter: PrinterHandle, pbuf: COpaquePointer?, cbbuf: UInt, pcwritten: COpaquePointer?): Bool =
    0

public actual fun xcvDataW(hxcv: Handle, pszdataname: Pcwstr, pinputdata: COpaquePointer?, cbinputdata: UInt, poutputdata: COpaquePointer?, cboutputdata: UInt, pcboutputneeded: COpaquePointer?, pdwstatus: COpaquePointer?): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_xcvDataW((hxcv?.value ?: 0L), (pszdataname?.value ?: 0L), (pinputdata?.value ?: 0L), cbinputdata.toInt(), (poutputdata?.value ?: 0L), cboutputdata.toInt(), (pcboutputneeded?.value ?: 0L), (pdwstatus?.value ?: 0L))
