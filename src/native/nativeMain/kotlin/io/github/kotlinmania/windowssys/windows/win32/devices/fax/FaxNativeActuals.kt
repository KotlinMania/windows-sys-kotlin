@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.fax

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssysWindowsWin32DevicesFaxCanSendToFaxRecipient
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssysWindowsWin32DevicesFaxFaxAbort
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssysWindowsWin32DevicesFaxFaxAccessCheck
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssysWindowsWin32DevicesFaxFaxClose
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssysWindowsWin32DevicesFaxFaxCompleteJobParamsA
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssysWindowsWin32DevicesFaxFaxCompleteJobParamsW
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssysWindowsWin32DevicesFaxFaxConnectFaxServerA
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssysWindowsWin32DevicesFaxFaxConnectFaxServerW
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssysWindowsWin32DevicesFaxFaxEnableRoutingMethodA
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssysWindowsWin32DevicesFaxFaxEnableRoutingMethodW
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssysWindowsWin32DevicesFaxFaxEnumGlobalRoutingInfoA
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssysWindowsWin32DevicesFaxFaxEnumGlobalRoutingInfoW
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssysWindowsWin32DevicesFaxFaxEnumJobsA
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssysWindowsWin32DevicesFaxFaxEnumJobsW
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssysWindowsWin32DevicesFaxFaxEnumPortsA
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssysWindowsWin32DevicesFaxFaxEnumPortsW
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssysWindowsWin32DevicesFaxFaxEnumRoutingMethodsA
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssysWindowsWin32DevicesFaxFaxEnumRoutingMethodsW
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssysWindowsWin32DevicesFaxFaxFreeBuffer
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssysWindowsWin32DevicesFaxFaxGetConfigurationA
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssysWindowsWin32DevicesFaxFaxGetConfigurationW
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssysWindowsWin32DevicesFaxFaxGetDeviceStatusA
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssysWindowsWin32DevicesFaxFaxGetDeviceStatusW
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssysWindowsWin32DevicesFaxFaxGetJobA
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssysWindowsWin32DevicesFaxFaxGetJobW
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssysWindowsWin32DevicesFaxFaxGetLoggingCategoriesA
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssysWindowsWin32DevicesFaxFaxGetLoggingCategoriesW
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssysWindowsWin32DevicesFaxFaxGetPageData
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssysWindowsWin32DevicesFaxFaxGetPortA
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssysWindowsWin32DevicesFaxFaxGetPortW
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssysWindowsWin32DevicesFaxFaxGetRoutingInfoA
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssysWindowsWin32DevicesFaxFaxGetRoutingInfoW
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssysWindowsWin32DevicesFaxFaxInitializeEventQueue
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssysWindowsWin32DevicesFaxFaxOpenPort
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssysWindowsWin32DevicesFaxFaxPrintCoverPageA
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssysWindowsWin32DevicesFaxFaxPrintCoverPageW
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssysWindowsWin32DevicesFaxFaxRegisterRoutingExtensionW
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssysWindowsWin32DevicesFaxFaxRegisterServiceProviderW
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssysWindowsWin32DevicesFaxFaxSendDocumentA
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssysWindowsWin32DevicesFaxFaxSendDocumentForBroadcastA
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssysWindowsWin32DevicesFaxFaxSendDocumentForBroadcastW
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssysWindowsWin32DevicesFaxFaxSendDocumentW
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssysWindowsWin32DevicesFaxFaxSetConfigurationA
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssysWindowsWin32DevicesFaxFaxSetConfigurationW
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssysWindowsWin32DevicesFaxFaxSetGlobalRoutingInfoA
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssysWindowsWin32DevicesFaxFaxSetGlobalRoutingInfoW
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssysWindowsWin32DevicesFaxFaxSetJobA
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssysWindowsWin32DevicesFaxFaxSetJobW
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssysWindowsWin32DevicesFaxFaxSetLoggingCategoriesA
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssysWindowsWin32DevicesFaxFaxSetLoggingCategoriesW
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssysWindowsWin32DevicesFaxFaxSetPortA
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssysWindowsWin32DevicesFaxFaxSetPortW
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssysWindowsWin32DevicesFaxFaxSetRoutingInfoA
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssysWindowsWin32DevicesFaxFaxSetRoutingInfoW
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssysWindowsWin32DevicesFaxFaxStartPrintJobA
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssysWindowsWin32DevicesFaxFaxStartPrintJobW
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssysWindowsWin32DevicesFaxFaxUnregisterServiceProviderW
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssysWindowsWin32DevicesFaxSendToFaxRecipient
import io.github.kotlinmania.windowssys.windows.win32.devices.fax.cinterop.windowssysWindowsWin32DevicesFaxStiCreateInstanceW
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun canSendToFaxRecipient(): Bool =
    windowssysWindowsWin32DevicesFaxCanSendToFaxRecipient()

public actual fun faxAbort(faxhandle: Handle, jobid: UInt): Bool =
    windowssysWindowsWin32DevicesFaxFaxAbort(faxhandle.rawAddress.toCPointer<ByteVar>(), jobid)

public actual fun faxAccessCheck(faxhandle: Handle, accessmask: UInt): Bool =
    windowssysWindowsWin32DevicesFaxFaxAccessCheck(faxhandle.rawAddress.toCPointer<ByteVar>(), accessmask)

public actual fun faxClose(faxhandle: Handle): Bool =
    windowssysWindowsWin32DevicesFaxFaxClose(faxhandle.rawAddress.toCPointer<ByteVar>())

public actual fun faxCompleteJobParamsA(jobparams: MutPtr<MutPtr<FaxJobParama>>, coverpageinfo: MutPtr<MutPtr<FaxCoverpageInfoa>>): Bool =
    windowssysWindowsWin32DevicesFaxFaxCompleteJobParamsA(jobparams.rawAddress.toCPointer<ByteVar>(), coverpageinfo.rawAddress.toCPointer<ByteVar>())

public actual fun faxCompleteJobParamsW(jobparams: MutPtr<MutPtr<FaxJobParamw>>, coverpageinfo: MutPtr<MutPtr<FaxCoverpageInfow>>): Bool =
    windowssysWindowsWin32DevicesFaxFaxCompleteJobParamsW(jobparams.rawAddress.toCPointer<ByteVar>(), coverpageinfo.rawAddress.toCPointer<ByteVar>())

public actual fun faxConnectFaxServerA(machinename: Pcstr, faxhandle: MutPtr<Handle>): Bool =
    windowssysWindowsWin32DevicesFaxFaxConnectFaxServerA(machinename.rawAddress.toCPointer<ByteVar>(), faxhandle.rawAddress.toCPointer<ByteVar>())

public actual fun faxConnectFaxServerW(machinename: Pcwstr, faxhandle: MutPtr<Handle>): Bool =
    windowssysWindowsWin32DevicesFaxFaxConnectFaxServerW(machinename.rawAddress.toCPointer<ByteVar>(), faxhandle.rawAddress.toCPointer<ByteVar>())

public actual fun faxEnableRoutingMethodA(faxporthandle: Handle, routingguid: Pcstr, enabled: Bool): Bool =
    windowssysWindowsWin32DevicesFaxFaxEnableRoutingMethodA(faxporthandle.rawAddress.toCPointer<ByteVar>(), routingguid.rawAddress.toCPointer<ByteVar>(), enabled)

public actual fun faxEnableRoutingMethodW(faxporthandle: Handle, routingguid: Pcwstr, enabled: Bool): Bool =
    windowssysWindowsWin32DevicesFaxFaxEnableRoutingMethodW(faxporthandle.rawAddress.toCPointer<ByteVar>(), routingguid.rawAddress.toCPointer<ByteVar>(), enabled)

public actual fun faxEnumGlobalRoutingInfoA(faxhandle: Handle, routinginfo: MutPtr<MutPtr<FaxGlobalRoutingInfoa>>, methodsreturned: MutPtr<UInt>): Bool =
    windowssysWindowsWin32DevicesFaxFaxEnumGlobalRoutingInfoA(faxhandle.rawAddress.toCPointer<ByteVar>(), routinginfo.rawAddress.toCPointer<ByteVar>(), methodsreturned.rawAddress.toCPointer<ByteVar>())

public actual fun faxEnumGlobalRoutingInfoW(faxhandle: Handle, routinginfo: MutPtr<MutPtr<FaxGlobalRoutingInfow>>, methodsreturned: MutPtr<UInt>): Bool =
    windowssysWindowsWin32DevicesFaxFaxEnumGlobalRoutingInfoW(faxhandle.rawAddress.toCPointer<ByteVar>(), routinginfo.rawAddress.toCPointer<ByteVar>(), methodsreturned.rawAddress.toCPointer<ByteVar>())

public actual fun faxEnumJobsA(faxhandle: Handle, jobentry: MutPtr<MutPtr<FaxJobEntrya>>, jobsreturned: MutPtr<UInt>): Bool =
    windowssysWindowsWin32DevicesFaxFaxEnumJobsA(faxhandle.rawAddress.toCPointer<ByteVar>(), jobentry.rawAddress.toCPointer<ByteVar>(), jobsreturned.rawAddress.toCPointer<ByteVar>())

public actual fun faxEnumJobsW(faxhandle: Handle, jobentry: MutPtr<MutPtr<FaxJobEntryw>>, jobsreturned: MutPtr<UInt>): Bool =
    windowssysWindowsWin32DevicesFaxFaxEnumJobsW(faxhandle.rawAddress.toCPointer<ByteVar>(), jobentry.rawAddress.toCPointer<ByteVar>(), jobsreturned.rawAddress.toCPointer<ByteVar>())

public actual fun faxEnumPortsA(faxhandle: Handle, portinfo: MutPtr<MutPtr<FaxPortInfoa>>, portsreturned: MutPtr<UInt>): Bool =
    windowssysWindowsWin32DevicesFaxFaxEnumPortsA(faxhandle.rawAddress.toCPointer<ByteVar>(), portinfo.rawAddress.toCPointer<ByteVar>(), portsreturned.rawAddress.toCPointer<ByteVar>())

public actual fun faxEnumPortsW(faxhandle: Handle, portinfo: MutPtr<MutPtr<FaxPortInfow>>, portsreturned: MutPtr<UInt>): Bool =
    windowssysWindowsWin32DevicesFaxFaxEnumPortsW(faxhandle.rawAddress.toCPointer<ByteVar>(), portinfo.rawAddress.toCPointer<ByteVar>(), portsreturned.rawAddress.toCPointer<ByteVar>())

public actual fun faxEnumRoutingMethodsA(faxporthandle: Handle, routingmethod: MutPtr<MutPtr<FaxRoutingMethoda>>, methodsreturned: MutPtr<UInt>): Bool =
    windowssysWindowsWin32DevicesFaxFaxEnumRoutingMethodsA(faxporthandle.rawAddress.toCPointer<ByteVar>(), routingmethod.rawAddress.toCPointer<ByteVar>(), methodsreturned.rawAddress.toCPointer<ByteVar>())

public actual fun faxEnumRoutingMethodsW(faxporthandle: Handle, routingmethod: MutPtr<MutPtr<FaxRoutingMethodw>>, methodsreturned: MutPtr<UInt>): Bool =
    windowssysWindowsWin32DevicesFaxFaxEnumRoutingMethodsW(faxporthandle.rawAddress.toCPointer<ByteVar>(), routingmethod.rawAddress.toCPointer<ByteVar>(), methodsreturned.rawAddress.toCPointer<ByteVar>())

public actual fun faxFreeBuffer(buffer: MutPtr<CVoid>) {
    windowssysWindowsWin32DevicesFaxFaxFreeBuffer(buffer.rawAddress.toCPointer<ByteVar>())
}

public actual fun faxGetConfigurationA(faxhandle: Handle, faxconfig: MutPtr<MutPtr<FaxConfigurationa>>): Bool =
    windowssysWindowsWin32DevicesFaxFaxGetConfigurationA(faxhandle.rawAddress.toCPointer<ByteVar>(), faxconfig.rawAddress.toCPointer<ByteVar>())

public actual fun faxGetConfigurationW(faxhandle: Handle, faxconfig: MutPtr<MutPtr<FaxConfigurationw>>): Bool =
    windowssysWindowsWin32DevicesFaxFaxGetConfigurationW(faxhandle.rawAddress.toCPointer<ByteVar>(), faxconfig.rawAddress.toCPointer<ByteVar>())

public actual fun faxGetDeviceStatusA(faxporthandle: Handle, devicestatus: MutPtr<MutPtr<FaxDeviceStatusa>>): Bool =
    windowssysWindowsWin32DevicesFaxFaxGetDeviceStatusA(faxporthandle.rawAddress.toCPointer<ByteVar>(), devicestatus.rawAddress.toCPointer<ByteVar>())

public actual fun faxGetDeviceStatusW(faxporthandle: Handle, devicestatus: MutPtr<MutPtr<FaxDeviceStatusw>>): Bool =
    windowssysWindowsWin32DevicesFaxFaxGetDeviceStatusW(faxporthandle.rawAddress.toCPointer<ByteVar>(), devicestatus.rawAddress.toCPointer<ByteVar>())

public actual fun faxGetJobA(faxhandle: Handle, jobid: UInt, jobentry: MutPtr<MutPtr<FaxJobEntrya>>): Bool =
    windowssysWindowsWin32DevicesFaxFaxGetJobA(faxhandle.rawAddress.toCPointer<ByteVar>(), jobid, jobentry.rawAddress.toCPointer<ByteVar>())

public actual fun faxGetJobW(faxhandle: Handle, jobid: UInt, jobentry: MutPtr<MutPtr<FaxJobEntryw>>): Bool =
    windowssysWindowsWin32DevicesFaxFaxGetJobW(faxhandle.rawAddress.toCPointer<ByteVar>(), jobid, jobentry.rawAddress.toCPointer<ByteVar>())

public actual fun faxGetLoggingCategoriesA(faxhandle: Handle, categories: MutPtr<MutPtr<FaxLogCategorya>>, numbercategories: MutPtr<UInt>): Bool =
    windowssysWindowsWin32DevicesFaxFaxGetLoggingCategoriesA(faxhandle.rawAddress.toCPointer<ByteVar>(), categories.rawAddress.toCPointer<ByteVar>(), numbercategories.rawAddress.toCPointer<ByteVar>())

public actual fun faxGetLoggingCategoriesW(faxhandle: Handle, categories: MutPtr<MutPtr<FaxLogCategoryw>>, numbercategories: MutPtr<UInt>): Bool =
    windowssysWindowsWin32DevicesFaxFaxGetLoggingCategoriesW(faxhandle.rawAddress.toCPointer<ByteVar>(), categories.rawAddress.toCPointer<ByteVar>(), numbercategories.rawAddress.toCPointer<ByteVar>())

public actual fun faxGetPageData(faxhandle: Handle, jobid: UInt, buffer: MutPtr<MutPtr<UByte>>, buffersize: MutPtr<UInt>, imagewidth: MutPtr<UInt>, imageheight: MutPtr<UInt>): Bool =
    windowssysWindowsWin32DevicesFaxFaxGetPageData(faxhandle.rawAddress.toCPointer<ByteVar>(), jobid, buffer.rawAddress.toCPointer<ByteVar>(), buffersize.rawAddress.toCPointer<ByteVar>(), imagewidth.rawAddress.toCPointer<ByteVar>(), imageheight.rawAddress.toCPointer<ByteVar>())

public actual fun faxGetPortA(faxporthandle: Handle, portinfo: MutPtr<MutPtr<FaxPortInfoa>>): Bool =
    windowssysWindowsWin32DevicesFaxFaxGetPortA(faxporthandle.rawAddress.toCPointer<ByteVar>(), portinfo.rawAddress.toCPointer<ByteVar>())

public actual fun faxGetPortW(faxporthandle: Handle, portinfo: MutPtr<MutPtr<FaxPortInfow>>): Bool =
    windowssysWindowsWin32DevicesFaxFaxGetPortW(faxporthandle.rawAddress.toCPointer<ByteVar>(), portinfo.rawAddress.toCPointer<ByteVar>())

public actual fun faxGetRoutingInfoA(faxporthandle: Handle, routingguid: Pcstr, routinginfobuffer: MutPtr<MutPtr<UByte>>, routinginfobuffersize: MutPtr<UInt>): Bool =
    windowssysWindowsWin32DevicesFaxFaxGetRoutingInfoA(faxporthandle.rawAddress.toCPointer<ByteVar>(), routingguid.rawAddress.toCPointer<ByteVar>(), routinginfobuffer.rawAddress.toCPointer<ByteVar>(), routinginfobuffersize.rawAddress.toCPointer<ByteVar>())

public actual fun faxGetRoutingInfoW(faxporthandle: Handle, routingguid: Pcwstr, routinginfobuffer: MutPtr<MutPtr<UByte>>, routinginfobuffersize: MutPtr<UInt>): Bool =
    windowssysWindowsWin32DevicesFaxFaxGetRoutingInfoW(faxporthandle.rawAddress.toCPointer<ByteVar>(), routingguid.rawAddress.toCPointer<ByteVar>(), routinginfobuffer.rawAddress.toCPointer<ByteVar>(), routinginfobuffersize.rawAddress.toCPointer<ByteVar>())

public actual fun faxInitializeEventQueue(faxhandle: Handle, completionport: Handle, completionkey: ULong, hwnd: Hwnd, messagestart: UInt): Bool =
    windowssysWindowsWin32DevicesFaxFaxInitializeEventQueue(faxhandle.rawAddress.toCPointer<ByteVar>(), completionport.rawAddress.toCPointer<ByteVar>(), completionkey, hwnd.rawAddress.toCPointer<ByteVar>(), messagestart)

public actual fun faxOpenPort(faxhandle: Handle, deviceid: UInt, flags: UInt, faxporthandle: MutPtr<Handle>): Bool =
    windowssysWindowsWin32DevicesFaxFaxOpenPort(faxhandle.rawAddress.toCPointer<ByteVar>(), deviceid, flags, faxporthandle.rawAddress.toCPointer<ByteVar>())

public actual fun faxPrintCoverPageA(faxcontextinfo: ConstPtr<FaxContextInfoa>, coverpageinfo: ConstPtr<FaxCoverpageInfoa>): Bool =
    windowssysWindowsWin32DevicesFaxFaxPrintCoverPageA(faxcontextinfo.rawAddress.toCPointer<ByteVar>(), coverpageinfo.rawAddress.toCPointer<ByteVar>())

public actual fun faxPrintCoverPageW(faxcontextinfo: ConstPtr<FaxContextInfow>, coverpageinfo: ConstPtr<FaxCoverpageInfow>): Bool =
    windowssysWindowsWin32DevicesFaxFaxPrintCoverPageW(faxcontextinfo.rawAddress.toCPointer<ByteVar>(), coverpageinfo.rawAddress.toCPointer<ByteVar>())

public actual fun faxRegisterRoutingExtensionW(faxhandle: Handle, extensionname: Pcwstr, friendlyname: Pcwstr, imagename: Pcwstr, callback: PfaxRoutingInstallationCallbackw, context: ConstPtr<CVoid>): Bool =
    windowssysWindowsWin32DevicesFaxFaxRegisterRoutingExtensionW(faxhandle.rawAddress.toCPointer<ByteVar>(), extensionname.rawAddress.toCPointer<ByteVar>(), friendlyname.rawAddress.toCPointer<ByteVar>(), imagename.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), context.rawAddress.toCPointer<ByteVar>())

public actual fun faxRegisterServiceProviderW(deviceprovider: Pcwstr, friendlyname: Pcwstr, imagename: Pcwstr, tspname: Pcwstr): Bool =
    windowssysWindowsWin32DevicesFaxFaxRegisterServiceProviderW(deviceprovider.rawAddress.toCPointer<ByteVar>(), friendlyname.rawAddress.toCPointer<ByteVar>(), imagename.rawAddress.toCPointer<ByteVar>(), tspname.rawAddress.toCPointer<ByteVar>())

public actual fun faxSendDocumentA(faxhandle: Handle, filename: Pcstr, jobparams: ConstPtr<FaxJobParama>, coverpageinfo: ConstPtr<FaxCoverpageInfoa>, faxjobid: MutPtr<UInt>): Bool =
    windowssysWindowsWin32DevicesFaxFaxSendDocumentA(faxhandle.rawAddress.toCPointer<ByteVar>(), filename.rawAddress.toCPointer<ByteVar>(), jobparams.rawAddress.toCPointer<ByteVar>(), coverpageinfo.rawAddress.toCPointer<ByteVar>(), faxjobid.rawAddress.toCPointer<ByteVar>())

public actual fun faxSendDocumentForBroadcastA(faxhandle: Handle, filename: Pcstr, faxjobid: MutPtr<UInt>, faxrecipientcallback: PfaxRecipientCallbacka, context: ConstPtr<CVoid>): Bool =
    windowssysWindowsWin32DevicesFaxFaxSendDocumentForBroadcastA(faxhandle.rawAddress.toCPointer<ByteVar>(), filename.rawAddress.toCPointer<ByteVar>(), faxjobid.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), context.rawAddress.toCPointer<ByteVar>())

public actual fun faxSendDocumentForBroadcastW(faxhandle: Handle, filename: Pcwstr, faxjobid: MutPtr<UInt>, faxrecipientcallback: PfaxRecipientCallbackw, context: ConstPtr<CVoid>): Bool =
    windowssysWindowsWin32DevicesFaxFaxSendDocumentForBroadcastW(faxhandle.rawAddress.toCPointer<ByteVar>(), filename.rawAddress.toCPointer<ByteVar>(), faxjobid.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), context.rawAddress.toCPointer<ByteVar>())

public actual fun faxSendDocumentW(faxhandle: Handle, filename: Pcwstr, jobparams: ConstPtr<FaxJobParamw>, coverpageinfo: ConstPtr<FaxCoverpageInfow>, faxjobid: MutPtr<UInt>): Bool =
    windowssysWindowsWin32DevicesFaxFaxSendDocumentW(faxhandle.rawAddress.toCPointer<ByteVar>(), filename.rawAddress.toCPointer<ByteVar>(), jobparams.rawAddress.toCPointer<ByteVar>(), coverpageinfo.rawAddress.toCPointer<ByteVar>(), faxjobid.rawAddress.toCPointer<ByteVar>())

public actual fun faxSetConfigurationA(faxhandle: Handle, faxconfig: ConstPtr<FaxConfigurationa>): Bool =
    windowssysWindowsWin32DevicesFaxFaxSetConfigurationA(faxhandle.rawAddress.toCPointer<ByteVar>(), faxconfig.rawAddress.toCPointer<ByteVar>())

public actual fun faxSetConfigurationW(faxhandle: Handle, faxconfig: ConstPtr<FaxConfigurationw>): Bool =
    windowssysWindowsWin32DevicesFaxFaxSetConfigurationW(faxhandle.rawAddress.toCPointer<ByteVar>(), faxconfig.rawAddress.toCPointer<ByteVar>())

public actual fun faxSetGlobalRoutingInfoA(faxhandle: Handle, routinginfo: ConstPtr<FaxGlobalRoutingInfoa>): Bool =
    windowssysWindowsWin32DevicesFaxFaxSetGlobalRoutingInfoA(faxhandle.rawAddress.toCPointer<ByteVar>(), routinginfo.rawAddress.toCPointer<ByteVar>())

public actual fun faxSetGlobalRoutingInfoW(faxhandle: Handle, routinginfo: ConstPtr<FaxGlobalRoutingInfow>): Bool =
    windowssysWindowsWin32DevicesFaxFaxSetGlobalRoutingInfoW(faxhandle.rawAddress.toCPointer<ByteVar>(), routinginfo.rawAddress.toCPointer<ByteVar>())

public actual fun faxSetJobA(faxhandle: Handle, jobid: UInt, command: UInt, jobentry: ConstPtr<FaxJobEntrya>): Bool =
    windowssysWindowsWin32DevicesFaxFaxSetJobA(faxhandle.rawAddress.toCPointer<ByteVar>(), jobid, command, jobentry.rawAddress.toCPointer<ByteVar>())

public actual fun faxSetJobW(faxhandle: Handle, jobid: UInt, command: UInt, jobentry: ConstPtr<FaxJobEntryw>): Bool =
    windowssysWindowsWin32DevicesFaxFaxSetJobW(faxhandle.rawAddress.toCPointer<ByteVar>(), jobid, command, jobentry.rawAddress.toCPointer<ByteVar>())

public actual fun faxSetLoggingCategoriesA(faxhandle: Handle, categories: ConstPtr<FaxLogCategorya>, numbercategories: UInt): Bool =
    windowssysWindowsWin32DevicesFaxFaxSetLoggingCategoriesA(faxhandle.rawAddress.toCPointer<ByteVar>(), categories.rawAddress.toCPointer<ByteVar>(), numbercategories)

public actual fun faxSetLoggingCategoriesW(faxhandle: Handle, categories: ConstPtr<FaxLogCategoryw>, numbercategories: UInt): Bool =
    windowssysWindowsWin32DevicesFaxFaxSetLoggingCategoriesW(faxhandle.rawAddress.toCPointer<ByteVar>(), categories.rawAddress.toCPointer<ByteVar>(), numbercategories)

public actual fun faxSetPortA(faxporthandle: Handle, portinfo: ConstPtr<FaxPortInfoa>): Bool =
    windowssysWindowsWin32DevicesFaxFaxSetPortA(faxporthandle.rawAddress.toCPointer<ByteVar>(), portinfo.rawAddress.toCPointer<ByteVar>())

public actual fun faxSetPortW(faxporthandle: Handle, portinfo: ConstPtr<FaxPortInfow>): Bool =
    windowssysWindowsWin32DevicesFaxFaxSetPortW(faxporthandle.rawAddress.toCPointer<ByteVar>(), portinfo.rawAddress.toCPointer<ByteVar>())

public actual fun faxSetRoutingInfoA(faxporthandle: Handle, routingguid: Pcstr, routinginfobuffer: ConstPtr<UByte>, routinginfobuffersize: UInt): Bool =
    windowssysWindowsWin32DevicesFaxFaxSetRoutingInfoA(faxporthandle.rawAddress.toCPointer<ByteVar>(), routingguid.rawAddress.toCPointer<ByteVar>(), routinginfobuffer.rawAddress.toCPointer<ByteVar>(), routinginfobuffersize)

public actual fun faxSetRoutingInfoW(faxporthandle: Handle, routingguid: Pcwstr, routinginfobuffer: ConstPtr<UByte>, routinginfobuffersize: UInt): Bool =
    windowssysWindowsWin32DevicesFaxFaxSetRoutingInfoW(faxporthandle.rawAddress.toCPointer<ByteVar>(), routingguid.rawAddress.toCPointer<ByteVar>(), routinginfobuffer.rawAddress.toCPointer<ByteVar>(), routinginfobuffersize)

public actual fun faxStartPrintJobA(printername: Pcstr, printinfo: ConstPtr<FaxPrintInfoa>, faxjobid: MutPtr<UInt>, faxcontextinfo: MutPtr<FaxContextInfoa>): Bool =
    windowssysWindowsWin32DevicesFaxFaxStartPrintJobA(printername.rawAddress.toCPointer<ByteVar>(), printinfo.rawAddress.toCPointer<ByteVar>(), faxjobid.rawAddress.toCPointer<ByteVar>(), faxcontextinfo.rawAddress.toCPointer<ByteVar>())

public actual fun faxStartPrintJobW(printername: Pcwstr, printinfo: ConstPtr<FaxPrintInfow>, faxjobid: MutPtr<UInt>, faxcontextinfo: MutPtr<FaxContextInfow>): Bool =
    windowssysWindowsWin32DevicesFaxFaxStartPrintJobW(printername.rawAddress.toCPointer<ByteVar>(), printinfo.rawAddress.toCPointer<ByteVar>(), faxjobid.rawAddress.toCPointer<ByteVar>(), faxcontextinfo.rawAddress.toCPointer<ByteVar>())

public actual fun faxUnregisterServiceProviderW(deviceprovider: Pcwstr): Bool =
    windowssysWindowsWin32DevicesFaxFaxUnregisterServiceProviderW(deviceprovider.rawAddress.toCPointer<ByteVar>())

public actual fun sendToFaxRecipient(sndmode: SendToMode, lpfilename: Pcwstr): UInt =
    windowssysWindowsWin32DevicesFaxSendToFaxRecipient(sndmode, lpfilename.rawAddress.toCPointer<ByteVar>())

public actual fun stiCreateInstanceW(hinst: Hinstance, dwver: UInt, ppsti: MutPtr<MutPtr<CVoid>>, punkouter: MutPtr<CVoid>): Hresult =
    windowssysWindowsWin32DevicesFaxStiCreateInstanceW(hinst.rawAddress.toCPointer<ByteVar>(), dwver, ppsti.rawAddress.toCPointer<ByteVar>(), punkouter.rawAddress.toCPointer<ByteVar>())
