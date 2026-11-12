@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.fax

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

private val windowsWin32DevicesFaxNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun canSendToFaxRecipient(): Bool =
    if (windowsWin32DevicesFaxNapiAddon != null) (windowsWin32DevicesFaxNapiAddon.windowssysWindowsWin32DevicesFaxCanSendToFaxRecipient() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxAbort(faxhandle: Handle, jobid: UInt): Bool =
    if (windowsWin32DevicesFaxNapiAddon != null) (windowsWin32DevicesFaxNapiAddon.windowssysWindowsWin32DevicesFaxFaxAbort(faxhandle.rawAddress.toString(), jobid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxAccessCheck(faxhandle: Handle, accessmask: UInt): Bool =
    if (windowsWin32DevicesFaxNapiAddon != null) (windowsWin32DevicesFaxNapiAddon.windowssysWindowsWin32DevicesFaxFaxAccessCheck(faxhandle.rawAddress.toString(), accessmask.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxClose(faxhandle: Handle): Bool =
    if (windowsWin32DevicesFaxNapiAddon != null) (windowsWin32DevicesFaxNapiAddon.windowssysWindowsWin32DevicesFaxFaxClose(faxhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxCompleteJobParamsA(jobparams: MutPtr<MutPtr<FaxJobParama>>, coverpageinfo: MutPtr<MutPtr<FaxCoverpageInfoa>>): Bool =
    if (windowsWin32DevicesFaxNapiAddon != null) (windowsWin32DevicesFaxNapiAddon.windowssysWindowsWin32DevicesFaxFaxCompleteJobParamsA(jobparams.rawAddress.toString(), coverpageinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxCompleteJobParamsW(jobparams: MutPtr<MutPtr<FaxJobParamw>>, coverpageinfo: MutPtr<MutPtr<FaxCoverpageInfow>>): Bool =
    if (windowsWin32DevicesFaxNapiAddon != null) (windowsWin32DevicesFaxNapiAddon.windowssysWindowsWin32DevicesFaxFaxCompleteJobParamsW(jobparams.rawAddress.toString(), coverpageinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxConnectFaxServerA(machinename: Pcstr, faxhandle: MutPtr<Handle>): Bool =
    if (windowsWin32DevicesFaxNapiAddon != null) (windowsWin32DevicesFaxNapiAddon.windowssysWindowsWin32DevicesFaxFaxConnectFaxServerA(machinename.rawAddress.toString(), faxhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxConnectFaxServerW(machinename: Pcwstr, faxhandle: MutPtr<Handle>): Bool =
    if (windowsWin32DevicesFaxNapiAddon != null) (windowsWin32DevicesFaxNapiAddon.windowssysWindowsWin32DevicesFaxFaxConnectFaxServerW(machinename.rawAddress.toString(), faxhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxEnableRoutingMethodA(faxporthandle: Handle, routingguid: Pcstr, enabled: Bool): Bool =
    if (windowsWin32DevicesFaxNapiAddon != null) (windowsWin32DevicesFaxNapiAddon.windowssysWindowsWin32DevicesFaxFaxEnableRoutingMethodA(faxporthandle.rawAddress.toString(), routingguid.rawAddress.toString(), enabled) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxEnableRoutingMethodW(faxporthandle: Handle, routingguid: Pcwstr, enabled: Bool): Bool =
    if (windowsWin32DevicesFaxNapiAddon != null) (windowsWin32DevicesFaxNapiAddon.windowssysWindowsWin32DevicesFaxFaxEnableRoutingMethodW(faxporthandle.rawAddress.toString(), routingguid.rawAddress.toString(), enabled) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxEnumGlobalRoutingInfoA(faxhandle: Handle, routinginfo: MutPtr<MutPtr<FaxGlobalRoutingInfoa>>, methodsreturned: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesFaxNapiAddon != null) (windowsWin32DevicesFaxNapiAddon.windowssysWindowsWin32DevicesFaxFaxEnumGlobalRoutingInfoA(faxhandle.rawAddress.toString(), routinginfo.rawAddress.toString(), methodsreturned.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxEnumGlobalRoutingInfoW(faxhandle: Handle, routinginfo: MutPtr<MutPtr<FaxGlobalRoutingInfow>>, methodsreturned: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesFaxNapiAddon != null) (windowsWin32DevicesFaxNapiAddon.windowssysWindowsWin32DevicesFaxFaxEnumGlobalRoutingInfoW(faxhandle.rawAddress.toString(), routinginfo.rawAddress.toString(), methodsreturned.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxEnumJobsA(faxhandle: Handle, jobentry: MutPtr<MutPtr<FaxJobEntrya>>, jobsreturned: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesFaxNapiAddon != null) (windowsWin32DevicesFaxNapiAddon.windowssysWindowsWin32DevicesFaxFaxEnumJobsA(faxhandle.rawAddress.toString(), jobentry.rawAddress.toString(), jobsreturned.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxEnumJobsW(faxhandle: Handle, jobentry: MutPtr<MutPtr<FaxJobEntryw>>, jobsreturned: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesFaxNapiAddon != null) (windowsWin32DevicesFaxNapiAddon.windowssysWindowsWin32DevicesFaxFaxEnumJobsW(faxhandle.rawAddress.toString(), jobentry.rawAddress.toString(), jobsreturned.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxEnumPortsA(faxhandle: Handle, portinfo: MutPtr<MutPtr<FaxPortInfoa>>, portsreturned: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesFaxNapiAddon != null) (windowsWin32DevicesFaxNapiAddon.windowssysWindowsWin32DevicesFaxFaxEnumPortsA(faxhandle.rawAddress.toString(), portinfo.rawAddress.toString(), portsreturned.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxEnumPortsW(faxhandle: Handle, portinfo: MutPtr<MutPtr<FaxPortInfow>>, portsreturned: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesFaxNapiAddon != null) (windowsWin32DevicesFaxNapiAddon.windowssysWindowsWin32DevicesFaxFaxEnumPortsW(faxhandle.rawAddress.toString(), portinfo.rawAddress.toString(), portsreturned.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxEnumRoutingMethodsA(faxporthandle: Handle, routingmethod: MutPtr<MutPtr<FaxRoutingMethoda>>, methodsreturned: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesFaxNapiAddon != null) (windowsWin32DevicesFaxNapiAddon.windowssysWindowsWin32DevicesFaxFaxEnumRoutingMethodsA(faxporthandle.rawAddress.toString(), routingmethod.rawAddress.toString(), methodsreturned.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxEnumRoutingMethodsW(faxporthandle: Handle, routingmethod: MutPtr<MutPtr<FaxRoutingMethodw>>, methodsreturned: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesFaxNapiAddon != null) (windowsWin32DevicesFaxNapiAddon.windowssysWindowsWin32DevicesFaxFaxEnumRoutingMethodsW(faxporthandle.rawAddress.toString(), routingmethod.rawAddress.toString(), methodsreturned.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxFreeBuffer(buffer: MutPtr<CVoid>) {
    if (windowsWin32DevicesFaxNapiAddon != null) {
        windowsWin32DevicesFaxNapiAddon.windowssysWindowsWin32DevicesFaxFaxFreeBuffer(buffer.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun faxGetConfigurationA(faxhandle: Handle, faxconfig: MutPtr<MutPtr<FaxConfigurationa>>): Bool =
    if (windowsWin32DevicesFaxNapiAddon != null) (windowsWin32DevicesFaxNapiAddon.windowssysWindowsWin32DevicesFaxFaxGetConfigurationA(faxhandle.rawAddress.toString(), faxconfig.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxGetConfigurationW(faxhandle: Handle, faxconfig: MutPtr<MutPtr<FaxConfigurationw>>): Bool =
    if (windowsWin32DevicesFaxNapiAddon != null) (windowsWin32DevicesFaxNapiAddon.windowssysWindowsWin32DevicesFaxFaxGetConfigurationW(faxhandle.rawAddress.toString(), faxconfig.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxGetDeviceStatusA(faxporthandle: Handle, devicestatus: MutPtr<MutPtr<FaxDeviceStatusa>>): Bool =
    if (windowsWin32DevicesFaxNapiAddon != null) (windowsWin32DevicesFaxNapiAddon.windowssysWindowsWin32DevicesFaxFaxGetDeviceStatusA(faxporthandle.rawAddress.toString(), devicestatus.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxGetDeviceStatusW(faxporthandle: Handle, devicestatus: MutPtr<MutPtr<FaxDeviceStatusw>>): Bool =
    if (windowsWin32DevicesFaxNapiAddon != null) (windowsWin32DevicesFaxNapiAddon.windowssysWindowsWin32DevicesFaxFaxGetDeviceStatusW(faxporthandle.rawAddress.toString(), devicestatus.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxGetJobA(faxhandle: Handle, jobid: UInt, jobentry: MutPtr<MutPtr<FaxJobEntrya>>): Bool =
    if (windowsWin32DevicesFaxNapiAddon != null) (windowsWin32DevicesFaxNapiAddon.windowssysWindowsWin32DevicesFaxFaxGetJobA(faxhandle.rawAddress.toString(), jobid.toInt(), jobentry.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxGetJobW(faxhandle: Handle, jobid: UInt, jobentry: MutPtr<MutPtr<FaxJobEntryw>>): Bool =
    if (windowsWin32DevicesFaxNapiAddon != null) (windowsWin32DevicesFaxNapiAddon.windowssysWindowsWin32DevicesFaxFaxGetJobW(faxhandle.rawAddress.toString(), jobid.toInt(), jobentry.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxGetLoggingCategoriesA(faxhandle: Handle, categories: MutPtr<MutPtr<FaxLogCategorya>>, numbercategories: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesFaxNapiAddon != null) (windowsWin32DevicesFaxNapiAddon.windowssysWindowsWin32DevicesFaxFaxGetLoggingCategoriesA(faxhandle.rawAddress.toString(), categories.rawAddress.toString(), numbercategories.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxGetLoggingCategoriesW(faxhandle: Handle, categories: MutPtr<MutPtr<FaxLogCategoryw>>, numbercategories: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesFaxNapiAddon != null) (windowsWin32DevicesFaxNapiAddon.windowssysWindowsWin32DevicesFaxFaxGetLoggingCategoriesW(faxhandle.rawAddress.toString(), categories.rawAddress.toString(), numbercategories.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxGetPageData(faxhandle: Handle, jobid: UInt, buffer: MutPtr<MutPtr<UByte>>, buffersize: MutPtr<UInt>, imagewidth: MutPtr<UInt>, imageheight: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesFaxNapiAddon != null) (windowsWin32DevicesFaxNapiAddon.windowssysWindowsWin32DevicesFaxFaxGetPageData(faxhandle.rawAddress.toString(), jobid.toInt(), buffer.rawAddress.toString(), buffersize.rawAddress.toString(), imagewidth.rawAddress.toString(), imageheight.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxGetPortA(faxporthandle: Handle, portinfo: MutPtr<MutPtr<FaxPortInfoa>>): Bool =
    if (windowsWin32DevicesFaxNapiAddon != null) (windowsWin32DevicesFaxNapiAddon.windowssysWindowsWin32DevicesFaxFaxGetPortA(faxporthandle.rawAddress.toString(), portinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxGetPortW(faxporthandle: Handle, portinfo: MutPtr<MutPtr<FaxPortInfow>>): Bool =
    if (windowsWin32DevicesFaxNapiAddon != null) (windowsWin32DevicesFaxNapiAddon.windowssysWindowsWin32DevicesFaxFaxGetPortW(faxporthandle.rawAddress.toString(), portinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxGetRoutingInfoA(faxporthandle: Handle, routingguid: Pcstr, routinginfobuffer: MutPtr<MutPtr<UByte>>, routinginfobuffersize: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesFaxNapiAddon != null) (windowsWin32DevicesFaxNapiAddon.windowssysWindowsWin32DevicesFaxFaxGetRoutingInfoA(faxporthandle.rawAddress.toString(), routingguid.rawAddress.toString(), routinginfobuffer.rawAddress.toString(), routinginfobuffersize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxGetRoutingInfoW(faxporthandle: Handle, routingguid: Pcwstr, routinginfobuffer: MutPtr<MutPtr<UByte>>, routinginfobuffersize: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesFaxNapiAddon != null) (windowsWin32DevicesFaxNapiAddon.windowssysWindowsWin32DevicesFaxFaxGetRoutingInfoW(faxporthandle.rawAddress.toString(), routingguid.rawAddress.toString(), routinginfobuffer.rawAddress.toString(), routinginfobuffersize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxInitializeEventQueue(faxhandle: Handle, completionport: Handle, completionkey: ULong, hwnd: Hwnd, messagestart: UInt): Bool =
    if (windowsWin32DevicesFaxNapiAddon != null) (windowsWin32DevicesFaxNapiAddon.windowssysWindowsWin32DevicesFaxFaxInitializeEventQueue(faxhandle.rawAddress.toString(), completionport.rawAddress.toString(), completionkey.toString(), hwnd.rawAddress.toString(), messagestart.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxOpenPort(faxhandle: Handle, deviceid: UInt, flags: UInt, faxporthandle: MutPtr<Handle>): Bool =
    if (windowsWin32DevicesFaxNapiAddon != null) (windowsWin32DevicesFaxNapiAddon.windowssysWindowsWin32DevicesFaxFaxOpenPort(faxhandle.rawAddress.toString(), deviceid.toInt(), flags.toInt(), faxporthandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxPrintCoverPageA(faxcontextinfo: ConstPtr<FaxContextInfoa>, coverpageinfo: ConstPtr<FaxCoverpageInfoa>): Bool =
    if (windowsWin32DevicesFaxNapiAddon != null) (windowsWin32DevicesFaxNapiAddon.windowssysWindowsWin32DevicesFaxFaxPrintCoverPageA(faxcontextinfo.rawAddress.toString(), coverpageinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxPrintCoverPageW(faxcontextinfo: ConstPtr<FaxContextInfow>, coverpageinfo: ConstPtr<FaxCoverpageInfow>): Bool =
    if (windowsWin32DevicesFaxNapiAddon != null) (windowsWin32DevicesFaxNapiAddon.windowssysWindowsWin32DevicesFaxFaxPrintCoverPageW(faxcontextinfo.rawAddress.toString(), coverpageinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxRegisterRoutingExtensionW(faxhandle: Handle, extensionname: Pcwstr, friendlyname: Pcwstr, imagename: Pcwstr, callback: PfaxRoutingInstallationCallbackw, context: ConstPtr<CVoid>): Bool =
    if (windowsWin32DevicesFaxNapiAddon != null) (windowsWin32DevicesFaxNapiAddon.windowssysWindowsWin32DevicesFaxFaxRegisterRoutingExtensionW(faxhandle.rawAddress.toString(), extensionname.rawAddress.toString(), friendlyname.rawAddress.toString(), imagename.rawAddress.toString(), 0L.toString(), context.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxRegisterServiceProviderW(deviceprovider: Pcwstr, friendlyname: Pcwstr, imagename: Pcwstr, tspname: Pcwstr): Bool =
    if (windowsWin32DevicesFaxNapiAddon != null) (windowsWin32DevicesFaxNapiAddon.windowssysWindowsWin32DevicesFaxFaxRegisterServiceProviderW(deviceprovider.rawAddress.toString(), friendlyname.rawAddress.toString(), imagename.rawAddress.toString(), tspname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxSendDocumentA(faxhandle: Handle, filename: Pcstr, jobparams: ConstPtr<FaxJobParama>, coverpageinfo: ConstPtr<FaxCoverpageInfoa>, faxjobid: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesFaxNapiAddon != null) (windowsWin32DevicesFaxNapiAddon.windowssysWindowsWin32DevicesFaxFaxSendDocumentA(faxhandle.rawAddress.toString(), filename.rawAddress.toString(), jobparams.rawAddress.toString(), coverpageinfo.rawAddress.toString(), faxjobid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxSendDocumentForBroadcastA(faxhandle: Handle, filename: Pcstr, faxjobid: MutPtr<UInt>, faxrecipientcallback: PfaxRecipientCallbacka, context: ConstPtr<CVoid>): Bool =
    if (windowsWin32DevicesFaxNapiAddon != null) (windowsWin32DevicesFaxNapiAddon.windowssysWindowsWin32DevicesFaxFaxSendDocumentForBroadcastA(faxhandle.rawAddress.toString(), filename.rawAddress.toString(), faxjobid.rawAddress.toString(), 0L.toString(), context.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxSendDocumentForBroadcastW(faxhandle: Handle, filename: Pcwstr, faxjobid: MutPtr<UInt>, faxrecipientcallback: PfaxRecipientCallbackw, context: ConstPtr<CVoid>): Bool =
    if (windowsWin32DevicesFaxNapiAddon != null) (windowsWin32DevicesFaxNapiAddon.windowssysWindowsWin32DevicesFaxFaxSendDocumentForBroadcastW(faxhandle.rawAddress.toString(), filename.rawAddress.toString(), faxjobid.rawAddress.toString(), 0L.toString(), context.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxSendDocumentW(faxhandle: Handle, filename: Pcwstr, jobparams: ConstPtr<FaxJobParamw>, coverpageinfo: ConstPtr<FaxCoverpageInfow>, faxjobid: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesFaxNapiAddon != null) (windowsWin32DevicesFaxNapiAddon.windowssysWindowsWin32DevicesFaxFaxSendDocumentW(faxhandle.rawAddress.toString(), filename.rawAddress.toString(), jobparams.rawAddress.toString(), coverpageinfo.rawAddress.toString(), faxjobid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxSetConfigurationA(faxhandle: Handle, faxconfig: ConstPtr<FaxConfigurationa>): Bool =
    if (windowsWin32DevicesFaxNapiAddon != null) (windowsWin32DevicesFaxNapiAddon.windowssysWindowsWin32DevicesFaxFaxSetConfigurationA(faxhandle.rawAddress.toString(), faxconfig.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxSetConfigurationW(faxhandle: Handle, faxconfig: ConstPtr<FaxConfigurationw>): Bool =
    if (windowsWin32DevicesFaxNapiAddon != null) (windowsWin32DevicesFaxNapiAddon.windowssysWindowsWin32DevicesFaxFaxSetConfigurationW(faxhandle.rawAddress.toString(), faxconfig.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxSetGlobalRoutingInfoA(faxhandle: Handle, routinginfo: ConstPtr<FaxGlobalRoutingInfoa>): Bool =
    if (windowsWin32DevicesFaxNapiAddon != null) (windowsWin32DevicesFaxNapiAddon.windowssysWindowsWin32DevicesFaxFaxSetGlobalRoutingInfoA(faxhandle.rawAddress.toString(), routinginfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxSetGlobalRoutingInfoW(faxhandle: Handle, routinginfo: ConstPtr<FaxGlobalRoutingInfow>): Bool =
    if (windowsWin32DevicesFaxNapiAddon != null) (windowsWin32DevicesFaxNapiAddon.windowssysWindowsWin32DevicesFaxFaxSetGlobalRoutingInfoW(faxhandle.rawAddress.toString(), routinginfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxSetJobA(faxhandle: Handle, jobid: UInt, command: UInt, jobentry: ConstPtr<FaxJobEntrya>): Bool =
    if (windowsWin32DevicesFaxNapiAddon != null) (windowsWin32DevicesFaxNapiAddon.windowssysWindowsWin32DevicesFaxFaxSetJobA(faxhandle.rawAddress.toString(), jobid.toInt(), command.toInt(), jobentry.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxSetJobW(faxhandle: Handle, jobid: UInt, command: UInt, jobentry: ConstPtr<FaxJobEntryw>): Bool =
    if (windowsWin32DevicesFaxNapiAddon != null) (windowsWin32DevicesFaxNapiAddon.windowssysWindowsWin32DevicesFaxFaxSetJobW(faxhandle.rawAddress.toString(), jobid.toInt(), command.toInt(), jobentry.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxSetLoggingCategoriesA(faxhandle: Handle, categories: ConstPtr<FaxLogCategorya>, numbercategories: UInt): Bool =
    if (windowsWin32DevicesFaxNapiAddon != null) (windowsWin32DevicesFaxNapiAddon.windowssysWindowsWin32DevicesFaxFaxSetLoggingCategoriesA(faxhandle.rawAddress.toString(), categories.rawAddress.toString(), numbercategories.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxSetLoggingCategoriesW(faxhandle: Handle, categories: ConstPtr<FaxLogCategoryw>, numbercategories: UInt): Bool =
    if (windowsWin32DevicesFaxNapiAddon != null) (windowsWin32DevicesFaxNapiAddon.windowssysWindowsWin32DevicesFaxFaxSetLoggingCategoriesW(faxhandle.rawAddress.toString(), categories.rawAddress.toString(), numbercategories.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxSetPortA(faxporthandle: Handle, portinfo: ConstPtr<FaxPortInfoa>): Bool =
    if (windowsWin32DevicesFaxNapiAddon != null) (windowsWin32DevicesFaxNapiAddon.windowssysWindowsWin32DevicesFaxFaxSetPortA(faxporthandle.rawAddress.toString(), portinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxSetPortW(faxporthandle: Handle, portinfo: ConstPtr<FaxPortInfow>): Bool =
    if (windowsWin32DevicesFaxNapiAddon != null) (windowsWin32DevicesFaxNapiAddon.windowssysWindowsWin32DevicesFaxFaxSetPortW(faxporthandle.rawAddress.toString(), portinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxSetRoutingInfoA(faxporthandle: Handle, routingguid: Pcstr, routinginfobuffer: ConstPtr<UByte>, routinginfobuffersize: UInt): Bool =
    if (windowsWin32DevicesFaxNapiAddon != null) (windowsWin32DevicesFaxNapiAddon.windowssysWindowsWin32DevicesFaxFaxSetRoutingInfoA(faxporthandle.rawAddress.toString(), routingguid.rawAddress.toString(), routinginfobuffer.rawAddress.toString(), routinginfobuffersize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxSetRoutingInfoW(faxporthandle: Handle, routingguid: Pcwstr, routinginfobuffer: ConstPtr<UByte>, routinginfobuffersize: UInt): Bool =
    if (windowsWin32DevicesFaxNapiAddon != null) (windowsWin32DevicesFaxNapiAddon.windowssysWindowsWin32DevicesFaxFaxSetRoutingInfoW(faxporthandle.rawAddress.toString(), routingguid.rawAddress.toString(), routinginfobuffer.rawAddress.toString(), routinginfobuffersize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxStartPrintJobA(printername: Pcstr, printinfo: ConstPtr<FaxPrintInfoa>, faxjobid: MutPtr<UInt>, faxcontextinfo: MutPtr<FaxContextInfoa>): Bool =
    if (windowsWin32DevicesFaxNapiAddon != null) (windowsWin32DevicesFaxNapiAddon.windowssysWindowsWin32DevicesFaxFaxStartPrintJobA(printername.rawAddress.toString(), printinfo.rawAddress.toString(), faxjobid.rawAddress.toString(), faxcontextinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxStartPrintJobW(printername: Pcwstr, printinfo: ConstPtr<FaxPrintInfow>, faxjobid: MutPtr<UInt>, faxcontextinfo: MutPtr<FaxContextInfow>): Bool =
    if (windowsWin32DevicesFaxNapiAddon != null) (windowsWin32DevicesFaxNapiAddon.windowssysWindowsWin32DevicesFaxFaxStartPrintJobW(printername.rawAddress.toString(), printinfo.rawAddress.toString(), faxjobid.rawAddress.toString(), faxcontextinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faxUnregisterServiceProviderW(deviceprovider: Pcwstr): Bool =
    if (windowsWin32DevicesFaxNapiAddon != null) (windowsWin32DevicesFaxNapiAddon.windowssysWindowsWin32DevicesFaxFaxUnregisterServiceProviderW(deviceprovider.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendToFaxRecipient(sndmode: SendToMode, lpfilename: Pcwstr): UInt =
    if (windowsWin32DevicesFaxNapiAddon != null) (windowsWin32DevicesFaxNapiAddon.windowssysWindowsWin32DevicesFaxSendToFaxRecipient(sndmode, lpfilename.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stiCreateInstanceW(hinst: Hinstance, dwver: UInt, ppsti: MutPtr<MutPtr<CVoid>>, punkouter: MutPtr<CVoid>): Hresult =
    if (windowsWin32DevicesFaxNapiAddon != null) (windowsWin32DevicesFaxNapiAddon.windowssysWindowsWin32DevicesFaxStiCreateInstanceW(hinst.rawAddress.toString(), dwver.toInt(), ppsti.rawAddress.toString(), punkouter.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
