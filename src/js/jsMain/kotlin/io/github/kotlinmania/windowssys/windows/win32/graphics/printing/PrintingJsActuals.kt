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

private val _windowsWin32GraphicsPrintingNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

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
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_AddMonitorA(pname.toString(), level.toInt(), pmonitors.toString()) as Int) else 0

public actual fun AddMonitorW(pname: PCWSTR, level: UInt, pmonitors: Long): BOOL =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_AddMonitorW(pname.toString(), level.toInt(), pmonitors.toString()) as Int) else 0

public actual fun AddPortA(pname: PCSTR, hwnd: HWND, pmonitorname: PCSTR): BOOL =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_AddPortA(pname.toString(), hwnd.toString(), pmonitorname.toString()) as Int) else 0

public actual fun AddPortW(pname: PCWSTR, hwnd: HWND, pmonitorname: PCWSTR): BOOL =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_AddPortW(pname.toString(), hwnd.toString(), pmonitorname.toString()) as Int) else 0

public actual fun AddPrintDeviceObject(hprinter: PRINTER_HANDLE, phdeviceobject: Long): HRESULT =
    0

public actual fun AddPrintProcessorA(pname: PCSTR, penvironment: PCSTR, ppathname: PCSTR, pprintprocessorname: PCSTR): BOOL =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_AddPrintProcessorA(pname.toString(), penvironment.toString(), ppathname.toString(), pprintprocessorname.toString()) as Int) else 0

public actual fun AddPrintProcessorW(pname: PCWSTR, penvironment: PCWSTR, ppathname: PCWSTR, pprintprocessorname: PCWSTR): BOOL =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_AddPrintProcessorW(pname.toString(), penvironment.toString(), ppathname.toString(), pprintprocessorname.toString()) as Int) else 0

public actual fun AddPrintProvidorA(pname: PCSTR, level: UInt, pprovidorinfo: Long): BOOL =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_AddPrintProvidorA(pname.toString(), level.toInt(), pprovidorinfo.toString()) as Int) else 0

public actual fun AddPrintProvidorW(pname: PCWSTR, level: UInt, pprovidorinfo: Long): BOOL =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_AddPrintProvidorW(pname.toString(), level.toInt(), pprovidorinfo.toString()) as Int) else 0

public actual fun AddPrinterA(pname: PCSTR, level: UInt, pprinter: Long): HANDLE =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_AddPrinterA(pname.toString(), level.toInt(), pprinter.toString()) as String).toLong() else 0L

public actual fun AddPrinterConnection2A(hwnd: HWND, pszname: PCSTR, dwlevel: UInt, pconnectioninfo: Long): BOOL =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_AddPrinterConnection2A(hwnd.toString(), pszname.toString(), dwlevel.toInt(), pconnectioninfo.toString()) as Int) else 0

public actual fun AddPrinterConnection2W(hwnd: HWND, pszname: PCWSTR, dwlevel: UInt, pconnectioninfo: Long): BOOL =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_AddPrinterConnection2W(hwnd.toString(), pszname.toString(), dwlevel.toInt(), pconnectioninfo.toString()) as Int) else 0

public actual fun AddPrinterConnectionA(pname: PCSTR): BOOL =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_AddPrinterConnectionA(pname.toString()) as Int) else 0

public actual fun AddPrinterConnectionW(pname: PCWSTR): BOOL =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_AddPrinterConnectionW(pname.toString()) as Int) else 0

public actual fun AddPrinterDriverA(pname: PCSTR, level: UInt, pdriverinfo: Long): BOOL =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_AddPrinterDriverA(pname.toString(), level.toInt(), pdriverinfo.toString()) as Int) else 0

public actual fun AddPrinterDriverExA(pname: PCSTR, level: UInt, lpbdriverinfo: Long, dwfilecopyflags: UInt): BOOL =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_AddPrinterDriverExA(pname.toString(), level.toInt(), lpbdriverinfo.toString(), dwfilecopyflags.toInt()) as Int) else 0

public actual fun AddPrinterDriverExW(pname: PCWSTR, level: UInt, lpbdriverinfo: Long, dwfilecopyflags: UInt): BOOL =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_AddPrinterDriverExW(pname.toString(), level.toInt(), lpbdriverinfo.toString(), dwfilecopyflags.toInt()) as Int) else 0

public actual fun AddPrinterDriverW(pname: PCWSTR, level: UInt, pdriverinfo: Long): BOOL =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_AddPrinterDriverW(pname.toString(), level.toInt(), pdriverinfo.toString()) as Int) else 0

public actual fun AddPrinterW(pname: PCWSTR, level: UInt, pprinter: Long): HANDLE =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_AddPrinterW(pname.toString(), level.toInt(), pprinter.toString()) as String).toLong() else 0L

public actual fun AdvancedDocumentPropertiesA(hwnd: HWND, hprinter: PRINTER_HANDLE, pdevicename: PCSTR, pdevmodeoutput: Long, pdevmodeinput: Long): Int =
    0

public actual fun AdvancedDocumentPropertiesW(hwnd: HWND, hprinter: PRINTER_HANDLE, pdevicename: PCWSTR, pdevmodeoutput: Long, pdevmodeinput: Long): Int =
    0

public actual fun AppendPrinterNotifyInfoData(pinfodest: Long, pdatasrc: Long, fdwflags: UInt): BOOL =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_AppendPrinterNotifyInfoData(pinfodest.toString(), pdatasrc.toString(), fdwflags.toInt()) as Int) else 0

public actual fun CallRouterFindFirstPrinterChangeNotification(hprinterrpc: HANDLE, fdwfilterflags: UInt, fdwoptions: UInt, hnotify: HANDLE, pprinternotifyoptions: Long): UInt =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_CallRouterFindFirstPrinterChangeNotification(hprinterrpc.toString(), fdwfilterflags.toInt(), fdwoptions.toInt(), hnotify.toString(), pprinternotifyoptions.toString()) as Int).toUInt() else 0u

public actual fun ClosePrinter(hprinter: PRINTER_HANDLE): BOOL =
    0

public actual fun CloseSpoolFileHandle(hprinter: PRINTER_HANDLE, hspoolfile: HANDLE): BOOL =
    0

public actual fun CommitSpoolData(hprinter: PRINTER_HANDLE, hspoolfile: HANDLE, cbcommit: UInt): HANDLE =
    0L

public actual fun CommonPropertySheetUIA(hwndowner: HWND, pfnpropsheetui: PFNPROPSHEETUI, lparam: LPARAM, presult: Long): Int =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_CommonPropertySheetUIA(hwndowner.toString(), pfnpropsheetui.toLong().toString(), lparam.toString(), presult.toString()) as Int) else 0

public actual fun CommonPropertySheetUIW(hwndowner: HWND, pfnpropsheetui: PFNPROPSHEETUI, lparam: LPARAM, presult: Long): Int =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_CommonPropertySheetUIW(hwndowner.toString(), pfnpropsheetui.toLong().toString(), lparam.toString(), presult.toString()) as Int) else 0

public actual fun ConfigurePortA(pname: PCSTR, hwnd: HWND, pportname: PCSTR): BOOL =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_ConfigurePortA(pname.toString(), hwnd.toString(), pportname.toString()) as Int) else 0

public actual fun ConfigurePortW(pname: PCWSTR, hwnd: HWND, pportname: PCWSTR): BOOL =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_ConfigurePortW(pname.toString(), hwnd.toString(), pportname.toString()) as Int) else 0

public actual fun ConnectToPrinterDlg(hwnd: HWND, flags: UInt): HANDLE =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_ConnectToPrinterDlg(hwnd.toString(), flags.toInt()) as String).toLong() else 0L

public actual fun CorePrinterDriverInstalledA(pszserver: PCSTR, pszenvironment: PCSTR, coredriverguid: GUID, ftdriverdate: FILETIME, dwldriverversion: ULong, pbdriverinstalled: Long): HRESULT =
    0

public actual fun CorePrinterDriverInstalledW(pszserver: PCWSTR, pszenvironment: PCWSTR, coredriverguid: GUID, ftdriverdate: FILETIME, dwldriverversion: ULong, pbdriverinstalled: Long): HRESULT =
    0

public actual fun CreatePrintAsyncNotifyChannel(pszname: PCWSTR, pnotificationtype: Long, euserfilter: PrintAsyncNotifyUserFilter, econversationstyle: PrintAsyncNotifyConversationStyle, pcallback: Long, ppiasynchnotification: Long): HRESULT =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_CreatePrintAsyncNotifyChannel(pszname.toString(), pnotificationtype.toString(), euserfilter, econversationstyle, pcallback.toString(), ppiasynchnotification.toString()) as Int) else 0

public actual fun CreatePrinterIC(hprinter: PRINTER_HANDLE, pdevmode: Long): HANDLE =
    0L

public actual fun DeleteFormA(hprinter: PRINTER_HANDLE, pformname: PCSTR): BOOL =
    0

public actual fun DeleteFormW(hprinter: PRINTER_HANDLE, pformname: PCWSTR): BOOL =
    0

public actual fun DeleteJobNamedProperty(hprinter: PRINTER_HANDLE, jobid: UInt, pszname: PCWSTR): UInt =
    0u

public actual fun DeleteMonitorA(pname: PCSTR, penvironment: PCSTR, pmonitorname: PCSTR): BOOL =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_DeleteMonitorA(pname.toString(), penvironment.toString(), pmonitorname.toString()) as Int) else 0

public actual fun DeleteMonitorW(pname: PCWSTR, penvironment: PCWSTR, pmonitorname: PCWSTR): BOOL =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_DeleteMonitorW(pname.toString(), penvironment.toString(), pmonitorname.toString()) as Int) else 0

public actual fun DeletePortA(pname: PCSTR, hwnd: HWND, pportname: PCSTR): BOOL =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_DeletePortA(pname.toString(), hwnd.toString(), pportname.toString()) as Int) else 0

public actual fun DeletePortW(pname: PCWSTR, hwnd: HWND, pportname: PCWSTR): BOOL =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_DeletePortW(pname.toString(), hwnd.toString(), pportname.toString()) as Int) else 0

public actual fun DeletePrintProcessorA(pname: PCSTR, penvironment: PCSTR, pprintprocessorname: PCSTR): BOOL =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_DeletePrintProcessorA(pname.toString(), penvironment.toString(), pprintprocessorname.toString()) as Int) else 0

public actual fun DeletePrintProcessorW(pname: PCWSTR, penvironment: PCWSTR, pprintprocessorname: PCWSTR): BOOL =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_DeletePrintProcessorW(pname.toString(), penvironment.toString(), pprintprocessorname.toString()) as Int) else 0

public actual fun DeletePrintProvidorA(pname: PCSTR, penvironment: PCSTR, pprintprovidorname: PCSTR): BOOL =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_DeletePrintProvidorA(pname.toString(), penvironment.toString(), pprintprovidorname.toString()) as Int) else 0

public actual fun DeletePrintProvidorW(pname: PCWSTR, penvironment: PCWSTR, pprintprovidorname: PCWSTR): BOOL =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_DeletePrintProvidorW(pname.toString(), penvironment.toString(), pprintprovidorname.toString()) as Int) else 0

public actual fun DeletePrinter(hprinter: PRINTER_HANDLE): BOOL =
    0

public actual fun DeletePrinterConnectionA(pname: PCSTR): BOOL =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_DeletePrinterConnectionA(pname.toString()) as Int) else 0

public actual fun DeletePrinterConnectionW(pname: PCWSTR): BOOL =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_DeletePrinterConnectionW(pname.toString()) as Int) else 0

public actual fun DeletePrinterDataA(hprinter: PRINTER_HANDLE, pvaluename: PCSTR): UInt =
    0u

public actual fun DeletePrinterDataExA(hprinter: PRINTER_HANDLE, pkeyname: PCSTR, pvaluename: PCSTR): UInt =
    0u

public actual fun DeletePrinterDataExW(hprinter: PRINTER_HANDLE, pkeyname: PCWSTR, pvaluename: PCWSTR): UInt =
    0u

public actual fun DeletePrinterDataW(hprinter: PRINTER_HANDLE, pvaluename: PCWSTR): UInt =
    0u

public actual fun DeletePrinterDriverA(pname: PCSTR, penvironment: PCSTR, pdrivername: PCSTR): BOOL =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_DeletePrinterDriverA(pname.toString(), penvironment.toString(), pdrivername.toString()) as Int) else 0

public actual fun DeletePrinterDriverExA(pname: PCSTR, penvironment: PCSTR, pdrivername: PCSTR, dwdeleteflag: UInt, dwversionflag: UInt): BOOL =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_DeletePrinterDriverExA(pname.toString(), penvironment.toString(), pdrivername.toString(), dwdeleteflag.toInt(), dwversionflag.toInt()) as Int) else 0

public actual fun DeletePrinterDriverExW(pname: PCWSTR, penvironment: PCWSTR, pdrivername: PCWSTR, dwdeleteflag: UInt, dwversionflag: UInt): BOOL =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_DeletePrinterDriverExW(pname.toString(), penvironment.toString(), pdrivername.toString(), dwdeleteflag.toInt(), dwversionflag.toInt()) as Int) else 0

public actual fun DeletePrinterDriverPackageA(pszserver: PCSTR, pszinfpath: PCSTR, pszenvironment: PCSTR): HRESULT =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_DeletePrinterDriverPackageA(pszserver.toString(), pszinfpath.toString(), pszenvironment.toString()) as Int) else 0

public actual fun DeletePrinterDriverPackageW(pszserver: PCWSTR, pszinfpath: PCWSTR, pszenvironment: PCWSTR): HRESULT =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_DeletePrinterDriverPackageW(pszserver.toString(), pszinfpath.toString(), pszenvironment.toString()) as Int) else 0

public actual fun DeletePrinterDriverW(pname: PCWSTR, penvironment: PCWSTR, pdrivername: PCWSTR): BOOL =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_DeletePrinterDriverW(pname.toString(), penvironment.toString(), pdrivername.toString()) as Int) else 0

public actual fun DeletePrinterIC(hprinteric: HANDLE): BOOL =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_DeletePrinterIC(hprinteric.toString()) as Int) else 0

public actual fun DeletePrinterKeyA(hprinter: PRINTER_HANDLE, pkeyname: PCSTR): UInt =
    0u

public actual fun DeletePrinterKeyW(hprinter: PRINTER_HANDLE, pkeyname: PCWSTR): UInt =
    0u

public actual fun DevQueryPrint(hprinter: PRINTER_HANDLE, pdevmode: Long, presid: Long): BOOL =
    0

public actual fun DevQueryPrintEx(pdqpinfo: Long): BOOL =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_DevQueryPrintEx(pdqpinfo.toString()) as Int) else 0

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
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_EnumMonitorsA(pname.toString(), level.toInt(), pmonitor.toString(), cbbuf.toInt(), pcbneeded.toString(), pcreturned.toString()) as Int) else 0

public actual fun EnumMonitorsW(pname: PCWSTR, level: UInt, pmonitor: Long, cbbuf: UInt, pcbneeded: Long, pcreturned: Long): BOOL =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_EnumMonitorsW(pname.toString(), level.toInt(), pmonitor.toString(), cbbuf.toInt(), pcbneeded.toString(), pcreturned.toString()) as Int) else 0

public actual fun EnumPortsA(pname: PCSTR, level: UInt, pport: Long, cbbuf: UInt, pcbneeded: Long, pcreturned: Long): BOOL =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_EnumPortsA(pname.toString(), level.toInt(), pport.toString(), cbbuf.toInt(), pcbneeded.toString(), pcreturned.toString()) as Int) else 0

public actual fun EnumPortsW(pname: PCWSTR, level: UInt, pport: Long, cbbuf: UInt, pcbneeded: Long, pcreturned: Long): BOOL =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_EnumPortsW(pname.toString(), level.toInt(), pport.toString(), cbbuf.toInt(), pcbneeded.toString(), pcreturned.toString()) as Int) else 0

public actual fun EnumPrintProcessorDatatypesA(pname: PCSTR, pprintprocessorname: PCSTR, level: UInt, pdatatypes: Long, cbbuf: UInt, pcbneeded: Long, pcreturned: Long): BOOL =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_EnumPrintProcessorDatatypesA(pname.toString(), pprintprocessorname.toString(), level.toInt(), pdatatypes.toString(), cbbuf.toInt(), pcbneeded.toString(), pcreturned.toString()) as Int) else 0

public actual fun EnumPrintProcessorDatatypesW(pname: PCWSTR, pprintprocessorname: PCWSTR, level: UInt, pdatatypes: Long, cbbuf: UInt, pcbneeded: Long, pcreturned: Long): BOOL =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_EnumPrintProcessorDatatypesW(pname.toString(), pprintprocessorname.toString(), level.toInt(), pdatatypes.toString(), cbbuf.toInt(), pcbneeded.toString(), pcreturned.toString()) as Int) else 0

public actual fun EnumPrintProcessorsA(pname: PCSTR, penvironment: PCSTR, level: UInt, pprintprocessorinfo: Long, cbbuf: UInt, pcbneeded: Long, pcreturned: Long): BOOL =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_EnumPrintProcessorsA(pname.toString(), penvironment.toString(), level.toInt(), pprintprocessorinfo.toString(), cbbuf.toInt(), pcbneeded.toString(), pcreturned.toString()) as Int) else 0

public actual fun EnumPrintProcessorsW(pname: PCWSTR, penvironment: PCWSTR, level: UInt, pprintprocessorinfo: Long, cbbuf: UInt, pcbneeded: Long, pcreturned: Long): BOOL =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_EnumPrintProcessorsW(pname.toString(), penvironment.toString(), level.toInt(), pprintprocessorinfo.toString(), cbbuf.toInt(), pcbneeded.toString(), pcreturned.toString()) as Int) else 0

public actual fun EnumPrinterDataA(hprinter: PRINTER_HANDLE, dwindex: UInt, pvaluename: PSTR, cbvaluename: UInt, pcbvaluename: Long, ptype: Long, pdata: Long, cbdata: UInt, pcbdata: Long): UInt =
    0u

public actual fun EnumPrinterDataExA(hprinter: PRINTER_HANDLE, pkeyname: PCSTR, penumvalues: Long, cbenumvalues: UInt, pcbenumvalues: Long, pnenumvalues: Long): UInt =
    0u

public actual fun EnumPrinterDataExW(hprinter: PRINTER_HANDLE, pkeyname: PCWSTR, penumvalues: Long, cbenumvalues: UInt, pcbenumvalues: Long, pnenumvalues: Long): UInt =
    0u

public actual fun EnumPrinterDataW(hprinter: PRINTER_HANDLE, dwindex: UInt, pvaluename: PWSTR, cbvaluename: UInt, pcbvaluename: Long, ptype: Long, pdata: Long, cbdata: UInt, pcbdata: Long): UInt =
    0u

public actual fun EnumPrinterDriversA(pname: PCSTR, penvironment: PCSTR, level: UInt, pdriverinfo: Long, cbbuf: UInt, pcbneeded: Long, pcreturned: Long): BOOL =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_EnumPrinterDriversA(pname.toString(), penvironment.toString(), level.toInt(), pdriverinfo.toString(), cbbuf.toInt(), pcbneeded.toString(), pcreturned.toString()) as Int) else 0

public actual fun EnumPrinterDriversW(pname: PCWSTR, penvironment: PCWSTR, level: UInt, pdriverinfo: Long, cbbuf: UInt, pcbneeded: Long, pcreturned: Long): BOOL =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_EnumPrinterDriversW(pname.toString(), penvironment.toString(), level.toInt(), pdriverinfo.toString(), cbbuf.toInt(), pcbneeded.toString(), pcreturned.toString()) as Int) else 0

public actual fun EnumPrinterKeyA(hprinter: PRINTER_HANDLE, pkeyname: PCSTR, psubkey: PSTR, cbsubkey: UInt, pcbsubkey: Long): UInt =
    0u

public actual fun EnumPrinterKeyW(hprinter: PRINTER_HANDLE, pkeyname: PCWSTR, psubkey: PWSTR, cbsubkey: UInt, pcbsubkey: Long): UInt =
    0u

public actual fun EnumPrintersA(flags: UInt, name: PCSTR, level: UInt, pprinterenum: Long, cbbuf: UInt, pcbneeded: Long, pcreturned: Long): BOOL =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_EnumPrintersA(flags.toInt(), name.toString(), level.toInt(), pprinterenum.toString(), cbbuf.toInt(), pcbneeded.toString(), pcreturned.toString()) as Int) else 0

public actual fun EnumPrintersW(flags: UInt, name: PCWSTR, level: UInt, pprinterenum: Long, cbbuf: UInt, pcbneeded: Long, pcreturned: Long): BOOL =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_EnumPrintersW(flags.toInt(), name.toString(), level.toInt(), pprinterenum.toString(), cbbuf.toInt(), pcbneeded.toString(), pcreturned.toString()) as Int) else 0

public actual fun ExtDeviceMode(hwnd: HWND, hinst: HANDLE, pdevmodeoutput: Long, pdevicename: PCSTR, pport: PCSTR, pdevmodeinput: Long, pprofile: PCSTR, fmode: UInt): Int =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_ExtDeviceMode(hwnd.toString(), hinst.toString(), pdevmodeoutput.toString(), pdevicename.toString(), pport.toString(), pdevmodeinput.toString(), pprofile.toString(), fmode.toInt()) as Int) else 0

public actual fun FindClosePrinterChangeNotification(hchange: HANDLE): BOOL =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_FindClosePrinterChangeNotification(hchange.toString()) as Int) else 0

public actual fun FindFirstPrinterChangeNotification(hprinter: PRINTER_HANDLE, fdwfilter: UInt, fdwoptions: UInt, pprinternotifyoptions: Long): HANDLE =
    0L

public actual fun FindNextPrinterChangeNotification(hchange: HANDLE, pdwchange: Long, pvreserved: Long, ppprinternotifyinfo: Long): BOOL =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_FindNextPrinterChangeNotification(hchange.toString(), pdwchange.toString(), pvreserved.toString(), ppprinternotifyinfo.toString()) as Int) else 0

public actual fun FlushPrinter(hprinter: PRINTER_HANDLE, pbuf: Long, cbbuf: UInt, pcwritten: Long, csleep: UInt): BOOL =
    0

public actual fun FreePrintNamedPropertyArray(cproperties: UInt, ppproperties: Long) {
    if (_windowsWin32GraphicsPrintingNapiAddon != null) {
        _windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_FreePrintNamedPropertyArray(cproperties.toInt(), ppproperties.toString())
    }
}

public actual fun FreePrintPropertyValue(pvalue: Long) {
    if (_windowsWin32GraphicsPrintingNapiAddon != null) {
        _windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_FreePrintPropertyValue(pvalue.toString())
    }
}

public actual fun FreePrinterNotifyInfo(pprinternotifyinfo: Long): BOOL =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_FreePrinterNotifyInfo(pprinternotifyinfo.toString()) as Int) else 0

public actual fun GdiDeleteSpoolFileHandle(spoolfilehandle: HANDLE): BOOL =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_GdiDeleteSpoolFileHandle(spoolfilehandle.toString()) as Int) else 0

public actual fun GdiEndDocEMF(spoolfilehandle: HANDLE): BOOL =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_GdiEndDocEMF(spoolfilehandle.toString()) as Int) else 0

public actual fun GdiEndPageEMF(spoolfilehandle: HANDLE, dwoptimization: UInt): BOOL =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_GdiEndPageEMF(spoolfilehandle.toString(), dwoptimization.toInt()) as Int) else 0

public actual fun GdiGetDC(spoolfilehandle: HANDLE): HDC =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_GdiGetDC(spoolfilehandle.toString()) as String).toLong() else 0L

public actual fun GdiGetDevmodeForPage(spoolfilehandle: HANDLE, dwpagenumber: UInt, pcurrdm: Long, plastdm: Long): BOOL =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_GdiGetDevmodeForPage(spoolfilehandle.toString(), dwpagenumber.toInt(), pcurrdm.toString(), plastdm.toString()) as Int) else 0

public actual fun GdiGetPageCount(spoolfilehandle: HANDLE): UInt =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_GdiGetPageCount(spoolfilehandle.toString()) as Int).toUInt() else 0u

public actual fun GdiGetPageHandle(spoolfilehandle: HANDLE, page: UInt, pdwpagetype: Long): HANDLE =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_GdiGetPageHandle(spoolfilehandle.toString(), page.toInt(), pdwpagetype.toString()) as String).toLong() else 0L

public actual fun GdiGetSpoolFileHandle(pwszprintername: PCWSTR, pdevmode: Long, pwszdocname: PCWSTR): HANDLE =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_GdiGetSpoolFileHandle(pwszprintername.toString(), pdevmode.toString(), pwszdocname.toString()) as String).toLong() else 0L

public actual fun GdiPlayPageEMF(spoolfilehandle: HANDLE, hemf: HANDLE, prectdocument: Long, prectborder: Long, prectclip: Long): BOOL =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_GdiPlayPageEMF(spoolfilehandle.toString(), hemf.toString(), prectdocument.toString(), prectborder.toString(), prectclip.toString()) as Int) else 0

public actual fun GdiResetDCEMF(spoolfilehandle: HANDLE, pcurrdm: Long): BOOL =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_GdiResetDCEMF(spoolfilehandle.toString(), pcurrdm.toString()) as Int) else 0

public actual fun GdiStartDocEMF(spoolfilehandle: HANDLE, pdocinfo: Long): BOOL =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_GdiStartDocEMF(spoolfilehandle.toString(), pdocinfo.toString()) as Int) else 0

public actual fun GdiStartPageEMF(spoolfilehandle: HANDLE): BOOL =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_GdiStartPageEMF(spoolfilehandle.toString()) as Int) else 0

public actual fun GenerateCopyFilePaths(pszprintername: PCWSTR, pszdirectory: PCWSTR, psplclientinfo: Long, dwlevel: UInt, pszsourcedir: PWSTR, pcchsourcedirsize: Long, psztargetdir: PWSTR, pcchtargetdirsize: Long, dwflags: UInt): UInt =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_GenerateCopyFilePaths(pszprintername.toString(), pszdirectory.toString(), psplclientinfo.toString(), dwlevel.toInt(), pszsourcedir.toString(), pcchsourcedirsize.toString(), psztargetdir.toString(), pcchtargetdirsize.toString(), dwflags.toInt()) as Int).toUInt() else 0u

public actual fun GetCPSUIUserData(hdlg: HWND): ULong =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_GetCPSUIUserData(hdlg.toString()) as String).toULong() else 0uL

public actual fun GetCorePrinterDriversA(pszserver: PCSTR, pszenvironment: PCSTR, pszzcoredriverdependencies: PCSTR, ccoreprinterdrivers: UInt, pcoreprinterdrivers: Long): HRESULT =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_GetCorePrinterDriversA(pszserver.toString(), pszenvironment.toString(), pszzcoredriverdependencies.toString(), ccoreprinterdrivers.toInt(), pcoreprinterdrivers.toString()) as Int) else 0

public actual fun GetCorePrinterDriversW(pszserver: PCWSTR, pszenvironment: PCWSTR, pszzcoredriverdependencies: PCWSTR, ccoreprinterdrivers: UInt, pcoreprinterdrivers: Long): HRESULT =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_GetCorePrinterDriversW(pszserver.toString(), pszenvironment.toString(), pszzcoredriverdependencies.toString(), ccoreprinterdrivers.toInt(), pcoreprinterdrivers.toString()) as Int) else 0

public actual fun GetDefaultPrinterA(pszbuffer: PSTR, pcchbuffer: Long): BOOL =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_GetDefaultPrinterA(pszbuffer.toString(), pcchbuffer.toString()) as Int) else 0

public actual fun GetDefaultPrinterW(pszbuffer: PWSTR, pcchbuffer: Long): BOOL =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_GetDefaultPrinterW(pszbuffer.toString(), pcchbuffer.toString()) as Int) else 0

public actual fun GetFormA(hprinter: PRINTER_HANDLE, pformname: PCSTR, level: UInt, pform: Long, cbbuf: UInt, pcbneeded: Long): BOOL =
    0

public actual fun GetFormW(hprinter: PRINTER_HANDLE, pformname: PCWSTR, level: UInt, pform: Long, cbbuf: UInt, pcbneeded: Long): BOOL =
    0

public actual fun GetJobA(hprinter: PRINTER_HANDLE, jobid: UInt, level: UInt, pjob: Long, cbbuf: UInt, pcbneeded: Long): BOOL =
    0

public actual fun GetJobAttributes(pprintername: PCWSTR, pdevmode: Long, pattributeinfo: Long): BOOL =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_GetJobAttributes(pprintername.toString(), pdevmode.toString(), pattributeinfo.toString()) as Int) else 0

public actual fun GetJobAttributesEx(pprintername: PCWSTR, pdevmode: Long, dwlevel: UInt, pattributeinfo: Long, nsize: UInt, dwflags: UInt): BOOL =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_GetJobAttributesEx(pprintername.toString(), pdevmode.toString(), dwlevel.toInt(), pattributeinfo.toString(), nsize.toInt(), dwflags.toInt()) as Int) else 0

public actual fun GetJobNamedPropertyValue(hprinter: PRINTER_HANDLE, jobid: UInt, pszname: PCWSTR, pvalue: Long): UInt =
    0u

public actual fun GetJobW(hprinter: PRINTER_HANDLE, jobid: UInt, level: UInt, pjob: Long, cbbuf: UInt, pcbneeded: Long): BOOL =
    0

public actual fun GetPrintExecutionData(pdata: Long): BOOL =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_GetPrintExecutionData(pdata.toString()) as Int) else 0

public actual fun GetPrintOutputInfo(hwnd: HWND, pszprinter: PCWSTR, phfile: Long, ppszoutputfile: Long): HRESULT =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_GetPrintOutputInfo(hwnd.toString(), pszprinter.toString(), phfile.toString(), ppszoutputfile.toString()) as Int) else 0

public actual fun GetPrintProcessorDirectoryA(pname: PCSTR, penvironment: PCSTR, level: UInt, pprintprocessorinfo: Long, cbbuf: UInt, pcbneeded: Long): BOOL =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_GetPrintProcessorDirectoryA(pname.toString(), penvironment.toString(), level.toInt(), pprintprocessorinfo.toString(), cbbuf.toInt(), pcbneeded.toString()) as Int) else 0

public actual fun GetPrintProcessorDirectoryW(pname: PCWSTR, penvironment: PCWSTR, level: UInt, pprintprocessorinfo: Long, cbbuf: UInt, pcbneeded: Long): BOOL =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_GetPrintProcessorDirectoryW(pname.toString(), penvironment.toString(), level.toInt(), pprintprocessorinfo.toString(), cbbuf.toInt(), pcbneeded.toString()) as Int) else 0

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
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_GetPrinterDriverDirectoryA(pname.toString(), penvironment.toString(), level.toInt(), pdriverdirectory.toString(), cbbuf.toInt(), pcbneeded.toString()) as Int) else 0

public actual fun GetPrinterDriverDirectoryW(pname: PCWSTR, penvironment: PCWSTR, level: UInt, pdriverdirectory: Long, cbbuf: UInt, pcbneeded: Long): BOOL =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_GetPrinterDriverDirectoryW(pname.toString(), penvironment.toString(), level.toInt(), pdriverdirectory.toString(), cbbuf.toInt(), pcbneeded.toString()) as Int) else 0

public actual fun GetPrinterDriverPackagePathA(pszserver: PCSTR, pszenvironment: PCSTR, pszlanguage: PCSTR, pszpackageid: PCSTR, pszdriverpackagecab: PSTR, cchdriverpackagecab: UInt, pcchrequiredsize: Long): HRESULT =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_GetPrinterDriverPackagePathA(pszserver.toString(), pszenvironment.toString(), pszlanguage.toString(), pszpackageid.toString(), pszdriverpackagecab.toString(), cchdriverpackagecab.toInt(), pcchrequiredsize.toString()) as Int) else 0

public actual fun GetPrinterDriverPackagePathW(pszserver: PCWSTR, pszenvironment: PCWSTR, pszlanguage: PCWSTR, pszpackageid: PCWSTR, pszdriverpackagecab: PWSTR, cchdriverpackagecab: UInt, pcchrequiredsize: Long): HRESULT =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_GetPrinterDriverPackagePathW(pszserver.toString(), pszenvironment.toString(), pszlanguage.toString(), pszpackageid.toString(), pszdriverpackagecab.toString(), cchdriverpackagecab.toInt(), pcchrequiredsize.toString()) as Int) else 0

public actual fun GetPrinterDriverW(hprinter: PRINTER_HANDLE, penvironment: PCWSTR, level: UInt, pdriverinfo: Long, cbbuf: UInt, pcbneeded: Long): BOOL =
    0

public actual fun GetPrinterW(hprinter: PRINTER_HANDLE, level: UInt, pprinter: Long, cbbuf: UInt, pcbneeded: Long): BOOL =
    0

public actual fun GetSpoolFileHandle(hprinter: PRINTER_HANDLE): HANDLE =
    0L

public actual fun ImpersonatePrinterClient(htoken: HANDLE): BOOL =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_ImpersonatePrinterClient(htoken.toString()) as Int) else 0

public actual fun InstallPrinterDriverFromPackageA(pszserver: PCSTR, pszinfpath: PCSTR, pszdrivername: PCSTR, pszenvironment: PCSTR, dwflags: UInt): HRESULT =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_InstallPrinterDriverFromPackageA(pszserver.toString(), pszinfpath.toString(), pszdrivername.toString(), pszenvironment.toString(), dwflags.toInt()) as Int) else 0

public actual fun InstallPrinterDriverFromPackageW(pszserver: PCWSTR, pszinfpath: PCWSTR, pszdrivername: PCWSTR, pszenvironment: PCWSTR, dwflags: UInt): HRESULT =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_InstallPrinterDriverFromPackageW(pszserver.toString(), pszinfpath.toString(), pszdrivername.toString(), pszenvironment.toString(), dwflags.toInt()) as Int) else 0

public actual fun IsValidDevmodeA(pdevmode: Long, devmodesize: ULong): BOOL =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_IsValidDevmodeA(pdevmode.toString(), devmodesize.toString()) as Int) else 0

public actual fun IsValidDevmodeW(pdevmode: Long, devmodesize: ULong): BOOL =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_IsValidDevmodeW(pdevmode.toString(), devmodesize.toString()) as Int) else 0

public actual fun OpenPrinter2A(pprintername: PCSTR, phprinter: Long, pdefault: Long, poptions: Long): BOOL =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_OpenPrinter2A(pprintername.toString(), phprinter.toString(), pdefault.toString(), poptions.toString()) as Int) else 0

public actual fun OpenPrinter2W(pprintername: PCWSTR, phprinter: Long, pdefault: Long, poptions: Long): BOOL =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_OpenPrinter2W(pprintername.toString(), phprinter.toString(), pdefault.toString(), poptions.toString()) as Int) else 0

public actual fun OpenPrinterA(pprintername: PCSTR, phprinter: Long, pdefault: Long): BOOL =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_OpenPrinterA(pprintername.toString(), phprinter.toString(), pdefault.toString()) as Int) else 0

public actual fun OpenPrinterW(pprintername: PCWSTR, phprinter: Long, pdefault: Long): BOOL =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_OpenPrinterW(pprintername.toString(), phprinter.toString(), pdefault.toString()) as Int) else 0

public actual fun PartialReplyPrinterChangeNotification(hprinter: PRINTER_HANDLE, pdatasrc: Long): BOOL =
    0

public actual fun PlayGdiScriptOnPrinterIC(hprinteric: HANDLE, pin: Long, cin: UInt, pout: Long, cout: UInt, ul: UInt): BOOL =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_PlayGdiScriptOnPrinterIC(hprinteric.toString(), pin.toString(), cin.toInt(), pout.toString(), cout.toInt(), ul.toInt()) as Int) else 0

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
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_RegisterForPrintAsyncNotifications(pszname.toString(), pnotificationtype.toString(), euserfilter, econversationstyle, pcallback.toString(), phnotify.toString()) as Int) else 0

public actual fun RemovePrintDeviceObject(hdeviceobject: HANDLE): HRESULT =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_RemovePrintDeviceObject(hdeviceobject.toString()) as Int) else 0

public actual fun ReplyPrinterChangeNotification(hprinter: PRINTER_HANDLE, fdwchangeflags: UInt, pdwresult: Long, pprinternotifyinfo: Long): BOOL =
    0

public actual fun ReplyPrinterChangeNotificationEx(hnotify: HANDLE, dwcolor: UInt, fdwflags: UInt, pdwresult: Long, pprinternotifyinfo: Long): BOOL =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_ReplyPrinterChangeNotificationEx(hnotify.toString(), dwcolor.toInt(), fdwflags.toInt(), pdwresult.toString(), pprinternotifyinfo.toString()) as Int) else 0

public actual fun ReportJobProcessingProgress(printerhandle: HANDLE, jobid: UInt, joboperation: EPrintXPSJobOperation, jobprogress: EPrintXPSJobProgress): HRESULT =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_ReportJobProcessingProgress(printerhandle.toString(), jobid.toInt(), joboperation, jobprogress) as Int) else 0

public actual fun ResetPrinterA(hprinter: PRINTER_HANDLE, pdefault: Long): BOOL =
    0

public actual fun ResetPrinterW(hprinter: PRINTER_HANDLE, pdefault: Long): BOOL =
    0

public actual fun RevertToPrinterSelf(): HANDLE =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_RevertToPrinterSelf() as String).toLong() else 0L

public actual fun RouterAllocBidiMem(numbytes: ULong): Long =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_RouterAllocBidiMem(numbytes.toString()) as String).toLong() else 0L

public actual fun RouterAllocBidiResponseContainer(count: UInt): Long =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_RouterAllocBidiResponseContainer(count.toInt()) as String).toLong() else 0L

public actual fun RouterAllocPrinterNotifyInfo(cprinternotifyinfodata: UInt): Long =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_RouterAllocPrinterNotifyInfo(cprinternotifyinfodata.toInt()) as String).toLong() else 0L

public actual fun RouterFreeBidiMem(pmempointer: Long) {
    if (_windowsWin32GraphicsPrintingNapiAddon != null) {
        _windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_RouterFreeBidiMem(pmempointer.toString())
    }
}

public actual fun RouterFreeBidiResponseContainer(pdata: Long): UInt =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_RouterFreeBidiResponseContainer(pdata.toString()) as Int).toUInt() else 0u

public actual fun RouterFreePrinterNotifyInfo(pinfo: Long): BOOL =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_RouterFreePrinterNotifyInfo(pinfo.toString()) as Int) else 0

public actual fun ScheduleJob(hprinter: PRINTER_HANDLE, jobid: UInt): BOOL =
    0

public actual fun SetCPSUIUserData(hdlg: HWND, cpsuiuserdata: ULong): BOOL =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_SetCPSUIUserData(hdlg.toString(), cpsuiuserdata.toString()) as Int) else 0

public actual fun SetDefaultPrinterA(pszprinter: PCSTR): BOOL =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_SetDefaultPrinterA(pszprinter.toString()) as Int) else 0

public actual fun SetDefaultPrinterW(pszprinter: PCWSTR): BOOL =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_SetDefaultPrinterW(pszprinter.toString()) as Int) else 0

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
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_SetPortA(pname.toString(), pportname.toString(), dwlevel.toInt(), pportinfo.toString()) as Int) else 0

public actual fun SetPortW(pname: PCWSTR, pportname: PCWSTR, dwlevel: UInt, pportinfo: Long): BOOL =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_SetPortW(pname.toString(), pportname.toString(), dwlevel.toInt(), pportinfo.toString()) as Int) else 0

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
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_SpoolerCopyFileEvent(pszprintername.toString(), pszkey.toString(), dwcopyfileevent.toInt()) as Int) else 0

public actual fun SpoolerFindClosePrinterChangeNotification(hprinter: PRINTER_HANDLE): BOOL =
    0

public actual fun SpoolerFindFirstPrinterChangeNotification(hprinter: PRINTER_HANDLE, fdwfilterflags: UInt, fdwoptions: UInt, pprinternotifyoptions: Long, pvreserved: Long, pnotificationconfig: Long, phnotify: Long, phevent: Long): BOOL =
    0

public actual fun SpoolerFindNextPrinterChangeNotification(hprinter: PRINTER_HANDLE, pfdwchange: Long, pprinternotifyoptions: Long, ppprinternotifyinfo: Long): BOOL =
    0

public actual fun SpoolerFreePrinterNotifyInfo(pinfo: Long) {
    if (_windowsWin32GraphicsPrintingNapiAddon != null) {
        _windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_SpoolerFreePrinterNotifyInfo(pinfo.toString())
    }
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
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_UnRegisterForPrintAsyncNotifications(param0.toString()) as Int) else 0

public actual fun UpdatePrintDeviceObject(hprinter: PRINTER_HANDLE, hdeviceobject: HANDLE): HRESULT =
    0

public actual fun UploadPrinterDriverPackageA(pszserver: PCSTR, pszinfpath: PCSTR, pszenvironment: PCSTR, dwflags: UInt, hwnd: HWND, pszdestinfpath: PSTR, pcchdestinfpath: Long): HRESULT =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_UploadPrinterDriverPackageA(pszserver.toString(), pszinfpath.toString(), pszenvironment.toString(), dwflags.toInt(), hwnd.toString(), pszdestinfpath.toString(), pcchdestinfpath.toString()) as Int) else 0

public actual fun UploadPrinterDriverPackageW(pszserver: PCWSTR, pszinfpath: PCWSTR, pszenvironment: PCWSTR, dwflags: UInt, hwnd: HWND, pszdestinfpath: PWSTR, pcchdestinfpath: Long): HRESULT =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_UploadPrinterDriverPackageW(pszserver.toString(), pszinfpath.toString(), pszenvironment.toString(), dwflags.toInt(), hwnd.toString(), pszdestinfpath.toString(), pcchdestinfpath.toString()) as Int) else 0

public actual fun WaitForPrinterChange(hprinter: PRINTER_HANDLE, flags: UInt): UInt =
    0u

public actual fun WritePrinter(hprinter: PRINTER_HANDLE, pbuf: Long, cbbuf: UInt, pcwritten: Long): BOOL =
    0

public actual fun XcvDataW(hxcv: HANDLE, pszdataname: PCWSTR, pinputdata: Long, cbinputdata: UInt, poutputdata: Long, cboutputdata: UInt, pcboutputneeded: Long, pdwstatus: Long): BOOL =
    if (_windowsWin32GraphicsPrintingNapiAddon != null) (_windowsWin32GraphicsPrintingNapiAddon.windowssys_windows_win32_graphics_printing_XcvDataW(hxcv.toString(), pszdataname.toString(), pinputdata.toString(), cbinputdata.toInt(), poutputdata.toString(), cboutputdata.toInt(), pcboutputneeded.toString(), pdwstatus.toString()) as Int) else 0
