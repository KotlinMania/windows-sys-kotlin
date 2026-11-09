@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.fax

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HINSTANCE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND

private val _windowsWin32DevicesFaxNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun CanSendToFaxRecipient(): BOOL =
    if (_windowsWin32DevicesFaxNapiAddon != null) (_windowsWin32DevicesFaxNapiAddon.windowssys_windows_win32_devices_fax_CanSendToFaxRecipient() as Int) else 0

public actual fun FaxAbort(faxhandle: HANDLE, jobid: UInt): BOOL =
    if (_windowsWin32DevicesFaxNapiAddon != null) (_windowsWin32DevicesFaxNapiAddon.windowssys_windows_win32_devices_fax_FaxAbort(faxhandle.toString(), jobid.toInt()) as Int) else 0

public actual fun FaxAccessCheck(faxhandle: HANDLE, accessmask: UInt): BOOL =
    if (_windowsWin32DevicesFaxNapiAddon != null) (_windowsWin32DevicesFaxNapiAddon.windowssys_windows_win32_devices_fax_FaxAccessCheck(faxhandle.toString(), accessmask.toInt()) as Int) else 0

public actual fun FaxClose(faxhandle: HANDLE): BOOL =
    if (_windowsWin32DevicesFaxNapiAddon != null) (_windowsWin32DevicesFaxNapiAddon.windowssys_windows_win32_devices_fax_FaxClose(faxhandle.toString()) as Int) else 0

public actual fun FaxCompleteJobParamsA(jobparams: Long, coverpageinfo: Long): BOOL =
    if (_windowsWin32DevicesFaxNapiAddon != null) (_windowsWin32DevicesFaxNapiAddon.windowssys_windows_win32_devices_fax_FaxCompleteJobParamsA(jobparams.toString(), coverpageinfo.toString()) as Int) else 0

public actual fun FaxCompleteJobParamsW(jobparams: Long, coverpageinfo: Long): BOOL =
    if (_windowsWin32DevicesFaxNapiAddon != null) (_windowsWin32DevicesFaxNapiAddon.windowssys_windows_win32_devices_fax_FaxCompleteJobParamsW(jobparams.toString(), coverpageinfo.toString()) as Int) else 0

public actual fun FaxConnectFaxServerA(machinename: PCSTR, faxhandle: Long): BOOL =
    if (_windowsWin32DevicesFaxNapiAddon != null) (_windowsWin32DevicesFaxNapiAddon.windowssys_windows_win32_devices_fax_FaxConnectFaxServerA(machinename.toString(), faxhandle.toString()) as Int) else 0

public actual fun FaxConnectFaxServerW(machinename: PCWSTR, faxhandle: Long): BOOL =
    if (_windowsWin32DevicesFaxNapiAddon != null) (_windowsWin32DevicesFaxNapiAddon.windowssys_windows_win32_devices_fax_FaxConnectFaxServerW(machinename.toString(), faxhandle.toString()) as Int) else 0

public actual fun FaxEnableRoutingMethodA(faxporthandle: HANDLE, routingguid: PCSTR, enabled: BOOL): BOOL =
    if (_windowsWin32DevicesFaxNapiAddon != null) (_windowsWin32DevicesFaxNapiAddon.windowssys_windows_win32_devices_fax_FaxEnableRoutingMethodA(faxporthandle.toString(), routingguid.toString(), enabled) as Int) else 0

public actual fun FaxEnableRoutingMethodW(faxporthandle: HANDLE, routingguid: PCWSTR, enabled: BOOL): BOOL =
    if (_windowsWin32DevicesFaxNapiAddon != null) (_windowsWin32DevicesFaxNapiAddon.windowssys_windows_win32_devices_fax_FaxEnableRoutingMethodW(faxporthandle.toString(), routingguid.toString(), enabled) as Int) else 0

public actual fun FaxEnumGlobalRoutingInfoA(faxhandle: HANDLE, routinginfo: Long, methodsreturned: Long): BOOL =
    if (_windowsWin32DevicesFaxNapiAddon != null) (_windowsWin32DevicesFaxNapiAddon.windowssys_windows_win32_devices_fax_FaxEnumGlobalRoutingInfoA(faxhandle.toString(), routinginfo.toString(), methodsreturned.toString()) as Int) else 0

public actual fun FaxEnumGlobalRoutingInfoW(faxhandle: HANDLE, routinginfo: Long, methodsreturned: Long): BOOL =
    if (_windowsWin32DevicesFaxNapiAddon != null) (_windowsWin32DevicesFaxNapiAddon.windowssys_windows_win32_devices_fax_FaxEnumGlobalRoutingInfoW(faxhandle.toString(), routinginfo.toString(), methodsreturned.toString()) as Int) else 0

public actual fun FaxEnumJobsA(faxhandle: HANDLE, jobentry: Long, jobsreturned: Long): BOOL =
    if (_windowsWin32DevicesFaxNapiAddon != null) (_windowsWin32DevicesFaxNapiAddon.windowssys_windows_win32_devices_fax_FaxEnumJobsA(faxhandle.toString(), jobentry.toString(), jobsreturned.toString()) as Int) else 0

public actual fun FaxEnumJobsW(faxhandle: HANDLE, jobentry: Long, jobsreturned: Long): BOOL =
    if (_windowsWin32DevicesFaxNapiAddon != null) (_windowsWin32DevicesFaxNapiAddon.windowssys_windows_win32_devices_fax_FaxEnumJobsW(faxhandle.toString(), jobentry.toString(), jobsreturned.toString()) as Int) else 0

public actual fun FaxEnumPortsA(faxhandle: HANDLE, portinfo: Long, portsreturned: Long): BOOL =
    if (_windowsWin32DevicesFaxNapiAddon != null) (_windowsWin32DevicesFaxNapiAddon.windowssys_windows_win32_devices_fax_FaxEnumPortsA(faxhandle.toString(), portinfo.toString(), portsreturned.toString()) as Int) else 0

public actual fun FaxEnumPortsW(faxhandle: HANDLE, portinfo: Long, portsreturned: Long): BOOL =
    if (_windowsWin32DevicesFaxNapiAddon != null) (_windowsWin32DevicesFaxNapiAddon.windowssys_windows_win32_devices_fax_FaxEnumPortsW(faxhandle.toString(), portinfo.toString(), portsreturned.toString()) as Int) else 0

public actual fun FaxEnumRoutingMethodsA(faxporthandle: HANDLE, routingmethod: Long, methodsreturned: Long): BOOL =
    if (_windowsWin32DevicesFaxNapiAddon != null) (_windowsWin32DevicesFaxNapiAddon.windowssys_windows_win32_devices_fax_FaxEnumRoutingMethodsA(faxporthandle.toString(), routingmethod.toString(), methodsreturned.toString()) as Int) else 0

public actual fun FaxEnumRoutingMethodsW(faxporthandle: HANDLE, routingmethod: Long, methodsreturned: Long): BOOL =
    if (_windowsWin32DevicesFaxNapiAddon != null) (_windowsWin32DevicesFaxNapiAddon.windowssys_windows_win32_devices_fax_FaxEnumRoutingMethodsW(faxporthandle.toString(), routingmethod.toString(), methodsreturned.toString()) as Int) else 0

public actual fun FaxFreeBuffer(buffer: Long) {
    if (_windowsWin32DevicesFaxNapiAddon != null) {
        _windowsWin32DevicesFaxNapiAddon.windowssys_windows_win32_devices_fax_FaxFreeBuffer(buffer.toString())
    }
}

public actual fun FaxGetConfigurationA(faxhandle: HANDLE, faxconfig: Long): BOOL =
    if (_windowsWin32DevicesFaxNapiAddon != null) (_windowsWin32DevicesFaxNapiAddon.windowssys_windows_win32_devices_fax_FaxGetConfigurationA(faxhandle.toString(), faxconfig.toString()) as Int) else 0

public actual fun FaxGetConfigurationW(faxhandle: HANDLE, faxconfig: Long): BOOL =
    if (_windowsWin32DevicesFaxNapiAddon != null) (_windowsWin32DevicesFaxNapiAddon.windowssys_windows_win32_devices_fax_FaxGetConfigurationW(faxhandle.toString(), faxconfig.toString()) as Int) else 0

public actual fun FaxGetDeviceStatusA(faxporthandle: HANDLE, devicestatus: Long): BOOL =
    if (_windowsWin32DevicesFaxNapiAddon != null) (_windowsWin32DevicesFaxNapiAddon.windowssys_windows_win32_devices_fax_FaxGetDeviceStatusA(faxporthandle.toString(), devicestatus.toString()) as Int) else 0

public actual fun FaxGetDeviceStatusW(faxporthandle: HANDLE, devicestatus: Long): BOOL =
    if (_windowsWin32DevicesFaxNapiAddon != null) (_windowsWin32DevicesFaxNapiAddon.windowssys_windows_win32_devices_fax_FaxGetDeviceStatusW(faxporthandle.toString(), devicestatus.toString()) as Int) else 0

public actual fun FaxGetJobA(faxhandle: HANDLE, jobid: UInt, jobentry: Long): BOOL =
    if (_windowsWin32DevicesFaxNapiAddon != null) (_windowsWin32DevicesFaxNapiAddon.windowssys_windows_win32_devices_fax_FaxGetJobA(faxhandle.toString(), jobid.toInt(), jobentry.toString()) as Int) else 0

public actual fun FaxGetJobW(faxhandle: HANDLE, jobid: UInt, jobentry: Long): BOOL =
    if (_windowsWin32DevicesFaxNapiAddon != null) (_windowsWin32DevicesFaxNapiAddon.windowssys_windows_win32_devices_fax_FaxGetJobW(faxhandle.toString(), jobid.toInt(), jobentry.toString()) as Int) else 0

public actual fun FaxGetLoggingCategoriesA(faxhandle: HANDLE, categories: Long, numbercategories: Long): BOOL =
    if (_windowsWin32DevicesFaxNapiAddon != null) (_windowsWin32DevicesFaxNapiAddon.windowssys_windows_win32_devices_fax_FaxGetLoggingCategoriesA(faxhandle.toString(), categories.toString(), numbercategories.toString()) as Int) else 0

public actual fun FaxGetLoggingCategoriesW(faxhandle: HANDLE, categories: Long, numbercategories: Long): BOOL =
    if (_windowsWin32DevicesFaxNapiAddon != null) (_windowsWin32DevicesFaxNapiAddon.windowssys_windows_win32_devices_fax_FaxGetLoggingCategoriesW(faxhandle.toString(), categories.toString(), numbercategories.toString()) as Int) else 0

public actual fun FaxGetPageData(faxhandle: HANDLE, jobid: UInt, buffer: Long, buffersize: Long, imagewidth: Long, imageheight: Long): BOOL =
    if (_windowsWin32DevicesFaxNapiAddon != null) (_windowsWin32DevicesFaxNapiAddon.windowssys_windows_win32_devices_fax_FaxGetPageData(faxhandle.toString(), jobid.toInt(), buffer.toString(), buffersize.toString(), imagewidth.toString(), imageheight.toString()) as Int) else 0

public actual fun FaxGetPortA(faxporthandle: HANDLE, portinfo: Long): BOOL =
    if (_windowsWin32DevicesFaxNapiAddon != null) (_windowsWin32DevicesFaxNapiAddon.windowssys_windows_win32_devices_fax_FaxGetPortA(faxporthandle.toString(), portinfo.toString()) as Int) else 0

public actual fun FaxGetPortW(faxporthandle: HANDLE, portinfo: Long): BOOL =
    if (_windowsWin32DevicesFaxNapiAddon != null) (_windowsWin32DevicesFaxNapiAddon.windowssys_windows_win32_devices_fax_FaxGetPortW(faxporthandle.toString(), portinfo.toString()) as Int) else 0

public actual fun FaxGetRoutingInfoA(faxporthandle: HANDLE, routingguid: PCSTR, routinginfobuffer: Long, routinginfobuffersize: Long): BOOL =
    if (_windowsWin32DevicesFaxNapiAddon != null) (_windowsWin32DevicesFaxNapiAddon.windowssys_windows_win32_devices_fax_FaxGetRoutingInfoA(faxporthandle.toString(), routingguid.toString(), routinginfobuffer.toString(), routinginfobuffersize.toString()) as Int) else 0

public actual fun FaxGetRoutingInfoW(faxporthandle: HANDLE, routingguid: PCWSTR, routinginfobuffer: Long, routinginfobuffersize: Long): BOOL =
    if (_windowsWin32DevicesFaxNapiAddon != null) (_windowsWin32DevicesFaxNapiAddon.windowssys_windows_win32_devices_fax_FaxGetRoutingInfoW(faxporthandle.toString(), routingguid.toString(), routinginfobuffer.toString(), routinginfobuffersize.toString()) as Int) else 0

public actual fun FaxInitializeEventQueue(faxhandle: HANDLE, completionport: HANDLE, completionkey: ULong, hwnd: HWND, messagestart: UInt): BOOL =
    if (_windowsWin32DevicesFaxNapiAddon != null) (_windowsWin32DevicesFaxNapiAddon.windowssys_windows_win32_devices_fax_FaxInitializeEventQueue(faxhandle.toString(), completionport.toString(), completionkey.toString(), hwnd.toString(), messagestart.toInt()) as Int) else 0

public actual fun FaxOpenPort(faxhandle: HANDLE, deviceid: UInt, flags: UInt, faxporthandle: Long): BOOL =
    if (_windowsWin32DevicesFaxNapiAddon != null) (_windowsWin32DevicesFaxNapiAddon.windowssys_windows_win32_devices_fax_FaxOpenPort(faxhandle.toString(), deviceid.toInt(), flags.toInt(), faxporthandle.toString()) as Int) else 0

public actual fun FaxPrintCoverPageA(faxcontextinfo: Long, coverpageinfo: Long): BOOL =
    if (_windowsWin32DevicesFaxNapiAddon != null) (_windowsWin32DevicesFaxNapiAddon.windowssys_windows_win32_devices_fax_FaxPrintCoverPageA(faxcontextinfo.toString(), coverpageinfo.toString()) as Int) else 0

public actual fun FaxPrintCoverPageW(faxcontextinfo: Long, coverpageinfo: Long): BOOL =
    if (_windowsWin32DevicesFaxNapiAddon != null) (_windowsWin32DevicesFaxNapiAddon.windowssys_windows_win32_devices_fax_FaxPrintCoverPageW(faxcontextinfo.toString(), coverpageinfo.toString()) as Int) else 0

public actual fun FaxRegisterRoutingExtensionW(faxhandle: HANDLE, extensionname: PCWSTR, friendlyname: PCWSTR, imagename: PCWSTR, callback: PFAX_ROUTING_INSTALLATION_CALLBACKW, context: Long): BOOL =
    if (_windowsWin32DevicesFaxNapiAddon != null) (_windowsWin32DevicesFaxNapiAddon.windowssys_windows_win32_devices_fax_FaxRegisterRoutingExtensionW(faxhandle.toString(), extensionname.toString(), friendlyname.toString(), imagename.toString(), callback.toLong().toString(), context.toString()) as Int) else 0

public actual fun FaxRegisterServiceProviderW(deviceprovider: PCWSTR, friendlyname: PCWSTR, imagename: PCWSTR, tspname: PCWSTR): BOOL =
    if (_windowsWin32DevicesFaxNapiAddon != null) (_windowsWin32DevicesFaxNapiAddon.windowssys_windows_win32_devices_fax_FaxRegisterServiceProviderW(deviceprovider.toString(), friendlyname.toString(), imagename.toString(), tspname.toString()) as Int) else 0

public actual fun FaxSendDocumentA(faxhandle: HANDLE, filename: PCSTR, jobparams: Long, coverpageinfo: Long, faxjobid: Long): BOOL =
    if (_windowsWin32DevicesFaxNapiAddon != null) (_windowsWin32DevicesFaxNapiAddon.windowssys_windows_win32_devices_fax_FaxSendDocumentA(faxhandle.toString(), filename.toString(), jobparams.toString(), coverpageinfo.toString(), faxjobid.toString()) as Int) else 0

public actual fun FaxSendDocumentForBroadcastA(faxhandle: HANDLE, filename: PCSTR, faxjobid: Long, faxrecipientcallback: PFAX_RECIPIENT_CALLBACKA, context: Long): BOOL =
    if (_windowsWin32DevicesFaxNapiAddon != null) (_windowsWin32DevicesFaxNapiAddon.windowssys_windows_win32_devices_fax_FaxSendDocumentForBroadcastA(faxhandle.toString(), filename.toString(), faxjobid.toString(), faxrecipientcallback.toLong().toString(), context.toString()) as Int) else 0

public actual fun FaxSendDocumentForBroadcastW(faxhandle: HANDLE, filename: PCWSTR, faxjobid: Long, faxrecipientcallback: PFAX_RECIPIENT_CALLBACKW, context: Long): BOOL =
    if (_windowsWin32DevicesFaxNapiAddon != null) (_windowsWin32DevicesFaxNapiAddon.windowssys_windows_win32_devices_fax_FaxSendDocumentForBroadcastW(faxhandle.toString(), filename.toString(), faxjobid.toString(), faxrecipientcallback.toLong().toString(), context.toString()) as Int) else 0

public actual fun FaxSendDocumentW(faxhandle: HANDLE, filename: PCWSTR, jobparams: Long, coverpageinfo: Long, faxjobid: Long): BOOL =
    if (_windowsWin32DevicesFaxNapiAddon != null) (_windowsWin32DevicesFaxNapiAddon.windowssys_windows_win32_devices_fax_FaxSendDocumentW(faxhandle.toString(), filename.toString(), jobparams.toString(), coverpageinfo.toString(), faxjobid.toString()) as Int) else 0

public actual fun FaxSetConfigurationA(faxhandle: HANDLE, faxconfig: Long): BOOL =
    if (_windowsWin32DevicesFaxNapiAddon != null) (_windowsWin32DevicesFaxNapiAddon.windowssys_windows_win32_devices_fax_FaxSetConfigurationA(faxhandle.toString(), faxconfig.toString()) as Int) else 0

public actual fun FaxSetConfigurationW(faxhandle: HANDLE, faxconfig: Long): BOOL =
    if (_windowsWin32DevicesFaxNapiAddon != null) (_windowsWin32DevicesFaxNapiAddon.windowssys_windows_win32_devices_fax_FaxSetConfigurationW(faxhandle.toString(), faxconfig.toString()) as Int) else 0

public actual fun FaxSetGlobalRoutingInfoA(faxhandle: HANDLE, routinginfo: Long): BOOL =
    if (_windowsWin32DevicesFaxNapiAddon != null) (_windowsWin32DevicesFaxNapiAddon.windowssys_windows_win32_devices_fax_FaxSetGlobalRoutingInfoA(faxhandle.toString(), routinginfo.toString()) as Int) else 0

public actual fun FaxSetGlobalRoutingInfoW(faxhandle: HANDLE, routinginfo: Long): BOOL =
    if (_windowsWin32DevicesFaxNapiAddon != null) (_windowsWin32DevicesFaxNapiAddon.windowssys_windows_win32_devices_fax_FaxSetGlobalRoutingInfoW(faxhandle.toString(), routinginfo.toString()) as Int) else 0

public actual fun FaxSetJobA(faxhandle: HANDLE, jobid: UInt, command: UInt, jobentry: Long): BOOL =
    if (_windowsWin32DevicesFaxNapiAddon != null) (_windowsWin32DevicesFaxNapiAddon.windowssys_windows_win32_devices_fax_FaxSetJobA(faxhandle.toString(), jobid.toInt(), command.toInt(), jobentry.toString()) as Int) else 0

public actual fun FaxSetJobW(faxhandle: HANDLE, jobid: UInt, command: UInt, jobentry: Long): BOOL =
    if (_windowsWin32DevicesFaxNapiAddon != null) (_windowsWin32DevicesFaxNapiAddon.windowssys_windows_win32_devices_fax_FaxSetJobW(faxhandle.toString(), jobid.toInt(), command.toInt(), jobentry.toString()) as Int) else 0

public actual fun FaxSetLoggingCategoriesA(faxhandle: HANDLE, categories: Long, numbercategories: UInt): BOOL =
    if (_windowsWin32DevicesFaxNapiAddon != null) (_windowsWin32DevicesFaxNapiAddon.windowssys_windows_win32_devices_fax_FaxSetLoggingCategoriesA(faxhandle.toString(), categories.toString(), numbercategories.toInt()) as Int) else 0

public actual fun FaxSetLoggingCategoriesW(faxhandle: HANDLE, categories: Long, numbercategories: UInt): BOOL =
    if (_windowsWin32DevicesFaxNapiAddon != null) (_windowsWin32DevicesFaxNapiAddon.windowssys_windows_win32_devices_fax_FaxSetLoggingCategoriesW(faxhandle.toString(), categories.toString(), numbercategories.toInt()) as Int) else 0

public actual fun FaxSetPortA(faxporthandle: HANDLE, portinfo: Long): BOOL =
    if (_windowsWin32DevicesFaxNapiAddon != null) (_windowsWin32DevicesFaxNapiAddon.windowssys_windows_win32_devices_fax_FaxSetPortA(faxporthandle.toString(), portinfo.toString()) as Int) else 0

public actual fun FaxSetPortW(faxporthandle: HANDLE, portinfo: Long): BOOL =
    if (_windowsWin32DevicesFaxNapiAddon != null) (_windowsWin32DevicesFaxNapiAddon.windowssys_windows_win32_devices_fax_FaxSetPortW(faxporthandle.toString(), portinfo.toString()) as Int) else 0

public actual fun FaxSetRoutingInfoA(faxporthandle: HANDLE, routingguid: PCSTR, routinginfobuffer: Long, routinginfobuffersize: UInt): BOOL =
    if (_windowsWin32DevicesFaxNapiAddon != null) (_windowsWin32DevicesFaxNapiAddon.windowssys_windows_win32_devices_fax_FaxSetRoutingInfoA(faxporthandle.toString(), routingguid.toString(), routinginfobuffer.toString(), routinginfobuffersize.toInt()) as Int) else 0

public actual fun FaxSetRoutingInfoW(faxporthandle: HANDLE, routingguid: PCWSTR, routinginfobuffer: Long, routinginfobuffersize: UInt): BOOL =
    if (_windowsWin32DevicesFaxNapiAddon != null) (_windowsWin32DevicesFaxNapiAddon.windowssys_windows_win32_devices_fax_FaxSetRoutingInfoW(faxporthandle.toString(), routingguid.toString(), routinginfobuffer.toString(), routinginfobuffersize.toInt()) as Int) else 0

public actual fun FaxStartPrintJobA(printername: PCSTR, printinfo: Long, faxjobid: Long, faxcontextinfo: Long): BOOL =
    if (_windowsWin32DevicesFaxNapiAddon != null) (_windowsWin32DevicesFaxNapiAddon.windowssys_windows_win32_devices_fax_FaxStartPrintJobA(printername.toString(), printinfo.toString(), faxjobid.toString(), faxcontextinfo.toString()) as Int) else 0

public actual fun FaxStartPrintJobW(printername: PCWSTR, printinfo: Long, faxjobid: Long, faxcontextinfo: Long): BOOL =
    if (_windowsWin32DevicesFaxNapiAddon != null) (_windowsWin32DevicesFaxNapiAddon.windowssys_windows_win32_devices_fax_FaxStartPrintJobW(printername.toString(), printinfo.toString(), faxjobid.toString(), faxcontextinfo.toString()) as Int) else 0

public actual fun FaxUnregisterServiceProviderW(deviceprovider: PCWSTR): BOOL =
    if (_windowsWin32DevicesFaxNapiAddon != null) (_windowsWin32DevicesFaxNapiAddon.windowssys_windows_win32_devices_fax_FaxUnregisterServiceProviderW(deviceprovider.toString()) as Int) else 0

public actual fun SendToFaxRecipient(sndmode: SendToMode, lpfilename: PCWSTR): UInt =
    if (_windowsWin32DevicesFaxNapiAddon != null) (_windowsWin32DevicesFaxNapiAddon.windowssys_windows_win32_devices_fax_SendToFaxRecipient(sndmode, lpfilename.toString()) as Int).toUInt() else 0u

public actual fun StiCreateInstanceW(hinst: HINSTANCE, dwver: UInt, ppsti: Long, punkouter: Long): HRESULT =
    if (_windowsWin32DevicesFaxNapiAddon != null) (_windowsWin32DevicesFaxNapiAddon.windowssys_windows_win32_devices_fax_StiCreateInstanceW(hinst.toString(), dwver.toInt(), ppsti.toString(), punkouter.toString()) as Int) else 0
