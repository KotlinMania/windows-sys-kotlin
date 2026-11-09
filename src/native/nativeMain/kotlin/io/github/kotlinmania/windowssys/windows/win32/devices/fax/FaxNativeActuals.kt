@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.fax

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HINSTANCE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun CanSendToFaxRecipient(): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_CanSendToFaxRecipient()

public actual fun FaxAbort(faxhandle: HANDLE, jobid: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_FaxAbort(faxhandle.toCPointer<ByteVar>(), jobid)

public actual fun FaxAccessCheck(faxhandle: HANDLE, accessmask: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_FaxAccessCheck(faxhandle.toCPointer<ByteVar>(), accessmask)

public actual fun FaxClose(faxhandle: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_FaxClose(faxhandle.toCPointer<ByteVar>())

public actual fun FaxCompleteJobParamsA(jobparams: Long, coverpageinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_FaxCompleteJobParamsA(jobparams.toCPointer<ByteVar>(), coverpageinfo.toCPointer<ByteVar>())

public actual fun FaxCompleteJobParamsW(jobparams: Long, coverpageinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_FaxCompleteJobParamsW(jobparams.toCPointer<ByteVar>(), coverpageinfo.toCPointer<ByteVar>())

public actual fun FaxConnectFaxServerA(machinename: PCSTR, faxhandle: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_FaxConnectFaxServerA(machinename.toCPointer<ByteVar>(), faxhandle.toCPointer<ByteVar>())

public actual fun FaxConnectFaxServerW(machinename: PCWSTR, faxhandle: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_FaxConnectFaxServerW(machinename.toCPointer<ByteVar>(), faxhandle.toCPointer<ByteVar>())

public actual fun FaxEnableRoutingMethodA(faxporthandle: HANDLE, routingguid: PCSTR, enabled: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_FaxEnableRoutingMethodA(faxporthandle.toCPointer<ByteVar>(), routingguid.toCPointer<ByteVar>(), enabled)

public actual fun FaxEnableRoutingMethodW(faxporthandle: HANDLE, routingguid: PCWSTR, enabled: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_FaxEnableRoutingMethodW(faxporthandle.toCPointer<ByteVar>(), routingguid.toCPointer<ByteVar>(), enabled)

public actual fun FaxEnumGlobalRoutingInfoA(faxhandle: HANDLE, routinginfo: Long, methodsreturned: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_FaxEnumGlobalRoutingInfoA(faxhandle.toCPointer<ByteVar>(), routinginfo.toCPointer<ByteVar>(), methodsreturned.toCPointer<ByteVar>())

public actual fun FaxEnumGlobalRoutingInfoW(faxhandle: HANDLE, routinginfo: Long, methodsreturned: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_FaxEnumGlobalRoutingInfoW(faxhandle.toCPointer<ByteVar>(), routinginfo.toCPointer<ByteVar>(), methodsreturned.toCPointer<ByteVar>())

public actual fun FaxEnumJobsA(faxhandle: HANDLE, jobentry: Long, jobsreturned: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_FaxEnumJobsA(faxhandle.toCPointer<ByteVar>(), jobentry.toCPointer<ByteVar>(), jobsreturned.toCPointer<ByteVar>())

public actual fun FaxEnumJobsW(faxhandle: HANDLE, jobentry: Long, jobsreturned: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_FaxEnumJobsW(faxhandle.toCPointer<ByteVar>(), jobentry.toCPointer<ByteVar>(), jobsreturned.toCPointer<ByteVar>())

public actual fun FaxEnumPortsA(faxhandle: HANDLE, portinfo: Long, portsreturned: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_FaxEnumPortsA(faxhandle.toCPointer<ByteVar>(), portinfo.toCPointer<ByteVar>(), portsreturned.toCPointer<ByteVar>())

public actual fun FaxEnumPortsW(faxhandle: HANDLE, portinfo: Long, portsreturned: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_FaxEnumPortsW(faxhandle.toCPointer<ByteVar>(), portinfo.toCPointer<ByteVar>(), portsreturned.toCPointer<ByteVar>())

public actual fun FaxEnumRoutingMethodsA(faxporthandle: HANDLE, routingmethod: Long, methodsreturned: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_FaxEnumRoutingMethodsA(faxporthandle.toCPointer<ByteVar>(), routingmethod.toCPointer<ByteVar>(), methodsreturned.toCPointer<ByteVar>())

public actual fun FaxEnumRoutingMethodsW(faxporthandle: HANDLE, routingmethod: Long, methodsreturned: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_FaxEnumRoutingMethodsW(faxporthandle.toCPointer<ByteVar>(), routingmethod.toCPointer<ByteVar>(), methodsreturned.toCPointer<ByteVar>())

public actual fun FaxFreeBuffer(buffer: Long) {
    io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_FaxFreeBuffer(buffer.toCPointer<ByteVar>())
}

public actual fun FaxGetConfigurationA(faxhandle: HANDLE, faxconfig: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_FaxGetConfigurationA(faxhandle.toCPointer<ByteVar>(), faxconfig.toCPointer<ByteVar>())

public actual fun FaxGetConfigurationW(faxhandle: HANDLE, faxconfig: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_FaxGetConfigurationW(faxhandle.toCPointer<ByteVar>(), faxconfig.toCPointer<ByteVar>())

public actual fun FaxGetDeviceStatusA(faxporthandle: HANDLE, devicestatus: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_FaxGetDeviceStatusA(faxporthandle.toCPointer<ByteVar>(), devicestatus.toCPointer<ByteVar>())

public actual fun FaxGetDeviceStatusW(faxporthandle: HANDLE, devicestatus: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_FaxGetDeviceStatusW(faxporthandle.toCPointer<ByteVar>(), devicestatus.toCPointer<ByteVar>())

public actual fun FaxGetJobA(faxhandle: HANDLE, jobid: UInt, jobentry: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_FaxGetJobA(faxhandle.toCPointer<ByteVar>(), jobid, jobentry.toCPointer<ByteVar>())

public actual fun FaxGetJobW(faxhandle: HANDLE, jobid: UInt, jobentry: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_FaxGetJobW(faxhandle.toCPointer<ByteVar>(), jobid, jobentry.toCPointer<ByteVar>())

public actual fun FaxGetLoggingCategoriesA(faxhandle: HANDLE, categories: Long, numbercategories: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_FaxGetLoggingCategoriesA(faxhandle.toCPointer<ByteVar>(), categories.toCPointer<ByteVar>(), numbercategories.toCPointer<ByteVar>())

public actual fun FaxGetLoggingCategoriesW(faxhandle: HANDLE, categories: Long, numbercategories: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_FaxGetLoggingCategoriesW(faxhandle.toCPointer<ByteVar>(), categories.toCPointer<ByteVar>(), numbercategories.toCPointer<ByteVar>())

public actual fun FaxGetPageData(faxhandle: HANDLE, jobid: UInt, buffer: Long, buffersize: Long, imagewidth: Long, imageheight: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_FaxGetPageData(faxhandle.toCPointer<ByteVar>(), jobid, buffer.toCPointer<ByteVar>(), buffersize.toCPointer<ByteVar>(), imagewidth.toCPointer<ByteVar>(), imageheight.toCPointer<ByteVar>())

public actual fun FaxGetPortA(faxporthandle: HANDLE, portinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_FaxGetPortA(faxporthandle.toCPointer<ByteVar>(), portinfo.toCPointer<ByteVar>())

public actual fun FaxGetPortW(faxporthandle: HANDLE, portinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_FaxGetPortW(faxporthandle.toCPointer<ByteVar>(), portinfo.toCPointer<ByteVar>())

public actual fun FaxGetRoutingInfoA(faxporthandle: HANDLE, routingguid: PCSTR, routinginfobuffer: Long, routinginfobuffersize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_FaxGetRoutingInfoA(faxporthandle.toCPointer<ByteVar>(), routingguid.toCPointer<ByteVar>(), routinginfobuffer.toCPointer<ByteVar>(), routinginfobuffersize.toCPointer<ByteVar>())

public actual fun FaxGetRoutingInfoW(faxporthandle: HANDLE, routingguid: PCWSTR, routinginfobuffer: Long, routinginfobuffersize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_FaxGetRoutingInfoW(faxporthandle.toCPointer<ByteVar>(), routingguid.toCPointer<ByteVar>(), routinginfobuffer.toCPointer<ByteVar>(), routinginfobuffersize.toCPointer<ByteVar>())

public actual fun FaxInitializeEventQueue(faxhandle: HANDLE, completionport: HANDLE, completionkey: ULong, hwnd: HWND, messagestart: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_FaxInitializeEventQueue(faxhandle.toCPointer<ByteVar>(), completionport.toCPointer<ByteVar>(), completionkey, hwnd.toCPointer<ByteVar>(), messagestart)

public actual fun FaxOpenPort(faxhandle: HANDLE, deviceid: UInt, flags: UInt, faxporthandle: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_FaxOpenPort(faxhandle.toCPointer<ByteVar>(), deviceid, flags, faxporthandle.toCPointer<ByteVar>())

public actual fun FaxPrintCoverPageA(faxcontextinfo: Long, coverpageinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_FaxPrintCoverPageA(faxcontextinfo.toCPointer<ByteVar>(), coverpageinfo.toCPointer<ByteVar>())

public actual fun FaxPrintCoverPageW(faxcontextinfo: Long, coverpageinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_FaxPrintCoverPageW(faxcontextinfo.toCPointer<ByteVar>(), coverpageinfo.toCPointer<ByteVar>())

public actual fun FaxRegisterRoutingExtensionW(faxhandle: HANDLE, extensionname: PCWSTR, friendlyname: PCWSTR, imagename: PCWSTR, callback: PFAX_ROUTING_INSTALLATION_CALLBACKW, context: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_FaxRegisterRoutingExtensionW(faxhandle.toCPointer<ByteVar>(), extensionname.toCPointer<ByteVar>(), friendlyname.toCPointer<ByteVar>(), imagename.toCPointer<ByteVar>(), callback.toLong().toCPointer<ByteVar>(), context.toCPointer<ByteVar>())

public actual fun FaxRegisterServiceProviderW(deviceprovider: PCWSTR, friendlyname: PCWSTR, imagename: PCWSTR, tspname: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_FaxRegisterServiceProviderW(deviceprovider.toCPointer<ByteVar>(), friendlyname.toCPointer<ByteVar>(), imagename.toCPointer<ByteVar>(), tspname.toCPointer<ByteVar>())

public actual fun FaxSendDocumentA(faxhandle: HANDLE, filename: PCSTR, jobparams: Long, coverpageinfo: Long, faxjobid: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_FaxSendDocumentA(faxhandle.toCPointer<ByteVar>(), filename.toCPointer<ByteVar>(), jobparams.toCPointer<ByteVar>(), coverpageinfo.toCPointer<ByteVar>(), faxjobid.toCPointer<ByteVar>())

public actual fun FaxSendDocumentForBroadcastA(faxhandle: HANDLE, filename: PCSTR, faxjobid: Long, faxrecipientcallback: PFAX_RECIPIENT_CALLBACKA, context: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_FaxSendDocumentForBroadcastA(faxhandle.toCPointer<ByteVar>(), filename.toCPointer<ByteVar>(), faxjobid.toCPointer<ByteVar>(), faxrecipientcallback.toLong().toCPointer<ByteVar>(), context.toCPointer<ByteVar>())

public actual fun FaxSendDocumentForBroadcastW(faxhandle: HANDLE, filename: PCWSTR, faxjobid: Long, faxrecipientcallback: PFAX_RECIPIENT_CALLBACKW, context: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_FaxSendDocumentForBroadcastW(faxhandle.toCPointer<ByteVar>(), filename.toCPointer<ByteVar>(), faxjobid.toCPointer<ByteVar>(), faxrecipientcallback.toLong().toCPointer<ByteVar>(), context.toCPointer<ByteVar>())

public actual fun FaxSendDocumentW(faxhandle: HANDLE, filename: PCWSTR, jobparams: Long, coverpageinfo: Long, faxjobid: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_FaxSendDocumentW(faxhandle.toCPointer<ByteVar>(), filename.toCPointer<ByteVar>(), jobparams.toCPointer<ByteVar>(), coverpageinfo.toCPointer<ByteVar>(), faxjobid.toCPointer<ByteVar>())

public actual fun FaxSetConfigurationA(faxhandle: HANDLE, faxconfig: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_FaxSetConfigurationA(faxhandle.toCPointer<ByteVar>(), faxconfig.toCPointer<ByteVar>())

public actual fun FaxSetConfigurationW(faxhandle: HANDLE, faxconfig: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_FaxSetConfigurationW(faxhandle.toCPointer<ByteVar>(), faxconfig.toCPointer<ByteVar>())

public actual fun FaxSetGlobalRoutingInfoA(faxhandle: HANDLE, routinginfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_FaxSetGlobalRoutingInfoA(faxhandle.toCPointer<ByteVar>(), routinginfo.toCPointer<ByteVar>())

public actual fun FaxSetGlobalRoutingInfoW(faxhandle: HANDLE, routinginfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_FaxSetGlobalRoutingInfoW(faxhandle.toCPointer<ByteVar>(), routinginfo.toCPointer<ByteVar>())

public actual fun FaxSetJobA(faxhandle: HANDLE, jobid: UInt, command: UInt, jobentry: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_FaxSetJobA(faxhandle.toCPointer<ByteVar>(), jobid, command, jobentry.toCPointer<ByteVar>())

public actual fun FaxSetJobW(faxhandle: HANDLE, jobid: UInt, command: UInt, jobentry: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_FaxSetJobW(faxhandle.toCPointer<ByteVar>(), jobid, command, jobentry.toCPointer<ByteVar>())

public actual fun FaxSetLoggingCategoriesA(faxhandle: HANDLE, categories: Long, numbercategories: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_FaxSetLoggingCategoriesA(faxhandle.toCPointer<ByteVar>(), categories.toCPointer<ByteVar>(), numbercategories)

public actual fun FaxSetLoggingCategoriesW(faxhandle: HANDLE, categories: Long, numbercategories: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_FaxSetLoggingCategoriesW(faxhandle.toCPointer<ByteVar>(), categories.toCPointer<ByteVar>(), numbercategories)

public actual fun FaxSetPortA(faxporthandle: HANDLE, portinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_FaxSetPortA(faxporthandle.toCPointer<ByteVar>(), portinfo.toCPointer<ByteVar>())

public actual fun FaxSetPortW(faxporthandle: HANDLE, portinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_FaxSetPortW(faxporthandle.toCPointer<ByteVar>(), portinfo.toCPointer<ByteVar>())

public actual fun FaxSetRoutingInfoA(faxporthandle: HANDLE, routingguid: PCSTR, routinginfobuffer: Long, routinginfobuffersize: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_FaxSetRoutingInfoA(faxporthandle.toCPointer<ByteVar>(), routingguid.toCPointer<ByteVar>(), routinginfobuffer.toCPointer<ByteVar>(), routinginfobuffersize)

public actual fun FaxSetRoutingInfoW(faxporthandle: HANDLE, routingguid: PCWSTR, routinginfobuffer: Long, routinginfobuffersize: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_FaxSetRoutingInfoW(faxporthandle.toCPointer<ByteVar>(), routingguid.toCPointer<ByteVar>(), routinginfobuffer.toCPointer<ByteVar>(), routinginfobuffersize)

public actual fun FaxStartPrintJobA(printername: PCSTR, printinfo: Long, faxjobid: Long, faxcontextinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_FaxStartPrintJobA(printername.toCPointer<ByteVar>(), printinfo.toCPointer<ByteVar>(), faxjobid.toCPointer<ByteVar>(), faxcontextinfo.toCPointer<ByteVar>())

public actual fun FaxStartPrintJobW(printername: PCWSTR, printinfo: Long, faxjobid: Long, faxcontextinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_FaxStartPrintJobW(printername.toCPointer<ByteVar>(), printinfo.toCPointer<ByteVar>(), faxjobid.toCPointer<ByteVar>(), faxcontextinfo.toCPointer<ByteVar>())

public actual fun FaxUnregisterServiceProviderW(deviceprovider: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_FaxUnregisterServiceProviderW(deviceprovider.toCPointer<ByteVar>())

public actual fun SendToFaxRecipient(sndmode: SendToMode, lpfilename: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_SendToFaxRecipient(sndmode, lpfilename.toCPointer<ByteVar>())

public actual fun StiCreateInstanceW(hinst: HINSTANCE, dwver: UInt, ppsti: Long, punkouter: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssys_windows_win32_devices_fax_StiCreateInstanceW(hinst.toCPointer<ByteVar>(), dwver, ppsti.toCPointer<ByteVar>(), punkouter.toCPointer<ByteVar>())
