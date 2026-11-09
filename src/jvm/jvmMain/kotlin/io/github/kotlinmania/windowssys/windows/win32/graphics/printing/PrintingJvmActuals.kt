@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.graphics.printing

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.FILETIME
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.foundation.LPARAM
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.HDC

private object WindowsWin32GraphicsPrintingJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_AddMonitorA(pname: Long, level: Int, pmonitors: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_AddMonitorW(pname: Long, level: Int, pmonitors: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_AddPortA(pname: Long, hwnd: Long, pmonitorname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_AddPortW(pname: Long, hwnd: Long, pmonitorname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_AddPrintProcessorA(pname: Long, penvironment: Long, ppathname: Long, pprintprocessorname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_AddPrintProcessorW(pname: Long, penvironment: Long, ppathname: Long, pprintprocessorname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_AddPrintProvidorA(pname: Long, level: Int, pprovidorinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_AddPrintProvidorW(pname: Long, level: Int, pprovidorinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_AddPrinterA(pname: Long, level: Int, pprinter: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_AddPrinterConnection2A(hwnd: Long, pszname: Long, dwlevel: Int, pconnectioninfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_AddPrinterConnection2W(hwnd: Long, pszname: Long, dwlevel: Int, pconnectioninfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_AddPrinterConnectionA(pname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_AddPrinterConnectionW(pname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_AddPrinterDriverA(pname: Long, level: Int, pdriverinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_AddPrinterDriverExA(pname: Long, level: Int, lpbdriverinfo: Long, dwfilecopyflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_AddPrinterDriverExW(pname: Long, level: Int, lpbdriverinfo: Long, dwfilecopyflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_AddPrinterDriverW(pname: Long, level: Int, pdriverinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_AddPrinterW(pname: Long, level: Int, pprinter: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_AppendPrinterNotifyInfoData(pinfodest: Long, pdatasrc: Long, fdwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_CallRouterFindFirstPrinterChangeNotification(hprinterrpc: Long, fdwfilterflags: Int, fdwoptions: Int, hnotify: Long, pprinternotifyoptions: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_CommonPropertySheetUIA(hwndowner: Long, pfnpropsheetui: Long, lparam: Long, presult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_CommonPropertySheetUIW(hwndowner: Long, pfnpropsheetui: Long, lparam: Long, presult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_ConfigurePortA(pname: Long, hwnd: Long, pportname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_ConfigurePortW(pname: Long, hwnd: Long, pportname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_ConnectToPrinterDlg(hwnd: Long, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_CreatePrintAsyncNotifyChannel(pszname: Long, pnotificationtype: Long, euserfilter: Int, econversationstyle: Int, pcallback: Long, ppiasynchnotification: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_DeleteMonitorA(pname: Long, penvironment: Long, pmonitorname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_DeleteMonitorW(pname: Long, penvironment: Long, pmonitorname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_DeletePortA(pname: Long, hwnd: Long, pportname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_DeletePortW(pname: Long, hwnd: Long, pportname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_DeletePrintProcessorA(pname: Long, penvironment: Long, pprintprocessorname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_DeletePrintProcessorW(pname: Long, penvironment: Long, pprintprocessorname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_DeletePrintProvidorA(pname: Long, penvironment: Long, pprintprovidorname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_DeletePrintProvidorW(pname: Long, penvironment: Long, pprintprovidorname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_DeletePrinterConnectionA(pname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_DeletePrinterConnectionW(pname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_DeletePrinterDriverA(pname: Long, penvironment: Long, pdrivername: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_DeletePrinterDriverExA(pname: Long, penvironment: Long, pdrivername: Long, dwdeleteflag: Int, dwversionflag: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_DeletePrinterDriverExW(pname: Long, penvironment: Long, pdrivername: Long, dwdeleteflag: Int, dwversionflag: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_DeletePrinterDriverPackageA(pszserver: Long, pszinfpath: Long, pszenvironment: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_DeletePrinterDriverPackageW(pszserver: Long, pszinfpath: Long, pszenvironment: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_DeletePrinterDriverW(pname: Long, penvironment: Long, pdrivername: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_DeletePrinterIC(hprinteric: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_DevQueryPrintEx(pdqpinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_EnumMonitorsA(pname: Long, level: Int, pmonitor: Long, cbbuf: Int, pcbneeded: Long, pcreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_EnumMonitorsW(pname: Long, level: Int, pmonitor: Long, cbbuf: Int, pcbneeded: Long, pcreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_EnumPortsA(pname: Long, level: Int, pport: Long, cbbuf: Int, pcbneeded: Long, pcreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_EnumPortsW(pname: Long, level: Int, pport: Long, cbbuf: Int, pcbneeded: Long, pcreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_EnumPrintProcessorDatatypesA(pname: Long, pprintprocessorname: Long, level: Int, pdatatypes: Long, cbbuf: Int, pcbneeded: Long, pcreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_EnumPrintProcessorDatatypesW(pname: Long, pprintprocessorname: Long, level: Int, pdatatypes: Long, cbbuf: Int, pcbneeded: Long, pcreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_EnumPrintProcessorsA(pname: Long, penvironment: Long, level: Int, pprintprocessorinfo: Long, cbbuf: Int, pcbneeded: Long, pcreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_EnumPrintProcessorsW(pname: Long, penvironment: Long, level: Int, pprintprocessorinfo: Long, cbbuf: Int, pcbneeded: Long, pcreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_EnumPrinterDriversA(pname: Long, penvironment: Long, level: Int, pdriverinfo: Long, cbbuf: Int, pcbneeded: Long, pcreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_EnumPrinterDriversW(pname: Long, penvironment: Long, level: Int, pdriverinfo: Long, cbbuf: Int, pcbneeded: Long, pcreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_EnumPrintersA(flags: Int, name: Long, level: Int, pprinterenum: Long, cbbuf: Int, pcbneeded: Long, pcreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_EnumPrintersW(flags: Int, name: Long, level: Int, pprinterenum: Long, cbbuf: Int, pcbneeded: Long, pcreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_ExtDeviceMode(hwnd: Long, hinst: Long, pdevmodeoutput: Long, pdevicename: Long, pport: Long, pdevmodeinput: Long, pprofile: Long, fmode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_FindClosePrinterChangeNotification(hchange: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_FindNextPrinterChangeNotification(hchange: Long, pdwchange: Long, pvreserved: Long, ppprinternotifyinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_FreePrintNamedPropertyArray(cproperties: Int, ppproperties: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_FreePrintPropertyValue(pvalue: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_FreePrinterNotifyInfo(pprinternotifyinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_GdiDeleteSpoolFileHandle(spoolfilehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_GdiEndDocEMF(spoolfilehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_GdiEndPageEMF(spoolfilehandle: Long, dwoptimization: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_GdiGetDC(spoolfilehandle: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_GdiGetDevmodeForPage(spoolfilehandle: Long, dwpagenumber: Int, pcurrdm: Long, plastdm: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_GdiGetPageCount(spoolfilehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_GdiGetPageHandle(spoolfilehandle: Long, page: Int, pdwpagetype: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_GdiGetSpoolFileHandle(pwszprintername: Long, pdevmode: Long, pwszdocname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_GdiPlayPageEMF(spoolfilehandle: Long, hemf: Long, prectdocument: Long, prectborder: Long, prectclip: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_GdiResetDCEMF(spoolfilehandle: Long, pcurrdm: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_GdiStartDocEMF(spoolfilehandle: Long, pdocinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_GdiStartPageEMF(spoolfilehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_GenerateCopyFilePaths(pszprintername: Long, pszdirectory: Long, psplclientinfo: Long, dwlevel: Int, pszsourcedir: Long, pcchsourcedirsize: Long, psztargetdir: Long, pcchtargetdirsize: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_GetCPSUIUserData(hdlg: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_GetCorePrinterDriversA(pszserver: Long, pszenvironment: Long, pszzcoredriverdependencies: Long, ccoreprinterdrivers: Int, pcoreprinterdrivers: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_GetCorePrinterDriversW(pszserver: Long, pszenvironment: Long, pszzcoredriverdependencies: Long, ccoreprinterdrivers: Int, pcoreprinterdrivers: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_GetDefaultPrinterA(pszbuffer: Long, pcchbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_GetDefaultPrinterW(pszbuffer: Long, pcchbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_GetJobAttributes(pprintername: Long, pdevmode: Long, pattributeinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_GetJobAttributesEx(pprintername: Long, pdevmode: Long, dwlevel: Int, pattributeinfo: Long, nsize: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_GetPrintExecutionData(pdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_GetPrintOutputInfo(hwnd: Long, pszprinter: Long, phfile: Long, ppszoutputfile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_GetPrintProcessorDirectoryA(pname: Long, penvironment: Long, level: Int, pprintprocessorinfo: Long, cbbuf: Int, pcbneeded: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_GetPrintProcessorDirectoryW(pname: Long, penvironment: Long, level: Int, pprintprocessorinfo: Long, cbbuf: Int, pcbneeded: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_GetPrinterDriverDirectoryA(pname: Long, penvironment: Long, level: Int, pdriverdirectory: Long, cbbuf: Int, pcbneeded: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_GetPrinterDriverDirectoryW(pname: Long, penvironment: Long, level: Int, pdriverdirectory: Long, cbbuf: Int, pcbneeded: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_GetPrinterDriverPackagePathA(pszserver: Long, pszenvironment: Long, pszlanguage: Long, pszpackageid: Long, pszdriverpackagecab: Long, cchdriverpackagecab: Int, pcchrequiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_GetPrinterDriverPackagePathW(pszserver: Long, pszenvironment: Long, pszlanguage: Long, pszpackageid: Long, pszdriverpackagecab: Long, cchdriverpackagecab: Int, pcchrequiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_ImpersonatePrinterClient(htoken: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_InstallPrinterDriverFromPackageA(pszserver: Long, pszinfpath: Long, pszdrivername: Long, pszenvironment: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_InstallPrinterDriverFromPackageW(pszserver: Long, pszinfpath: Long, pszdrivername: Long, pszenvironment: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_IsValidDevmodeA(pdevmode: Long, devmodesize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_IsValidDevmodeW(pdevmode: Long, devmodesize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_OpenPrinter2A(pprintername: Long, phprinter: Long, pdefault: Long, poptions: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_OpenPrinter2W(pprintername: Long, phprinter: Long, pdefault: Long, poptions: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_OpenPrinterA(pprintername: Long, phprinter: Long, pdefault: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_OpenPrinterW(pprintername: Long, phprinter: Long, pdefault: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_PlayGdiScriptOnPrinterIC(hprinteric: Long, pin: Long, cin: Int, pout: Long, cout: Int, ul: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_RegisterForPrintAsyncNotifications(pszname: Long, pnotificationtype: Long, euserfilter: Int, econversationstyle: Int, pcallback: Long, phnotify: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_RemovePrintDeviceObject(hdeviceobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_ReplyPrinterChangeNotificationEx(hnotify: Long, dwcolor: Int, fdwflags: Int, pdwresult: Long, pprinternotifyinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_ReportJobProcessingProgress(printerhandle: Long, jobid: Int, joboperation: Int, jobprogress: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_RevertToPrinterSelf(): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_RouterAllocBidiMem(numbytes: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_RouterAllocBidiResponseContainer(count: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_RouterAllocPrinterNotifyInfo(cprinternotifyinfodata: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_RouterFreeBidiMem(pmempointer: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_RouterFreeBidiResponseContainer(pdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_RouterFreePrinterNotifyInfo(pinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_SetCPSUIUserData(hdlg: Long, cpsuiuserdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_SetDefaultPrinterA(pszprinter: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_SetDefaultPrinterW(pszprinter: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_SetPortA(pname: Long, pportname: Long, dwlevel: Int, pportinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_SetPortW(pname: Long, pportname: Long, dwlevel: Int, pportinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_SpoolerCopyFileEvent(pszprintername: Long, pszkey: Long, dwcopyfileevent: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_SpoolerFreePrinterNotifyInfo(pinfo: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_UnRegisterForPrintAsyncNotifications(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_UploadPrinterDriverPackageA(pszserver: Long, pszinfpath: Long, pszenvironment: Long, dwflags: Int, hwnd: Long, pszdestinfpath: Long, pcchdestinfpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_UploadPrinterDriverPackageW(pszserver: Long, pszinfpath: Long, pszenvironment: Long, dwflags: Int, hwnd: Long, pszdestinfpath: Long, pcchdestinfpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_printing_XcvDataW(hxcv: Long, pszdataname: Long, pinputdata: Long, cbinputdata: Int, poutputdata: Long, cboutputdata: Int, pcboutputneeded: Long, pdwstatus: Long): Int
}

public actual fun AbortPrinter(hprinter: PRINTER_HANDLE): BOOL =
    0

public actual fun AddFormA(hprinter: PRINTER_HANDLE, level: UInt, pform: Long): BOOL =
    0

public actual fun AddFormW(hprinter: PRINTER_HANDLE, level: UInt, pform: Long): BOOL =
    0

public actual fun AddJobA(hprinter: PRINTER_HANDLE, level: UInt, pdata: Long, cbbuf: UInt, pcbneeded: Long): BOOL =
    0

public actual fun AddJobW(hprinter: PRINTER_HANDLE, level: UInt, pdata: Long, cbbuf: UInt, pcbneeded: Long): BOOL =
    0

public actual fun AddMonitorA(pname: PCSTR, level: UInt, pmonitors: Long): BOOL =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_AddMonitorA(pname, level.toInt(), pmonitors)

public actual fun AddMonitorW(pname: PCWSTR, level: UInt, pmonitors: Long): BOOL =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_AddMonitorW(pname, level.toInt(), pmonitors)

public actual fun AddPortA(pname: PCSTR, hwnd: HWND, pmonitorname: PCSTR): BOOL =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_AddPortA(pname, hwnd, pmonitorname)

public actual fun AddPortW(pname: PCWSTR, hwnd: HWND, pmonitorname: PCWSTR): BOOL =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_AddPortW(pname, hwnd, pmonitorname)

public actual fun AddPrintDeviceObject(hprinter: PRINTER_HANDLE, phdeviceobject: Long): HRESULT =
    0

public actual fun AddPrintProcessorA(pname: PCSTR, penvironment: PCSTR, ppathname: PCSTR, pprintprocessorname: PCSTR): BOOL =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_AddPrintProcessorA(pname, penvironment, ppathname, pprintprocessorname)

public actual fun AddPrintProcessorW(pname: PCWSTR, penvironment: PCWSTR, ppathname: PCWSTR, pprintprocessorname: PCWSTR): BOOL =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_AddPrintProcessorW(pname, penvironment, ppathname, pprintprocessorname)

public actual fun AddPrintProvidorA(pname: PCSTR, level: UInt, pprovidorinfo: Long): BOOL =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_AddPrintProvidorA(pname, level.toInt(), pprovidorinfo)

public actual fun AddPrintProvidorW(pname: PCWSTR, level: UInt, pprovidorinfo: Long): BOOL =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_AddPrintProvidorW(pname, level.toInt(), pprovidorinfo)

public actual fun AddPrinterA(pname: PCSTR, level: UInt, pprinter: Long): HANDLE =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_AddPrinterA(pname, level.toInt(), pprinter)

public actual fun AddPrinterConnection2A(hwnd: HWND, pszname: PCSTR, dwlevel: UInt, pconnectioninfo: Long): BOOL =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_AddPrinterConnection2A(hwnd, pszname, dwlevel.toInt(), pconnectioninfo)

public actual fun AddPrinterConnection2W(hwnd: HWND, pszname: PCWSTR, dwlevel: UInt, pconnectioninfo: Long): BOOL =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_AddPrinterConnection2W(hwnd, pszname, dwlevel.toInt(), pconnectioninfo)

public actual fun AddPrinterConnectionA(pname: PCSTR): BOOL =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_AddPrinterConnectionA(pname)

public actual fun AddPrinterConnectionW(pname: PCWSTR): BOOL =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_AddPrinterConnectionW(pname)

public actual fun AddPrinterDriverA(pname: PCSTR, level: UInt, pdriverinfo: Long): BOOL =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_AddPrinterDriverA(pname, level.toInt(), pdriverinfo)

public actual fun AddPrinterDriverExA(pname: PCSTR, level: UInt, lpbdriverinfo: Long, dwfilecopyflags: UInt): BOOL =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_AddPrinterDriverExA(pname, level.toInt(), lpbdriverinfo, dwfilecopyflags.toInt())

public actual fun AddPrinterDriverExW(pname: PCWSTR, level: UInt, lpbdriverinfo: Long, dwfilecopyflags: UInt): BOOL =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_AddPrinterDriverExW(pname, level.toInt(), lpbdriverinfo, dwfilecopyflags.toInt())

public actual fun AddPrinterDriverW(pname: PCWSTR, level: UInt, pdriverinfo: Long): BOOL =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_AddPrinterDriverW(pname, level.toInt(), pdriverinfo)

public actual fun AddPrinterW(pname: PCWSTR, level: UInt, pprinter: Long): HANDLE =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_AddPrinterW(pname, level.toInt(), pprinter)

public actual fun AdvancedDocumentPropertiesA(hwnd: HWND, hprinter: PRINTER_HANDLE, pdevicename: PCSTR, pdevmodeoutput: Long, pdevmodeinput: Long): Int =
    0

public actual fun AdvancedDocumentPropertiesW(hwnd: HWND, hprinter: PRINTER_HANDLE, pdevicename: PCWSTR, pdevmodeoutput: Long, pdevmodeinput: Long): Int =
    0

public actual fun AppendPrinterNotifyInfoData(pinfodest: Long, pdatasrc: Long, fdwflags: UInt): BOOL =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_AppendPrinterNotifyInfoData(pinfodest, pdatasrc, fdwflags.toInt())

public actual fun CallRouterFindFirstPrinterChangeNotification(hprinterrpc: HANDLE, fdwfilterflags: UInt, fdwoptions: UInt, hnotify: HANDLE, pprinternotifyoptions: Long): UInt =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_CallRouterFindFirstPrinterChangeNotification(hprinterrpc, fdwfilterflags.toInt(), fdwoptions.toInt(), hnotify, pprinternotifyoptions).toUInt()

public actual fun ClosePrinter(hprinter: PRINTER_HANDLE): BOOL =
    0

public actual fun CloseSpoolFileHandle(hprinter: PRINTER_HANDLE, hspoolfile: HANDLE): BOOL =
    0

public actual fun CommitSpoolData(hprinter: PRINTER_HANDLE, hspoolfile: HANDLE, cbcommit: UInt): HANDLE =
    0L

public actual fun CommonPropertySheetUIA(hwndowner: HWND, pfnpropsheetui: PFNPROPSHEETUI, lparam: LPARAM, presult: Long): Int =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_CommonPropertySheetUIA(hwndowner, pfnpropsheetui.toLong(), lparam, presult)

public actual fun CommonPropertySheetUIW(hwndowner: HWND, pfnpropsheetui: PFNPROPSHEETUI, lparam: LPARAM, presult: Long): Int =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_CommonPropertySheetUIW(hwndowner, pfnpropsheetui.toLong(), lparam, presult)

public actual fun ConfigurePortA(pname: PCSTR, hwnd: HWND, pportname: PCSTR): BOOL =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_ConfigurePortA(pname, hwnd, pportname)

public actual fun ConfigurePortW(pname: PCWSTR, hwnd: HWND, pportname: PCWSTR): BOOL =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_ConfigurePortW(pname, hwnd, pportname)

public actual fun ConnectToPrinterDlg(hwnd: HWND, flags: UInt): HANDLE =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_ConnectToPrinterDlg(hwnd, flags.toInt())

public actual fun CorePrinterDriverInstalledA(pszserver: PCSTR, pszenvironment: PCSTR, coredriverguid: GUID, ftdriverdate: FILETIME, dwldriverversion: ULong, pbdriverinstalled: Long): HRESULT =
    0

public actual fun CorePrinterDriverInstalledW(pszserver: PCWSTR, pszenvironment: PCWSTR, coredriverguid: GUID, ftdriverdate: FILETIME, dwldriverversion: ULong, pbdriverinstalled: Long): HRESULT =
    0

public actual fun CreatePrintAsyncNotifyChannel(pszname: PCWSTR, pnotificationtype: Long, euserfilter: PrintAsyncNotifyUserFilter, econversationstyle: PrintAsyncNotifyConversationStyle, pcallback: Long, ppiasynchnotification: Long): HRESULT =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_CreatePrintAsyncNotifyChannel(pszname, pnotificationtype, euserfilter, econversationstyle, pcallback, ppiasynchnotification)

public actual fun CreatePrinterIC(hprinter: PRINTER_HANDLE, pdevmode: Long): HANDLE =
    0L

public actual fun DeleteFormA(hprinter: PRINTER_HANDLE, pformname: PCSTR): BOOL =
    0

public actual fun DeleteFormW(hprinter: PRINTER_HANDLE, pformname: PCWSTR): BOOL =
    0

public actual fun DeleteJobNamedProperty(hprinter: PRINTER_HANDLE, jobid: UInt, pszname: PCWSTR): UInt =
    0u

public actual fun DeleteMonitorA(pname: PCSTR, penvironment: PCSTR, pmonitorname: PCSTR): BOOL =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_DeleteMonitorA(pname, penvironment, pmonitorname)

public actual fun DeleteMonitorW(pname: PCWSTR, penvironment: PCWSTR, pmonitorname: PCWSTR): BOOL =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_DeleteMonitorW(pname, penvironment, pmonitorname)

public actual fun DeletePortA(pname: PCSTR, hwnd: HWND, pportname: PCSTR): BOOL =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_DeletePortA(pname, hwnd, pportname)

public actual fun DeletePortW(pname: PCWSTR, hwnd: HWND, pportname: PCWSTR): BOOL =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_DeletePortW(pname, hwnd, pportname)

public actual fun DeletePrintProcessorA(pname: PCSTR, penvironment: PCSTR, pprintprocessorname: PCSTR): BOOL =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_DeletePrintProcessorA(pname, penvironment, pprintprocessorname)

public actual fun DeletePrintProcessorW(pname: PCWSTR, penvironment: PCWSTR, pprintprocessorname: PCWSTR): BOOL =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_DeletePrintProcessorW(pname, penvironment, pprintprocessorname)

public actual fun DeletePrintProvidorA(pname: PCSTR, penvironment: PCSTR, pprintprovidorname: PCSTR): BOOL =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_DeletePrintProvidorA(pname, penvironment, pprintprovidorname)

public actual fun DeletePrintProvidorW(pname: PCWSTR, penvironment: PCWSTR, pprintprovidorname: PCWSTR): BOOL =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_DeletePrintProvidorW(pname, penvironment, pprintprovidorname)

public actual fun DeletePrinter(hprinter: PRINTER_HANDLE): BOOL =
    0

public actual fun DeletePrinterConnectionA(pname: PCSTR): BOOL =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_DeletePrinterConnectionA(pname)

public actual fun DeletePrinterConnectionW(pname: PCWSTR): BOOL =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_DeletePrinterConnectionW(pname)

public actual fun DeletePrinterDataA(hprinter: PRINTER_HANDLE, pvaluename: PCSTR): UInt =
    0u

public actual fun DeletePrinterDataExA(hprinter: PRINTER_HANDLE, pkeyname: PCSTR, pvaluename: PCSTR): UInt =
    0u

public actual fun DeletePrinterDataExW(hprinter: PRINTER_HANDLE, pkeyname: PCWSTR, pvaluename: PCWSTR): UInt =
    0u

public actual fun DeletePrinterDataW(hprinter: PRINTER_HANDLE, pvaluename: PCWSTR): UInt =
    0u

public actual fun DeletePrinterDriverA(pname: PCSTR, penvironment: PCSTR, pdrivername: PCSTR): BOOL =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_DeletePrinterDriverA(pname, penvironment, pdrivername)

public actual fun DeletePrinterDriverExA(pname: PCSTR, penvironment: PCSTR, pdrivername: PCSTR, dwdeleteflag: UInt, dwversionflag: UInt): BOOL =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_DeletePrinterDriverExA(pname, penvironment, pdrivername, dwdeleteflag.toInt(), dwversionflag.toInt())

public actual fun DeletePrinterDriverExW(pname: PCWSTR, penvironment: PCWSTR, pdrivername: PCWSTR, dwdeleteflag: UInt, dwversionflag: UInt): BOOL =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_DeletePrinterDriverExW(pname, penvironment, pdrivername, dwdeleteflag.toInt(), dwversionflag.toInt())

public actual fun DeletePrinterDriverPackageA(pszserver: PCSTR, pszinfpath: PCSTR, pszenvironment: PCSTR): HRESULT =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_DeletePrinterDriverPackageA(pszserver, pszinfpath, pszenvironment)

public actual fun DeletePrinterDriverPackageW(pszserver: PCWSTR, pszinfpath: PCWSTR, pszenvironment: PCWSTR): HRESULT =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_DeletePrinterDriverPackageW(pszserver, pszinfpath, pszenvironment)

public actual fun DeletePrinterDriverW(pname: PCWSTR, penvironment: PCWSTR, pdrivername: PCWSTR): BOOL =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_DeletePrinterDriverW(pname, penvironment, pdrivername)

public actual fun DeletePrinterIC(hprinteric: HANDLE): BOOL =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_DeletePrinterIC(hprinteric)

public actual fun DeletePrinterKeyA(hprinter: PRINTER_HANDLE, pkeyname: PCSTR): UInt =
    0u

public actual fun DeletePrinterKeyW(hprinter: PRINTER_HANDLE, pkeyname: PCWSTR): UInt =
    0u

public actual fun DevQueryPrint(hprinter: PRINTER_HANDLE, pdevmode: Long, presid: Long): BOOL =
    0

public actual fun DevQueryPrintEx(pdqpinfo: Long): BOOL =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_DevQueryPrintEx(pdqpinfo)

public actual fun DocumentPropertiesA(hwnd: HWND, hprinter: PRINTER_HANDLE, pdevicename: PCSTR, pdevmodeoutput: Long, pdevmodeinput: Long, fmode: UInt): Int =
    0

public actual fun DocumentPropertiesW(hwnd: HWND, hprinter: PRINTER_HANDLE, pdevicename: PCWSTR, pdevmodeoutput: Long, pdevmodeinput: Long, fmode: UInt): Int =
    0

public actual fun EndDocPrinter(hprinter: PRINTER_HANDLE): BOOL =
    0

public actual fun EndPagePrinter(hprinter: PRINTER_HANDLE): BOOL =
    0

public actual fun EnumFormsA(hprinter: PRINTER_HANDLE, level: UInt, pform: Long, cbbuf: UInt, pcbneeded: Long, pcreturned: Long): BOOL =
    0

public actual fun EnumFormsW(hprinter: PRINTER_HANDLE, level: UInt, pform: Long, cbbuf: UInt, pcbneeded: Long, pcreturned: Long): BOOL =
    0

public actual fun EnumJobNamedProperties(hprinter: PRINTER_HANDLE, jobid: UInt, pcproperties: Long, ppproperties: Long): UInt =
    0u

public actual fun EnumJobsA(hprinter: PRINTER_HANDLE, firstjob: UInt, nojobs: UInt, level: UInt, pjob: Long, cbbuf: UInt, pcbneeded: Long, pcreturned: Long): BOOL =
    0

public actual fun EnumJobsW(hprinter: PRINTER_HANDLE, firstjob: UInt, nojobs: UInt, level: UInt, pjob: Long, cbbuf: UInt, pcbneeded: Long, pcreturned: Long): BOOL =
    0

public actual fun EnumMonitorsA(pname: PCSTR, level: UInt, pmonitor: Long, cbbuf: UInt, pcbneeded: Long, pcreturned: Long): BOOL =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_EnumMonitorsA(pname, level.toInt(), pmonitor, cbbuf.toInt(), pcbneeded, pcreturned)

public actual fun EnumMonitorsW(pname: PCWSTR, level: UInt, pmonitor: Long, cbbuf: UInt, pcbneeded: Long, pcreturned: Long): BOOL =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_EnumMonitorsW(pname, level.toInt(), pmonitor, cbbuf.toInt(), pcbneeded, pcreturned)

public actual fun EnumPortsA(pname: PCSTR, level: UInt, pport: Long, cbbuf: UInt, pcbneeded: Long, pcreturned: Long): BOOL =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_EnumPortsA(pname, level.toInt(), pport, cbbuf.toInt(), pcbneeded, pcreturned)

public actual fun EnumPortsW(pname: PCWSTR, level: UInt, pport: Long, cbbuf: UInt, pcbneeded: Long, pcreturned: Long): BOOL =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_EnumPortsW(pname, level.toInt(), pport, cbbuf.toInt(), pcbneeded, pcreturned)

public actual fun EnumPrintProcessorDatatypesA(pname: PCSTR, pprintprocessorname: PCSTR, level: UInt, pdatatypes: Long, cbbuf: UInt, pcbneeded: Long, pcreturned: Long): BOOL =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_EnumPrintProcessorDatatypesA(pname, pprintprocessorname, level.toInt(), pdatatypes, cbbuf.toInt(), pcbneeded, pcreturned)

public actual fun EnumPrintProcessorDatatypesW(pname: PCWSTR, pprintprocessorname: PCWSTR, level: UInt, pdatatypes: Long, cbbuf: UInt, pcbneeded: Long, pcreturned: Long): BOOL =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_EnumPrintProcessorDatatypesW(pname, pprintprocessorname, level.toInt(), pdatatypes, cbbuf.toInt(), pcbneeded, pcreturned)

public actual fun EnumPrintProcessorsA(pname: PCSTR, penvironment: PCSTR, level: UInt, pprintprocessorinfo: Long, cbbuf: UInt, pcbneeded: Long, pcreturned: Long): BOOL =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_EnumPrintProcessorsA(pname, penvironment, level.toInt(), pprintprocessorinfo, cbbuf.toInt(), pcbneeded, pcreturned)

public actual fun EnumPrintProcessorsW(pname: PCWSTR, penvironment: PCWSTR, level: UInt, pprintprocessorinfo: Long, cbbuf: UInt, pcbneeded: Long, pcreturned: Long): BOOL =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_EnumPrintProcessorsW(pname, penvironment, level.toInt(), pprintprocessorinfo, cbbuf.toInt(), pcbneeded, pcreturned)

public actual fun EnumPrinterDataA(hprinter: PRINTER_HANDLE, dwindex: UInt, pvaluename: PSTR, cbvaluename: UInt, pcbvaluename: Long, ptype: Long, pdata: Long, cbdata: UInt, pcbdata: Long): UInt =
    0u

public actual fun EnumPrinterDataExA(hprinter: PRINTER_HANDLE, pkeyname: PCSTR, penumvalues: Long, cbenumvalues: UInt, pcbenumvalues: Long, pnenumvalues: Long): UInt =
    0u

public actual fun EnumPrinterDataExW(hprinter: PRINTER_HANDLE, pkeyname: PCWSTR, penumvalues: Long, cbenumvalues: UInt, pcbenumvalues: Long, pnenumvalues: Long): UInt =
    0u

public actual fun EnumPrinterDataW(hprinter: PRINTER_HANDLE, dwindex: UInt, pvaluename: PWSTR, cbvaluename: UInt, pcbvaluename: Long, ptype: Long, pdata: Long, cbdata: UInt, pcbdata: Long): UInt =
    0u

public actual fun EnumPrinterDriversA(pname: PCSTR, penvironment: PCSTR, level: UInt, pdriverinfo: Long, cbbuf: UInt, pcbneeded: Long, pcreturned: Long): BOOL =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_EnumPrinterDriversA(pname, penvironment, level.toInt(), pdriverinfo, cbbuf.toInt(), pcbneeded, pcreturned)

public actual fun EnumPrinterDriversW(pname: PCWSTR, penvironment: PCWSTR, level: UInt, pdriverinfo: Long, cbbuf: UInt, pcbneeded: Long, pcreturned: Long): BOOL =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_EnumPrinterDriversW(pname, penvironment, level.toInt(), pdriverinfo, cbbuf.toInt(), pcbneeded, pcreturned)

public actual fun EnumPrinterKeyA(hprinter: PRINTER_HANDLE, pkeyname: PCSTR, psubkey: PSTR, cbsubkey: UInt, pcbsubkey: Long): UInt =
    0u

public actual fun EnumPrinterKeyW(hprinter: PRINTER_HANDLE, pkeyname: PCWSTR, psubkey: PWSTR, cbsubkey: UInt, pcbsubkey: Long): UInt =
    0u

public actual fun EnumPrintersA(flags: UInt, name: PCSTR, level: UInt, pprinterenum: Long, cbbuf: UInt, pcbneeded: Long, pcreturned: Long): BOOL =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_EnumPrintersA(flags.toInt(), name, level.toInt(), pprinterenum, cbbuf.toInt(), pcbneeded, pcreturned)

public actual fun EnumPrintersW(flags: UInt, name: PCWSTR, level: UInt, pprinterenum: Long, cbbuf: UInt, pcbneeded: Long, pcreturned: Long): BOOL =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_EnumPrintersW(flags.toInt(), name, level.toInt(), pprinterenum, cbbuf.toInt(), pcbneeded, pcreturned)

public actual fun ExtDeviceMode(hwnd: HWND, hinst: HANDLE, pdevmodeoutput: Long, pdevicename: PCSTR, pport: PCSTR, pdevmodeinput: Long, pprofile: PCSTR, fmode: UInt): Int =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_ExtDeviceMode(hwnd, hinst, pdevmodeoutput, pdevicename, pport, pdevmodeinput, pprofile, fmode.toInt())

public actual fun FindClosePrinterChangeNotification(hchange: HANDLE): BOOL =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_FindClosePrinterChangeNotification(hchange)

public actual fun FindFirstPrinterChangeNotification(hprinter: PRINTER_HANDLE, fdwfilter: UInt, fdwoptions: UInt, pprinternotifyoptions: Long): HANDLE =
    0L

public actual fun FindNextPrinterChangeNotification(hchange: HANDLE, pdwchange: Long, pvreserved: Long, ppprinternotifyinfo: Long): BOOL =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_FindNextPrinterChangeNotification(hchange, pdwchange, pvreserved, ppprinternotifyinfo)

public actual fun FlushPrinter(hprinter: PRINTER_HANDLE, pbuf: Long, cbbuf: UInt, pcwritten: Long, csleep: UInt): BOOL =
    0

public actual fun FreePrintNamedPropertyArray(cproperties: UInt, ppproperties: Long) {
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_FreePrintNamedPropertyArray(cproperties.toInt(), ppproperties)
}

public actual fun FreePrintPropertyValue(pvalue: Long) {
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_FreePrintPropertyValue(pvalue)
}

public actual fun FreePrinterNotifyInfo(pprinternotifyinfo: Long): BOOL =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_FreePrinterNotifyInfo(pprinternotifyinfo)

public actual fun GdiDeleteSpoolFileHandle(spoolfilehandle: HANDLE): BOOL =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_GdiDeleteSpoolFileHandle(spoolfilehandle)

public actual fun GdiEndDocEMF(spoolfilehandle: HANDLE): BOOL =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_GdiEndDocEMF(spoolfilehandle)

public actual fun GdiEndPageEMF(spoolfilehandle: HANDLE, dwoptimization: UInt): BOOL =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_GdiEndPageEMF(spoolfilehandle, dwoptimization.toInt())

public actual fun GdiGetDC(spoolfilehandle: HANDLE): HDC =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_GdiGetDC(spoolfilehandle)

public actual fun GdiGetDevmodeForPage(spoolfilehandle: HANDLE, dwpagenumber: UInt, pcurrdm: Long, plastdm: Long): BOOL =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_GdiGetDevmodeForPage(spoolfilehandle, dwpagenumber.toInt(), pcurrdm, plastdm)

public actual fun GdiGetPageCount(spoolfilehandle: HANDLE): UInt =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_GdiGetPageCount(spoolfilehandle).toUInt()

public actual fun GdiGetPageHandle(spoolfilehandle: HANDLE, page: UInt, pdwpagetype: Long): HANDLE =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_GdiGetPageHandle(spoolfilehandle, page.toInt(), pdwpagetype)

public actual fun GdiGetSpoolFileHandle(pwszprintername: PCWSTR, pdevmode: Long, pwszdocname: PCWSTR): HANDLE =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_GdiGetSpoolFileHandle(pwszprintername, pdevmode, pwszdocname)

public actual fun GdiPlayPageEMF(spoolfilehandle: HANDLE, hemf: HANDLE, prectdocument: Long, prectborder: Long, prectclip: Long): BOOL =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_GdiPlayPageEMF(spoolfilehandle, hemf, prectdocument, prectborder, prectclip)

public actual fun GdiResetDCEMF(spoolfilehandle: HANDLE, pcurrdm: Long): BOOL =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_GdiResetDCEMF(spoolfilehandle, pcurrdm)

public actual fun GdiStartDocEMF(spoolfilehandle: HANDLE, pdocinfo: Long): BOOL =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_GdiStartDocEMF(spoolfilehandle, pdocinfo)

public actual fun GdiStartPageEMF(spoolfilehandle: HANDLE): BOOL =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_GdiStartPageEMF(spoolfilehandle)

public actual fun GenerateCopyFilePaths(pszprintername: PCWSTR, pszdirectory: PCWSTR, psplclientinfo: Long, dwlevel: UInt, pszsourcedir: PWSTR, pcchsourcedirsize: Long, psztargetdir: PWSTR, pcchtargetdirsize: Long, dwflags: UInt): UInt =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_GenerateCopyFilePaths(pszprintername, pszdirectory, psplclientinfo, dwlevel.toInt(), pszsourcedir, pcchsourcedirsize, psztargetdir, pcchtargetdirsize, dwflags.toInt()).toUInt()

public actual fun GetCPSUIUserData(hdlg: HWND): ULong =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_GetCPSUIUserData(hdlg).toULong()

public actual fun GetCorePrinterDriversA(pszserver: PCSTR, pszenvironment: PCSTR, pszzcoredriverdependencies: PCSTR, ccoreprinterdrivers: UInt, pcoreprinterdrivers: Long): HRESULT =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_GetCorePrinterDriversA(pszserver, pszenvironment, pszzcoredriverdependencies, ccoreprinterdrivers.toInt(), pcoreprinterdrivers)

public actual fun GetCorePrinterDriversW(pszserver: PCWSTR, pszenvironment: PCWSTR, pszzcoredriverdependencies: PCWSTR, ccoreprinterdrivers: UInt, pcoreprinterdrivers: Long): HRESULT =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_GetCorePrinterDriversW(pszserver, pszenvironment, pszzcoredriverdependencies, ccoreprinterdrivers.toInt(), pcoreprinterdrivers)

public actual fun GetDefaultPrinterA(pszbuffer: PSTR, pcchbuffer: Long): BOOL =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_GetDefaultPrinterA(pszbuffer, pcchbuffer)

public actual fun GetDefaultPrinterW(pszbuffer: PWSTR, pcchbuffer: Long): BOOL =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_GetDefaultPrinterW(pszbuffer, pcchbuffer)

public actual fun GetFormA(hprinter: PRINTER_HANDLE, pformname: PCSTR, level: UInt, pform: Long, cbbuf: UInt, pcbneeded: Long): BOOL =
    0

public actual fun GetFormW(hprinter: PRINTER_HANDLE, pformname: PCWSTR, level: UInt, pform: Long, cbbuf: UInt, pcbneeded: Long): BOOL =
    0

public actual fun GetJobA(hprinter: PRINTER_HANDLE, jobid: UInt, level: UInt, pjob: Long, cbbuf: UInt, pcbneeded: Long): BOOL =
    0

public actual fun GetJobAttributes(pprintername: PCWSTR, pdevmode: Long, pattributeinfo: Long): BOOL =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_GetJobAttributes(pprintername, pdevmode, pattributeinfo)

public actual fun GetJobAttributesEx(pprintername: PCWSTR, pdevmode: Long, dwlevel: UInt, pattributeinfo: Long, nsize: UInt, dwflags: UInt): BOOL =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_GetJobAttributesEx(pprintername, pdevmode, dwlevel.toInt(), pattributeinfo, nsize.toInt(), dwflags.toInt())

public actual fun GetJobNamedPropertyValue(hprinter: PRINTER_HANDLE, jobid: UInt, pszname: PCWSTR, pvalue: Long): UInt =
    0u

public actual fun GetJobW(hprinter: PRINTER_HANDLE, jobid: UInt, level: UInt, pjob: Long, cbbuf: UInt, pcbneeded: Long): BOOL =
    0

public actual fun GetPrintExecutionData(pdata: Long): BOOL =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_GetPrintExecutionData(pdata)

public actual fun GetPrintOutputInfo(hwnd: HWND, pszprinter: PCWSTR, phfile: Long, ppszoutputfile: Long): HRESULT =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_GetPrintOutputInfo(hwnd, pszprinter, phfile, ppszoutputfile)

public actual fun GetPrintProcessorDirectoryA(pname: PCSTR, penvironment: PCSTR, level: UInt, pprintprocessorinfo: Long, cbbuf: UInt, pcbneeded: Long): BOOL =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_GetPrintProcessorDirectoryA(pname, penvironment, level.toInt(), pprintprocessorinfo, cbbuf.toInt(), pcbneeded)

public actual fun GetPrintProcessorDirectoryW(pname: PCWSTR, penvironment: PCWSTR, level: UInt, pprintprocessorinfo: Long, cbbuf: UInt, pcbneeded: Long): BOOL =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_GetPrintProcessorDirectoryW(pname, penvironment, level.toInt(), pprintprocessorinfo, cbbuf.toInt(), pcbneeded)

public actual fun GetPrinterA(hprinter: PRINTER_HANDLE, level: UInt, pprinter: Long, cbbuf: UInt, pcbneeded: Long): BOOL =
    0

public actual fun GetPrinterDataA(hprinter: PRINTER_HANDLE, pvaluename: PCSTR, ptype: Long, pdata: Long, nsize: UInt, pcbneeded: Long): UInt =
    0u

public actual fun GetPrinterDataExA(hprinter: PRINTER_HANDLE, pkeyname: PCSTR, pvaluename: PCSTR, ptype: Long, pdata: Long, nsize: UInt, pcbneeded: Long): UInt =
    0u

public actual fun GetPrinterDataExW(hprinter: PRINTER_HANDLE, pkeyname: PCWSTR, pvaluename: PCWSTR, ptype: Long, pdata: Long, nsize: UInt, pcbneeded: Long): UInt =
    0u

public actual fun GetPrinterDataW(hprinter: PRINTER_HANDLE, pvaluename: PCWSTR, ptype: Long, pdata: Long, nsize: UInt, pcbneeded: Long): UInt =
    0u

public actual fun GetPrinterDriver2A(hwnd: HWND, hprinter: PRINTER_HANDLE, penvironment: PCSTR, level: UInt, pdriverinfo: Long, cbbuf: UInt, pcbneeded: Long): BOOL =
    0

public actual fun GetPrinterDriver2W(hwnd: HWND, hprinter: PRINTER_HANDLE, penvironment: PCWSTR, level: UInt, pdriverinfo: Long, cbbuf: UInt, pcbneeded: Long): BOOL =
    0

public actual fun GetPrinterDriverA(hprinter: PRINTER_HANDLE, penvironment: PCSTR, level: UInt, pdriverinfo: Long, cbbuf: UInt, pcbneeded: Long): BOOL =
    0

public actual fun GetPrinterDriverDirectoryA(pname: PCSTR, penvironment: PCSTR, level: UInt, pdriverdirectory: Long, cbbuf: UInt, pcbneeded: Long): BOOL =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_GetPrinterDriverDirectoryA(pname, penvironment, level.toInt(), pdriverdirectory, cbbuf.toInt(), pcbneeded)

public actual fun GetPrinterDriverDirectoryW(pname: PCWSTR, penvironment: PCWSTR, level: UInt, pdriverdirectory: Long, cbbuf: UInt, pcbneeded: Long): BOOL =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_GetPrinterDriverDirectoryW(pname, penvironment, level.toInt(), pdriverdirectory, cbbuf.toInt(), pcbneeded)

public actual fun GetPrinterDriverPackagePathA(pszserver: PCSTR, pszenvironment: PCSTR, pszlanguage: PCSTR, pszpackageid: PCSTR, pszdriverpackagecab: PSTR, cchdriverpackagecab: UInt, pcchrequiredsize: Long): HRESULT =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_GetPrinterDriverPackagePathA(pszserver, pszenvironment, pszlanguage, pszpackageid, pszdriverpackagecab, cchdriverpackagecab.toInt(), pcchrequiredsize)

public actual fun GetPrinterDriverPackagePathW(pszserver: PCWSTR, pszenvironment: PCWSTR, pszlanguage: PCWSTR, pszpackageid: PCWSTR, pszdriverpackagecab: PWSTR, cchdriverpackagecab: UInt, pcchrequiredsize: Long): HRESULT =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_GetPrinterDriverPackagePathW(pszserver, pszenvironment, pszlanguage, pszpackageid, pszdriverpackagecab, cchdriverpackagecab.toInt(), pcchrequiredsize)

public actual fun GetPrinterDriverW(hprinter: PRINTER_HANDLE, penvironment: PCWSTR, level: UInt, pdriverinfo: Long, cbbuf: UInt, pcbneeded: Long): BOOL =
    0

public actual fun GetPrinterW(hprinter: PRINTER_HANDLE, level: UInt, pprinter: Long, cbbuf: UInt, pcbneeded: Long): BOOL =
    0

public actual fun GetSpoolFileHandle(hprinter: PRINTER_HANDLE): HANDLE =
    0L

public actual fun ImpersonatePrinterClient(htoken: HANDLE): BOOL =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_ImpersonatePrinterClient(htoken)

public actual fun InstallPrinterDriverFromPackageA(pszserver: PCSTR, pszinfpath: PCSTR, pszdrivername: PCSTR, pszenvironment: PCSTR, dwflags: UInt): HRESULT =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_InstallPrinterDriverFromPackageA(pszserver, pszinfpath, pszdrivername, pszenvironment, dwflags.toInt())

public actual fun InstallPrinterDriverFromPackageW(pszserver: PCWSTR, pszinfpath: PCWSTR, pszdrivername: PCWSTR, pszenvironment: PCWSTR, dwflags: UInt): HRESULT =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_InstallPrinterDriverFromPackageW(pszserver, pszinfpath, pszdrivername, pszenvironment, dwflags.toInt())

public actual fun IsValidDevmodeA(pdevmode: Long, devmodesize: ULong): BOOL =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_IsValidDevmodeA(pdevmode, devmodesize.toLong())

public actual fun IsValidDevmodeW(pdevmode: Long, devmodesize: ULong): BOOL =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_IsValidDevmodeW(pdevmode, devmodesize.toLong())

public actual fun OpenPrinter2A(pprintername: PCSTR, phprinter: Long, pdefault: Long, poptions: Long): BOOL =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_OpenPrinter2A(pprintername, phprinter, pdefault, poptions)

public actual fun OpenPrinter2W(pprintername: PCWSTR, phprinter: Long, pdefault: Long, poptions: Long): BOOL =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_OpenPrinter2W(pprintername, phprinter, pdefault, poptions)

public actual fun OpenPrinterA(pprintername: PCSTR, phprinter: Long, pdefault: Long): BOOL =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_OpenPrinterA(pprintername, phprinter, pdefault)

public actual fun OpenPrinterW(pprintername: PCWSTR, phprinter: Long, pdefault: Long): BOOL =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_OpenPrinterW(pprintername, phprinter, pdefault)

public actual fun PartialReplyPrinterChangeNotification(hprinter: PRINTER_HANDLE, pdatasrc: Long): BOOL =
    0

public actual fun PlayGdiScriptOnPrinterIC(hprinteric: HANDLE, pin: Long, cin: UInt, pout: Long, cout: UInt, ul: UInt): BOOL =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_PlayGdiScriptOnPrinterIC(hprinteric, pin, cin.toInt(), pout, cout.toInt(), ul.toInt())

public actual fun PrinterMessageBoxA(hprinter: PRINTER_HANDLE, error: UInt, hwnd: HWND, ptext: PCSTR, pcaption: PCSTR, dwtype: UInt): UInt =
    0u

public actual fun PrinterMessageBoxW(hprinter: PRINTER_HANDLE, error: UInt, hwnd: HWND, ptext: PCWSTR, pcaption: PCWSTR, dwtype: UInt): UInt =
    0u

public actual fun PrinterProperties(hwnd: HWND, hprinter: PRINTER_HANDLE): BOOL =
    0

public actual fun ProvidorFindClosePrinterChangeNotification(hprinter: PRINTER_HANDLE): BOOL =
    0

public actual fun ProvidorFindFirstPrinterChangeNotification(hprinter: PRINTER_HANDLE, fdwflags: UInt, fdwoptions: UInt, hnotify: HANDLE, pprinternotifyoptions: Long, pvreserved1: Long): BOOL =
    0

public actual fun ReadPrinter(hprinter: PRINTER_HANDLE, pbuf: Long, cbbuf: UInt, pnobytesread: Long): BOOL =
    0

public actual fun RegisterForPrintAsyncNotifications(pszname: PCWSTR, pnotificationtype: Long, euserfilter: PrintAsyncNotifyUserFilter, econversationstyle: PrintAsyncNotifyConversationStyle, pcallback: Long, phnotify: Long): HRESULT =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_RegisterForPrintAsyncNotifications(pszname, pnotificationtype, euserfilter, econversationstyle, pcallback, phnotify)

public actual fun RemovePrintDeviceObject(hdeviceobject: HANDLE): HRESULT =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_RemovePrintDeviceObject(hdeviceobject)

public actual fun ReplyPrinterChangeNotification(hprinter: PRINTER_HANDLE, fdwchangeflags: UInt, pdwresult: Long, pprinternotifyinfo: Long): BOOL =
    0

public actual fun ReplyPrinterChangeNotificationEx(hnotify: HANDLE, dwcolor: UInt, fdwflags: UInt, pdwresult: Long, pprinternotifyinfo: Long): BOOL =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_ReplyPrinterChangeNotificationEx(hnotify, dwcolor.toInt(), fdwflags.toInt(), pdwresult, pprinternotifyinfo)

public actual fun ReportJobProcessingProgress(printerhandle: HANDLE, jobid: UInt, joboperation: EPrintXPSJobOperation, jobprogress: EPrintXPSJobProgress): HRESULT =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_ReportJobProcessingProgress(printerhandle, jobid.toInt(), joboperation, jobprogress)

public actual fun ResetPrinterA(hprinter: PRINTER_HANDLE, pdefault: Long): BOOL =
    0

public actual fun ResetPrinterW(hprinter: PRINTER_HANDLE, pdefault: Long): BOOL =
    0

public actual fun RevertToPrinterSelf(): HANDLE =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_RevertToPrinterSelf()

public actual fun RouterAllocBidiMem(numbytes: ULong): Long =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_RouterAllocBidiMem(numbytes.toLong())

public actual fun RouterAllocBidiResponseContainer(count: UInt): Long =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_RouterAllocBidiResponseContainer(count.toInt())

public actual fun RouterAllocPrinterNotifyInfo(cprinternotifyinfodata: UInt): Long =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_RouterAllocPrinterNotifyInfo(cprinternotifyinfodata.toInt())

public actual fun RouterFreeBidiMem(pmempointer: Long) {
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_RouterFreeBidiMem(pmempointer)
}

public actual fun RouterFreeBidiResponseContainer(pdata: Long): UInt =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_RouterFreeBidiResponseContainer(pdata).toUInt()

public actual fun RouterFreePrinterNotifyInfo(pinfo: Long): BOOL =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_RouterFreePrinterNotifyInfo(pinfo)

public actual fun ScheduleJob(hprinter: PRINTER_HANDLE, jobid: UInt): BOOL =
    0

public actual fun SetCPSUIUserData(hdlg: HWND, cpsuiuserdata: ULong): BOOL =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_SetCPSUIUserData(hdlg, cpsuiuserdata.toLong())

public actual fun SetDefaultPrinterA(pszprinter: PCSTR): BOOL =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_SetDefaultPrinterA(pszprinter)

public actual fun SetDefaultPrinterW(pszprinter: PCWSTR): BOOL =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_SetDefaultPrinterW(pszprinter)

public actual fun SetFormA(hprinter: PRINTER_HANDLE, pformname: PCSTR, level: UInt, pform: Long): BOOL =
    0

public actual fun SetFormW(hprinter: PRINTER_HANDLE, pformname: PCWSTR, level: UInt, pform: Long): BOOL =
    0

public actual fun SetJobA(hprinter: PRINTER_HANDLE, jobid: UInt, level: UInt, pjob: Long, command: UInt): BOOL =
    0

public actual fun SetJobNamedProperty(hprinter: PRINTER_HANDLE, jobid: UInt, pproperty: Long): UInt =
    0u

public actual fun SetJobW(hprinter: PRINTER_HANDLE, jobid: UInt, level: UInt, pjob: Long, command: UInt): BOOL =
    0

public actual fun SetPortA(pname: PCSTR, pportname: PCSTR, dwlevel: UInt, pportinfo: Long): BOOL =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_SetPortA(pname, pportname, dwlevel.toInt(), pportinfo)

public actual fun SetPortW(pname: PCWSTR, pportname: PCWSTR, dwlevel: UInt, pportinfo: Long): BOOL =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_SetPortW(pname, pportname, dwlevel.toInt(), pportinfo)

public actual fun SetPrinterA(hprinter: PRINTER_HANDLE, level: UInt, pprinter: Long, command: UInt): BOOL =
    0

public actual fun SetPrinterDataA(hprinter: PRINTER_HANDLE, pvaluename: PCSTR, type: UInt, pdata: Long, cbdata: UInt): UInt =
    0u

public actual fun SetPrinterDataExA(hprinter: PRINTER_HANDLE, pkeyname: PCSTR, pvaluename: PCSTR, type: UInt, pdata: Long, cbdata: UInt): UInt =
    0u

public actual fun SetPrinterDataExW(hprinter: PRINTER_HANDLE, pkeyname: PCWSTR, pvaluename: PCWSTR, type: UInt, pdata: Long, cbdata: UInt): UInt =
    0u

public actual fun SetPrinterDataW(hprinter: PRINTER_HANDLE, pvaluename: PCWSTR, type: UInt, pdata: Long, cbdata: UInt): UInt =
    0u

public actual fun SetPrinterW(hprinter: PRINTER_HANDLE, level: UInt, pprinter: Long, command: UInt): BOOL =
    0

public actual fun SplIsSessionZero(hprinter: PRINTER_HANDLE, jobid: UInt, pissessionzero: Long): UInt =
    0u

public actual fun SplPromptUIInUsersSession(hprinter: PRINTER_HANDLE, jobid: UInt, puiparams: Long, presponse: Long): BOOL =
    0

public actual fun SpoolerCopyFileEvent(pszprintername: PCWSTR, pszkey: PCWSTR, dwcopyfileevent: UInt): BOOL =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_SpoolerCopyFileEvent(pszprintername, pszkey, dwcopyfileevent.toInt())

public actual fun SpoolerFindClosePrinterChangeNotification(hprinter: PRINTER_HANDLE): BOOL =
    0

public actual fun SpoolerFindFirstPrinterChangeNotification(hprinter: PRINTER_HANDLE, fdwfilterflags: UInt, fdwoptions: UInt, pprinternotifyoptions: Long, pvreserved: Long, pnotificationconfig: Long, phnotify: Long, phevent: Long): BOOL =
    0

public actual fun SpoolerFindNextPrinterChangeNotification(hprinter: PRINTER_HANDLE, pfdwchange: Long, pprinternotifyoptions: Long, ppprinternotifyinfo: Long): BOOL =
    0

public actual fun SpoolerFreePrinterNotifyInfo(pinfo: Long) {
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_SpoolerFreePrinterNotifyInfo(pinfo)
}

public actual fun SpoolerRefreshPrinterChangeNotification(hprinter: PRINTER_HANDLE, dwcolor: UInt, poptions: Long, ppinfo: Long): BOOL =
    0

public actual fun StartDocPrinterA(hprinter: PRINTER_HANDLE, level: UInt, pdocinfo: Long): UInt =
    0u

public actual fun StartDocPrinterW(hprinter: PRINTER_HANDLE, level: UInt, pdocinfo: Long): UInt =
    0u

public actual fun StartPagePrinter(hprinter: PRINTER_HANDLE): BOOL =
    0

public actual fun UnRegisterForPrintAsyncNotifications(param0: HANDLE): HRESULT =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_UnRegisterForPrintAsyncNotifications(param0)

public actual fun UpdatePrintDeviceObject(hprinter: PRINTER_HANDLE, hdeviceobject: HANDLE): HRESULT =
    0

public actual fun UploadPrinterDriverPackageA(pszserver: PCSTR, pszinfpath: PCSTR, pszenvironment: PCSTR, dwflags: UInt, hwnd: HWND, pszdestinfpath: PSTR, pcchdestinfpath: Long): HRESULT =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_UploadPrinterDriverPackageA(pszserver, pszinfpath, pszenvironment, dwflags.toInt(), hwnd, pszdestinfpath, pcchdestinfpath)

public actual fun UploadPrinterDriverPackageW(pszserver: PCWSTR, pszinfpath: PCWSTR, pszenvironment: PCWSTR, dwflags: UInt, hwnd: HWND, pszdestinfpath: PWSTR, pcchdestinfpath: Long): HRESULT =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_UploadPrinterDriverPackageW(pszserver, pszinfpath, pszenvironment, dwflags.toInt(), hwnd, pszdestinfpath, pcchdestinfpath)

public actual fun WaitForPrinterChange(hprinter: PRINTER_HANDLE, flags: UInt): UInt =
    0u

public actual fun WritePrinter(hprinter: PRINTER_HANDLE, pbuf: Long, cbbuf: UInt, pcwritten: Long): BOOL =
    0

public actual fun XcvDataW(hxcv: HANDLE, pszdataname: PCWSTR, pinputdata: Long, cbinputdata: UInt, poutputdata: Long, cboutputdata: UInt, pcboutputneeded: Long, pdwstatus: Long): BOOL =
    WindowsWin32GraphicsPrintingJniBridge.windowssys_windows_win32_graphics_printing_XcvDataW(hxcv, pszdataname, pinputdata, cbinputdata.toInt(), poutputdata, cboutputdata.toInt(), pcboutputneeded, pdwstatus)
