@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

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

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun abortPrinter(hprinter: PrinterHandle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingAbortPrinter")

public actual fun addFormA(hprinter: PrinterHandle, level: UInt, pform: ConstPtr<UByte>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingAddFormA")

public actual fun addFormW(hprinter: PrinterHandle, level: UInt, pform: ConstPtr<UByte>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingAddFormW")

public actual fun addJobA(hprinter: PrinterHandle, level: UInt, pdata: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingAddJobA")

public actual fun addJobW(hprinter: PrinterHandle, level: UInt, pdata: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingAddJobW")

public actual fun addMonitorA(pname: Pcstr, level: UInt, pmonitors: ConstPtr<UByte>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingAddMonitorA")

public actual fun addMonitorW(pname: Pcwstr, level: UInt, pmonitors: ConstPtr<UByte>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingAddMonitorW")

public actual fun addPortA(pname: Pcstr, hwnd: Hwnd, pmonitorname: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingAddPortA")

public actual fun addPortW(pname: Pcwstr, hwnd: Hwnd, pmonitorname: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingAddPortW")

public actual fun addPrintDeviceObject(hprinter: PrinterHandle, phdeviceobject: MutPtr<Handle>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingAddPrintDeviceObject")

public actual fun addPrintProcessorA(pname: Pcstr, penvironment: Pcstr, ppathname: Pcstr, pprintprocessorname: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingAddPrintProcessorA")

public actual fun addPrintProcessorW(pname: Pcwstr, penvironment: Pcwstr, ppathname: Pcwstr, pprintprocessorname: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingAddPrintProcessorW")

public actual fun addPrintProvidorA(pname: Pcstr, level: UInt, pprovidorinfo: ConstPtr<UByte>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingAddPrintProvidorA")

public actual fun addPrintProvidorW(pname: Pcwstr, level: UInt, pprovidorinfo: ConstPtr<UByte>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingAddPrintProvidorW")

public actual fun addPrinterA(pname: Pcstr, level: UInt, pprinter: ConstPtr<UByte>): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingAddPrinterA")

public actual fun addPrinterConnection2A(hwnd: Hwnd, pszname: Pcstr, dwlevel: UInt, pconnectioninfo: ConstPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingAddPrinterConnection2A")

public actual fun addPrinterConnection2W(hwnd: Hwnd, pszname: Pcwstr, dwlevel: UInt, pconnectioninfo: ConstPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingAddPrinterConnection2W")

public actual fun addPrinterConnectionA(pname: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingAddPrinterConnectionA")

public actual fun addPrinterConnectionW(pname: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingAddPrinterConnectionW")

public actual fun addPrinterDriverA(pname: Pcstr, level: UInt, pdriverinfo: ConstPtr<UByte>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingAddPrinterDriverA")

public actual fun addPrinterDriverExA(pname: Pcstr, level: UInt, lpbdriverinfo: ConstPtr<UByte>, dwfilecopyflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingAddPrinterDriverExA")

public actual fun addPrinterDriverExW(pname: Pcwstr, level: UInt, lpbdriverinfo: ConstPtr<UByte>, dwfilecopyflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingAddPrinterDriverExW")

public actual fun addPrinterDriverW(pname: Pcwstr, level: UInt, pdriverinfo: ConstPtr<UByte>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingAddPrinterDriverW")

public actual fun addPrinterW(pname: Pcwstr, level: UInt, pprinter: ConstPtr<UByte>): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingAddPrinterW")

public actual fun advancedDocumentPropertiesA(hwnd: Hwnd, hprinter: PrinterHandle, pdevicename: Pcstr, pdevmodeoutput: MutPtr<Devmodea>, pdevmodeinput: ConstPtr<Devmodea>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingAdvancedDocumentPropertiesA")

public actual fun advancedDocumentPropertiesW(hwnd: Hwnd, hprinter: PrinterHandle, pdevicename: Pcwstr, pdevmodeoutput: MutPtr<Devmodew>, pdevmodeinput: ConstPtr<Devmodew>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingAdvancedDocumentPropertiesW")

public actual fun appendPrinterNotifyInfoData(pinfodest: ConstPtr<PrinterNotifyInfo>, pdatasrc: ConstPtr<PrinterNotifyInfoData>, fdwflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingAppendPrinterNotifyInfoData")

public actual fun callRouterFindFirstPrinterChangeNotification(hprinterrpc: Handle, fdwfilterflags: UInt, fdwoptions: UInt, hnotify: Handle, pprinternotifyoptions: ConstPtr<PrinterNotifyOptions>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingCallRouterFindFirstPrinterChangeNotification")

public actual fun closePrinter(hprinter: PrinterHandle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingClosePrinter")

public actual fun closeSpoolFileHandle(hprinter: PrinterHandle, hspoolfile: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingCloseSpoolFileHandle")

public actual fun commitSpoolData(hprinter: PrinterHandle, hspoolfile: Handle, cbcommit: UInt): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingCommitSpoolData")

public actual fun commonPropertySheetUIA(hwndowner: Hwnd, pfnpropsheetui: Pfnpropsheetui, lparam: Lparam, presult: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingCommonPropertySheetUIA")

public actual fun commonPropertySheetUIW(hwndowner: Hwnd, pfnpropsheetui: Pfnpropsheetui, lparam: Lparam, presult: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingCommonPropertySheetUIW")

public actual fun configurePortA(pname: Pcstr, hwnd: Hwnd, pportname: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingConfigurePortA")

public actual fun configurePortW(pname: Pcwstr, hwnd: Hwnd, pportname: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingConfigurePortW")

public actual fun connectToPrinterDlg(hwnd: Hwnd, flags: UInt): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingConnectToPrinterDlg")

public actual fun corePrinterDriverInstalledA(pszserver: Pcstr, pszenvironment: Pcstr, coredriverguid: Guid, ftdriverdate: Filetime, dwldriverversion: ULong, pbdriverinstalled: MutPtr<Bool>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingCorePrinterDriverInstalledA")

public actual fun corePrinterDriverInstalledW(pszserver: Pcwstr, pszenvironment: Pcwstr, coredriverguid: Guid, ftdriverdate: Filetime, dwldriverversion: ULong, pbdriverinstalled: MutPtr<Bool>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingCorePrinterDriverInstalledW")

public actual fun createPrintAsyncNotifyChannel(pszname: Pcwstr, pnotificationtype: ConstPtr<Guid>, euserfilter: PrintAsyncNotifyUserFilter, econversationstyle: PrintAsyncNotifyConversationStyle, pcallback: MutPtr<CVoid>, ppiasynchnotification: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingCreatePrintAsyncNotifyChannel")

public actual fun createPrinterIC(hprinter: PrinterHandle, pdevmode: ConstPtr<Devmodew>): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingCreatePrinterIC")

public actual fun deleteFormA(hprinter: PrinterHandle, pformname: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingDeleteFormA")

public actual fun deleteFormW(hprinter: PrinterHandle, pformname: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingDeleteFormW")

public actual fun deleteJobNamedProperty(hprinter: PrinterHandle, jobid: UInt, pszname: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingDeleteJobNamedProperty")

public actual fun deleteMonitorA(pname: Pcstr, penvironment: Pcstr, pmonitorname: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingDeleteMonitorA")

public actual fun deleteMonitorW(pname: Pcwstr, penvironment: Pcwstr, pmonitorname: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingDeleteMonitorW")

public actual fun deletePortA(pname: Pcstr, hwnd: Hwnd, pportname: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingDeletePortA")

public actual fun deletePortW(pname: Pcwstr, hwnd: Hwnd, pportname: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingDeletePortW")

public actual fun deletePrintProcessorA(pname: Pcstr, penvironment: Pcstr, pprintprocessorname: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingDeletePrintProcessorA")

public actual fun deletePrintProcessorW(pname: Pcwstr, penvironment: Pcwstr, pprintprocessorname: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingDeletePrintProcessorW")

public actual fun deletePrintProvidorA(pname: Pcstr, penvironment: Pcstr, pprintprovidorname: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingDeletePrintProvidorA")

public actual fun deletePrintProvidorW(pname: Pcwstr, penvironment: Pcwstr, pprintprovidorname: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingDeletePrintProvidorW")

public actual fun deletePrinter(hprinter: PrinterHandle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingDeletePrinter")

public actual fun deletePrinterConnectionA(pname: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingDeletePrinterConnectionA")

public actual fun deletePrinterConnectionW(pname: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingDeletePrinterConnectionW")

public actual fun deletePrinterDataA(hprinter: PrinterHandle, pvaluename: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingDeletePrinterDataA")

public actual fun deletePrinterDataExA(hprinter: PrinterHandle, pkeyname: Pcstr, pvaluename: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingDeletePrinterDataExA")

public actual fun deletePrinterDataExW(hprinter: PrinterHandle, pkeyname: Pcwstr, pvaluename: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingDeletePrinterDataExW")

public actual fun deletePrinterDataW(hprinter: PrinterHandle, pvaluename: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingDeletePrinterDataW")

public actual fun deletePrinterDriverA(pname: Pcstr, penvironment: Pcstr, pdrivername: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingDeletePrinterDriverA")

public actual fun deletePrinterDriverExA(pname: Pcstr, penvironment: Pcstr, pdrivername: Pcstr, dwdeleteflag: UInt, dwversionflag: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingDeletePrinterDriverExA")

public actual fun deletePrinterDriverExW(pname: Pcwstr, penvironment: Pcwstr, pdrivername: Pcwstr, dwdeleteflag: UInt, dwversionflag: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingDeletePrinterDriverExW")

public actual fun deletePrinterDriverPackageA(pszserver: Pcstr, pszinfpath: Pcstr, pszenvironment: Pcstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingDeletePrinterDriverPackageA")

public actual fun deletePrinterDriverPackageW(pszserver: Pcwstr, pszinfpath: Pcwstr, pszenvironment: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingDeletePrinterDriverPackageW")

public actual fun deletePrinterDriverW(pname: Pcwstr, penvironment: Pcwstr, pdrivername: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingDeletePrinterDriverW")

public actual fun deletePrinterIC(hprinteric: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingDeletePrinterIC")

public actual fun deletePrinterKeyA(hprinter: PrinterHandle, pkeyname: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingDeletePrinterKeyA")

public actual fun deletePrinterKeyW(hprinter: PrinterHandle, pkeyname: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingDeletePrinterKeyW")

public actual fun devQueryPrint(hprinter: PrinterHandle, pdevmode: ConstPtr<Devmodea>, presid: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingDevQueryPrint")

public actual fun devQueryPrintEx(pdqpinfo: MutPtr<DevqueryprintInfo>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingDevQueryPrintEx")

public actual fun documentPropertiesA(hwnd: Hwnd, hprinter: PrinterHandle, pdevicename: Pcstr, pdevmodeoutput: MutPtr<Devmodea>, pdevmodeinput: ConstPtr<Devmodea>, fmode: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingDocumentPropertiesA")

public actual fun documentPropertiesW(hwnd: Hwnd, hprinter: PrinterHandle, pdevicename: Pcwstr, pdevmodeoutput: MutPtr<Devmodew>, pdevmodeinput: ConstPtr<Devmodew>, fmode: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingDocumentPropertiesW")

public actual fun endDocPrinter(hprinter: PrinterHandle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingEndDocPrinter")

public actual fun endPagePrinter(hprinter: PrinterHandle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingEndPagePrinter")

public actual fun enumFormsA(hprinter: PrinterHandle, level: UInt, pform: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>, pcreturned: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingEnumFormsA")

public actual fun enumFormsW(hprinter: PrinterHandle, level: UInt, pform: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>, pcreturned: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingEnumFormsW")

public actual fun enumJobNamedProperties(hprinter: PrinterHandle, jobid: UInt, pcproperties: MutPtr<UInt>, ppproperties: MutPtr<MutPtr<PrintNamedProperty>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingEnumJobNamedProperties")

public actual fun enumJobsA(hprinter: PrinterHandle, firstjob: UInt, nojobs: UInt, level: UInt, pjob: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>, pcreturned: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingEnumJobsA")

public actual fun enumJobsW(hprinter: PrinterHandle, firstjob: UInt, nojobs: UInt, level: UInt, pjob: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>, pcreturned: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingEnumJobsW")

public actual fun enumMonitorsA(pname: Pcstr, level: UInt, pmonitor: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>, pcreturned: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingEnumMonitorsA")

public actual fun enumMonitorsW(pname: Pcwstr, level: UInt, pmonitor: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>, pcreturned: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingEnumMonitorsW")

public actual fun enumPortsA(pname: Pcstr, level: UInt, pport: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>, pcreturned: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingEnumPortsA")

public actual fun enumPortsW(pname: Pcwstr, level: UInt, pport: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>, pcreturned: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingEnumPortsW")

public actual fun enumPrintProcessorDatatypesA(pname: Pcstr, pprintprocessorname: Pcstr, level: UInt, pdatatypes: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>, pcreturned: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingEnumPrintProcessorDatatypesA")

public actual fun enumPrintProcessorDatatypesW(pname: Pcwstr, pprintprocessorname: Pcwstr, level: UInt, pdatatypes: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>, pcreturned: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingEnumPrintProcessorDatatypesW")

public actual fun enumPrintProcessorsA(pname: Pcstr, penvironment: Pcstr, level: UInt, pprintprocessorinfo: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>, pcreturned: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingEnumPrintProcessorsA")

public actual fun enumPrintProcessorsW(pname: Pcwstr, penvironment: Pcwstr, level: UInt, pprintprocessorinfo: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>, pcreturned: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingEnumPrintProcessorsW")

public actual fun enumPrinterDataA(hprinter: PrinterHandle, dwindex: UInt, pvaluename: Pstr, cbvaluename: UInt, pcbvaluename: MutPtr<UInt>, ptype: MutPtr<UInt>, pdata: MutPtr<UByte>, cbdata: UInt, pcbdata: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingEnumPrinterDataA")

public actual fun enumPrinterDataExA(hprinter: PrinterHandle, pkeyname: Pcstr, penumvalues: MutPtr<UByte>, cbenumvalues: UInt, pcbenumvalues: MutPtr<UInt>, pnenumvalues: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingEnumPrinterDataExA")

public actual fun enumPrinterDataExW(hprinter: PrinterHandle, pkeyname: Pcwstr, penumvalues: MutPtr<UByte>, cbenumvalues: UInt, pcbenumvalues: MutPtr<UInt>, pnenumvalues: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingEnumPrinterDataExW")

public actual fun enumPrinterDataW(hprinter: PrinterHandle, dwindex: UInt, pvaluename: Pwstr, cbvaluename: UInt, pcbvaluename: MutPtr<UInt>, ptype: MutPtr<UInt>, pdata: MutPtr<UByte>, cbdata: UInt, pcbdata: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingEnumPrinterDataW")

public actual fun enumPrinterDriversA(pname: Pcstr, penvironment: Pcstr, level: UInt, pdriverinfo: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>, pcreturned: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingEnumPrinterDriversA")

public actual fun enumPrinterDriversW(pname: Pcwstr, penvironment: Pcwstr, level: UInt, pdriverinfo: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>, pcreturned: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingEnumPrinterDriversW")

public actual fun enumPrinterKeyA(hprinter: PrinterHandle, pkeyname: Pcstr, psubkey: Pstr, cbsubkey: UInt, pcbsubkey: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingEnumPrinterKeyA")

public actual fun enumPrinterKeyW(hprinter: PrinterHandle, pkeyname: Pcwstr, psubkey: Pwstr, cbsubkey: UInt, pcbsubkey: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingEnumPrinterKeyW")

public actual fun enumPrintersA(flags: UInt, name: Pcstr, level: UInt, pprinterenum: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>, pcreturned: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingEnumPrintersA")

public actual fun enumPrintersW(flags: UInt, name: Pcwstr, level: UInt, pprinterenum: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>, pcreturned: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingEnumPrintersW")

public actual fun extDeviceMode(hwnd: Hwnd, hinst: Handle, pdevmodeoutput: MutPtr<Devmodea>, pdevicename: Pcstr, pport: Pcstr, pdevmodeinput: ConstPtr<Devmodea>, pprofile: Pcstr, fmode: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingExtDeviceMode")

public actual fun findClosePrinterChangeNotification(hchange: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingFindClosePrinterChangeNotification")

public actual fun findFirstPrinterChangeNotification(hprinter: PrinterHandle, fdwfilter: UInt, fdwoptions: UInt, pprinternotifyoptions: ConstPtr<CVoid>): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingFindFirstPrinterChangeNotification")

public actual fun findNextPrinterChangeNotification(hchange: Handle, pdwchange: MutPtr<UInt>, pvreserved: ConstPtr<CVoid>, ppprinternotifyinfo: MutPtr<MutPtr<CVoid>>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingFindNextPrinterChangeNotification")

public actual fun flushPrinter(hprinter: PrinterHandle, pbuf: ConstPtr<CVoid>, cbbuf: UInt, pcwritten: MutPtr<UInt>, csleep: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingFlushPrinter")

public actual fun freePrintNamedPropertyArray(cproperties: UInt, ppproperties: MutPtr<MutPtr<PrintNamedProperty>>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingFreePrintNamedPropertyArray")

public actual fun freePrintPropertyValue(pvalue: MutPtr<PrintPropertyValue>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingFreePrintPropertyValue")

public actual fun freePrinterNotifyInfo(pprinternotifyinfo: ConstPtr<PrinterNotifyInfo>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingFreePrinterNotifyInfo")

public actual fun gdiDeleteSpoolFileHandle(spoolfilehandle: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingGdiDeleteSpoolFileHandle")

public actual fun gdiEndDocEMF(spoolfilehandle: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingGdiEndDocEMF")

public actual fun gdiEndPageEMF(spoolfilehandle: Handle, dwoptimization: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingGdiEndPageEMF")

public actual fun gdiGetDC(spoolfilehandle: Handle): Hdc =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingGdiGetDC")

public actual fun gdiGetDevmodeForPage(spoolfilehandle: Handle, dwpagenumber: UInt, pcurrdm: MutPtr<MutPtr<Devmodew>>, plastdm: MutPtr<MutPtr<Devmodew>>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingGdiGetDevmodeForPage")

public actual fun gdiGetPageCount(spoolfilehandle: Handle): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingGdiGetPageCount")

public actual fun gdiGetPageHandle(spoolfilehandle: Handle, page: UInt, pdwpagetype: MutPtr<UInt>): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingGdiGetPageHandle")

public actual fun gdiGetSpoolFileHandle(pwszprintername: Pcwstr, pdevmode: MutPtr<Devmodew>, pwszdocname: Pcwstr): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingGdiGetSpoolFileHandle")

public actual fun gdiPlayPageEMF(spoolfilehandle: Handle, hemf: Handle, prectdocument: MutPtr<Rect>, prectborder: MutPtr<Rect>, prectclip: MutPtr<Rect>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingGdiPlayPageEMF")

public actual fun gdiResetDCEMF(spoolfilehandle: Handle, pcurrdm: MutPtr<Devmodew>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingGdiResetDCEMF")

public actual fun gdiStartDocEMF(spoolfilehandle: Handle, pdocinfo: MutPtr<Docinfow>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingGdiStartDocEMF")

public actual fun gdiStartPageEMF(spoolfilehandle: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingGdiStartPageEMF")

public actual fun generateCopyFilePaths(pszprintername: Pcwstr, pszdirectory: Pcwstr, psplclientinfo: ConstPtr<UByte>, dwlevel: UInt, pszsourcedir: Pwstr, pcchsourcedirsize: MutPtr<UInt>, psztargetdir: Pwstr, pcchtargetdirsize: MutPtr<UInt>, dwflags: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingGenerateCopyFilePaths")

public actual fun getCPSUIUserData(hdlg: Hwnd): ULong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingGetCPSUIUserData")

public actual fun getCorePrinterDriversA(pszserver: Pcstr, pszenvironment: Pcstr, pszzcoredriverdependencies: Pcstr, ccoreprinterdrivers: UInt, pcoreprinterdrivers: MutPtr<CorePrinterDrivera>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingGetCorePrinterDriversA")

public actual fun getCorePrinterDriversW(pszserver: Pcwstr, pszenvironment: Pcwstr, pszzcoredriverdependencies: Pcwstr, ccoreprinterdrivers: UInt, pcoreprinterdrivers: MutPtr<CorePrinterDriverw>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingGetCorePrinterDriversW")

public actual fun getDefaultPrinterA(pszbuffer: Pstr, pcchbuffer: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingGetDefaultPrinterA")

public actual fun getDefaultPrinterW(pszbuffer: Pwstr, pcchbuffer: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingGetDefaultPrinterW")

public actual fun getFormA(hprinter: PrinterHandle, pformname: Pcstr, level: UInt, pform: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingGetFormA")

public actual fun getFormW(hprinter: PrinterHandle, pformname: Pcwstr, level: UInt, pform: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingGetFormW")

public actual fun getJobA(hprinter: PrinterHandle, jobid: UInt, level: UInt, pjob: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingGetJobA")

public actual fun getJobAttributes(pprintername: Pcwstr, pdevmode: ConstPtr<Devmodew>, pattributeinfo: MutPtr<AttributeInfo3>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingGetJobAttributes")

public actual fun getJobAttributesEx(pprintername: Pcwstr, pdevmode: ConstPtr<Devmodew>, dwlevel: UInt, pattributeinfo: MutPtr<UByte>, nsize: UInt, dwflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingGetJobAttributesEx")

public actual fun getJobNamedPropertyValue(hprinter: PrinterHandle, jobid: UInt, pszname: Pcwstr, pvalue: MutPtr<PrintPropertyValue>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingGetJobNamedPropertyValue")

public actual fun getJobW(hprinter: PrinterHandle, jobid: UInt, level: UInt, pjob: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingGetJobW")

public actual fun getPrintExecutionData(pdata: MutPtr<PrintExecutionData>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingGetPrintExecutionData")

public actual fun getPrintOutputInfo(hwnd: Hwnd, pszprinter: Pcwstr, phfile: MutPtr<Handle>, ppszoutputfile: MutPtr<Pwstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingGetPrintOutputInfo")

public actual fun getPrintProcessorDirectoryA(pname: Pcstr, penvironment: Pcstr, level: UInt, pprintprocessorinfo: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingGetPrintProcessorDirectoryA")

public actual fun getPrintProcessorDirectoryW(pname: Pcwstr, penvironment: Pcwstr, level: UInt, pprintprocessorinfo: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingGetPrintProcessorDirectoryW")

public actual fun getPrinterA(hprinter: PrinterHandle, level: UInt, pprinter: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingGetPrinterA")

public actual fun getPrinterDataA(hprinter: PrinterHandle, pvaluename: Pcstr, ptype: MutPtr<UInt>, pdata: MutPtr<UByte>, nsize: UInt, pcbneeded: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingGetPrinterDataA")

public actual fun getPrinterDataExA(hprinter: PrinterHandle, pkeyname: Pcstr, pvaluename: Pcstr, ptype: MutPtr<UInt>, pdata: MutPtr<UByte>, nsize: UInt, pcbneeded: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingGetPrinterDataExA")

public actual fun getPrinterDataExW(hprinter: PrinterHandle, pkeyname: Pcwstr, pvaluename: Pcwstr, ptype: MutPtr<UInt>, pdata: MutPtr<UByte>, nsize: UInt, pcbneeded: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingGetPrinterDataExW")

public actual fun getPrinterDataW(hprinter: PrinterHandle, pvaluename: Pcwstr, ptype: MutPtr<UInt>, pdata: MutPtr<UByte>, nsize: UInt, pcbneeded: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingGetPrinterDataW")

public actual fun getPrinterDriver2A(hwnd: Hwnd, hprinter: PrinterHandle, penvironment: Pcstr, level: UInt, pdriverinfo: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingGetPrinterDriver2A")

public actual fun getPrinterDriver2W(hwnd: Hwnd, hprinter: PrinterHandle, penvironment: Pcwstr, level: UInt, pdriverinfo: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingGetPrinterDriver2W")

public actual fun getPrinterDriverA(hprinter: PrinterHandle, penvironment: Pcstr, level: UInt, pdriverinfo: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingGetPrinterDriverA")

public actual fun getPrinterDriverDirectoryA(pname: Pcstr, penvironment: Pcstr, level: UInt, pdriverdirectory: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingGetPrinterDriverDirectoryA")

public actual fun getPrinterDriverDirectoryW(pname: Pcwstr, penvironment: Pcwstr, level: UInt, pdriverdirectory: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingGetPrinterDriverDirectoryW")

public actual fun getPrinterDriverPackagePathA(pszserver: Pcstr, pszenvironment: Pcstr, pszlanguage: Pcstr, pszpackageid: Pcstr, pszdriverpackagecab: Pstr, cchdriverpackagecab: UInt, pcchrequiredsize: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingGetPrinterDriverPackagePathA")

public actual fun getPrinterDriverPackagePathW(pszserver: Pcwstr, pszenvironment: Pcwstr, pszlanguage: Pcwstr, pszpackageid: Pcwstr, pszdriverpackagecab: Pwstr, cchdriverpackagecab: UInt, pcchrequiredsize: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingGetPrinterDriverPackagePathW")

public actual fun getPrinterDriverW(hprinter: PrinterHandle, penvironment: Pcwstr, level: UInt, pdriverinfo: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingGetPrinterDriverW")

public actual fun getPrinterW(hprinter: PrinterHandle, level: UInt, pprinter: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingGetPrinterW")

public actual fun getSpoolFileHandle(hprinter: PrinterHandle): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingGetSpoolFileHandle")

public actual fun impersonatePrinterClient(htoken: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingImpersonatePrinterClient")

public actual fun installPrinterDriverFromPackageA(pszserver: Pcstr, pszinfpath: Pcstr, pszdrivername: Pcstr, pszenvironment: Pcstr, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingInstallPrinterDriverFromPackageA")

public actual fun installPrinterDriverFromPackageW(pszserver: Pcwstr, pszinfpath: Pcwstr, pszdrivername: Pcwstr, pszenvironment: Pcwstr, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingInstallPrinterDriverFromPackageW")

public actual fun isValidDevmodeA(pdevmode: ConstPtr<Devmodea>, devmodesize: ULong): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingIsValidDevmodeA")

public actual fun isValidDevmodeW(pdevmode: ConstPtr<Devmodew>, devmodesize: ULong): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingIsValidDevmodeW")

public actual fun openPrinter2A(pprintername: Pcstr, phprinter: MutPtr<PrinterHandle>, pdefault: ConstPtr<PrinterDefaultsa>, poptions: ConstPtr<PrinterOptionsa>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingOpenPrinter2A")

public actual fun openPrinter2W(pprintername: Pcwstr, phprinter: MutPtr<PrinterHandle>, pdefault: ConstPtr<PrinterDefaultsw>, poptions: ConstPtr<PrinterOptionsw>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingOpenPrinter2W")

public actual fun openPrinterA(pprintername: Pcstr, phprinter: MutPtr<PrinterHandle>, pdefault: ConstPtr<PrinterDefaultsa>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingOpenPrinterA")

public actual fun openPrinterW(pprintername: Pcwstr, phprinter: MutPtr<PrinterHandle>, pdefault: ConstPtr<PrinterDefaultsw>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingOpenPrinterW")

public actual fun partialReplyPrinterChangeNotification(hprinter: PrinterHandle, pdatasrc: ConstPtr<PrinterNotifyInfoData>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingPartialReplyPrinterChangeNotification")

public actual fun playGdiScriptOnPrinterIC(hprinteric: Handle, pin: ConstPtr<UByte>, cin: UInt, pout: MutPtr<UByte>, cout: UInt, ul: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingPlayGdiScriptOnPrinterIC")

public actual fun printerMessageBoxA(hprinter: PrinterHandle, error: UInt, hwnd: Hwnd, ptext: Pcstr, pcaption: Pcstr, dwtype: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingPrinterMessageBoxA")

public actual fun printerMessageBoxW(hprinter: PrinterHandle, error: UInt, hwnd: Hwnd, ptext: Pcwstr, pcaption: Pcwstr, dwtype: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingPrinterMessageBoxW")

public actual fun printerProperties(hwnd: Hwnd, hprinter: PrinterHandle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingPrinterProperties")

public actual fun providorFindClosePrinterChangeNotification(hprinter: PrinterHandle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingProvidorFindClosePrinterChangeNotification")

public actual fun providorFindFirstPrinterChangeNotification(hprinter: PrinterHandle, fdwflags: UInt, fdwoptions: UInt, hnotify: Handle, pprinternotifyoptions: ConstPtr<CVoid>, pvreserved1: MutPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingProvidorFindFirstPrinterChangeNotification")

public actual fun readPrinter(hprinter: PrinterHandle, pbuf: MutPtr<CVoid>, cbbuf: UInt, pnobytesread: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingReadPrinter")

public actual fun registerForPrintAsyncNotifications(pszname: Pcwstr, pnotificationtype: ConstPtr<Guid>, euserfilter: PrintAsyncNotifyUserFilter, econversationstyle: PrintAsyncNotifyConversationStyle, pcallback: MutPtr<CVoid>, phnotify: MutPtr<Handle>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingRegisterForPrintAsyncNotifications")

public actual fun removePrintDeviceObject(hdeviceobject: Handle): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingRemovePrintDeviceObject")

public actual fun replyPrinterChangeNotification(hprinter: PrinterHandle, fdwchangeflags: UInt, pdwresult: MutPtr<UInt>, pprinternotifyinfo: ConstPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingReplyPrinterChangeNotification")

public actual fun replyPrinterChangeNotificationEx(hnotify: Handle, dwcolor: UInt, fdwflags: UInt, pdwresult: MutPtr<UInt>, pprinternotifyinfo: ConstPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingReplyPrinterChangeNotificationEx")

public actual fun reportJobProcessingProgress(printerhandle: Handle, jobid: UInt, joboperation: EPrintXPSJobOperation, jobprogress: EPrintXPSJobProgress): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingReportJobProcessingProgress")

public actual fun resetPrinterA(hprinter: PrinterHandle, pdefault: ConstPtr<PrinterDefaultsa>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingResetPrinterA")

public actual fun resetPrinterW(hprinter: PrinterHandle, pdefault: ConstPtr<PrinterDefaultsw>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingResetPrinterW")

public actual fun revertToPrinterSelf(): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingRevertToPrinterSelf")

public actual fun routerAllocBidiMem(numbytes: ULong): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingRouterAllocBidiMem")

public actual fun routerAllocBidiResponseContainer(count: UInt): MutPtr<BidiResponseContainer> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingRouterAllocBidiResponseContainer")

public actual fun routerAllocPrinterNotifyInfo(cprinternotifyinfodata: UInt): MutPtr<PrinterNotifyInfo> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingRouterAllocPrinterNotifyInfo")

public actual fun routerFreeBidiMem(pmempointer: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingRouterFreeBidiMem")

public actual fun routerFreeBidiResponseContainer(pdata: ConstPtr<BidiResponseContainer>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingRouterFreeBidiResponseContainer")

public actual fun routerFreePrinterNotifyInfo(pinfo: ConstPtr<PrinterNotifyInfo>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingRouterFreePrinterNotifyInfo")

public actual fun scheduleJob(hprinter: PrinterHandle, jobid: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingScheduleJob")

public actual fun setCPSUIUserData(hdlg: Hwnd, cpsuiuserdata: ULong): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingSetCPSUIUserData")

public actual fun setDefaultPrinterA(pszprinter: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingSetDefaultPrinterA")

public actual fun setDefaultPrinterW(pszprinter: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingSetDefaultPrinterW")

public actual fun setFormA(hprinter: PrinterHandle, pformname: Pcstr, level: UInt, pform: ConstPtr<UByte>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingSetFormA")

public actual fun setFormW(hprinter: PrinterHandle, pformname: Pcwstr, level: UInt, pform: ConstPtr<UByte>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingSetFormW")

public actual fun setJobA(hprinter: PrinterHandle, jobid: UInt, level: UInt, pjob: ConstPtr<UByte>, command: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingSetJobA")

public actual fun setJobNamedProperty(hprinter: PrinterHandle, jobid: UInt, pproperty: ConstPtr<PrintNamedProperty>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingSetJobNamedProperty")

public actual fun setJobW(hprinter: PrinterHandle, jobid: UInt, level: UInt, pjob: ConstPtr<UByte>, command: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingSetJobW")

public actual fun setPortA(pname: Pcstr, pportname: Pcstr, dwlevel: UInt, pportinfo: ConstPtr<UByte>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingSetPortA")

public actual fun setPortW(pname: Pcwstr, pportname: Pcwstr, dwlevel: UInt, pportinfo: ConstPtr<UByte>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingSetPortW")

public actual fun setPrinterA(hprinter: PrinterHandle, level: UInt, pprinter: ConstPtr<UByte>, command: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingSetPrinterA")

public actual fun setPrinterDataA(hprinter: PrinterHandle, pvaluename: Pcstr, type: UInt, pdata: ConstPtr<UByte>, cbdata: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingSetPrinterDataA")

public actual fun setPrinterDataExA(hprinter: PrinterHandle, pkeyname: Pcstr, pvaluename: Pcstr, type: UInt, pdata: ConstPtr<UByte>, cbdata: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingSetPrinterDataExA")

public actual fun setPrinterDataExW(hprinter: PrinterHandle, pkeyname: Pcwstr, pvaluename: Pcwstr, type: UInt, pdata: ConstPtr<UByte>, cbdata: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingSetPrinterDataExW")

public actual fun setPrinterDataW(hprinter: PrinterHandle, pvaluename: Pcwstr, type: UInt, pdata: ConstPtr<UByte>, cbdata: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingSetPrinterDataW")

public actual fun setPrinterW(hprinter: PrinterHandle, level: UInt, pprinter: ConstPtr<UByte>, command: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingSetPrinterW")

public actual fun splIsSessionZero(hprinter: PrinterHandle, jobid: UInt, pissessionzero: MutPtr<Bool>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingSplIsSessionZero")

public actual fun splPromptUIInUsersSession(hprinter: PrinterHandle, jobid: UInt, puiparams: ConstPtr<Showuiparams>, presponse: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingSplPromptUIInUsersSession")

public actual fun spoolerCopyFileEvent(pszprintername: Pcwstr, pszkey: Pcwstr, dwcopyfileevent: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingSpoolerCopyFileEvent")

public actual fun spoolerFindClosePrinterChangeNotification(hprinter: PrinterHandle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingSpoolerFindClosePrinterChangeNotification")

public actual fun spoolerFindFirstPrinterChangeNotification(hprinter: PrinterHandle, fdwfilterflags: UInt, fdwoptions: UInt, pprinternotifyoptions: ConstPtr<CVoid>, pvreserved: ConstPtr<CVoid>, pnotificationconfig: ConstPtr<CVoid>, phnotify: MutPtr<Handle>, phevent: MutPtr<Handle>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingSpoolerFindFirstPrinterChangeNotification")

public actual fun spoolerFindNextPrinterChangeNotification(hprinter: PrinterHandle, pfdwchange: MutPtr<UInt>, pprinternotifyoptions: ConstPtr<CVoid>, ppprinternotifyinfo: MutPtr<MutPtr<CVoid>>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingSpoolerFindNextPrinterChangeNotification")

public actual fun spoolerFreePrinterNotifyInfo(pinfo: ConstPtr<PrinterNotifyInfo>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingSpoolerFreePrinterNotifyInfo")

public actual fun spoolerRefreshPrinterChangeNotification(hprinter: PrinterHandle, dwcolor: UInt, poptions: ConstPtr<PrinterNotifyOptions>, ppinfo: MutPtr<MutPtr<PrinterNotifyInfo>>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingSpoolerRefreshPrinterChangeNotification")

public actual fun startDocPrinterA(hprinter: PrinterHandle, level: UInt, pdocinfo: ConstPtr<DocInfo1a>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingStartDocPrinterA")

public actual fun startDocPrinterW(hprinter: PrinterHandle, level: UInt, pdocinfo: ConstPtr<DocInfo1w>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingStartDocPrinterW")

public actual fun startPagePrinter(hprinter: PrinterHandle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingStartPagePrinter")

public actual fun unRegisterForPrintAsyncNotifications(param0: Handle): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingUnRegisterForPrintAsyncNotifications")

public actual fun updatePrintDeviceObject(hprinter: PrinterHandle, hdeviceobject: Handle): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingUpdatePrintDeviceObject")

public actual fun uploadPrinterDriverPackageA(pszserver: Pcstr, pszinfpath: Pcstr, pszenvironment: Pcstr, dwflags: UInt, hwnd: Hwnd, pszdestinfpath: Pstr, pcchdestinfpath: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingUploadPrinterDriverPackageA")

public actual fun uploadPrinterDriverPackageW(pszserver: Pcwstr, pszinfpath: Pcwstr, pszenvironment: Pcwstr, dwflags: UInt, hwnd: Hwnd, pszdestinfpath: Pwstr, pcchdestinfpath: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingUploadPrinterDriverPackageW")

public actual fun waitForPrinterChange(hprinter: PrinterHandle, flags: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingWaitForPrinterChange")

public actual fun writePrinter(hprinter: PrinterHandle, pbuf: ConstPtr<CVoid>, cbbuf: UInt, pcwritten: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingWritePrinter")

public actual fun xcvDataW(hxcv: Handle, pszdataname: Pcwstr, pinputdata: ConstPtr<UByte>, cbinputdata: UInt, poutputdata: MutPtr<UByte>, cboutputdata: UInt, pcboutputneeded: MutPtr<UInt>, pdwstatus: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingXcvDataW")
