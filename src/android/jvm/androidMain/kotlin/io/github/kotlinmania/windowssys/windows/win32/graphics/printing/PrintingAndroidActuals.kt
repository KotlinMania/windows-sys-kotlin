@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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
import io.github.kotlinmania.windowssys.windows.win32.storage.xps.Docinfow

private object WindowsWin32GraphicsPrintingJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingAddMonitorA(pname: Long, level: Int, pmonitors: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingAddMonitorW(pname: Long, level: Int, pmonitors: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingAddPortA(pname: Long, hwnd: Long, pmonitorname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingAddPortW(pname: Long, hwnd: Long, pmonitorname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingAddPrintProcessorA(pname: Long, penvironment: Long, ppathname: Long, pprintprocessorname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingAddPrintProcessorW(pname: Long, penvironment: Long, ppathname: Long, pprintprocessorname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingAddPrintProvidorA(pname: Long, level: Int, pprovidorinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingAddPrintProvidorW(pname: Long, level: Int, pprovidorinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingAddPrinterA(pname: Long, level: Int, pprinter: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingAddPrinterConnection2A(hwnd: Long, pszname: Long, dwlevel: Int, pconnectioninfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingAddPrinterConnection2W(hwnd: Long, pszname: Long, dwlevel: Int, pconnectioninfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingAddPrinterConnectionA(pname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingAddPrinterConnectionW(pname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingAddPrinterDriverA(pname: Long, level: Int, pdriverinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingAddPrinterDriverExA(pname: Long, level: Int, lpbdriverinfo: Long, dwfilecopyflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingAddPrinterDriverExW(pname: Long, level: Int, lpbdriverinfo: Long, dwfilecopyflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingAddPrinterDriverW(pname: Long, level: Int, pdriverinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingAddPrinterW(pname: Long, level: Int, pprinter: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingAppendPrinterNotifyInfoData(pinfodest: Long, pdatasrc: Long, fdwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingCallRouterFindFirstPrinterChangeNotification(hprinterrpc: Long, fdwfilterflags: Int, fdwoptions: Int, hnotify: Long, pprinternotifyoptions: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingCommonPropertySheetUIA(hwndowner: Long, pfnpropsheetui: Long, lparam: Long, presult: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingCommonPropertySheetUIW(hwndowner: Long, pfnpropsheetui: Long, lparam: Long, presult: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingConfigurePortA(pname: Long, hwnd: Long, pportname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingConfigurePortW(pname: Long, hwnd: Long, pportname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingConnectToPrinterDlg(hwnd: Long, flags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingCreatePrintAsyncNotifyChannel(pszname: Long, pnotificationtype: Long, euserfilter: Int, econversationstyle: Int, pcallback: Long, ppiasynchnotification: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingDeleteMonitorA(pname: Long, penvironment: Long, pmonitorname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingDeleteMonitorW(pname: Long, penvironment: Long, pmonitorname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingDeletePortA(pname: Long, hwnd: Long, pportname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingDeletePortW(pname: Long, hwnd: Long, pportname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingDeletePrintProcessorA(pname: Long, penvironment: Long, pprintprocessorname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingDeletePrintProcessorW(pname: Long, penvironment: Long, pprintprocessorname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingDeletePrintProvidorA(pname: Long, penvironment: Long, pprintprovidorname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingDeletePrintProvidorW(pname: Long, penvironment: Long, pprintprovidorname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingDeletePrinterConnectionA(pname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingDeletePrinterConnectionW(pname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingDeletePrinterDriverA(pname: Long, penvironment: Long, pdrivername: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingDeletePrinterDriverExA(pname: Long, penvironment: Long, pdrivername: Long, dwdeleteflag: Int, dwversionflag: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingDeletePrinterDriverExW(pname: Long, penvironment: Long, pdrivername: Long, dwdeleteflag: Int, dwversionflag: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingDeletePrinterDriverPackageA(pszserver: Long, pszinfpath: Long, pszenvironment: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingDeletePrinterDriverPackageW(pszserver: Long, pszinfpath: Long, pszenvironment: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingDeletePrinterDriverW(pname: Long, penvironment: Long, pdrivername: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingDeletePrinterIC(hprinteric: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingDevQueryPrintEx(pdqpinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingEnumMonitorsA(pname: Long, level: Int, pmonitor: Long, cbbuf: Int, pcbneeded: Long, pcreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingEnumMonitorsW(pname: Long, level: Int, pmonitor: Long, cbbuf: Int, pcbneeded: Long, pcreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingEnumPortsA(pname: Long, level: Int, pport: Long, cbbuf: Int, pcbneeded: Long, pcreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingEnumPortsW(pname: Long, level: Int, pport: Long, cbbuf: Int, pcbneeded: Long, pcreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingEnumPrintProcessorDatatypesA(pname: Long, pprintprocessorname: Long, level: Int, pdatatypes: Long, cbbuf: Int, pcbneeded: Long, pcreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingEnumPrintProcessorDatatypesW(pname: Long, pprintprocessorname: Long, level: Int, pdatatypes: Long, cbbuf: Int, pcbneeded: Long, pcreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingEnumPrintProcessorsA(pname: Long, penvironment: Long, level: Int, pprintprocessorinfo: Long, cbbuf: Int, pcbneeded: Long, pcreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingEnumPrintProcessorsW(pname: Long, penvironment: Long, level: Int, pprintprocessorinfo: Long, cbbuf: Int, pcbneeded: Long, pcreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingEnumPrinterDriversA(pname: Long, penvironment: Long, level: Int, pdriverinfo: Long, cbbuf: Int, pcbneeded: Long, pcreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingEnumPrinterDriversW(pname: Long, penvironment: Long, level: Int, pdriverinfo: Long, cbbuf: Int, pcbneeded: Long, pcreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingEnumPrintersA(flags: Int, name: Long, level: Int, pprinterenum: Long, cbbuf: Int, pcbneeded: Long, pcreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingEnumPrintersW(flags: Int, name: Long, level: Int, pprinterenum: Long, cbbuf: Int, pcbneeded: Long, pcreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingExtDeviceMode(hwnd: Long, hinst: Long, pdevmodeoutput: Long, pdevicename: Long, pport: Long, pdevmodeinput: Long, pprofile: Long, fmode: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingFindClosePrinterChangeNotification(hchange: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingFindNextPrinterChangeNotification(hchange: Long, pdwchange: Long, pvreserved: Long, ppprinternotifyinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingFreePrintNamedPropertyArray(cproperties: Int, ppproperties: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingFreePrintPropertyValue(pvalue: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingFreePrinterNotifyInfo(pprinternotifyinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingGdiDeleteSpoolFileHandle(spoolfilehandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingGdiEndDocEMF(spoolfilehandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingGdiEndPageEMF(spoolfilehandle: Long, dwoptimization: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingGdiGetDC(spoolfilehandle: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingGdiGetDevmodeForPage(spoolfilehandle: Long, dwpagenumber: Int, pcurrdm: Long, plastdm: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingGdiGetPageCount(spoolfilehandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingGdiGetPageHandle(spoolfilehandle: Long, page: Int, pdwpagetype: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingGdiGetSpoolFileHandle(pwszprintername: Long, pdevmode: Long, pwszdocname: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingGdiPlayPageEMF(spoolfilehandle: Long, hemf: Long, prectdocument: Long, prectborder: Long, prectclip: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingGdiResetDCEMF(spoolfilehandle: Long, pcurrdm: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingGdiStartDocEMF(spoolfilehandle: Long, pdocinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingGdiStartPageEMF(spoolfilehandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingGenerateCopyFilePaths(pszprintername: Long, pszdirectory: Long, psplclientinfo: Long, dwlevel: Int, pszsourcedir: Long, pcchsourcedirsize: Long, psztargetdir: Long, pcchtargetdirsize: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingGetCPSUIUserData(hdlg: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingGetCorePrinterDriversA(pszserver: Long, pszenvironment: Long, pszzcoredriverdependencies: Long, ccoreprinterdrivers: Int, pcoreprinterdrivers: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingGetCorePrinterDriversW(pszserver: Long, pszenvironment: Long, pszzcoredriverdependencies: Long, ccoreprinterdrivers: Int, pcoreprinterdrivers: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingGetDefaultPrinterA(pszbuffer: Long, pcchbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingGetDefaultPrinterW(pszbuffer: Long, pcchbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingGetJobAttributes(pprintername: Long, pdevmode: Long, pattributeinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingGetJobAttributesEx(pprintername: Long, pdevmode: Long, dwlevel: Int, pattributeinfo: Long, nsize: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingGetPrintExecutionData(pdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingGetPrintOutputInfo(hwnd: Long, pszprinter: Long, phfile: Long, ppszoutputfile: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingGetPrintProcessorDirectoryA(pname: Long, penvironment: Long, level: Int, pprintprocessorinfo: Long, cbbuf: Int, pcbneeded: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingGetPrintProcessorDirectoryW(pname: Long, penvironment: Long, level: Int, pprintprocessorinfo: Long, cbbuf: Int, pcbneeded: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingGetPrinterDriverDirectoryA(pname: Long, penvironment: Long, level: Int, pdriverdirectory: Long, cbbuf: Int, pcbneeded: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingGetPrinterDriverDirectoryW(pname: Long, penvironment: Long, level: Int, pdriverdirectory: Long, cbbuf: Int, pcbneeded: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingGetPrinterDriverPackagePathA(pszserver: Long, pszenvironment: Long, pszlanguage: Long, pszpackageid: Long, pszdriverpackagecab: Long, cchdriverpackagecab: Int, pcchrequiredsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingGetPrinterDriverPackagePathW(pszserver: Long, pszenvironment: Long, pszlanguage: Long, pszpackageid: Long, pszdriverpackagecab: Long, cchdriverpackagecab: Int, pcchrequiredsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingImpersonatePrinterClient(htoken: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingInstallPrinterDriverFromPackageA(pszserver: Long, pszinfpath: Long, pszdrivername: Long, pszenvironment: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingInstallPrinterDriverFromPackageW(pszserver: Long, pszinfpath: Long, pszdrivername: Long, pszenvironment: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingIsValidDevmodeA(pdevmode: Long, devmodesize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingIsValidDevmodeW(pdevmode: Long, devmodesize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingOpenPrinter2A(pprintername: Long, phprinter: Long, pdefault: Long, poptions: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingOpenPrinter2W(pprintername: Long, phprinter: Long, pdefault: Long, poptions: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingOpenPrinterA(pprintername: Long, phprinter: Long, pdefault: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingOpenPrinterW(pprintername: Long, phprinter: Long, pdefault: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingPlayGdiScriptOnPrinterIC(hprinteric: Long, pin: Long, cin: Int, pout: Long, cout: Int, ul: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingRegisterForPrintAsyncNotifications(pszname: Long, pnotificationtype: Long, euserfilter: Int, econversationstyle: Int, pcallback: Long, phnotify: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingRemovePrintDeviceObject(hdeviceobject: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingReplyPrinterChangeNotificationEx(hnotify: Long, dwcolor: Int, fdwflags: Int, pdwresult: Long, pprinternotifyinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingReportJobProcessingProgress(printerhandle: Long, jobid: Int, joboperation: Int, jobprogress: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingRevertToPrinterSelf(): Long

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingRouterAllocBidiMem(numbytes: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingRouterAllocBidiResponseContainer(count: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingRouterAllocPrinterNotifyInfo(cprinternotifyinfodata: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingRouterFreeBidiMem(pmempointer: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingRouterFreeBidiResponseContainer(pdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingRouterFreePrinterNotifyInfo(pinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingSetCPSUIUserData(hdlg: Long, cpsuiuserdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingSetDefaultPrinterA(pszprinter: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingSetDefaultPrinterW(pszprinter: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingSetPortA(pname: Long, pportname: Long, dwlevel: Int, pportinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingSetPortW(pname: Long, pportname: Long, dwlevel: Int, pportinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingSpoolerCopyFileEvent(pszprintername: Long, pszkey: Long, dwcopyfileevent: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingSpoolerFreePrinterNotifyInfo(pinfo: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingUnRegisterForPrintAsyncNotifications(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingUploadPrinterDriverPackageA(pszserver: Long, pszinfpath: Long, pszenvironment: Long, dwflags: Int, hwnd: Long, pszdestinfpath: Long, pcchdestinfpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingUploadPrinterDriverPackageW(pszserver: Long, pszinfpath: Long, pszenvironment: Long, dwflags: Int, hwnd: Long, pszdestinfpath: Long, pcchdestinfpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsPrintingXcvDataW(hxcv: Long, pszdataname: Long, pinputdata: Long, cbinputdata: Int, poutputdata: Long, cboutputdata: Int, pcboutputneeded: Long, pdwstatus: Long): Int
}

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
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingAddMonitorA(pname.rawAddress, level.toInt(), pmonitors.rawAddress)

public actual fun addMonitorW(pname: Pcwstr, level: UInt, pmonitors: ConstPtr<UByte>): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingAddMonitorW(pname.rawAddress, level.toInt(), pmonitors.rawAddress)

public actual fun addPortA(pname: Pcstr, hwnd: Hwnd, pmonitorname: Pcstr): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingAddPortA(pname.rawAddress, hwnd.rawAddress, pmonitorname.rawAddress)

public actual fun addPortW(pname: Pcwstr, hwnd: Hwnd, pmonitorname: Pcwstr): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingAddPortW(pname.rawAddress, hwnd.rawAddress, pmonitorname.rawAddress)

public actual fun addPrintDeviceObject(hprinter: PrinterHandle, phdeviceobject: MutPtr<Handle>): Hresult =
    0

public actual fun addPrintProcessorA(pname: Pcstr, penvironment: Pcstr, ppathname: Pcstr, pprintprocessorname: Pcstr): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingAddPrintProcessorA(pname.rawAddress, penvironment.rawAddress, ppathname.rawAddress, pprintprocessorname.rawAddress)

public actual fun addPrintProcessorW(pname: Pcwstr, penvironment: Pcwstr, ppathname: Pcwstr, pprintprocessorname: Pcwstr): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingAddPrintProcessorW(pname.rawAddress, penvironment.rawAddress, ppathname.rawAddress, pprintprocessorname.rawAddress)

public actual fun addPrintProvidorA(pname: Pcstr, level: UInt, pprovidorinfo: ConstPtr<UByte>): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingAddPrintProvidorA(pname.rawAddress, level.toInt(), pprovidorinfo.rawAddress)

public actual fun addPrintProvidorW(pname: Pcwstr, level: UInt, pprovidorinfo: ConstPtr<UByte>): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingAddPrintProvidorW(pname.rawAddress, level.toInt(), pprovidorinfo.rawAddress)

public actual fun addPrinterA(pname: Pcstr, level: UInt, pprinter: ConstPtr<UByte>): Handle =
    MutPtr(WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingAddPrinterA(pname.rawAddress, level.toInt(), pprinter.rawAddress))

public actual fun addPrinterConnection2A(hwnd: Hwnd, pszname: Pcstr, dwlevel: UInt, pconnectioninfo: ConstPtr<CVoid>): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingAddPrinterConnection2A(hwnd.rawAddress, pszname.rawAddress, dwlevel.toInt(), pconnectioninfo.rawAddress)

public actual fun addPrinterConnection2W(hwnd: Hwnd, pszname: Pcwstr, dwlevel: UInt, pconnectioninfo: ConstPtr<CVoid>): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingAddPrinterConnection2W(hwnd.rawAddress, pszname.rawAddress, dwlevel.toInt(), pconnectioninfo.rawAddress)

public actual fun addPrinterConnectionA(pname: Pcstr): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingAddPrinterConnectionA(pname.rawAddress)

public actual fun addPrinterConnectionW(pname: Pcwstr): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingAddPrinterConnectionW(pname.rawAddress)

public actual fun addPrinterDriverA(pname: Pcstr, level: UInt, pdriverinfo: ConstPtr<UByte>): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingAddPrinterDriverA(pname.rawAddress, level.toInt(), pdriverinfo.rawAddress)

public actual fun addPrinterDriverExA(pname: Pcstr, level: UInt, lpbdriverinfo: ConstPtr<UByte>, dwfilecopyflags: UInt): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingAddPrinterDriverExA(pname.rawAddress, level.toInt(), lpbdriverinfo.rawAddress, dwfilecopyflags.toInt())

public actual fun addPrinterDriverExW(pname: Pcwstr, level: UInt, lpbdriverinfo: ConstPtr<UByte>, dwfilecopyflags: UInt): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingAddPrinterDriverExW(pname.rawAddress, level.toInt(), lpbdriverinfo.rawAddress, dwfilecopyflags.toInt())

public actual fun addPrinterDriverW(pname: Pcwstr, level: UInt, pdriverinfo: ConstPtr<UByte>): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingAddPrinterDriverW(pname.rawAddress, level.toInt(), pdriverinfo.rawAddress)

public actual fun addPrinterW(pname: Pcwstr, level: UInt, pprinter: ConstPtr<UByte>): Handle =
    MutPtr(WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingAddPrinterW(pname.rawAddress, level.toInt(), pprinter.rawAddress))

public actual fun advancedDocumentPropertiesA(hwnd: Hwnd, hprinter: PrinterHandle, pdevicename: Pcstr, pdevmodeoutput: MutPtr<Devmodea>, pdevmodeinput: ConstPtr<Devmodea>): Int =
    0

public actual fun advancedDocumentPropertiesW(hwnd: Hwnd, hprinter: PrinterHandle, pdevicename: Pcwstr, pdevmodeoutput: MutPtr<Devmodew>, pdevmodeinput: ConstPtr<Devmodew>): Int =
    0

public actual fun appendPrinterNotifyInfoData(pinfodest: ConstPtr<PrinterNotifyInfo>, pdatasrc: ConstPtr<PrinterNotifyInfoData>, fdwflags: UInt): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingAppendPrinterNotifyInfoData(pinfodest.rawAddress, pdatasrc.rawAddress, fdwflags.toInt())

public actual fun callRouterFindFirstPrinterChangeNotification(hprinterrpc: Handle, fdwfilterflags: UInt, fdwoptions: UInt, hnotify: Handle, pprinternotifyoptions: ConstPtr<PrinterNotifyOptions>): UInt =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingCallRouterFindFirstPrinterChangeNotification(hprinterrpc.rawAddress, fdwfilterflags.toInt(), fdwoptions.toInt(), hnotify.rawAddress, pprinternotifyoptions.rawAddress).toUInt()

public actual fun closePrinter(hprinter: PrinterHandle): Bool =
    0

public actual fun closeSpoolFileHandle(hprinter: PrinterHandle, hspoolfile: Handle): Bool =
    0

public actual fun commitSpoolData(hprinter: PrinterHandle, hspoolfile: Handle, cbcommit: UInt): Handle =
    MutPtr(0L)

public actual fun commonPropertySheetUIA(hwndowner: Hwnd, pfnpropsheetui: Pfnpropsheetui, lparam: Lparam, presult: MutPtr<UInt>): Int =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingCommonPropertySheetUIA(hwndowner.rawAddress, 0L, lparam, presult.rawAddress)

public actual fun commonPropertySheetUIW(hwndowner: Hwnd, pfnpropsheetui: Pfnpropsheetui, lparam: Lparam, presult: MutPtr<UInt>): Int =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingCommonPropertySheetUIW(hwndowner.rawAddress, 0L, lparam, presult.rawAddress)

public actual fun configurePortA(pname: Pcstr, hwnd: Hwnd, pportname: Pcstr): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingConfigurePortA(pname.rawAddress, hwnd.rawAddress, pportname.rawAddress)

public actual fun configurePortW(pname: Pcwstr, hwnd: Hwnd, pportname: Pcwstr): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingConfigurePortW(pname.rawAddress, hwnd.rawAddress, pportname.rawAddress)

public actual fun connectToPrinterDlg(hwnd: Hwnd, flags: UInt): Handle =
    MutPtr(WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingConnectToPrinterDlg(hwnd.rawAddress, flags.toInt()))

public actual fun corePrinterDriverInstalledA(pszserver: Pcstr, pszenvironment: Pcstr, coredriverguid: Guid, ftdriverdate: Filetime, dwldriverversion: ULong, pbdriverinstalled: MutPtr<Bool>): Hresult =
    0

public actual fun corePrinterDriverInstalledW(pszserver: Pcwstr, pszenvironment: Pcwstr, coredriverguid: Guid, ftdriverdate: Filetime, dwldriverversion: ULong, pbdriverinstalled: MutPtr<Bool>): Hresult =
    0

public actual fun createPrintAsyncNotifyChannel(pszname: Pcwstr, pnotificationtype: ConstPtr<Guid>, euserfilter: PrintAsyncNotifyUserFilter, econversationstyle: PrintAsyncNotifyConversationStyle, pcallback: MutPtr<CVoid>, ppiasynchnotification: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingCreatePrintAsyncNotifyChannel(pszname.rawAddress, pnotificationtype.rawAddress, euserfilter, econversationstyle, pcallback.rawAddress, ppiasynchnotification.rawAddress)

public actual fun createPrinterIC(hprinter: PrinterHandle, pdevmode: ConstPtr<Devmodew>): Handle =
    MutPtr(0L)

public actual fun deleteFormA(hprinter: PrinterHandle, pformname: Pcstr): Bool =
    0

public actual fun deleteFormW(hprinter: PrinterHandle, pformname: Pcwstr): Bool =
    0

public actual fun deleteJobNamedProperty(hprinter: PrinterHandle, jobid: UInt, pszname: Pcwstr): UInt =
    0u

public actual fun deleteMonitorA(pname: Pcstr, penvironment: Pcstr, pmonitorname: Pcstr): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingDeleteMonitorA(pname.rawAddress, penvironment.rawAddress, pmonitorname.rawAddress)

public actual fun deleteMonitorW(pname: Pcwstr, penvironment: Pcwstr, pmonitorname: Pcwstr): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingDeleteMonitorW(pname.rawAddress, penvironment.rawAddress, pmonitorname.rawAddress)

public actual fun deletePortA(pname: Pcstr, hwnd: Hwnd, pportname: Pcstr): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingDeletePortA(pname.rawAddress, hwnd.rawAddress, pportname.rawAddress)

public actual fun deletePortW(pname: Pcwstr, hwnd: Hwnd, pportname: Pcwstr): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingDeletePortW(pname.rawAddress, hwnd.rawAddress, pportname.rawAddress)

public actual fun deletePrintProcessorA(pname: Pcstr, penvironment: Pcstr, pprintprocessorname: Pcstr): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingDeletePrintProcessorA(pname.rawAddress, penvironment.rawAddress, pprintprocessorname.rawAddress)

public actual fun deletePrintProcessorW(pname: Pcwstr, penvironment: Pcwstr, pprintprocessorname: Pcwstr): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingDeletePrintProcessorW(pname.rawAddress, penvironment.rawAddress, pprintprocessorname.rawAddress)

public actual fun deletePrintProvidorA(pname: Pcstr, penvironment: Pcstr, pprintprovidorname: Pcstr): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingDeletePrintProvidorA(pname.rawAddress, penvironment.rawAddress, pprintprovidorname.rawAddress)

public actual fun deletePrintProvidorW(pname: Pcwstr, penvironment: Pcwstr, pprintprovidorname: Pcwstr): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingDeletePrintProvidorW(pname.rawAddress, penvironment.rawAddress, pprintprovidorname.rawAddress)

public actual fun deletePrinter(hprinter: PrinterHandle): Bool =
    0

public actual fun deletePrinterConnectionA(pname: Pcstr): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingDeletePrinterConnectionA(pname.rawAddress)

public actual fun deletePrinterConnectionW(pname: Pcwstr): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingDeletePrinterConnectionW(pname.rawAddress)

public actual fun deletePrinterDataA(hprinter: PrinterHandle, pvaluename: Pcstr): UInt =
    0u

public actual fun deletePrinterDataExA(hprinter: PrinterHandle, pkeyname: Pcstr, pvaluename: Pcstr): UInt =
    0u

public actual fun deletePrinterDataExW(hprinter: PrinterHandle, pkeyname: Pcwstr, pvaluename: Pcwstr): UInt =
    0u

public actual fun deletePrinterDataW(hprinter: PrinterHandle, pvaluename: Pcwstr): UInt =
    0u

public actual fun deletePrinterDriverA(pname: Pcstr, penvironment: Pcstr, pdrivername: Pcstr): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingDeletePrinterDriverA(pname.rawAddress, penvironment.rawAddress, pdrivername.rawAddress)

public actual fun deletePrinterDriverExA(pname: Pcstr, penvironment: Pcstr, pdrivername: Pcstr, dwdeleteflag: UInt, dwversionflag: UInt): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingDeletePrinterDriverExA(pname.rawAddress, penvironment.rawAddress, pdrivername.rawAddress, dwdeleteflag.toInt(), dwversionflag.toInt())

public actual fun deletePrinterDriverExW(pname: Pcwstr, penvironment: Pcwstr, pdrivername: Pcwstr, dwdeleteflag: UInt, dwversionflag: UInt): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingDeletePrinterDriverExW(pname.rawAddress, penvironment.rawAddress, pdrivername.rawAddress, dwdeleteflag.toInt(), dwversionflag.toInt())

public actual fun deletePrinterDriverPackageA(pszserver: Pcstr, pszinfpath: Pcstr, pszenvironment: Pcstr): Hresult =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingDeletePrinterDriverPackageA(pszserver.rawAddress, pszinfpath.rawAddress, pszenvironment.rawAddress)

public actual fun deletePrinterDriverPackageW(pszserver: Pcwstr, pszinfpath: Pcwstr, pszenvironment: Pcwstr): Hresult =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingDeletePrinterDriverPackageW(pszserver.rawAddress, pszinfpath.rawAddress, pszenvironment.rawAddress)

public actual fun deletePrinterDriverW(pname: Pcwstr, penvironment: Pcwstr, pdrivername: Pcwstr): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingDeletePrinterDriverW(pname.rawAddress, penvironment.rawAddress, pdrivername.rawAddress)

public actual fun deletePrinterIC(hprinteric: Handle): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingDeletePrinterIC(hprinteric.rawAddress)

public actual fun deletePrinterKeyA(hprinter: PrinterHandle, pkeyname: Pcstr): UInt =
    0u

public actual fun deletePrinterKeyW(hprinter: PrinterHandle, pkeyname: Pcwstr): UInt =
    0u

public actual fun devQueryPrint(hprinter: PrinterHandle, pdevmode: ConstPtr<Devmodea>, presid: MutPtr<UInt>): Bool =
    0

public actual fun devQueryPrintEx(pdqpinfo: MutPtr<DevqueryprintInfo>): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingDevQueryPrintEx(pdqpinfo.rawAddress)

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
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingEnumMonitorsA(pname.rawAddress, level.toInt(), pmonitor.rawAddress, cbbuf.toInt(), pcbneeded.rawAddress, pcreturned.rawAddress)

public actual fun enumMonitorsW(pname: Pcwstr, level: UInt, pmonitor: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>, pcreturned: MutPtr<UInt>): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingEnumMonitorsW(pname.rawAddress, level.toInt(), pmonitor.rawAddress, cbbuf.toInt(), pcbneeded.rawAddress, pcreturned.rawAddress)

public actual fun enumPortsA(pname: Pcstr, level: UInt, pport: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>, pcreturned: MutPtr<UInt>): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingEnumPortsA(pname.rawAddress, level.toInt(), pport.rawAddress, cbbuf.toInt(), pcbneeded.rawAddress, pcreturned.rawAddress)

public actual fun enumPortsW(pname: Pcwstr, level: UInt, pport: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>, pcreturned: MutPtr<UInt>): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingEnumPortsW(pname.rawAddress, level.toInt(), pport.rawAddress, cbbuf.toInt(), pcbneeded.rawAddress, pcreturned.rawAddress)

public actual fun enumPrintProcessorDatatypesA(pname: Pcstr, pprintprocessorname: Pcstr, level: UInt, pdatatypes: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>, pcreturned: MutPtr<UInt>): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingEnumPrintProcessorDatatypesA(pname.rawAddress, pprintprocessorname.rawAddress, level.toInt(), pdatatypes.rawAddress, cbbuf.toInt(), pcbneeded.rawAddress, pcreturned.rawAddress)

public actual fun enumPrintProcessorDatatypesW(pname: Pcwstr, pprintprocessorname: Pcwstr, level: UInt, pdatatypes: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>, pcreturned: MutPtr<UInt>): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingEnumPrintProcessorDatatypesW(pname.rawAddress, pprintprocessorname.rawAddress, level.toInt(), pdatatypes.rawAddress, cbbuf.toInt(), pcbneeded.rawAddress, pcreturned.rawAddress)

public actual fun enumPrintProcessorsA(pname: Pcstr, penvironment: Pcstr, level: UInt, pprintprocessorinfo: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>, pcreturned: MutPtr<UInt>): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingEnumPrintProcessorsA(pname.rawAddress, penvironment.rawAddress, level.toInt(), pprintprocessorinfo.rawAddress, cbbuf.toInt(), pcbneeded.rawAddress, pcreturned.rawAddress)

public actual fun enumPrintProcessorsW(pname: Pcwstr, penvironment: Pcwstr, level: UInt, pprintprocessorinfo: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>, pcreturned: MutPtr<UInt>): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingEnumPrintProcessorsW(pname.rawAddress, penvironment.rawAddress, level.toInt(), pprintprocessorinfo.rawAddress, cbbuf.toInt(), pcbneeded.rawAddress, pcreturned.rawAddress)

public actual fun enumPrinterDataA(hprinter: PrinterHandle, dwindex: UInt, pvaluename: Pstr, cbvaluename: UInt, pcbvaluename: MutPtr<UInt>, ptype: MutPtr<UInt>, pdata: MutPtr<UByte>, cbdata: UInt, pcbdata: MutPtr<UInt>): UInt =
    0u

public actual fun enumPrinterDataExA(hprinter: PrinterHandle, pkeyname: Pcstr, penumvalues: MutPtr<UByte>, cbenumvalues: UInt, pcbenumvalues: MutPtr<UInt>, pnenumvalues: MutPtr<UInt>): UInt =
    0u

public actual fun enumPrinterDataExW(hprinter: PrinterHandle, pkeyname: Pcwstr, penumvalues: MutPtr<UByte>, cbenumvalues: UInt, pcbenumvalues: MutPtr<UInt>, pnenumvalues: MutPtr<UInt>): UInt =
    0u

public actual fun enumPrinterDataW(hprinter: PrinterHandle, dwindex: UInt, pvaluename: Pwstr, cbvaluename: UInt, pcbvaluename: MutPtr<UInt>, ptype: MutPtr<UInt>, pdata: MutPtr<UByte>, cbdata: UInt, pcbdata: MutPtr<UInt>): UInt =
    0u

public actual fun enumPrinterDriversA(pname: Pcstr, penvironment: Pcstr, level: UInt, pdriverinfo: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>, pcreturned: MutPtr<UInt>): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingEnumPrinterDriversA(pname.rawAddress, penvironment.rawAddress, level.toInt(), pdriverinfo.rawAddress, cbbuf.toInt(), pcbneeded.rawAddress, pcreturned.rawAddress)

public actual fun enumPrinterDriversW(pname: Pcwstr, penvironment: Pcwstr, level: UInt, pdriverinfo: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>, pcreturned: MutPtr<UInt>): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingEnumPrinterDriversW(pname.rawAddress, penvironment.rawAddress, level.toInt(), pdriverinfo.rawAddress, cbbuf.toInt(), pcbneeded.rawAddress, pcreturned.rawAddress)

public actual fun enumPrinterKeyA(hprinter: PrinterHandle, pkeyname: Pcstr, psubkey: Pstr, cbsubkey: UInt, pcbsubkey: MutPtr<UInt>): UInt =
    0u

public actual fun enumPrinterKeyW(hprinter: PrinterHandle, pkeyname: Pcwstr, psubkey: Pwstr, cbsubkey: UInt, pcbsubkey: MutPtr<UInt>): UInt =
    0u

public actual fun enumPrintersA(flags: UInt, name: Pcstr, level: UInt, pprinterenum: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>, pcreturned: MutPtr<UInt>): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingEnumPrintersA(flags.toInt(), name.rawAddress, level.toInt(), pprinterenum.rawAddress, cbbuf.toInt(), pcbneeded.rawAddress, pcreturned.rawAddress)

public actual fun enumPrintersW(flags: UInt, name: Pcwstr, level: UInt, pprinterenum: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>, pcreturned: MutPtr<UInt>): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingEnumPrintersW(flags.toInt(), name.rawAddress, level.toInt(), pprinterenum.rawAddress, cbbuf.toInt(), pcbneeded.rawAddress, pcreturned.rawAddress)

public actual fun extDeviceMode(hwnd: Hwnd, hinst: Handle, pdevmodeoutput: MutPtr<Devmodea>, pdevicename: Pcstr, pport: Pcstr, pdevmodeinput: ConstPtr<Devmodea>, pprofile: Pcstr, fmode: UInt): Int =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingExtDeviceMode(hwnd.rawAddress, hinst.rawAddress, pdevmodeoutput.rawAddress, pdevicename.rawAddress, pport.rawAddress, pdevmodeinput.rawAddress, pprofile.rawAddress, fmode.toInt())

public actual fun findClosePrinterChangeNotification(hchange: Handle): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingFindClosePrinterChangeNotification(hchange.rawAddress)

public actual fun findFirstPrinterChangeNotification(hprinter: PrinterHandle, fdwfilter: UInt, fdwoptions: UInt, pprinternotifyoptions: ConstPtr<CVoid>): Handle =
    MutPtr(0L)

public actual fun findNextPrinterChangeNotification(hchange: Handle, pdwchange: MutPtr<UInt>, pvreserved: ConstPtr<CVoid>, ppprinternotifyinfo: MutPtr<MutPtr<CVoid>>): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingFindNextPrinterChangeNotification(hchange.rawAddress, pdwchange.rawAddress, pvreserved.rawAddress, ppprinternotifyinfo.rawAddress)

public actual fun flushPrinter(hprinter: PrinterHandle, pbuf: ConstPtr<CVoid>, cbbuf: UInt, pcwritten: MutPtr<UInt>, csleep: UInt): Bool =
    0

public actual fun freePrintNamedPropertyArray(cproperties: UInt, ppproperties: MutPtr<MutPtr<PrintNamedProperty>>) {
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingFreePrintNamedPropertyArray(cproperties.toInt(), ppproperties.rawAddress)
}

public actual fun freePrintPropertyValue(pvalue: MutPtr<PrintPropertyValue>) {
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingFreePrintPropertyValue(pvalue.rawAddress)
}

public actual fun freePrinterNotifyInfo(pprinternotifyinfo: ConstPtr<PrinterNotifyInfo>): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingFreePrinterNotifyInfo(pprinternotifyinfo.rawAddress)

public actual fun gdiDeleteSpoolFileHandle(spoolfilehandle: Handle): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingGdiDeleteSpoolFileHandle(spoolfilehandle.rawAddress)

public actual fun gdiEndDocEMF(spoolfilehandle: Handle): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingGdiEndDocEMF(spoolfilehandle.rawAddress)

public actual fun gdiEndPageEMF(spoolfilehandle: Handle, dwoptimization: UInt): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingGdiEndPageEMF(spoolfilehandle.rawAddress, dwoptimization.toInt())

public actual fun gdiGetDC(spoolfilehandle: Handle): Hdc =
    MutPtr(WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingGdiGetDC(spoolfilehandle.rawAddress))

public actual fun gdiGetDevmodeForPage(spoolfilehandle: Handle, dwpagenumber: UInt, pcurrdm: MutPtr<MutPtr<Devmodew>>, plastdm: MutPtr<MutPtr<Devmodew>>): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingGdiGetDevmodeForPage(spoolfilehandle.rawAddress, dwpagenumber.toInt(), pcurrdm.rawAddress, plastdm.rawAddress)

public actual fun gdiGetPageCount(spoolfilehandle: Handle): UInt =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingGdiGetPageCount(spoolfilehandle.rawAddress).toUInt()

public actual fun gdiGetPageHandle(spoolfilehandle: Handle, page: UInt, pdwpagetype: MutPtr<UInt>): Handle =
    MutPtr(WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingGdiGetPageHandle(spoolfilehandle.rawAddress, page.toInt(), pdwpagetype.rawAddress))

public actual fun gdiGetSpoolFileHandle(pwszprintername: Pcwstr, pdevmode: MutPtr<Devmodew>, pwszdocname: Pcwstr): Handle =
    MutPtr(WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingGdiGetSpoolFileHandle(pwszprintername.rawAddress, pdevmode.rawAddress, pwszdocname.rawAddress))

public actual fun gdiPlayPageEMF(spoolfilehandle: Handle, hemf: Handle, prectdocument: MutPtr<Rect>, prectborder: MutPtr<Rect>, prectclip: MutPtr<Rect>): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingGdiPlayPageEMF(spoolfilehandle.rawAddress, hemf.rawAddress, prectdocument.rawAddress, prectborder.rawAddress, prectclip.rawAddress)

public actual fun gdiResetDCEMF(spoolfilehandle: Handle, pcurrdm: MutPtr<Devmodew>): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingGdiResetDCEMF(spoolfilehandle.rawAddress, pcurrdm.rawAddress)

public actual fun gdiStartDocEMF(spoolfilehandle: Handle, pdocinfo: MutPtr<Docinfow>): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingGdiStartDocEMF(spoolfilehandle.rawAddress, pdocinfo.rawAddress)

public actual fun gdiStartPageEMF(spoolfilehandle: Handle): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingGdiStartPageEMF(spoolfilehandle.rawAddress)

public actual fun generateCopyFilePaths(pszprintername: Pcwstr, pszdirectory: Pcwstr, psplclientinfo: ConstPtr<UByte>, dwlevel: UInt, pszsourcedir: Pwstr, pcchsourcedirsize: MutPtr<UInt>, psztargetdir: Pwstr, pcchtargetdirsize: MutPtr<UInt>, dwflags: UInt): UInt =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingGenerateCopyFilePaths(pszprintername.rawAddress, pszdirectory.rawAddress, psplclientinfo.rawAddress, dwlevel.toInt(), pszsourcedir.rawAddress, pcchsourcedirsize.rawAddress, psztargetdir.rawAddress, pcchtargetdirsize.rawAddress, dwflags.toInt()).toUInt()

public actual fun getCPSUIUserData(hdlg: Hwnd): ULong =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingGetCPSUIUserData(hdlg.rawAddress).toULong()

public actual fun getCorePrinterDriversA(pszserver: Pcstr, pszenvironment: Pcstr, pszzcoredriverdependencies: Pcstr, ccoreprinterdrivers: UInt, pcoreprinterdrivers: MutPtr<CorePrinterDrivera>): Hresult =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingGetCorePrinterDriversA(pszserver.rawAddress, pszenvironment.rawAddress, pszzcoredriverdependencies.rawAddress, ccoreprinterdrivers.toInt(), pcoreprinterdrivers.rawAddress)

public actual fun getCorePrinterDriversW(pszserver: Pcwstr, pszenvironment: Pcwstr, pszzcoredriverdependencies: Pcwstr, ccoreprinterdrivers: UInt, pcoreprinterdrivers: MutPtr<CorePrinterDriverw>): Hresult =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingGetCorePrinterDriversW(pszserver.rawAddress, pszenvironment.rawAddress, pszzcoredriverdependencies.rawAddress, ccoreprinterdrivers.toInt(), pcoreprinterdrivers.rawAddress)

public actual fun getDefaultPrinterA(pszbuffer: Pstr, pcchbuffer: MutPtr<UInt>): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingGetDefaultPrinterA(pszbuffer.rawAddress, pcchbuffer.rawAddress)

public actual fun getDefaultPrinterW(pszbuffer: Pwstr, pcchbuffer: MutPtr<UInt>): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingGetDefaultPrinterW(pszbuffer.rawAddress, pcchbuffer.rawAddress)

public actual fun getFormA(hprinter: PrinterHandle, pformname: Pcstr, level: UInt, pform: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>): Bool =
    0

public actual fun getFormW(hprinter: PrinterHandle, pformname: Pcwstr, level: UInt, pform: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>): Bool =
    0

public actual fun getJobA(hprinter: PrinterHandle, jobid: UInt, level: UInt, pjob: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>): Bool =
    0

public actual fun getJobAttributes(pprintername: Pcwstr, pdevmode: ConstPtr<Devmodew>, pattributeinfo: MutPtr<AttributeInfo3>): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingGetJobAttributes(pprintername.rawAddress, pdevmode.rawAddress, pattributeinfo.rawAddress)

public actual fun getJobAttributesEx(pprintername: Pcwstr, pdevmode: ConstPtr<Devmodew>, dwlevel: UInt, pattributeinfo: MutPtr<UByte>, nsize: UInt, dwflags: UInt): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingGetJobAttributesEx(pprintername.rawAddress, pdevmode.rawAddress, dwlevel.toInt(), pattributeinfo.rawAddress, nsize.toInt(), dwflags.toInt())

public actual fun getJobNamedPropertyValue(hprinter: PrinterHandle, jobid: UInt, pszname: Pcwstr, pvalue: MutPtr<PrintPropertyValue>): UInt =
    0u

public actual fun getJobW(hprinter: PrinterHandle, jobid: UInt, level: UInt, pjob: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>): Bool =
    0

public actual fun getPrintExecutionData(pdata: MutPtr<PrintExecutionData>): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingGetPrintExecutionData(pdata.rawAddress)

public actual fun getPrintOutputInfo(hwnd: Hwnd, pszprinter: Pcwstr, phfile: MutPtr<Handle>, ppszoutputfile: MutPtr<Pwstr>): Hresult =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingGetPrintOutputInfo(hwnd.rawAddress, pszprinter.rawAddress, phfile.rawAddress, ppszoutputfile.rawAddress)

public actual fun getPrintProcessorDirectoryA(pname: Pcstr, penvironment: Pcstr, level: UInt, pprintprocessorinfo: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingGetPrintProcessorDirectoryA(pname.rawAddress, penvironment.rawAddress, level.toInt(), pprintprocessorinfo.rawAddress, cbbuf.toInt(), pcbneeded.rawAddress)

public actual fun getPrintProcessorDirectoryW(pname: Pcwstr, penvironment: Pcwstr, level: UInt, pprintprocessorinfo: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingGetPrintProcessorDirectoryW(pname.rawAddress, penvironment.rawAddress, level.toInt(), pprintprocessorinfo.rawAddress, cbbuf.toInt(), pcbneeded.rawAddress)

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
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingGetPrinterDriverDirectoryA(pname.rawAddress, penvironment.rawAddress, level.toInt(), pdriverdirectory.rawAddress, cbbuf.toInt(), pcbneeded.rawAddress)

public actual fun getPrinterDriverDirectoryW(pname: Pcwstr, penvironment: Pcwstr, level: UInt, pdriverdirectory: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingGetPrinterDriverDirectoryW(pname.rawAddress, penvironment.rawAddress, level.toInt(), pdriverdirectory.rawAddress, cbbuf.toInt(), pcbneeded.rawAddress)

public actual fun getPrinterDriverPackagePathA(pszserver: Pcstr, pszenvironment: Pcstr, pszlanguage: Pcstr, pszpackageid: Pcstr, pszdriverpackagecab: Pstr, cchdriverpackagecab: UInt, pcchrequiredsize: MutPtr<UInt>): Hresult =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingGetPrinterDriverPackagePathA(pszserver.rawAddress, pszenvironment.rawAddress, pszlanguage.rawAddress, pszpackageid.rawAddress, pszdriverpackagecab.rawAddress, cchdriverpackagecab.toInt(), pcchrequiredsize.rawAddress)

public actual fun getPrinterDriverPackagePathW(pszserver: Pcwstr, pszenvironment: Pcwstr, pszlanguage: Pcwstr, pszpackageid: Pcwstr, pszdriverpackagecab: Pwstr, cchdriverpackagecab: UInt, pcchrequiredsize: MutPtr<UInt>): Hresult =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingGetPrinterDriverPackagePathW(pszserver.rawAddress, pszenvironment.rawAddress, pszlanguage.rawAddress, pszpackageid.rawAddress, pszdriverpackagecab.rawAddress, cchdriverpackagecab.toInt(), pcchrequiredsize.rawAddress)

public actual fun getPrinterDriverW(hprinter: PrinterHandle, penvironment: Pcwstr, level: UInt, pdriverinfo: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>): Bool =
    0

public actual fun getPrinterW(hprinter: PrinterHandle, level: UInt, pprinter: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>): Bool =
    0

public actual fun getSpoolFileHandle(hprinter: PrinterHandle): Handle =
    MutPtr(0L)

public actual fun impersonatePrinterClient(htoken: Handle): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingImpersonatePrinterClient(htoken.rawAddress)

public actual fun installPrinterDriverFromPackageA(pszserver: Pcstr, pszinfpath: Pcstr, pszdrivername: Pcstr, pszenvironment: Pcstr, dwflags: UInt): Hresult =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingInstallPrinterDriverFromPackageA(pszserver.rawAddress, pszinfpath.rawAddress, pszdrivername.rawAddress, pszenvironment.rawAddress, dwflags.toInt())

public actual fun installPrinterDriverFromPackageW(pszserver: Pcwstr, pszinfpath: Pcwstr, pszdrivername: Pcwstr, pszenvironment: Pcwstr, dwflags: UInt): Hresult =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingInstallPrinterDriverFromPackageW(pszserver.rawAddress, pszinfpath.rawAddress, pszdrivername.rawAddress, pszenvironment.rawAddress, dwflags.toInt())

public actual fun isValidDevmodeA(pdevmode: ConstPtr<Devmodea>, devmodesize: ULong): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingIsValidDevmodeA(pdevmode.rawAddress, devmodesize.toLong())

public actual fun isValidDevmodeW(pdevmode: ConstPtr<Devmodew>, devmodesize: ULong): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingIsValidDevmodeW(pdevmode.rawAddress, devmodesize.toLong())

public actual fun openPrinter2A(pprintername: Pcstr, phprinter: MutPtr<PrinterHandle>, pdefault: ConstPtr<PrinterDefaultsa>, poptions: ConstPtr<PrinterOptionsa>): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingOpenPrinter2A(pprintername.rawAddress, phprinter.rawAddress, pdefault.rawAddress, poptions.rawAddress)

public actual fun openPrinter2W(pprintername: Pcwstr, phprinter: MutPtr<PrinterHandle>, pdefault: ConstPtr<PrinterDefaultsw>, poptions: ConstPtr<PrinterOptionsw>): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingOpenPrinter2W(pprintername.rawAddress, phprinter.rawAddress, pdefault.rawAddress, poptions.rawAddress)

public actual fun openPrinterA(pprintername: Pcstr, phprinter: MutPtr<PrinterHandle>, pdefault: ConstPtr<PrinterDefaultsa>): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingOpenPrinterA(pprintername.rawAddress, phprinter.rawAddress, pdefault.rawAddress)

public actual fun openPrinterW(pprintername: Pcwstr, phprinter: MutPtr<PrinterHandle>, pdefault: ConstPtr<PrinterDefaultsw>): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingOpenPrinterW(pprintername.rawAddress, phprinter.rawAddress, pdefault.rawAddress)

public actual fun partialReplyPrinterChangeNotification(hprinter: PrinterHandle, pdatasrc: ConstPtr<PrinterNotifyInfoData>): Bool =
    0

public actual fun playGdiScriptOnPrinterIC(hprinteric: Handle, pin: ConstPtr<UByte>, cin: UInt, pout: MutPtr<UByte>, cout: UInt, ul: UInt): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingPlayGdiScriptOnPrinterIC(hprinteric.rawAddress, pin.rawAddress, cin.toInt(), pout.rawAddress, cout.toInt(), ul.toInt())

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
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingRegisterForPrintAsyncNotifications(pszname.rawAddress, pnotificationtype.rawAddress, euserfilter, econversationstyle, pcallback.rawAddress, phnotify.rawAddress)

public actual fun removePrintDeviceObject(hdeviceobject: Handle): Hresult =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingRemovePrintDeviceObject(hdeviceobject.rawAddress)

public actual fun replyPrinterChangeNotification(hprinter: PrinterHandle, fdwchangeflags: UInt, pdwresult: MutPtr<UInt>, pprinternotifyinfo: ConstPtr<CVoid>): Bool =
    0

public actual fun replyPrinterChangeNotificationEx(hnotify: Handle, dwcolor: UInt, fdwflags: UInt, pdwresult: MutPtr<UInt>, pprinternotifyinfo: ConstPtr<CVoid>): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingReplyPrinterChangeNotificationEx(hnotify.rawAddress, dwcolor.toInt(), fdwflags.toInt(), pdwresult.rawAddress, pprinternotifyinfo.rawAddress)

public actual fun reportJobProcessingProgress(printerhandle: Handle, jobid: UInt, joboperation: EPrintXPSJobOperation, jobprogress: EPrintXPSJobProgress): Hresult =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingReportJobProcessingProgress(printerhandle.rawAddress, jobid.toInt(), joboperation, jobprogress)

public actual fun resetPrinterA(hprinter: PrinterHandle, pdefault: ConstPtr<PrinterDefaultsa>): Bool =
    0

public actual fun resetPrinterW(hprinter: PrinterHandle, pdefault: ConstPtr<PrinterDefaultsw>): Bool =
    0

public actual fun revertToPrinterSelf(): Handle =
    MutPtr(WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingRevertToPrinterSelf())

public actual fun routerAllocBidiMem(numbytes: ULong): MutPtr<CVoid> =
    MutPtr(WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingRouterAllocBidiMem(numbytes.toLong()))

public actual fun routerAllocBidiResponseContainer(count: UInt): MutPtr<BidiResponseContainer> =
    MutPtr(WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingRouterAllocBidiResponseContainer(count.toInt()))

public actual fun routerAllocPrinterNotifyInfo(cprinternotifyinfodata: UInt): MutPtr<PrinterNotifyInfo> =
    MutPtr(WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingRouterAllocPrinterNotifyInfo(cprinternotifyinfodata.toInt()))

public actual fun routerFreeBidiMem(pmempointer: ConstPtr<CVoid>) {
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingRouterFreeBidiMem(pmempointer.rawAddress)
}

public actual fun routerFreeBidiResponseContainer(pdata: ConstPtr<BidiResponseContainer>): UInt =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingRouterFreeBidiResponseContainer(pdata.rawAddress).toUInt()

public actual fun routerFreePrinterNotifyInfo(pinfo: ConstPtr<PrinterNotifyInfo>): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingRouterFreePrinterNotifyInfo(pinfo.rawAddress)

public actual fun scheduleJob(hprinter: PrinterHandle, jobid: UInt): Bool =
    0

public actual fun setCPSUIUserData(hdlg: Hwnd, cpsuiuserdata: ULong): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingSetCPSUIUserData(hdlg.rawAddress, cpsuiuserdata.toLong())

public actual fun setDefaultPrinterA(pszprinter: Pcstr): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingSetDefaultPrinterA(pszprinter.rawAddress)

public actual fun setDefaultPrinterW(pszprinter: Pcwstr): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingSetDefaultPrinterW(pszprinter.rawAddress)

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
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingSetPortA(pname.rawAddress, pportname.rawAddress, dwlevel.toInt(), pportinfo.rawAddress)

public actual fun setPortW(pname: Pcwstr, pportname: Pcwstr, dwlevel: UInt, pportinfo: ConstPtr<UByte>): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingSetPortW(pname.rawAddress, pportname.rawAddress, dwlevel.toInt(), pportinfo.rawAddress)

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
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingSpoolerCopyFileEvent(pszprintername.rawAddress, pszkey.rawAddress, dwcopyfileevent.toInt())

public actual fun spoolerFindClosePrinterChangeNotification(hprinter: PrinterHandle): Bool =
    0

public actual fun spoolerFindFirstPrinterChangeNotification(hprinter: PrinterHandle, fdwfilterflags: UInt, fdwoptions: UInt, pprinternotifyoptions: ConstPtr<CVoid>, pvreserved: ConstPtr<CVoid>, pnotificationconfig: ConstPtr<CVoid>, phnotify: MutPtr<Handle>, phevent: MutPtr<Handle>): Bool =
    0

public actual fun spoolerFindNextPrinterChangeNotification(hprinter: PrinterHandle, pfdwchange: MutPtr<UInt>, pprinternotifyoptions: ConstPtr<CVoid>, ppprinternotifyinfo: MutPtr<MutPtr<CVoid>>): Bool =
    0

public actual fun spoolerFreePrinterNotifyInfo(pinfo: ConstPtr<PrinterNotifyInfo>) {
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingSpoolerFreePrinterNotifyInfo(pinfo.rawAddress)
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
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingUnRegisterForPrintAsyncNotifications(param0.rawAddress)

public actual fun updatePrintDeviceObject(hprinter: PrinterHandle, hdeviceobject: Handle): Hresult =
    0

public actual fun uploadPrinterDriverPackageA(pszserver: Pcstr, pszinfpath: Pcstr, pszenvironment: Pcstr, dwflags: UInt, hwnd: Hwnd, pszdestinfpath: Pstr, pcchdestinfpath: MutPtr<UInt>): Hresult =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingUploadPrinterDriverPackageA(pszserver.rawAddress, pszinfpath.rawAddress, pszenvironment.rawAddress, dwflags.toInt(), hwnd.rawAddress, pszdestinfpath.rawAddress, pcchdestinfpath.rawAddress)

public actual fun uploadPrinterDriverPackageW(pszserver: Pcwstr, pszinfpath: Pcwstr, pszenvironment: Pcwstr, dwflags: UInt, hwnd: Hwnd, pszdestinfpath: Pwstr, pcchdestinfpath: MutPtr<UInt>): Hresult =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingUploadPrinterDriverPackageW(pszserver.rawAddress, pszinfpath.rawAddress, pszenvironment.rawAddress, dwflags.toInt(), hwnd.rawAddress, pszdestinfpath.rawAddress, pcchdestinfpath.rawAddress)

public actual fun waitForPrinterChange(hprinter: PrinterHandle, flags: UInt): UInt =
    0u

public actual fun writePrinter(hprinter: PrinterHandle, pbuf: ConstPtr<CVoid>, cbbuf: UInt, pcwritten: MutPtr<UInt>): Bool =
    0

public actual fun xcvDataW(hxcv: Handle, pszdataname: Pcwstr, pinputdata: ConstPtr<UByte>, cbinputdata: UInt, poutputdata: MutPtr<UByte>, cboutputdata: UInt, pcboutputneeded: MutPtr<UInt>, pdwstatus: MutPtr<UInt>): Bool =
    WindowsWin32GraphicsPrintingJniBridge.windowssysWindowsWin32GraphicsPrintingXcvDataW(hxcv.rawAddress, pszdataname.rawAddress, pinputdata.rawAddress, cbinputdata.toInt(), poutputdata.rawAddress, cboutputdata.toInt(), pcboutputneeded.rawAddress, pdwstatus.rawAddress)
