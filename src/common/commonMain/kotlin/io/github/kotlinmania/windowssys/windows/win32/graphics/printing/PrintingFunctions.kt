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

public expect fun AbortPrinter(hprinter: PRINTER_HANDLE): BOOL

public expect fun AddFormA(hprinter: PRINTER_HANDLE, level: UInt, pform: Long): BOOL

public expect fun AddFormW(hprinter: PRINTER_HANDLE, level: UInt, pform: Long): BOOL

public expect fun AddJobA(hprinter: PRINTER_HANDLE, level: UInt, pdata: Long, cbbuf: UInt, pcbneeded: Long): BOOL

public expect fun AddJobW(hprinter: PRINTER_HANDLE, level: UInt, pdata: Long, cbbuf: UInt, pcbneeded: Long): BOOL

public expect fun AddMonitorA(pname: PCSTR, level: UInt, pmonitors: Long): BOOL

public expect fun AddMonitorW(pname: PCWSTR, level: UInt, pmonitors: Long): BOOL

public expect fun AddPortA(pname: PCSTR, hwnd: HWND, pmonitorname: PCSTR): BOOL

public expect fun AddPortW(pname: PCWSTR, hwnd: HWND, pmonitorname: PCWSTR): BOOL

public expect fun AddPrintDeviceObject(hprinter: PRINTER_HANDLE, phdeviceobject: Long): HRESULT

public expect fun AddPrintProcessorA(pname: PCSTR, penvironment: PCSTR, ppathname: PCSTR, pprintprocessorname: PCSTR): BOOL

public expect fun AddPrintProcessorW(pname: PCWSTR, penvironment: PCWSTR, ppathname: PCWSTR, pprintprocessorname: PCWSTR): BOOL

public expect fun AddPrintProvidorA(pname: PCSTR, level: UInt, pprovidorinfo: Long): BOOL

public expect fun AddPrintProvidorW(pname: PCWSTR, level: UInt, pprovidorinfo: Long): BOOL

public expect fun AddPrinterA(pname: PCSTR, level: UInt, pprinter: Long): HANDLE

public expect fun AddPrinterConnection2A(hwnd: HWND, pszname: PCSTR, dwlevel: UInt, pconnectioninfo: Long): BOOL

public expect fun AddPrinterConnection2W(hwnd: HWND, pszname: PCWSTR, dwlevel: UInt, pconnectioninfo: Long): BOOL

public expect fun AddPrinterConnectionA(pname: PCSTR): BOOL

public expect fun AddPrinterConnectionW(pname: PCWSTR): BOOL

public expect fun AddPrinterDriverA(pname: PCSTR, level: UInt, pdriverinfo: Long): BOOL

public expect fun AddPrinterDriverExA(pname: PCSTR, level: UInt, lpbdriverinfo: Long, dwfilecopyflags: UInt): BOOL

public expect fun AddPrinterDriverExW(pname: PCWSTR, level: UInt, lpbdriverinfo: Long, dwfilecopyflags: UInt): BOOL

public expect fun AddPrinterDriverW(pname: PCWSTR, level: UInt, pdriverinfo: Long): BOOL

public expect fun AddPrinterW(pname: PCWSTR, level: UInt, pprinter: Long): HANDLE

public expect fun AdvancedDocumentPropertiesA(hwnd: HWND, hprinter: PRINTER_HANDLE, pdevicename: PCSTR, pdevmodeoutput: Long, pdevmodeinput: Long): Int

public expect fun AdvancedDocumentPropertiesW(hwnd: HWND, hprinter: PRINTER_HANDLE, pdevicename: PCWSTR, pdevmodeoutput: Long, pdevmodeinput: Long): Int

public expect fun AppendPrinterNotifyInfoData(pinfodest: Long, pdatasrc: Long, fdwflags: UInt): BOOL

public expect fun CallRouterFindFirstPrinterChangeNotification(hprinterrpc: HANDLE, fdwfilterflags: UInt, fdwoptions: UInt, hnotify: HANDLE, pprinternotifyoptions: Long): UInt

public expect fun ClosePrinter(hprinter: PRINTER_HANDLE): BOOL

public expect fun CloseSpoolFileHandle(hprinter: PRINTER_HANDLE, hspoolfile: HANDLE): BOOL

public expect fun CommitSpoolData(hprinter: PRINTER_HANDLE, hspoolfile: HANDLE, cbcommit: UInt): HANDLE

public expect fun CommonPropertySheetUIA(hwndowner: HWND, pfnpropsheetui: PFNPROPSHEETUI, lparam: LPARAM, presult: Long): Int

public expect fun CommonPropertySheetUIW(hwndowner: HWND, pfnpropsheetui: PFNPROPSHEETUI, lparam: LPARAM, presult: Long): Int

public expect fun ConfigurePortA(pname: PCSTR, hwnd: HWND, pportname: PCSTR): BOOL

public expect fun ConfigurePortW(pname: PCWSTR, hwnd: HWND, pportname: PCWSTR): BOOL

public expect fun ConnectToPrinterDlg(hwnd: HWND, flags: UInt): HANDLE

public expect fun CorePrinterDriverInstalledA(pszserver: PCSTR, pszenvironment: PCSTR, coredriverguid: GUID, ftdriverdate: FILETIME, dwldriverversion: ULong, pbdriverinstalled: Long): HRESULT

public expect fun CorePrinterDriverInstalledW(pszserver: PCWSTR, pszenvironment: PCWSTR, coredriverguid: GUID, ftdriverdate: FILETIME, dwldriverversion: ULong, pbdriverinstalled: Long): HRESULT

public expect fun CreatePrintAsyncNotifyChannel(pszname: PCWSTR, pnotificationtype: Long, euserfilter: PrintAsyncNotifyUserFilter, econversationstyle: PrintAsyncNotifyConversationStyle, pcallback: Long, ppiasynchnotification: Long): HRESULT

public expect fun CreatePrinterIC(hprinter: PRINTER_HANDLE, pdevmode: Long): HANDLE

public expect fun DeleteFormA(hprinter: PRINTER_HANDLE, pformname: PCSTR): BOOL

public expect fun DeleteFormW(hprinter: PRINTER_HANDLE, pformname: PCWSTR): BOOL

public expect fun DeleteJobNamedProperty(hprinter: PRINTER_HANDLE, jobid: UInt, pszname: PCWSTR): UInt

public expect fun DeleteMonitorA(pname: PCSTR, penvironment: PCSTR, pmonitorname: PCSTR): BOOL

public expect fun DeleteMonitorW(pname: PCWSTR, penvironment: PCWSTR, pmonitorname: PCWSTR): BOOL

public expect fun DeletePortA(pname: PCSTR, hwnd: HWND, pportname: PCSTR): BOOL

public expect fun DeletePortW(pname: PCWSTR, hwnd: HWND, pportname: PCWSTR): BOOL

public expect fun DeletePrintProcessorA(pname: PCSTR, penvironment: PCSTR, pprintprocessorname: PCSTR): BOOL

public expect fun DeletePrintProcessorW(pname: PCWSTR, penvironment: PCWSTR, pprintprocessorname: PCWSTR): BOOL

public expect fun DeletePrintProvidorA(pname: PCSTR, penvironment: PCSTR, pprintprovidorname: PCSTR): BOOL

public expect fun DeletePrintProvidorW(pname: PCWSTR, penvironment: PCWSTR, pprintprovidorname: PCWSTR): BOOL

public expect fun DeletePrinter(hprinter: PRINTER_HANDLE): BOOL

public expect fun DeletePrinterConnectionA(pname: PCSTR): BOOL

public expect fun DeletePrinterConnectionW(pname: PCWSTR): BOOL

public expect fun DeletePrinterDataA(hprinter: PRINTER_HANDLE, pvaluename: PCSTR): UInt

public expect fun DeletePrinterDataExA(hprinter: PRINTER_HANDLE, pkeyname: PCSTR, pvaluename: PCSTR): UInt

public expect fun DeletePrinterDataExW(hprinter: PRINTER_HANDLE, pkeyname: PCWSTR, pvaluename: PCWSTR): UInt

public expect fun DeletePrinterDataW(hprinter: PRINTER_HANDLE, pvaluename: PCWSTR): UInt

public expect fun DeletePrinterDriverA(pname: PCSTR, penvironment: PCSTR, pdrivername: PCSTR): BOOL

public expect fun DeletePrinterDriverExA(pname: PCSTR, penvironment: PCSTR, pdrivername: PCSTR, dwdeleteflag: UInt, dwversionflag: UInt): BOOL

public expect fun DeletePrinterDriverExW(pname: PCWSTR, penvironment: PCWSTR, pdrivername: PCWSTR, dwdeleteflag: UInt, dwversionflag: UInt): BOOL

public expect fun DeletePrinterDriverPackageA(pszserver: PCSTR, pszinfpath: PCSTR, pszenvironment: PCSTR): HRESULT

public expect fun DeletePrinterDriverPackageW(pszserver: PCWSTR, pszinfpath: PCWSTR, pszenvironment: PCWSTR): HRESULT

public expect fun DeletePrinterDriverW(pname: PCWSTR, penvironment: PCWSTR, pdrivername: PCWSTR): BOOL

public expect fun DeletePrinterIC(hprinteric: HANDLE): BOOL

public expect fun DeletePrinterKeyA(hprinter: PRINTER_HANDLE, pkeyname: PCSTR): UInt

public expect fun DeletePrinterKeyW(hprinter: PRINTER_HANDLE, pkeyname: PCWSTR): UInt

public expect fun DevQueryPrint(hprinter: PRINTER_HANDLE, pdevmode: Long, presid: Long): BOOL

public expect fun DevQueryPrintEx(pdqpinfo: Long): BOOL

public expect fun DocumentPropertiesA(hwnd: HWND, hprinter: PRINTER_HANDLE, pdevicename: PCSTR, pdevmodeoutput: Long, pdevmodeinput: Long, fmode: UInt): Int

public expect fun DocumentPropertiesW(hwnd: HWND, hprinter: PRINTER_HANDLE, pdevicename: PCWSTR, pdevmodeoutput: Long, pdevmodeinput: Long, fmode: UInt): Int

public expect fun EndDocPrinter(hprinter: PRINTER_HANDLE): BOOL

public expect fun EndPagePrinter(hprinter: PRINTER_HANDLE): BOOL

public expect fun EnumFormsA(hprinter: PRINTER_HANDLE, level: UInt, pform: Long, cbbuf: UInt, pcbneeded: Long, pcreturned: Long): BOOL

public expect fun EnumFormsW(hprinter: PRINTER_HANDLE, level: UInt, pform: Long, cbbuf: UInt, pcbneeded: Long, pcreturned: Long): BOOL

public expect fun EnumJobNamedProperties(hprinter: PRINTER_HANDLE, jobid: UInt, pcproperties: Long, ppproperties: Long): UInt

public expect fun EnumJobsA(hprinter: PRINTER_HANDLE, firstjob: UInt, nojobs: UInt, level: UInt, pjob: Long, cbbuf: UInt, pcbneeded: Long, pcreturned: Long): BOOL

public expect fun EnumJobsW(hprinter: PRINTER_HANDLE, firstjob: UInt, nojobs: UInt, level: UInt, pjob: Long, cbbuf: UInt, pcbneeded: Long, pcreturned: Long): BOOL

public expect fun EnumMonitorsA(pname: PCSTR, level: UInt, pmonitor: Long, cbbuf: UInt, pcbneeded: Long, pcreturned: Long): BOOL

public expect fun EnumMonitorsW(pname: PCWSTR, level: UInt, pmonitor: Long, cbbuf: UInt, pcbneeded: Long, pcreturned: Long): BOOL

public expect fun EnumPortsA(pname: PCSTR, level: UInt, pport: Long, cbbuf: UInt, pcbneeded: Long, pcreturned: Long): BOOL

public expect fun EnumPortsW(pname: PCWSTR, level: UInt, pport: Long, cbbuf: UInt, pcbneeded: Long, pcreturned: Long): BOOL

public expect fun EnumPrintProcessorDatatypesA(pname: PCSTR, pprintprocessorname: PCSTR, level: UInt, pdatatypes: Long, cbbuf: UInt, pcbneeded: Long, pcreturned: Long): BOOL

public expect fun EnumPrintProcessorDatatypesW(pname: PCWSTR, pprintprocessorname: PCWSTR, level: UInt, pdatatypes: Long, cbbuf: UInt, pcbneeded: Long, pcreturned: Long): BOOL

public expect fun EnumPrintProcessorsA(pname: PCSTR, penvironment: PCSTR, level: UInt, pprintprocessorinfo: Long, cbbuf: UInt, pcbneeded: Long, pcreturned: Long): BOOL

public expect fun EnumPrintProcessorsW(pname: PCWSTR, penvironment: PCWSTR, level: UInt, pprintprocessorinfo: Long, cbbuf: UInt, pcbneeded: Long, pcreturned: Long): BOOL

public expect fun EnumPrinterDataA(hprinter: PRINTER_HANDLE, dwindex: UInt, pvaluename: PSTR, cbvaluename: UInt, pcbvaluename: Long, ptype: Long, pdata: Long, cbdata: UInt, pcbdata: Long): UInt

public expect fun EnumPrinterDataExA(hprinter: PRINTER_HANDLE, pkeyname: PCSTR, penumvalues: Long, cbenumvalues: UInt, pcbenumvalues: Long, pnenumvalues: Long): UInt

public expect fun EnumPrinterDataExW(hprinter: PRINTER_HANDLE, pkeyname: PCWSTR, penumvalues: Long, cbenumvalues: UInt, pcbenumvalues: Long, pnenumvalues: Long): UInt

public expect fun EnumPrinterDataW(hprinter: PRINTER_HANDLE, dwindex: UInt, pvaluename: PWSTR, cbvaluename: UInt, pcbvaluename: Long, ptype: Long, pdata: Long, cbdata: UInt, pcbdata: Long): UInt

public expect fun EnumPrinterDriversA(pname: PCSTR, penvironment: PCSTR, level: UInt, pdriverinfo: Long, cbbuf: UInt, pcbneeded: Long, pcreturned: Long): BOOL

public expect fun EnumPrinterDriversW(pname: PCWSTR, penvironment: PCWSTR, level: UInt, pdriverinfo: Long, cbbuf: UInt, pcbneeded: Long, pcreturned: Long): BOOL

public expect fun EnumPrinterKeyA(hprinter: PRINTER_HANDLE, pkeyname: PCSTR, psubkey: PSTR, cbsubkey: UInt, pcbsubkey: Long): UInt

public expect fun EnumPrinterKeyW(hprinter: PRINTER_HANDLE, pkeyname: PCWSTR, psubkey: PWSTR, cbsubkey: UInt, pcbsubkey: Long): UInt

public expect fun EnumPrintersA(flags: UInt, name: PCSTR, level: UInt, pprinterenum: Long, cbbuf: UInt, pcbneeded: Long, pcreturned: Long): BOOL

public expect fun EnumPrintersW(flags: UInt, name: PCWSTR, level: UInt, pprinterenum: Long, cbbuf: UInt, pcbneeded: Long, pcreturned: Long): BOOL

public expect fun ExtDeviceMode(hwnd: HWND, hinst: HANDLE, pdevmodeoutput: Long, pdevicename: PCSTR, pport: PCSTR, pdevmodeinput: Long, pprofile: PCSTR, fmode: UInt): Int

public expect fun FindClosePrinterChangeNotification(hchange: HANDLE): BOOL

public expect fun FindFirstPrinterChangeNotification(hprinter: PRINTER_HANDLE, fdwfilter: UInt, fdwoptions: UInt, pprinternotifyoptions: Long): HANDLE

public expect fun FindNextPrinterChangeNotification(hchange: HANDLE, pdwchange: Long, pvreserved: Long, ppprinternotifyinfo: Long): BOOL

public expect fun FlushPrinter(hprinter: PRINTER_HANDLE, pbuf: Long, cbbuf: UInt, pcwritten: Long, csleep: UInt): BOOL

public expect fun FreePrintNamedPropertyArray(cproperties: UInt, ppproperties: Long)

public expect fun FreePrintPropertyValue(pvalue: Long)

public expect fun FreePrinterNotifyInfo(pprinternotifyinfo: Long): BOOL

public expect fun GdiDeleteSpoolFileHandle(spoolfilehandle: HANDLE): BOOL

public expect fun GdiEndDocEMF(spoolfilehandle: HANDLE): BOOL

public expect fun GdiEndPageEMF(spoolfilehandle: HANDLE, dwoptimization: UInt): BOOL

public expect fun GdiGetDC(spoolfilehandle: HANDLE): HDC

public expect fun GdiGetDevmodeForPage(spoolfilehandle: HANDLE, dwpagenumber: UInt, pcurrdm: Long, plastdm: Long): BOOL

public expect fun GdiGetPageCount(spoolfilehandle: HANDLE): UInt

public expect fun GdiGetPageHandle(spoolfilehandle: HANDLE, page: UInt, pdwpagetype: Long): HANDLE

public expect fun GdiGetSpoolFileHandle(pwszprintername: PCWSTR, pdevmode: Long, pwszdocname: PCWSTR): HANDLE

public expect fun GdiPlayPageEMF(spoolfilehandle: HANDLE, hemf: HANDLE, prectdocument: Long, prectborder: Long, prectclip: Long): BOOL

public expect fun GdiResetDCEMF(spoolfilehandle: HANDLE, pcurrdm: Long): BOOL

public expect fun GdiStartDocEMF(spoolfilehandle: HANDLE, pdocinfo: Long): BOOL

public expect fun GdiStartPageEMF(spoolfilehandle: HANDLE): BOOL

public expect fun GenerateCopyFilePaths(pszprintername: PCWSTR, pszdirectory: PCWSTR, psplclientinfo: Long, dwlevel: UInt, pszsourcedir: PWSTR, pcchsourcedirsize: Long, psztargetdir: PWSTR, pcchtargetdirsize: Long, dwflags: UInt): UInt

public expect fun GetCPSUIUserData(hdlg: HWND): ULong

public expect fun GetCorePrinterDriversA(pszserver: PCSTR, pszenvironment: PCSTR, pszzcoredriverdependencies: PCSTR, ccoreprinterdrivers: UInt, pcoreprinterdrivers: Long): HRESULT

public expect fun GetCorePrinterDriversW(pszserver: PCWSTR, pszenvironment: PCWSTR, pszzcoredriverdependencies: PCWSTR, ccoreprinterdrivers: UInt, pcoreprinterdrivers: Long): HRESULT

public expect fun GetDefaultPrinterA(pszbuffer: PSTR, pcchbuffer: Long): BOOL

public expect fun GetDefaultPrinterW(pszbuffer: PWSTR, pcchbuffer: Long): BOOL

public expect fun GetFormA(hprinter: PRINTER_HANDLE, pformname: PCSTR, level: UInt, pform: Long, cbbuf: UInt, pcbneeded: Long): BOOL

public expect fun GetFormW(hprinter: PRINTER_HANDLE, pformname: PCWSTR, level: UInt, pform: Long, cbbuf: UInt, pcbneeded: Long): BOOL

public expect fun GetJobA(hprinter: PRINTER_HANDLE, jobid: UInt, level: UInt, pjob: Long, cbbuf: UInt, pcbneeded: Long): BOOL

public expect fun GetJobAttributes(pprintername: PCWSTR, pdevmode: Long, pattributeinfo: Long): BOOL

public expect fun GetJobAttributesEx(pprintername: PCWSTR, pdevmode: Long, dwlevel: UInt, pattributeinfo: Long, nsize: UInt, dwflags: UInt): BOOL

public expect fun GetJobNamedPropertyValue(hprinter: PRINTER_HANDLE, jobid: UInt, pszname: PCWSTR, pvalue: Long): UInt

public expect fun GetJobW(hprinter: PRINTER_HANDLE, jobid: UInt, level: UInt, pjob: Long, cbbuf: UInt, pcbneeded: Long): BOOL

public expect fun GetPrintExecutionData(pdata: Long): BOOL

public expect fun GetPrintOutputInfo(hwnd: HWND, pszprinter: PCWSTR, phfile: Long, ppszoutputfile: Long): HRESULT

public expect fun GetPrintProcessorDirectoryA(pname: PCSTR, penvironment: PCSTR, level: UInt, pprintprocessorinfo: Long, cbbuf: UInt, pcbneeded: Long): BOOL

public expect fun GetPrintProcessorDirectoryW(pname: PCWSTR, penvironment: PCWSTR, level: UInt, pprintprocessorinfo: Long, cbbuf: UInt, pcbneeded: Long): BOOL

public expect fun GetPrinterA(hprinter: PRINTER_HANDLE, level: UInt, pprinter: Long, cbbuf: UInt, pcbneeded: Long): BOOL

public expect fun GetPrinterDataA(hprinter: PRINTER_HANDLE, pvaluename: PCSTR, ptype: Long, pdata: Long, nsize: UInt, pcbneeded: Long): UInt

public expect fun GetPrinterDataExA(hprinter: PRINTER_HANDLE, pkeyname: PCSTR, pvaluename: PCSTR, ptype: Long, pdata: Long, nsize: UInt, pcbneeded: Long): UInt

public expect fun GetPrinterDataExW(hprinter: PRINTER_HANDLE, pkeyname: PCWSTR, pvaluename: PCWSTR, ptype: Long, pdata: Long, nsize: UInt, pcbneeded: Long): UInt

public expect fun GetPrinterDataW(hprinter: PRINTER_HANDLE, pvaluename: PCWSTR, ptype: Long, pdata: Long, nsize: UInt, pcbneeded: Long): UInt

public expect fun GetPrinterDriver2A(hwnd: HWND, hprinter: PRINTER_HANDLE, penvironment: PCSTR, level: UInt, pdriverinfo: Long, cbbuf: UInt, pcbneeded: Long): BOOL

public expect fun GetPrinterDriver2W(hwnd: HWND, hprinter: PRINTER_HANDLE, penvironment: PCWSTR, level: UInt, pdriverinfo: Long, cbbuf: UInt, pcbneeded: Long): BOOL

public expect fun GetPrinterDriverA(hprinter: PRINTER_HANDLE, penvironment: PCSTR, level: UInt, pdriverinfo: Long, cbbuf: UInt, pcbneeded: Long): BOOL

public expect fun GetPrinterDriverDirectoryA(pname: PCSTR, penvironment: PCSTR, level: UInt, pdriverdirectory: Long, cbbuf: UInt, pcbneeded: Long): BOOL

public expect fun GetPrinterDriverDirectoryW(pname: PCWSTR, penvironment: PCWSTR, level: UInt, pdriverdirectory: Long, cbbuf: UInt, pcbneeded: Long): BOOL

public expect fun GetPrinterDriverPackagePathA(pszserver: PCSTR, pszenvironment: PCSTR, pszlanguage: PCSTR, pszpackageid: PCSTR, pszdriverpackagecab: PSTR, cchdriverpackagecab: UInt, pcchrequiredsize: Long): HRESULT

public expect fun GetPrinterDriverPackagePathW(pszserver: PCWSTR, pszenvironment: PCWSTR, pszlanguage: PCWSTR, pszpackageid: PCWSTR, pszdriverpackagecab: PWSTR, cchdriverpackagecab: UInt, pcchrequiredsize: Long): HRESULT

public expect fun GetPrinterDriverW(hprinter: PRINTER_HANDLE, penvironment: PCWSTR, level: UInt, pdriverinfo: Long, cbbuf: UInt, pcbneeded: Long): BOOL

public expect fun GetPrinterW(hprinter: PRINTER_HANDLE, level: UInt, pprinter: Long, cbbuf: UInt, pcbneeded: Long): BOOL

public expect fun GetSpoolFileHandle(hprinter: PRINTER_HANDLE): HANDLE

public expect fun ImpersonatePrinterClient(htoken: HANDLE): BOOL

public expect fun InstallPrinterDriverFromPackageA(pszserver: PCSTR, pszinfpath: PCSTR, pszdrivername: PCSTR, pszenvironment: PCSTR, dwflags: UInt): HRESULT

public expect fun InstallPrinterDriverFromPackageW(pszserver: PCWSTR, pszinfpath: PCWSTR, pszdrivername: PCWSTR, pszenvironment: PCWSTR, dwflags: UInt): HRESULT

public expect fun IsValidDevmodeA(pdevmode: Long, devmodesize: ULong): BOOL

public expect fun IsValidDevmodeW(pdevmode: Long, devmodesize: ULong): BOOL

public expect fun OpenPrinter2A(pprintername: PCSTR, phprinter: Long, pdefault: Long, poptions: Long): BOOL

public expect fun OpenPrinter2W(pprintername: PCWSTR, phprinter: Long, pdefault: Long, poptions: Long): BOOL

public expect fun OpenPrinterA(pprintername: PCSTR, phprinter: Long, pdefault: Long): BOOL

public expect fun OpenPrinterW(pprintername: PCWSTR, phprinter: Long, pdefault: Long): BOOL

public expect fun PartialReplyPrinterChangeNotification(hprinter: PRINTER_HANDLE, pdatasrc: Long): BOOL

public expect fun PlayGdiScriptOnPrinterIC(hprinteric: HANDLE, pin: Long, cin: UInt, pout: Long, cout: UInt, ul: UInt): BOOL

public expect fun PrinterMessageBoxA(hprinter: PRINTER_HANDLE, error: UInt, hwnd: HWND, ptext: PCSTR, pcaption: PCSTR, dwtype: UInt): UInt

public expect fun PrinterMessageBoxW(hprinter: PRINTER_HANDLE, error: UInt, hwnd: HWND, ptext: PCWSTR, pcaption: PCWSTR, dwtype: UInt): UInt

public expect fun PrinterProperties(hwnd: HWND, hprinter: PRINTER_HANDLE): BOOL

public expect fun ProvidorFindClosePrinterChangeNotification(hprinter: PRINTER_HANDLE): BOOL

public expect fun ProvidorFindFirstPrinterChangeNotification(hprinter: PRINTER_HANDLE, fdwflags: UInt, fdwoptions: UInt, hnotify: HANDLE, pprinternotifyoptions: Long, pvreserved1: Long): BOOL

public expect fun ReadPrinter(hprinter: PRINTER_HANDLE, pbuf: Long, cbbuf: UInt, pnobytesread: Long): BOOL

public expect fun RegisterForPrintAsyncNotifications(pszname: PCWSTR, pnotificationtype: Long, euserfilter: PrintAsyncNotifyUserFilter, econversationstyle: PrintAsyncNotifyConversationStyle, pcallback: Long, phnotify: Long): HRESULT

public expect fun RemovePrintDeviceObject(hdeviceobject: HANDLE): HRESULT

public expect fun ReplyPrinterChangeNotification(hprinter: PRINTER_HANDLE, fdwchangeflags: UInt, pdwresult: Long, pprinternotifyinfo: Long): BOOL

public expect fun ReplyPrinterChangeNotificationEx(hnotify: HANDLE, dwcolor: UInt, fdwflags: UInt, pdwresult: Long, pprinternotifyinfo: Long): BOOL

public expect fun ReportJobProcessingProgress(printerhandle: HANDLE, jobid: UInt, joboperation: EPrintXPSJobOperation, jobprogress: EPrintXPSJobProgress): HRESULT

public expect fun ResetPrinterA(hprinter: PRINTER_HANDLE, pdefault: Long): BOOL

public expect fun ResetPrinterW(hprinter: PRINTER_HANDLE, pdefault: Long): BOOL

public expect fun RevertToPrinterSelf(): HANDLE

public expect fun RouterAllocBidiMem(numbytes: ULong): Long

public expect fun RouterAllocBidiResponseContainer(count: UInt): Long

public expect fun RouterAllocPrinterNotifyInfo(cprinternotifyinfodata: UInt): Long

public expect fun RouterFreeBidiMem(pmempointer: Long)

public expect fun RouterFreeBidiResponseContainer(pdata: Long): UInt

public expect fun RouterFreePrinterNotifyInfo(pinfo: Long): BOOL

public expect fun ScheduleJob(hprinter: PRINTER_HANDLE, jobid: UInt): BOOL

public expect fun SetCPSUIUserData(hdlg: HWND, cpsuiuserdata: ULong): BOOL

public expect fun SetDefaultPrinterA(pszprinter: PCSTR): BOOL

public expect fun SetDefaultPrinterW(pszprinter: PCWSTR): BOOL

public expect fun SetFormA(hprinter: PRINTER_HANDLE, pformname: PCSTR, level: UInt, pform: Long): BOOL

public expect fun SetFormW(hprinter: PRINTER_HANDLE, pformname: PCWSTR, level: UInt, pform: Long): BOOL

public expect fun SetJobA(hprinter: PRINTER_HANDLE, jobid: UInt, level: UInt, pjob: Long, command: UInt): BOOL

public expect fun SetJobNamedProperty(hprinter: PRINTER_HANDLE, jobid: UInt, pproperty: Long): UInt

public expect fun SetJobW(hprinter: PRINTER_HANDLE, jobid: UInt, level: UInt, pjob: Long, command: UInt): BOOL

public expect fun SetPortA(pname: PCSTR, pportname: PCSTR, dwlevel: UInt, pportinfo: Long): BOOL

public expect fun SetPortW(pname: PCWSTR, pportname: PCWSTR, dwlevel: UInt, pportinfo: Long): BOOL

public expect fun SetPrinterA(hprinter: PRINTER_HANDLE, level: UInt, pprinter: Long, command: UInt): BOOL

public expect fun SetPrinterDataA(hprinter: PRINTER_HANDLE, pvaluename: PCSTR, type: UInt, pdata: Long, cbdata: UInt): UInt

public expect fun SetPrinterDataExA(hprinter: PRINTER_HANDLE, pkeyname: PCSTR, pvaluename: PCSTR, type: UInt, pdata: Long, cbdata: UInt): UInt

public expect fun SetPrinterDataExW(hprinter: PRINTER_HANDLE, pkeyname: PCWSTR, pvaluename: PCWSTR, type: UInt, pdata: Long, cbdata: UInt): UInt

public expect fun SetPrinterDataW(hprinter: PRINTER_HANDLE, pvaluename: PCWSTR, type: UInt, pdata: Long, cbdata: UInt): UInt

public expect fun SetPrinterW(hprinter: PRINTER_HANDLE, level: UInt, pprinter: Long, command: UInt): BOOL

public expect fun SplIsSessionZero(hprinter: PRINTER_HANDLE, jobid: UInt, pissessionzero: Long): UInt

public expect fun SplPromptUIInUsersSession(hprinter: PRINTER_HANDLE, jobid: UInt, puiparams: Long, presponse: Long): BOOL

public expect fun SpoolerCopyFileEvent(pszprintername: PCWSTR, pszkey: PCWSTR, dwcopyfileevent: UInt): BOOL

public expect fun SpoolerFindClosePrinterChangeNotification(hprinter: PRINTER_HANDLE): BOOL

public expect fun SpoolerFindFirstPrinterChangeNotification(hprinter: PRINTER_HANDLE, fdwfilterflags: UInt, fdwoptions: UInt, pprinternotifyoptions: Long, pvreserved: Long, pnotificationconfig: Long, phnotify: Long, phevent: Long): BOOL

public expect fun SpoolerFindNextPrinterChangeNotification(hprinter: PRINTER_HANDLE, pfdwchange: Long, pprinternotifyoptions: Long, ppprinternotifyinfo: Long): BOOL

public expect fun SpoolerFreePrinterNotifyInfo(pinfo: Long)

public expect fun SpoolerRefreshPrinterChangeNotification(hprinter: PRINTER_HANDLE, dwcolor: UInt, poptions: Long, ppinfo: Long): BOOL

public expect fun StartDocPrinterA(hprinter: PRINTER_HANDLE, level: UInt, pdocinfo: Long): UInt

public expect fun StartDocPrinterW(hprinter: PRINTER_HANDLE, level: UInt, pdocinfo: Long): UInt

public expect fun StartPagePrinter(hprinter: PRINTER_HANDLE): BOOL

public expect fun UnRegisterForPrintAsyncNotifications(param0: HANDLE): HRESULT

public expect fun UpdatePrintDeviceObject(hprinter: PRINTER_HANDLE, hdeviceobject: HANDLE): HRESULT

public expect fun UploadPrinterDriverPackageA(pszserver: PCSTR, pszinfpath: PCSTR, pszenvironment: PCSTR, dwflags: UInt, hwnd: HWND, pszdestinfpath: PSTR, pcchdestinfpath: Long): HRESULT

public expect fun UploadPrinterDriverPackageW(pszserver: PCWSTR, pszinfpath: PCWSTR, pszenvironment: PCWSTR, dwflags: UInt, hwnd: HWND, pszdestinfpath: PWSTR, pcchdestinfpath: Long): HRESULT

public expect fun WaitForPrinterChange(hprinter: PRINTER_HANDLE, flags: UInt): UInt

public expect fun WritePrinter(hprinter: PRINTER_HANDLE, pbuf: Long, cbbuf: UInt, pcwritten: Long): BOOL

public expect fun XcvDataW(hxcv: HANDLE, pszdataname: PCWSTR, pinputdata: Long, cbinputdata: UInt, poutputdata: Long, cboutputdata: UInt, pcboutputneeded: Long, pdwstatus: Long): BOOL
