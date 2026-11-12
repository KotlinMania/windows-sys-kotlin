@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

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

public actual fun faxCompleteJobParamsA(jobparams: MutPtr<MutPtr<FaxJobParama>>, coverpageinfo: MutPtr<MutPtr<FaxCoverpageInfoa>>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxCompleteJobParamsA")

public actual fun faxCompleteJobParamsW(jobparams: MutPtr<MutPtr<FaxJobParamw>>, coverpageinfo: MutPtr<MutPtr<FaxCoverpageInfow>>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxCompleteJobParamsW")

public actual fun faxConnectFaxServerA(machinename: Pcstr, faxhandle: MutPtr<Handle>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxConnectFaxServerA")

public actual fun faxConnectFaxServerW(machinename: Pcwstr, faxhandle: MutPtr<Handle>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxConnectFaxServerW")

public actual fun faxEnableRoutingMethodA(faxporthandle: Handle, routingguid: Pcstr, enabled: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxEnableRoutingMethodA")

public actual fun faxEnableRoutingMethodW(faxporthandle: Handle, routingguid: Pcwstr, enabled: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxEnableRoutingMethodW")

public actual fun faxEnumGlobalRoutingInfoA(faxhandle: Handle, routinginfo: MutPtr<MutPtr<FaxGlobalRoutingInfoa>>, methodsreturned: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxEnumGlobalRoutingInfoA")

public actual fun faxEnumGlobalRoutingInfoW(faxhandle: Handle, routinginfo: MutPtr<MutPtr<FaxGlobalRoutingInfow>>, methodsreturned: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxEnumGlobalRoutingInfoW")

public actual fun faxEnumJobsA(faxhandle: Handle, jobentry: MutPtr<MutPtr<FaxJobEntrya>>, jobsreturned: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxEnumJobsA")

public actual fun faxEnumJobsW(faxhandle: Handle, jobentry: MutPtr<MutPtr<FaxJobEntryw>>, jobsreturned: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxEnumJobsW")

public actual fun faxEnumPortsA(faxhandle: Handle, portinfo: MutPtr<MutPtr<FaxPortInfoa>>, portsreturned: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxEnumPortsA")

public actual fun faxEnumPortsW(faxhandle: Handle, portinfo: MutPtr<MutPtr<FaxPortInfow>>, portsreturned: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxEnumPortsW")

public actual fun faxEnumRoutingMethodsA(faxporthandle: Handle, routingmethod: MutPtr<MutPtr<FaxRoutingMethoda>>, methodsreturned: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxEnumRoutingMethodsA")

public actual fun faxEnumRoutingMethodsW(faxporthandle: Handle, routingmethod: MutPtr<MutPtr<FaxRoutingMethodw>>, methodsreturned: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxEnumRoutingMethodsW")

public actual fun faxFreeBuffer(buffer: MutPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxFreeBuffer")

public actual fun faxGetConfigurationA(faxhandle: Handle, faxconfig: MutPtr<MutPtr<FaxConfigurationa>>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxGetConfigurationA")

public actual fun faxGetConfigurationW(faxhandle: Handle, faxconfig: MutPtr<MutPtr<FaxConfigurationw>>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxGetConfigurationW")

public actual fun faxGetDeviceStatusA(faxporthandle: Handle, devicestatus: MutPtr<MutPtr<FaxDeviceStatusa>>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxGetDeviceStatusA")

public actual fun faxGetDeviceStatusW(faxporthandle: Handle, devicestatus: MutPtr<MutPtr<FaxDeviceStatusw>>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxGetDeviceStatusW")

public actual fun faxGetJobA(faxhandle: Handle, jobid: UInt, jobentry: MutPtr<MutPtr<FaxJobEntrya>>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxGetJobA")

public actual fun faxGetJobW(faxhandle: Handle, jobid: UInt, jobentry: MutPtr<MutPtr<FaxJobEntryw>>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxGetJobW")

public actual fun faxGetLoggingCategoriesA(faxhandle: Handle, categories: MutPtr<MutPtr<FaxLogCategorya>>, numbercategories: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxGetLoggingCategoriesA")

public actual fun faxGetLoggingCategoriesW(faxhandle: Handle, categories: MutPtr<MutPtr<FaxLogCategoryw>>, numbercategories: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxGetLoggingCategoriesW")

public actual fun faxGetPageData(faxhandle: Handle, jobid: UInt, buffer: MutPtr<MutPtr<UByte>>, buffersize: MutPtr<UInt>, imagewidth: MutPtr<UInt>, imageheight: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxGetPageData")

public actual fun faxGetPortA(faxporthandle: Handle, portinfo: MutPtr<MutPtr<FaxPortInfoa>>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxGetPortA")

public actual fun faxGetPortW(faxporthandle: Handle, portinfo: MutPtr<MutPtr<FaxPortInfow>>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxGetPortW")

public actual fun faxGetRoutingInfoA(faxporthandle: Handle, routingguid: Pcstr, routinginfobuffer: MutPtr<MutPtr<UByte>>, routinginfobuffersize: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxGetRoutingInfoA")

public actual fun faxGetRoutingInfoW(faxporthandle: Handle, routingguid: Pcwstr, routinginfobuffer: MutPtr<MutPtr<UByte>>, routinginfobuffersize: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxGetRoutingInfoW")

public actual fun faxInitializeEventQueue(faxhandle: Handle, completionport: Handle, completionkey: ULong, hwnd: Hwnd, messagestart: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxInitializeEventQueue")

public actual fun faxOpenPort(faxhandle: Handle, deviceid: UInt, flags: UInt, faxporthandle: MutPtr<Handle>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxOpenPort")

public actual fun faxPrintCoverPageA(faxcontextinfo: ConstPtr<FaxContextInfoa>, coverpageinfo: ConstPtr<FaxCoverpageInfoa>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxPrintCoverPageA")

public actual fun faxPrintCoverPageW(faxcontextinfo: ConstPtr<FaxContextInfow>, coverpageinfo: ConstPtr<FaxCoverpageInfow>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxPrintCoverPageW")

public actual fun faxRegisterRoutingExtensionW(faxhandle: Handle, extensionname: Pcwstr, friendlyname: Pcwstr, imagename: Pcwstr, callback: PfaxRoutingInstallationCallbackw, context: ConstPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxRegisterRoutingExtensionW")

public actual fun faxRegisterServiceProviderW(deviceprovider: Pcwstr, friendlyname: Pcwstr, imagename: Pcwstr, tspname: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxRegisterServiceProviderW")

public actual fun faxSendDocumentA(faxhandle: Handle, filename: Pcstr, jobparams: ConstPtr<FaxJobParama>, coverpageinfo: ConstPtr<FaxCoverpageInfoa>, faxjobid: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxSendDocumentA")

public actual fun faxSendDocumentForBroadcastA(faxhandle: Handle, filename: Pcstr, faxjobid: MutPtr<UInt>, faxrecipientcallback: PfaxRecipientCallbacka, context: ConstPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxSendDocumentForBroadcastA")

public actual fun faxSendDocumentForBroadcastW(faxhandle: Handle, filename: Pcwstr, faxjobid: MutPtr<UInt>, faxrecipientcallback: PfaxRecipientCallbackw, context: ConstPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxSendDocumentForBroadcastW")

public actual fun faxSendDocumentW(faxhandle: Handle, filename: Pcwstr, jobparams: ConstPtr<FaxJobParamw>, coverpageinfo: ConstPtr<FaxCoverpageInfow>, faxjobid: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxSendDocumentW")

public actual fun faxSetConfigurationA(faxhandle: Handle, faxconfig: ConstPtr<FaxConfigurationa>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxSetConfigurationA")

public actual fun faxSetConfigurationW(faxhandle: Handle, faxconfig: ConstPtr<FaxConfigurationw>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxSetConfigurationW")

public actual fun faxSetGlobalRoutingInfoA(faxhandle: Handle, routinginfo: ConstPtr<FaxGlobalRoutingInfoa>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxSetGlobalRoutingInfoA")

public actual fun faxSetGlobalRoutingInfoW(faxhandle: Handle, routinginfo: ConstPtr<FaxGlobalRoutingInfow>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxSetGlobalRoutingInfoW")

public actual fun faxSetJobA(faxhandle: Handle, jobid: UInt, command: UInt, jobentry: ConstPtr<FaxJobEntrya>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxSetJobA")

public actual fun faxSetJobW(faxhandle: Handle, jobid: UInt, command: UInt, jobentry: ConstPtr<FaxJobEntryw>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxSetJobW")

public actual fun faxSetLoggingCategoriesA(faxhandle: Handle, categories: ConstPtr<FaxLogCategorya>, numbercategories: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxSetLoggingCategoriesA")

public actual fun faxSetLoggingCategoriesW(faxhandle: Handle, categories: ConstPtr<FaxLogCategoryw>, numbercategories: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxSetLoggingCategoriesW")

public actual fun faxSetPortA(faxporthandle: Handle, portinfo: ConstPtr<FaxPortInfoa>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxSetPortA")

public actual fun faxSetPortW(faxporthandle: Handle, portinfo: ConstPtr<FaxPortInfow>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxSetPortW")

public actual fun faxSetRoutingInfoA(faxporthandle: Handle, routingguid: Pcstr, routinginfobuffer: ConstPtr<UByte>, routinginfobuffersize: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxSetRoutingInfoA")

public actual fun faxSetRoutingInfoW(faxporthandle: Handle, routingguid: Pcwstr, routinginfobuffer: ConstPtr<UByte>, routinginfobuffersize: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxSetRoutingInfoW")

public actual fun faxStartPrintJobA(printername: Pcstr, printinfo: ConstPtr<FaxPrintInfoa>, faxjobid: MutPtr<UInt>, faxcontextinfo: MutPtr<FaxContextInfoa>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxStartPrintJobA")

public actual fun faxStartPrintJobW(printername: Pcwstr, printinfo: ConstPtr<FaxPrintInfow>, faxjobid: MutPtr<UInt>, faxcontextinfo: MutPtr<FaxContextInfow>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxStartPrintJobW")

public actual fun faxUnregisterServiceProviderW(deviceprovider: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxFaxUnregisterServiceProviderW")

public actual fun sendToFaxRecipient(sndmode: SendToMode, lpfilename: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxSendToFaxRecipient")

public actual fun stiCreateInstanceW(hinst: Hinstance, dwver: UInt, ppsti: MutPtr<MutPtr<CVoid>>, punkouter: MutPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesFaxStiCreateInstanceW")
