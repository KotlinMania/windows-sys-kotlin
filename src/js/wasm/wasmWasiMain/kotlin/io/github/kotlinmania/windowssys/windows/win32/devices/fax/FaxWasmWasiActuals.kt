@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.fax

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

// The host must provide the C companion wrapper exports in import module windowssys.
@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesFaxCanSendToFaxRecipient")
private external fun wasiWindowssysWindowsWin32DevicesFaxCanSendToFaxRecipient(): Int

public actual fun canSendToFaxRecipient(): Bool =
    wasiWindowssysWindowsWin32DevicesFaxCanSendToFaxRecipient()

public actual fun faxAbort(faxhandle: Handle, jobid: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxAbort")

public actual fun faxAccessCheck(faxhandle: Handle, accessmask: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxAccessCheck")

public actual fun faxClose(faxhandle: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxClose")

public actual fun faxCompleteJobParamsA(jobparams: MutPtr, coverpageinfo: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxCompleteJobParamsA")

public actual fun faxCompleteJobParamsW(jobparams: MutPtr, coverpageinfo: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxCompleteJobParamsW")

public actual fun faxConnectFaxServerA(machinename: Pcstr, faxhandle: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxConnectFaxServerA")

public actual fun faxConnectFaxServerW(machinename: Pcwstr, faxhandle: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxConnectFaxServerW")

public actual fun faxEnableRoutingMethodA(faxporthandle: Handle, routingguid: Pcstr, enabled: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxEnableRoutingMethodA")

public actual fun faxEnableRoutingMethodW(faxporthandle: Handle, routingguid: Pcwstr, enabled: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxEnableRoutingMethodW")

public actual fun faxEnumGlobalRoutingInfoA(faxhandle: Handle, routinginfo: MutPtr, methodsreturned: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxEnumGlobalRoutingInfoA")

public actual fun faxEnumGlobalRoutingInfoW(faxhandle: Handle, routinginfo: MutPtr, methodsreturned: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxEnumGlobalRoutingInfoW")

public actual fun faxEnumJobsA(faxhandle: Handle, jobentry: MutPtr, jobsreturned: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxEnumJobsA")

public actual fun faxEnumJobsW(faxhandle: Handle, jobentry: MutPtr, jobsreturned: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxEnumJobsW")

public actual fun faxEnumPortsA(faxhandle: Handle, portinfo: MutPtr, portsreturned: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxEnumPortsA")

public actual fun faxEnumPortsW(faxhandle: Handle, portinfo: MutPtr, portsreturned: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxEnumPortsW")

public actual fun faxEnumRoutingMethodsA(faxporthandle: Handle, routingmethod: MutPtr, methodsreturned: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxEnumRoutingMethodsA")

public actual fun faxEnumRoutingMethodsW(faxporthandle: Handle, routingmethod: MutPtr, methodsreturned: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxEnumRoutingMethodsW")

public actual fun faxFreeBuffer(buffer: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxFreeBuffer")

public actual fun faxGetConfigurationA(faxhandle: Handle, faxconfig: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxGetConfigurationA")

public actual fun faxGetConfigurationW(faxhandle: Handle, faxconfig: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxGetConfigurationW")

public actual fun faxGetDeviceStatusA(faxporthandle: Handle, devicestatus: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxGetDeviceStatusA")

public actual fun faxGetDeviceStatusW(faxporthandle: Handle, devicestatus: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxGetDeviceStatusW")

public actual fun faxGetJobA(faxhandle: Handle, jobid: UInt, jobentry: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxGetJobA")

public actual fun faxGetJobW(faxhandle: Handle, jobid: UInt, jobentry: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxGetJobW")

public actual fun faxGetLoggingCategoriesA(faxhandle: Handle, categories: MutPtr, numbercategories: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxGetLoggingCategoriesA")

public actual fun faxGetLoggingCategoriesW(faxhandle: Handle, categories: MutPtr, numbercategories: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxGetLoggingCategoriesW")

public actual fun faxGetPageData(faxhandle: Handle, jobid: UInt, buffer: MutPtr, buffersize: MutPtr, imagewidth: MutPtr, imageheight: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxGetPageData")

public actual fun faxGetPortA(faxporthandle: Handle, portinfo: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxGetPortA")

public actual fun faxGetPortW(faxporthandle: Handle, portinfo: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxGetPortW")

public actual fun faxGetRoutingInfoA(faxporthandle: Handle, routingguid: Pcstr, routinginfobuffer: MutPtr, routinginfobuffersize: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxGetRoutingInfoA")

public actual fun faxGetRoutingInfoW(faxporthandle: Handle, routingguid: Pcwstr, routinginfobuffer: MutPtr, routinginfobuffersize: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxGetRoutingInfoW")

public actual fun faxInitializeEventQueue(faxhandle: Handle, completionport: Handle, completionkey: ULong, hwnd: Hwnd, messagestart: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxInitializeEventQueue")

public actual fun faxOpenPort(faxhandle: Handle, deviceid: UInt, flags: UInt, faxporthandle: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxOpenPort")

public actual fun faxPrintCoverPageA(faxcontextinfo: ConstPtr, coverpageinfo: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxPrintCoverPageA")

public actual fun faxPrintCoverPageW(faxcontextinfo: ConstPtr, coverpageinfo: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxPrintCoverPageW")

public actual fun faxRegisterRoutingExtensionW(faxhandle: Handle, extensionname: Pcwstr, friendlyname: Pcwstr, imagename: Pcwstr, callback: PfaxRoutingInstallationCallbackw, context: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxRegisterRoutingExtensionW")

public actual fun faxRegisterServiceProviderW(deviceprovider: Pcwstr, friendlyname: Pcwstr, imagename: Pcwstr, tspname: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxRegisterServiceProviderW")

public actual fun faxSendDocumentA(faxhandle: Handle, filename: Pcstr, jobparams: ConstPtr, coverpageinfo: ConstPtr, faxjobid: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxSendDocumentA")

public actual fun faxSendDocumentForBroadcastA(faxhandle: Handle, filename: Pcstr, faxjobid: MutPtr, faxrecipientcallback: PfaxRecipientCallbacka, context: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxSendDocumentForBroadcastA")

public actual fun faxSendDocumentForBroadcastW(faxhandle: Handle, filename: Pcwstr, faxjobid: MutPtr, faxrecipientcallback: PfaxRecipientCallbackw, context: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxSendDocumentForBroadcastW")

public actual fun faxSendDocumentW(faxhandle: Handle, filename: Pcwstr, jobparams: ConstPtr, coverpageinfo: ConstPtr, faxjobid: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxSendDocumentW")

public actual fun faxSetConfigurationA(faxhandle: Handle, faxconfig: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxSetConfigurationA")

public actual fun faxSetConfigurationW(faxhandle: Handle, faxconfig: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxSetConfigurationW")

public actual fun faxSetGlobalRoutingInfoA(faxhandle: Handle, routinginfo: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxSetGlobalRoutingInfoA")

public actual fun faxSetGlobalRoutingInfoW(faxhandle: Handle, routinginfo: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxSetGlobalRoutingInfoW")

public actual fun faxSetJobA(faxhandle: Handle, jobid: UInt, command: UInt, jobentry: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxSetJobA")

public actual fun faxSetJobW(faxhandle: Handle, jobid: UInt, command: UInt, jobentry: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxSetJobW")

public actual fun faxSetLoggingCategoriesA(faxhandle: Handle, categories: ConstPtr, numbercategories: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxSetLoggingCategoriesA")

public actual fun faxSetLoggingCategoriesW(faxhandle: Handle, categories: ConstPtr, numbercategories: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxSetLoggingCategoriesW")

public actual fun faxSetPortA(faxporthandle: Handle, portinfo: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxSetPortA")

public actual fun faxSetPortW(faxporthandle: Handle, portinfo: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxSetPortW")

public actual fun faxSetRoutingInfoA(faxporthandle: Handle, routingguid: Pcstr, routinginfobuffer: ConstPtr, routinginfobuffersize: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxSetRoutingInfoA")

public actual fun faxSetRoutingInfoW(faxporthandle: Handle, routingguid: Pcwstr, routinginfobuffer: ConstPtr, routinginfobuffersize: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxSetRoutingInfoW")

public actual fun faxStartPrintJobA(printername: Pcstr, printinfo: ConstPtr, faxjobid: MutPtr, faxcontextinfo: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxStartPrintJobA")

public actual fun faxStartPrintJobW(printername: Pcwstr, printinfo: ConstPtr, faxjobid: MutPtr, faxcontextinfo: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxStartPrintJobW")

public actual fun faxUnregisterServiceProviderW(deviceprovider: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxUnregisterServiceProviderW")

public actual fun sendToFaxRecipient(sndmode: SendToMode, lpfilename: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxSendToFaxRecipient")

public actual fun stiCreateInstanceW(hinst: Hinstance, dwver: UInt, ppsti: MutPtr, punkouter: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxStiCreateInstanceW")
