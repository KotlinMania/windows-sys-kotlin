package io.github.kotlinmania.windowssys.windows.win32.graphics.printing

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
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hdc

public expect fun abortPrinter(hprinter: PrinterHandle): Bool

public expect fun addFormA(hprinter: PrinterHandle, level: UInt, pform: ConstPtr): Bool

public expect fun addFormW(hprinter: PrinterHandle, level: UInt, pform: ConstPtr): Bool

public expect fun addJobA(hprinter: PrinterHandle, level: UInt, pdata: MutPtr, cbbuf: UInt, pcbneeded: MutPtr): Bool

public expect fun addJobW(hprinter: PrinterHandle, level: UInt, pdata: MutPtr, cbbuf: UInt, pcbneeded: MutPtr): Bool

public expect fun addMonitorA(pname: Pcstr, level: UInt, pmonitors: ConstPtr): Bool

public expect fun addMonitorW(pname: Pcwstr, level: UInt, pmonitors: ConstPtr): Bool

public expect fun addPortA(pname: Pcstr, hwnd: Hwnd, pmonitorname: Pcstr): Bool

public expect fun addPortW(pname: Pcwstr, hwnd: Hwnd, pmonitorname: Pcwstr): Bool

public expect fun addPrintDeviceObject(hprinter: PrinterHandle, phdeviceobject: MutPtr): Hresult

public expect fun addPrintProcessorA(pname: Pcstr, penvironment: Pcstr, ppathname: Pcstr, pprintprocessorname: Pcstr): Bool

public expect fun addPrintProcessorW(pname: Pcwstr, penvironment: Pcwstr, ppathname: Pcwstr, pprintprocessorname: Pcwstr): Bool

public expect fun addPrintProvidorA(pname: Pcstr, level: UInt, pprovidorinfo: ConstPtr): Bool

public expect fun addPrintProvidorW(pname: Pcwstr, level: UInt, pprovidorinfo: ConstPtr): Bool

public expect fun addPrinterA(pname: Pcstr, level: UInt, pprinter: ConstPtr): Handle

public expect fun addPrinterConnection2A(hwnd: Hwnd, pszname: Pcstr, dwlevel: UInt, pconnectioninfo: ConstPtr): Bool

public expect fun addPrinterConnection2W(hwnd: Hwnd, pszname: Pcwstr, dwlevel: UInt, pconnectioninfo: ConstPtr): Bool

public expect fun addPrinterConnectionA(pname: Pcstr): Bool

public expect fun addPrinterConnectionW(pname: Pcwstr): Bool

public expect fun addPrinterDriverA(pname: Pcstr, level: UInt, pdriverinfo: ConstPtr): Bool

public expect fun addPrinterDriverExA(pname: Pcstr, level: UInt, lpbdriverinfo: ConstPtr, dwfilecopyflags: UInt): Bool

public expect fun addPrinterDriverExW(pname: Pcwstr, level: UInt, lpbdriverinfo: ConstPtr, dwfilecopyflags: UInt): Bool

public expect fun addPrinterDriverW(pname: Pcwstr, level: UInt, pdriverinfo: ConstPtr): Bool

public expect fun addPrinterW(pname: Pcwstr, level: UInt, pprinter: ConstPtr): Handle

public expect fun advancedDocumentPropertiesA(hwnd: Hwnd, hprinter: PrinterHandle, pdevicename: Pcstr, pdevmodeoutput: MutPtr, pdevmodeinput: ConstPtr): Int

public expect fun advancedDocumentPropertiesW(hwnd: Hwnd, hprinter: PrinterHandle, pdevicename: Pcwstr, pdevmodeoutput: MutPtr, pdevmodeinput: ConstPtr): Int

public expect fun appendPrinterNotifyInfoData(pinfodest: ConstPtr, pdatasrc: ConstPtr, fdwflags: UInt): Bool

public expect fun callRouterFindFirstPrinterChangeNotification(hprinterrpc: Handle, fdwfilterflags: UInt, fdwoptions: UInt, hnotify: Handle, pprinternotifyoptions: ConstPtr): UInt

public expect fun closePrinter(hprinter: PrinterHandle): Bool

public expect fun closeSpoolFileHandle(hprinter: PrinterHandle, hspoolfile: Handle): Bool

public expect fun commitSpoolData(hprinter: PrinterHandle, hspoolfile: Handle, cbcommit: UInt): Handle

public expect fun commonPropertySheetUIA(hwndowner: Hwnd, pfnpropsheetui: Pfnpropsheetui, lparam: Lparam, presult: MutPtr): Int

public expect fun commonPropertySheetUIW(hwndowner: Hwnd, pfnpropsheetui: Pfnpropsheetui, lparam: Lparam, presult: MutPtr): Int

public expect fun configurePortA(pname: Pcstr, hwnd: Hwnd, pportname: Pcstr): Bool

public expect fun configurePortW(pname: Pcwstr, hwnd: Hwnd, pportname: Pcwstr): Bool

public expect fun connectToPrinterDlg(hwnd: Hwnd, flags: UInt): Handle

public expect fun corePrinterDriverInstalledA(pszserver: Pcstr, pszenvironment: Pcstr, coredriverguid: Guid, ftdriverdate: Filetime, dwldriverversion: ULong, pbdriverinstalled: MutPtr): Hresult

public expect fun corePrinterDriverInstalledW(pszserver: Pcwstr, pszenvironment: Pcwstr, coredriverguid: Guid, ftdriverdate: Filetime, dwldriverversion: ULong, pbdriverinstalled: MutPtr): Hresult

public expect fun createPrintAsyncNotifyChannel(pszname: Pcwstr, pnotificationtype: ConstPtr, euserfilter: PrintAsyncNotifyUserFilter, econversationstyle: PrintAsyncNotifyConversationStyle, pcallback: MutPtr, ppiasynchnotification: MutPtr): Hresult

public expect fun createPrinterIC(hprinter: PrinterHandle, pdevmode: ConstPtr): Handle

public expect fun deleteFormA(hprinter: PrinterHandle, pformname: Pcstr): Bool

public expect fun deleteFormW(hprinter: PrinterHandle, pformname: Pcwstr): Bool

public expect fun deleteJobNamedProperty(hprinter: PrinterHandle, jobid: UInt, pszname: Pcwstr): UInt

public expect fun deleteMonitorA(pname: Pcstr, penvironment: Pcstr, pmonitorname: Pcstr): Bool

public expect fun deleteMonitorW(pname: Pcwstr, penvironment: Pcwstr, pmonitorname: Pcwstr): Bool

public expect fun deletePortA(pname: Pcstr, hwnd: Hwnd, pportname: Pcstr): Bool

public expect fun deletePortW(pname: Pcwstr, hwnd: Hwnd, pportname: Pcwstr): Bool

public expect fun deletePrintProcessorA(pname: Pcstr, penvironment: Pcstr, pprintprocessorname: Pcstr): Bool

public expect fun deletePrintProcessorW(pname: Pcwstr, penvironment: Pcwstr, pprintprocessorname: Pcwstr): Bool

public expect fun deletePrintProvidorA(pname: Pcstr, penvironment: Pcstr, pprintprovidorname: Pcstr): Bool

public expect fun deletePrintProvidorW(pname: Pcwstr, penvironment: Pcwstr, pprintprovidorname: Pcwstr): Bool

public expect fun deletePrinter(hprinter: PrinterHandle): Bool

public expect fun deletePrinterConnectionA(pname: Pcstr): Bool

public expect fun deletePrinterConnectionW(pname: Pcwstr): Bool

public expect fun deletePrinterDataA(hprinter: PrinterHandle, pvaluename: Pcstr): UInt

public expect fun deletePrinterDataExA(hprinter: PrinterHandle, pkeyname: Pcstr, pvaluename: Pcstr): UInt

public expect fun deletePrinterDataExW(hprinter: PrinterHandle, pkeyname: Pcwstr, pvaluename: Pcwstr): UInt

public expect fun deletePrinterDataW(hprinter: PrinterHandle, pvaluename: Pcwstr): UInt

public expect fun deletePrinterDriverA(pname: Pcstr, penvironment: Pcstr, pdrivername: Pcstr): Bool

public expect fun deletePrinterDriverExA(pname: Pcstr, penvironment: Pcstr, pdrivername: Pcstr, dwdeleteflag: UInt, dwversionflag: UInt): Bool

public expect fun deletePrinterDriverExW(pname: Pcwstr, penvironment: Pcwstr, pdrivername: Pcwstr, dwdeleteflag: UInt, dwversionflag: UInt): Bool

public expect fun deletePrinterDriverPackageA(pszserver: Pcstr, pszinfpath: Pcstr, pszenvironment: Pcstr): Hresult

public expect fun deletePrinterDriverPackageW(pszserver: Pcwstr, pszinfpath: Pcwstr, pszenvironment: Pcwstr): Hresult

public expect fun deletePrinterDriverW(pname: Pcwstr, penvironment: Pcwstr, pdrivername: Pcwstr): Bool

public expect fun deletePrinterIC(hprinteric: Handle): Bool

public expect fun deletePrinterKeyA(hprinter: PrinterHandle, pkeyname: Pcstr): UInt

public expect fun deletePrinterKeyW(hprinter: PrinterHandle, pkeyname: Pcwstr): UInt

public expect fun devQueryPrint(hprinter: PrinterHandle, pdevmode: ConstPtr, presid: MutPtr): Bool

public expect fun devQueryPrintEx(pdqpinfo: MutPtr): Bool

public expect fun documentPropertiesA(hwnd: Hwnd, hprinter: PrinterHandle, pdevicename: Pcstr, pdevmodeoutput: MutPtr, pdevmodeinput: ConstPtr, fmode: UInt): Int

public expect fun documentPropertiesW(hwnd: Hwnd, hprinter: PrinterHandle, pdevicename: Pcwstr, pdevmodeoutput: MutPtr, pdevmodeinput: ConstPtr, fmode: UInt): Int

public expect fun endDocPrinter(hprinter: PrinterHandle): Bool

public expect fun endPagePrinter(hprinter: PrinterHandle): Bool

public expect fun enumFormsA(hprinter: PrinterHandle, level: UInt, pform: MutPtr, cbbuf: UInt, pcbneeded: MutPtr, pcreturned: MutPtr): Bool

public expect fun enumFormsW(hprinter: PrinterHandle, level: UInt, pform: MutPtr, cbbuf: UInt, pcbneeded: MutPtr, pcreturned: MutPtr): Bool

public expect fun enumJobNamedProperties(hprinter: PrinterHandle, jobid: UInt, pcproperties: MutPtr, ppproperties: MutPtr): UInt

public expect fun enumJobsA(hprinter: PrinterHandle, firstjob: UInt, nojobs: UInt, level: UInt, pjob: MutPtr, cbbuf: UInt, pcbneeded: MutPtr, pcreturned: MutPtr): Bool

public expect fun enumJobsW(hprinter: PrinterHandle, firstjob: UInt, nojobs: UInt, level: UInt, pjob: MutPtr, cbbuf: UInt, pcbneeded: MutPtr, pcreturned: MutPtr): Bool

public expect fun enumMonitorsA(pname: Pcstr, level: UInt, pmonitor: MutPtr, cbbuf: UInt, pcbneeded: MutPtr, pcreturned: MutPtr): Bool

public expect fun enumMonitorsW(pname: Pcwstr, level: UInt, pmonitor: MutPtr, cbbuf: UInt, pcbneeded: MutPtr, pcreturned: MutPtr): Bool

public expect fun enumPortsA(pname: Pcstr, level: UInt, pport: MutPtr, cbbuf: UInt, pcbneeded: MutPtr, pcreturned: MutPtr): Bool

public expect fun enumPortsW(pname: Pcwstr, level: UInt, pport: MutPtr, cbbuf: UInt, pcbneeded: MutPtr, pcreturned: MutPtr): Bool

public expect fun enumPrintProcessorDatatypesA(pname: Pcstr, pprintprocessorname: Pcstr, level: UInt, pdatatypes: MutPtr, cbbuf: UInt, pcbneeded: MutPtr, pcreturned: MutPtr): Bool

public expect fun enumPrintProcessorDatatypesW(pname: Pcwstr, pprintprocessorname: Pcwstr, level: UInt, pdatatypes: MutPtr, cbbuf: UInt, pcbneeded: MutPtr, pcreturned: MutPtr): Bool

public expect fun enumPrintProcessorsA(pname: Pcstr, penvironment: Pcstr, level: UInt, pprintprocessorinfo: MutPtr, cbbuf: UInt, pcbneeded: MutPtr, pcreturned: MutPtr): Bool

public expect fun enumPrintProcessorsW(pname: Pcwstr, penvironment: Pcwstr, level: UInt, pprintprocessorinfo: MutPtr, cbbuf: UInt, pcbneeded: MutPtr, pcreturned: MutPtr): Bool

public expect fun enumPrinterDataA(hprinter: PrinterHandle, dwindex: UInt, pvaluename: Pstr, cbvaluename: UInt, pcbvaluename: MutPtr, ptype: MutPtr, pdata: MutPtr, cbdata: UInt, pcbdata: MutPtr): UInt

public expect fun enumPrinterDataExA(hprinter: PrinterHandle, pkeyname: Pcstr, penumvalues: MutPtr, cbenumvalues: UInt, pcbenumvalues: MutPtr, pnenumvalues: MutPtr): UInt

public expect fun enumPrinterDataExW(hprinter: PrinterHandle, pkeyname: Pcwstr, penumvalues: MutPtr, cbenumvalues: UInt, pcbenumvalues: MutPtr, pnenumvalues: MutPtr): UInt

public expect fun enumPrinterDataW(hprinter: PrinterHandle, dwindex: UInt, pvaluename: Pwstr, cbvaluename: UInt, pcbvaluename: MutPtr, ptype: MutPtr, pdata: MutPtr, cbdata: UInt, pcbdata: MutPtr): UInt

public expect fun enumPrinterDriversA(pname: Pcstr, penvironment: Pcstr, level: UInt, pdriverinfo: MutPtr, cbbuf: UInt, pcbneeded: MutPtr, pcreturned: MutPtr): Bool

public expect fun enumPrinterDriversW(pname: Pcwstr, penvironment: Pcwstr, level: UInt, pdriverinfo: MutPtr, cbbuf: UInt, pcbneeded: MutPtr, pcreturned: MutPtr): Bool

public expect fun enumPrinterKeyA(hprinter: PrinterHandle, pkeyname: Pcstr, psubkey: Pstr, cbsubkey: UInt, pcbsubkey: MutPtr): UInt

public expect fun enumPrinterKeyW(hprinter: PrinterHandle, pkeyname: Pcwstr, psubkey: Pwstr, cbsubkey: UInt, pcbsubkey: MutPtr): UInt

public expect fun enumPrintersA(flags: UInt, name: Pcstr, level: UInt, pprinterenum: MutPtr, cbbuf: UInt, pcbneeded: MutPtr, pcreturned: MutPtr): Bool

public expect fun enumPrintersW(flags: UInt, name: Pcwstr, level: UInt, pprinterenum: MutPtr, cbbuf: UInt, pcbneeded: MutPtr, pcreturned: MutPtr): Bool

public expect fun extDeviceMode(hwnd: Hwnd, hinst: Handle, pdevmodeoutput: MutPtr, pdevicename: Pcstr, pport: Pcstr, pdevmodeinput: ConstPtr, pprofile: Pcstr, fmode: UInt): Int

public expect fun findClosePrinterChangeNotification(hchange: Handle): Bool

public expect fun findFirstPrinterChangeNotification(hprinter: PrinterHandle, fdwfilter: UInt, fdwoptions: UInt, pprinternotifyoptions: ConstPtr): Handle

public expect fun findNextPrinterChangeNotification(hchange: Handle, pdwchange: MutPtr, pvreserved: ConstPtr, ppprinternotifyinfo: MutPtr): Bool

public expect fun flushPrinter(hprinter: PrinterHandle, pbuf: ConstPtr, cbbuf: UInt, pcwritten: MutPtr, csleep: UInt): Bool

public expect fun freePrintNamedPropertyArray(cproperties: UInt, ppproperties: MutPtr)

public expect fun freePrintPropertyValue(pvalue: MutPtr)

public expect fun freePrinterNotifyInfo(pprinternotifyinfo: ConstPtr): Bool

public expect fun gdiDeleteSpoolFileHandle(spoolfilehandle: Handle): Bool

public expect fun gdiEndDocEMF(spoolfilehandle: Handle): Bool

public expect fun gdiEndPageEMF(spoolfilehandle: Handle, dwoptimization: UInt): Bool

public expect fun gdiGetDC(spoolfilehandle: Handle): Hdc

public expect fun gdiGetDevmodeForPage(spoolfilehandle: Handle, dwpagenumber: UInt, pcurrdm: MutPtr, plastdm: MutPtr): Bool

public expect fun gdiGetPageCount(spoolfilehandle: Handle): UInt

public expect fun gdiGetPageHandle(spoolfilehandle: Handle, page: UInt, pdwpagetype: MutPtr): Handle

public expect fun gdiGetSpoolFileHandle(pwszprintername: Pcwstr, pdevmode: MutPtr, pwszdocname: Pcwstr): Handle

public expect fun gdiPlayPageEMF(spoolfilehandle: Handle, hemf: Handle, prectdocument: MutPtr, prectborder: MutPtr, prectclip: MutPtr): Bool

public expect fun gdiResetDCEMF(spoolfilehandle: Handle, pcurrdm: MutPtr): Bool

public expect fun gdiStartDocEMF(spoolfilehandle: Handle, pdocinfo: MutPtr): Bool

public expect fun gdiStartPageEMF(spoolfilehandle: Handle): Bool

public expect fun generateCopyFilePaths(pszprintername: Pcwstr, pszdirectory: Pcwstr, psplclientinfo: ConstPtr, dwlevel: UInt, pszsourcedir: Pwstr, pcchsourcedirsize: MutPtr, psztargetdir: Pwstr, pcchtargetdirsize: MutPtr, dwflags: UInt): UInt

public expect fun getCPSUIUserData(hdlg: Hwnd): ULong

public expect fun getCorePrinterDriversA(pszserver: Pcstr, pszenvironment: Pcstr, pszzcoredriverdependencies: Pcstr, ccoreprinterdrivers: UInt, pcoreprinterdrivers: MutPtr): Hresult

public expect fun getCorePrinterDriversW(pszserver: Pcwstr, pszenvironment: Pcwstr, pszzcoredriverdependencies: Pcwstr, ccoreprinterdrivers: UInt, pcoreprinterdrivers: MutPtr): Hresult

public expect fun getDefaultPrinterA(pszbuffer: Pstr, pcchbuffer: MutPtr): Bool

public expect fun getDefaultPrinterW(pszbuffer: Pwstr, pcchbuffer: MutPtr): Bool

public expect fun getFormA(hprinter: PrinterHandle, pformname: Pcstr, level: UInt, pform: MutPtr, cbbuf: UInt, pcbneeded: MutPtr): Bool

public expect fun getFormW(hprinter: PrinterHandle, pformname: Pcwstr, level: UInt, pform: MutPtr, cbbuf: UInt, pcbneeded: MutPtr): Bool

public expect fun getJobA(hprinter: PrinterHandle, jobid: UInt, level: UInt, pjob: MutPtr, cbbuf: UInt, pcbneeded: MutPtr): Bool

public expect fun getJobAttributes(pprintername: Pcwstr, pdevmode: ConstPtr, pattributeinfo: MutPtr): Bool

public expect fun getJobAttributesEx(pprintername: Pcwstr, pdevmode: ConstPtr, dwlevel: UInt, pattributeinfo: MutPtr, nsize: UInt, dwflags: UInt): Bool

public expect fun getJobNamedPropertyValue(hprinter: PrinterHandle, jobid: UInt, pszname: Pcwstr, pvalue: MutPtr): UInt

public expect fun getJobW(hprinter: PrinterHandle, jobid: UInt, level: UInt, pjob: MutPtr, cbbuf: UInt, pcbneeded: MutPtr): Bool

public expect fun getPrintExecutionData(pdata: MutPtr): Bool

public expect fun getPrintOutputInfo(hwnd: Hwnd, pszprinter: Pcwstr, phfile: MutPtr, ppszoutputfile: MutPtr): Hresult

public expect fun getPrintProcessorDirectoryA(pname: Pcstr, penvironment: Pcstr, level: UInt, pprintprocessorinfo: MutPtr, cbbuf: UInt, pcbneeded: MutPtr): Bool

public expect fun getPrintProcessorDirectoryW(pname: Pcwstr, penvironment: Pcwstr, level: UInt, pprintprocessorinfo: MutPtr, cbbuf: UInt, pcbneeded: MutPtr): Bool

public expect fun getPrinterA(hprinter: PrinterHandle, level: UInt, pprinter: MutPtr, cbbuf: UInt, pcbneeded: MutPtr): Bool

public expect fun getPrinterDataA(hprinter: PrinterHandle, pvaluename: Pcstr, ptype: MutPtr, pdata: MutPtr, nsize: UInt, pcbneeded: MutPtr): UInt

public expect fun getPrinterDataExA(hprinter: PrinterHandle, pkeyname: Pcstr, pvaluename: Pcstr, ptype: MutPtr, pdata: MutPtr, nsize: UInt, pcbneeded: MutPtr): UInt

public expect fun getPrinterDataExW(hprinter: PrinterHandle, pkeyname: Pcwstr, pvaluename: Pcwstr, ptype: MutPtr, pdata: MutPtr, nsize: UInt, pcbneeded: MutPtr): UInt

public expect fun getPrinterDataW(hprinter: PrinterHandle, pvaluename: Pcwstr, ptype: MutPtr, pdata: MutPtr, nsize: UInt, pcbneeded: MutPtr): UInt

public expect fun getPrinterDriver2A(hwnd: Hwnd, hprinter: PrinterHandle, penvironment: Pcstr, level: UInt, pdriverinfo: MutPtr, cbbuf: UInt, pcbneeded: MutPtr): Bool

public expect fun getPrinterDriver2W(hwnd: Hwnd, hprinter: PrinterHandle, penvironment: Pcwstr, level: UInt, pdriverinfo: MutPtr, cbbuf: UInt, pcbneeded: MutPtr): Bool

public expect fun getPrinterDriverA(hprinter: PrinterHandle, penvironment: Pcstr, level: UInt, pdriverinfo: MutPtr, cbbuf: UInt, pcbneeded: MutPtr): Bool

public expect fun getPrinterDriverDirectoryA(pname: Pcstr, penvironment: Pcstr, level: UInt, pdriverdirectory: MutPtr, cbbuf: UInt, pcbneeded: MutPtr): Bool

public expect fun getPrinterDriverDirectoryW(pname: Pcwstr, penvironment: Pcwstr, level: UInt, pdriverdirectory: MutPtr, cbbuf: UInt, pcbneeded: MutPtr): Bool

public expect fun getPrinterDriverPackagePathA(pszserver: Pcstr, pszenvironment: Pcstr, pszlanguage: Pcstr, pszpackageid: Pcstr, pszdriverpackagecab: Pstr, cchdriverpackagecab: UInt, pcchrequiredsize: MutPtr): Hresult

public expect fun getPrinterDriverPackagePathW(pszserver: Pcwstr, pszenvironment: Pcwstr, pszlanguage: Pcwstr, pszpackageid: Pcwstr, pszdriverpackagecab: Pwstr, cchdriverpackagecab: UInt, pcchrequiredsize: MutPtr): Hresult

public expect fun getPrinterDriverW(hprinter: PrinterHandle, penvironment: Pcwstr, level: UInt, pdriverinfo: MutPtr, cbbuf: UInt, pcbneeded: MutPtr): Bool

public expect fun getPrinterW(hprinter: PrinterHandle, level: UInt, pprinter: MutPtr, cbbuf: UInt, pcbneeded: MutPtr): Bool

public expect fun getSpoolFileHandle(hprinter: PrinterHandle): Handle

public expect fun impersonatePrinterClient(htoken: Handle): Bool

public expect fun installPrinterDriverFromPackageA(pszserver: Pcstr, pszinfpath: Pcstr, pszdrivername: Pcstr, pszenvironment: Pcstr, dwflags: UInt): Hresult

public expect fun installPrinterDriverFromPackageW(pszserver: Pcwstr, pszinfpath: Pcwstr, pszdrivername: Pcwstr, pszenvironment: Pcwstr, dwflags: UInt): Hresult

public expect fun isValidDevmodeA(pdevmode: ConstPtr, devmodesize: ULong): Bool

public expect fun isValidDevmodeW(pdevmode: ConstPtr, devmodesize: ULong): Bool

public expect fun openPrinter2A(pprintername: Pcstr, phprinter: MutPtr, pdefault: ConstPtr, poptions: ConstPtr): Bool

public expect fun openPrinter2W(pprintername: Pcwstr, phprinter: MutPtr, pdefault: ConstPtr, poptions: ConstPtr): Bool

public expect fun openPrinterA(pprintername: Pcstr, phprinter: MutPtr, pdefault: ConstPtr): Bool

public expect fun openPrinterW(pprintername: Pcwstr, phprinter: MutPtr, pdefault: ConstPtr): Bool

public expect fun partialReplyPrinterChangeNotification(hprinter: PrinterHandle, pdatasrc: ConstPtr): Bool

public expect fun playGdiScriptOnPrinterIC(hprinteric: Handle, pin: ConstPtr, cin: UInt, pout: MutPtr, cout: UInt, ul: UInt): Bool

public expect fun printerMessageBoxA(hprinter: PrinterHandle, error: UInt, hwnd: Hwnd, ptext: Pcstr, pcaption: Pcstr, dwtype: UInt): UInt

public expect fun printerMessageBoxW(hprinter: PrinterHandle, error: UInt, hwnd: Hwnd, ptext: Pcwstr, pcaption: Pcwstr, dwtype: UInt): UInt

public expect fun printerProperties(hwnd: Hwnd, hprinter: PrinterHandle): Bool

public expect fun providorFindClosePrinterChangeNotification(hprinter: PrinterHandle): Bool

public expect fun providorFindFirstPrinterChangeNotification(hprinter: PrinterHandle, fdwflags: UInt, fdwoptions: UInt, hnotify: Handle, pprinternotifyoptions: ConstPtr, pvreserved1: MutPtr): Bool

public expect fun readPrinter(hprinter: PrinterHandle, pbuf: MutPtr, cbbuf: UInt, pnobytesread: MutPtr): Bool

public expect fun registerForPrintAsyncNotifications(pszname: Pcwstr, pnotificationtype: ConstPtr, euserfilter: PrintAsyncNotifyUserFilter, econversationstyle: PrintAsyncNotifyConversationStyle, pcallback: MutPtr, phnotify: MutPtr): Hresult

public expect fun removePrintDeviceObject(hdeviceobject: Handle): Hresult

public expect fun replyPrinterChangeNotification(hprinter: PrinterHandle, fdwchangeflags: UInt, pdwresult: MutPtr, pprinternotifyinfo: ConstPtr): Bool

public expect fun replyPrinterChangeNotificationEx(hnotify: Handle, dwcolor: UInt, fdwflags: UInt, pdwresult: MutPtr, pprinternotifyinfo: ConstPtr): Bool

public expect fun reportJobProcessingProgress(printerhandle: Handle, jobid: UInt, joboperation: EPrintXPSJobOperation, jobprogress: EPrintXPSJobProgress): Hresult

public expect fun resetPrinterA(hprinter: PrinterHandle, pdefault: ConstPtr): Bool

public expect fun resetPrinterW(hprinter: PrinterHandle, pdefault: ConstPtr): Bool

public expect fun revertToPrinterSelf(): Handle

public expect fun routerAllocBidiMem(numbytes: ULong): MutPtr

public expect fun routerAllocBidiResponseContainer(count: UInt): MutPtr

public expect fun routerAllocPrinterNotifyInfo(cprinternotifyinfodata: UInt): MutPtr

public expect fun routerFreeBidiMem(pmempointer: ConstPtr)

public expect fun routerFreeBidiResponseContainer(pdata: ConstPtr): UInt

public expect fun routerFreePrinterNotifyInfo(pinfo: ConstPtr): Bool

public expect fun scheduleJob(hprinter: PrinterHandle, jobid: UInt): Bool

public expect fun setCPSUIUserData(hdlg: Hwnd, cpsuiuserdata: ULong): Bool

public expect fun setDefaultPrinterA(pszprinter: Pcstr): Bool

public expect fun setDefaultPrinterW(pszprinter: Pcwstr): Bool

public expect fun setFormA(hprinter: PrinterHandle, pformname: Pcstr, level: UInt, pform: ConstPtr): Bool

public expect fun setFormW(hprinter: PrinterHandle, pformname: Pcwstr, level: UInt, pform: ConstPtr): Bool

public expect fun setJobA(hprinter: PrinterHandle, jobid: UInt, level: UInt, pjob: ConstPtr, command: UInt): Bool

public expect fun setJobNamedProperty(hprinter: PrinterHandle, jobid: UInt, pproperty: ConstPtr): UInt

public expect fun setJobW(hprinter: PrinterHandle, jobid: UInt, level: UInt, pjob: ConstPtr, command: UInt): Bool

public expect fun setPortA(pname: Pcstr, pportname: Pcstr, dwlevel: UInt, pportinfo: ConstPtr): Bool

public expect fun setPortW(pname: Pcwstr, pportname: Pcwstr, dwlevel: UInt, pportinfo: ConstPtr): Bool

public expect fun setPrinterA(hprinter: PrinterHandle, level: UInt, pprinter: ConstPtr, command: UInt): Bool

public expect fun setPrinterDataA(hprinter: PrinterHandle, pvaluename: Pcstr, type: UInt, pdata: ConstPtr, cbdata: UInt): UInt

public expect fun setPrinterDataExA(hprinter: PrinterHandle, pkeyname: Pcstr, pvaluename: Pcstr, type: UInt, pdata: ConstPtr, cbdata: UInt): UInt

public expect fun setPrinterDataExW(hprinter: PrinterHandle, pkeyname: Pcwstr, pvaluename: Pcwstr, type: UInt, pdata: ConstPtr, cbdata: UInt): UInt

public expect fun setPrinterDataW(hprinter: PrinterHandle, pvaluename: Pcwstr, type: UInt, pdata: ConstPtr, cbdata: UInt): UInt

public expect fun setPrinterW(hprinter: PrinterHandle, level: UInt, pprinter: ConstPtr, command: UInt): Bool

public expect fun splIsSessionZero(hprinter: PrinterHandle, jobid: UInt, pissessionzero: MutPtr): UInt

public expect fun splPromptUIInUsersSession(hprinter: PrinterHandle, jobid: UInt, puiparams: ConstPtr, presponse: MutPtr): Bool

public expect fun spoolerCopyFileEvent(pszprintername: Pcwstr, pszkey: Pcwstr, dwcopyfileevent: UInt): Bool

public expect fun spoolerFindClosePrinterChangeNotification(hprinter: PrinterHandle): Bool

public expect fun spoolerFindFirstPrinterChangeNotification(hprinter: PrinterHandle, fdwfilterflags: UInt, fdwoptions: UInt, pprinternotifyoptions: ConstPtr, pvreserved: ConstPtr, pnotificationconfig: ConstPtr, phnotify: MutPtr, phevent: MutPtr): Bool

public expect fun spoolerFindNextPrinterChangeNotification(hprinter: PrinterHandle, pfdwchange: MutPtr, pprinternotifyoptions: ConstPtr, ppprinternotifyinfo: MutPtr): Bool

public expect fun spoolerFreePrinterNotifyInfo(pinfo: ConstPtr)

public expect fun spoolerRefreshPrinterChangeNotification(hprinter: PrinterHandle, dwcolor: UInt, poptions: ConstPtr, ppinfo: MutPtr): Bool

public expect fun startDocPrinterA(hprinter: PrinterHandle, level: UInt, pdocinfo: ConstPtr): UInt

public expect fun startDocPrinterW(hprinter: PrinterHandle, level: UInt, pdocinfo: ConstPtr): UInt

public expect fun startPagePrinter(hprinter: PrinterHandle): Bool

public expect fun unRegisterForPrintAsyncNotifications(param0: Handle): Hresult

public expect fun updatePrintDeviceObject(hprinter: PrinterHandle, hdeviceobject: Handle): Hresult

public expect fun uploadPrinterDriverPackageA(pszserver: Pcstr, pszinfpath: Pcstr, pszenvironment: Pcstr, dwflags: UInt, hwnd: Hwnd, pszdestinfpath: Pstr, pcchdestinfpath: MutPtr): Hresult

public expect fun uploadPrinterDriverPackageW(pszserver: Pcwstr, pszinfpath: Pcwstr, pszenvironment: Pcwstr, dwflags: UInt, hwnd: Hwnd, pszdestinfpath: Pwstr, pcchdestinfpath: MutPtr): Hresult

public expect fun waitForPrinterChange(hprinter: PrinterHandle, flags: UInt): UInt

public expect fun writePrinter(hprinter: PrinterHandle, pbuf: ConstPtr, cbbuf: UInt, pcwritten: MutPtr): Bool

public expect fun xcvDataW(hxcv: Handle, pszdataname: Pcwstr, pinputdata: ConstPtr, cbinputdata: UInt, poutputdata: MutPtr, cboutputdata: UInt, pcboutputneeded: MutPtr, pdwstatus: MutPtr): Bool
