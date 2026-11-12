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

public expect fun abortPrinter(hprinter: PrinterHandle): Bool

public expect fun addFormA(hprinter: PrinterHandle, level: UInt, pform: ConstPtr<UByte>): Bool

public expect fun addFormW(hprinter: PrinterHandle, level: UInt, pform: ConstPtr<UByte>): Bool

public expect fun addJobA(hprinter: PrinterHandle, level: UInt, pdata: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>): Bool

public expect fun addJobW(hprinter: PrinterHandle, level: UInt, pdata: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>): Bool

public expect fun addMonitorA(pname: Pcstr, level: UInt, pmonitors: ConstPtr<UByte>): Bool

public expect fun addMonitorW(pname: Pcwstr, level: UInt, pmonitors: ConstPtr<UByte>): Bool

public expect fun addPortA(pname: Pcstr, hwnd: Hwnd, pmonitorname: Pcstr): Bool

public expect fun addPortW(pname: Pcwstr, hwnd: Hwnd, pmonitorname: Pcwstr): Bool

public expect fun addPrintDeviceObject(hprinter: PrinterHandle, phdeviceobject: MutPtr<Handle>): Hresult

public expect fun addPrintProcessorA(pname: Pcstr, penvironment: Pcstr, ppathname: Pcstr, pprintprocessorname: Pcstr): Bool

public expect fun addPrintProcessorW(pname: Pcwstr, penvironment: Pcwstr, ppathname: Pcwstr, pprintprocessorname: Pcwstr): Bool

public expect fun addPrintProvidorA(pname: Pcstr, level: UInt, pprovidorinfo: ConstPtr<UByte>): Bool

public expect fun addPrintProvidorW(pname: Pcwstr, level: UInt, pprovidorinfo: ConstPtr<UByte>): Bool

public expect fun addPrinterA(pname: Pcstr, level: UInt, pprinter: ConstPtr<UByte>): Handle

public expect fun addPrinterConnection2A(hwnd: Hwnd, pszname: Pcstr, dwlevel: UInt, pconnectioninfo: ConstPtr<CVoid>): Bool

public expect fun addPrinterConnection2W(hwnd: Hwnd, pszname: Pcwstr, dwlevel: UInt, pconnectioninfo: ConstPtr<CVoid>): Bool

public expect fun addPrinterConnectionA(pname: Pcstr): Bool

public expect fun addPrinterConnectionW(pname: Pcwstr): Bool

public expect fun addPrinterDriverA(pname: Pcstr, level: UInt, pdriverinfo: ConstPtr<UByte>): Bool

public expect fun addPrinterDriverExA(pname: Pcstr, level: UInt, lpbdriverinfo: ConstPtr<UByte>, dwfilecopyflags: UInt): Bool

public expect fun addPrinterDriverExW(pname: Pcwstr, level: UInt, lpbdriverinfo: ConstPtr<UByte>, dwfilecopyflags: UInt): Bool

public expect fun addPrinterDriverW(pname: Pcwstr, level: UInt, pdriverinfo: ConstPtr<UByte>): Bool

public expect fun addPrinterW(pname: Pcwstr, level: UInt, pprinter: ConstPtr<UByte>): Handle

public expect fun advancedDocumentPropertiesA(hwnd: Hwnd, hprinter: PrinterHandle, pdevicename: Pcstr, pdevmodeoutput: MutPtr<Devmodea>, pdevmodeinput: ConstPtr<Devmodea>): Int

public expect fun advancedDocumentPropertiesW(hwnd: Hwnd, hprinter: PrinterHandle, pdevicename: Pcwstr, pdevmodeoutput: MutPtr<Devmodew>, pdevmodeinput: ConstPtr<Devmodew>): Int

public expect fun appendPrinterNotifyInfoData(pinfodest: ConstPtr<PrinterNotifyInfo>, pdatasrc: ConstPtr<PrinterNotifyInfoData>, fdwflags: UInt): Bool

public expect fun callRouterFindFirstPrinterChangeNotification(hprinterrpc: Handle, fdwfilterflags: UInt, fdwoptions: UInt, hnotify: Handle, pprinternotifyoptions: ConstPtr<PrinterNotifyOptions>): UInt

public expect fun closePrinter(hprinter: PrinterHandle): Bool

public expect fun closeSpoolFileHandle(hprinter: PrinterHandle, hspoolfile: Handle): Bool

public expect fun commitSpoolData(hprinter: PrinterHandle, hspoolfile: Handle, cbcommit: UInt): Handle

public expect fun commonPropertySheetUIA(hwndowner: Hwnd, pfnpropsheetui: Pfnpropsheetui, lparam: Lparam, presult: MutPtr<UInt>): Int

public expect fun commonPropertySheetUIW(hwndowner: Hwnd, pfnpropsheetui: Pfnpropsheetui, lparam: Lparam, presult: MutPtr<UInt>): Int

public expect fun configurePortA(pname: Pcstr, hwnd: Hwnd, pportname: Pcstr): Bool

public expect fun configurePortW(pname: Pcwstr, hwnd: Hwnd, pportname: Pcwstr): Bool

public expect fun connectToPrinterDlg(hwnd: Hwnd, flags: UInt): Handle

public expect fun corePrinterDriverInstalledA(pszserver: Pcstr, pszenvironment: Pcstr, coredriverguid: Guid, ftdriverdate: Filetime, dwldriverversion: ULong, pbdriverinstalled: MutPtr<Bool>): Hresult

public expect fun corePrinterDriverInstalledW(pszserver: Pcwstr, pszenvironment: Pcwstr, coredriverguid: Guid, ftdriverdate: Filetime, dwldriverversion: ULong, pbdriverinstalled: MutPtr<Bool>): Hresult

public expect fun createPrintAsyncNotifyChannel(pszname: Pcwstr, pnotificationtype: ConstPtr<Guid>, euserfilter: PrintAsyncNotifyUserFilter, econversationstyle: PrintAsyncNotifyConversationStyle, pcallback: MutPtr<CVoid>, ppiasynchnotification: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun createPrinterIC(hprinter: PrinterHandle, pdevmode: ConstPtr<Devmodew>): Handle

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

public expect fun devQueryPrint(hprinter: PrinterHandle, pdevmode: ConstPtr<Devmodea>, presid: MutPtr<UInt>): Bool

public expect fun devQueryPrintEx(pdqpinfo: MutPtr<DevqueryprintInfo>): Bool

public expect fun documentPropertiesA(hwnd: Hwnd, hprinter: PrinterHandle, pdevicename: Pcstr, pdevmodeoutput: MutPtr<Devmodea>, pdevmodeinput: ConstPtr<Devmodea>, fmode: UInt): Int

public expect fun documentPropertiesW(hwnd: Hwnd, hprinter: PrinterHandle, pdevicename: Pcwstr, pdevmodeoutput: MutPtr<Devmodew>, pdevmodeinput: ConstPtr<Devmodew>, fmode: UInt): Int

public expect fun endDocPrinter(hprinter: PrinterHandle): Bool

public expect fun endPagePrinter(hprinter: PrinterHandle): Bool

public expect fun enumFormsA(hprinter: PrinterHandle, level: UInt, pform: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>, pcreturned: MutPtr<UInt>): Bool

public expect fun enumFormsW(hprinter: PrinterHandle, level: UInt, pform: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>, pcreturned: MutPtr<UInt>): Bool

public expect fun enumJobNamedProperties(hprinter: PrinterHandle, jobid: UInt, pcproperties: MutPtr<UInt>, ppproperties: MutPtr<MutPtr<PrintNamedProperty>>): UInt

public expect fun enumJobsA(hprinter: PrinterHandle, firstjob: UInt, nojobs: UInt, level: UInt, pjob: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>, pcreturned: MutPtr<UInt>): Bool

public expect fun enumJobsW(hprinter: PrinterHandle, firstjob: UInt, nojobs: UInt, level: UInt, pjob: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>, pcreturned: MutPtr<UInt>): Bool

public expect fun enumMonitorsA(pname: Pcstr, level: UInt, pmonitor: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>, pcreturned: MutPtr<UInt>): Bool

public expect fun enumMonitorsW(pname: Pcwstr, level: UInt, pmonitor: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>, pcreturned: MutPtr<UInt>): Bool

public expect fun enumPortsA(pname: Pcstr, level: UInt, pport: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>, pcreturned: MutPtr<UInt>): Bool

public expect fun enumPortsW(pname: Pcwstr, level: UInt, pport: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>, pcreturned: MutPtr<UInt>): Bool

public expect fun enumPrintProcessorDatatypesA(pname: Pcstr, pprintprocessorname: Pcstr, level: UInt, pdatatypes: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>, pcreturned: MutPtr<UInt>): Bool

public expect fun enumPrintProcessorDatatypesW(pname: Pcwstr, pprintprocessorname: Pcwstr, level: UInt, pdatatypes: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>, pcreturned: MutPtr<UInt>): Bool

public expect fun enumPrintProcessorsA(pname: Pcstr, penvironment: Pcstr, level: UInt, pprintprocessorinfo: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>, pcreturned: MutPtr<UInt>): Bool

public expect fun enumPrintProcessorsW(pname: Pcwstr, penvironment: Pcwstr, level: UInt, pprintprocessorinfo: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>, pcreturned: MutPtr<UInt>): Bool

public expect fun enumPrinterDataA(hprinter: PrinterHandle, dwindex: UInt, pvaluename: Pstr, cbvaluename: UInt, pcbvaluename: MutPtr<UInt>, ptype: MutPtr<UInt>, pdata: MutPtr<UByte>, cbdata: UInt, pcbdata: MutPtr<UInt>): UInt

public expect fun enumPrinterDataExA(hprinter: PrinterHandle, pkeyname: Pcstr, penumvalues: MutPtr<UByte>, cbenumvalues: UInt, pcbenumvalues: MutPtr<UInt>, pnenumvalues: MutPtr<UInt>): UInt

public expect fun enumPrinterDataExW(hprinter: PrinterHandle, pkeyname: Pcwstr, penumvalues: MutPtr<UByte>, cbenumvalues: UInt, pcbenumvalues: MutPtr<UInt>, pnenumvalues: MutPtr<UInt>): UInt

public expect fun enumPrinterDataW(hprinter: PrinterHandle, dwindex: UInt, pvaluename: Pwstr, cbvaluename: UInt, pcbvaluename: MutPtr<UInt>, ptype: MutPtr<UInt>, pdata: MutPtr<UByte>, cbdata: UInt, pcbdata: MutPtr<UInt>): UInt

public expect fun enumPrinterDriversA(pname: Pcstr, penvironment: Pcstr, level: UInt, pdriverinfo: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>, pcreturned: MutPtr<UInt>): Bool

public expect fun enumPrinterDriversW(pname: Pcwstr, penvironment: Pcwstr, level: UInt, pdriverinfo: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>, pcreturned: MutPtr<UInt>): Bool

public expect fun enumPrinterKeyA(hprinter: PrinterHandle, pkeyname: Pcstr, psubkey: Pstr, cbsubkey: UInt, pcbsubkey: MutPtr<UInt>): UInt

public expect fun enumPrinterKeyW(hprinter: PrinterHandle, pkeyname: Pcwstr, psubkey: Pwstr, cbsubkey: UInt, pcbsubkey: MutPtr<UInt>): UInt

public expect fun enumPrintersA(flags: UInt, name: Pcstr, level: UInt, pprinterenum: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>, pcreturned: MutPtr<UInt>): Bool

public expect fun enumPrintersW(flags: UInt, name: Pcwstr, level: UInt, pprinterenum: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>, pcreturned: MutPtr<UInt>): Bool

public expect fun extDeviceMode(hwnd: Hwnd, hinst: Handle, pdevmodeoutput: MutPtr<Devmodea>, pdevicename: Pcstr, pport: Pcstr, pdevmodeinput: ConstPtr<Devmodea>, pprofile: Pcstr, fmode: UInt): Int

public expect fun findClosePrinterChangeNotification(hchange: Handle): Bool

public expect fun findFirstPrinterChangeNotification(hprinter: PrinterHandle, fdwfilter: UInt, fdwoptions: UInt, pprinternotifyoptions: ConstPtr<CVoid>): Handle

public expect fun findNextPrinterChangeNotification(hchange: Handle, pdwchange: MutPtr<UInt>, pvreserved: ConstPtr<CVoid>, ppprinternotifyinfo: MutPtr<MutPtr<CVoid>>): Bool

public expect fun flushPrinter(hprinter: PrinterHandle, pbuf: ConstPtr<CVoid>, cbbuf: UInt, pcwritten: MutPtr<UInt>, csleep: UInt): Bool

public expect fun freePrintNamedPropertyArray(cproperties: UInt, ppproperties: MutPtr<MutPtr<PrintNamedProperty>>)

public expect fun freePrintPropertyValue(pvalue: MutPtr<PrintPropertyValue>)

public expect fun freePrinterNotifyInfo(pprinternotifyinfo: ConstPtr<PrinterNotifyInfo>): Bool

public expect fun gdiDeleteSpoolFileHandle(spoolfilehandle: Handle): Bool

public expect fun gdiEndDocEMF(spoolfilehandle: Handle): Bool

public expect fun gdiEndPageEMF(spoolfilehandle: Handle, dwoptimization: UInt): Bool

public expect fun gdiGetDC(spoolfilehandle: Handle): Hdc

public expect fun gdiGetDevmodeForPage(spoolfilehandle: Handle, dwpagenumber: UInt, pcurrdm: MutPtr<MutPtr<Devmodew>>, plastdm: MutPtr<MutPtr<Devmodew>>): Bool

public expect fun gdiGetPageCount(spoolfilehandle: Handle): UInt

public expect fun gdiGetPageHandle(spoolfilehandle: Handle, page: UInt, pdwpagetype: MutPtr<UInt>): Handle

public expect fun gdiGetSpoolFileHandle(pwszprintername: Pcwstr, pdevmode: MutPtr<Devmodew>, pwszdocname: Pcwstr): Handle

public expect fun gdiPlayPageEMF(spoolfilehandle: Handle, hemf: Handle, prectdocument: MutPtr<Rect>, prectborder: MutPtr<Rect>, prectclip: MutPtr<Rect>): Bool

public expect fun gdiResetDCEMF(spoolfilehandle: Handle, pcurrdm: MutPtr<Devmodew>): Bool

public expect fun gdiStartDocEMF(spoolfilehandle: Handle, pdocinfo: MutPtr<Docinfow>): Bool

public expect fun gdiStartPageEMF(spoolfilehandle: Handle): Bool

public expect fun generateCopyFilePaths(pszprintername: Pcwstr, pszdirectory: Pcwstr, psplclientinfo: ConstPtr<UByte>, dwlevel: UInt, pszsourcedir: Pwstr, pcchsourcedirsize: MutPtr<UInt>, psztargetdir: Pwstr, pcchtargetdirsize: MutPtr<UInt>, dwflags: UInt): UInt

public expect fun getCPSUIUserData(hdlg: Hwnd): ULong

public expect fun getCorePrinterDriversA(pszserver: Pcstr, pszenvironment: Pcstr, pszzcoredriverdependencies: Pcstr, ccoreprinterdrivers: UInt, pcoreprinterdrivers: MutPtr<CorePrinterDrivera>): Hresult

public expect fun getCorePrinterDriversW(pszserver: Pcwstr, pszenvironment: Pcwstr, pszzcoredriverdependencies: Pcwstr, ccoreprinterdrivers: UInt, pcoreprinterdrivers: MutPtr<CorePrinterDriverw>): Hresult

public expect fun getDefaultPrinterA(pszbuffer: Pstr, pcchbuffer: MutPtr<UInt>): Bool

public expect fun getDefaultPrinterW(pszbuffer: Pwstr, pcchbuffer: MutPtr<UInt>): Bool

public expect fun getFormA(hprinter: PrinterHandle, pformname: Pcstr, level: UInt, pform: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>): Bool

public expect fun getFormW(hprinter: PrinterHandle, pformname: Pcwstr, level: UInt, pform: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>): Bool

public expect fun getJobA(hprinter: PrinterHandle, jobid: UInt, level: UInt, pjob: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>): Bool

public expect fun getJobAttributes(pprintername: Pcwstr, pdevmode: ConstPtr<Devmodew>, pattributeinfo: MutPtr<AttributeInfo3>): Bool

public expect fun getJobAttributesEx(pprintername: Pcwstr, pdevmode: ConstPtr<Devmodew>, dwlevel: UInt, pattributeinfo: MutPtr<UByte>, nsize: UInt, dwflags: UInt): Bool

public expect fun getJobNamedPropertyValue(hprinter: PrinterHandle, jobid: UInt, pszname: Pcwstr, pvalue: MutPtr<PrintPropertyValue>): UInt

public expect fun getJobW(hprinter: PrinterHandle, jobid: UInt, level: UInt, pjob: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>): Bool

public expect fun getPrintExecutionData(pdata: MutPtr<PrintExecutionData>): Bool

public expect fun getPrintOutputInfo(hwnd: Hwnd, pszprinter: Pcwstr, phfile: MutPtr<Handle>, ppszoutputfile: MutPtr<Pwstr>): Hresult

public expect fun getPrintProcessorDirectoryA(pname: Pcstr, penvironment: Pcstr, level: UInt, pprintprocessorinfo: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>): Bool

public expect fun getPrintProcessorDirectoryW(pname: Pcwstr, penvironment: Pcwstr, level: UInt, pprintprocessorinfo: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>): Bool

public expect fun getPrinterA(hprinter: PrinterHandle, level: UInt, pprinter: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>): Bool

public expect fun getPrinterDataA(hprinter: PrinterHandle, pvaluename: Pcstr, ptype: MutPtr<UInt>, pdata: MutPtr<UByte>, nsize: UInt, pcbneeded: MutPtr<UInt>): UInt

public expect fun getPrinterDataExA(hprinter: PrinterHandle, pkeyname: Pcstr, pvaluename: Pcstr, ptype: MutPtr<UInt>, pdata: MutPtr<UByte>, nsize: UInt, pcbneeded: MutPtr<UInt>): UInt

public expect fun getPrinterDataExW(hprinter: PrinterHandle, pkeyname: Pcwstr, pvaluename: Pcwstr, ptype: MutPtr<UInt>, pdata: MutPtr<UByte>, nsize: UInt, pcbneeded: MutPtr<UInt>): UInt

public expect fun getPrinterDataW(hprinter: PrinterHandle, pvaluename: Pcwstr, ptype: MutPtr<UInt>, pdata: MutPtr<UByte>, nsize: UInt, pcbneeded: MutPtr<UInt>): UInt

public expect fun getPrinterDriver2A(hwnd: Hwnd, hprinter: PrinterHandle, penvironment: Pcstr, level: UInt, pdriverinfo: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>): Bool

public expect fun getPrinterDriver2W(hwnd: Hwnd, hprinter: PrinterHandle, penvironment: Pcwstr, level: UInt, pdriverinfo: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>): Bool

public expect fun getPrinterDriverA(hprinter: PrinterHandle, penvironment: Pcstr, level: UInt, pdriverinfo: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>): Bool

public expect fun getPrinterDriverDirectoryA(pname: Pcstr, penvironment: Pcstr, level: UInt, pdriverdirectory: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>): Bool

public expect fun getPrinterDriverDirectoryW(pname: Pcwstr, penvironment: Pcwstr, level: UInt, pdriverdirectory: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>): Bool

public expect fun getPrinterDriverPackagePathA(pszserver: Pcstr, pszenvironment: Pcstr, pszlanguage: Pcstr, pszpackageid: Pcstr, pszdriverpackagecab: Pstr, cchdriverpackagecab: UInt, pcchrequiredsize: MutPtr<UInt>): Hresult

public expect fun getPrinterDriverPackagePathW(pszserver: Pcwstr, pszenvironment: Pcwstr, pszlanguage: Pcwstr, pszpackageid: Pcwstr, pszdriverpackagecab: Pwstr, cchdriverpackagecab: UInt, pcchrequiredsize: MutPtr<UInt>): Hresult

public expect fun getPrinterDriverW(hprinter: PrinterHandle, penvironment: Pcwstr, level: UInt, pdriverinfo: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>): Bool

public expect fun getPrinterW(hprinter: PrinterHandle, level: UInt, pprinter: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>): Bool

public expect fun getSpoolFileHandle(hprinter: PrinterHandle): Handle

public expect fun impersonatePrinterClient(htoken: Handle): Bool

public expect fun installPrinterDriverFromPackageA(pszserver: Pcstr, pszinfpath: Pcstr, pszdrivername: Pcstr, pszenvironment: Pcstr, dwflags: UInt): Hresult

public expect fun installPrinterDriverFromPackageW(pszserver: Pcwstr, pszinfpath: Pcwstr, pszdrivername: Pcwstr, pszenvironment: Pcwstr, dwflags: UInt): Hresult

public expect fun isValidDevmodeA(pdevmode: ConstPtr<Devmodea>, devmodesize: ULong): Bool

public expect fun isValidDevmodeW(pdevmode: ConstPtr<Devmodew>, devmodesize: ULong): Bool

public expect fun openPrinter2A(pprintername: Pcstr, phprinter: MutPtr<PrinterHandle>, pdefault: ConstPtr<PrinterDefaultsa>, poptions: ConstPtr<PrinterOptionsa>): Bool

public expect fun openPrinter2W(pprintername: Pcwstr, phprinter: MutPtr<PrinterHandle>, pdefault: ConstPtr<PrinterDefaultsw>, poptions: ConstPtr<PrinterOptionsw>): Bool

public expect fun openPrinterA(pprintername: Pcstr, phprinter: MutPtr<PrinterHandle>, pdefault: ConstPtr<PrinterDefaultsa>): Bool

public expect fun openPrinterW(pprintername: Pcwstr, phprinter: MutPtr<PrinterHandle>, pdefault: ConstPtr<PrinterDefaultsw>): Bool

public expect fun partialReplyPrinterChangeNotification(hprinter: PrinterHandle, pdatasrc: ConstPtr<PrinterNotifyInfoData>): Bool

public expect fun playGdiScriptOnPrinterIC(hprinteric: Handle, pin: ConstPtr<UByte>, cin: UInt, pout: MutPtr<UByte>, cout: UInt, ul: UInt): Bool

public expect fun printerMessageBoxA(hprinter: PrinterHandle, error: UInt, hwnd: Hwnd, ptext: Pcstr, pcaption: Pcstr, dwtype: UInt): UInt

public expect fun printerMessageBoxW(hprinter: PrinterHandle, error: UInt, hwnd: Hwnd, ptext: Pcwstr, pcaption: Pcwstr, dwtype: UInt): UInt

public expect fun printerProperties(hwnd: Hwnd, hprinter: PrinterHandle): Bool

public expect fun providorFindClosePrinterChangeNotification(hprinter: PrinterHandle): Bool

public expect fun providorFindFirstPrinterChangeNotification(hprinter: PrinterHandle, fdwflags: UInt, fdwoptions: UInt, hnotify: Handle, pprinternotifyoptions: ConstPtr<CVoid>, pvreserved1: MutPtr<CVoid>): Bool

public expect fun readPrinter(hprinter: PrinterHandle, pbuf: MutPtr<CVoid>, cbbuf: UInt, pnobytesread: MutPtr<UInt>): Bool

public expect fun registerForPrintAsyncNotifications(pszname: Pcwstr, pnotificationtype: ConstPtr<Guid>, euserfilter: PrintAsyncNotifyUserFilter, econversationstyle: PrintAsyncNotifyConversationStyle, pcallback: MutPtr<CVoid>, phnotify: MutPtr<Handle>): Hresult

public expect fun removePrintDeviceObject(hdeviceobject: Handle): Hresult

public expect fun replyPrinterChangeNotification(hprinter: PrinterHandle, fdwchangeflags: UInt, pdwresult: MutPtr<UInt>, pprinternotifyinfo: ConstPtr<CVoid>): Bool

public expect fun replyPrinterChangeNotificationEx(hnotify: Handle, dwcolor: UInt, fdwflags: UInt, pdwresult: MutPtr<UInt>, pprinternotifyinfo: ConstPtr<CVoid>): Bool

public expect fun reportJobProcessingProgress(printerhandle: Handle, jobid: UInt, joboperation: EPrintXPSJobOperation, jobprogress: EPrintXPSJobProgress): Hresult

public expect fun resetPrinterA(hprinter: PrinterHandle, pdefault: ConstPtr<PrinterDefaultsa>): Bool

public expect fun resetPrinterW(hprinter: PrinterHandle, pdefault: ConstPtr<PrinterDefaultsw>): Bool

public expect fun revertToPrinterSelf(): Handle

public expect fun routerAllocBidiMem(numbytes: ULong): MutPtr<CVoid>

public expect fun routerAllocBidiResponseContainer(count: UInt): MutPtr<BidiResponseContainer>

public expect fun routerAllocPrinterNotifyInfo(cprinternotifyinfodata: UInt): MutPtr<PrinterNotifyInfo>

public expect fun routerFreeBidiMem(pmempointer: ConstPtr<CVoid>)

public expect fun routerFreeBidiResponseContainer(pdata: ConstPtr<BidiResponseContainer>): UInt

public expect fun routerFreePrinterNotifyInfo(pinfo: ConstPtr<PrinterNotifyInfo>): Bool

public expect fun scheduleJob(hprinter: PrinterHandle, jobid: UInt): Bool

public expect fun setCPSUIUserData(hdlg: Hwnd, cpsuiuserdata: ULong): Bool

public expect fun setDefaultPrinterA(pszprinter: Pcstr): Bool

public expect fun setDefaultPrinterW(pszprinter: Pcwstr): Bool

public expect fun setFormA(hprinter: PrinterHandle, pformname: Pcstr, level: UInt, pform: ConstPtr<UByte>): Bool

public expect fun setFormW(hprinter: PrinterHandle, pformname: Pcwstr, level: UInt, pform: ConstPtr<UByte>): Bool

public expect fun setJobA(hprinter: PrinterHandle, jobid: UInt, level: UInt, pjob: ConstPtr<UByte>, command: UInt): Bool

public expect fun setJobNamedProperty(hprinter: PrinterHandle, jobid: UInt, pproperty: ConstPtr<PrintNamedProperty>): UInt

public expect fun setJobW(hprinter: PrinterHandle, jobid: UInt, level: UInt, pjob: ConstPtr<UByte>, command: UInt): Bool

public expect fun setPortA(pname: Pcstr, pportname: Pcstr, dwlevel: UInt, pportinfo: ConstPtr<UByte>): Bool

public expect fun setPortW(pname: Pcwstr, pportname: Pcwstr, dwlevel: UInt, pportinfo: ConstPtr<UByte>): Bool

public expect fun setPrinterA(hprinter: PrinterHandle, level: UInt, pprinter: ConstPtr<UByte>, command: UInt): Bool

public expect fun setPrinterDataA(hprinter: PrinterHandle, pvaluename: Pcstr, type: UInt, pdata: ConstPtr<UByte>, cbdata: UInt): UInt

public expect fun setPrinterDataExA(hprinter: PrinterHandle, pkeyname: Pcstr, pvaluename: Pcstr, type: UInt, pdata: ConstPtr<UByte>, cbdata: UInt): UInt

public expect fun setPrinterDataExW(hprinter: PrinterHandle, pkeyname: Pcwstr, pvaluename: Pcwstr, type: UInt, pdata: ConstPtr<UByte>, cbdata: UInt): UInt

public expect fun setPrinterDataW(hprinter: PrinterHandle, pvaluename: Pcwstr, type: UInt, pdata: ConstPtr<UByte>, cbdata: UInt): UInt

public expect fun setPrinterW(hprinter: PrinterHandle, level: UInt, pprinter: ConstPtr<UByte>, command: UInt): Bool

public expect fun splIsSessionZero(hprinter: PrinterHandle, jobid: UInt, pissessionzero: MutPtr<Bool>): UInt

public expect fun splPromptUIInUsersSession(hprinter: PrinterHandle, jobid: UInt, puiparams: ConstPtr<Showuiparams>, presponse: MutPtr<UInt>): Bool

public expect fun spoolerCopyFileEvent(pszprintername: Pcwstr, pszkey: Pcwstr, dwcopyfileevent: UInt): Bool

public expect fun spoolerFindClosePrinterChangeNotification(hprinter: PrinterHandle): Bool

public expect fun spoolerFindFirstPrinterChangeNotification(hprinter: PrinterHandle, fdwfilterflags: UInt, fdwoptions: UInt, pprinternotifyoptions: ConstPtr<CVoid>, pvreserved: ConstPtr<CVoid>, pnotificationconfig: ConstPtr<CVoid>, phnotify: MutPtr<Handle>, phevent: MutPtr<Handle>): Bool

public expect fun spoolerFindNextPrinterChangeNotification(hprinter: PrinterHandle, pfdwchange: MutPtr<UInt>, pprinternotifyoptions: ConstPtr<CVoid>, ppprinternotifyinfo: MutPtr<MutPtr<CVoid>>): Bool

public expect fun spoolerFreePrinterNotifyInfo(pinfo: ConstPtr<PrinterNotifyInfo>)

public expect fun spoolerRefreshPrinterChangeNotification(hprinter: PrinterHandle, dwcolor: UInt, poptions: ConstPtr<PrinterNotifyOptions>, ppinfo: MutPtr<MutPtr<PrinterNotifyInfo>>): Bool

public expect fun startDocPrinterA(hprinter: PrinterHandle, level: UInt, pdocinfo: ConstPtr<DocInfo1a>): UInt

public expect fun startDocPrinterW(hprinter: PrinterHandle, level: UInt, pdocinfo: ConstPtr<DocInfo1w>): UInt

public expect fun startPagePrinter(hprinter: PrinterHandle): Bool

public expect fun unRegisterForPrintAsyncNotifications(param0: Handle): Hresult

public expect fun updatePrintDeviceObject(hprinter: PrinterHandle, hdeviceobject: Handle): Hresult

public expect fun uploadPrinterDriverPackageA(pszserver: Pcstr, pszinfpath: Pcstr, pszenvironment: Pcstr, dwflags: UInt, hwnd: Hwnd, pszdestinfpath: Pstr, pcchdestinfpath: MutPtr<UInt>): Hresult

public expect fun uploadPrinterDriverPackageW(pszserver: Pcwstr, pszinfpath: Pcwstr, pszenvironment: Pcwstr, dwflags: UInt, hwnd: Hwnd, pszdestinfpath: Pwstr, pcchdestinfpath: MutPtr<UInt>): Hresult

public expect fun waitForPrinterChange(hprinter: PrinterHandle, flags: UInt): UInt

public expect fun writePrinter(hprinter: PrinterHandle, pbuf: ConstPtr<CVoid>, cbbuf: UInt, pcwritten: MutPtr<UInt>): Bool

public expect fun xcvDataW(hxcv: Handle, pszdataname: Pcwstr, pinputdata: ConstPtr<UByte>, cbinputdata: UInt, poutputdata: MutPtr<UByte>, cboutputdata: UInt, pcboutputneeded: MutPtr<UInt>, pdwstatus: MutPtr<UInt>): Bool
