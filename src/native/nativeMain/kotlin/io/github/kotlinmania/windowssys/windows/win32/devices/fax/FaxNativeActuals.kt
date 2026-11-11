@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.fax

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_canSendToFaxRecipient
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_faxAbort
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_faxAccessCheck
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_faxClose
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_faxCompleteJobParamsA
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_faxCompleteJobParamsW
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_faxConnectFaxServerA
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_faxConnectFaxServerW
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_faxEnableRoutingMethodA
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_faxEnableRoutingMethodW
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_faxEnumGlobalRoutingInfoA
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_faxEnumGlobalRoutingInfoW
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_faxEnumJobsA
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_faxEnumJobsW
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_faxEnumPortsA
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_faxEnumPortsW
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_faxEnumRoutingMethodsA
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_faxEnumRoutingMethodsW
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_faxFreeBuffer
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_faxGetConfigurationA
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_faxGetConfigurationW
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_faxGetDeviceStatusA
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_faxGetDeviceStatusW
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_faxGetJobA
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_faxGetJobW
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_faxGetLoggingCategoriesA
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_faxGetLoggingCategoriesW
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_faxGetPageData
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_faxGetPortA
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_faxGetPortW
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_faxGetRoutingInfoA
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_faxGetRoutingInfoW
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_faxInitializeEventQueue
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_faxOpenPort
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_faxPrintCoverPageA
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_faxPrintCoverPageW
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_faxRegisterRoutingExtensionW
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_faxRegisterServiceProviderW
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_faxSendDocumentA
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_faxSendDocumentForBroadcastA
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_faxSendDocumentForBroadcastW
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_faxSendDocumentW
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_faxSetConfigurationA
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_faxSetConfigurationW
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_faxSetGlobalRoutingInfoA
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_faxSetGlobalRoutingInfoW
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_faxSetJobA
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_faxSetJobW
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_faxSetLoggingCategoriesA
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_faxSetLoggingCategoriesW
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_faxSetPortA
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_faxSetPortW
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_faxSetRoutingInfoA
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_faxSetRoutingInfoW
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_faxStartPrintJobA
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_faxStartPrintJobW
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_faxUnregisterServiceProviderW
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_sendToFaxRecipient
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_stiCreateInstanceW
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun canSendToFaxRecipient(): Bool =
    windowssys_windows_win32_devices_fax_canSendToFaxRecipient()

public actual fun faxAbort(faxhandle: Handle, jobid: UInt): Bool =
    windowssys_windows_win32_devices_fax_faxAbort(faxhandle?.value?.toCPointer<ByteVar>(), jobid)

public actual fun faxAccessCheck(faxhandle: Handle, accessmask: UInt): Bool =
    windowssys_windows_win32_devices_fax_faxAccessCheck(faxhandle?.value?.toCPointer<ByteVar>(), accessmask)

public actual fun faxClose(faxhandle: Handle): Bool =
    windowssys_windows_win32_devices_fax_faxClose(faxhandle?.value?.toCPointer<ByteVar>())

public actual fun faxCompleteJobParamsA(jobparams: COpaquePointer?, coverpageinfo: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_fax_faxCompleteJobParamsA(jobparams?.value?.toCPointer<ByteVar>(), coverpageinfo?.value?.toCPointer<ByteVar>())

public actual fun faxCompleteJobParamsW(jobparams: COpaquePointer?, coverpageinfo: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_fax_faxCompleteJobParamsW(jobparams?.value?.toCPointer<ByteVar>(), coverpageinfo?.value?.toCPointer<ByteVar>())

public actual fun faxConnectFaxServerA(machinename: Pcstr, faxhandle: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_fax_faxConnectFaxServerA(machinename?.value?.toCPointer<ByteVar>(), faxhandle?.value?.toCPointer<ByteVar>())

public actual fun faxConnectFaxServerW(machinename: Pcwstr, faxhandle: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_fax_faxConnectFaxServerW(machinename?.value?.toCPointer<ByteVar>(), faxhandle?.value?.toCPointer<ByteVar>())

public actual fun faxEnableRoutingMethodA(faxporthandle: Handle, routingguid: Pcstr, enabled: Bool): Bool =
    windowssys_windows_win32_devices_fax_faxEnableRoutingMethodA(faxporthandle?.value?.toCPointer<ByteVar>(), routingguid?.value?.toCPointer<ByteVar>(), enabled)

public actual fun faxEnableRoutingMethodW(faxporthandle: Handle, routingguid: Pcwstr, enabled: Bool): Bool =
    windowssys_windows_win32_devices_fax_faxEnableRoutingMethodW(faxporthandle?.value?.toCPointer<ByteVar>(), routingguid?.value?.toCPointer<ByteVar>(), enabled)

public actual fun faxEnumGlobalRoutingInfoA(faxhandle: Handle, routinginfo: COpaquePointer?, methodsreturned: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_fax_faxEnumGlobalRoutingInfoA(faxhandle?.value?.toCPointer<ByteVar>(), routinginfo?.value?.toCPointer<ByteVar>(), methodsreturned?.value?.toCPointer<ByteVar>())

public actual fun faxEnumGlobalRoutingInfoW(faxhandle: Handle, routinginfo: COpaquePointer?, methodsreturned: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_fax_faxEnumGlobalRoutingInfoW(faxhandle?.value?.toCPointer<ByteVar>(), routinginfo?.value?.toCPointer<ByteVar>(), methodsreturned?.value?.toCPointer<ByteVar>())

public actual fun faxEnumJobsA(faxhandle: Handle, jobentry: COpaquePointer?, jobsreturned: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_fax_faxEnumJobsA(faxhandle?.value?.toCPointer<ByteVar>(), jobentry?.value?.toCPointer<ByteVar>(), jobsreturned?.value?.toCPointer<ByteVar>())

public actual fun faxEnumJobsW(faxhandle: Handle, jobentry: COpaquePointer?, jobsreturned: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_fax_faxEnumJobsW(faxhandle?.value?.toCPointer<ByteVar>(), jobentry?.value?.toCPointer<ByteVar>(), jobsreturned?.value?.toCPointer<ByteVar>())

public actual fun faxEnumPortsA(faxhandle: Handle, portinfo: COpaquePointer?, portsreturned: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_fax_faxEnumPortsA(faxhandle?.value?.toCPointer<ByteVar>(), portinfo?.value?.toCPointer<ByteVar>(), portsreturned?.value?.toCPointer<ByteVar>())

public actual fun faxEnumPortsW(faxhandle: Handle, portinfo: COpaquePointer?, portsreturned: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_fax_faxEnumPortsW(faxhandle?.value?.toCPointer<ByteVar>(), portinfo?.value?.toCPointer<ByteVar>(), portsreturned?.value?.toCPointer<ByteVar>())

public actual fun faxEnumRoutingMethodsA(faxporthandle: Handle, routingmethod: COpaquePointer?, methodsreturned: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_fax_faxEnumRoutingMethodsA(faxporthandle?.value?.toCPointer<ByteVar>(), routingmethod?.value?.toCPointer<ByteVar>(), methodsreturned?.value?.toCPointer<ByteVar>())

public actual fun faxEnumRoutingMethodsW(faxporthandle: Handle, routingmethod: COpaquePointer?, methodsreturned: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_fax_faxEnumRoutingMethodsW(faxporthandle?.value?.toCPointer<ByteVar>(), routingmethod?.value?.toCPointer<ByteVar>(), methodsreturned?.value?.toCPointer<ByteVar>())

public actual fun faxFreeBuffer(buffer: COpaquePointer?) {
    windowssys_windows_win32_devices_fax_faxFreeBuffer(buffer?.value?.toCPointer<ByteVar>())
}

public actual fun faxGetConfigurationA(faxhandle: Handle, faxconfig: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_fax_faxGetConfigurationA(faxhandle?.value?.toCPointer<ByteVar>(), faxconfig?.value?.toCPointer<ByteVar>())

public actual fun faxGetConfigurationW(faxhandle: Handle, faxconfig: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_fax_faxGetConfigurationW(faxhandle?.value?.toCPointer<ByteVar>(), faxconfig?.value?.toCPointer<ByteVar>())

public actual fun faxGetDeviceStatusA(faxporthandle: Handle, devicestatus: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_fax_faxGetDeviceStatusA(faxporthandle?.value?.toCPointer<ByteVar>(), devicestatus?.value?.toCPointer<ByteVar>())

public actual fun faxGetDeviceStatusW(faxporthandle: Handle, devicestatus: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_fax_faxGetDeviceStatusW(faxporthandle?.value?.toCPointer<ByteVar>(), devicestatus?.value?.toCPointer<ByteVar>())

public actual fun faxGetJobA(faxhandle: Handle, jobid: UInt, jobentry: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_fax_faxGetJobA(faxhandle?.value?.toCPointer<ByteVar>(), jobid, jobentry?.value?.toCPointer<ByteVar>())

public actual fun faxGetJobW(faxhandle: Handle, jobid: UInt, jobentry: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_fax_faxGetJobW(faxhandle?.value?.toCPointer<ByteVar>(), jobid, jobentry?.value?.toCPointer<ByteVar>())

public actual fun faxGetLoggingCategoriesA(faxhandle: Handle, categories: COpaquePointer?, numbercategories: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_fax_faxGetLoggingCategoriesA(faxhandle?.value?.toCPointer<ByteVar>(), categories?.value?.toCPointer<ByteVar>(), numbercategories?.value?.toCPointer<ByteVar>())

public actual fun faxGetLoggingCategoriesW(faxhandle: Handle, categories: COpaquePointer?, numbercategories: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_fax_faxGetLoggingCategoriesW(faxhandle?.value?.toCPointer<ByteVar>(), categories?.value?.toCPointer<ByteVar>(), numbercategories?.value?.toCPointer<ByteVar>())

public actual fun faxGetPageData(faxhandle: Handle, jobid: UInt, buffer: COpaquePointer?, buffersize: COpaquePointer?, imagewidth: COpaquePointer?, imageheight: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_fax_faxGetPageData(faxhandle?.value?.toCPointer<ByteVar>(), jobid, buffer?.value?.toCPointer<ByteVar>(), buffersize?.value?.toCPointer<ByteVar>(), imagewidth?.value?.toCPointer<ByteVar>(), imageheight?.value?.toCPointer<ByteVar>())

public actual fun faxGetPortA(faxporthandle: Handle, portinfo: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_fax_faxGetPortA(faxporthandle?.value?.toCPointer<ByteVar>(), portinfo?.value?.toCPointer<ByteVar>())

public actual fun faxGetPortW(faxporthandle: Handle, portinfo: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_fax_faxGetPortW(faxporthandle?.value?.toCPointer<ByteVar>(), portinfo?.value?.toCPointer<ByteVar>())

public actual fun faxGetRoutingInfoA(faxporthandle: Handle, routingguid: Pcstr, routinginfobuffer: COpaquePointer?, routinginfobuffersize: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_fax_faxGetRoutingInfoA(faxporthandle?.value?.toCPointer<ByteVar>(), routingguid?.value?.toCPointer<ByteVar>(), routinginfobuffer?.value?.toCPointer<ByteVar>(), routinginfobuffersize?.value?.toCPointer<ByteVar>())

public actual fun faxGetRoutingInfoW(faxporthandle: Handle, routingguid: Pcwstr, routinginfobuffer: COpaquePointer?, routinginfobuffersize: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_fax_faxGetRoutingInfoW(faxporthandle?.value?.toCPointer<ByteVar>(), routingguid?.value?.toCPointer<ByteVar>(), routinginfobuffer?.value?.toCPointer<ByteVar>(), routinginfobuffersize?.value?.toCPointer<ByteVar>())

public actual fun faxInitializeEventQueue(faxhandle: Handle, completionport: Handle, completionkey: ULong, hwnd: Hwnd, messagestart: UInt): Bool =
    windowssys_windows_win32_devices_fax_faxInitializeEventQueue(faxhandle?.value?.toCPointer<ByteVar>(), completionport?.value?.toCPointer<ByteVar>(), completionkey, hwnd?.value?.toCPointer<ByteVar>(), messagestart)

public actual fun faxOpenPort(faxhandle: Handle, deviceid: UInt, flags: UInt, faxporthandle: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_fax_faxOpenPort(faxhandle?.value?.toCPointer<ByteVar>(), deviceid, flags, faxporthandle?.value?.toCPointer<ByteVar>())

public actual fun faxPrintCoverPageA(faxcontextinfo: COpaquePointer?, coverpageinfo: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_fax_faxPrintCoverPageA(faxcontextinfo?.value?.toCPointer<ByteVar>(), coverpageinfo?.value?.toCPointer<ByteVar>())

public actual fun faxPrintCoverPageW(faxcontextinfo: COpaquePointer?, coverpageinfo: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_fax_faxPrintCoverPageW(faxcontextinfo?.value?.toCPointer<ByteVar>(), coverpageinfo?.value?.toCPointer<ByteVar>())

public actual fun faxRegisterRoutingExtensionW(faxhandle: Handle, extensionname: Pcwstr, friendlyname: Pcwstr, imagename: Pcwstr, callback: PfaxRoutingInstallationCallbackw, context: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_fax_faxRegisterRoutingExtensionW(faxhandle?.value?.toCPointer<ByteVar>(), extensionname?.value?.toCPointer<ByteVar>(), friendlyname?.value?.toCPointer<ByteVar>(), imagename?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>())

public actual fun faxRegisterServiceProviderW(deviceprovider: Pcwstr, friendlyname: Pcwstr, imagename: Pcwstr, tspname: Pcwstr): Bool =
    windowssys_windows_win32_devices_fax_faxRegisterServiceProviderW(deviceprovider?.value?.toCPointer<ByteVar>(), friendlyname?.value?.toCPointer<ByteVar>(), imagename?.value?.toCPointer<ByteVar>(), tspname?.value?.toCPointer<ByteVar>())

public actual fun faxSendDocumentA(faxhandle: Handle, filename: Pcstr, jobparams: COpaquePointer?, coverpageinfo: COpaquePointer?, faxjobid: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_fax_faxSendDocumentA(faxhandle?.value?.toCPointer<ByteVar>(), filename?.value?.toCPointer<ByteVar>(), jobparams?.value?.toCPointer<ByteVar>(), coverpageinfo?.value?.toCPointer<ByteVar>(), faxjobid?.value?.toCPointer<ByteVar>())

public actual fun faxSendDocumentForBroadcastA(faxhandle: Handle, filename: Pcstr, faxjobid: COpaquePointer?, faxrecipientcallback: PfaxRecipientCallbacka, context: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_fax_faxSendDocumentForBroadcastA(faxhandle?.value?.toCPointer<ByteVar>(), filename?.value?.toCPointer<ByteVar>(), faxjobid?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>())

public actual fun faxSendDocumentForBroadcastW(faxhandle: Handle, filename: Pcwstr, faxjobid: COpaquePointer?, faxrecipientcallback: PfaxRecipientCallbackw, context: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_fax_faxSendDocumentForBroadcastW(faxhandle?.value?.toCPointer<ByteVar>(), filename?.value?.toCPointer<ByteVar>(), faxjobid?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>())

public actual fun faxSendDocumentW(faxhandle: Handle, filename: Pcwstr, jobparams: COpaquePointer?, coverpageinfo: COpaquePointer?, faxjobid: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_fax_faxSendDocumentW(faxhandle?.value?.toCPointer<ByteVar>(), filename?.value?.toCPointer<ByteVar>(), jobparams?.value?.toCPointer<ByteVar>(), coverpageinfo?.value?.toCPointer<ByteVar>(), faxjobid?.value?.toCPointer<ByteVar>())

public actual fun faxSetConfigurationA(faxhandle: Handle, faxconfig: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_fax_faxSetConfigurationA(faxhandle?.value?.toCPointer<ByteVar>(), faxconfig?.value?.toCPointer<ByteVar>())

public actual fun faxSetConfigurationW(faxhandle: Handle, faxconfig: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_fax_faxSetConfigurationW(faxhandle?.value?.toCPointer<ByteVar>(), faxconfig?.value?.toCPointer<ByteVar>())

public actual fun faxSetGlobalRoutingInfoA(faxhandle: Handle, routinginfo: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_fax_faxSetGlobalRoutingInfoA(faxhandle?.value?.toCPointer<ByteVar>(), routinginfo?.value?.toCPointer<ByteVar>())

public actual fun faxSetGlobalRoutingInfoW(faxhandle: Handle, routinginfo: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_fax_faxSetGlobalRoutingInfoW(faxhandle?.value?.toCPointer<ByteVar>(), routinginfo?.value?.toCPointer<ByteVar>())

public actual fun faxSetJobA(faxhandle: Handle, jobid: UInt, command: UInt, jobentry: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_fax_faxSetJobA(faxhandle?.value?.toCPointer<ByteVar>(), jobid, command, jobentry?.value?.toCPointer<ByteVar>())

public actual fun faxSetJobW(faxhandle: Handle, jobid: UInt, command: UInt, jobentry: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_fax_faxSetJobW(faxhandle?.value?.toCPointer<ByteVar>(), jobid, command, jobentry?.value?.toCPointer<ByteVar>())

public actual fun faxSetLoggingCategoriesA(faxhandle: Handle, categories: COpaquePointer?, numbercategories: UInt): Bool =
    windowssys_windows_win32_devices_fax_faxSetLoggingCategoriesA(faxhandle?.value?.toCPointer<ByteVar>(), categories?.value?.toCPointer<ByteVar>(), numbercategories)

public actual fun faxSetLoggingCategoriesW(faxhandle: Handle, categories: COpaquePointer?, numbercategories: UInt): Bool =
    windowssys_windows_win32_devices_fax_faxSetLoggingCategoriesW(faxhandle?.value?.toCPointer<ByteVar>(), categories?.value?.toCPointer<ByteVar>(), numbercategories)

public actual fun faxSetPortA(faxporthandle: Handle, portinfo: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_fax_faxSetPortA(faxporthandle?.value?.toCPointer<ByteVar>(), portinfo?.value?.toCPointer<ByteVar>())

public actual fun faxSetPortW(faxporthandle: Handle, portinfo: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_fax_faxSetPortW(faxporthandle?.value?.toCPointer<ByteVar>(), portinfo?.value?.toCPointer<ByteVar>())

public actual fun faxSetRoutingInfoA(faxporthandle: Handle, routingguid: Pcstr, routinginfobuffer: COpaquePointer?, routinginfobuffersize: UInt): Bool =
    windowssys_windows_win32_devices_fax_faxSetRoutingInfoA(faxporthandle?.value?.toCPointer<ByteVar>(), routingguid?.value?.toCPointer<ByteVar>(), routinginfobuffer?.value?.toCPointer<ByteVar>(), routinginfobuffersize)

public actual fun faxSetRoutingInfoW(faxporthandle: Handle, routingguid: Pcwstr, routinginfobuffer: COpaquePointer?, routinginfobuffersize: UInt): Bool =
    windowssys_windows_win32_devices_fax_faxSetRoutingInfoW(faxporthandle?.value?.toCPointer<ByteVar>(), routingguid?.value?.toCPointer<ByteVar>(), routinginfobuffer?.value?.toCPointer<ByteVar>(), routinginfobuffersize)

public actual fun faxStartPrintJobA(printername: Pcstr, printinfo: COpaquePointer?, faxjobid: COpaquePointer?, faxcontextinfo: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_fax_faxStartPrintJobA(printername?.value?.toCPointer<ByteVar>(), printinfo?.value?.toCPointer<ByteVar>(), faxjobid?.value?.toCPointer<ByteVar>(), faxcontextinfo?.value?.toCPointer<ByteVar>())

public actual fun faxStartPrintJobW(printername: Pcwstr, printinfo: COpaquePointer?, faxjobid: COpaquePointer?, faxcontextinfo: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_fax_faxStartPrintJobW(printername?.value?.toCPointer<ByteVar>(), printinfo?.value?.toCPointer<ByteVar>(), faxjobid?.value?.toCPointer<ByteVar>(), faxcontextinfo?.value?.toCPointer<ByteVar>())

public actual fun faxUnregisterServiceProviderW(deviceprovider: Pcwstr): Bool =
    windowssys_windows_win32_devices_fax_faxUnregisterServiceProviderW(deviceprovider?.value?.toCPointer<ByteVar>())

public actual fun sendToFaxRecipient(sndmode: SendToMode, lpfilename: Pcwstr): UInt =
    windowssys_windows_win32_devices_fax_sendToFaxRecipient(sndmode, lpfilename?.value?.toCPointer<ByteVar>())

public actual fun stiCreateInstanceW(hinst: Hinstance, dwver: UInt, ppsti: COpaquePointer?, punkouter: COpaquePointer?): Hresult =
    windowssys_windows_win32_devices_fax_stiCreateInstanceW(hinst?.value?.toCPointer<ByteVar>(), dwver, ppsti?.value?.toCPointer<ByteVar>(), punkouter?.value?.toCPointer<ByteVar>())
