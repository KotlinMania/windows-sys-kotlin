@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

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
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_AddMonitorA(pname.toCPointer<ByteVar>(), level, pmonitors.toCPointer<ByteVar>())

public actual fun AddMonitorW(pname: PCWSTR, level: UInt, pmonitors: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_AddMonitorW(pname.toCPointer<ByteVar>(), level, pmonitors.toCPointer<ByteVar>())

public actual fun AddPortA(pname: PCSTR, hwnd: HWND, pmonitorname: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_AddPortA(pname.toCPointer<ByteVar>(), hwnd.toCPointer<ByteVar>(), pmonitorname.toCPointer<ByteVar>())

public actual fun AddPortW(pname: PCWSTR, hwnd: HWND, pmonitorname: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_AddPortW(pname.toCPointer<ByteVar>(), hwnd.toCPointer<ByteVar>(), pmonitorname.toCPointer<ByteVar>())

public actual fun AddPrintDeviceObject(hprinter: PRINTER_HANDLE, phdeviceobject: Long): HRESULT =
    0

public actual fun AddPrintProcessorA(pname: PCSTR, penvironment: PCSTR, ppathname: PCSTR, pprintprocessorname: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_AddPrintProcessorA(pname.toCPointer<ByteVar>(), penvironment.toCPointer<ByteVar>(), ppathname.toCPointer<ByteVar>(), pprintprocessorname.toCPointer<ByteVar>())

public actual fun AddPrintProcessorW(pname: PCWSTR, penvironment: PCWSTR, ppathname: PCWSTR, pprintprocessorname: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_AddPrintProcessorW(pname.toCPointer<ByteVar>(), penvironment.toCPointer<ByteVar>(), ppathname.toCPointer<ByteVar>(), pprintprocessorname.toCPointer<ByteVar>())

public actual fun AddPrintProvidorA(pname: PCSTR, level: UInt, pprovidorinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_AddPrintProvidorA(pname.toCPointer<ByteVar>(), level, pprovidorinfo.toCPointer<ByteVar>())

public actual fun AddPrintProvidorW(pname: PCWSTR, level: UInt, pprovidorinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_AddPrintProvidorW(pname.toCPointer<ByteVar>(), level, pprovidorinfo.toCPointer<ByteVar>())

public actual fun AddPrinterA(pname: PCSTR, level: UInt, pprinter: Long): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_AddPrinterA(pname.toCPointer<ByteVar>(), level, pprinter.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun AddPrinterConnection2A(hwnd: HWND, pszname: PCSTR, dwlevel: UInt, pconnectioninfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_AddPrinterConnection2A(hwnd.toCPointer<ByteVar>(), pszname.toCPointer<ByteVar>(), dwlevel, pconnectioninfo.toCPointer<ByteVar>())

public actual fun AddPrinterConnection2W(hwnd: HWND, pszname: PCWSTR, dwlevel: UInt, pconnectioninfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_AddPrinterConnection2W(hwnd.toCPointer<ByteVar>(), pszname.toCPointer<ByteVar>(), dwlevel, pconnectioninfo.toCPointer<ByteVar>())

public actual fun AddPrinterConnectionA(pname: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_AddPrinterConnectionA(pname.toCPointer<ByteVar>())

public actual fun AddPrinterConnectionW(pname: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_AddPrinterConnectionW(pname.toCPointer<ByteVar>())

public actual fun AddPrinterDriverA(pname: PCSTR, level: UInt, pdriverinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_AddPrinterDriverA(pname.toCPointer<ByteVar>(), level, pdriverinfo.toCPointer<ByteVar>())

public actual fun AddPrinterDriverExA(pname: PCSTR, level: UInt, lpbdriverinfo: Long, dwfilecopyflags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_AddPrinterDriverExA(pname.toCPointer<ByteVar>(), level, lpbdriverinfo.toCPointer<ByteVar>(), dwfilecopyflags)

public actual fun AddPrinterDriverExW(pname: PCWSTR, level: UInt, lpbdriverinfo: Long, dwfilecopyflags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_AddPrinterDriverExW(pname.toCPointer<ByteVar>(), level, lpbdriverinfo.toCPointer<ByteVar>(), dwfilecopyflags)

public actual fun AddPrinterDriverW(pname: PCWSTR, level: UInt, pdriverinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_AddPrinterDriverW(pname.toCPointer<ByteVar>(), level, pdriverinfo.toCPointer<ByteVar>())

public actual fun AddPrinterW(pname: PCWSTR, level: UInt, pprinter: Long): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_AddPrinterW(pname.toCPointer<ByteVar>(), level, pprinter.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun AdvancedDocumentPropertiesA(hwnd: HWND, hprinter: PRINTER_HANDLE, pdevicename: PCSTR, pdevmodeoutput: Long, pdevmodeinput: Long): Int =
    0

public actual fun AdvancedDocumentPropertiesW(hwnd: HWND, hprinter: PRINTER_HANDLE, pdevicename: PCWSTR, pdevmodeoutput: Long, pdevmodeinput: Long): Int =
    0

public actual fun AppendPrinterNotifyInfoData(pinfodest: Long, pdatasrc: Long, fdwflags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_AppendPrinterNotifyInfoData(pinfodest.toCPointer<ByteVar>(), pdatasrc.toCPointer<ByteVar>(), fdwflags)

public actual fun CallRouterFindFirstPrinterChangeNotification(hprinterrpc: HANDLE, fdwfilterflags: UInt, fdwoptions: UInt, hnotify: HANDLE, pprinternotifyoptions: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_CallRouterFindFirstPrinterChangeNotification(hprinterrpc.toCPointer<ByteVar>(), fdwfilterflags, fdwoptions, hnotify.toCPointer<ByteVar>(), pprinternotifyoptions.toCPointer<ByteVar>())

public actual fun ClosePrinter(hprinter: PRINTER_HANDLE): BOOL =
    0

public actual fun CloseSpoolFileHandle(hprinter: PRINTER_HANDLE, hspoolfile: HANDLE): BOOL =
    0

public actual fun CommitSpoolData(hprinter: PRINTER_HANDLE, hspoolfile: HANDLE, cbcommit: UInt): HANDLE =
    0L

public actual fun CommonPropertySheetUIA(hwndowner: HWND, pfnpropsheetui: PFNPROPSHEETUI, lparam: LPARAM, presult: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_CommonPropertySheetUIA(hwndowner.toCPointer<ByteVar>(), pfnpropsheetui.toLong().toCPointer<ByteVar>(), lparam, presult.toCPointer<ByteVar>())

public actual fun CommonPropertySheetUIW(hwndowner: HWND, pfnpropsheetui: PFNPROPSHEETUI, lparam: LPARAM, presult: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_CommonPropertySheetUIW(hwndowner.toCPointer<ByteVar>(), pfnpropsheetui.toLong().toCPointer<ByteVar>(), lparam, presult.toCPointer<ByteVar>())

public actual fun ConfigurePortA(pname: PCSTR, hwnd: HWND, pportname: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_ConfigurePortA(pname.toCPointer<ByteVar>(), hwnd.toCPointer<ByteVar>(), pportname.toCPointer<ByteVar>())

public actual fun ConfigurePortW(pname: PCWSTR, hwnd: HWND, pportname: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_ConfigurePortW(pname.toCPointer<ByteVar>(), hwnd.toCPointer<ByteVar>(), pportname.toCPointer<ByteVar>())

public actual fun ConnectToPrinterDlg(hwnd: HWND, flags: UInt): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_ConnectToPrinterDlg(hwnd.toCPointer<ByteVar>(), flags)?.toLong() ?: 0L

public actual fun CorePrinterDriverInstalledA(pszserver: PCSTR, pszenvironment: PCSTR, coredriverguid: GUID, ftdriverdate: FILETIME, dwldriverversion: ULong, pbdriverinstalled: Long): HRESULT =
    0

public actual fun CorePrinterDriverInstalledW(pszserver: PCWSTR, pszenvironment: PCWSTR, coredriverguid: GUID, ftdriverdate: FILETIME, dwldriverversion: ULong, pbdriverinstalled: Long): HRESULT =
    0

public actual fun CreatePrintAsyncNotifyChannel(pszname: PCWSTR, pnotificationtype: Long, euserfilter: PrintAsyncNotifyUserFilter, econversationstyle: PrintAsyncNotifyConversationStyle, pcallback: Long, ppiasynchnotification: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_CreatePrintAsyncNotifyChannel(pszname.toCPointer<ByteVar>(), pnotificationtype.toCPointer<ByteVar>(), euserfilter, econversationstyle, pcallback.toCPointer<ByteVar>(), ppiasynchnotification.toCPointer<ByteVar>())

public actual fun CreatePrinterIC(hprinter: PRINTER_HANDLE, pdevmode: Long): HANDLE =
    0L

public actual fun DeleteFormA(hprinter: PRINTER_HANDLE, pformname: PCSTR): BOOL =
    0

public actual fun DeleteFormW(hprinter: PRINTER_HANDLE, pformname: PCWSTR): BOOL =
    0

public actual fun DeleteJobNamedProperty(hprinter: PRINTER_HANDLE, jobid: UInt, pszname: PCWSTR): UInt =
    0u

public actual fun DeleteMonitorA(pname: PCSTR, penvironment: PCSTR, pmonitorname: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_DeleteMonitorA(pname.toCPointer<ByteVar>(), penvironment.toCPointer<ByteVar>(), pmonitorname.toCPointer<ByteVar>())

public actual fun DeleteMonitorW(pname: PCWSTR, penvironment: PCWSTR, pmonitorname: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_DeleteMonitorW(pname.toCPointer<ByteVar>(), penvironment.toCPointer<ByteVar>(), pmonitorname.toCPointer<ByteVar>())

public actual fun DeletePortA(pname: PCSTR, hwnd: HWND, pportname: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_DeletePortA(pname.toCPointer<ByteVar>(), hwnd.toCPointer<ByteVar>(), pportname.toCPointer<ByteVar>())

public actual fun DeletePortW(pname: PCWSTR, hwnd: HWND, pportname: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_DeletePortW(pname.toCPointer<ByteVar>(), hwnd.toCPointer<ByteVar>(), pportname.toCPointer<ByteVar>())

public actual fun DeletePrintProcessorA(pname: PCSTR, penvironment: PCSTR, pprintprocessorname: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_DeletePrintProcessorA(pname.toCPointer<ByteVar>(), penvironment.toCPointer<ByteVar>(), pprintprocessorname.toCPointer<ByteVar>())

public actual fun DeletePrintProcessorW(pname: PCWSTR, penvironment: PCWSTR, pprintprocessorname: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_DeletePrintProcessorW(pname.toCPointer<ByteVar>(), penvironment.toCPointer<ByteVar>(), pprintprocessorname.toCPointer<ByteVar>())

public actual fun DeletePrintProvidorA(pname: PCSTR, penvironment: PCSTR, pprintprovidorname: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_DeletePrintProvidorA(pname.toCPointer<ByteVar>(), penvironment.toCPointer<ByteVar>(), pprintprovidorname.toCPointer<ByteVar>())

public actual fun DeletePrintProvidorW(pname: PCWSTR, penvironment: PCWSTR, pprintprovidorname: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_DeletePrintProvidorW(pname.toCPointer<ByteVar>(), penvironment.toCPointer<ByteVar>(), pprintprovidorname.toCPointer<ByteVar>())

public actual fun DeletePrinter(hprinter: PRINTER_HANDLE): BOOL =
    0

public actual fun DeletePrinterConnectionA(pname: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_DeletePrinterConnectionA(pname.toCPointer<ByteVar>())

public actual fun DeletePrinterConnectionW(pname: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_DeletePrinterConnectionW(pname.toCPointer<ByteVar>())

public actual fun DeletePrinterDataA(hprinter: PRINTER_HANDLE, pvaluename: PCSTR): UInt =
    0u

public actual fun DeletePrinterDataExA(hprinter: PRINTER_HANDLE, pkeyname: PCSTR, pvaluename: PCSTR): UInt =
    0u

public actual fun DeletePrinterDataExW(hprinter: PRINTER_HANDLE, pkeyname: PCWSTR, pvaluename: PCWSTR): UInt =
    0u

public actual fun DeletePrinterDataW(hprinter: PRINTER_HANDLE, pvaluename: PCWSTR): UInt =
    0u

public actual fun DeletePrinterDriverA(pname: PCSTR, penvironment: PCSTR, pdrivername: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_DeletePrinterDriverA(pname.toCPointer<ByteVar>(), penvironment.toCPointer<ByteVar>(), pdrivername.toCPointer<ByteVar>())

public actual fun DeletePrinterDriverExA(pname: PCSTR, penvironment: PCSTR, pdrivername: PCSTR, dwdeleteflag: UInt, dwversionflag: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_DeletePrinterDriverExA(pname.toCPointer<ByteVar>(), penvironment.toCPointer<ByteVar>(), pdrivername.toCPointer<ByteVar>(), dwdeleteflag, dwversionflag)

public actual fun DeletePrinterDriverExW(pname: PCWSTR, penvironment: PCWSTR, pdrivername: PCWSTR, dwdeleteflag: UInt, dwversionflag: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_DeletePrinterDriverExW(pname.toCPointer<ByteVar>(), penvironment.toCPointer<ByteVar>(), pdrivername.toCPointer<ByteVar>(), dwdeleteflag, dwversionflag)

public actual fun DeletePrinterDriverPackageA(pszserver: PCSTR, pszinfpath: PCSTR, pszenvironment: PCSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_DeletePrinterDriverPackageA(pszserver.toCPointer<ByteVar>(), pszinfpath.toCPointer<ByteVar>(), pszenvironment.toCPointer<ByteVar>())

public actual fun DeletePrinterDriverPackageW(pszserver: PCWSTR, pszinfpath: PCWSTR, pszenvironment: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_DeletePrinterDriverPackageW(pszserver.toCPointer<ByteVar>(), pszinfpath.toCPointer<ByteVar>(), pszenvironment.toCPointer<ByteVar>())

public actual fun DeletePrinterDriverW(pname: PCWSTR, penvironment: PCWSTR, pdrivername: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_DeletePrinterDriverW(pname.toCPointer<ByteVar>(), penvironment.toCPointer<ByteVar>(), pdrivername.toCPointer<ByteVar>())

public actual fun DeletePrinterIC(hprinteric: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_DeletePrinterIC(hprinteric.toCPointer<ByteVar>())

public actual fun DeletePrinterKeyA(hprinter: PRINTER_HANDLE, pkeyname: PCSTR): UInt =
    0u

public actual fun DeletePrinterKeyW(hprinter: PRINTER_HANDLE, pkeyname: PCWSTR): UInt =
    0u

public actual fun DevQueryPrint(hprinter: PRINTER_HANDLE, pdevmode: Long, presid: Long): BOOL =
    0

public actual fun DevQueryPrintEx(pdqpinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_DevQueryPrintEx(pdqpinfo.toCPointer<ByteVar>())

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
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_EnumMonitorsA(pname.toCPointer<ByteVar>(), level, pmonitor.toCPointer<ByteVar>(), cbbuf, pcbneeded.toCPointer<ByteVar>(), pcreturned.toCPointer<ByteVar>())

public actual fun EnumMonitorsW(pname: PCWSTR, level: UInt, pmonitor: Long, cbbuf: UInt, pcbneeded: Long, pcreturned: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_EnumMonitorsW(pname.toCPointer<ByteVar>(), level, pmonitor.toCPointer<ByteVar>(), cbbuf, pcbneeded.toCPointer<ByteVar>(), pcreturned.toCPointer<ByteVar>())

public actual fun EnumPortsA(pname: PCSTR, level: UInt, pport: Long, cbbuf: UInt, pcbneeded: Long, pcreturned: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_EnumPortsA(pname.toCPointer<ByteVar>(), level, pport.toCPointer<ByteVar>(), cbbuf, pcbneeded.toCPointer<ByteVar>(), pcreturned.toCPointer<ByteVar>())

public actual fun EnumPortsW(pname: PCWSTR, level: UInt, pport: Long, cbbuf: UInt, pcbneeded: Long, pcreturned: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_EnumPortsW(pname.toCPointer<ByteVar>(), level, pport.toCPointer<ByteVar>(), cbbuf, pcbneeded.toCPointer<ByteVar>(), pcreturned.toCPointer<ByteVar>())

public actual fun EnumPrintProcessorDatatypesA(pname: PCSTR, pprintprocessorname: PCSTR, level: UInt, pdatatypes: Long, cbbuf: UInt, pcbneeded: Long, pcreturned: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_EnumPrintProcessorDatatypesA(pname.toCPointer<ByteVar>(), pprintprocessorname.toCPointer<ByteVar>(), level, pdatatypes.toCPointer<ByteVar>(), cbbuf, pcbneeded.toCPointer<ByteVar>(), pcreturned.toCPointer<ByteVar>())

public actual fun EnumPrintProcessorDatatypesW(pname: PCWSTR, pprintprocessorname: PCWSTR, level: UInt, pdatatypes: Long, cbbuf: UInt, pcbneeded: Long, pcreturned: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_EnumPrintProcessorDatatypesW(pname.toCPointer<ByteVar>(), pprintprocessorname.toCPointer<ByteVar>(), level, pdatatypes.toCPointer<ByteVar>(), cbbuf, pcbneeded.toCPointer<ByteVar>(), pcreturned.toCPointer<ByteVar>())

public actual fun EnumPrintProcessorsA(pname: PCSTR, penvironment: PCSTR, level: UInt, pprintprocessorinfo: Long, cbbuf: UInt, pcbneeded: Long, pcreturned: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_EnumPrintProcessorsA(pname.toCPointer<ByteVar>(), penvironment.toCPointer<ByteVar>(), level, pprintprocessorinfo.toCPointer<ByteVar>(), cbbuf, pcbneeded.toCPointer<ByteVar>(), pcreturned.toCPointer<ByteVar>())

public actual fun EnumPrintProcessorsW(pname: PCWSTR, penvironment: PCWSTR, level: UInt, pprintprocessorinfo: Long, cbbuf: UInt, pcbneeded: Long, pcreturned: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_EnumPrintProcessorsW(pname.toCPointer<ByteVar>(), penvironment.toCPointer<ByteVar>(), level, pprintprocessorinfo.toCPointer<ByteVar>(), cbbuf, pcbneeded.toCPointer<ByteVar>(), pcreturned.toCPointer<ByteVar>())

public actual fun EnumPrinterDataA(hprinter: PRINTER_HANDLE, dwindex: UInt, pvaluename: PSTR, cbvaluename: UInt, pcbvaluename: Long, ptype: Long, pdata: Long, cbdata: UInt, pcbdata: Long): UInt =
    0u

public actual fun EnumPrinterDataExA(hprinter: PRINTER_HANDLE, pkeyname: PCSTR, penumvalues: Long, cbenumvalues: UInt, pcbenumvalues: Long, pnenumvalues: Long): UInt =
    0u

public actual fun EnumPrinterDataExW(hprinter: PRINTER_HANDLE, pkeyname: PCWSTR, penumvalues: Long, cbenumvalues: UInt, pcbenumvalues: Long, pnenumvalues: Long): UInt =
    0u

public actual fun EnumPrinterDataW(hprinter: PRINTER_HANDLE, dwindex: UInt, pvaluename: PWSTR, cbvaluename: UInt, pcbvaluename: Long, ptype: Long, pdata: Long, cbdata: UInt, pcbdata: Long): UInt =
    0u

public actual fun EnumPrinterDriversA(pname: PCSTR, penvironment: PCSTR, level: UInt, pdriverinfo: Long, cbbuf: UInt, pcbneeded: Long, pcreturned: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_EnumPrinterDriversA(pname.toCPointer<ByteVar>(), penvironment.toCPointer<ByteVar>(), level, pdriverinfo.toCPointer<ByteVar>(), cbbuf, pcbneeded.toCPointer<ByteVar>(), pcreturned.toCPointer<ByteVar>())

public actual fun EnumPrinterDriversW(pname: PCWSTR, penvironment: PCWSTR, level: UInt, pdriverinfo: Long, cbbuf: UInt, pcbneeded: Long, pcreturned: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_EnumPrinterDriversW(pname.toCPointer<ByteVar>(), penvironment.toCPointer<ByteVar>(), level, pdriverinfo.toCPointer<ByteVar>(), cbbuf, pcbneeded.toCPointer<ByteVar>(), pcreturned.toCPointer<ByteVar>())

public actual fun EnumPrinterKeyA(hprinter: PRINTER_HANDLE, pkeyname: PCSTR, psubkey: PSTR, cbsubkey: UInt, pcbsubkey: Long): UInt =
    0u

public actual fun EnumPrinterKeyW(hprinter: PRINTER_HANDLE, pkeyname: PCWSTR, psubkey: PWSTR, cbsubkey: UInt, pcbsubkey: Long): UInt =
    0u

public actual fun EnumPrintersA(flags: UInt, name: PCSTR, level: UInt, pprinterenum: Long, cbbuf: UInt, pcbneeded: Long, pcreturned: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_EnumPrintersA(flags, name.toCPointer<ByteVar>(), level, pprinterenum.toCPointer<ByteVar>(), cbbuf, pcbneeded.toCPointer<ByteVar>(), pcreturned.toCPointer<ByteVar>())

public actual fun EnumPrintersW(flags: UInt, name: PCWSTR, level: UInt, pprinterenum: Long, cbbuf: UInt, pcbneeded: Long, pcreturned: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_EnumPrintersW(flags, name.toCPointer<ByteVar>(), level, pprinterenum.toCPointer<ByteVar>(), cbbuf, pcbneeded.toCPointer<ByteVar>(), pcreturned.toCPointer<ByteVar>())

public actual fun ExtDeviceMode(hwnd: HWND, hinst: HANDLE, pdevmodeoutput: Long, pdevicename: PCSTR, pport: PCSTR, pdevmodeinput: Long, pprofile: PCSTR, fmode: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_ExtDeviceMode(hwnd.toCPointer<ByteVar>(), hinst.toCPointer<ByteVar>(), pdevmodeoutput.toCPointer<ByteVar>(), pdevicename.toCPointer<ByteVar>(), pport.toCPointer<ByteVar>(), pdevmodeinput.toCPointer<ByteVar>(), pprofile.toCPointer<ByteVar>(), fmode)

public actual fun FindClosePrinterChangeNotification(hchange: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_FindClosePrinterChangeNotification(hchange.toCPointer<ByteVar>())

public actual fun FindFirstPrinterChangeNotification(hprinter: PRINTER_HANDLE, fdwfilter: UInt, fdwoptions: UInt, pprinternotifyoptions: Long): HANDLE =
    0L

public actual fun FindNextPrinterChangeNotification(hchange: HANDLE, pdwchange: Long, pvreserved: Long, ppprinternotifyinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_FindNextPrinterChangeNotification(hchange.toCPointer<ByteVar>(), pdwchange.toCPointer<ByteVar>(), pvreserved.toCPointer<ByteVar>(), ppprinternotifyinfo.toCPointer<ByteVar>())

public actual fun FlushPrinter(hprinter: PRINTER_HANDLE, pbuf: Long, cbbuf: UInt, pcwritten: Long, csleep: UInt): BOOL =
    0

public actual fun FreePrintNamedPropertyArray(cproperties: UInt, ppproperties: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_FreePrintNamedPropertyArray(cproperties, ppproperties.toCPointer<ByteVar>())
}

public actual fun FreePrintPropertyValue(pvalue: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_FreePrintPropertyValue(pvalue.toCPointer<ByteVar>())
}

public actual fun FreePrinterNotifyInfo(pprinternotifyinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_FreePrinterNotifyInfo(pprinternotifyinfo.toCPointer<ByteVar>())

public actual fun GdiDeleteSpoolFileHandle(spoolfilehandle: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_GdiDeleteSpoolFileHandle(spoolfilehandle.toCPointer<ByteVar>())

public actual fun GdiEndDocEMF(spoolfilehandle: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_GdiEndDocEMF(spoolfilehandle.toCPointer<ByteVar>())

public actual fun GdiEndPageEMF(spoolfilehandle: HANDLE, dwoptimization: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_GdiEndPageEMF(spoolfilehandle.toCPointer<ByteVar>(), dwoptimization)

public actual fun GdiGetDC(spoolfilehandle: HANDLE): HDC =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_GdiGetDC(spoolfilehandle.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun GdiGetDevmodeForPage(spoolfilehandle: HANDLE, dwpagenumber: UInt, pcurrdm: Long, plastdm: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_GdiGetDevmodeForPage(spoolfilehandle.toCPointer<ByteVar>(), dwpagenumber, pcurrdm.toCPointer<ByteVar>(), plastdm.toCPointer<ByteVar>())

public actual fun GdiGetPageCount(spoolfilehandle: HANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_GdiGetPageCount(spoolfilehandle.toCPointer<ByteVar>())

public actual fun GdiGetPageHandle(spoolfilehandle: HANDLE, page: UInt, pdwpagetype: Long): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_GdiGetPageHandle(spoolfilehandle.toCPointer<ByteVar>(), page, pdwpagetype.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun GdiGetSpoolFileHandle(pwszprintername: PCWSTR, pdevmode: Long, pwszdocname: PCWSTR): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_GdiGetSpoolFileHandle(pwszprintername.toCPointer<ByteVar>(), pdevmode.toCPointer<ByteVar>(), pwszdocname.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun GdiPlayPageEMF(spoolfilehandle: HANDLE, hemf: HANDLE, prectdocument: Long, prectborder: Long, prectclip: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_GdiPlayPageEMF(spoolfilehandle.toCPointer<ByteVar>(), hemf.toCPointer<ByteVar>(), prectdocument.toCPointer<ByteVar>(), prectborder.toCPointer<ByteVar>(), prectclip.toCPointer<ByteVar>())

public actual fun GdiResetDCEMF(spoolfilehandle: HANDLE, pcurrdm: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_GdiResetDCEMF(spoolfilehandle.toCPointer<ByteVar>(), pcurrdm.toCPointer<ByteVar>())

public actual fun GdiStartDocEMF(spoolfilehandle: HANDLE, pdocinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_GdiStartDocEMF(spoolfilehandle.toCPointer<ByteVar>(), pdocinfo.toCPointer<ByteVar>())

public actual fun GdiStartPageEMF(spoolfilehandle: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_GdiStartPageEMF(spoolfilehandle.toCPointer<ByteVar>())

public actual fun GenerateCopyFilePaths(pszprintername: PCWSTR, pszdirectory: PCWSTR, psplclientinfo: Long, dwlevel: UInt, pszsourcedir: PWSTR, pcchsourcedirsize: Long, psztargetdir: PWSTR, pcchtargetdirsize: Long, dwflags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_GenerateCopyFilePaths(pszprintername.toCPointer<ByteVar>(), pszdirectory.toCPointer<ByteVar>(), psplclientinfo.toCPointer<ByteVar>(), dwlevel, pszsourcedir.toCPointer<ByteVar>(), pcchsourcedirsize.toCPointer<ByteVar>(), psztargetdir.toCPointer<ByteVar>(), pcchtargetdirsize.toCPointer<ByteVar>(), dwflags)

public actual fun GetCPSUIUserData(hdlg: HWND): ULong =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_GetCPSUIUserData(hdlg.toCPointer<ByteVar>())

public actual fun GetCorePrinterDriversA(pszserver: PCSTR, pszenvironment: PCSTR, pszzcoredriverdependencies: PCSTR, ccoreprinterdrivers: UInt, pcoreprinterdrivers: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_GetCorePrinterDriversA(pszserver.toCPointer<ByteVar>(), pszenvironment.toCPointer<ByteVar>(), pszzcoredriverdependencies.toCPointer<ByteVar>(), ccoreprinterdrivers, pcoreprinterdrivers.toCPointer<ByteVar>())

public actual fun GetCorePrinterDriversW(pszserver: PCWSTR, pszenvironment: PCWSTR, pszzcoredriverdependencies: PCWSTR, ccoreprinterdrivers: UInt, pcoreprinterdrivers: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_GetCorePrinterDriversW(pszserver.toCPointer<ByteVar>(), pszenvironment.toCPointer<ByteVar>(), pszzcoredriverdependencies.toCPointer<ByteVar>(), ccoreprinterdrivers, pcoreprinterdrivers.toCPointer<ByteVar>())

public actual fun GetDefaultPrinterA(pszbuffer: PSTR, pcchbuffer: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_GetDefaultPrinterA(pszbuffer.toCPointer<ByteVar>(), pcchbuffer.toCPointer<ByteVar>())

public actual fun GetDefaultPrinterW(pszbuffer: PWSTR, pcchbuffer: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_GetDefaultPrinterW(pszbuffer.toCPointer<ByteVar>(), pcchbuffer.toCPointer<ByteVar>())

public actual fun GetFormA(hprinter: PRINTER_HANDLE, pformname: PCSTR, level: UInt, pform: Long, cbbuf: UInt, pcbneeded: Long): BOOL =
    0

public actual fun GetFormW(hprinter: PRINTER_HANDLE, pformname: PCWSTR, level: UInt, pform: Long, cbbuf: UInt, pcbneeded: Long): BOOL =
    0

public actual fun GetJobA(hprinter: PRINTER_HANDLE, jobid: UInt, level: UInt, pjob: Long, cbbuf: UInt, pcbneeded: Long): BOOL =
    0

public actual fun GetJobAttributes(pprintername: PCWSTR, pdevmode: Long, pattributeinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_GetJobAttributes(pprintername.toCPointer<ByteVar>(), pdevmode.toCPointer<ByteVar>(), pattributeinfo.toCPointer<ByteVar>())

public actual fun GetJobAttributesEx(pprintername: PCWSTR, pdevmode: Long, dwlevel: UInt, pattributeinfo: Long, nsize: UInt, dwflags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_GetJobAttributesEx(pprintername.toCPointer<ByteVar>(), pdevmode.toCPointer<ByteVar>(), dwlevel, pattributeinfo.toCPointer<ByteVar>(), nsize, dwflags)

public actual fun GetJobNamedPropertyValue(hprinter: PRINTER_HANDLE, jobid: UInt, pszname: PCWSTR, pvalue: Long): UInt =
    0u

public actual fun GetJobW(hprinter: PRINTER_HANDLE, jobid: UInt, level: UInt, pjob: Long, cbbuf: UInt, pcbneeded: Long): BOOL =
    0

public actual fun GetPrintExecutionData(pdata: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_GetPrintExecutionData(pdata.toCPointer<ByteVar>())

public actual fun GetPrintOutputInfo(hwnd: HWND, pszprinter: PCWSTR, phfile: Long, ppszoutputfile: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_GetPrintOutputInfo(hwnd.toCPointer<ByteVar>(), pszprinter.toCPointer<ByteVar>(), phfile.toCPointer<ByteVar>(), ppszoutputfile.toCPointer<ByteVar>())

public actual fun GetPrintProcessorDirectoryA(pname: PCSTR, penvironment: PCSTR, level: UInt, pprintprocessorinfo: Long, cbbuf: UInt, pcbneeded: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_GetPrintProcessorDirectoryA(pname.toCPointer<ByteVar>(), penvironment.toCPointer<ByteVar>(), level, pprintprocessorinfo.toCPointer<ByteVar>(), cbbuf, pcbneeded.toCPointer<ByteVar>())

public actual fun GetPrintProcessorDirectoryW(pname: PCWSTR, penvironment: PCWSTR, level: UInt, pprintprocessorinfo: Long, cbbuf: UInt, pcbneeded: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_GetPrintProcessorDirectoryW(pname.toCPointer<ByteVar>(), penvironment.toCPointer<ByteVar>(), level, pprintprocessorinfo.toCPointer<ByteVar>(), cbbuf, pcbneeded.toCPointer<ByteVar>())

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
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_GetPrinterDriverDirectoryA(pname.toCPointer<ByteVar>(), penvironment.toCPointer<ByteVar>(), level, pdriverdirectory.toCPointer<ByteVar>(), cbbuf, pcbneeded.toCPointer<ByteVar>())

public actual fun GetPrinterDriverDirectoryW(pname: PCWSTR, penvironment: PCWSTR, level: UInt, pdriverdirectory: Long, cbbuf: UInt, pcbneeded: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_GetPrinterDriverDirectoryW(pname.toCPointer<ByteVar>(), penvironment.toCPointer<ByteVar>(), level, pdriverdirectory.toCPointer<ByteVar>(), cbbuf, pcbneeded.toCPointer<ByteVar>())

public actual fun GetPrinterDriverPackagePathA(pszserver: PCSTR, pszenvironment: PCSTR, pszlanguage: PCSTR, pszpackageid: PCSTR, pszdriverpackagecab: PSTR, cchdriverpackagecab: UInt, pcchrequiredsize: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_GetPrinterDriverPackagePathA(pszserver.toCPointer<ByteVar>(), pszenvironment.toCPointer<ByteVar>(), pszlanguage.toCPointer<ByteVar>(), pszpackageid.toCPointer<ByteVar>(), pszdriverpackagecab.toCPointer<ByteVar>(), cchdriverpackagecab, pcchrequiredsize.toCPointer<ByteVar>())

public actual fun GetPrinterDriverPackagePathW(pszserver: PCWSTR, pszenvironment: PCWSTR, pszlanguage: PCWSTR, pszpackageid: PCWSTR, pszdriverpackagecab: PWSTR, cchdriverpackagecab: UInt, pcchrequiredsize: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_GetPrinterDriverPackagePathW(pszserver.toCPointer<ByteVar>(), pszenvironment.toCPointer<ByteVar>(), pszlanguage.toCPointer<ByteVar>(), pszpackageid.toCPointer<ByteVar>(), pszdriverpackagecab.toCPointer<ByteVar>(), cchdriverpackagecab, pcchrequiredsize.toCPointer<ByteVar>())

public actual fun GetPrinterDriverW(hprinter: PRINTER_HANDLE, penvironment: PCWSTR, level: UInt, pdriverinfo: Long, cbbuf: UInt, pcbneeded: Long): BOOL =
    0

public actual fun GetPrinterW(hprinter: PRINTER_HANDLE, level: UInt, pprinter: Long, cbbuf: UInt, pcbneeded: Long): BOOL =
    0

public actual fun GetSpoolFileHandle(hprinter: PRINTER_HANDLE): HANDLE =
    0L

public actual fun ImpersonatePrinterClient(htoken: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_ImpersonatePrinterClient(htoken.toCPointer<ByteVar>())

public actual fun InstallPrinterDriverFromPackageA(pszserver: PCSTR, pszinfpath: PCSTR, pszdrivername: PCSTR, pszenvironment: PCSTR, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_InstallPrinterDriverFromPackageA(pszserver.toCPointer<ByteVar>(), pszinfpath.toCPointer<ByteVar>(), pszdrivername.toCPointer<ByteVar>(), pszenvironment.toCPointer<ByteVar>(), dwflags)

public actual fun InstallPrinterDriverFromPackageW(pszserver: PCWSTR, pszinfpath: PCWSTR, pszdrivername: PCWSTR, pszenvironment: PCWSTR, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_InstallPrinterDriverFromPackageW(pszserver.toCPointer<ByteVar>(), pszinfpath.toCPointer<ByteVar>(), pszdrivername.toCPointer<ByteVar>(), pszenvironment.toCPointer<ByteVar>(), dwflags)

public actual fun IsValidDevmodeA(pdevmode: Long, devmodesize: ULong): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_IsValidDevmodeA(pdevmode.toCPointer<ByteVar>(), devmodesize)

public actual fun IsValidDevmodeW(pdevmode: Long, devmodesize: ULong): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_IsValidDevmodeW(pdevmode.toCPointer<ByteVar>(), devmodesize)

public actual fun OpenPrinter2A(pprintername: PCSTR, phprinter: Long, pdefault: Long, poptions: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_OpenPrinter2A(pprintername.toCPointer<ByteVar>(), phprinter.toCPointer<ByteVar>(), pdefault.toCPointer<ByteVar>(), poptions.toCPointer<ByteVar>())

public actual fun OpenPrinter2W(pprintername: PCWSTR, phprinter: Long, pdefault: Long, poptions: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_OpenPrinter2W(pprintername.toCPointer<ByteVar>(), phprinter.toCPointer<ByteVar>(), pdefault.toCPointer<ByteVar>(), poptions.toCPointer<ByteVar>())

public actual fun OpenPrinterA(pprintername: PCSTR, phprinter: Long, pdefault: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_OpenPrinterA(pprintername.toCPointer<ByteVar>(), phprinter.toCPointer<ByteVar>(), pdefault.toCPointer<ByteVar>())

public actual fun OpenPrinterW(pprintername: PCWSTR, phprinter: Long, pdefault: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_OpenPrinterW(pprintername.toCPointer<ByteVar>(), phprinter.toCPointer<ByteVar>(), pdefault.toCPointer<ByteVar>())

public actual fun PartialReplyPrinterChangeNotification(hprinter: PRINTER_HANDLE, pdatasrc: Long): BOOL =
    0

public actual fun PlayGdiScriptOnPrinterIC(hprinteric: HANDLE, pin: Long, cin: UInt, pout: Long, cout: UInt, ul: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_PlayGdiScriptOnPrinterIC(hprinteric.toCPointer<ByteVar>(), pin.toCPointer<ByteVar>(), cin, pout.toCPointer<ByteVar>(), cout, ul)

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
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_RegisterForPrintAsyncNotifications(pszname.toCPointer<ByteVar>(), pnotificationtype.toCPointer<ByteVar>(), euserfilter, econversationstyle, pcallback.toCPointer<ByteVar>(), phnotify.toCPointer<ByteVar>())

public actual fun RemovePrintDeviceObject(hdeviceobject: HANDLE): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_RemovePrintDeviceObject(hdeviceobject.toCPointer<ByteVar>())

public actual fun ReplyPrinterChangeNotification(hprinter: PRINTER_HANDLE, fdwchangeflags: UInt, pdwresult: Long, pprinternotifyinfo: Long): BOOL =
    0

public actual fun ReplyPrinterChangeNotificationEx(hnotify: HANDLE, dwcolor: UInt, fdwflags: UInt, pdwresult: Long, pprinternotifyinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_ReplyPrinterChangeNotificationEx(hnotify.toCPointer<ByteVar>(), dwcolor, fdwflags, pdwresult.toCPointer<ByteVar>(), pprinternotifyinfo.toCPointer<ByteVar>())

public actual fun ReportJobProcessingProgress(printerhandle: HANDLE, jobid: UInt, joboperation: EPrintXPSJobOperation, jobprogress: EPrintXPSJobProgress): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_ReportJobProcessingProgress(printerhandle.toCPointer<ByteVar>(), jobid, joboperation, jobprogress)

public actual fun ResetPrinterA(hprinter: PRINTER_HANDLE, pdefault: Long): BOOL =
    0

public actual fun ResetPrinterW(hprinter: PRINTER_HANDLE, pdefault: Long): BOOL =
    0

public actual fun RevertToPrinterSelf(): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_RevertToPrinterSelf()?.toLong() ?: 0L

public actual fun RouterAllocBidiMem(numbytes: ULong): Long =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_RouterAllocBidiMem(numbytes)?.toLong() ?: 0L

public actual fun RouterAllocBidiResponseContainer(count: UInt): Long =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_RouterAllocBidiResponseContainer(count)?.toLong() ?: 0L

public actual fun RouterAllocPrinterNotifyInfo(cprinternotifyinfodata: UInt): Long =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_RouterAllocPrinterNotifyInfo(cprinternotifyinfodata)?.toLong() ?: 0L

public actual fun RouterFreeBidiMem(pmempointer: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_RouterFreeBidiMem(pmempointer.toCPointer<ByteVar>())
}

public actual fun RouterFreeBidiResponseContainer(pdata: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_RouterFreeBidiResponseContainer(pdata.toCPointer<ByteVar>())

public actual fun RouterFreePrinterNotifyInfo(pinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_RouterFreePrinterNotifyInfo(pinfo.toCPointer<ByteVar>())

public actual fun ScheduleJob(hprinter: PRINTER_HANDLE, jobid: UInt): BOOL =
    0

public actual fun SetCPSUIUserData(hdlg: HWND, cpsuiuserdata: ULong): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_SetCPSUIUserData(hdlg.toCPointer<ByteVar>(), cpsuiuserdata)

public actual fun SetDefaultPrinterA(pszprinter: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_SetDefaultPrinterA(pszprinter.toCPointer<ByteVar>())

public actual fun SetDefaultPrinterW(pszprinter: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_SetDefaultPrinterW(pszprinter.toCPointer<ByteVar>())

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
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_SetPortA(pname.toCPointer<ByteVar>(), pportname.toCPointer<ByteVar>(), dwlevel, pportinfo.toCPointer<ByteVar>())

public actual fun SetPortW(pname: PCWSTR, pportname: PCWSTR, dwlevel: UInt, pportinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_SetPortW(pname.toCPointer<ByteVar>(), pportname.toCPointer<ByteVar>(), dwlevel, pportinfo.toCPointer<ByteVar>())

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
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_SpoolerCopyFileEvent(pszprintername.toCPointer<ByteVar>(), pszkey.toCPointer<ByteVar>(), dwcopyfileevent)

public actual fun SpoolerFindClosePrinterChangeNotification(hprinter: PRINTER_HANDLE): BOOL =
    0

public actual fun SpoolerFindFirstPrinterChangeNotification(hprinter: PRINTER_HANDLE, fdwfilterflags: UInt, fdwoptions: UInt, pprinternotifyoptions: Long, pvreserved: Long, pnotificationconfig: Long, phnotify: Long, phevent: Long): BOOL =
    0

public actual fun SpoolerFindNextPrinterChangeNotification(hprinter: PRINTER_HANDLE, pfdwchange: Long, pprinternotifyoptions: Long, ppprinternotifyinfo: Long): BOOL =
    0

public actual fun SpoolerFreePrinterNotifyInfo(pinfo: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_SpoolerFreePrinterNotifyInfo(pinfo.toCPointer<ByteVar>())
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
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_UnRegisterForPrintAsyncNotifications(param0.toCPointer<ByteVar>())

public actual fun UpdatePrintDeviceObject(hprinter: PRINTER_HANDLE, hdeviceobject: HANDLE): HRESULT =
    0

public actual fun UploadPrinterDriverPackageA(pszserver: PCSTR, pszinfpath: PCSTR, pszenvironment: PCSTR, dwflags: UInt, hwnd: HWND, pszdestinfpath: PSTR, pcchdestinfpath: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_UploadPrinterDriverPackageA(pszserver.toCPointer<ByteVar>(), pszinfpath.toCPointer<ByteVar>(), pszenvironment.toCPointer<ByteVar>(), dwflags, hwnd.toCPointer<ByteVar>(), pszdestinfpath.toCPointer<ByteVar>(), pcchdestinfpath.toCPointer<ByteVar>())

public actual fun UploadPrinterDriverPackageW(pszserver: PCWSTR, pszinfpath: PCWSTR, pszenvironment: PCWSTR, dwflags: UInt, hwnd: HWND, pszdestinfpath: PWSTR, pcchdestinfpath: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_UploadPrinterDriverPackageW(pszserver.toCPointer<ByteVar>(), pszinfpath.toCPointer<ByteVar>(), pszenvironment.toCPointer<ByteVar>(), dwflags, hwnd.toCPointer<ByteVar>(), pszdestinfpath.toCPointer<ByteVar>(), pcchdestinfpath.toCPointer<ByteVar>())

public actual fun WaitForPrinterChange(hprinter: PRINTER_HANDLE, flags: UInt): UInt =
    0u

public actual fun WritePrinter(hprinter: PRINTER_HANDLE, pbuf: Long, cbbuf: UInt, pcwritten: Long): BOOL =
    0

public actual fun XcvDataW(hxcv: HANDLE, pszdataname: PCWSTR, pinputdata: Long, cbinputdata: UInt, poutputdata: Long, cboutputdata: UInt, pcboutputneeded: Long, pdwstatus: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.printing.cinterop.windowssys_windows_win32_graphics_printing_XcvDataW(hxcv.toCPointer<ByteVar>(), pszdataname.toCPointer<ByteVar>(), pinputdata.toCPointer<ByteVar>(), cbinputdata, poutputdata.toCPointer<ByteVar>(), cboutputdata, pcboutputneeded.toCPointer<ByteVar>(), pdwstatus.toCPointer<ByteVar>())
