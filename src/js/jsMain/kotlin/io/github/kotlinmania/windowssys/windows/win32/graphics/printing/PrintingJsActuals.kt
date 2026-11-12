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

private val windowsWin32GraphicsPrintingNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun abortPrinter(hprinter: PrinterHandle): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addFormA(hprinter: PrinterHandle, level: UInt, pform: ConstPtr<UByte>): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addFormW(hprinter: PrinterHandle, level: UInt, pform: ConstPtr<UByte>): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addJobA(hprinter: PrinterHandle, level: UInt, pdata: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addJobW(hprinter: PrinterHandle, level: UInt, pdata: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addMonitorA(pname: Pcstr, level: UInt, pmonitors: ConstPtr<UByte>): Bool =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingAddMonitorA(pname.rawAddress.toString(), level.toInt(), pmonitors.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addMonitorW(pname: Pcwstr, level: UInt, pmonitors: ConstPtr<UByte>): Bool =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingAddMonitorW(pname.rawAddress.toString(), level.toInt(), pmonitors.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addPortA(pname: Pcstr, hwnd: Hwnd, pmonitorname: Pcstr): Bool =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingAddPortA(pname.rawAddress.toString(), hwnd.rawAddress.toString(), pmonitorname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addPortW(pname: Pcwstr, hwnd: Hwnd, pmonitorname: Pcwstr): Bool =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingAddPortW(pname.rawAddress.toString(), hwnd.rawAddress.toString(), pmonitorname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addPrintDeviceObject(hprinter: PrinterHandle, phdeviceobject: MutPtr<Handle>): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addPrintProcessorA(pname: Pcstr, penvironment: Pcstr, ppathname: Pcstr, pprintprocessorname: Pcstr): Bool =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingAddPrintProcessorA(pname.rawAddress.toString(), penvironment.rawAddress.toString(), ppathname.rawAddress.toString(), pprintprocessorname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addPrintProcessorW(pname: Pcwstr, penvironment: Pcwstr, ppathname: Pcwstr, pprintprocessorname: Pcwstr): Bool =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingAddPrintProcessorW(pname.rawAddress.toString(), penvironment.rawAddress.toString(), ppathname.rawAddress.toString(), pprintprocessorname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addPrintProvidorA(pname: Pcstr, level: UInt, pprovidorinfo: ConstPtr<UByte>): Bool =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingAddPrintProvidorA(pname.rawAddress.toString(), level.toInt(), pprovidorinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addPrintProvidorW(pname: Pcwstr, level: UInt, pprovidorinfo: ConstPtr<UByte>): Bool =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingAddPrintProvidorW(pname.rawAddress.toString(), level.toInt(), pprovidorinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addPrinterA(pname: Pcstr, level: UInt, pprinter: ConstPtr<UByte>): Handle =
    if (windowsWin32GraphicsPrintingNapiAddon != null) MutPtr((windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingAddPrinterA(pname.rawAddress.toString(), level.toInt(), pprinter.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addPrinterConnection2A(hwnd: Hwnd, pszname: Pcstr, dwlevel: UInt, pconnectioninfo: ConstPtr<CVoid>): Bool =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingAddPrinterConnection2A(hwnd.rawAddress.toString(), pszname.rawAddress.toString(), dwlevel.toInt(), pconnectioninfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addPrinterConnection2W(hwnd: Hwnd, pszname: Pcwstr, dwlevel: UInt, pconnectioninfo: ConstPtr<CVoid>): Bool =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingAddPrinterConnection2W(hwnd.rawAddress.toString(), pszname.rawAddress.toString(), dwlevel.toInt(), pconnectioninfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addPrinterConnectionA(pname: Pcstr): Bool =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingAddPrinterConnectionA(pname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addPrinterConnectionW(pname: Pcwstr): Bool =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingAddPrinterConnectionW(pname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addPrinterDriverA(pname: Pcstr, level: UInt, pdriverinfo: ConstPtr<UByte>): Bool =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingAddPrinterDriverA(pname.rawAddress.toString(), level.toInt(), pdriverinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addPrinterDriverExA(pname: Pcstr, level: UInt, lpbdriverinfo: ConstPtr<UByte>, dwfilecopyflags: UInt): Bool =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingAddPrinterDriverExA(pname.rawAddress.toString(), level.toInt(), lpbdriverinfo.rawAddress.toString(), dwfilecopyflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addPrinterDriverExW(pname: Pcwstr, level: UInt, lpbdriverinfo: ConstPtr<UByte>, dwfilecopyflags: UInt): Bool =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingAddPrinterDriverExW(pname.rawAddress.toString(), level.toInt(), lpbdriverinfo.rawAddress.toString(), dwfilecopyflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addPrinterDriverW(pname: Pcwstr, level: UInt, pdriverinfo: ConstPtr<UByte>): Bool =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingAddPrinterDriverW(pname.rawAddress.toString(), level.toInt(), pdriverinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addPrinterW(pname: Pcwstr, level: UInt, pprinter: ConstPtr<UByte>): Handle =
    if (windowsWin32GraphicsPrintingNapiAddon != null) MutPtr((windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingAddPrinterW(pname.rawAddress.toString(), level.toInt(), pprinter.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun advancedDocumentPropertiesA(hwnd: Hwnd, hprinter: PrinterHandle, pdevicename: Pcstr, pdevmodeoutput: MutPtr<Devmodea>, pdevmodeinput: ConstPtr<Devmodea>): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun advancedDocumentPropertiesW(hwnd: Hwnd, hprinter: PrinterHandle, pdevicename: Pcwstr, pdevmodeoutput: MutPtr<Devmodew>, pdevmodeinput: ConstPtr<Devmodew>): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun appendPrinterNotifyInfoData(pinfodest: ConstPtr<PrinterNotifyInfo>, pdatasrc: ConstPtr<PrinterNotifyInfoData>, fdwflags: UInt): Bool =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingAppendPrinterNotifyInfoData(pinfodest.rawAddress.toString(), pdatasrc.rawAddress.toString(), fdwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun callRouterFindFirstPrinterChangeNotification(hprinterrpc: Handle, fdwfilterflags: UInt, fdwoptions: UInt, hnotify: Handle, pprinternotifyoptions: ConstPtr<PrinterNotifyOptions>): UInt =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingCallRouterFindFirstPrinterChangeNotification(hprinterrpc.rawAddress.toString(), fdwfilterflags.toInt(), fdwoptions.toInt(), hnotify.rawAddress.toString(), pprinternotifyoptions.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closePrinter(hprinter: PrinterHandle): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeSpoolFileHandle(hprinter: PrinterHandle, hspoolfile: Handle): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun commitSpoolData(hprinter: PrinterHandle, hspoolfile: Handle, cbcommit: UInt): Handle =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun commonPropertySheetUIA(hwndowner: Hwnd, pfnpropsheetui: Pfnpropsheetui, lparam: Lparam, presult: MutPtr<UInt>): Int =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingCommonPropertySheetUIA(hwndowner.rawAddress.toString(), 0L.toString(), lparam.toString(), presult.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun commonPropertySheetUIW(hwndowner: Hwnd, pfnpropsheetui: Pfnpropsheetui, lparam: Lparam, presult: MutPtr<UInt>): Int =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingCommonPropertySheetUIW(hwndowner.rawAddress.toString(), 0L.toString(), lparam.toString(), presult.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun configurePortA(pname: Pcstr, hwnd: Hwnd, pportname: Pcstr): Bool =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingConfigurePortA(pname.rawAddress.toString(), hwnd.rawAddress.toString(), pportname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun configurePortW(pname: Pcwstr, hwnd: Hwnd, pportname: Pcwstr): Bool =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingConfigurePortW(pname.rawAddress.toString(), hwnd.rawAddress.toString(), pportname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun connectToPrinterDlg(hwnd: Hwnd, flags: UInt): Handle =
    if (windowsWin32GraphicsPrintingNapiAddon != null) MutPtr((windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingConnectToPrinterDlg(hwnd.rawAddress.toString(), flags.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun corePrinterDriverInstalledA(pszserver: Pcstr, pszenvironment: Pcstr, coredriverguid: Guid, ftdriverdate: Filetime, dwldriverversion: ULong, pbdriverinstalled: MutPtr<Bool>): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun corePrinterDriverInstalledW(pszserver: Pcwstr, pszenvironment: Pcwstr, coredriverguid: Guid, ftdriverdate: Filetime, dwldriverversion: ULong, pbdriverinstalled: MutPtr<Bool>): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createPrintAsyncNotifyChannel(pszname: Pcwstr, pnotificationtype: ConstPtr<Guid>, euserfilter: PrintAsyncNotifyUserFilter, econversationstyle: PrintAsyncNotifyConversationStyle, pcallback: MutPtr<CVoid>, ppiasynchnotification: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingCreatePrintAsyncNotifyChannel(pszname.rawAddress.toString(), pnotificationtype.rawAddress.toString(), euserfilter, econversationstyle, pcallback.rawAddress.toString(), ppiasynchnotification.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createPrinterIC(hprinter: PrinterHandle, pdevmode: ConstPtr<Devmodew>): Handle =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteFormA(hprinter: PrinterHandle, pformname: Pcstr): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteFormW(hprinter: PrinterHandle, pformname: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteJobNamedProperty(hprinter: PrinterHandle, jobid: UInt, pszname: Pcwstr): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteMonitorA(pname: Pcstr, penvironment: Pcstr, pmonitorname: Pcstr): Bool =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingDeleteMonitorA(pname.rawAddress.toString(), penvironment.rawAddress.toString(), pmonitorname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteMonitorW(pname: Pcwstr, penvironment: Pcwstr, pmonitorname: Pcwstr): Bool =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingDeleteMonitorW(pname.rawAddress.toString(), penvironment.rawAddress.toString(), pmonitorname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deletePortA(pname: Pcstr, hwnd: Hwnd, pportname: Pcstr): Bool =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingDeletePortA(pname.rawAddress.toString(), hwnd.rawAddress.toString(), pportname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deletePortW(pname: Pcwstr, hwnd: Hwnd, pportname: Pcwstr): Bool =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingDeletePortW(pname.rawAddress.toString(), hwnd.rawAddress.toString(), pportname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deletePrintProcessorA(pname: Pcstr, penvironment: Pcstr, pprintprocessorname: Pcstr): Bool =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingDeletePrintProcessorA(pname.rawAddress.toString(), penvironment.rawAddress.toString(), pprintprocessorname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deletePrintProcessorW(pname: Pcwstr, penvironment: Pcwstr, pprintprocessorname: Pcwstr): Bool =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingDeletePrintProcessorW(pname.rawAddress.toString(), penvironment.rawAddress.toString(), pprintprocessorname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deletePrintProvidorA(pname: Pcstr, penvironment: Pcstr, pprintprovidorname: Pcstr): Bool =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingDeletePrintProvidorA(pname.rawAddress.toString(), penvironment.rawAddress.toString(), pprintprovidorname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deletePrintProvidorW(pname: Pcwstr, penvironment: Pcwstr, pprintprovidorname: Pcwstr): Bool =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingDeletePrintProvidorW(pname.rawAddress.toString(), penvironment.rawAddress.toString(), pprintprovidorname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deletePrinter(hprinter: PrinterHandle): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deletePrinterConnectionA(pname: Pcstr): Bool =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingDeletePrinterConnectionA(pname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deletePrinterConnectionW(pname: Pcwstr): Bool =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingDeletePrinterConnectionW(pname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deletePrinterDataA(hprinter: PrinterHandle, pvaluename: Pcstr): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deletePrinterDataExA(hprinter: PrinterHandle, pkeyname: Pcstr, pvaluename: Pcstr): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deletePrinterDataExW(hprinter: PrinterHandle, pkeyname: Pcwstr, pvaluename: Pcwstr): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deletePrinterDataW(hprinter: PrinterHandle, pvaluename: Pcwstr): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deletePrinterDriverA(pname: Pcstr, penvironment: Pcstr, pdrivername: Pcstr): Bool =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingDeletePrinterDriverA(pname.rawAddress.toString(), penvironment.rawAddress.toString(), pdrivername.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deletePrinterDriverExA(pname: Pcstr, penvironment: Pcstr, pdrivername: Pcstr, dwdeleteflag: UInt, dwversionflag: UInt): Bool =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingDeletePrinterDriverExA(pname.rawAddress.toString(), penvironment.rawAddress.toString(), pdrivername.rawAddress.toString(), dwdeleteflag.toInt(), dwversionflag.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deletePrinterDriverExW(pname: Pcwstr, penvironment: Pcwstr, pdrivername: Pcwstr, dwdeleteflag: UInt, dwversionflag: UInt): Bool =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingDeletePrinterDriverExW(pname.rawAddress.toString(), penvironment.rawAddress.toString(), pdrivername.rawAddress.toString(), dwdeleteflag.toInt(), dwversionflag.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deletePrinterDriverPackageA(pszserver: Pcstr, pszinfpath: Pcstr, pszenvironment: Pcstr): Hresult =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingDeletePrinterDriverPackageA(pszserver.rawAddress.toString(), pszinfpath.rawAddress.toString(), pszenvironment.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deletePrinterDriverPackageW(pszserver: Pcwstr, pszinfpath: Pcwstr, pszenvironment: Pcwstr): Hresult =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingDeletePrinterDriverPackageW(pszserver.rawAddress.toString(), pszinfpath.rawAddress.toString(), pszenvironment.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deletePrinterDriverW(pname: Pcwstr, penvironment: Pcwstr, pdrivername: Pcwstr): Bool =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingDeletePrinterDriverW(pname.rawAddress.toString(), penvironment.rawAddress.toString(), pdrivername.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deletePrinterIC(hprinteric: Handle): Bool =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingDeletePrinterIC(hprinteric.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deletePrinterKeyA(hprinter: PrinterHandle, pkeyname: Pcstr): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deletePrinterKeyW(hprinter: PrinterHandle, pkeyname: Pcwstr): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun devQueryPrint(hprinter: PrinterHandle, pdevmode: ConstPtr<Devmodea>, presid: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun devQueryPrintEx(pdqpinfo: MutPtr<DevqueryprintInfo>): Bool =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingDevQueryPrintEx(pdqpinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun documentPropertiesA(hwnd: Hwnd, hprinter: PrinterHandle, pdevicename: Pcstr, pdevmodeoutput: MutPtr<Devmodea>, pdevmodeinput: ConstPtr<Devmodea>, fmode: UInt): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun documentPropertiesW(hwnd: Hwnd, hprinter: PrinterHandle, pdevicename: Pcwstr, pdevmodeoutput: MutPtr<Devmodew>, pdevmodeinput: ConstPtr<Devmodew>, fmode: UInt): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun endDocPrinter(hprinter: PrinterHandle): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun endPagePrinter(hprinter: PrinterHandle): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumFormsA(hprinter: PrinterHandle, level: UInt, pform: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>, pcreturned: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumFormsW(hprinter: PrinterHandle, level: UInt, pform: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>, pcreturned: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumJobNamedProperties(hprinter: PrinterHandle, jobid: UInt, pcproperties: MutPtr<UInt>, ppproperties: MutPtr<MutPtr<PrintNamedProperty>>): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumJobsA(hprinter: PrinterHandle, firstjob: UInt, nojobs: UInt, level: UInt, pjob: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>, pcreturned: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumJobsW(hprinter: PrinterHandle, firstjob: UInt, nojobs: UInt, level: UInt, pjob: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>, pcreturned: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumMonitorsA(pname: Pcstr, level: UInt, pmonitor: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>, pcreturned: MutPtr<UInt>): Bool =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingEnumMonitorsA(pname.rawAddress.toString(), level.toInt(), pmonitor.rawAddress.toString(), cbbuf.toInt(), pcbneeded.rawAddress.toString(), pcreturned.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumMonitorsW(pname: Pcwstr, level: UInt, pmonitor: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>, pcreturned: MutPtr<UInt>): Bool =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingEnumMonitorsW(pname.rawAddress.toString(), level.toInt(), pmonitor.rawAddress.toString(), cbbuf.toInt(), pcbneeded.rawAddress.toString(), pcreturned.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumPortsA(pname: Pcstr, level: UInt, pport: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>, pcreturned: MutPtr<UInt>): Bool =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingEnumPortsA(pname.rawAddress.toString(), level.toInt(), pport.rawAddress.toString(), cbbuf.toInt(), pcbneeded.rawAddress.toString(), pcreturned.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumPortsW(pname: Pcwstr, level: UInt, pport: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>, pcreturned: MutPtr<UInt>): Bool =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingEnumPortsW(pname.rawAddress.toString(), level.toInt(), pport.rawAddress.toString(), cbbuf.toInt(), pcbneeded.rawAddress.toString(), pcreturned.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumPrintProcessorDatatypesA(pname: Pcstr, pprintprocessorname: Pcstr, level: UInt, pdatatypes: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>, pcreturned: MutPtr<UInt>): Bool =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingEnumPrintProcessorDatatypesA(pname.rawAddress.toString(), pprintprocessorname.rawAddress.toString(), level.toInt(), pdatatypes.rawAddress.toString(), cbbuf.toInt(), pcbneeded.rawAddress.toString(), pcreturned.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumPrintProcessorDatatypesW(pname: Pcwstr, pprintprocessorname: Pcwstr, level: UInt, pdatatypes: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>, pcreturned: MutPtr<UInt>): Bool =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingEnumPrintProcessorDatatypesW(pname.rawAddress.toString(), pprintprocessorname.rawAddress.toString(), level.toInt(), pdatatypes.rawAddress.toString(), cbbuf.toInt(), pcbneeded.rawAddress.toString(), pcreturned.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumPrintProcessorsA(pname: Pcstr, penvironment: Pcstr, level: UInt, pprintprocessorinfo: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>, pcreturned: MutPtr<UInt>): Bool =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingEnumPrintProcessorsA(pname.rawAddress.toString(), penvironment.rawAddress.toString(), level.toInt(), pprintprocessorinfo.rawAddress.toString(), cbbuf.toInt(), pcbneeded.rawAddress.toString(), pcreturned.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumPrintProcessorsW(pname: Pcwstr, penvironment: Pcwstr, level: UInt, pprintprocessorinfo: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>, pcreturned: MutPtr<UInt>): Bool =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingEnumPrintProcessorsW(pname.rawAddress.toString(), penvironment.rawAddress.toString(), level.toInt(), pprintprocessorinfo.rawAddress.toString(), cbbuf.toInt(), pcbneeded.rawAddress.toString(), pcreturned.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumPrinterDataA(hprinter: PrinterHandle, dwindex: UInt, pvaluename: Pstr, cbvaluename: UInt, pcbvaluename: MutPtr<UInt>, ptype: MutPtr<UInt>, pdata: MutPtr<UByte>, cbdata: UInt, pcbdata: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumPrinterDataExA(hprinter: PrinterHandle, pkeyname: Pcstr, penumvalues: MutPtr<UByte>, cbenumvalues: UInt, pcbenumvalues: MutPtr<UInt>, pnenumvalues: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumPrinterDataExW(hprinter: PrinterHandle, pkeyname: Pcwstr, penumvalues: MutPtr<UByte>, cbenumvalues: UInt, pcbenumvalues: MutPtr<UInt>, pnenumvalues: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumPrinterDataW(hprinter: PrinterHandle, dwindex: UInt, pvaluename: Pwstr, cbvaluename: UInt, pcbvaluename: MutPtr<UInt>, ptype: MutPtr<UInt>, pdata: MutPtr<UByte>, cbdata: UInt, pcbdata: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumPrinterDriversA(pname: Pcstr, penvironment: Pcstr, level: UInt, pdriverinfo: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>, pcreturned: MutPtr<UInt>): Bool =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingEnumPrinterDriversA(pname.rawAddress.toString(), penvironment.rawAddress.toString(), level.toInt(), pdriverinfo.rawAddress.toString(), cbbuf.toInt(), pcbneeded.rawAddress.toString(), pcreturned.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumPrinterDriversW(pname: Pcwstr, penvironment: Pcwstr, level: UInt, pdriverinfo: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>, pcreturned: MutPtr<UInt>): Bool =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingEnumPrinterDriversW(pname.rawAddress.toString(), penvironment.rawAddress.toString(), level.toInt(), pdriverinfo.rawAddress.toString(), cbbuf.toInt(), pcbneeded.rawAddress.toString(), pcreturned.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumPrinterKeyA(hprinter: PrinterHandle, pkeyname: Pcstr, psubkey: Pstr, cbsubkey: UInt, pcbsubkey: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumPrinterKeyW(hprinter: PrinterHandle, pkeyname: Pcwstr, psubkey: Pwstr, cbsubkey: UInt, pcbsubkey: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumPrintersA(flags: UInt, name: Pcstr, level: UInt, pprinterenum: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>, pcreturned: MutPtr<UInt>): Bool =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingEnumPrintersA(flags.toInt(), name.rawAddress.toString(), level.toInt(), pprinterenum.rawAddress.toString(), cbbuf.toInt(), pcbneeded.rawAddress.toString(), pcreturned.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumPrintersW(flags: UInt, name: Pcwstr, level: UInt, pprinterenum: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>, pcreturned: MutPtr<UInt>): Bool =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingEnumPrintersW(flags.toInt(), name.rawAddress.toString(), level.toInt(), pprinterenum.rawAddress.toString(), cbbuf.toInt(), pcbneeded.rawAddress.toString(), pcreturned.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extDeviceMode(hwnd: Hwnd, hinst: Handle, pdevmodeoutput: MutPtr<Devmodea>, pdevicename: Pcstr, pport: Pcstr, pdevmodeinput: ConstPtr<Devmodea>, pprofile: Pcstr, fmode: UInt): Int =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingExtDeviceMode(hwnd.rawAddress.toString(), hinst.rawAddress.toString(), pdevmodeoutput.rawAddress.toString(), pdevicename.rawAddress.toString(), pport.rawAddress.toString(), pdevmodeinput.rawAddress.toString(), pprofile.rawAddress.toString(), fmode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findClosePrinterChangeNotification(hchange: Handle): Bool =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingFindClosePrinterChangeNotification(hchange.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findFirstPrinterChangeNotification(hprinter: PrinterHandle, fdwfilter: UInt, fdwoptions: UInt, pprinternotifyoptions: ConstPtr<CVoid>): Handle =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findNextPrinterChangeNotification(hchange: Handle, pdwchange: MutPtr<UInt>, pvreserved: ConstPtr<CVoid>, ppprinternotifyinfo: MutPtr<MutPtr<CVoid>>): Bool =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingFindNextPrinterChangeNotification(hchange.rawAddress.toString(), pdwchange.rawAddress.toString(), pvreserved.rawAddress.toString(), ppprinternotifyinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flushPrinter(hprinter: PrinterHandle, pbuf: ConstPtr<CVoid>, cbbuf: UInt, pcwritten: MutPtr<UInt>, csleep: UInt): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freePrintNamedPropertyArray(cproperties: UInt, ppproperties: MutPtr<MutPtr<PrintNamedProperty>>) {
    if (windowsWin32GraphicsPrintingNapiAddon != null) {
        windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingFreePrintNamedPropertyArray(cproperties.toInt(), ppproperties.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun freePrintPropertyValue(pvalue: MutPtr<PrintPropertyValue>) {
    if (windowsWin32GraphicsPrintingNapiAddon != null) {
        windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingFreePrintPropertyValue(pvalue.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun freePrinterNotifyInfo(pprinternotifyinfo: ConstPtr<PrinterNotifyInfo>): Bool =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingFreePrinterNotifyInfo(pprinternotifyinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdiDeleteSpoolFileHandle(spoolfilehandle: Handle): Bool =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingGdiDeleteSpoolFileHandle(spoolfilehandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdiEndDocEMF(spoolfilehandle: Handle): Bool =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingGdiEndDocEMF(spoolfilehandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdiEndPageEMF(spoolfilehandle: Handle, dwoptimization: UInt): Bool =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingGdiEndPageEMF(spoolfilehandle.rawAddress.toString(), dwoptimization.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdiGetDC(spoolfilehandle: Handle): Hdc =
    if (windowsWin32GraphicsPrintingNapiAddon != null) MutPtr((windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingGdiGetDC(spoolfilehandle.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdiGetDevmodeForPage(spoolfilehandle: Handle, dwpagenumber: UInt, pcurrdm: MutPtr<MutPtr<Devmodew>>, plastdm: MutPtr<MutPtr<Devmodew>>): Bool =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingGdiGetDevmodeForPage(spoolfilehandle.rawAddress.toString(), dwpagenumber.toInt(), pcurrdm.rawAddress.toString(), plastdm.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdiGetPageCount(spoolfilehandle: Handle): UInt =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingGdiGetPageCount(spoolfilehandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdiGetPageHandle(spoolfilehandle: Handle, page: UInt, pdwpagetype: MutPtr<UInt>): Handle =
    if (windowsWin32GraphicsPrintingNapiAddon != null) MutPtr((windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingGdiGetPageHandle(spoolfilehandle.rawAddress.toString(), page.toInt(), pdwpagetype.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdiGetSpoolFileHandle(pwszprintername: Pcwstr, pdevmode: MutPtr<Devmodew>, pwszdocname: Pcwstr): Handle =
    if (windowsWin32GraphicsPrintingNapiAddon != null) MutPtr((windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingGdiGetSpoolFileHandle(pwszprintername.rawAddress.toString(), pdevmode.rawAddress.toString(), pwszdocname.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdiPlayPageEMF(spoolfilehandle: Handle, hemf: Handle, prectdocument: MutPtr<Rect>, prectborder: MutPtr<Rect>, prectclip: MutPtr<Rect>): Bool =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingGdiPlayPageEMF(spoolfilehandle.rawAddress.toString(), hemf.rawAddress.toString(), prectdocument.rawAddress.toString(), prectborder.rawAddress.toString(), prectclip.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdiResetDCEMF(spoolfilehandle: Handle, pcurrdm: MutPtr<Devmodew>): Bool =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingGdiResetDCEMF(spoolfilehandle.rawAddress.toString(), pcurrdm.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdiStartDocEMF(spoolfilehandle: Handle, pdocinfo: MutPtr<Docinfow>): Bool =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingGdiStartDocEMF(spoolfilehandle.rawAddress.toString(), pdocinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdiStartPageEMF(spoolfilehandle: Handle): Bool =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingGdiStartPageEMF(spoolfilehandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun generateCopyFilePaths(pszprintername: Pcwstr, pszdirectory: Pcwstr, psplclientinfo: ConstPtr<UByte>, dwlevel: UInt, pszsourcedir: Pwstr, pcchsourcedirsize: MutPtr<UInt>, psztargetdir: Pwstr, pcchtargetdirsize: MutPtr<UInt>, dwflags: UInt): UInt =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingGenerateCopyFilePaths(pszprintername.rawAddress.toString(), pszdirectory.rawAddress.toString(), psplclientinfo.rawAddress.toString(), dwlevel.toInt(), pszsourcedir.rawAddress.toString(), pcchsourcedirsize.rawAddress.toString(), psztargetdir.rawAddress.toString(), pcchtargetdirsize.rawAddress.toString(), dwflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCPSUIUserData(hdlg: Hwnd): ULong =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingGetCPSUIUserData(hdlg.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCorePrinterDriversA(pszserver: Pcstr, pszenvironment: Pcstr, pszzcoredriverdependencies: Pcstr, ccoreprinterdrivers: UInt, pcoreprinterdrivers: MutPtr<CorePrinterDrivera>): Hresult =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingGetCorePrinterDriversA(pszserver.rawAddress.toString(), pszenvironment.rawAddress.toString(), pszzcoredriverdependencies.rawAddress.toString(), ccoreprinterdrivers.toInt(), pcoreprinterdrivers.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCorePrinterDriversW(pszserver: Pcwstr, pszenvironment: Pcwstr, pszzcoredriverdependencies: Pcwstr, ccoreprinterdrivers: UInt, pcoreprinterdrivers: MutPtr<CorePrinterDriverw>): Hresult =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingGetCorePrinterDriversW(pszserver.rawAddress.toString(), pszenvironment.rawAddress.toString(), pszzcoredriverdependencies.rawAddress.toString(), ccoreprinterdrivers.toInt(), pcoreprinterdrivers.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDefaultPrinterA(pszbuffer: Pstr, pcchbuffer: MutPtr<UInt>): Bool =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingGetDefaultPrinterA(pszbuffer.rawAddress.toString(), pcchbuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDefaultPrinterW(pszbuffer: Pwstr, pcchbuffer: MutPtr<UInt>): Bool =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingGetDefaultPrinterW(pszbuffer.rawAddress.toString(), pcchbuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFormA(hprinter: PrinterHandle, pformname: Pcstr, level: UInt, pform: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFormW(hprinter: PrinterHandle, pformname: Pcwstr, level: UInt, pform: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getJobA(hprinter: PrinterHandle, jobid: UInt, level: UInt, pjob: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getJobAttributes(pprintername: Pcwstr, pdevmode: ConstPtr<Devmodew>, pattributeinfo: MutPtr<AttributeInfo3>): Bool =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingGetJobAttributes(pprintername.rawAddress.toString(), pdevmode.rawAddress.toString(), pattributeinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getJobAttributesEx(pprintername: Pcwstr, pdevmode: ConstPtr<Devmodew>, dwlevel: UInt, pattributeinfo: MutPtr<UByte>, nsize: UInt, dwflags: UInt): Bool =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingGetJobAttributesEx(pprintername.rawAddress.toString(), pdevmode.rawAddress.toString(), dwlevel.toInt(), pattributeinfo.rawAddress.toString(), nsize.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getJobNamedPropertyValue(hprinter: PrinterHandle, jobid: UInt, pszname: Pcwstr, pvalue: MutPtr<PrintPropertyValue>): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getJobW(hprinter: PrinterHandle, jobid: UInt, level: UInt, pjob: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPrintExecutionData(pdata: MutPtr<PrintExecutionData>): Bool =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingGetPrintExecutionData(pdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPrintOutputInfo(hwnd: Hwnd, pszprinter: Pcwstr, phfile: MutPtr<Handle>, ppszoutputfile: MutPtr<Pwstr>): Hresult =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingGetPrintOutputInfo(hwnd.rawAddress.toString(), pszprinter.rawAddress.toString(), phfile.rawAddress.toString(), ppszoutputfile.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPrintProcessorDirectoryA(pname: Pcstr, penvironment: Pcstr, level: UInt, pprintprocessorinfo: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>): Bool =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingGetPrintProcessorDirectoryA(pname.rawAddress.toString(), penvironment.rawAddress.toString(), level.toInt(), pprintprocessorinfo.rawAddress.toString(), cbbuf.toInt(), pcbneeded.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPrintProcessorDirectoryW(pname: Pcwstr, penvironment: Pcwstr, level: UInt, pprintprocessorinfo: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>): Bool =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingGetPrintProcessorDirectoryW(pname.rawAddress.toString(), penvironment.rawAddress.toString(), level.toInt(), pprintprocessorinfo.rawAddress.toString(), cbbuf.toInt(), pcbneeded.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPrinterA(hprinter: PrinterHandle, level: UInt, pprinter: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPrinterDataA(hprinter: PrinterHandle, pvaluename: Pcstr, ptype: MutPtr<UInt>, pdata: MutPtr<UByte>, nsize: UInt, pcbneeded: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPrinterDataExA(hprinter: PrinterHandle, pkeyname: Pcstr, pvaluename: Pcstr, ptype: MutPtr<UInt>, pdata: MutPtr<UByte>, nsize: UInt, pcbneeded: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPrinterDataExW(hprinter: PrinterHandle, pkeyname: Pcwstr, pvaluename: Pcwstr, ptype: MutPtr<UInt>, pdata: MutPtr<UByte>, nsize: UInt, pcbneeded: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPrinterDataW(hprinter: PrinterHandle, pvaluename: Pcwstr, ptype: MutPtr<UInt>, pdata: MutPtr<UByte>, nsize: UInt, pcbneeded: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPrinterDriver2A(hwnd: Hwnd, hprinter: PrinterHandle, penvironment: Pcstr, level: UInt, pdriverinfo: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPrinterDriver2W(hwnd: Hwnd, hprinter: PrinterHandle, penvironment: Pcwstr, level: UInt, pdriverinfo: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPrinterDriverA(hprinter: PrinterHandle, penvironment: Pcstr, level: UInt, pdriverinfo: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPrinterDriverDirectoryA(pname: Pcstr, penvironment: Pcstr, level: UInt, pdriverdirectory: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>): Bool =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingGetPrinterDriverDirectoryA(pname.rawAddress.toString(), penvironment.rawAddress.toString(), level.toInt(), pdriverdirectory.rawAddress.toString(), cbbuf.toInt(), pcbneeded.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPrinterDriverDirectoryW(pname: Pcwstr, penvironment: Pcwstr, level: UInt, pdriverdirectory: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>): Bool =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingGetPrinterDriverDirectoryW(pname.rawAddress.toString(), penvironment.rawAddress.toString(), level.toInt(), pdriverdirectory.rawAddress.toString(), cbbuf.toInt(), pcbneeded.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPrinterDriverPackagePathA(pszserver: Pcstr, pszenvironment: Pcstr, pszlanguage: Pcstr, pszpackageid: Pcstr, pszdriverpackagecab: Pstr, cchdriverpackagecab: UInt, pcchrequiredsize: MutPtr<UInt>): Hresult =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingGetPrinterDriverPackagePathA(pszserver.rawAddress.toString(), pszenvironment.rawAddress.toString(), pszlanguage.rawAddress.toString(), pszpackageid.rawAddress.toString(), pszdriverpackagecab.rawAddress.toString(), cchdriverpackagecab.toInt(), pcchrequiredsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPrinterDriverPackagePathW(pszserver: Pcwstr, pszenvironment: Pcwstr, pszlanguage: Pcwstr, pszpackageid: Pcwstr, pszdriverpackagecab: Pwstr, cchdriverpackagecab: UInt, pcchrequiredsize: MutPtr<UInt>): Hresult =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingGetPrinterDriverPackagePathW(pszserver.rawAddress.toString(), pszenvironment.rawAddress.toString(), pszlanguage.rawAddress.toString(), pszpackageid.rawAddress.toString(), pszdriverpackagecab.rawAddress.toString(), cchdriverpackagecab.toInt(), pcchrequiredsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPrinterDriverW(hprinter: PrinterHandle, penvironment: Pcwstr, level: UInt, pdriverinfo: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPrinterW(hprinter: PrinterHandle, level: UInt, pprinter: MutPtr<UByte>, cbbuf: UInt, pcbneeded: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSpoolFileHandle(hprinter: PrinterHandle): Handle =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun impersonatePrinterClient(htoken: Handle): Bool =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingImpersonatePrinterClient(htoken.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun installPrinterDriverFromPackageA(pszserver: Pcstr, pszinfpath: Pcstr, pszdrivername: Pcstr, pszenvironment: Pcstr, dwflags: UInt): Hresult =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingInstallPrinterDriverFromPackageA(pszserver.rawAddress.toString(), pszinfpath.rawAddress.toString(), pszdrivername.rawAddress.toString(), pszenvironment.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun installPrinterDriverFromPackageW(pszserver: Pcwstr, pszinfpath: Pcwstr, pszdrivername: Pcwstr, pszenvironment: Pcwstr, dwflags: UInt): Hresult =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingInstallPrinterDriverFromPackageW(pszserver.rawAddress.toString(), pszinfpath.rawAddress.toString(), pszdrivername.rawAddress.toString(), pszenvironment.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isValidDevmodeA(pdevmode: ConstPtr<Devmodea>, devmodesize: ULong): Bool =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingIsValidDevmodeA(pdevmode.rawAddress.toString(), devmodesize.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isValidDevmodeW(pdevmode: ConstPtr<Devmodew>, devmodesize: ULong): Bool =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingIsValidDevmodeW(pdevmode.rawAddress.toString(), devmodesize.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openPrinter2A(pprintername: Pcstr, phprinter: MutPtr<PrinterHandle>, pdefault: ConstPtr<PrinterDefaultsa>, poptions: ConstPtr<PrinterOptionsa>): Bool =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingOpenPrinter2A(pprintername.rawAddress.toString(), phprinter.rawAddress.toString(), pdefault.rawAddress.toString(), poptions.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openPrinter2W(pprintername: Pcwstr, phprinter: MutPtr<PrinterHandle>, pdefault: ConstPtr<PrinterDefaultsw>, poptions: ConstPtr<PrinterOptionsw>): Bool =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingOpenPrinter2W(pprintername.rawAddress.toString(), phprinter.rawAddress.toString(), pdefault.rawAddress.toString(), poptions.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openPrinterA(pprintername: Pcstr, phprinter: MutPtr<PrinterHandle>, pdefault: ConstPtr<PrinterDefaultsa>): Bool =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingOpenPrinterA(pprintername.rawAddress.toString(), phprinter.rawAddress.toString(), pdefault.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openPrinterW(pprintername: Pcwstr, phprinter: MutPtr<PrinterHandle>, pdefault: ConstPtr<PrinterDefaultsw>): Bool =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingOpenPrinterW(pprintername.rawAddress.toString(), phprinter.rawAddress.toString(), pdefault.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun partialReplyPrinterChangeNotification(hprinter: PrinterHandle, pdatasrc: ConstPtr<PrinterNotifyInfoData>): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun playGdiScriptOnPrinterIC(hprinteric: Handle, pin: ConstPtr<UByte>, cin: UInt, pout: MutPtr<UByte>, cout: UInt, ul: UInt): Bool =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingPlayGdiScriptOnPrinterIC(hprinteric.rawAddress.toString(), pin.rawAddress.toString(), cin.toInt(), pout.rawAddress.toString(), cout.toInt(), ul.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun printerMessageBoxA(hprinter: PrinterHandle, error: UInt, hwnd: Hwnd, ptext: Pcstr, pcaption: Pcstr, dwtype: UInt): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun printerMessageBoxW(hprinter: PrinterHandle, error: UInt, hwnd: Hwnd, ptext: Pcwstr, pcaption: Pcwstr, dwtype: UInt): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun printerProperties(hwnd: Hwnd, hprinter: PrinterHandle): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun providorFindClosePrinterChangeNotification(hprinter: PrinterHandle): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun providorFindFirstPrinterChangeNotification(hprinter: PrinterHandle, fdwflags: UInt, fdwoptions: UInt, hnotify: Handle, pprinternotifyoptions: ConstPtr<CVoid>, pvreserved1: MutPtr<CVoid>): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readPrinter(hprinter: PrinterHandle, pbuf: MutPtr<CVoid>, cbbuf: UInt, pnobytesread: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerForPrintAsyncNotifications(pszname: Pcwstr, pnotificationtype: ConstPtr<Guid>, euserfilter: PrintAsyncNotifyUserFilter, econversationstyle: PrintAsyncNotifyConversationStyle, pcallback: MutPtr<CVoid>, phnotify: MutPtr<Handle>): Hresult =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingRegisterForPrintAsyncNotifications(pszname.rawAddress.toString(), pnotificationtype.rawAddress.toString(), euserfilter, econversationstyle, pcallback.rawAddress.toString(), phnotify.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removePrintDeviceObject(hdeviceobject: Handle): Hresult =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingRemovePrintDeviceObject(hdeviceobject.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun replyPrinterChangeNotification(hprinter: PrinterHandle, fdwchangeflags: UInt, pdwresult: MutPtr<UInt>, pprinternotifyinfo: ConstPtr<CVoid>): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun replyPrinterChangeNotificationEx(hnotify: Handle, dwcolor: UInt, fdwflags: UInt, pdwresult: MutPtr<UInt>, pprinternotifyinfo: ConstPtr<CVoid>): Bool =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingReplyPrinterChangeNotificationEx(hnotify.rawAddress.toString(), dwcolor.toInt(), fdwflags.toInt(), pdwresult.rawAddress.toString(), pprinternotifyinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reportJobProcessingProgress(printerhandle: Handle, jobid: UInt, joboperation: EPrintXPSJobOperation, jobprogress: EPrintXPSJobProgress): Hresult =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingReportJobProcessingProgress(printerhandle.rawAddress.toString(), jobid.toInt(), joboperation, jobprogress) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resetPrinterA(hprinter: PrinterHandle, pdefault: ConstPtr<PrinterDefaultsa>): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resetPrinterW(hprinter: PrinterHandle, pdefault: ConstPtr<PrinterDefaultsw>): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun revertToPrinterSelf(): Handle =
    if (windowsWin32GraphicsPrintingNapiAddon != null) MutPtr((windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingRevertToPrinterSelf() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun routerAllocBidiMem(numbytes: ULong): MutPtr<CVoid> =
    if (windowsWin32GraphicsPrintingNapiAddon != null) MutPtr((windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingRouterAllocBidiMem(numbytes.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun routerAllocBidiResponseContainer(count: UInt): MutPtr<BidiResponseContainer> =
    if (windowsWin32GraphicsPrintingNapiAddon != null) MutPtr((windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingRouterAllocBidiResponseContainer(count.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun routerAllocPrinterNotifyInfo(cprinternotifyinfodata: UInt): MutPtr<PrinterNotifyInfo> =
    if (windowsWin32GraphicsPrintingNapiAddon != null) MutPtr((windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingRouterAllocPrinterNotifyInfo(cprinternotifyinfodata.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun routerFreeBidiMem(pmempointer: ConstPtr<CVoid>) {
    if (windowsWin32GraphicsPrintingNapiAddon != null) {
        windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingRouterFreeBidiMem(pmempointer.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun routerFreeBidiResponseContainer(pdata: ConstPtr<BidiResponseContainer>): UInt =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingRouterFreeBidiResponseContainer(pdata.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun routerFreePrinterNotifyInfo(pinfo: ConstPtr<PrinterNotifyInfo>): Bool =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingRouterFreePrinterNotifyInfo(pinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scheduleJob(hprinter: PrinterHandle, jobid: UInt): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setCPSUIUserData(hdlg: Hwnd, cpsuiuserdata: ULong): Bool =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingSetCPSUIUserData(hdlg.rawAddress.toString(), cpsuiuserdata.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setDefaultPrinterA(pszprinter: Pcstr): Bool =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingSetDefaultPrinterA(pszprinter.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setDefaultPrinterW(pszprinter: Pcwstr): Bool =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingSetDefaultPrinterW(pszprinter.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setFormA(hprinter: PrinterHandle, pformname: Pcstr, level: UInt, pform: ConstPtr<UByte>): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setFormW(hprinter: PrinterHandle, pformname: Pcwstr, level: UInt, pform: ConstPtr<UByte>): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setJobA(hprinter: PrinterHandle, jobid: UInt, level: UInt, pjob: ConstPtr<UByte>, command: UInt): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setJobNamedProperty(hprinter: PrinterHandle, jobid: UInt, pproperty: ConstPtr<PrintNamedProperty>): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setJobW(hprinter: PrinterHandle, jobid: UInt, level: UInt, pjob: ConstPtr<UByte>, command: UInt): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setPortA(pname: Pcstr, pportname: Pcstr, dwlevel: UInt, pportinfo: ConstPtr<UByte>): Bool =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingSetPortA(pname.rawAddress.toString(), pportname.rawAddress.toString(), dwlevel.toInt(), pportinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setPortW(pname: Pcwstr, pportname: Pcwstr, dwlevel: UInt, pportinfo: ConstPtr<UByte>): Bool =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingSetPortW(pname.rawAddress.toString(), pportname.rawAddress.toString(), dwlevel.toInt(), pportinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setPrinterA(hprinter: PrinterHandle, level: UInt, pprinter: ConstPtr<UByte>, command: UInt): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setPrinterDataA(hprinter: PrinterHandle, pvaluename: Pcstr, type: UInt, pdata: ConstPtr<UByte>, cbdata: UInt): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setPrinterDataExA(hprinter: PrinterHandle, pkeyname: Pcstr, pvaluename: Pcstr, type: UInt, pdata: ConstPtr<UByte>, cbdata: UInt): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setPrinterDataExW(hprinter: PrinterHandle, pkeyname: Pcwstr, pvaluename: Pcwstr, type: UInt, pdata: ConstPtr<UByte>, cbdata: UInt): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setPrinterDataW(hprinter: PrinterHandle, pvaluename: Pcwstr, type: UInt, pdata: ConstPtr<UByte>, cbdata: UInt): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setPrinterW(hprinter: PrinterHandle, level: UInt, pprinter: ConstPtr<UByte>, command: UInt): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun splIsSessionZero(hprinter: PrinterHandle, jobid: UInt, pissessionzero: MutPtr<Bool>): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun splPromptUIInUsersSession(hprinter: PrinterHandle, jobid: UInt, puiparams: ConstPtr<Showuiparams>, presponse: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun spoolerCopyFileEvent(pszprintername: Pcwstr, pszkey: Pcwstr, dwcopyfileevent: UInt): Bool =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingSpoolerCopyFileEvent(pszprintername.rawAddress.toString(), pszkey.rawAddress.toString(), dwcopyfileevent.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun spoolerFindClosePrinterChangeNotification(hprinter: PrinterHandle): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun spoolerFindFirstPrinterChangeNotification(hprinter: PrinterHandle, fdwfilterflags: UInt, fdwoptions: UInt, pprinternotifyoptions: ConstPtr<CVoid>, pvreserved: ConstPtr<CVoid>, pnotificationconfig: ConstPtr<CVoid>, phnotify: MutPtr<Handle>, phevent: MutPtr<Handle>): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun spoolerFindNextPrinterChangeNotification(hprinter: PrinterHandle, pfdwchange: MutPtr<UInt>, pprinternotifyoptions: ConstPtr<CVoid>, ppprinternotifyinfo: MutPtr<MutPtr<CVoid>>): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun spoolerFreePrinterNotifyInfo(pinfo: ConstPtr<PrinterNotifyInfo>) {
    if (windowsWin32GraphicsPrintingNapiAddon != null) {
        windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingSpoolerFreePrinterNotifyInfo(pinfo.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun spoolerRefreshPrinterChangeNotification(hprinter: PrinterHandle, dwcolor: UInt, poptions: ConstPtr<PrinterNotifyOptions>, ppinfo: MutPtr<MutPtr<PrinterNotifyInfo>>): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun startDocPrinterA(hprinter: PrinterHandle, level: UInt, pdocinfo: ConstPtr<DocInfo1a>): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun startDocPrinterW(hprinter: PrinterHandle, level: UInt, pdocinfo: ConstPtr<DocInfo1w>): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun startPagePrinter(hprinter: PrinterHandle): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unRegisterForPrintAsyncNotifications(param0: Handle): Hresult =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingUnRegisterForPrintAsyncNotifications(param0.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun updatePrintDeviceObject(hprinter: PrinterHandle, hdeviceobject: Handle): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uploadPrinterDriverPackageA(pszserver: Pcstr, pszinfpath: Pcstr, pszenvironment: Pcstr, dwflags: UInt, hwnd: Hwnd, pszdestinfpath: Pstr, pcchdestinfpath: MutPtr<UInt>): Hresult =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingUploadPrinterDriverPackageA(pszserver.rawAddress.toString(), pszinfpath.rawAddress.toString(), pszenvironment.rawAddress.toString(), dwflags.toInt(), hwnd.rawAddress.toString(), pszdestinfpath.rawAddress.toString(), pcchdestinfpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uploadPrinterDriverPackageW(pszserver: Pcwstr, pszinfpath: Pcwstr, pszenvironment: Pcwstr, dwflags: UInt, hwnd: Hwnd, pszdestinfpath: Pwstr, pcchdestinfpath: MutPtr<UInt>): Hresult =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingUploadPrinterDriverPackageW(pszserver.rawAddress.toString(), pszinfpath.rawAddress.toString(), pszenvironment.rawAddress.toString(), dwflags.toInt(), hwnd.rawAddress.toString(), pszdestinfpath.rawAddress.toString(), pcchdestinfpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waitForPrinterChange(hprinter: PrinterHandle, flags: UInt): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writePrinter(hprinter: PrinterHandle, pbuf: ConstPtr<CVoid>, cbbuf: UInt, pcwritten: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun xcvDataW(hxcv: Handle, pszdataname: Pcwstr, pinputdata: ConstPtr<UByte>, cbinputdata: UInt, poutputdata: MutPtr<UByte>, cboutputdata: UInt, pcboutputneeded: MutPtr<UInt>, pdwstatus: MutPtr<UInt>): Bool =
    if (windowsWin32GraphicsPrintingNapiAddon != null) (windowsWin32GraphicsPrintingNapiAddon.windowssysWindowsWin32GraphicsPrintingXcvDataW(hxcv.rawAddress.toString(), pszdataname.rawAddress.toString(), pinputdata.rawAddress.toString(), cbinputdata.toInt(), poutputdata.rawAddress.toString(), cboutputdata.toInt(), pcboutputneeded.rawAddress.toString(), pdwstatus.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
