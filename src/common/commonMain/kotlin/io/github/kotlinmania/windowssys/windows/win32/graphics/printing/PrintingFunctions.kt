package io.github.kotlinmania.windowssys.windows.win32.graphics.printing

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public fun interface FnCallback {
    public operator fun invoke(ppsuiinfo: Long, lparam: Foundation.LPARAM): Int
}

public fun AbortPrinter(hprinter: PRINTER_HANDLE): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "AbortPrinter", longArrayOf(Win32DynamicFfi.objectSlot(hprinter))).toInt()
}

public fun AddFormA(hprinter: PRINTER_HANDLE, level: UInt, pform: Long): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "AddFormA", longArrayOf(Win32DynamicFfi.objectSlot(hprinter), level.toLong(), pform)).toInt()
}

public fun AddFormW(hprinter: PRINTER_HANDLE, level: UInt, pform: Long): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "AddFormW", longArrayOf(Win32DynamicFfi.objectSlot(hprinter), level.toLong(), pform)).toInt()
}

public fun AddJobA(hprinter: PRINTER_HANDLE, level: UInt, pdata: Long, cbbuf: UInt, pcbneeded: Long): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "AddJobA", longArrayOf(Win32DynamicFfi.objectSlot(hprinter), level.toLong(), pdata, cbbuf.toLong(), pcbneeded)).toInt()
}

public fun AddJobW(hprinter: PRINTER_HANDLE, level: UInt, pdata: Long, cbbuf: UInt, pcbneeded: Long): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "AddJobW", longArrayOf(Win32DynamicFfi.objectSlot(hprinter), level.toLong(), pdata, cbbuf.toLong(), pcbneeded)).toInt()
}

public fun AddMonitorA(pname: PCSTR, level: UInt, pmonitors: Long): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "AddMonitorA", longArrayOf(pname, level.toLong(), pmonitors)).toInt()
}

public fun AddMonitorW(pname: PCWSTR, level: UInt, pmonitors: Long): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "AddMonitorW", longArrayOf(pname, level.toLong(), pmonitors)).toInt()
}

public fun AddPortA(pname: PCSTR, hwnd: Foundation.HWND, pmonitorname: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "AddPortA", longArrayOf(pname, Win32DynamicFfi.objectSlot(hwnd), pmonitorname)).toInt()
}

public fun AddPortW(pname: PCWSTR, hwnd: Foundation.HWND, pmonitorname: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "AddPortW", longArrayOf(pname, Win32DynamicFfi.objectSlot(hwnd), pmonitorname)).toInt()
}

public fun AddPrintDeviceObject(hprinter: PRINTER_HANDLE, phdeviceobject: Long): HRESULT {
    return Win32DynamicFfi.invoke("spoolss.dll", "AddPrintDeviceObject", longArrayOf(Win32DynamicFfi.objectSlot(hprinter), phdeviceobject)).toInt()
}

public fun AddPrintProcessorA(pname: PCSTR, penvironment: PCSTR, ppathname: PCSTR, pprintprocessorname: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "AddPrintProcessorA", longArrayOf(pname, penvironment, ppathname, pprintprocessorname)).toInt()
}

public fun AddPrintProcessorW(pname: PCWSTR, penvironment: PCWSTR, ppathname: PCWSTR, pprintprocessorname: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "AddPrintProcessorW", longArrayOf(pname, penvironment, ppathname, pprintprocessorname)).toInt()
}

public fun AddPrintProvidorA(pname: PCSTR, level: UInt, pprovidorinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "AddPrintProvidorA", longArrayOf(pname, level.toLong(), pprovidorinfo)).toInt()
}

public fun AddPrintProvidorW(pname: PCWSTR, level: UInt, pprovidorinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "AddPrintProvidorW", longArrayOf(pname, level.toLong(), pprovidorinfo)).toInt()
}

public fun AddPrinterA(pname: PCSTR, level: UInt, pprinter: Long): Foundation.HANDLE {
    Win32DynamicFfi.invoke("winspool.drv", "AddPrinterA", longArrayOf(pname, level.toLong(), pprinter))
    return Foundation.HANDLE()
}

public fun AddPrinterConnection2A(hwnd: Foundation.HWND, pszname: PCSTR, dwlevel: UInt, pconnectioninfo: Long): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "AddPrinterConnection2A", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), pszname, dwlevel.toLong(), pconnectioninfo)).toInt()
}

public fun AddPrinterConnection2W(hwnd: Foundation.HWND, pszname: PCWSTR, dwlevel: UInt, pconnectioninfo: Long): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "AddPrinterConnection2W", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), pszname, dwlevel.toLong(), pconnectioninfo)).toInt()
}

public fun AddPrinterConnectionA(pname: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "AddPrinterConnectionA", longArrayOf(pname)).toInt()
}

public fun AddPrinterConnectionW(pname: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "AddPrinterConnectionW", longArrayOf(pname)).toInt()
}

public fun AddPrinterDriverA(pname: PCSTR, level: UInt, pdriverinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "AddPrinterDriverA", longArrayOf(pname, level.toLong(), pdriverinfo)).toInt()
}

public fun AddPrinterDriverExA(pname: PCSTR, level: UInt, lpbdriverinfo: Long, dwfilecopyflags: UInt): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "AddPrinterDriverExA", longArrayOf(pname, level.toLong(), lpbdriverinfo, dwfilecopyflags.toLong())).toInt()
}

public fun AddPrinterDriverExW(pname: PCWSTR, level: UInt, lpbdriverinfo: Long, dwfilecopyflags: UInt): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "AddPrinterDriverExW", longArrayOf(pname, level.toLong(), lpbdriverinfo, dwfilecopyflags.toLong())).toInt()
}

public fun AddPrinterDriverW(pname: PCWSTR, level: UInt, pdriverinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "AddPrinterDriverW", longArrayOf(pname, level.toLong(), pdriverinfo)).toInt()
}

public fun AddPrinterW(pname: PCWSTR, level: UInt, pprinter: Long): Foundation.HANDLE {
    Win32DynamicFfi.invoke("winspool.drv", "AddPrinterW", longArrayOf(pname, level.toLong(), pprinter))
    return Foundation.HANDLE()
}

public fun AdvancedDocumentPropertiesA(hwnd: Foundation.HWND, hprinter: PRINTER_HANDLE, pdevicename: PCSTR, pdevmodeoutput: Long, pdevmodeinput: Long): Int {
    return Win32DynamicFfi.invoke("winspool.drv", "AdvancedDocumentPropertiesA", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), Win32DynamicFfi.objectSlot(hprinter), pdevicename, pdevmodeoutput, pdevmodeinput)).toInt()
}

public fun AdvancedDocumentPropertiesW(hwnd: Foundation.HWND, hprinter: PRINTER_HANDLE, pdevicename: PCWSTR, pdevmodeoutput: Long, pdevmodeinput: Long): Int {
    return Win32DynamicFfi.invoke("winspool.drv", "AdvancedDocumentPropertiesW", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), Win32DynamicFfi.objectSlot(hprinter), pdevicename, pdevmodeoutput, pdevmodeinput)).toInt()
}

public fun AppendPrinterNotifyInfoData(pinfodest: Long, pdatasrc: Long, fdwflags: UInt): BOOL {
    return Win32DynamicFfi.invoke("spoolss.dll", "AppendPrinterNotifyInfoData", longArrayOf(pinfodest, pdatasrc, fdwflags.toLong())).toInt()
}

public fun CallRouterFindFirstPrinterChangeNotification(hprinterrpc: Foundation.HANDLE, fdwfilterflags: UInt, fdwoptions: UInt, hnotify: Foundation.HANDLE, pprinternotifyoptions: Long): UInt {
    return Win32DynamicFfi.invoke("spoolss.dll", "CallRouterFindFirstPrinterChangeNotification", longArrayOf(Win32DynamicFfi.objectSlot(hprinterrpc), fdwfilterflags.toLong(), fdwoptions.toLong(), Win32DynamicFfi.objectSlot(hnotify), pprinternotifyoptions)).toUInt()
}

public fun ClosePrinter(hprinter: PRINTER_HANDLE): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "ClosePrinter", longArrayOf(Win32DynamicFfi.objectSlot(hprinter))).toInt()
}

public fun CloseSpoolFileHandle(hprinter: PRINTER_HANDLE, hspoolfile: Foundation.HANDLE): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "CloseSpoolFileHandle", longArrayOf(Win32DynamicFfi.objectSlot(hprinter), Win32DynamicFfi.objectSlot(hspoolfile))).toInt()
}

public fun CommitSpoolData(hprinter: PRINTER_HANDLE, hspoolfile: Foundation.HANDLE, cbcommit: UInt): Foundation.HANDLE {
    Win32DynamicFfi.invoke("winspool.drv", "CommitSpoolData", longArrayOf(Win32DynamicFfi.objectSlot(hprinter), Win32DynamicFfi.objectSlot(hspoolfile), cbcommit.toLong()))
    return Foundation.HANDLE()
}

public fun CommonPropertySheetUIA(hwndowner: Foundation.HWND, pfnpropsheetui: PFNPROPSHEETUI, lparam: Foundation.LPARAM, presult: Long): Int {
    return Win32DynamicFfi.invoke("compstui.dll", "CommonPropertySheetUIA", longArrayOf(Win32DynamicFfi.objectSlot(hwndowner), Win32DynamicFfi.objectSlot(pfnpropsheetui), Win32DynamicFfi.objectSlot(lparam), presult)).toInt()
}

public fun CommonPropertySheetUIW(hwndowner: Foundation.HWND, pfnpropsheetui: PFNPROPSHEETUI, lparam: Foundation.LPARAM, presult: Long): Int {
    return Win32DynamicFfi.invoke("compstui.dll", "CommonPropertySheetUIW", longArrayOf(Win32DynamicFfi.objectSlot(hwndowner), Win32DynamicFfi.objectSlot(pfnpropsheetui), Win32DynamicFfi.objectSlot(lparam), presult)).toInt()
}

public fun ConfigurePortA(pname: PCSTR, hwnd: Foundation.HWND, pportname: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "ConfigurePortA", longArrayOf(pname, Win32DynamicFfi.objectSlot(hwnd), pportname)).toInt()
}

public fun ConfigurePortW(pname: PCWSTR, hwnd: Foundation.HWND, pportname: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "ConfigurePortW", longArrayOf(pname, Win32DynamicFfi.objectSlot(hwnd), pportname)).toInt()
}

public fun ConnectToPrinterDlg(hwnd: Foundation.HWND, flags: UInt): Foundation.HANDLE {
    Win32DynamicFfi.invoke("winspool.drv", "ConnectToPrinterDlg", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), flags.toLong()))
    return Foundation.HANDLE()
}

public fun CorePrinterDriverInstalledA(pszserver: PCSTR, pszenvironment: PCSTR, coredriverguid: GUID, ftdriverdate: Foundation.FILETIME, dwldriverversion: ULong, pbdriverinstalled: Long): HRESULT {
    return Win32DynamicFfi.invoke("winspool.drv", "CorePrinterDriverInstalledA", longArrayOf(pszserver, pszenvironment, Win32DynamicFfi.guidSlot(coredriverguid.data1, coredriverguid.data2, coredriverguid.data3, coredriverguid.data4), Win32DynamicFfi.objectSlot(ftdriverdate), dwldriverversion.toLong(), pbdriverinstalled)).toInt()
}

public fun CorePrinterDriverInstalledW(pszserver: PCWSTR, pszenvironment: PCWSTR, coredriverguid: GUID, ftdriverdate: Foundation.FILETIME, dwldriverversion: ULong, pbdriverinstalled: Long): HRESULT {
    return Win32DynamicFfi.invoke("winspool.drv", "CorePrinterDriverInstalledW", longArrayOf(pszserver, pszenvironment, Win32DynamicFfi.guidSlot(coredriverguid.data1, coredriverguid.data2, coredriverguid.data3, coredriverguid.data4), Win32DynamicFfi.objectSlot(ftdriverdate), dwldriverversion.toLong(), pbdriverinstalled)).toInt()
}

public fun CreatePrintAsyncNotifyChannel(pszname: PCWSTR, pnotificationtype: Long, euserfilter: PrintAsyncNotifyUserFilter, econversationstyle: PrintAsyncNotifyConversationStyle, pcallback: Long, ppiasynchnotification: Long): HRESULT {
    return Win32DynamicFfi.invoke("winspool.drv", "CreatePrintAsyncNotifyChannel", longArrayOf(pszname, pnotificationtype, euserfilter.toLong(), econversationstyle.toLong(), pcallback, ppiasynchnotification)).toInt()
}

public fun CreatePrinterIC(hprinter: PRINTER_HANDLE, pdevmode: Long): Foundation.HANDLE {
    Win32DynamicFfi.invoke("winspool.drv", "CreatePrinterIC", longArrayOf(Win32DynamicFfi.objectSlot(hprinter), pdevmode))
    return Foundation.HANDLE()
}

public fun DeleteFormA(hprinter: PRINTER_HANDLE, pformname: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "DeleteFormA", longArrayOf(Win32DynamicFfi.objectSlot(hprinter), pformname)).toInt()
}

public fun DeleteFormW(hprinter: PRINTER_HANDLE, pformname: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "DeleteFormW", longArrayOf(Win32DynamicFfi.objectSlot(hprinter), pformname)).toInt()
}

public fun DeleteJobNamedProperty(hprinter: PRINTER_HANDLE, jobid: UInt, pszname: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("winspool.drv", "DeleteJobNamedProperty", longArrayOf(Win32DynamicFfi.objectSlot(hprinter), jobid.toLong(), pszname)).toUInt()
}

public fun DeleteMonitorA(pname: PCSTR, penvironment: PCSTR, pmonitorname: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "DeleteMonitorA", longArrayOf(pname, penvironment, pmonitorname)).toInt()
}

public fun DeleteMonitorW(pname: PCWSTR, penvironment: PCWSTR, pmonitorname: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "DeleteMonitorW", longArrayOf(pname, penvironment, pmonitorname)).toInt()
}

public fun DeletePortA(pname: PCSTR, hwnd: Foundation.HWND, pportname: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "DeletePortA", longArrayOf(pname, Win32DynamicFfi.objectSlot(hwnd), pportname)).toInt()
}

public fun DeletePortW(pname: PCWSTR, hwnd: Foundation.HWND, pportname: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "DeletePortW", longArrayOf(pname, Win32DynamicFfi.objectSlot(hwnd), pportname)).toInt()
}

public fun DeletePrintProcessorA(pname: PCSTR, penvironment: PCSTR, pprintprocessorname: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "DeletePrintProcessorA", longArrayOf(pname, penvironment, pprintprocessorname)).toInt()
}

public fun DeletePrintProcessorW(pname: PCWSTR, penvironment: PCWSTR, pprintprocessorname: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "DeletePrintProcessorW", longArrayOf(pname, penvironment, pprintprocessorname)).toInt()
}

public fun DeletePrintProvidorA(pname: PCSTR, penvironment: PCSTR, pprintprovidorname: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "DeletePrintProvidorA", longArrayOf(pname, penvironment, pprintprovidorname)).toInt()
}

public fun DeletePrintProvidorW(pname: PCWSTR, penvironment: PCWSTR, pprintprovidorname: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "DeletePrintProvidorW", longArrayOf(pname, penvironment, pprintprovidorname)).toInt()
}

public fun DeletePrinter(hprinter: PRINTER_HANDLE): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "DeletePrinter", longArrayOf(Win32DynamicFfi.objectSlot(hprinter))).toInt()
}

public fun DeletePrinterConnectionA(pname: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "DeletePrinterConnectionA", longArrayOf(pname)).toInt()
}

public fun DeletePrinterConnectionW(pname: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "DeletePrinterConnectionW", longArrayOf(pname)).toInt()
}

public fun DeletePrinterDataA(hprinter: PRINTER_HANDLE, pvaluename: PCSTR): UInt {
    return Win32DynamicFfi.invoke("winspool.drv", "DeletePrinterDataA", longArrayOf(Win32DynamicFfi.objectSlot(hprinter), pvaluename)).toUInt()
}

public fun DeletePrinterDataExA(hprinter: PRINTER_HANDLE, pkeyname: PCSTR, pvaluename: PCSTR): UInt {
    return Win32DynamicFfi.invoke("winspool.drv", "DeletePrinterDataExA", longArrayOf(Win32DynamicFfi.objectSlot(hprinter), pkeyname, pvaluename)).toUInt()
}

public fun DeletePrinterDataExW(hprinter: PRINTER_HANDLE, pkeyname: PCWSTR, pvaluename: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("winspool.drv", "DeletePrinterDataExW", longArrayOf(Win32DynamicFfi.objectSlot(hprinter), pkeyname, pvaluename)).toUInt()
}

public fun DeletePrinterDataW(hprinter: PRINTER_HANDLE, pvaluename: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("winspool.drv", "DeletePrinterDataW", longArrayOf(Win32DynamicFfi.objectSlot(hprinter), pvaluename)).toUInt()
}

public fun DeletePrinterDriverA(pname: PCSTR, penvironment: PCSTR, pdrivername: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "DeletePrinterDriverA", longArrayOf(pname, penvironment, pdrivername)).toInt()
}

public fun DeletePrinterDriverExA(pname: PCSTR, penvironment: PCSTR, pdrivername: PCSTR, dwdeleteflag: UInt, dwversionflag: UInt): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "DeletePrinterDriverExA", longArrayOf(pname, penvironment, pdrivername, dwdeleteflag.toLong(), dwversionflag.toLong())).toInt()
}

public fun DeletePrinterDriverExW(pname: PCWSTR, penvironment: PCWSTR, pdrivername: PCWSTR, dwdeleteflag: UInt, dwversionflag: UInt): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "DeletePrinterDriverExW", longArrayOf(pname, penvironment, pdrivername, dwdeleteflag.toLong(), dwversionflag.toLong())).toInt()
}

public fun DeletePrinterDriverPackageA(pszserver: PCSTR, pszinfpath: PCSTR, pszenvironment: PCSTR): HRESULT {
    return Win32DynamicFfi.invoke("winspool.drv", "DeletePrinterDriverPackageA", longArrayOf(pszserver, pszinfpath, pszenvironment)).toInt()
}

public fun DeletePrinterDriverPackageW(pszserver: PCWSTR, pszinfpath: PCWSTR, pszenvironment: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("winspool.drv", "DeletePrinterDriverPackageW", longArrayOf(pszserver, pszinfpath, pszenvironment)).toInt()
}

public fun DeletePrinterDriverW(pname: PCWSTR, penvironment: PCWSTR, pdrivername: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "DeletePrinterDriverW", longArrayOf(pname, penvironment, pdrivername)).toInt()
}

public fun DeletePrinterIC(hprinteric: Foundation.HANDLE): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "DeletePrinterIC", longArrayOf(Win32DynamicFfi.objectSlot(hprinteric))).toInt()
}

public fun DeletePrinterKeyA(hprinter: PRINTER_HANDLE, pkeyname: PCSTR): UInt {
    return Win32DynamicFfi.invoke("winspool.drv", "DeletePrinterKeyA", longArrayOf(Win32DynamicFfi.objectSlot(hprinter), pkeyname)).toUInt()
}

public fun DeletePrinterKeyW(hprinter: PRINTER_HANDLE, pkeyname: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("winspool.drv", "DeletePrinterKeyW", longArrayOf(Win32DynamicFfi.objectSlot(hprinter), pkeyname)).toUInt()
}

public fun DevQueryPrint(hprinter: PRINTER_HANDLE, pdevmode: Long, presid: Long): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "DevQueryPrint", longArrayOf(Win32DynamicFfi.objectSlot(hprinter), pdevmode, presid)).toInt()
}

public fun DevQueryPrintEx(pdqpinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "DevQueryPrintEx", longArrayOf(pdqpinfo)).toInt()
}

public fun DocumentPropertiesA(hwnd: Foundation.HWND, hprinter: PRINTER_HANDLE, pdevicename: PCSTR, pdevmodeoutput: Long, pdevmodeinput: Long, fmode: UInt): Int {
    return Win32DynamicFfi.invoke("winspool.drv", "DocumentPropertiesA", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), Win32DynamicFfi.objectSlot(hprinter), pdevicename, pdevmodeoutput, pdevmodeinput, fmode.toLong())).toInt()
}

public fun DocumentPropertiesW(hwnd: Foundation.HWND, hprinter: PRINTER_HANDLE, pdevicename: PCWSTR, pdevmodeoutput: Long, pdevmodeinput: Long, fmode: UInt): Int {
    return Win32DynamicFfi.invoke("winspool.drv", "DocumentPropertiesW", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), Win32DynamicFfi.objectSlot(hprinter), pdevicename, pdevmodeoutput, pdevmodeinput, fmode.toLong())).toInt()
}

public fun EndDocPrinter(hprinter: PRINTER_HANDLE): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "EndDocPrinter", longArrayOf(Win32DynamicFfi.objectSlot(hprinter))).toInt()
}

public fun EndPagePrinter(hprinter: PRINTER_HANDLE): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "EndPagePrinter", longArrayOf(Win32DynamicFfi.objectSlot(hprinter))).toInt()
}

public fun EnumFormsA(hprinter: PRINTER_HANDLE, level: UInt, pform: Long, cbbuf: UInt, pcbneeded: Long, pcreturned: Long): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "EnumFormsA", longArrayOf(Win32DynamicFfi.objectSlot(hprinter), level.toLong(), pform, cbbuf.toLong(), pcbneeded, pcreturned)).toInt()
}

public fun EnumFormsW(hprinter: PRINTER_HANDLE, level: UInt, pform: Long, cbbuf: UInt, pcbneeded: Long, pcreturned: Long): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "EnumFormsW", longArrayOf(Win32DynamicFfi.objectSlot(hprinter), level.toLong(), pform, cbbuf.toLong(), pcbneeded, pcreturned)).toInt()
}

public fun EnumJobNamedProperties(hprinter: PRINTER_HANDLE, jobid: UInt, pcproperties: Long, ppproperties: Long): UInt {
    return Win32DynamicFfi.invoke("winspool.drv", "EnumJobNamedProperties", longArrayOf(Win32DynamicFfi.objectSlot(hprinter), jobid.toLong(), pcproperties, ppproperties)).toUInt()
}

public fun EnumJobsA(hprinter: PRINTER_HANDLE, firstjob: UInt, nojobs: UInt, level: UInt, pjob: Long, cbbuf: UInt, pcbneeded: Long, pcreturned: Long): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "EnumJobsA", longArrayOf(Win32DynamicFfi.objectSlot(hprinter), firstjob.toLong(), nojobs.toLong(), level.toLong(), pjob, cbbuf.toLong(), pcbneeded, pcreturned)).toInt()
}

public fun EnumJobsW(hprinter: PRINTER_HANDLE, firstjob: UInt, nojobs: UInt, level: UInt, pjob: Long, cbbuf: UInt, pcbneeded: Long, pcreturned: Long): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "EnumJobsW", longArrayOf(Win32DynamicFfi.objectSlot(hprinter), firstjob.toLong(), nojobs.toLong(), level.toLong(), pjob, cbbuf.toLong(), pcbneeded, pcreturned)).toInt()
}

public fun EnumMonitorsA(pname: PCSTR, level: UInt, pmonitor: Long, cbbuf: UInt, pcbneeded: Long, pcreturned: Long): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "EnumMonitorsA", longArrayOf(pname, level.toLong(), pmonitor, cbbuf.toLong(), pcbneeded, pcreturned)).toInt()
}

public fun EnumMonitorsW(pname: PCWSTR, level: UInt, pmonitor: Long, cbbuf: UInt, pcbneeded: Long, pcreturned: Long): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "EnumMonitorsW", longArrayOf(pname, level.toLong(), pmonitor, cbbuf.toLong(), pcbneeded, pcreturned)).toInt()
}

public fun EnumPortsA(pname: PCSTR, level: UInt, pport: Long, cbbuf: UInt, pcbneeded: Long, pcreturned: Long): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "EnumPortsA", longArrayOf(pname, level.toLong(), pport, cbbuf.toLong(), pcbneeded, pcreturned)).toInt()
}

public fun EnumPortsW(pname: PCWSTR, level: UInt, pport: Long, cbbuf: UInt, pcbneeded: Long, pcreturned: Long): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "EnumPortsW", longArrayOf(pname, level.toLong(), pport, cbbuf.toLong(), pcbneeded, pcreturned)).toInt()
}

public fun EnumPrintProcessorDatatypesA(pname: PCSTR, pprintprocessorname: PCSTR, level: UInt, pdatatypes: Long, cbbuf: UInt, pcbneeded: Long, pcreturned: Long): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "EnumPrintProcessorDatatypesA", longArrayOf(pname, pprintprocessorname, level.toLong(), pdatatypes, cbbuf.toLong(), pcbneeded, pcreturned)).toInt()
}

public fun EnumPrintProcessorDatatypesW(pname: PCWSTR, pprintprocessorname: PCWSTR, level: UInt, pdatatypes: Long, cbbuf: UInt, pcbneeded: Long, pcreturned: Long): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "EnumPrintProcessorDatatypesW", longArrayOf(pname, pprintprocessorname, level.toLong(), pdatatypes, cbbuf.toLong(), pcbneeded, pcreturned)).toInt()
}

public fun EnumPrintProcessorsA(pname: PCSTR, penvironment: PCSTR, level: UInt, pprintprocessorinfo: Long, cbbuf: UInt, pcbneeded: Long, pcreturned: Long): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "EnumPrintProcessorsA", longArrayOf(pname, penvironment, level.toLong(), pprintprocessorinfo, cbbuf.toLong(), pcbneeded, pcreturned)).toInt()
}

public fun EnumPrintProcessorsW(pname: PCWSTR, penvironment: PCWSTR, level: UInt, pprintprocessorinfo: Long, cbbuf: UInt, pcbneeded: Long, pcreturned: Long): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "EnumPrintProcessorsW", longArrayOf(pname, penvironment, level.toLong(), pprintprocessorinfo, cbbuf.toLong(), pcbneeded, pcreturned)).toInt()
}

public fun EnumPrinterDataA(hprinter: PRINTER_HANDLE, dwindex: UInt, pvaluename: PSTR, cbvaluename: UInt, pcbvaluename: Long, ptype: Long, pdata: Long, cbdata: UInt, pcbdata: Long): UInt {
    return Win32DynamicFfi.invoke("winspool.drv", "EnumPrinterDataA", longArrayOf(Win32DynamicFfi.objectSlot(hprinter), dwindex.toLong(), pvaluename, cbvaluename.toLong(), pcbvaluename, ptype, pdata, cbdata.toLong(), pcbdata)).toUInt()
}

public fun EnumPrinterDataExA(hprinter: PRINTER_HANDLE, pkeyname: PCSTR, penumvalues: Long, cbenumvalues: UInt, pcbenumvalues: Long, pnenumvalues: Long): UInt {
    return Win32DynamicFfi.invoke("winspool.drv", "EnumPrinterDataExA", longArrayOf(Win32DynamicFfi.objectSlot(hprinter), pkeyname, penumvalues, cbenumvalues.toLong(), pcbenumvalues, pnenumvalues)).toUInt()
}

public fun EnumPrinterDataExW(hprinter: PRINTER_HANDLE, pkeyname: PCWSTR, penumvalues: Long, cbenumvalues: UInt, pcbenumvalues: Long, pnenumvalues: Long): UInt {
    return Win32DynamicFfi.invoke("winspool.drv", "EnumPrinterDataExW", longArrayOf(Win32DynamicFfi.objectSlot(hprinter), pkeyname, penumvalues, cbenumvalues.toLong(), pcbenumvalues, pnenumvalues)).toUInt()
}

public fun EnumPrinterDataW(hprinter: PRINTER_HANDLE, dwindex: UInt, pvaluename: PWSTR, cbvaluename: UInt, pcbvaluename: Long, ptype: Long, pdata: Long, cbdata: UInt, pcbdata: Long): UInt {
    return Win32DynamicFfi.invoke("winspool.drv", "EnumPrinterDataW", longArrayOf(Win32DynamicFfi.objectSlot(hprinter), dwindex.toLong(), pvaluename, cbvaluename.toLong(), pcbvaluename, ptype, pdata, cbdata.toLong(), pcbdata)).toUInt()
}

public fun EnumPrinterDriversA(pname: PCSTR, penvironment: PCSTR, level: UInt, pdriverinfo: Long, cbbuf: UInt, pcbneeded: Long, pcreturned: Long): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "EnumPrinterDriversA", longArrayOf(pname, penvironment, level.toLong(), pdriverinfo, cbbuf.toLong(), pcbneeded, pcreturned)).toInt()
}

public fun EnumPrinterDriversW(pname: PCWSTR, penvironment: PCWSTR, level: UInt, pdriverinfo: Long, cbbuf: UInt, pcbneeded: Long, pcreturned: Long): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "EnumPrinterDriversW", longArrayOf(pname, penvironment, level.toLong(), pdriverinfo, cbbuf.toLong(), pcbneeded, pcreturned)).toInt()
}

public fun EnumPrinterKeyA(hprinter: PRINTER_HANDLE, pkeyname: PCSTR, psubkey: PSTR, cbsubkey: UInt, pcbsubkey: Long): UInt {
    return Win32DynamicFfi.invoke("winspool.drv", "EnumPrinterKeyA", longArrayOf(Win32DynamicFfi.objectSlot(hprinter), pkeyname, psubkey, cbsubkey.toLong(), pcbsubkey)).toUInt()
}

public fun EnumPrinterKeyW(hprinter: PRINTER_HANDLE, pkeyname: PCWSTR, psubkey: PWSTR, cbsubkey: UInt, pcbsubkey: Long): UInt {
    return Win32DynamicFfi.invoke("winspool.drv", "EnumPrinterKeyW", longArrayOf(Win32DynamicFfi.objectSlot(hprinter), pkeyname, psubkey, cbsubkey.toLong(), pcbsubkey)).toUInt()
}

public fun EnumPrintersA(flags: UInt, name: PCSTR, level: UInt, pprinterenum: Long, cbbuf: UInt, pcbneeded: Long, pcreturned: Long): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "EnumPrintersA", longArrayOf(flags.toLong(), name, level.toLong(), pprinterenum, cbbuf.toLong(), pcbneeded, pcreturned)).toInt()
}

public fun EnumPrintersW(flags: UInt, name: PCWSTR, level: UInt, pprinterenum: Long, cbbuf: UInt, pcbneeded: Long, pcreturned: Long): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "EnumPrintersW", longArrayOf(flags.toLong(), name, level.toLong(), pprinterenum, cbbuf.toLong(), pcbneeded, pcreturned)).toInt()
}

public fun ExtDeviceMode(hwnd: Foundation.HWND, hinst: Foundation.HANDLE, pdevmodeoutput: Long, pdevicename: PCSTR, pport: PCSTR, pdevmodeinput: Long, pprofile: PCSTR, fmode: UInt): Int {
    return Win32DynamicFfi.invoke("winspool.drv", "ExtDeviceMode", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), Win32DynamicFfi.objectSlot(hinst), pdevmodeoutput, pdevicename, pport, pdevmodeinput, pprofile, fmode.toLong())).toInt()
}

public fun FindClosePrinterChangeNotification(hchange: Foundation.HANDLE): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "FindClosePrinterChangeNotification", longArrayOf(Win32DynamicFfi.objectSlot(hchange))).toInt()
}

public fun FindFirstPrinterChangeNotification(hprinter: PRINTER_HANDLE, fdwfilter: UInt, fdwoptions: UInt, pprinternotifyoptions: Long): Foundation.HANDLE {
    Win32DynamicFfi.invoke("winspool.drv", "FindFirstPrinterChangeNotification", longArrayOf(Win32DynamicFfi.objectSlot(hprinter), fdwfilter.toLong(), fdwoptions.toLong(), pprinternotifyoptions))
    return Foundation.HANDLE()
}

public fun FindNextPrinterChangeNotification(hchange: Foundation.HANDLE, pdwchange: Long, pvreserved: Long, ppprinternotifyinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "FindNextPrinterChangeNotification", longArrayOf(Win32DynamicFfi.objectSlot(hchange), pdwchange, pvreserved, ppprinternotifyinfo)).toInt()
}

public fun FlushPrinter(hprinter: PRINTER_HANDLE, pbuf: Long, cbbuf: UInt, pcwritten: Long, csleep: UInt): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "FlushPrinter", longArrayOf(Win32DynamicFfi.objectSlot(hprinter), pbuf, cbbuf.toLong(), pcwritten, csleep.toLong())).toInt()
}

public fun FreePrintNamedPropertyArray(cproperties: UInt, ppproperties: Long) {
    Win32DynamicFfi.invoke("winspool.drv", "FreePrintNamedPropertyArray", longArrayOf(cproperties.toLong(), ppproperties))
}

public fun FreePrintPropertyValue(pvalue: Long) {
    Win32DynamicFfi.invoke("winspool.drv", "FreePrintPropertyValue", longArrayOf(pvalue))
}

public fun FreePrinterNotifyInfo(pprinternotifyinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "FreePrinterNotifyInfo", longArrayOf(pprinternotifyinfo)).toInt()
}

public fun GdiDeleteSpoolFileHandle(spoolfilehandle: Foundation.HANDLE): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "GdiDeleteSpoolFileHandle", longArrayOf(Win32DynamicFfi.objectSlot(spoolfilehandle))).toInt()
}

public fun GdiEndDocEMF(spoolfilehandle: Foundation.HANDLE): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "GdiEndDocEMF", longArrayOf(Win32DynamicFfi.objectSlot(spoolfilehandle))).toInt()
}

public fun GdiEndPageEMF(spoolfilehandle: Foundation.HANDLE, dwoptimization: UInt): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "GdiEndPageEMF", longArrayOf(Win32DynamicFfi.objectSlot(spoolfilehandle), dwoptimization.toLong())).toInt()
}

public fun GdiGetDC(spoolfilehandle: Foundation.HANDLE): Gdi.HDC {
    Win32DynamicFfi.invoke("gdi32.dll", "GdiGetDC", longArrayOf(Win32DynamicFfi.objectSlot(spoolfilehandle)))
    return Gdi.HDC()
}

public fun GdiGetDevmodeForPage(spoolfilehandle: Foundation.HANDLE, dwpagenumber: UInt, pcurrdm: Long, plastdm: Long): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "GdiGetDevmodeForPage", longArrayOf(Win32DynamicFfi.objectSlot(spoolfilehandle), dwpagenumber.toLong(), pcurrdm, plastdm)).toInt()
}

public fun GdiGetPageCount(spoolfilehandle: Foundation.HANDLE): UInt {
    return Win32DynamicFfi.invoke("gdi32.dll", "GdiGetPageCount", longArrayOf(Win32DynamicFfi.objectSlot(spoolfilehandle))).toUInt()
}

public fun GdiGetPageHandle(spoolfilehandle: Foundation.HANDLE, page: UInt, pdwpagetype: Long): Foundation.HANDLE {
    Win32DynamicFfi.invoke("gdi32.dll", "GdiGetPageHandle", longArrayOf(Win32DynamicFfi.objectSlot(spoolfilehandle), page.toLong(), pdwpagetype))
    return Foundation.HANDLE()
}

public fun GdiGetSpoolFileHandle(pwszprintername: PCWSTR, pdevmode: Long, pwszdocname: PCWSTR): Foundation.HANDLE {
    Win32DynamicFfi.invoke("gdi32.dll", "GdiGetSpoolFileHandle", longArrayOf(pwszprintername, pdevmode, pwszdocname))
    return Foundation.HANDLE()
}

public fun GdiPlayPageEMF(spoolfilehandle: Foundation.HANDLE, hemf: Foundation.HANDLE, prectdocument: Long, prectborder: Long, prectclip: Long): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "GdiPlayPageEMF", longArrayOf(Win32DynamicFfi.objectSlot(spoolfilehandle), Win32DynamicFfi.objectSlot(hemf), prectdocument, prectborder, prectclip)).toInt()
}

public fun GdiResetDCEMF(spoolfilehandle: Foundation.HANDLE, pcurrdm: Long): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "GdiResetDCEMF", longArrayOf(Win32DynamicFfi.objectSlot(spoolfilehandle), pcurrdm)).toInt()
}

public fun GdiStartDocEMF(spoolfilehandle: Foundation.HANDLE, pdocinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "GdiStartDocEMF", longArrayOf(Win32DynamicFfi.objectSlot(spoolfilehandle), pdocinfo)).toInt()
}

public fun GdiStartPageEMF(spoolfilehandle: Foundation.HANDLE): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "GdiStartPageEMF", longArrayOf(Win32DynamicFfi.objectSlot(spoolfilehandle))).toInt()
}

public fun GenerateCopyFilePaths(pszprintername: PCWSTR, pszdirectory: PCWSTR, psplclientinfo: Long, dwlevel: UInt, pszsourcedir: PWSTR, pcchsourcedirsize: Long, psztargetdir: PWSTR, pcchtargetdirsize: Long, dwflags: UInt): UInt {
    return Win32DynamicFfi.invoke("mscms.dll", "GenerateCopyFilePaths", longArrayOf(pszprintername, pszdirectory, psplclientinfo, dwlevel.toLong(), pszsourcedir, pcchsourcedirsize, psztargetdir, pcchtargetdirsize, dwflags.toLong())).toUInt()
}

public fun GetCPSUIUserData(hdlg: Foundation.HWND): ULong {
    return Win32DynamicFfi.invoke("compstui.dll", "GetCPSUIUserData", longArrayOf(Win32DynamicFfi.objectSlot(hdlg))).toULong()
}

public fun GetCorePrinterDriversA(pszserver: PCSTR, pszenvironment: PCSTR, pszzcoredriverdependencies: PCSTR, ccoreprinterdrivers: UInt, pcoreprinterdrivers: Long): HRESULT {
    return Win32DynamicFfi.invoke("winspool.drv", "GetCorePrinterDriversA", longArrayOf(pszserver, pszenvironment, pszzcoredriverdependencies, ccoreprinterdrivers.toLong(), pcoreprinterdrivers)).toInt()
}

public fun GetCorePrinterDriversW(pszserver: PCWSTR, pszenvironment: PCWSTR, pszzcoredriverdependencies: PCWSTR, ccoreprinterdrivers: UInt, pcoreprinterdrivers: Long): HRESULT {
    return Win32DynamicFfi.invoke("winspool.drv", "GetCorePrinterDriversW", longArrayOf(pszserver, pszenvironment, pszzcoredriverdependencies, ccoreprinterdrivers.toLong(), pcoreprinterdrivers)).toInt()
}

public fun GetDefaultPrinterA(pszbuffer: PSTR, pcchbuffer: Long): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "GetDefaultPrinterA", longArrayOf(pszbuffer, pcchbuffer)).toInt()
}

public fun GetDefaultPrinterW(pszbuffer: PWSTR, pcchbuffer: Long): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "GetDefaultPrinterW", longArrayOf(pszbuffer, pcchbuffer)).toInt()
}

public fun GetFormA(hprinter: PRINTER_HANDLE, pformname: PCSTR, level: UInt, pform: Long, cbbuf: UInt, pcbneeded: Long): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "GetFormA", longArrayOf(Win32DynamicFfi.objectSlot(hprinter), pformname, level.toLong(), pform, cbbuf.toLong(), pcbneeded)).toInt()
}

public fun GetFormW(hprinter: PRINTER_HANDLE, pformname: PCWSTR, level: UInt, pform: Long, cbbuf: UInt, pcbneeded: Long): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "GetFormW", longArrayOf(Win32DynamicFfi.objectSlot(hprinter), pformname, level.toLong(), pform, cbbuf.toLong(), pcbneeded)).toInt()
}

public fun GetJobA(hprinter: PRINTER_HANDLE, jobid: UInt, level: UInt, pjob: Long, cbbuf: UInt, pcbneeded: Long): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "GetJobA", longArrayOf(Win32DynamicFfi.objectSlot(hprinter), jobid.toLong(), level.toLong(), pjob, cbbuf.toLong(), pcbneeded)).toInt()
}

public fun GetJobAttributes(pprintername: PCWSTR, pdevmode: Long, pattributeinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("spoolss.dll", "GetJobAttributes", longArrayOf(pprintername, pdevmode, pattributeinfo)).toInt()
}

public fun GetJobAttributesEx(pprintername: PCWSTR, pdevmode: Long, dwlevel: UInt, pattributeinfo: Long, nsize: UInt, dwflags: UInt): BOOL {
    return Win32DynamicFfi.invoke("spoolss.dll", "GetJobAttributesEx", longArrayOf(pprintername, pdevmode, dwlevel.toLong(), pattributeinfo, nsize.toLong(), dwflags.toLong())).toInt()
}

public fun GetJobNamedPropertyValue(hprinter: PRINTER_HANDLE, jobid: UInt, pszname: PCWSTR, pvalue: Long): UInt {
    return Win32DynamicFfi.invoke("winspool.drv", "GetJobNamedPropertyValue", longArrayOf(Win32DynamicFfi.objectSlot(hprinter), jobid.toLong(), pszname, pvalue)).toUInt()
}

public fun GetJobW(hprinter: PRINTER_HANDLE, jobid: UInt, level: UInt, pjob: Long, cbbuf: UInt, pcbneeded: Long): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "GetJobW", longArrayOf(Win32DynamicFfi.objectSlot(hprinter), jobid.toLong(), level.toLong(), pjob, cbbuf.toLong(), pcbneeded)).toInt()
}

public fun GetPrintExecutionData(pdata: Long): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "GetPrintExecutionData", longArrayOf(pdata)).toInt()
}

public fun GetPrintOutputInfo(hwnd: Foundation.HWND, pszprinter: PCWSTR, phfile: Long, ppszoutputfile: Long): HRESULT {
    return Win32DynamicFfi.invoke("winspool.drv", "GetPrintOutputInfo", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), pszprinter, phfile, ppszoutputfile)).toInt()
}

public fun GetPrintProcessorDirectoryA(pname: PCSTR, penvironment: PCSTR, level: UInt, pprintprocessorinfo: Long, cbbuf: UInt, pcbneeded: Long): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "GetPrintProcessorDirectoryA", longArrayOf(pname, penvironment, level.toLong(), pprintprocessorinfo, cbbuf.toLong(), pcbneeded)).toInt()
}

public fun GetPrintProcessorDirectoryW(pname: PCWSTR, penvironment: PCWSTR, level: UInt, pprintprocessorinfo: Long, cbbuf: UInt, pcbneeded: Long): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "GetPrintProcessorDirectoryW", longArrayOf(pname, penvironment, level.toLong(), pprintprocessorinfo, cbbuf.toLong(), pcbneeded)).toInt()
}

public fun GetPrinterA(hprinter: PRINTER_HANDLE, level: UInt, pprinter: Long, cbbuf: UInt, pcbneeded: Long): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "GetPrinterA", longArrayOf(Win32DynamicFfi.objectSlot(hprinter), level.toLong(), pprinter, cbbuf.toLong(), pcbneeded)).toInt()
}

public fun GetPrinterDataA(hprinter: PRINTER_HANDLE, pvaluename: PCSTR, ptype: Long, pdata: Long, nsize: UInt, pcbneeded: Long): UInt {
    return Win32DynamicFfi.invoke("winspool.drv", "GetPrinterDataA", longArrayOf(Win32DynamicFfi.objectSlot(hprinter), pvaluename, ptype, pdata, nsize.toLong(), pcbneeded)).toUInt()
}

public fun GetPrinterDataExA(hprinter: PRINTER_HANDLE, pkeyname: PCSTR, pvaluename: PCSTR, ptype: Long, pdata: Long, nsize: UInt, pcbneeded: Long): UInt {
    return Win32DynamicFfi.invoke("winspool.drv", "GetPrinterDataExA", longArrayOf(Win32DynamicFfi.objectSlot(hprinter), pkeyname, pvaluename, ptype, pdata, nsize.toLong(), pcbneeded)).toUInt()
}

public fun GetPrinterDataExW(hprinter: PRINTER_HANDLE, pkeyname: PCWSTR, pvaluename: PCWSTR, ptype: Long, pdata: Long, nsize: UInt, pcbneeded: Long): UInt {
    return Win32DynamicFfi.invoke("winspool.drv", "GetPrinterDataExW", longArrayOf(Win32DynamicFfi.objectSlot(hprinter), pkeyname, pvaluename, ptype, pdata, nsize.toLong(), pcbneeded)).toUInt()
}

public fun GetPrinterDataW(hprinter: PRINTER_HANDLE, pvaluename: PCWSTR, ptype: Long, pdata: Long, nsize: UInt, pcbneeded: Long): UInt {
    return Win32DynamicFfi.invoke("winspool.drv", "GetPrinterDataW", longArrayOf(Win32DynamicFfi.objectSlot(hprinter), pvaluename, ptype, pdata, nsize.toLong(), pcbneeded)).toUInt()
}

public fun GetPrinterDriver2A(hwnd: Foundation.HWND, hprinter: PRINTER_HANDLE, penvironment: PCSTR, level: UInt, pdriverinfo: Long, cbbuf: UInt, pcbneeded: Long): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "GetPrinterDriver2A", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), Win32DynamicFfi.objectSlot(hprinter), penvironment, level.toLong(), pdriverinfo, cbbuf.toLong(), pcbneeded)).toInt()
}

public fun GetPrinterDriver2W(hwnd: Foundation.HWND, hprinter: PRINTER_HANDLE, penvironment: PCWSTR, level: UInt, pdriverinfo: Long, cbbuf: UInt, pcbneeded: Long): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "GetPrinterDriver2W", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), Win32DynamicFfi.objectSlot(hprinter), penvironment, level.toLong(), pdriverinfo, cbbuf.toLong(), pcbneeded)).toInt()
}

public fun GetPrinterDriverA(hprinter: PRINTER_HANDLE, penvironment: PCSTR, level: UInt, pdriverinfo: Long, cbbuf: UInt, pcbneeded: Long): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "GetPrinterDriverA", longArrayOf(Win32DynamicFfi.objectSlot(hprinter), penvironment, level.toLong(), pdriverinfo, cbbuf.toLong(), pcbneeded)).toInt()
}

public fun GetPrinterDriverDirectoryA(pname: PCSTR, penvironment: PCSTR, level: UInt, pdriverdirectory: Long, cbbuf: UInt, pcbneeded: Long): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "GetPrinterDriverDirectoryA", longArrayOf(pname, penvironment, level.toLong(), pdriverdirectory, cbbuf.toLong(), pcbneeded)).toInt()
}

public fun GetPrinterDriverDirectoryW(pname: PCWSTR, penvironment: PCWSTR, level: UInt, pdriverdirectory: Long, cbbuf: UInt, pcbneeded: Long): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "GetPrinterDriverDirectoryW", longArrayOf(pname, penvironment, level.toLong(), pdriverdirectory, cbbuf.toLong(), pcbneeded)).toInt()
}

public fun GetPrinterDriverPackagePathA(pszserver: PCSTR, pszenvironment: PCSTR, pszlanguage: PCSTR, pszpackageid: PCSTR, pszdriverpackagecab: PSTR, cchdriverpackagecab: UInt, pcchrequiredsize: Long): HRESULT {
    return Win32DynamicFfi.invoke("winspool.drv", "GetPrinterDriverPackagePathA", longArrayOf(pszserver, pszenvironment, pszlanguage, pszpackageid, pszdriverpackagecab, cchdriverpackagecab.toLong(), pcchrequiredsize)).toInt()
}

public fun GetPrinterDriverPackagePathW(pszserver: PCWSTR, pszenvironment: PCWSTR, pszlanguage: PCWSTR, pszpackageid: PCWSTR, pszdriverpackagecab: PWSTR, cchdriverpackagecab: UInt, pcchrequiredsize: Long): HRESULT {
    return Win32DynamicFfi.invoke("winspool.drv", "GetPrinterDriverPackagePathW", longArrayOf(pszserver, pszenvironment, pszlanguage, pszpackageid, pszdriverpackagecab, cchdriverpackagecab.toLong(), pcchrequiredsize)).toInt()
}

public fun GetPrinterDriverW(hprinter: PRINTER_HANDLE, penvironment: PCWSTR, level: UInt, pdriverinfo: Long, cbbuf: UInt, pcbneeded: Long): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "GetPrinterDriverW", longArrayOf(Win32DynamicFfi.objectSlot(hprinter), penvironment, level.toLong(), pdriverinfo, cbbuf.toLong(), pcbneeded)).toInt()
}

public fun GetPrinterW(hprinter: PRINTER_HANDLE, level: UInt, pprinter: Long, cbbuf: UInt, pcbneeded: Long): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "GetPrinterW", longArrayOf(Win32DynamicFfi.objectSlot(hprinter), level.toLong(), pprinter, cbbuf.toLong(), pcbneeded)).toInt()
}

public fun GetSpoolFileHandle(hprinter: PRINTER_HANDLE): Foundation.HANDLE {
    Win32DynamicFfi.invoke("winspool.drv", "GetSpoolFileHandle", longArrayOf(Win32DynamicFfi.objectSlot(hprinter)))
    return Foundation.HANDLE()
}

public fun ImpersonatePrinterClient(htoken: Foundation.HANDLE): BOOL {
    return Win32DynamicFfi.invoke("spoolss.dll", "ImpersonatePrinterClient", longArrayOf(Win32DynamicFfi.objectSlot(htoken))).toInt()
}

public fun InstallPrinterDriverFromPackageA(pszserver: PCSTR, pszinfpath: PCSTR, pszdrivername: PCSTR, pszenvironment: PCSTR, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("winspool.drv", "InstallPrinterDriverFromPackageA", longArrayOf(pszserver, pszinfpath, pszdrivername, pszenvironment, dwflags.toLong())).toInt()
}

public fun InstallPrinterDriverFromPackageW(pszserver: PCWSTR, pszinfpath: PCWSTR, pszdrivername: PCWSTR, pszenvironment: PCWSTR, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("winspool.drv", "InstallPrinterDriverFromPackageW", longArrayOf(pszserver, pszinfpath, pszdrivername, pszenvironment, dwflags.toLong())).toInt()
}

public fun IsValidDevmodeA(pdevmode: Long, devmodesize: ULong): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "IsValidDevmodeA", longArrayOf(pdevmode, devmodesize.toLong())).toInt()
}

public fun IsValidDevmodeW(pdevmode: Long, devmodesize: ULong): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "IsValidDevmodeW", longArrayOf(pdevmode, devmodesize.toLong())).toInt()
}

public fun OpenPrinter2A(pprintername: PCSTR, phprinter: Long, pdefault: Long, poptions: Long): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "OpenPrinter2A", longArrayOf(pprintername, phprinter, pdefault, poptions)).toInt()
}

public fun OpenPrinter2W(pprintername: PCWSTR, phprinter: Long, pdefault: Long, poptions: Long): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "OpenPrinter2W", longArrayOf(pprintername, phprinter, pdefault, poptions)).toInt()
}

public fun OpenPrinterA(pprintername: PCSTR, phprinter: Long, pdefault: Long): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "OpenPrinterA", longArrayOf(pprintername, phprinter, pdefault)).toInt()
}

public fun OpenPrinterW(pprintername: PCWSTR, phprinter: Long, pdefault: Long): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "OpenPrinterW", longArrayOf(pprintername, phprinter, pdefault)).toInt()
}

public fun PartialReplyPrinterChangeNotification(hprinter: PRINTER_HANDLE, pdatasrc: Long): BOOL {
    return Win32DynamicFfi.invoke("spoolss.dll", "PartialReplyPrinterChangeNotification", longArrayOf(Win32DynamicFfi.objectSlot(hprinter), pdatasrc)).toInt()
}

public fun PlayGdiScriptOnPrinterIC(hprinteric: Foundation.HANDLE, pin: Long, cin: UInt, pout: Long, cout: UInt, ul: UInt): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "PlayGdiScriptOnPrinterIC", longArrayOf(Win32DynamicFfi.objectSlot(hprinteric), pin, cin.toLong(), pout, cout.toLong(), ul.toLong())).toInt()
}

public fun PrinterMessageBoxA(hprinter: PRINTER_HANDLE, error: UInt, hwnd: Foundation.HWND, ptext: PCSTR, pcaption: PCSTR, dwtype: UInt): UInt {
    return Win32DynamicFfi.invoke("winspool.drv", "PrinterMessageBoxA", longArrayOf(Win32DynamicFfi.objectSlot(hprinter), error.toLong(), Win32DynamicFfi.objectSlot(hwnd), ptext, pcaption, dwtype.toLong())).toUInt()
}

public fun PrinterMessageBoxW(hprinter: PRINTER_HANDLE, error: UInt, hwnd: Foundation.HWND, ptext: PCWSTR, pcaption: PCWSTR, dwtype: UInt): UInt {
    return Win32DynamicFfi.invoke("winspool.drv", "PrinterMessageBoxW", longArrayOf(Win32DynamicFfi.objectSlot(hprinter), error.toLong(), Win32DynamicFfi.objectSlot(hwnd), ptext, pcaption, dwtype.toLong())).toUInt()
}

public fun PrinterProperties(hwnd: Foundation.HWND, hprinter: PRINTER_HANDLE): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "PrinterProperties", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), Win32DynamicFfi.objectSlot(hprinter))).toInt()
}

public fun ProvidorFindClosePrinterChangeNotification(hprinter: PRINTER_HANDLE): BOOL {
    return Win32DynamicFfi.invoke("spoolss.dll", "ProvidorFindClosePrinterChangeNotification", longArrayOf(Win32DynamicFfi.objectSlot(hprinter))).toInt()
}

public fun ProvidorFindFirstPrinterChangeNotification(hprinter: PRINTER_HANDLE, fdwflags: UInt, fdwoptions: UInt, hnotify: Foundation.HANDLE, pprinternotifyoptions: Long, pvreserved1: Long): BOOL {
    return Win32DynamicFfi.invoke("spoolss.dll", "ProvidorFindFirstPrinterChangeNotification", longArrayOf(Win32DynamicFfi.objectSlot(hprinter), fdwflags.toLong(), fdwoptions.toLong(), Win32DynamicFfi.objectSlot(hnotify), pprinternotifyoptions, pvreserved1)).toInt()
}

public fun ReadPrinter(hprinter: PRINTER_HANDLE, pbuf: Long, cbbuf: UInt, pnobytesread: Long): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "ReadPrinter", longArrayOf(Win32DynamicFfi.objectSlot(hprinter), pbuf, cbbuf.toLong(), pnobytesread)).toInt()
}

public fun RegisterForPrintAsyncNotifications(pszname: PCWSTR, pnotificationtype: Long, euserfilter: PrintAsyncNotifyUserFilter, econversationstyle: PrintAsyncNotifyConversationStyle, pcallback: Long, phnotify: Long): HRESULT {
    return Win32DynamicFfi.invoke("winspool.drv", "RegisterForPrintAsyncNotifications", longArrayOf(pszname, pnotificationtype, euserfilter.toLong(), econversationstyle.toLong(), pcallback, phnotify)).toInt()
}

public fun RemovePrintDeviceObject(hdeviceobject: Foundation.HANDLE): HRESULT {
    return Win32DynamicFfi.invoke("spoolss.dll", "RemovePrintDeviceObject", longArrayOf(Win32DynamicFfi.objectSlot(hdeviceobject))).toInt()
}

public fun ReplyPrinterChangeNotification(hprinter: PRINTER_HANDLE, fdwchangeflags: UInt, pdwresult: Long, pprinternotifyinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("spoolss.dll", "ReplyPrinterChangeNotification", longArrayOf(Win32DynamicFfi.objectSlot(hprinter), fdwchangeflags.toLong(), pdwresult, pprinternotifyinfo)).toInt()
}

public fun ReplyPrinterChangeNotificationEx(hnotify: Foundation.HANDLE, dwcolor: UInt, fdwflags: UInt, pdwresult: Long, pprinternotifyinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("spoolss.dll", "ReplyPrinterChangeNotificationEx", longArrayOf(Win32DynamicFfi.objectSlot(hnotify), dwcolor.toLong(), fdwflags.toLong(), pdwresult, pprinternotifyinfo)).toInt()
}

public fun ReportJobProcessingProgress(printerhandle: Foundation.HANDLE, jobid: UInt, joboperation: EPrintXPSJobOperation, jobprogress: EPrintXPSJobProgress): HRESULT {
    return Win32DynamicFfi.invoke("winspool.drv", "ReportJobProcessingProgress", longArrayOf(Win32DynamicFfi.objectSlot(printerhandle), jobid.toLong(), joboperation.toLong(), jobprogress.toLong())).toInt()
}

public fun ResetPrinterA(hprinter: PRINTER_HANDLE, pdefault: Long): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "ResetPrinterA", longArrayOf(Win32DynamicFfi.objectSlot(hprinter), pdefault)).toInt()
}

public fun ResetPrinterW(hprinter: PRINTER_HANDLE, pdefault: Long): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "ResetPrinterW", longArrayOf(Win32DynamicFfi.objectSlot(hprinter), pdefault)).toInt()
}

public fun RevertToPrinterSelf(): Foundation.HANDLE {
    Win32DynamicFfi.invoke("spoolss.dll", "RevertToPrinterSelf", longArrayOf())
    return Foundation.HANDLE()
}

public fun RouterAllocBidiMem(numbytes: ULong): Long {
    return Win32DynamicFfi.invoke("spoolss.dll", "RouterAllocBidiMem", longArrayOf(numbytes.toLong()))
}

public fun RouterAllocBidiResponseContainer(count: UInt): Long {
    return Win32DynamicFfi.invoke("spoolss.dll", "RouterAllocBidiResponseContainer", longArrayOf(count.toLong()))
}

public fun RouterAllocPrinterNotifyInfo(cprinternotifyinfodata: UInt): Long {
    return Win32DynamicFfi.invoke("spoolss.dll", "RouterAllocPrinterNotifyInfo", longArrayOf(cprinternotifyinfodata.toLong()))
}

public fun RouterFreeBidiMem(pmempointer: Long) {
    Win32DynamicFfi.invoke("spoolss.dll", "RouterFreeBidiMem", longArrayOf(pmempointer))
}

public fun RouterFreeBidiResponseContainer(pdata: Long): UInt {
    return Win32DynamicFfi.invoke("winspool.drv", "RouterFreeBidiResponseContainer", longArrayOf(pdata)).toUInt()
}

public fun RouterFreePrinterNotifyInfo(pinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("spoolss.dll", "RouterFreePrinterNotifyInfo", longArrayOf(pinfo)).toInt()
}

public fun ScheduleJob(hprinter: PRINTER_HANDLE, jobid: UInt): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "ScheduleJob", longArrayOf(Win32DynamicFfi.objectSlot(hprinter), jobid.toLong())).toInt()
}

public fun SetCPSUIUserData(hdlg: Foundation.HWND, cpsuiuserdata: ULong): BOOL {
    return Win32DynamicFfi.invoke("compstui.dll", "SetCPSUIUserData", longArrayOf(Win32DynamicFfi.objectSlot(hdlg), cpsuiuserdata.toLong())).toInt()
}

public fun SetDefaultPrinterA(pszprinter: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "SetDefaultPrinterA", longArrayOf(pszprinter)).toInt()
}

public fun SetDefaultPrinterW(pszprinter: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "SetDefaultPrinterW", longArrayOf(pszprinter)).toInt()
}

public fun SetFormA(hprinter: PRINTER_HANDLE, pformname: PCSTR, level: UInt, pform: Long): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "SetFormA", longArrayOf(Win32DynamicFfi.objectSlot(hprinter), pformname, level.toLong(), pform)).toInt()
}

public fun SetFormW(hprinter: PRINTER_HANDLE, pformname: PCWSTR, level: UInt, pform: Long): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "SetFormW", longArrayOf(Win32DynamicFfi.objectSlot(hprinter), pformname, level.toLong(), pform)).toInt()
}

public fun SetJobA(hprinter: PRINTER_HANDLE, jobid: UInt, level: UInt, pjob: Long, command: UInt): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "SetJobA", longArrayOf(Win32DynamicFfi.objectSlot(hprinter), jobid.toLong(), level.toLong(), pjob, command.toLong())).toInt()
}

public fun SetJobNamedProperty(hprinter: PRINTER_HANDLE, jobid: UInt, pproperty: Long): UInt {
    return Win32DynamicFfi.invoke("winspool.drv", "SetJobNamedProperty", longArrayOf(Win32DynamicFfi.objectSlot(hprinter), jobid.toLong(), pproperty)).toUInt()
}

public fun SetJobW(hprinter: PRINTER_HANDLE, jobid: UInt, level: UInt, pjob: Long, command: UInt): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "SetJobW", longArrayOf(Win32DynamicFfi.objectSlot(hprinter), jobid.toLong(), level.toLong(), pjob, command.toLong())).toInt()
}

public fun SetPortA(pname: PCSTR, pportname: PCSTR, dwlevel: UInt, pportinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "SetPortA", longArrayOf(pname, pportname, dwlevel.toLong(), pportinfo)).toInt()
}

public fun SetPortW(pname: PCWSTR, pportname: PCWSTR, dwlevel: UInt, pportinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "SetPortW", longArrayOf(pname, pportname, dwlevel.toLong(), pportinfo)).toInt()
}

public fun SetPrinterA(hprinter: PRINTER_HANDLE, level: UInt, pprinter: Long, command: UInt): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "SetPrinterA", longArrayOf(Win32DynamicFfi.objectSlot(hprinter), level.toLong(), pprinter, command.toLong())).toInt()
}

public fun SetPrinterDataA(hprinter: PRINTER_HANDLE, pvaluename: PCSTR, type: UInt, pdata: Long, cbdata: UInt): UInt {
    return Win32DynamicFfi.invoke("winspool.drv", "SetPrinterDataA", longArrayOf(Win32DynamicFfi.objectSlot(hprinter), pvaluename, type.toLong(), pdata, cbdata.toLong())).toUInt()
}

public fun SetPrinterDataExA(hprinter: PRINTER_HANDLE, pkeyname: PCSTR, pvaluename: PCSTR, type: UInt, pdata: Long, cbdata: UInt): UInt {
    return Win32DynamicFfi.invoke("winspool.drv", "SetPrinterDataExA", longArrayOf(Win32DynamicFfi.objectSlot(hprinter), pkeyname, pvaluename, type.toLong(), pdata, cbdata.toLong())).toUInt()
}

public fun SetPrinterDataExW(hprinter: PRINTER_HANDLE, pkeyname: PCWSTR, pvaluename: PCWSTR, type: UInt, pdata: Long, cbdata: UInt): UInt {
    return Win32DynamicFfi.invoke("winspool.drv", "SetPrinterDataExW", longArrayOf(Win32DynamicFfi.objectSlot(hprinter), pkeyname, pvaluename, type.toLong(), pdata, cbdata.toLong())).toUInt()
}

public fun SetPrinterDataW(hprinter: PRINTER_HANDLE, pvaluename: PCWSTR, type: UInt, pdata: Long, cbdata: UInt): UInt {
    return Win32DynamicFfi.invoke("winspool.drv", "SetPrinterDataW", longArrayOf(Win32DynamicFfi.objectSlot(hprinter), pvaluename, type.toLong(), pdata, cbdata.toLong())).toUInt()
}

public fun SetPrinterW(hprinter: PRINTER_HANDLE, level: UInt, pprinter: Long, command: UInt): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "SetPrinterW", longArrayOf(Win32DynamicFfi.objectSlot(hprinter), level.toLong(), pprinter, command.toLong())).toInt()
}

public fun SplIsSessionZero(hprinter: PRINTER_HANDLE, jobid: UInt, pissessionzero: Long): UInt {
    return Win32DynamicFfi.invoke("spoolss.dll", "SplIsSessionZero", longArrayOf(Win32DynamicFfi.objectSlot(hprinter), jobid.toLong(), pissessionzero)).toUInt()
}

public fun SplPromptUIInUsersSession(hprinter: PRINTER_HANDLE, jobid: UInt, puiparams: Long, presponse: Long): BOOL {
    return Win32DynamicFfi.invoke("spoolss.dll", "SplPromptUIInUsersSession", longArrayOf(Win32DynamicFfi.objectSlot(hprinter), jobid.toLong(), puiparams, presponse)).toInt()
}

public fun SpoolerCopyFileEvent(pszprintername: PCWSTR, pszkey: PCWSTR, dwcopyfileevent: UInt): BOOL {
    return Win32DynamicFfi.invoke("mscms.dll", "SpoolerCopyFileEvent", longArrayOf(pszprintername, pszkey, dwcopyfileevent.toLong())).toInt()
}

public fun SpoolerFindClosePrinterChangeNotification(hprinter: PRINTER_HANDLE): BOOL {
    return Win32DynamicFfi.invoke("spoolss.dll", "SpoolerFindClosePrinterChangeNotification", longArrayOf(Win32DynamicFfi.objectSlot(hprinter))).toInt()
}

public fun SpoolerFindFirstPrinterChangeNotification(hprinter: PRINTER_HANDLE, fdwfilterflags: UInt, fdwoptions: UInt, pprinternotifyoptions: Long, pvreserved: Long, pnotificationconfig: Long, phnotify: Long, phevent: Long): BOOL {
    return Win32DynamicFfi.invoke("spoolss.dll", "SpoolerFindFirstPrinterChangeNotification", longArrayOf(Win32DynamicFfi.objectSlot(hprinter), fdwfilterflags.toLong(), fdwoptions.toLong(), pprinternotifyoptions, pvreserved, pnotificationconfig, phnotify, phevent)).toInt()
}

public fun SpoolerFindNextPrinterChangeNotification(hprinter: PRINTER_HANDLE, pfdwchange: Long, pprinternotifyoptions: Long, ppprinternotifyinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("spoolss.dll", "SpoolerFindNextPrinterChangeNotification", longArrayOf(Win32DynamicFfi.objectSlot(hprinter), pfdwchange, pprinternotifyoptions, ppprinternotifyinfo)).toInt()
}

public fun SpoolerFreePrinterNotifyInfo(pinfo: Long) {
    Win32DynamicFfi.invoke("spoolss.dll", "SpoolerFreePrinterNotifyInfo", longArrayOf(pinfo))
}

public fun SpoolerRefreshPrinterChangeNotification(hprinter: PRINTER_HANDLE, dwcolor: UInt, poptions: Long, ppinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("spoolss.dll", "SpoolerRefreshPrinterChangeNotification", longArrayOf(Win32DynamicFfi.objectSlot(hprinter), dwcolor.toLong(), poptions, ppinfo)).toInt()
}

public fun StartDocPrinterA(hprinter: PRINTER_HANDLE, level: UInt, pdocinfo: Long): UInt {
    return Win32DynamicFfi.invoke("winspool.drv", "StartDocPrinterA", longArrayOf(Win32DynamicFfi.objectSlot(hprinter), level.toLong(), pdocinfo)).toUInt()
}

public fun StartDocPrinterW(hprinter: PRINTER_HANDLE, level: UInt, pdocinfo: Long): UInt {
    return Win32DynamicFfi.invoke("winspool.drv", "StartDocPrinterW", longArrayOf(Win32DynamicFfi.objectSlot(hprinter), level.toLong(), pdocinfo)).toUInt()
}

public fun StartPagePrinter(hprinter: PRINTER_HANDLE): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "StartPagePrinter", longArrayOf(Win32DynamicFfi.objectSlot(hprinter))).toInt()
}

public fun UnRegisterForPrintAsyncNotifications(param0: Foundation.HANDLE): HRESULT {
    return Win32DynamicFfi.invoke("winspool.drv", "UnRegisterForPrintAsyncNotifications", longArrayOf(Win32DynamicFfi.objectSlot(param0))).toInt()
}

public fun UpdatePrintDeviceObject(hprinter: PRINTER_HANDLE, hdeviceobject: Foundation.HANDLE): HRESULT {
    return Win32DynamicFfi.invoke("spoolss.dll", "UpdatePrintDeviceObject", longArrayOf(Win32DynamicFfi.objectSlot(hprinter), Win32DynamicFfi.objectSlot(hdeviceobject))).toInt()
}

public fun UploadPrinterDriverPackageA(pszserver: PCSTR, pszinfpath: PCSTR, pszenvironment: PCSTR, dwflags: UInt, hwnd: Foundation.HWND, pszdestinfpath: PSTR, pcchdestinfpath: Long): HRESULT {
    return Win32DynamicFfi.invoke("winspool.drv", "UploadPrinterDriverPackageA", longArrayOf(pszserver, pszinfpath, pszenvironment, dwflags.toLong(), Win32DynamicFfi.objectSlot(hwnd), pszdestinfpath, pcchdestinfpath)).toInt()
}

public fun UploadPrinterDriverPackageW(pszserver: PCWSTR, pszinfpath: PCWSTR, pszenvironment: PCWSTR, dwflags: UInt, hwnd: Foundation.HWND, pszdestinfpath: PWSTR, pcchdestinfpath: Long): HRESULT {
    return Win32DynamicFfi.invoke("winspool.drv", "UploadPrinterDriverPackageW", longArrayOf(pszserver, pszinfpath, pszenvironment, dwflags.toLong(), Win32DynamicFfi.objectSlot(hwnd), pszdestinfpath, pcchdestinfpath)).toInt()
}

public fun WaitForPrinterChange(hprinter: PRINTER_HANDLE, flags: UInt): UInt {
    return Win32DynamicFfi.invoke("winspool.drv", "WaitForPrinterChange", longArrayOf(Win32DynamicFfi.objectSlot(hprinter), flags.toLong())).toUInt()
}

public fun WritePrinter(hprinter: PRINTER_HANDLE, pbuf: Long, cbbuf: UInt, pcwritten: Long): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "WritePrinter", longArrayOf(Win32DynamicFfi.objectSlot(hprinter), pbuf, cbbuf.toLong(), pcwritten)).toInt()
}

public fun XcvDataW(hxcv: Foundation.HANDLE, pszdataname: PCWSTR, pinputdata: Long, cbinputdata: UInt, poutputdata: Long, cboutputdata: UInt, pcboutputneeded: Long, pdwstatus: Long): BOOL {
    return Win32DynamicFfi.invoke("winspool.drv", "XcvDataW", longArrayOf(Win32DynamicFfi.objectSlot(hxcv), pszdataname, pinputdata, cbinputdata.toLong(), poutputdata, cboutputdata.toLong(), pcboutputneeded, pdwstatus)).toInt()
}
